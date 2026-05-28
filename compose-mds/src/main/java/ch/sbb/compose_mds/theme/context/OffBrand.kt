package ch.sbb.compose_mds.theme.context

import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.context.colors.ContextAdditionalColors
import ch.sbb.compose_mds.theme.context.colors.ContextColors
import ch.sbb.compose_mds.theme.context.colors.ContextFunctionalColors

fun contextOffBrandColors(): ContextColors =
    ContextColors(
        primary = PrimitiveColors.royal,
        primary125 = PrimitiveColors.royal125,
        primary150 = PrimitiveColors.royal150,
        primary85 = Color(0xFF4077DF),
    )

fun contextOffBAdditionalColors() = ContextAdditionalColors()

fun contextOffBrandFunctionalColors() = ContextFunctionalColors()

object OffBrandThemeContext : ThemeContext {
    override val colors: ContextColors
        get() = contextOffBrandColors()
    override val additionalColors: ContextAdditionalColors
        get() = contextOffBAdditionalColors()
    override val functionalColors: ContextFunctionalColors
        get() = contextOffBrandFunctionalColors()
    override val contextName: String
        get() = OffBrandThemeContextPreviewName
}

const val OffBrandThemeContextPreviewName = "Off-Brand"
