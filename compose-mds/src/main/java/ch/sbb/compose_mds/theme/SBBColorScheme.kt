package ch.sbb.compose_mds.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

data class SBBColorScheme(
    /** Required primary color. */
    val primary: Color,
    /** A lighter/soft variant of the primary color (85%). */
    val primary85: Color,
    /** A stronger variant of the primary color (125%). */
    val primary125: Color,
    /** A stronger variant of the primary color (150%). */
    val primary150: Color,
    /** Background color used for app surfaces. */
    val backgroundBase: Color,
    /** Background color used for content, e.g. the background color of a SBBContentBox. */
    val backgroundContent: Color,
    /** Color used for error states. */
    val error: Color,
    /** Primary color for icons. */
    val iconPrimary: Color,
    /** Secondary color for icons. */
    val iconSecondary: Color,
    /** Primary text color. */
    val textPrimary: Color,
    /** Secondary text color used for label styles and some components. */
    val textSecondary: Color,
    /** Primary stroke color used for borders. */
    val strokePrimary: Color,
    /** Secondary stroke color used for borders. */
    val strokeSecondary: Color,
    /** Separator color used in divider styling. */
    val strokeSeparator: Color,
    /** Color used for text selection and cursor. */
    val selection: Color,
    /** The brand color. */
    val brand: Color,
) {
    companion object {
        /**
         * Create a ColorScheme based on the SBB theme context colors.
         */
        fun sbb(isDarkMode: Boolean): SBBColorScheme = if (isDarkMode) sbbDark() else sbb()

        /**
         * Create a ColorScheme based on the off-brand theme context colors.
         */
        fun offBrand(isDarkMode: Boolean): SBBColorScheme =
            if (isDarkMode) offBrandDark() else offBrand()

        /**
         * Create a ColorScheme based on the safety theme context colors.
         */
        fun safety(isDarkMode: Boolean): SBBColorScheme =
            if (isDarkMode) safetyDark() else safety()

        private fun sbb() = SBBColorScheme(
            primary = SBBColors.red,
            primary85 = SBBColors.red85,
            primary125 = SBBColors.red125,
            primary150 = SBBColors.red150,
            brand = SBBColors.red,
            backgroundBase = SBBColors.milk,
            backgroundContent = SBBColors.white,
            error = SBBColors.error,
            iconPrimary = SBBColors.black,
            iconSecondary = SBBColors.granite,
            textPrimary = SBBColors.black,
            textSecondary = SBBColors.granite,
            strokePrimary = SBBColors.black,
            strokeSecondary = SBBColors.granite,
            strokeSeparator = SBBColors.cloud,
            selection = SBBColors.sky,
        )

        private fun sbbDark() = sbb().copy(
            backgroundBase = SBBColors.black,
            backgroundContent = SBBColors.charcoal,
            error = SBBColors.errorDark,
            iconPrimary = SBBColors.white,
            iconSecondary = SBBColors.graphite,
            textPrimary = SBBColors.white,
            textSecondary = SBBColors.graphite,
            strokePrimary = SBBColors.white,
            strokeSecondary = SBBColors.graphite,
            strokeSeparator = SBBColors.iron,
            selection = SBBColors.skyDark,
        )

        private fun offBrand() = sbb().copy(
            primary = SBBColors.royal,
            primary85 = SBBColors.royal85,
            primary125 = SBBColors.royal125,
            primary150 = SBBColors.royal150,
        )

        private fun offBrandDark() = sbbDark().copy(
            primary = SBBColors.royalDark,
            primary85 = SBBColors.royal85Dark,
            primary125 = SBBColors.royal125Dark,
            primary150 = SBBColors.royal150Dark,
        )

        private fun safety() = offBrand().copy(
            brand = SBBColors.metal,
        )

        private fun safetyDark() = offBrandDark().copy(
            brand = SBBColors.metal,
        )
    }

    fun toMaterialColorScheme(isDarkTheme: Boolean): ColorScheme {
        val defaults = if (isDarkTheme) darkColorScheme() else lightColorScheme()

        return defaults.copy(
            primary = primary,
            onPrimary = SBBColors.white,
            surface = backgroundBase,
            onSurface = textPrimary,
            surfaceVariant = backgroundContent,
            onSurfaceVariant = textPrimary,
            surfaceContainerHighest = backgroundContent,
            onBackground = textPrimary,
            background = backgroundBase,
        )
    }
}

