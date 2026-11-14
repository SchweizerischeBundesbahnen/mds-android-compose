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

public val SBBIcons.WifiDisabledMedium: ImageVector
    get() {
        if (_wifiDisabledMedium != null) {
            return _wifiDisabledMedium!!
        }
        _wifiDisabledMedium = Builder(name = "WifiDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(28.104f, 27.397f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-6.72f, -6.72f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -2.676f, -0.633f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -4.52f, 1.956f)
                lineToRelative(-0.727f, -0.689f)
                arcTo(7.2f, 7.2f, 0.0f, false, true, 18.0f, 19.751f)
                quadToRelative(0.585f, 0.001f, 1.139f, 0.095f)
                lineToRelative(-3.35f, -3.349f)
                arcToRelative(10.74f, 10.74f, 0.0f, false, false, -5.57f, 3.114f)
                lineToRelative(-0.725f, -0.688f)
                arcToRelative(11.73f, 11.73f, 0.0f, false, true, 5.467f, -3.254f)
                lineToRelative(-2.753f, -2.753f)
                curveToRelative(-2.0f, 0.825f, -3.793f, 2.05f, -5.258f, 3.593f)
                lineToRelative(-0.724f, -0.688f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 5.22f, -3.666f)
                lineTo(8.836f, 9.542f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -5.142f, 3.87f)
                lineToRelative(-0.725f, -0.688f)
                arcToRelative(20.8f, 20.8f, 0.0f, false, true, 5.128f, -3.921f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(0.708f, -0.707f)
                close()
                moveTo(19.75f, 27.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.502f, -0.002f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 20.75f, 27.0f)
                moveTo(18.0f, 6.25f)
                curveToRelative(5.924f, 0.0f, 11.253f, 2.496f, 15.032f, 6.474f)
                lineToRelative(-0.724f, 0.688f)
                curveTo(28.708f, 9.622f, 23.636f, 7.25f, 18.0f, 7.25f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, -6.81f, 1.238f)
                lineToRelative(-0.345f, -0.938f)
                curveToRelative(2.23f, -0.825f, 4.632f, -1.3f, 7.155f, -1.3f)
                moveToRelative(11.774f, 9.57f)
                curveToRelative(-2.96f, -3.117f, -7.134f, -5.07f, -11.773f, -5.07f)
                curveToRelative(-1.2f, 0.0f, -2.366f, 0.137f, -3.487f, 0.382f)
                lineToRelative(0.215f, 0.978f)
                arcTo(15.3f, 15.3f, 0.0f, false, true, 18.0f, 11.75f)
                curveToRelative(4.352f, 0.0f, 8.269f, 1.83f, 11.048f, 4.758f)
                close()
                moveTo(26.514f, 18.914f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -7.682f, -3.616f)
                lineToRelative(-0.07f, 0.998f)
                curveToRelative(2.76f, 0.194f, 5.231f, 1.42f, 7.027f, 3.308f)
                close()
            }
        }
        .build()
        return _wifiDisabledMedium!!
    }

private var _wifiDisabledMedium: ImageVector? = null
