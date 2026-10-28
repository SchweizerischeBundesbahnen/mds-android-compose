package ch.sbb.compose_mds.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ch.sbb.compose_mds.theme.SBBColorScheme

internal const val PREVIEW_GROUP = "SBB Themes"

enum class ThemePreviewVariant {
    SBB,
    OFF_BRAND,
    SAFETY,
}

class ThemePreviewConfig(
    val variant: ThemePreviewVariant,
    val group: String = PREVIEW_GROUP,
) {
    fun colorScheme(isDarkMode: Boolean): SBBColorScheme =
        when (variant) {
            ThemePreviewVariant.SBB -> SBBColorScheme.sbb(isDarkMode)
            ThemePreviewVariant.OFF_BRAND -> SBBColorScheme.offBrand(isDarkMode)
            ThemePreviewVariant.SAFETY -> SBBColorScheme.safety(isDarkMode)
        }
}

/**
 * Provides a sequence of ThemePreviewConfig with all given SBBColorScheme for @PreviewParameter.
 */
class SBBThemeAllConfigProvider : PreviewParameterProvider<ThemePreviewConfig> {
    private val configs = listOf(
        ThemePreviewConfig(variant = ThemePreviewVariant.SBB),
        ThemePreviewConfig(variant = ThemePreviewVariant.OFF_BRAND),
        ThemePreviewConfig(variant = ThemePreviewVariant.SAFETY),
    )

    override val values: Sequence<ThemePreviewConfig> = configs.asSequence()

    override fun getDisplayName(index: Int): String? = configs.getOrNull(index)?.variant?.name
}

/**
 * Provides a ThemePreviewConfig of the base SBBColorScheme for @PreviewParameter.
 */
class SBBThemeConfigProvider : PreviewParameterProvider<ThemePreviewConfig> {
    private val baseConfig = ThemePreviewConfig(variant = ThemePreviewVariant.SBB)

    override val values: Sequence<ThemePreviewConfig> = sequenceOf(baseConfig)

    override fun getDisplayName(index: Int): String = baseConfig.variant.name
}
