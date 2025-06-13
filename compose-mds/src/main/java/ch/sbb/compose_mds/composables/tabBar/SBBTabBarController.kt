package ch.sbb.compose_mds.composables.tabBar

import android.content.res.Configuration
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationConstants
import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.center
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.round
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt

/**
 * Manipulate the [SBBTabBar] from other [Composable].
 */
class SBBTabBarController internal constructor(
    val items: List<SBBTabBarItemData>,
    internal val waveRadius: Float,
) {
    /** Use [selectedItem] to get the currently selected item as a [State] **/
    val selectedItem = derivedStateOf {
        val selected by selected
        items[selected]
    }

    /** selecting an element from other [Composable]. **/
    fun onSelect(value: Int) {
        hover.value = false
        to.intValue = value
        selected.intValue = value
        from.intValue = value

        onSelected(value)
    }

    internal fun onSelected(value: Int) {
        warnings.removeIf { it.index == value }
    }

    /** set tabs with [SBBTabBarWarningData]. **/
    fun setWarnings(values: List<SBBTabBarWarningData>) {
        warnings.clear()
        warnings.addAll(values)
    }

    internal var selected = mutableIntStateOf(0)

    internal var warnings = mutableStateListOf<SBBTabBarWarningData>()

    internal var textSize = mutableStateOf(IntSize.Zero)

    internal var positions = mutableStateListOf<Rect>().apply {
        addAll(items.map { Rect.Zero })
    }

    internal val curves = derivedStateOf {
        positions.map {
            TabCurves(
                it.center.x,
                waveRadius,
            )
        }
    }

    internal var from = mutableIntStateOf(0)
    internal var to = mutableIntStateOf(0)
    internal var hover = mutableStateOf(false)

    @Composable
    internal fun animationSpec() =
        tween<Float>(AnimationConstants.DefaultDurationMillis, easing = EaseInOut)

    internal val animation = Animatable(0f)
    internal val tabStates = derivedStateOf {
        val from by from
        val to by to
        val hover by hover
        positions.mapIndexed { i, p ->
            when (i) {
                from -> 1 - if (hover) 0f else animation.value
                to -> animation.value
                else -> 0f
            }
        }
    }

    internal fun path(size: Size): State<Path> {
        val curves by curves
        val tabStates by tabStates

        curves.forEachIndexed { i, p ->
            val leftProgress = if (i == 0) 0.0f else tabStates[i - 1]
            val rightProgress = if (i == positions.size - 1) 0.0f else tabStates[i + 1]
            val leftMidX = if (curves.size < 2) {
                0.0f
            } else {
                if (i == 0) {
                    curves[0].midX - (curves[1].midX - curves[0].midX)
                } else {
                    curves[i - 1].midX
                }
            }
            val rightMidX: Float = if (i == curves.size - 1) 0.0f else curves[i + 1].midX
            p.setProgress(tabStates[i], leftProgress, leftMidX, rightProgress, rightMidX)
        }

        return derivedStateOf {
            Path().apply {
                moveTo(0f, 0f)
                lineTo(curves.first().p0.x, 0f)
                curves.forEach { it.draw(this) }
                lineTo(size.width, 0f)
                lineTo(size.width, size.height)
                lineTo(0f, size.height)
            }
        }
    }

    @Composable
    internal fun animatedTextPosition(): State<IntOffset> {
        val selected by selected
        val position = positions[selected].topCenter.round()
        val pos = min(
            max(
                position.x - textSize.value.center.x,
                positions.first().left.roundToInt(),
            ),
            positions.last().right.roundToInt() - textSize.value.width,
        )
        val offset = IntOffset(pos, 0)
        return animateIntOffsetAsState(
            targetValue = offset,
        )
    }

    internal suspend fun onSelecting(value: Int, spec: TweenSpec<Float>) {
        hover.value = false
        from.intValue = selected.intValue
        to.intValue = value
        selected.intValue = value
        animation.animateTo(targetValue = 1f, animationSpec = spec)
        from.intValue = value
        animation.snapTo(targetValue = 0f)
        onSelected(value)
    }

    internal suspend fun onPeek(value: Int, spec: TweenSpec<Float>) {
        hover.value = true
        to.intValue = value
        animation.animateTo(targetValue = .25f, animationSpec = spec)
    }

    internal suspend fun onCancelPeek(spec: TweenSpec<Float>) {
        animation.animateTo(targetValue = 0f, animationSpec = spec)
        hover.value = false
        to.intValue = selected.intValue
    }

    internal fun getStateAt(index: Int): SBBTabBarItemState {
        if (warnings.any { it.index == index }) return SBBTabBarItemState.Warning
        return when (index) {
            selected.intValue -> SBBTabBarItemState.Selected
            else -> SBBTabBarItemState.None
        }
    }

    internal fun warningSemanticsAt(index: Int): String? {
        return warnings.firstOrNull { it.index == index }?.semantics
    }
}

/** Use this method to create a [SBBTabBarController].
 *
 * @param items The items to be shown in the [SBBTabBar] with a [List<SBBTabBarItemData>].
 * **/
@Composable
fun rememberSBBTabBarController(items: List<SBBTabBarItemData>): State<SBBTabBarController> {
    val configuration = LocalConfiguration.current
    val portrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT
    val waveRadius =
        with(LocalDensity.current) { if (portrait) (22.dp + 8.dp).toPx() else (18.dp + 3.dp).toPx() }
    return remember { mutableStateOf(SBBTabBarController(items, waveRadius)) }
}
