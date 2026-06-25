package ch.sbb.compose_mds.composables.listItem

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Immutable
data class SBBListItemColorVariants(
    val enabledLight: SBBListItemColors,
    val enabledDark: SBBListItemColors,
    val disabledLight: SBBListItemColors,
    val disabledDark: SBBListItemColors,
)

@Immutable
data class SBBListItemColors(
    val background: Color,
    val backgroundPressed: Color,
    val text: Color,
    val subtext: Color,
    val icon: Color,
    val line: Color,
)

@Immutable
data class SBBListItemLayout(
    val padding: PaddingValues,
    val minHeight: Dp,
    val horizontalPadding: Dp,
    val verticalPadding: Dp,
)

@Immutable
data class SBBListItemTypography(
    val text: TextStyle,
    val subtext: TextStyle,
)

@Immutable
interface SBBListItemStyle {
    val colors: SBBListItemColorVariants @Composable get
    val layout: SBBListItemLayout @Composable get
    val typography: SBBListItemTypography @Composable get

    @Composable
    fun resolvedColors(enabled: Boolean = true): State<SBBListItemColors> {
        val enabledState by remember { mutableStateOf(enabled) }
        val isDark = SBBTheme.isDarkMode
        val colors =
            if (isDark) {
                if (enabledState) {
                    colors.enabledDark
                } else {
                    colors.disabledDark
                }
            } else if (enabledState) {
                colors.enabledLight
            } else {
                colors.disabledLight
            }

        val background by animateColorAsState(colors.background)
        val backgroundPressed by animateColorAsState(colors.backgroundPressed)
        val text by animateColorAsState(colors.text)
        val subtext by animateColorAsState(colors.subtext)
        val icon by animateColorAsState(colors.icon)
        val line by animateColorAsState(colors.line)

        return remember {
            derivedStateOf {
                SBBListItemColors(
                    background = background,
                    backgroundPressed = backgroundPressed,
                    text = text,
                    subtext = subtext,
                    icon = icon,
                    line = line,
                )
            }
        }
    }
}

class DefaultListItemStyle : SBBListItemStyle by defaultSBBListItemStyle()

fun defaultSBBListItemStyle(): SBBListItemStyle =
    object : SBBListItemStyle {
        override val colors: SBBListItemColorVariants
            @Composable get() =
                SBBListItemColorVariants(
                    enabledLight =
                        SBBListItemColors(
                            background = SBBTheme.colors.white,
                            backgroundPressed = SBBTheme.colors.platinum,
                            text = SBBTheme.colors.black,
                            subtext = SBBTheme.colors.granite,
                            icon = SBBTheme.colors.black,
                            line = SBBTheme.colors.cloud,
                        ),
                    enabledDark =
                        SBBListItemColors(
                            background = SBBTheme.colors.charcoal,
                            backgroundPressed = SBBTheme.colors.midnight,
                            text = SBBTheme.colors.white,
                            subtext = SBBTheme.colors.graphite,
                            icon = SBBTheme.colors.white,
                            line = SBBTheme.colors.iron,
                        ),
                    disabledLight =
                        SBBListItemColors(
                            background = SBBTheme.colors.white,
                            backgroundPressed = SBBTheme.colors.platinum,
                            text = SBBTheme.colors.granite,
                            subtext = SBBTheme.colors.granite,
                            icon = SBBTheme.colors.granite,
                            line = SBBTheme.colors.cloud,
                        ),
                    disabledDark =
                        SBBListItemColors(
                            background = SBBTheme.colors.charcoal,
                            backgroundPressed = SBBTheme.colors.platinum,
                            text = SBBTheme.colors.graphite,
                            subtext = SBBTheme.colors.graphite,
                            icon = SBBTheme.colors.graphite,
                            line = SBBTheme.colors.iron,
                        ),
                )

        override val layout @Composable get() =
            SBBListItemLayout(
                padding = PaddingValues(horizontal = SBBSpacing.Medium, vertical = 10.dp),
                minHeight = 44.dp,
                horizontalPadding = SBBSpacing.Medium,
                verticalPadding = SBBSpacing.XXSmall,
            )
        override val typography @Composable get() =
            SBBListItemTypography(
                text = MaterialTheme.typography.bodyMedium,
                subtext = MaterialTheme.typography.bodySmall,
            )
    }

val LocalSBBListItemStyle = staticCompositionLocalOf<SBBListItemStyle> { DefaultListItemStyle() }

val SBBListItemStyle.withXSmallHorizontalGap: SBBListItemStyle
    @Composable get() {
        val parent = this
        return object : SBBListItemStyle {
            override val colors @Composable get() = parent.colors
            override val layout @Composable get() =
                parent.layout.copy(
                    horizontalPadding = SBBSpacing.XSmall,
                )
            override val typography @Composable get() = parent.typography
        }
    }
