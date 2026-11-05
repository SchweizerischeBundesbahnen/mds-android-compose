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

public val SBBIcons.WifiLarge: ImageVector
    get() {
        if (_wifiLarge != null) {
            return _wifiLarge!!
        }
        _wifiLarge = Builder(name = "WifiLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 10.0f)
                curveTo(16.437f, 10.0f, 9.63f, 13.184f, 4.8f, 18.268f)
                lineToRelative(-0.725f, -0.688f)
                curveTo(9.086f, 12.307f, 16.15f, 9.0f, 24.0f, 9.0f)
                reflectiveCurveToRelative(14.914f, 3.307f, 19.923f, 8.58f)
                lineToRelative(-0.725f, 0.688f)
                curveTo(38.368f, 13.184f, 31.563f, 10.0f, 24.0f, 10.0f)
                moveTo(9.148f, 22.397f)
                curveTo(12.885f, 18.463f, 18.15f, 16.0f, 24.0f, 16.0f)
                reflectiveCurveToRelative(11.115f, 2.463f, 14.851f, 6.397f)
                lineToRelative(0.725f, -0.69f)
                curveTo(35.66f, 17.586f, 30.138f, 15.0f, 24.0f, 15.0f)
                reflectiveCurveToRelative(-11.66f, 2.585f, -15.577f, 6.708f)
                close()
                moveTo(13.505f, 26.534f)
                curveToRelative(2.643f, -2.784f, 6.368f, -4.527f, 10.506f, -4.527f)
                curveToRelative(4.134f, 0.0f, 7.854f, 1.738f, 10.496f, 4.515f)
                lineToRelative(0.725f, -0.69f)
                curveToRelative(-2.822f, -2.965f, -6.8f, -4.825f, -11.22f, -4.825f)
                curveToRelative(-4.427f, 0.0f, -8.41f, 1.865f, -11.232f, 4.838f)
                close()
                moveTo(17.85f, 30.66f)
                curveTo(19.401f, 29.027f, 21.576f, 28.0f, 24.0f, 28.0f)
                reflectiveCurveToRelative(4.598f, 1.027f, 6.15f, 2.66f)
                lineToRelative(0.724f, -0.689f)
                curveTo(29.146f, 28.151f, 26.714f, 27.0f, 24.0f, 27.0f)
                curveToRelative(-2.715f, 0.0f, -5.146f, 1.152f, -6.875f, 2.971f)
                close()
                moveTo(21.5f, 36.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                moveTo(24.0f, 33.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
            }
        }
        .build()
        return _wifiLarge!!
    }

private var _wifiLarge: ImageVector? = null
