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

public val SBBIcons.WifiDisabledLarge: ImageVector
    get() {
        if (_wifiDisabledLarge != null) {
            return _wifiDisabledLarge!!
        }
        _wifiDisabledLarge = Builder(name = "WifiDisabledLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(2.646f, 2.354f)
                lineToRelative(9.41f, 9.41f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -7.977f, 5.81f)
                lineToRelative(0.722f, 0.692f)
                arcToRelative(26.9f, 26.9f, 0.0f, false, true, 8.006f, -5.752f)
                lineToRelative(3.796f, 3.796f)
                arcToRelative(21.6f, 21.6f, 0.0f, false, false, -8.176f, 5.396f)
                lineToRelative(0.726f, 0.688f)
                arcToRelative(20.6f, 20.6f, 0.0f, false, true, 8.233f, -5.301f)
                lineToRelative(4.123f, 4.123f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, -8.732f, 4.63f)
                lineToRelative(0.726f, 0.688f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, 8.892f, -4.432f)
                lineToRelative(5.978f, 5.978f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, false, -4.363f, -1.071f)
                horizontalLineToRelative(-0.02f)
                arcToRelative(9.42f, 9.42f, 0.0f, false, false, -6.864f, 2.969f)
                lineToRelative(0.729f, 0.684f)
                lineToRelative(0.009f, -0.01f)
                lineToRelative(0.01f, 0.01f)
                arcTo(8.42f, 8.42f, 0.0f, false, true, 24.0f, 28.01f)
                arcToRelative(8.42f, 8.42f, 0.0f, false, true, 6.126f, 2.653f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(0.417f, -0.392f)
                lineToRelative(15.084f, 15.084f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(-43.0f, -43.0f)
                close()
                moveTo(15.166f, 11.472f)
                arcToRelative(26.5f, 26.5f, 0.0f, false, true, 28.001f, 6.762f)
                lineToRelative(0.726f, -0.688f)
                arcToRelative(27.5f, 27.5f, 0.0f, false, false, -29.059f, -7.018f)
                close()
                moveTo(24.0f, 16.0f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, true, 14.846f, 6.393f)
                lineToRelative(0.728f, -0.686f)
                arcTo(21.4f, 21.4f, 0.0f, false, false, 24.0f, 15.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -4.196f, 0.41f)
                lineToRelative(0.192f, 0.98f)
                curveToRelative(1.32f, -0.258f, 2.66f, -0.39f, 4.004f, -0.39f)
                moveToRelative(1.642f, 5.093f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, true, 9.591f, 4.744f)
                lineToRelative(-0.727f, 0.686f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, -8.968f, -4.436f)
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
        return _wifiDisabledLarge!!
    }

private var _wifiDisabledLarge: ImageVector? = null
