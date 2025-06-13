package ch.sbb.compose_mds.composables.tabBar

import android.content.res.Configuration
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.PressGestureScope
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.SignExclamationPointSmall
import ch.sbb.compose_mds.theme.SBBColors

@Composable
internal fun RowScope.SBBTabBarItem(
    data: SBBTabBarItemData,
    state: SBBTabBarItemState,
    warningSemantics: String?,
    onPositioned: (Rect) -> Unit,
    onPress: suspend PressGestureScope.(Offset) -> Unit,
) {
    val configuration = LocalConfiguration.current
    val portrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    val icon = when (state) {
        SBBTabBarItemState.Warning -> SBBIcons.Small.SignExclamationPointSmall
        else -> data.icon
    }

    val backgroundColor by animateColorAsState(
        targetValue = when (state) {
            SBBTabBarItemState.None -> SBBColors.transparent
            SBBTabBarItemState.Selected -> MaterialTheme.colorScheme.onSurfaceVariant
            SBBTabBarItemState.Warning -> MaterialTheme.colorScheme.primary
        },
    )
    val iconTint by animateColorAsState(
        targetValue = when (state) {
            SBBTabBarItemState.None -> MaterialTheme.colorScheme.onSurface
            SBBTabBarItemState.Selected -> MaterialTheme.colorScheme.surfaceVariant
            SBBTabBarItemState.Warning -> MaterialTheme.colorScheme.onPrimary
        },
    )
    Column(
        modifier = Modifier
            .weight(1f)
            .semantics(mergeDescendants = true) {
                contentDescription = data.label
                role = Role.Tab
                selected = state == SBBTabBarItemState.Selected
                onClick { false }
            }
            .pointerInput(Unit) {
                detectTapGestures(
                    onPress = onPress,
                )
            },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        var warningSemanticsModifier: Modifier = Modifier
        if (state == SBBTabBarItemState.Warning && warningSemantics != null) {
            warningSemanticsModifier =
                warningSemanticsModifier.semantics { contentDescription = warningSemantics }
        }
        Row(
            modifier = warningSemanticsModifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Icon(
                modifier = Modifier
                    .onGloballyPositioned {
                        onPositioned(
                            Rect(
                                it.positionInRoot(),
                                it.size.toSize(),
                            ),
                        )
                    }
                    .size(if (portrait) 44.dp else 36.dp)
                    .clip(CircleShape)
                    .background(color = backgroundColor)
                    .padding(10.dp),
                tint = iconTint,
                imageVector = icon,
                contentDescription = null,
            )
            if (!portrait) {
                Text(
                    text = data.label,
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
        }
    }
}
