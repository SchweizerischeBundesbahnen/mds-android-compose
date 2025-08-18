package ch.sbb.compose_mds.composables.checkbox

import androidx.compose.ui.graphics.Color
import ch.sbb.compose_mds.theme.PrimitiveColors

internal enum class SBBCheckboxColors(
    val borderColor: Color,
    val checkColor: Color,
    val indeterminateColor: Color,
    val textColor: Color,
    val backgroundColor: Color
) {
    LIGHT_ENABLED(
        borderColor = PrimitiveColors.granite,
        checkColor = PrimitiveColors.red,
        indeterminateColor = PrimitiveColors.red,
        textColor = PrimitiveColors.black,
        backgroundColor = PrimitiveColors.white,
    ),
    DARK_ENABLED(
        borderColor = PrimitiveColors.cloud,
        checkColor = PrimitiveColors.red,
        indeterminateColor = PrimitiveColors.red,
        textColor = PrimitiveColors.white,
        backgroundColor = PrimitiveColors.black,
    ),
    LIGHT_DISABLED(
        borderColor = PrimitiveColors.cloud,
        checkColor = PrimitiveColors.granite,
        indeterminateColor = PrimitiveColors.granite,
        textColor = PrimitiveColors.granite,
        backgroundColor = PrimitiveColors.white,
    ),
    DARK_DISABLED(
        borderColor = PrimitiveColors.iron,
        checkColor = PrimitiveColors.graphite,
        indeterminateColor = PrimitiveColors.graphite,
        textColor = PrimitiveColors.graphite,
        backgroundColor = PrimitiveColors.black,
    );
}