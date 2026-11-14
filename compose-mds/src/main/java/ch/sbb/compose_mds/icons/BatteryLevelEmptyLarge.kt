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

public val SBBIcons.BatteryLevelEmptyLarge: ImageVector
    get() {
        if (_batteryLevelEmptyLarge != null) {
            return _batteryLevelEmptyLarge!!
        }
        _batteryLevelEmptyLarge = Builder(name = "BatteryLevelEmptyLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.953f, 6.33f)
                curveTo(25.428f, 6.12f, 24.738f, 6.0f, 24.0f, 6.0f)
                reflectiveCurveToRelative(-1.428f, 0.12f, -1.953f, 0.33f)
                curveToRelative(-0.261f, 0.105f, -0.506f, 0.24f, -0.694f, 0.418f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, false, -0.312f, 0.48f)
                curveToRelative(-1.282f, 0.191f, -2.434f, 0.497f, -3.304f, 0.89f)
                curveToRelative(-0.477f, 0.215f, -0.895f, 0.467f, -1.2f, 0.762f)
                reflectiveCurveTo(16.0f, 9.552f, 16.0f, 10.0f)
                verticalLineToRelative(30.0f)
                curveToRelative(0.0f, 0.564f, 0.344f, 1.021f, 0.78f, 1.365f)
                curveToRelative(0.442f, 0.349f, 1.051f, 0.641f, 1.76f, 0.877f)
                curveToRelative(1.42f, 0.474f, 3.351f, 0.758f, 5.46f, 0.758f)
                reflectiveCurveToRelative(4.04f, -0.284f, 5.46f, -0.758f)
                curveToRelative(0.709f, -0.236f, 1.317f, -0.528f, 1.76f, -0.877f)
                curveToRelative(0.436f, -0.344f, 0.78f, -0.801f, 0.78f, -1.365f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -0.445f, -0.226f, -0.83f, -0.525f, -1.14f)
                curveToRelative(-0.302f, -0.31f, -0.716f, -0.586f, -1.195f, -0.824f)
                curveToRelative(-0.889f, -0.442f, -2.076f, -0.792f, -3.398f, -0.988f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.236f, -0.3f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.693f, -0.418f)
                moveTo(27.0f, 8.08f)
                verticalLineTo(9.5f)
                curveToRelative(0.0f, 0.32f, -0.165f, 0.574f, -0.354f, 0.752f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.693f, 0.418f)
                curveToRelative(-0.525f, 0.21f, -1.215f, 0.33f, -1.953f, 0.33f)
                reflectiveCurveToRelative(-1.428f, -0.12f, -1.953f, -0.33f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.694f, -0.418f)
                curveTo(21.166f, 10.074f, 21.0f, 9.82f, 21.0f, 9.5f)
                verticalLineTo(8.247f)
                curveToRelative(-1.142f, 0.182f, -2.13f, 0.456f, -2.852f, 0.781f)
                curveToRelative(-0.42f, 0.19f, -0.724f, 0.385f, -0.916f, 0.57f)
                curveToRelative(-0.191f, 0.186f, -0.232f, 0.32f, -0.232f, 0.402f)
                curveToRelative(0.0f, 0.126f, 0.077f, 0.326f, 0.4f, 0.58f)
                curveToRelative(0.317f, 0.25f, 0.806f, 0.496f, 1.456f, 0.713f)
                curveTo(20.15f, 11.724f, 21.969f, 12.0f, 24.0f, 12.0f)
                reflectiveCurveToRelative(3.85f, -0.276f, 5.145f, -0.707f)
                curveToRelative(0.649f, -0.216f, 1.139f, -0.463f, 1.456f, -0.713f)
                curveToRelative(0.322f, -0.254f, 0.399f, -0.454f, 0.399f, -0.58f)
                curveToRelative(0.0f, -0.09f, -0.047f, -0.24f, -0.244f, -0.443f)
                curveToRelative(-0.196f, -0.202f, -0.503f, -0.417f, -0.921f, -0.625f)
                curveToRelative(-0.718f, -0.358f, -1.702f, -0.663f, -2.835f, -0.853f)
                moveToRelative(-4.582f, -0.822f)
                curveTo(22.798f, 7.106f, 23.358f, 7.0f, 24.0f, 7.0f)
                reflectiveCurveToRelative(1.202f, 0.106f, 1.582f, 0.258f)
                curveToRelative(0.191f, 0.076f, 0.313f, 0.156f, 0.378f, 0.218f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.04f, 0.046f)
                verticalLineToRelative(1.955f)
                curveToRelative(-0.005f, 0.007f, -0.015f, 0.024f, -0.04f, 0.047f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.378f, 0.218f)
                curveToRelative(-0.38f, 0.152f, -0.94f, 0.258f, -1.582f, 0.258f)
                reflectiveCurveToRelative(-1.202f, -0.106f, -1.582f, -0.258f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.378f, -0.218f)
                curveToRelative(-0.025f, -0.023f, -0.035f, -0.04f, -0.04f, -0.047f)
                verticalLineTo(7.522f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.04f, -0.046f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.378f, -0.218f)
                moveTo(17.0f, 40.0f)
                verticalLineTo(11.525f)
                curveToRelative(0.416f, 0.279f, 0.942f, 0.518f, 1.54f, 0.717f)
                curveToRelative(1.42f, 0.474f, 3.351f, 0.758f, 5.46f, 0.758f)
                reflectiveCurveToRelative(4.04f, -0.284f, 5.46f, -0.758f)
                curveToRelative(0.598f, -0.199f, 1.124f, -0.438f, 1.54f, -0.717f)
                verticalLineTo(40.0f)
                curveToRelative(0.0f, 0.126f, -0.077f, 0.326f, -0.4f, 0.58f)
                curveToRelative(-0.317f, 0.25f, -0.806f, 0.497f, -1.456f, 0.713f)
                curveTo(27.85f, 41.724f, 26.032f, 42.0f, 24.0f, 42.0f)
                reflectiveCurveToRelative(-3.85f, -0.276f, -5.145f, -0.707f)
                curveToRelative(-0.649f, -0.216f, -1.139f, -0.463f, -1.456f, -0.713f)
                curveToRelative(-0.322f, -0.254f, -0.399f, -0.454f, -0.399f, -0.58f)
            }
        }
        .build()
        return _batteryLevelEmptyLarge!!
    }

private var _batteryLevelEmptyLarge: ImageVector? = null
