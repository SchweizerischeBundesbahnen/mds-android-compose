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
                moveTo(18.139f, 6.793f)
                curveToRelative(-0.61f, 0.58f, -1.025f, 1.412f, -1.119f, 2.487f)
                curveToRelative(2.573f, 0.3f, 4.48f, 2.812f, 4.48f, 5.72f)
                quadToRelative(0.0f, 0.107f, -0.003f, 0.214f)
                curveTo(23.463f, 14.926f, 25.0f, 12.954f, 25.0f, 10.5f)
                curveToRelative(0.0f, -2.658f, -1.803f, -4.75f, -4.0f, -4.75f)
                curveToRelative(-1.167f, 0.0f, -2.162f, 0.376f, -2.861f, 1.043f)
                moveToRelative(-0.69f, -0.724f)
                curveToRelative(-0.822f, 0.783f, -1.334f, 1.877f, -1.432f, 3.207f)
                curveToRelative(-2.59f, 0.28f, -4.517f, 2.802f, -4.517f, 5.724f)
                curveToRelative(0.0f, 1.451f, 0.475f, 2.803f, 1.271f, 3.832f)
                curveToRelative(-4.198f, 1.992f, -6.52f, 7.091f, -6.52f, 11.917f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.338f, -0.181f, -2.695f, -0.532f, -4.0f)
                horizontalLineToRelative(5.031f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.832f, -2.406f, -9.829f, -6.596f, -11.813f)
                curveTo(25.502f, 13.387f, 26.0f, 11.983f, 26.0f, 10.5f)
                curveToRelative(0.0f, -3.043f, -2.097f, -5.75f, -5.0f, -5.75f)
                curveToRelative(-1.382f, 0.0f, -2.638f, 0.448f, -3.551f, 1.319f)
                moveToRelative(6.454f, 9.127f)
                arcToRelative(4.54f, 4.54f, 0.0f, false, true, -2.52f, 1.038f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -1.18f, 2.631f)
                curveToRelative(2.731f, 1.295f, 4.682f, 3.895f, 5.71f, 6.885f)
                horizontalLineToRelative(4.328f)
                curveToRelative(-0.164f, -4.534f, -2.544f, -8.952f, -6.338f, -10.554f)
                moveTo(16.5f, 10.25f)
                curveToRelative(-2.14f, 0.0f, -4.0f, 2.051f, -4.0f, 4.75f)
                reflectiveCurveToRelative(1.86f, 4.75f, 4.0f, 4.75f)
                reflectiveCurveToRelative(4.0f, -2.052f, 4.0f, -4.75f)
                reflectiveCurveToRelative(-1.86f, -4.75f, -4.0f, -4.75f)
                moveToRelative(-3.003f, 9.352f)
                curveToRelative(-3.777f, 1.607f, -6.08f, 6.102f, -6.238f, 10.647f)
                horizontalLineToRelative(18.483f)
                curveToRelative(-0.16f, -4.54f, -2.492f, -9.012f, -6.274f, -10.617f)
                curveToRelative(-0.822f, 0.699f, -1.842f, 1.118f, -2.968f, 1.118f)
                curveToRelative(-1.141f, 0.0f, -2.175f, -0.431f, -3.003f, -1.148f)
            }
        }
        .build()
        return _twoUsersMedium!!
    }

private var _twoUsersMedium: ImageVector? = null
