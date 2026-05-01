package ch.sbb.compose_mds.composables.listItem

import SBBTheme
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
    val dark = SBBTheme.isDarkMode
    val typography = MaterialTheme.typography

    val background = MaterialTheme.colorScheme.surfaceVariant
    val content = MaterialTheme.colorScheme.onSurfaceVariant
    val disabledContent = if (dark) PrimitiveColors.graphite else PrimitiveColors.granite
    val pressedBackground = if (dark) PrimitiveColors.iron else PrimitiveColors.platinum
    val subtextColor = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f)

    return SBBListItemTokens(
        colors =
            SBBListItemColorTokens(
                background = background,
                content = content,
                disabledBackground = background,
                disabledContent = disabledContent,
                pressedBackground = pressedBackground,
            ),
        layout =
            SBBListItemLayoutTokens(
                shape = RoundedCornerShape(16.dp),
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
                subtext = typography.bodySmall.copy(color = subtextColor),
            ),
    )
}

private val StaticDefaultSBBListItemTokens =
    SBBListItemTokens(
        colors =
            SBBListItemColorTokens(
                background = PrimitiveColors.white,
                content = PrimitiveColors.black,
                disabledBackground = PrimitiveColors.milk,
                disabledContent = PrimitiveColors.black.copy(alpha = 0.6f),
                pressedBackground = PrimitiveColors.platinum,
            ),
        layout =
            SBBListItemLayoutTokens(
                shape = RoundedCornerShape(16.dp),
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
