package ch.sbb.compose_mds.composables.listItem

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

// Token data classes
@Immutable
data class SBBListItemColors(
    val content: Color,
    val disabledContent: Color,
)

@Immutable
data class SBBListItemLayout(
    val padding: PaddingValues,
    val minHeight: Dp,
    val gapBetweenIconAndText: Dp,
    val gapBetweenTitleAndSubtitle: Dp,
)

@Immutable
data class SBBListItemTypography(
    val title: TextStyle,
    val subtitle: TextStyle,
)

@Immutable
data class SBBListItemStyle(
    val colors: SBBListItemColors,
    val layout: SBBListItemLayout,
    val typography: SBBListItemTypography,
)

@Composable
fun defaultSBBListItemStyle(): SBBListItemStyle {
    val dark = SBBTheme.isDarkMode
    val typography = MaterialTheme.typography
    val colors = SBBTheme.colors

    val content = MaterialTheme.colorScheme.onSurfaceVariant
    val disabledContent by animateColorAsState(if (dark) colors.graphite else colors.granite)
    val subtitleColor = disabledContent

    return SBBListItemStyle(
        colors =
            SBBListItemColors(
                content = content,
                disabledContent = disabledContent,
            ),
        layout =
            SBBListItemLayout(
                padding = PaddingValues(horizontal = SBBSpacing.Medium, vertical = 10.dp),
                minHeight = 44.dp,
                gapBetweenIconAndText = SBBSpacing.Medium,
                gapBetweenTitleAndSubtitle = SBBSpacing.XXSmall,
            ),
        typography =
            SBBListItemTypography(
                title = typography.bodyMedium,
                subtitle = typography.bodySmall.copy(color = subtitleColor),
            ),
    )
}

private val StaticDefaultSBBListItemStyle =
    SBBListItemStyle(
        colors =
            SBBListItemColors(
                content = PrimitiveColors.black,
                disabledContent = PrimitiveColors.black.copy(alpha = 0.6f),
            ),
        layout =
            SBBListItemLayout(
                padding = PaddingValues(horizontal = SBBSpacing.Medium, vertical = 10.dp),
                minHeight = 44.dp,
                gapBetweenIconAndText = SBBSpacing.Medium,
                gapBetweenTitleAndSubtitle = SBBSpacing.XXSmall,
            ),
        typography =
            SBBListItemTypography(
                title = TextStyle.Default,
                subtitle = TextStyle.Default,
            ),
    )

val LocalSBBListItemStyle = staticCompositionLocalOf { StaticDefaultSBBListItemStyle }
