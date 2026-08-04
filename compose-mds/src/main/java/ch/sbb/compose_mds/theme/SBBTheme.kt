package ch.sbb.compose_mds.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.text.font.FontFamily
import ch.sbb.compose_mds.composables.checkbox.LocalSBBCheckboxStyle
import ch.sbb.compose_mds.composables.checkbox.SBBCheckboxStyle
import ch.sbb.compose_mds.composables.checkbox.defaultSBBCheckboxStyle
import ch.sbb.compose_mds.composables.chip.LocalSBBChipStyle
import ch.sbb.compose_mds.composables.chip.SBBChipStyle
import ch.sbb.compose_mds.composables.chip.defaultSBBChipStyle
import ch.sbb.compose_mds.composables.listItem.LocalSBBListItemStyle
import ch.sbb.compose_mds.composables.listItem.SBBListItemStyle
import ch.sbb.compose_mds.composables.listItem.defaultSBBListItemStyle
import ch.sbb.compose_mds.composables.notificationBox.LocalSBBNotificationBoxStyle
import ch.sbb.compose_mds.composables.notificationBox.SBBNotificationBoxTokens
import ch.sbb.compose_mds.composables.notificationBox.defaultSBBNotificationBoxStyle
import ch.sbb.compose_mds.composables.picker.LocalSBBPickerStyle
import ch.sbb.compose_mds.composables.picker.SBBPickerStyle
import ch.sbb.compose_mds.composables.picker.defaultSBBPickerStyle
import ch.sbb.compose_mds.composables.radio.LocalSBBRadioStyle
import ch.sbb.compose_mds.composables.radio.SBBRadioStyle
import ch.sbb.compose_mds.composables.radio.defaultSBBRadioStyle
import ch.sbb.compose_mds.composables.segmentedButton.LocalSBBSegmentedButtonStyle
import ch.sbb.compose_mds.composables.segmentedButton.SBBSegmentedButtonVariants
import ch.sbb.compose_mds.composables.segmentedButton.defaultSBBSegmentedButtonStyles
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
        get() = LocalSBBTypography.current.materialTypography // LocalSBBTypography.current

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
        get() = LocalSBBNotificationBoxStyle.current

    val listItem: SBBListItemStyle
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBListItemStyle.current

    val segmentedButton: SBBSegmentedButtonVariants
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBSegmentedButtonStyle.current

    val checkbox: SBBCheckboxStyle
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBCheckboxStyle.current

    val radio: SBBRadioStyle
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBRadioStyle.current

    val chip: SBBChipStyle
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBChipStyle.current

    val picker: SBBPickerStyle
        @ReadOnlyComposable
        @Composable
        get() = LocalSBBPickerStyle.current
}

@Composable
fun SBBTheme(
    modifier: Modifier = Modifier,
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
        LocalSBBNotificationBoxStyle provides defaultSBBNotificationBoxStyle(),
        LocalSBBListItemStyle provides defaultSBBListItemStyle(),
        LocalSBBSegmentedButtonStyle provides defaultSBBSegmentedButtonStyles(),
        LocalSBBCheckboxStyle provides defaultSBBCheckboxStyle(),
        LocalSBBRadioStyle provides defaultSBBRadioStyle(),
        LocalSBBChipStyle provides defaultSBBChipStyle(),
        LocalSBBPickerStyle provides defaultSBBPickerStyle(),
    ) {
        MaterialTheme(
            colorScheme = SBBTheme.colorScheme,
            typography = SBBTheme.materialTypography,
            content = {
                val movableContent = remember { movableContentOf { content() } }
                if (includeSurface) Surface(modifier = modifier) { movableContent() } else movableContent()
            },
        )
    }
}
