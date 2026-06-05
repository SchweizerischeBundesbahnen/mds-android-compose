package ch.sbb.compose_mds.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.font.FontFamily
import ch.sbb.compose_mds.theme.context.LocalThemeContext
import ch.sbb.compose_mds.theme.context.SBBThemeContext
import ch.sbb.compose_mds.theme.context.ThemeContext
import ch.sbb.compose_mds.theme.context.colors.ContextAdditionalColors
import ch.sbb.compose_mds.theme.context.colors.ContextColors
import ch.sbb.compose_mds.theme.context.colors.ContextFunctionalColors

// import ch.sbb.compose_mds.theme.context.material.toColorScheme // This import is no longer needed

internal val LocalSBBIsDarkMode = staticCompositionLocalOf<Boolean> { false }

object SBBTheme {
  val colors: ContextColors
    @ReadOnlyComposable
    @Composable
    get() {
      val themeContext = LocalThemeContext.current
      val isDark = LocalSBBIsDarkMode.current
      return themeContext.getColors(isDark)
    }

  val additionalColors: ContextAdditionalColors
    @ReadOnlyComposable
    @Composable
    get() {
      val themeContext = LocalThemeContext.current
      val isDark = LocalSBBIsDarkMode.current
      return themeContext.getAdditionalColors(isDark)
    }

  val functionalColors: ContextFunctionalColors
    @ReadOnlyComposable
    @Composable
    get() {
      val themeContext = LocalThemeContext.current
      val isDark = LocalSBBIsDarkMode.current
      return themeContext.getFunctionalColors(isDark)
    }

  val typography: Typography
    @ReadOnlyComposable @Composable get() = LocalSBBTypography.current

  val isDarkMode: Boolean
    @ReadOnlyComposable @Composable get() = LocalSBBIsDarkMode.current

  val contextName: String
    @ReadOnlyComposable @Composable get() = LocalThemeContext.current.contextName
}

@Composable
fun SBBTheme(
    themeContext: ThemeContext = SBBThemeContext,
    darkTheme: Boolean = isSystemInDarkTheme(),
    fontFamily: FontFamily? = null,
    content: @Composable () -> Unit,
) {
  CompositionLocalProvider(
      LocalThemeContext provides themeContext,
      LocalSBBIsDarkMode provides darkTheme,
      LocalSBBTypography provides SBBTypography.default(fontFamily = fontFamily),
  ) {
    MaterialTheme(
        colorScheme = themeContext.getMaterialColorScheme(darkTheme), // Corrected call
        typography = SBBTheme.typography,
        content = content,
    )
  }
}
