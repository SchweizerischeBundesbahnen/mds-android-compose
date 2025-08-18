package ch.sbb.compose_mds.beta.notificationBox

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
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
import ch.sbb.compose_mds.theme.PrimitiveColors

class SBBNotificationBoxStyle(
    val icon: ImageVector,
    val iconColor: Color,
    val backgroundColor: Color,
)

interface SBBNotificationBoxTokens {
    val alert: SBBNotificationBoxStyle @Composable get() = TODO()
    val warning: SBBNotificationBoxStyle @Composable get() = TODO()
    val success: SBBNotificationBoxStyle @Composable get() = TODO()
    val information: SBBNotificationBoxStyle @Composable get() = TODO()
}

internal val LocalSBBNotificationBoxTheme =
    staticCompositionLocalOf<SBBNotificationBoxTokens> { SBBNotificationBoxTheme() }

class SBBNotificationBoxTheme() : SBBNotificationBoxTokens by configSBBNotificationBoxTokens()

@Stable
internal fun configSBBNotificationBoxTokens(): SBBNotificationBoxTokens =
    object : SBBNotificationBoxTokens {
        override val alert: SBBNotificationBoxStyle
            @Composable get() = SBBNotificationBoxStyle(
                icon = SBBIcons.Small.CircleCrossSmall,
                iconColor = MaterialTheme.colorScheme.primary,
                backgroundColor = MaterialTheme.colorScheme.primary,
            )
        override val warning: SBBNotificationBoxStyle
            @Composable get() = SBBNotificationBoxStyle(
                icon = SBBIcons.Small.CircleExclamationPointSmall,
                iconColor = if (isSystemInDarkTheme()) PrimitiveColors.peach else PrimitiveColors.black,
                backgroundColor = PrimitiveColors.peach,
            )
        override val success: SBBNotificationBoxStyle
            @Composable get() = SBBNotificationBoxStyle(
                icon = SBBIcons.Small.CircleTickSmall,
                iconColor = PrimitiveColors.green,
                backgroundColor = PrimitiveColors.green,
            )
        override val information: SBBNotificationBoxStyle
            @Composable get() = SBBNotificationBoxStyle(
                icon = SBBIcons.Small.CircleInformationSmall,
                iconColor = if (isSystemInDarkTheme()) PrimitiveColors.white else PrimitiveColors.black,
                backgroundColor = PrimitiveColors.smoke,
            )
    }
