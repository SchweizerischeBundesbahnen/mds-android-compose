package ch.sbb.compose_mds.composables.listItem

import SBBTheme
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

// Token data classes
@Immutable
data class SBBListItemColorTokens(
    val content: Color,
    val disabledContent: Color,
)

@Immutable
data class SBBListItemLayoutTokens(
    val padding: PaddingValues,
    val minHeight: Dp,
    val gapBetweenIconAndText: Dp,
    val gapBetweenTitleAndSubtitle: Dp,
)

@Immutable
data class SBBListItemTypographyTokens(
    val title: TextStyle,
    val subtitle: TextStyle,
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

    val content = MaterialTheme.colorScheme.onSurfaceVariant
    val disabledContent by animateColorAsState(if (dark) PrimitiveColors.graphite else PrimitiveColors.granite)
    val subtitleColor = disabledContent

    return SBBListItemTokens(
        colors =
            SBBListItemColorTokens(
                content = content,
                disabledContent = disabledContent,
            ),
        layout =
            SBBListItemLayoutTokens(
                padding = PaddingValues(horizontal = SBBSpacing.Medium, vertical = 10.dp),
                minHeight = 44.dp,
                gapBetweenIconAndText = SBBSpacing.Medium,
                gapBetweenTitleAndSubtitle = SBBSpacing.XXSmall,
            ),
        typography =
            SBBListItemTypographyTokens(
                title = typography.bodyMedium,
                subtitle = typography.bodySmall.copy(color = subtitleColor),
            ),
    )
}

private val StaticDefaultSBBListItemTokens =
    SBBListItemTokens(
        colors =
            SBBListItemColorTokens(
                content = PrimitiveColors.black,
                disabledContent = PrimitiveColors.black.copy(alpha = 0.6f),
            ),
        layout =
            SBBListItemLayoutTokens(
                padding = PaddingValues(horizontal = SBBSpacing.Medium, vertical = 10.dp),
                minHeight = 44.dp,
                gapBetweenIconAndText = SBBSpacing.Medium,
                gapBetweenTitleAndSubtitle = SBBSpacing.XXSmall,
            ),
        typography =
            SBBListItemTypographyTokens(
                title = TextStyle.Default,
                subtitle = TextStyle.Default,
            ),
    )

val LocalSBBListItemStyle = staticCompositionLocalOf { StaticDefaultSBBListItemTokens }

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
