package ch.sbb.compose_mds.composables.notificationBox

import androidx.compose.animation.animateColorAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleCrossSmall
import ch.sbb.compose_mds.sbbicons.small.CircleExclamationPointSmall
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.CircleTickSmall
import ch.sbb.compose_mds.theme.SBBTheme

class SBBNotificationBoxStyle(
    val icon: ImageVector,
    val iconColor: Color,
    val backgroundColor: Color,
    val borderColor: Color,
)

interface SBBNotificationBoxTokens {
    val alert: SBBNotificationBoxStyle @Composable get
    val warning: SBBNotificationBoxStyle @Composable get
    val success: SBBNotificationBoxStyle @Composable get
    val information: SBBNotificationBoxStyle @Composable get
}

internal val LocalSBBNotificationBoxStyle =
    staticCompositionLocalOf<SBBNotificationBoxTokens> { SBBNotificationBoxTheme() }

class SBBNotificationBoxTheme : SBBNotificationBoxTokens by defaultSBBNotificationBoxStyle()

@Stable
internal fun defaultSBBNotificationBoxStyle(): SBBNotificationBoxTokens =
    object : SBBNotificationBoxTokens {
        override val alert: SBBNotificationBoxStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val alertColor by animateColorAsState(if (dark) SBBTheme.functionalColors.errorDark else SBBTheme.functionalColors.error)
                val backgroundColor by animateColorAsState(if (dark) SBBTheme.colors.black else SBBTheme.colors.white)
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.Small.CircleCrossSmall,
                    iconColor = alertColor,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = alertColor,
                )
            }
        override val warning: SBBNotificationBoxStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val warningColor by animateColorAsState(
                    if (dark) SBBTheme.functionalColors.warningDark else SBBTheme.functionalColors.warning,
                )
                val backgroundColor by animateColorAsState(if (dark) SBBTheme.colors.black else SBBTheme.colors.white)
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.Small.CircleExclamationPointSmall,
                    iconColor = if (SBBTheme.isDarkMode) warningColor else SBBTheme.colors.black,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = warningColor,
                )
            }
        override val success: SBBNotificationBoxStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val successColor by animateColorAsState(
                    if (dark) SBBTheme.functionalColors.successDark else SBBTheme.functionalColors.success,
                )
                val backgroundColor by animateColorAsState(if (dark) SBBTheme.colors.black else SBBTheme.colors.white)
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.Small.CircleTickSmall,
                    iconColor = successColor,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = successColor,
                )
            }
        override val information: SBBNotificationBoxStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val informationColor = SBBTheme.colors.smoke
                val backgroundColor by animateColorAsState(if (dark) SBBTheme.colors.black else SBBTheme.colors.white)
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.Small.CircleInformationSmall,
                    iconColor = if (SBBTheme.isDarkMode) SBBTheme.colors.white else SBBTheme.colors.black,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = informationColor,
                )
            }
    }
