package ch.sbb.compose_mds.composables.status.theme

import ch.sbb.compose_mds.icons.CircleCrossSmall
import ch.sbb.compose_mds.icons.CircleExclamationPointSmall
import ch.sbb.compose_mds.icons.CircleInformationSmall
import ch.sbb.compose_mds.icons.CircleTickSmall
import ch.sbb.compose_mds.icons.SBBIcons
import ch.sbb.compose_mds.theme.SBBColorScheme
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBTypography

internal fun defaultSBBStatusThemeData(
    typography: SBBTypography,
    colorScheme: SBBColorScheme,
    isDarkMode: Boolean,
): SBBStatusThemeData {
    val warningColor = if (isDarkMode) SBBColors.peachDark else SBBColors.peach
    val successColor = if (isDarkMode) SBBColors.greenDark else SBBColors.green
    return SBBStatusThemeData(
        alert = SBBStatusStyle(
            textStyle = typography.smallLight,
            foregroundColor = colorScheme.textPrimary,
            backgroundColor = colorScheme.error,
            iconColor = SBBColors.white,
            iconData = SBBIcons.CircleCrossSmall,
            borderColor = colorScheme.error,
            alphaValue = .05f,
        ),
        warning = SBBStatusStyle(
            textStyle = typography.smallLight,
            foregroundColor = colorScheme.textPrimary,
            backgroundColor = warningColor,
            iconColor = SBBColors.black,
            iconData = SBBIcons.CircleExclamationPointSmall,
            borderColor = warningColor,
            alphaValue = .05f,
        ),
        information = SBBStatusStyle(
            textStyle = typography.smallLight,
            foregroundColor = colorScheme.textPrimary,
            backgroundColor = SBBColors.smoke,
            iconColor = SBBColors.white,
            iconData = SBBIcons.CircleInformationSmall,
            borderColor = SBBColors.smoke,
            alphaValue = .05f,
        ),
        success = SBBStatusStyle(
            textStyle = typography.smallLight,
            foregroundColor = colorScheme.textPrimary,
            backgroundColor = successColor,
            iconColor = SBBColors.white,
            iconData = SBBIcons.CircleTickSmall,
            borderColor = successColor,
            alphaValue = .05f,
        ),
    )
}
