package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.HandUserLarge: ImageVector
    get() {
        if (_handUserLarge != null) {
            return _handUserLarge!!
        }
        _handUserLarge = Builder(
            name = "HandUserLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(5.55f, 26.935f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.487f, -0.405f)
                lineToRelative(7.997f, 5.586f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.046f, -0.62f)
                curveToRelative(0.006f, -0.857f, 0.3f, -1.728f, 0.893f, -2.391f)
                curveToRelative(0.602f, -0.673f, 1.49f, -1.105f, 2.619f, -1.105f)
                horizontalLineToRelative(4.474f)
                verticalLineToRelative(0.009f)
                curveToRelative(3.04f, 0.142f, 5.951f, 1.825f, 8.214f, 4.002f)
                lineToRelative(10.656f, 10.127f)
                lineToRelative(0.907f, 0.862f)
                horizontalLineTo(27.795f)
                lineToRelative(-0.147f, -0.145f)
                lineTo(25.777f, 41.0f)
                horizontalLineToRelative(-7.866f)
                lineToRelative(-0.142f, -0.125f)
                lineToRelative(-11.852f, -10.44f)
                verticalLineToRelative(-0.001f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.368f, -3.5f)
                moveToRelative(2.889f, 0.395f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.11f, 0.232f)
                verticalLineToRelative(-0.002f)
                arcToRelative(1.503f, 1.503f, 0.0f, false, false, 0.117f, 2.008f)
                lineToRelative(0.115f, 0.102f)
                lineToRelative(0.009f, 0.008f)
                lineToRelative(0.008f, 0.007f)
                lineTo(18.288f, 40.0f)
                horizontalLineToRelative(7.901f)
                lineToRelative(0.146f, 0.145f)
                lineTo(28.206f, 42.0f)
                horizontalLineToRelative(14.042f)
                lineTo(32.5f, 32.735f)
                lineToRelative(-0.003f, -0.002f)
                curveToRelative(-2.153f, -2.07f, -4.829f, -3.583f, -7.527f, -3.724f)
                lineTo(24.71f, 29.0f)
                horizontalLineToRelative(-4.21f)
                curveToRelative(-0.855f, 0.0f, -1.468f, 0.318f, -1.872f, 0.77f)
                curveToRelative(-0.413f, 0.462f, -0.634f, 1.091f, -0.64f, 1.734f)
                curveToRelative(-0.004f, 0.643f, 0.207f, 1.268f, 0.614f, 1.726f)
                curveToRelative(0.4f, 0.45f, 1.017f, 0.77f, 1.899f, 0.77f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.124f, 0.0f, -2.005f, -0.412f, -2.606f, -1.062f)
                lineTo(8.465f, 27.35f)
                lineToRelative(-0.013f, -0.01f)
                close()
                moveTo(24.499f, 4.0f)
                curveToRelative(3.66f, 0.0f, 6.5f, 3.433f, 6.5f, 7.5f)
                curveToRelative(0.0f, 1.995f, -0.684f, 3.837f, -1.813f, 5.196f)
                curveToRelative(5.689f, 2.397f, 8.813f, 8.37f, 8.813f, 14.805f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -6.28f, -3.107f, -11.93f, -8.563f, -14.03f)
                curveTo(27.352f, 18.428f, 25.994f, 19.0f, 24.5f, 19.0f)
                curveToRelative(-1.497f, 0.0f, -2.856f, -0.574f, -3.94f, -1.53f)
                curveToRelative(-3.675f, 1.426f, -6.276f, 4.453f, -7.589f, 8.188f)
                lineToRelative(-0.472f, -0.166f)
                lineToRelative(-0.471f, -0.165f)
                curveToRelative(1.348f, -3.836f, 4.0f, -7.029f, 7.783f, -8.634f)
                curveTo(18.684f, 15.334f, 18.0f, 13.493f, 18.0f, 11.5f)
                curveTo(18.0f, 7.433f, 20.84f, 4.0f, 24.5f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(21.532f, 5.0f, 19.0f, 7.835f, 19.0f, 11.5f)
                reflectiveCurveToRelative(2.532f, 6.5f, 5.5f, 6.5f)
                reflectiveCurveToRelative(5.5f, -2.835f, 5.5f, -6.5f)
                reflectiveCurveTo(27.469f, 5.0f, 24.5f, 5.0f)
            }
        }
            .build()
        return _handUserLarge!!
    }

private var _handUserLarge: ImageVector? = null
