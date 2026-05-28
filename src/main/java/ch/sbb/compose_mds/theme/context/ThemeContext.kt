package ch.sbb.compose_mds.theme.context

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.staticCompositionLocalOf
import ch.sbb.compose_mds.theme.context.colors.ContextAdditionalColors
import ch.sbb.compose_mds.theme.context.colors.ContextColors
import ch.sbb.compose_mds.theme.context.colors.ContextFunctionalColors

interface ThemeContext {
    val colors: ContextColors
    val additionalColors: ContextAdditionalColors
    val functionalColors: ContextFunctionalColors
    val contextName: String

    fun getColors(isDark: Boolean): ContextColors

    fun getAdditionalColors(isDark: Boolean): ContextAdditionalColors

    fun getFunctionalColors(isDark: Boolean): ContextFunctionalColors

    // New: Function to get the Material ColorScheme for this context
    fun getMaterialColorScheme(isDark: Boolean): ColorScheme
}

internal val LocalThemeContext = staticCompositionLocalOf { SBBThemeContext }
