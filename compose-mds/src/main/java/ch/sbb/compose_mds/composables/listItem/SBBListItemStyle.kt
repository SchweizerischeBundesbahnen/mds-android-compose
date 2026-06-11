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
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

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
interface SBBListItemStyle {
    val colors: SBBListItemColors @Composable get
    val layout: SBBListItemLayout @Composable get
    val typography: SBBListItemTypography @Composable get
}

class DefaultListItemStyle : SBBListItemStyle by defaultSBBListItemStyle()

fun defaultSBBListItemStyle(): SBBListItemStyle {
    return object : SBBListItemStyle {
        private val disabledContentColor: Color @Composable get() {
            val dark = SBBTheme.isDarkMode
            val colors = SBBTheme.colors

            val disabledContent by animateColorAsState(if (dark) colors.graphite else colors.granite)
            return disabledContent
        }

        override val colors: SBBListItemColors @Composable get() =
            SBBListItemColors(
                content = MaterialTheme.colorScheme.onSurfaceVariant,
                disabledContent = disabledContentColor,
            )

        override val layout @Composable get() =
            SBBListItemLayout(
                padding = PaddingValues(horizontal = SBBSpacing.Medium, vertical = 10.dp),
                minHeight = 44.dp,
                gapBetweenIconAndText = SBBSpacing.Medium,
                gapBetweenTitleAndSubtitle = SBBSpacing.XXSmall,
            )
        override val typography @Composable get() =
            SBBListItemTypography(
                title = MaterialTheme.typography.bodyMedium,
                subtitle = MaterialTheme.typography.bodySmall.copy(color = disabledContentColor),
            )
    }
}

val LocalSBBListItemStyle = staticCompositionLocalOf<SBBListItemStyle> { DefaultListItemStyle() }

val SBBListItemStyle.withXSmallHorizontalGap: SBBListItemStyle
    @Composable get() {
        val parent = this
        return object : SBBListItemStyle {
            override val colors @Composable get() = parent.colors
            override val layout @Composable get() =
                parent.layout.copy(
                    gapBetweenIconAndText = SBBSpacing.XSmall,
                )
            override val typography @Composable get() = parent.typography
        }
    }
