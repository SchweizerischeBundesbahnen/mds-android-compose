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

public val SBBIcons.BalloonsMedium: ImageVector
    get() {
        if (_balloonsMedium != null) {
            return _balloonsMedium!!
        }
        _balloonsMedium = Builder(name = "BalloonsMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.25f, 13.5f)
                curveToRelative(0.0f, -2.592f, 0.809f, -4.92f, 2.093f, -6.59f)
                reflectiveCurveToRelative(3.023f, -2.66f, 4.907f, -2.66f)
                reflectiveCurveToRelative(3.623f, 0.991f, 4.907f, 2.66f)
                reflectiveCurveToRelative(2.093f, 3.998f, 2.093f, 6.59f)
                reflectiveCurveToRelative(-0.809f, 4.92f, -2.093f, 6.59f)
                reflectiveCurveToRelative(-3.023f, 2.66f, -4.907f, 2.66f)
                reflectiveCurveToRelative(-3.623f, -0.991f, -4.907f, -2.66f)
                reflectiveCurveToRelative(-2.093f, -3.998f, -2.093f, -6.59f)
                moveToRelative(7.0f, -10.25f)
                curveToRelative(-2.258f, 0.0f, -4.27f, 1.191f, -5.7f, 3.05f)
                quadToRelative(-0.461f, 0.6f, -0.84f, 1.289f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, -3.953f, -1.339f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-2.257f, 0.0f, -4.268f, 1.191f, -5.699f, 3.05f)
                curveToRelative(-1.43f, 1.86f, -2.301f, 4.407f, -2.301f, 7.2f)
                reflectiveCurveToRelative(0.87f, 5.34f, 2.301f, 7.2f)
                curveToRelative(1.324f, 1.72f, 3.146f, 2.869f, 5.199f, 3.03f)
                lineTo(12.25f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.294f)
                arcToRelative(7.85f, 7.85f, 0.0f, false, false, 6.064f, -4.276f)
                curveToRelative(1.019f, 0.737f, 2.184f, 1.202f, 3.436f, 1.3f)
                lineTo(22.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-9.27f)
                curveToRelative(2.054f, -0.161f, 3.876f, -1.31f, 5.2f, -3.03f)
                curveToRelative(1.43f, -1.86f, 2.3f, -4.407f, 2.3f, -7.2f)
                reflectiveCurveToRelative(-0.87f, -5.34f, -2.3f, -7.2f)
                curveToRelative(-1.43f, -1.859f, -3.442f, -3.05f, -5.7f, -3.05f)
                moveToRelative(-4.73f, 18.523f)
                arcToRelative(6.85f, 6.85f, 0.0f, false, true, -5.785f, 3.977f)
                curveToRelative(-1.877f, -0.005f, -3.61f, -0.996f, -4.891f, -2.66f)
                curveToRelative(-1.285f, -1.67f, -2.094f, -3.998f, -2.094f, -6.59f)
                reflectiveCurveToRelative(0.81f, -4.92f, 2.094f, -6.59f)
                curveToRelative(1.283f, -1.668f, 3.021f, -2.659f, 4.902f, -2.66f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 3.514f, 1.254f)
                curveToRelative(-0.645f, 1.482f, -1.01f, 3.188f, -1.01f, 4.996f)
                curveToRelative(0.0f, 2.793f, 0.87f, 5.34f, 2.3f, 7.2f)
                quadToRelative(0.45f, 0.583f, 0.97f, 1.073f)
                moveToRelative(-0.144f, -9.849f)
                curveToRelative(0.419f, -2.73f, 1.919f, -5.03f, 4.0f, -5.568f)
                lineToRelative(0.25f, 0.968f)
                curveToRelative(-1.52f, 0.393f, -2.87f, 2.203f, -3.262f, 4.752f)
                close()
                moveTo(11.879f, 9.384f)
                curveToRelative(-2.083f, 0.522f, -3.584f, 2.809f, -4.003f, 5.54f)
                lineToRelative(0.988f, 0.152f)
                curveToRelative(0.391f, -2.549f, 1.74f, -4.342f, 3.257f, -4.72f)
                close()
            }
        }
        .build()
        return _balloonsMedium!!
    }

private var _balloonsMedium: ImageVector? = null
