package ch.sbb.compose_mds.theme.context

import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.context.colors.ContextAdditionalColors
import ch.sbb.compose_mds.theme.context.colors.ContextColors
import ch.sbb.compose_mds.theme.context.colors.ContextFunctionalColors

fun contextSBBColors(): ContextColors =
    ContextColors(
        primary = PrimitiveColors.red,
        primary125 = PrimitiveColors.red125,
        primary150 = PrimitiveColors.red150,
        primary85 = PrimitiveColors.red85,
    )

fun contextSBBAdditionalColors() = ContextAdditionalColors()

fun contextSBBFunctionalColors() = ContextFunctionalColors()

object SBBThemeContext : ThemeContext {
    override val colors: ContextColors
        get() = contextSBBColors()
    override val additionalColors: ContextAdditionalColors
        get() = contextSBBAdditionalColors()
    override val functionalColors: ContextFunctionalColors
        get() = contextSBBFunctionalColors()
    override val contextName: String
        get() = SBBThemeContextPreviewName
}

const val SBBThemeContextPreviewName = "SBB Default"
