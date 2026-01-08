package ch.sbb.compose_mds.theme.context.material

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import ch.sbb.compose_mds.theme.context.colors.ThemeContextColors

@Composable
@ReadOnlyComposable
fun ThemeContextColors.colorScheme(isDarkTheme: Boolean): ColorScheme =
    createSBBMaterialTheme(isDarkTheme, this)

fun createSBBMaterialTheme(
    isDarkTheme: Boolean,
    themeContext: ThemeContextColors,
): ColorScheme =
    if (isDarkTheme) {
        darkColorScheme(
            primary = themeContext.colors.primary,
            onPrimary = themeContext.colors.white,
            surface = themeContext.colors.black,
            onSurface = themeContext.colors.white,
            surfaceVariant = themeContext.colors.charcoal,
            onSurfaceVariant = themeContext.colors.white,
            surfaceContainerHighest = themeContext.colors.charcoal,
            onBackground = themeContext.colors.white,
            background = themeContext.colors.black,
        )
    } else {
        lightColorScheme(
            primary = themeContext.colors.primary,
            onPrimary = themeContext.colors.white,
            surface = themeContext.colors.milk,
            onSurface = themeContext.colors.black,
            surfaceVariant = themeContext.colors.white,
            onSurfaceVariant = themeContext.colors.black,
            surfaceContainerHighest = themeContext.colors.white,
            onBackground = themeContext.colors.black,
            background = themeContext.colors.milk,
        )
    }
