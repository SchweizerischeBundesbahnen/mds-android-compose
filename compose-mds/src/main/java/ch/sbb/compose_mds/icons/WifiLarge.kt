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
                moveTo(24.0f, 9.0f)
                curveToRelative(7.85f, 0.0f, 14.914f, 3.307f, 19.923f, 8.58f)
                lineToRelative(-0.725f, 0.689f)
                curveTo(38.368f, 13.184f, 31.562f, 10.0f, 24.0f, 10.0f)
                curveToRelative(-7.562f, 0.0f, -14.368f, 3.184f, -19.198f, 8.269f)
                lineToRelative(-0.725f, -0.689f)
                curveTo(9.086f, 12.307f, 16.15f, 9.0f, 24.0f, 9.0f)
                moveToRelative(15.576f, 12.708f)
                curveTo(35.66f, 17.586f, 30.138f, 15.0f, 24.0f, 15.0f)
                reflectiveCurveToRelative(-11.66f, 2.586f, -15.576f, 6.708f)
                lineToRelative(0.724f, 0.689f)
                curveTo(12.885f, 18.463f, 18.15f, 16.0f, 24.0f, 16.0f)
                reflectiveCurveToRelative(11.115f, 2.463f, 14.851f, 6.397f)
                close()
                moveTo(35.232f, 25.832f)
                curveToRelative(-2.822f, -2.965f, -6.8f, -4.825f, -11.22f, -4.825f)
                curveToRelative(-4.427f, 0.0f, -8.41f, 1.865f, -11.232f, 4.838f)
                lineToRelative(0.725f, 0.688f)
                curveToRelative(2.643f, -2.783f, 6.368f, -4.526f, 10.506f, -4.526f)
                curveToRelative(4.134f, 0.0f, 7.854f, 1.738f, 10.497f, 4.515f)
                close()
                moveTo(30.874f, 29.972f)
                curveTo(29.146f, 28.152f, 26.714f, 27.0f, 24.0f, 27.0f)
                reflectiveCurveToRelative(-5.146f, 1.152f, -6.875f, 2.972f)
                lineToRelative(0.725f, 0.688f)
                curveTo(19.4f, 29.027f, 21.576f, 28.0f, 24.0f, 28.0f)
                reflectiveCurveToRelative(4.598f, 1.027f, 6.15f, 2.66f)
                close()
                moveTo(24.0f, 34.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(0.0f, 6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
            }
        }
        .build()
        return _wifiLarge!!
    }

private var _wifiLarge: ImageVector? = null
