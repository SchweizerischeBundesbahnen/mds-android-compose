package ch.sbb.compose_mds.theme.context.material

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import ch.sbb.compose_mds.theme.context.colors.ThemeContextColors

// Change this to an extension function that takes isDarkTheme as a parameter
fun ThemeContextColors.toColorScheme(isDarkTheme: Boolean): ColorScheme =
    if (isDarkTheme) {
      darkColorScheme(
          primary = colors.primary,
          onPrimary = colors.white,
          surface = colors.black,
          onSurface = colors.white,
          surfaceVariant = colors.charcoal,
          onSurfaceVariant = colors.white,
          surfaceContainerHighest = colors.charcoal,
      )
    } else {
      lightColorScheme(
          primary = colors.primary,
          onPrimary = colors.white,
          surface = additionalColors.peach, // colors.milk,
          onSurface = colors.black,
          surfaceVariant = colors.white,
          onSurfaceVariant = colors.black,
          surfaceContainerHighest = colors.white,
      )
    }
