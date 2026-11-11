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

public val SBBIcons.TwoUsersMedium: ImageVector
    get() {
        if (_twoUsersMedium != null) {
            return _twoUsersMedium!!
        }
        _twoUsersMedium = Builder(name = "TwoUsersMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.0f, 10.5f)
                curveToRelative(0.0f, -2.658f, -1.803f, -4.75f, -4.0f, -4.75f)
                curveToRelative(-1.167f, 0.0f, -2.162f, 0.376f, -2.861f, 1.043f)
                curveToRelative(-0.61f, 0.58f, -1.025f, 1.411f, -1.119f, 2.487f)
                curveToRelative(2.573f, 0.3f, 4.48f, 2.812f, 4.48f, 5.72f)
                quadToRelative(0.0f, 0.107f, -0.003f, 0.214f)
                curveTo(23.463f, 14.926f, 25.0f, 12.954f, 25.0f, 10.5f)
                moveToRelative(-7.552f, -4.431f)
                curveToRelative(-0.821f, 0.783f, -1.333f, 1.877f, -1.43f, 3.207f)
                curveToRelative(-2.592f, 0.28f, -4.518f, 2.802f, -4.518f, 5.724f)
                curveToRelative(0.0f, 1.45f, 0.475f, 2.803f, 1.271f, 3.831f)
                curveToRelative(-4.198f, 1.993f, -6.52f, 7.093f, -6.52f, 11.919f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.339f, -0.181f, -2.695f, -0.532f, -4.0f)
                horizontalLineToRelative(5.03f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.832f, -2.405f, -9.83f, -6.595f, -11.814f)
                curveTo(25.502f, 13.386f, 26.0f, 11.983f, 26.0f, 10.5f)
                curveToRelative(0.0f, -3.043f, -2.097f, -5.75f, -5.0f, -5.75f)
                curveToRelative(-1.382f, 0.0f, -2.638f, 0.448f, -3.552f, 1.319f)
                moveToRelative(6.455f, 9.127f)
                arcToRelative(4.54f, 4.54f, 0.0f, false, true, -2.52f, 1.038f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -1.18f, 2.632f)
                curveToRelative(2.731f, 1.295f, 4.681f, 3.895f, 5.71f, 6.884f)
                horizontalLineToRelative(4.328f)
                curveToRelative(-0.164f, -4.533f, -2.545f, -8.952f, -6.338f, -10.554f)
                moveTo(20.5f, 15.0f)
                curveToRelative(0.0f, -2.699f, -1.86f, -4.75f, -4.0f, -4.75f)
                reflectiveCurveToRelative(-4.0f, 2.051f, -4.0f, 4.75f)
                reflectiveCurveToRelative(1.86f, 4.75f, 4.0f, 4.75f)
                reflectiveCurveToRelative(4.0f, -2.052f, 4.0f, -4.75f)
                moveToRelative(-7.002f, 4.602f)
                curveToRelative(-3.778f, 1.607f, -6.08f, 6.102f, -6.239f, 10.648f)
                horizontalLineToRelative(18.483f)
                curveToRelative(-0.16f, -4.541f, -2.492f, -9.013f, -6.274f, -10.618f)
                curveToRelative(-0.822f, 0.699f, -1.842f, 1.118f, -2.968f, 1.118f)
                curveToRelative(-1.141f, 0.0f, -2.175f, -0.431f, -3.002f, -1.148f)
            }
        }
        .build()
        return _twoUsersMedium!!
    }

private var _twoUsersMedium: ImageVector? = null
