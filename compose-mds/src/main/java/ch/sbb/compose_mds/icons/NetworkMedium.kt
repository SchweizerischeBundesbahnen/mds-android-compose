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

public val SBBIcons.NetworkMedium: ImageVector
    get() {
        if (_networkMedium != null) {
            return _networkMedium!!
        }
        _networkMedium = Builder(name = "NetworkMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.25f, 6.0f)
                curveToRelative(0.0f, -0.999f, 0.751f, -1.75f, 1.75f, -1.75f)
                reflectiveCurveToRelative(1.75f, 0.751f, 1.75f, 1.75f)
                reflectiveCurveTo(9.999f, 7.75f, 9.0f, 7.75f)
                reflectiveCurveTo(7.25f, 6.999f, 7.25f, 6.0f)
                moveTo(9.0f, 3.25f)
                curveTo(7.449f, 3.25f, 6.25f, 4.449f, 6.25f, 6.0f)
                reflectiveCurveTo(7.449f, 8.75f, 9.0f, 8.75f)
                curveToRelative(0.492f, 0.0f, 0.949f, -0.12f, 1.343f, -0.335f)
                lineToRelative(3.836f, 5.27f)
                arcTo(5.72f, 5.72f, 0.0f, false, false, 12.25f, 18.0f)
                curveToRelative(0.0f, 1.435f, 0.509f, 2.736f, 1.358f, 3.737f)
                lineToRelative(-3.263f, 3.183f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, -2.095f, -0.67f)
                curveToRelative(-1.969f, 0.0f, -3.5f, 1.527f, -3.5f, 3.497f)
                reflectiveCurveToRelative(1.53f, 3.503f, 3.5f, 3.503f)
                reflectiveCurveToRelative(3.509f, -1.53f, 3.509f, -3.503f)
                curveToRelative(0.0f, -0.809f, -0.26f, -1.543f, -0.7f, -2.127f)
                lineToRelative(3.261f, -3.18f)
                arcTo(5.74f, 5.74f, 0.0f, false, false, 18.0f, 23.75f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, false, 4.994f, -2.87f)
                lineToRelative(2.9f, 1.343f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -0.144f, 1.027f)
                curveToRelative(0.0f, 1.98f, 1.52f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.52f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.52f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.255f, 0.0f, -2.326f, 0.61f, -2.941f, 1.563f)
                lineToRelative(-2.897f, -1.341f)
                curveToRelative(0.22f, -0.613f, 0.34f, -1.277f, 0.34f, -1.972f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, false, -0.83f, -3.0f)
                lineToRelative(3.637f, -2.534f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, false, 1.94f, 0.784f)
                curveToRelative(1.538f, 0.0f, 2.766f, -1.203f, 2.766f, -2.75f)
                arcTo(2.74f, 2.74f, 0.0f, false, false, 28.5f, 7.742f)
                arcToRelative(2.727f, 2.727f, 0.0f, false, false, -2.75f, 2.758f)
                curveToRelative(0.0f, 0.41f, 0.085f, 0.797f, 0.24f, 1.144f)
                lineToRelative(-3.66f, 2.549f)
                arcTo(5.73f, 5.73f, 0.0f, false, false, 18.0f, 12.256f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -3.016f, 0.836f)
                lineTo(11.118f, 7.78f)
                arcTo(2.76f, 2.76f, 0.0f, false, false, 11.75f, 6.0f)
                curveToRelative(0.0f, -1.551f, -1.199f, -2.75f, -2.75f, -2.75f)
                moveToRelative(19.5f, 5.492f)
                curveToRelative(-0.988f, 0.0f, -1.75f, 0.766f, -1.75f, 1.758f)
                curveToRelative(0.0f, 0.99f, 0.76f, 1.75f, 1.75f, 1.75f)
                curveToRelative(0.994f, 0.0f, 1.765f, -0.764f, 1.765f, -1.75f)
                arcTo(1.74f, 1.74f, 0.0f, false, false, 28.5f, 8.742f)
                moveTo(18.0f, 13.256f)
                curveToRelative(-2.656f, 0.0f, -4.75f, 2.09f, -4.75f, 4.744f)
                arcTo(4.71f, 4.71f, 0.0f, false, false, 18.0f, 22.75f)
                arcTo(4.71f, 4.71f, 0.0f, false, false, 22.752f, 18.0f)
                curveToRelative(0.0f, -2.654f, -2.096f, -4.744f, -4.752f, -4.744f)
                moveToRelative(8.75f, 9.994f)
                curveToRelative(0.0f, -1.428f, 1.072f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.072f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.072f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.072f, -2.5f, -2.5f)
                moveToRelative(-18.5f, 2.0f)
                curveToRelative(-1.418f, 0.0f, -2.5f, 1.08f, -2.5f, 2.497f)
                curveToRelative(0.0f, 1.42f, 1.083f, 2.503f, 2.5f, 2.503f)
                curveToRelative(1.42f, 0.0f, 2.509f, -1.085f, 2.509f, -2.503f)
                curveToRelative(0.0f, -1.415f, -1.088f, -2.497f, -2.509f, -2.497f)
            }
        }
        .build()
        return _networkMedium!!
    }

private var _networkMedium: ImageVector? = null
