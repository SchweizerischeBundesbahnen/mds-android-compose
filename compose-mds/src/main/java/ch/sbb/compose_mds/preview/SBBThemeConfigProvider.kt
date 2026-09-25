package ch.sbb.compose_mds.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ch.sbb.compose_mds.theme.SBBColorScheme

internal const val PREVIEW_GROUP = "SBB Themes"

/**
 * Data class to hold a single theme configuration for iteration.
 */
class ThemePreviewConfig(
    val colorScheme: SBBColorScheme,
    val group: String = PREVIEW_GROUP,
)

/**
 * Provides a sequence of ThemePreviewConfig objects for @PreviewParameter.
 * Each item in this sequence will generate a separate preview.
 *
 * TODO: How to handle dark / light mode in config
 */
class SBBThemeConfigProvider : PreviewParameterProvider<ThemePreviewConfig> {
    override val values: Sequence<ThemePreviewConfig> =
        sequenceOf(
            ThemePreviewConfig(colorScheme = SBBColorScheme.sbb(isDarkMode = false)),
            ThemePreviewConfig(colorScheme = SBBColorScheme.offBrand(isDarkMode = false)),
            ThemePreviewConfig(colorScheme = SBBColorScheme.safety(isDarkMode = false)),
        )
}
