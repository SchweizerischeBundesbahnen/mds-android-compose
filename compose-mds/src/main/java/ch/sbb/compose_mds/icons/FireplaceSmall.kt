package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.FireplaceSmall: ImageVector
    get() {
        if (_fireplaceSmall != null) {
            return _fireplaceSmall!!
        }
        _fireplaceSmall = Builder(name = "FireplaceSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.207f)
                lineToRelative(-0.146f, 0.147f)
                lineToRelative(-0.854f, 0.853f)
                lineTo(21.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                lineTo(3.0f, 5.207f)
                lineToRelative(-0.854f, -0.853f)
                lineTo(2.0f, 4.207f)
                lineTo(2.0f, 2.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(0.793f)
                lineToRelative(0.854f, 0.853f)
                lineToRelative(0.146f, 0.147f)
                lineTo(4.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 9.0f)
                horizontalLineToRelative(11.998f)
                lineToRelative(0.002f, 0.498f)
                lineTo(18.044f, 21.0f)
                lineTo(20.0f, 21.0f)
                lineTo(20.0f, 4.793f)
                lineToRelative(0.147f, -0.147f)
                lineToRelative(0.853f, -0.853f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(17.044f, 21.0f)
                lineTo(17.002f, 10.0f)
                lineTo(7.0f, 10.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(1.807f)
                arcToRelative(13.503f, 13.503f, 0.0f, false, true, -0.556f, -2.967f)
                curveToRelative(-0.128f, -1.926f, 0.24f, -4.338f, 2.525f, -5.48f)
                lineToRelative(0.702f, -0.351f)
                lineToRelative(0.022f, 0.784f)
                lineToRelative(0.004f, 0.15f)
                curveToRelative(0.02f, 0.756f, 0.045f, 1.717f, 0.163f, 2.59f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.268f, 1.228f)
                curveToRelative(0.121f, 0.35f, 0.257f, 0.557f, 0.381f, 0.659f)
                lineToRelative(0.002f, 0.001f)
                curveToRelative(0.007f, 0.009f, 0.042f, 0.049f, 0.219f, -0.048f)
                curveToRelative(0.197f, -0.109f, 0.434f, -0.327f, 0.677f, -0.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.607f, -0.814f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.23f, -0.366f)
                lineToRelative(0.012f, -0.02f)
                lineToRelative(0.003f, -0.005f)
                lineToRelative(0.542f, -0.941f)
                lineToRelative(0.363f, 1.023f)
                lineTo(14.5f, 16.0f)
                lineToRelative(0.471f, -0.167f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.002f, 0.003f)
                lineToRelative(0.003f, 0.01f)
                lineToRelative(0.013f, 0.037f)
                lineToRelative(0.043f, 0.133f)
                arcToRelative(13.18f, 13.18f, 0.0f, false, true, 0.478f, 2.05f)
                curveToRelative(0.09f, 0.61f, 0.138f, 1.293f, 0.067f, 1.942f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.224f, 0.991f)
                close()
                moveTo(14.246f, 21.0f)
                horizontalLineToRelative(-4.39f)
                curveToRelative(-0.056f, -0.17f, -0.127f, -0.4f, -0.201f, -0.676f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -0.406f, -2.357f)
                curveToRelative(-0.103f, -1.545f, 0.154f, -3.1f, 1.277f, -4.06f)
                curveToRelative(0.023f, 0.612f, 0.062f, 1.303f, 0.15f, 1.954f)
                curveToRelative(0.068f, 0.498f, 0.166f, 0.993f, 0.314f, 1.421f)
                curveToRelative(0.146f, 0.419f, 0.359f, 0.832f, 0.693f, 1.105f)
                curveToRelative(0.454f, 0.371f, 0.969f, 0.256f, 1.335f, 0.055f)
                curveToRelative(0.357f, -0.196f, 0.688f, -0.524f, 0.955f, -0.835f)
                curveToRelative(0.123f, -0.143f, 0.239f, -0.29f, 0.345f, -0.432f)
                curveToRelative(0.074f, 0.307f, 0.148f, 0.662f, 0.203f, 1.038f)
                curveToRelative(0.082f, 0.563f, 0.12f, 1.153f, 0.062f, 1.688f)
                curveToRelative(-0.048f, 0.441f, -0.158f, 0.813f, -0.337f, 1.1f)
            }
        }
        .build()
        return _fireplaceSmall!!
    }

private var _fireplaceSmall: ImageVector? = null
