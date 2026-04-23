package ch.sbb.compose_mds.composables.listItem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.SBBSpacing

// Token data classes
@Immutable
data class SBBListItemColorTokens(
    val background: Color,
    val content: Color,
    val disabledBackground: Color,
    val disabledContent: Color,
    val pressedBackground: Color,
    val loadingBackground: Color,
    val swipeLeftBackground: Color,
    val swipeRightBackground: Color,
)

@Immutable
data class SBBListItemLayoutTokens(
    val shape: Shape,
    val paddingHorizontal: Dp,
    val paddingVertical: Dp,
    val minHeight: Dp,
    val gapBetweenIconAndText: Dp,
    val gapBetweenTitleAndSubtext: Dp,
    val iconSize: Dp,
)

@Immutable
data class SBBListItemTypographyTokens(
    val title: TextStyle,
    val subtext: TextStyle,
)

@Immutable
data class SBBListItemTokens(
    val colors: SBBListItemColorTokens,
    val layout: SBBListItemLayoutTokens,
    val typography: SBBListItemTypographyTokens,
)

@Composable
fun defaultSBBListItemTokens(): SBBListItemTokens {
    // Prefer PrimitiveColors so tokens are consistent with the design system
    // primitive palette. We still respect dark vs light mode using
    // isSystemInDarkTheme(). Consumers can override tokens via
    // ProvideSBBListItemTokens if needed.
    val dark = isSystemInDarkTheme()
    val typography = MaterialTheme.typography

    val background = if (dark) PrimitiveColors.midnight else PrimitiveColors.white
    val content = if (dark) PrimitiveColors.white else PrimitiveColors.black
    val disabledBackground = if (dark) PrimitiveColors.anthracite else PrimitiveColors.milk
    val disabledContent = if (dark) PrimitiveColors.graphite else PrimitiveColors.granite
    val pressedBackground = if (dark) PrimitiveColors.iron else PrimitiveColors.platinum
    val loadingBackground = background
    val swipeLeft = if (dark) PrimitiveColors.red150 else PrimitiveColors.red
    val swipeRight = if (dark) PrimitiveColors.turquoiseDark else PrimitiveColors.turquoise

    return SBBListItemTokens(
        colors =
            SBBListItemColorTokens(
                background = background,
                content = content,
                disabledBackground = disabledBackground,
                disabledContent = disabledContent,
                pressedBackground = pressedBackground,
                loadingBackground = loadingBackground,
                swipeLeftBackground = swipeLeft,
                swipeRightBackground = swipeRight,
            ),
        layout =
            SBBListItemLayoutTokens(
                shape = RoundedCornerShape(8.dp),
                paddingHorizontal = SBBSpacing.Medium,
                paddingVertical = SBBSpacing.Small,
                minHeight = 48.dp,
                gapBetweenIconAndText = SBBSpacing.Medium,
                gapBetweenTitleAndSubtext = SBBSpacing.XXSmall,
                iconSize = 24.dp,
            ),
        typography =
            SBBListItemTypographyTokens(
                title = typography.bodyMedium,
                subtext = typography.bodySmall,
            ),
    )
}

// CompositionLocal
// The static composition local must not call @Composable functions during its
// initialization. `defaultSBBListItemTokens()` is a @Composable that reads
// `MaterialTheme`, so calling it here would cause a compiler/runtime error
// "Composable invocations can only happen from the context of a @Composable
// function". To avoid that we provide a simple non-composable fallback tokens
// instance that can be safely used as the static default. When `ProvideSBBListItemTokens`
// is used the composable default (which reads MaterialTheme) will be used as the
// base instead of this static fallback.
private val StaticDefaultSBBListItemTokens =
    SBBListItemTokens(
        colors =
            SBBListItemColorTokens(
                background = PrimitiveColors.white,
                content = PrimitiveColors.black,
                disabledBackground = PrimitiveColors.milk,
                disabledContent = PrimitiveColors.black.copy(alpha = 0.6f),
                pressedBackground = PrimitiveColors.platinum,
                loadingBackground = PrimitiveColors.white,
                swipeLeftBackground = PrimitiveColors.red,
                swipeRightBackground = PrimitiveColors.turquoise,
            ),
        layout =
            SBBListItemLayoutTokens(
                shape = RoundedCornerShape(8.dp),
                paddingHorizontal = SBBSpacing.Medium,
                paddingVertical = SBBSpacing.Small,
                minHeight = 48.dp,
                gapBetweenIconAndText = SBBSpacing.Medium,
                gapBetweenTitleAndSubtext = SBBSpacing.XXSmall,
                iconSize = 24.dp,
            ),
        typography =
            SBBListItemTypographyTokens(
                title = TextStyle.Default,
                subtext = TextStyle.Default,
            ),
    )

val LocalSBBListItemTokens = staticCompositionLocalOf { StaticDefaultSBBListItemTokens }

// Merge helpers
fun SBBListItemColorTokens.merge(other: SBBListItemColorTokens?): SBBListItemColorTokens = other ?: this

fun SBBListItemLayoutTokens.merge(other: SBBListItemLayoutTokens?): SBBListItemLayoutTokens = other ?: this

fun SBBListItemTypographyTokens.merge(other: SBBListItemTypographyTokens?): SBBListItemTypographyTokens = other ?: this

fun SBBListItemTokens.merge(other: SBBListItemTokens?): SBBListItemTokens =
    other?.let {
        SBBListItemTokens(
            colors = this.colors.merge(it.colors),
            layout = this.layout.merge(it.layout),
            typography = this.typography.merge(it.typography),
        )
    } ?: this
