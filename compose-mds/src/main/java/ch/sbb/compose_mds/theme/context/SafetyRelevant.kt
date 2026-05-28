package ch.sbb.compose_mds.theme.context

import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.context.colors.ContextAdditionalColors
import ch.sbb.compose_mds.theme.context.colors.ContextColors
import ch.sbb.compose_mds.theme.context.colors.ContextFunctionalColors

fun contextSafetyRelevantRelevantColors(): ContextColors =
    ContextColors(
        primary = PrimitiveColors.royal,
        primary125 = PrimitiveColors.royal125,
        primary150 = PrimitiveColors.royal150,
        primary85 = Color(0xFF4077DF),
    )

fun contextSafetyRelevantAdditionalColors() = ContextAdditionalColors()

fun contextSafetyRelevantFunctionalColors() =
    ContextFunctionalColors(
        brand = PrimitiveColors.metal,
        products = PrimitiveColors.metal,
    )

object SafetyRelevantThemeContext : ThemeContext {
    override val colors: ContextColors
        get() = contextSafetyRelevantRelevantColors()
    override val additionalColors: ContextAdditionalColors
        get() = contextSafetyRelevantAdditionalColors()
    override val functionalColors: ContextFunctionalColors
        get() = contextSafetyRelevantFunctionalColors()
    override val contextName: String
        get() = SafetyRelevantThemeContextPreviewName
}

const val SafetyRelevantThemeContextPreviewName = "Safety Relevant"
