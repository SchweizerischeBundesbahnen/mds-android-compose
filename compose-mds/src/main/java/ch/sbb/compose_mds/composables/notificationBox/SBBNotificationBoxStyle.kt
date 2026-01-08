package ch.sbb.compose_mds.composables.notificationBox

import SBBTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleCrossSmall
import ch.sbb.compose_mds.sbbicons.small.CircleExclamationPointSmall
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.CircleTickSmall

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

internal val LocalSBBNotificationBoxTheme =
    staticCompositionLocalOf<SBBNotificationBoxTokens> { SBBNotificationBoxTheme() }

class SBBNotificationBoxTheme() : SBBNotificationBoxTokens by configSBBNotificationBoxTokens()

@Stable
internal fun configSBBNotificationBoxTokens(): SBBNotificationBoxTokens =
    object : SBBNotificationBoxTokens {
        override val alert: SBBNotificationBoxStyle
            @Composable get() {
                val alertColor =
                    if (SBBTheme.isDarkMode) SBBTheme.functionalColors.errorDark else SBBTheme.functionalColors.error
                val backgroundColor =
                    if (SBBTheme.isDarkMode) SBBTheme.colors.black else SBBTheme.colors.white
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.Small.CircleCrossSmall,
                    iconColor = alertColor,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = alertColor,
                )
            }
        override val warning: SBBNotificationBoxStyle
            @Composable get() {
                val warningColor =
                    if (SBBTheme.isDarkMode) SBBTheme.functionalColors.warning else SBBTheme.functionalColors.warningDark
                val backgroundColor =
                    if (SBBTheme.isDarkMode) SBBTheme.colors.black else SBBTheme.colors.white
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.Small.CircleExclamationPointSmall,
                    iconColor = if (SBBTheme.isDarkMode) warningColor else SBBTheme.colors.black,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = warningColor,
                )
            }
        override val success: SBBNotificationBoxStyle
            @Composable get() {
                val successColor =
                    if (SBBTheme.isDarkMode) SBBTheme.functionalColors.success else SBBTheme.functionalColors.successDark
                val backgroundColor =
                    if (SBBTheme.isDarkMode) SBBTheme.colors.black else SBBTheme.colors.white
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.Small.CircleTickSmall,
                    iconColor = successColor,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = successColor,
                )
            }
        override val information: SBBNotificationBoxStyle
            @Composable get() {
                val informationColor = SBBTheme.colors.smoke
                val backgroundColor =
                    if (SBBTheme.isDarkMode) SBBTheme.colors.black else SBBTheme.colors.white
                return SBBNotificationBoxStyle(
                    icon = SBBIcons.Small.CircleInformationSmall,
                    iconColor = if (SBBTheme.isDarkMode) SBBTheme.colors.white else SBBTheme.colors.black,
                    backgroundColor = backgroundColor.copy(alpha = 0.95f),
                    borderColor = informationColor,
                )
            }
    }
