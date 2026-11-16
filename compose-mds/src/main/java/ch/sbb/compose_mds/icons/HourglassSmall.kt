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

public val SBBIcons.HourglassSmall: ImageVector
    get() {
        if (_hourglassSmall != null) {
            return _hourglassSmall!!
        }
        _hourglassSmall = Builder(name = "HourglassSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.275f, 9.579f)
                curveToRelative(-0.782f, 0.48f, -1.29f, 1.398f, -1.29f, 2.42f)
                curveToRelative(0.0f, 0.96f, 0.447f, 1.826f, 1.147f, 2.327f)
                lineToRelative(0.143f, 0.096f)
                lineToRelative(0.004f, 0.002f)
                curveToRelative(1.825f, 1.1f, 3.505f, 3.188f, 3.715f, 5.576f)
                lineTo(6.007f, 20.0f)
                curveToRelative(0.195f, -2.229f, 1.671f, -4.195f, 3.35f, -5.342f)
                lineToRelative(0.363f, -0.234f)
                lineToRelative(0.004f, -0.002f)
                curveToRelative(0.781f, -0.481f, 1.292f, -1.399f, 1.292f, -2.422f)
                reflectiveCurveToRelative(-0.511f, -1.941f, -1.293f, -2.421f)
                lineToRelative(-0.003f, -0.002f)
                lineToRelative(-0.363f, -0.234f)
                curveTo(7.678f, 8.195f, 6.202f, 6.228f, 6.007f, 4.0f)
                horizontalLineToRelative(11.987f)
                curveToRelative(-0.21f, 2.388f, -1.89f, 4.477f, -3.715f, 5.577f)
                close()
                moveTo(9.723f, 9.579f)
                lineTo(9.479f, 9.975f)
                lineTo(9.503f, 9.936f)
                close()
                moveTo(9.724f, 14.422f)
                lineTo(9.496f, 14.052f)
                lineTo(9.463f, 13.996f)
                close()
                moveTo(14.796f, 13.567f)
                curveToRelative(-0.465f, -0.288f, -0.812f, -0.87f, -0.812f, -1.567f)
                reflectiveCurveToRelative(0.346f, -1.28f, 0.81f, -1.568f)
                curveToRelative(2.156f, -1.3f, 4.222f, -3.888f, 4.222f, -6.932f)
                lineTo(19.016f, 3.0f)
                lineTo(4.984f, 3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 3.043f, 2.065f, 5.633f, 4.22f, 6.932f)
                curveToRelative(0.465f, 0.287f, 0.812f, 0.87f, 0.812f, 1.568f)
                curveToRelative(0.0f, 0.696f, -0.347f, 1.279f, -0.812f, 1.567f)
                curveToRelative(-2.155f, 1.3f, -4.22f, 3.889f, -4.22f, 6.933f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(14.032f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.854f, -1.815f, -5.308f, -3.818f, -6.674f)
                close()
                moveTo(14.876f, 7.867f)
                lineTo(15.81f, 7.0f)
                lineTo(8.192f, 7.0f)
                lineToRelative(0.931f, 0.866f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 1.104f, 0.842f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(0.016f, 0.01f)
                curveToRelative(0.542f, 0.334f, 0.985f, 0.925f, 1.298f, 1.616f)
                lineToRelative(0.456f, 1.008f)
                lineToRelative(0.455f, -1.008f)
                curveToRelative(0.312f, -0.69f, 0.753f, -1.279f, 1.291f, -1.61f)
                curveToRelative(0.39f, -0.238f, 0.776f, -0.531f, 1.131f, -0.86f)
                moveToRelative(-4.63f, 0.854f)
                lineToRelative(0.26f, -0.426f)
                lineToRelative(-0.044f, 0.067f)
                lineToRelative(0.056f, -0.083f)
                close()
                moveTo(11.998f, 9.1f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 10.964f, 8.0f)
                horizontalLineToRelative(2.071f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -1.037f, 1.1f)
                moveToRelative(1.483f, -0.805f)
                lineToRelative(-0.013f, -0.018f)
                lineTo(13.302f, 8.0f)
                close()
            }
        }
        .build()
        return _hourglassSmall!!
    }

private var _hourglassSmall: ImageVector? = null
