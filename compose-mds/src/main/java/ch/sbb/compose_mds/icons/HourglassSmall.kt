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
                moveTo(5.484f, 3.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 3.043f, 2.064f, 5.632f, 4.218f, 6.932f)
                curveToRelative(0.466f, 0.286f, 0.814f, 0.87f, 0.814f, 1.568f)
                curveToRelative(0.0f, 0.697f, -0.348f, 1.281f, -0.814f, 1.569f)
                curveToRelative(-2.155f, 1.3f, -4.218f, 3.888f, -4.218f, 6.93f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(14.032f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.042f, -2.064f, -5.63f, -4.219f, -6.93f)
                curveToRelative(-0.465f, -0.288f, -0.813f, -0.871f, -0.813f, -1.57f)
                curveToRelative(0.0f, -0.697f, 0.348f, -1.28f, 0.813f, -1.567f)
                curveToRelative(2.155f, -1.3f, 4.22f, -3.89f, 4.22f, -6.932f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.483f)
                moveTo(9.72f, 9.577f)
                curveTo(7.896f, 8.477f, 6.216f, 6.387f, 6.006f, 4.0f)
                horizontalLineToRelative(11.988f)
                curveToRelative(-0.21f, 2.388f, -1.89f, 4.476f, -3.715f, 5.577f)
                lineToRelative(-0.003f, 0.002f)
                curveToRelative(-0.782f, 0.48f, -1.292f, 1.398f, -1.292f, 2.42f)
                curveToRelative(0.0f, 1.024f, 0.51f, 1.942f, 1.291f, 2.423f)
                lineToRelative(0.004f, 0.002f)
                curveToRelative(1.825f, 1.1f, 3.505f, 3.188f, 3.715f, 5.576f)
                horizontalLineTo(6.006f)
                curveToRelative(0.21f, -2.388f, 1.89f, -4.476f, 3.714f, -5.576f)
                lineToRelative(0.004f, -0.002f)
                curveToRelative(0.781f, -0.481f, 1.292f, -1.399f, 1.292f, -2.422f)
                reflectiveCurveToRelative(-0.51f, -1.942f, -1.292f, -2.421f)
                close()
                moveTo(9.464f, 7.0f)
                horizontalLineTo(8.192f)
                lineToRelative(0.931f, 0.866f)
                curveToRelative(0.35f, 0.326f, 0.727f, 0.615f, 1.112f, 0.85f)
                horizontalLineToRelative(0.002f)
                lineToRelative(0.008f, 0.005f)
                curveToRelative(0.542f, 0.334f, 0.986f, 0.925f, 1.298f, 1.616f)
                lineTo(12.0f, 11.345f)
                lineToRelative(0.455f, -1.008f)
                curveToRelative(0.312f, -0.69f, 0.753f, -1.279f, 1.29f, -1.609f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 1.132f, -0.861f)
                lineTo(15.81f, 7.0f)
                horizontalLineTo(9.464f)
                moveToRelative(2.535f, 2.098f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 10.965f, 8.0f)
                horizontalLineToRelative(2.069f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -1.035f, 1.098f)
            }
        }
        .build()
        return _hourglassSmall!!
    }

private var _hourglassSmall: ImageVector? = null
