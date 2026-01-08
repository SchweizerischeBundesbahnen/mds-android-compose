package ch.sbb.compose_mds.theme.context.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.PrimitiveColors

@Immutable
data class ContextAdditionalColors(
    // light colors
    val sky: Color = PrimitiveColors.sky,
    val night: Color = PrimitiveColors.night,
    val violet: Color = PrimitiveColors.violet,
    val pink: Color = PrimitiveColors.pink,
    val autumn: Color = PrimitiveColors.autumn,
    val orange: Color = PrimitiveColors.orange,
    val peach: Color = PrimitiveColors.peach,
    val lemon: Color = PrimitiveColors.lemon,
    val brown: Color = PrimitiveColors.brown,
    val green: Color = PrimitiveColors.green,
    val turquoise: Color = PrimitiveColors.turquoise,

    // dark colors
    val skyDark: Color = PrimitiveColors.skyDark,
    val nightDark: Color = PrimitiveColors.nightDark,
    val violetDark: Color = PrimitiveColors.violetDark,
    val pinkDark: Color = PrimitiveColors.pinkDark,
    val autumnDark: Color = PrimitiveColors.autumnDark,
    val orangeDark: Color = PrimitiveColors.orangeDark,
    val peachDark: Color = PrimitiveColors.peachDark,
    val lemonDark: Color = PrimitiveColors.lemonDark,
    val brownDark: Color = PrimitiveColors.brownDark,
    val greenDark: Color = PrimitiveColors.greenDark,
    val turquoiseDark: Color = PrimitiveColors.turquoiseDark,
)
