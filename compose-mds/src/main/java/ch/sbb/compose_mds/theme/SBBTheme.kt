import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.text.font.FontFamily
import ch.sbb.compose_mds.beta.notificationBox.LocalSBBNotificationBoxTheme
import ch.sbb.compose_mds.beta.notificationBox.SBBNotificationBoxTokens
import ch.sbb.compose_mds.beta.notificationBox.configSBBNotificationBoxTokens
import ch.sbb.compose_mds.theme.LocalSBBTypography
import ch.sbb.compose_mds.theme.SBBTypography
import ch.sbb.compose_mds.theme.context.LocalThemeContext
import ch.sbb.compose_mds.theme.context.SBBThemeContext
import ch.sbb.compose_mds.theme.context.ThemeContext
import ch.sbb.compose_mds.theme.context.colors.ContextAdditionalColors
import ch.sbb.compose_mds.theme.context.colors.ContextColors
import ch.sbb.compose_mds.theme.context.colors.ContextFunctionalColors
import ch.sbb.compose_mds.theme.context.material.colorScheme

internal val LocalSBBIsDarkMode = staticCompositionLocalOf<Boolean> { false }

object SBBTheme {
    val colors: ContextColors
        @ReadOnlyComposable
        @Composable
        get() = LocalThemeContext.current.colors

    val additionalColors: ContextAdditionalColors
        @ReadOnlyComposable
        @Composable
        get() = LocalThemeContext.current.additionalColors

    val functionalColors: ContextFunctionalColors
        @ReadOnlyComposable
        @Composable
        get() = LocalThemeContext.current.functionalColors

    val colorScheme: ColorScheme
        @ReadOnlyComposable
        @Composable
        get() = LocalThemeContext.current.colorScheme(isDarkMode)

    @Deprecated("Use materialTypography instead", ReplaceWith("SBBTheme.materialTypography"))
    val typography: Typography
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBTypography.current.materialTypography //LocalSBBTypography.current

    val materialTypography: Typography
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBTypography.current.materialTypography

    val sbbTypography: SBBTypography
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBTypography.current

    val isDarkMode: Boolean
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBIsDarkMode.current

    val contextName: String
        @ReadOnlyComposable
        @Composable
        get() = LocalThemeContext.current.contextName

    val notificationBox: SBBNotificationBoxTokens
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBNotificationBoxTheme.current
}

@Composable
fun SBBTheme(
    themeContext: ThemeContext = SBBThemeContext,
    darkTheme: Boolean = isSystemInDarkTheme(),
    fontFamily: FontFamily? = null,
    includeSurface: Boolean = LocalInspectionMode.current,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalThemeContext provides themeContext,
        LocalSBBIsDarkMode provides darkTheme,
        LocalSBBTypography provides SBBTypography(fontFamily = fontFamily),
        LocalSBBNotificationBoxTheme provides configSBBNotificationBoxTokens()
    ) {
        MaterialTheme(
            colorScheme = SBBTheme.colorScheme,
            typography = SBBTheme.materialTypography,
            content = { if (includeSurface) Surface { content() } else content() },
        )
    }
}
