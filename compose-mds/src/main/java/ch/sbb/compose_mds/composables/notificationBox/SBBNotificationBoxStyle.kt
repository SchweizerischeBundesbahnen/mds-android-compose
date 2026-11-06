package ch.sbb.compose_mds.composables.notificationBox

import androidx.compose.animation.animateColorAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import ch.sbb.compose_mds.icons.CircleCrossSmall
import ch.sbb.compose_mds.icons.CircleExclamationPointSmall
import ch.sbb.compose_mds.icons.CircleInformationSmall
import ch.sbb.compose_mds.icons.CircleTickSmall
import ch.sbb.compose_mds.icons.SBBIcons
import ch.sbb.compose_mds.theme.SBBColors
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
                val alertColor by animateColorAsState(SBBTheme.colorScheme.error)
                val backgroundColor by animateColorAsState(SBBTheme.colorScheme.backgroundContent)
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.CircleCrossSmall,
                    iconColor = SBBTheme.colorScheme.error,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = alertColor,
                )
            }
        override val warning: SBBNotificationBoxStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val warningColor by animateColorAsState(
                    if (dark) SBBColors.warningDark else SBBColors.warning,
                )
                val backgroundColor by animateColorAsState(SBBTheme.colorScheme.backgroundContent)
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.CircleExclamationPointSmall,
                    iconColor = if (SBBTheme.isDarkMode) warningColor else SBBColors.black,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = warningColor,
                )
            }
        override val success: SBBNotificationBoxStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val successColor by animateColorAsState(
                    if (dark) SBBColors.successDark else SBBColors.success,
                )
                val backgroundColor by animateColorAsState(SBBTheme.colorScheme.backgroundContent)
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.CircleTickSmall,
                    iconColor = successColor,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = successColor,
                )
            }
        override val information: SBBNotificationBoxStyle
            @Composable get() {
                val informationColor = SBBColors.smoke
                val backgroundColor by animateColorAsState(SBBTheme.colorScheme.backgroundContent)
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.CircleInformationSmall,
                    iconColor = if (SBBTheme.isDarkMode) SBBColors.white else SBBColors.black,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = informationColor,
                )
            }
    }
