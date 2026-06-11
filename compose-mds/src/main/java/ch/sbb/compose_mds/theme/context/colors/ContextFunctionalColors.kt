package ch.sbb.compose_mds.theme.context.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.PrimitiveColors

@Immutable
data class ContextFunctionalColors(
    // light colors
    val success: Color = PrimitiveColors.greenDark,
    val warning: Color = PrimitiveColors.peachDark,
    val error: Color = PrimitiveColors.red125,
    val brand: Color = PrimitiveColors.red,
    val products: Color = PrimitiveColors.red,
    // dark colors
    val successDark: Color = PrimitiveColors.green,
    val warningDark: Color = PrimitiveColors.peach,
    val errorDark: Color = PrimitiveColors.red85,
    val brandDark: Color = PrimitiveColors.red,
    val productsDark: Color = PrimitiveColors.red,
)
