package ch.sbb.compose_mds.composables.status.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle

data class SBBStatusStyle(
    var textStyle: TextStyle? = null,
    var foregroundColor: Color? = null,
    var backgroundColor: Color? = null,
    var iconColor: Color? = null,
    var iconData: ImageVector? = null,
    var borderColor: Color? = null,
    var alphaValue: Float? = null,
) {
    fun merge(other: SBBStatusStyle?): SBBStatusStyle {
        if (other == null) return this

        return copyWith(
            textStyle = other.textStyle,
            foregroundColor = other.foregroundColor,
            backgroundColor = other.backgroundColor,
            iconColor = other.iconColor,
            iconData = other.iconData,
            borderColor = other.borderColor,
            alphaValue = other.alphaValue,
        )
    }

    fun copyWith(
        textStyle: TextStyle? = null,
        foregroundColor: Color? = null,
        backgroundColor: Color? = null,
        iconColor: Color? = null,
        iconData: ImageVector? = null,
        borderColor: Color? = null,
        alphaValue: Float? = null,
    ) = copy(
        textStyle = textStyle ?: this.textStyle,
        foregroundColor = foregroundColor ?: this.foregroundColor,
        backgroundColor = backgroundColor ?: this.backgroundColor,
        iconColor = iconColor ?: this.iconColor,
        iconData = iconData ?: this.iconData,
        borderColor = borderColor ?: this.borderColor,
        alphaValue = alphaValue ?: this.alphaValue,
    )
}
