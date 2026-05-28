package ch.sbb.compose_mds.theme.context

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.context.colors.ContextAdditionalColors
import ch.sbb.compose_mds.theme.context.colors.ContextColors
import ch.sbb.compose_mds.theme.context.colors.ContextFunctionalColors

// Define light mode colors
fun contextSBBColorsLight(): ContextColors =
    ContextColors(
        primary = PrimitiveColors.red,
        primary125 = PrimitiveColors.red125,
        primary150 = PrimitiveColors.red150,
        primary85 = PrimitiveColors.red85,
        background = PrimitiveColors.white,
        onBackground = PrimitiveColors.black,
        white = PrimitiveColors.white,
        black = PrimitiveColors.black,
    )

// Define dark mode colors
fun contextSBBColorsDark(): ContextColors =
    ContextColors(
        primary = PrimitiveColors.red,
        primary125 = PrimitiveColors.red125,
        primary150 = PrimitiveColors.red150,
        primary85 = PrimitiveColors.red85,
        background = PrimitiveColors.black,
        onBackground = PrimitiveColors.white,
        white = PrimitiveColors.white,
        black = PrimitiveColors.black,
    )

fun contextSBBAdditionalColorsLight() = ContextAdditionalColors()

fun contextSBBAdditionalColorsDark() = ContextAdditionalColors()

fun contextSBBFunctionalColorsLight() = ContextFunctionalColors()

fun contextSBBFunctionalColorsDark() = ContextFunctionalColors()

object SBBThemeContext : ThemeContext {
    override val colors: ContextColors
        get() = getColors(false) // Default to light if accessed directly without context
    override val additionalColors: ContextAdditionalColors
        get() = getAdditionalColors(false) // Default to light
    override val functionalColors: ContextFunctionalColors
        get() = getFunctionalColors(false) // Default to light

    override val contextName: String
        get() = SBBThemeContextPreviewName

    // Implement the new methods from ThemeContext interface
    override fun getColors(isDark: Boolean): ContextColors = if (isDark) contextSBBColorsDark() else contextSBBColorsLight()

    override fun getAdditionalColors(isDark: Boolean): ContextAdditionalColors =
        if (isDark) contextSBBAdditionalColorsDark() else contextSBBAdditionalColorsLight()

    override fun getFunctionalColors(isDark: Boolean): ContextFunctionalColors =
        if (isDark) contextSBBFunctionalColorsDark() else contextSBBFunctionalColorsLight()

    override fun getMaterialColorScheme(isDark: Boolean): ColorScheme {
        val currentColors = getColors(isDark)
        val currentAdditionalColors = getAdditionalColors(isDark)
        val currentFunctionalColors = getFunctionalColors(isDark)

        return if (isDark) {
            darkColorScheme(
                primary = currentColors.primary,
                onPrimary = currentColors.white,
                surface = currentColors.black,
                onSurface = currentColors.white,
                surfaceVariant = currentColors.charcoal, // Assuming charcoal is defined in ContextColors
                onSurfaceVariant = currentColors.white,
                surfaceContainerHighest = currentColors.charcoal, // Assuming charcoal is defined in ContextColors
            )
        } else {
            lightColorScheme(
                primary = currentColors.primary,
                onPrimary = currentColors.white,
                surface = currentAdditionalColors.peach, // Assuming peach is defined in ContextAdditionalColors
                onSurface = currentColors.black,
                surfaceVariant = currentColors.white,
                onSurfaceVariant = currentColors.black,
                surfaceContainerHighest = currentColors.white,
            )
        }
    }
}

const val SBBThemeContextPreviewName = "SBB Default"
