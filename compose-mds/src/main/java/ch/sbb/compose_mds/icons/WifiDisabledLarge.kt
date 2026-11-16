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
                moveToRelative(45.647f, 45.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-43.0f, -43.0f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(9.41f, 9.41f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -7.978f, 5.81f)
                lineToRelative(0.722f, 0.692f)
                arcToRelative(26.9f, 26.9f, 0.0f, false, true, 8.006f, -5.752f)
                lineToRelative(3.796f, 3.796f)
                arcToRelative(21.6f, 21.6f, 0.0f, false, false, -8.176f, 5.397f)
                lineToRelative(0.726f, 0.687f)
                arcToRelative(20.6f, 20.6f, 0.0f, false, true, 8.233f, -5.301f)
                lineToRelative(4.123f, 4.122f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, -8.732f, 4.63f)
                lineToRelative(0.727f, 0.69f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, 8.891f, -4.433f)
                lineToRelative(5.98f, 5.98f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, false, -4.365f, -1.073f)
                horizontalLineToRelative(-0.02f)
                arcToRelative(9.42f, 9.42f, 0.0f, false, false, -6.864f, 2.968f)
                lineToRelative(0.729f, 0.685f)
                lineToRelative(0.009f, -0.01f)
                lineToRelative(0.01f, 0.01f)
                arcTo(8.42f, 8.42f, 0.0f, false, true, 24.0f, 28.009f)
                arcToRelative(8.42f, 8.42f, 0.0f, false, true, 6.126f, 2.653f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(0.417f, -0.392f)
                close()
                moveTo(30.4f, 9.743f)
                arcToRelative(27.5f, 27.5f, 0.0f, false, false, -15.566f, 0.784f)
                lineToRelative(0.332f, 0.943f)
                arcToRelative(26.5f, 26.5f, 0.0f, false, true, 28.001f, 6.763f)
                lineToRelative(0.726f, -0.688f)
                arcTo(27.5f, 27.5f, 0.0f, false, false, 30.4f, 9.744f)
                moveToRelative(2.079f, 7.001f)
                arcTo(21.4f, 21.4f, 0.0f, false, false, 23.999f, 15.0f)
                curveToRelative(-1.408f, 0.0f, -2.814f, 0.138f, -4.196f, 0.41f)
                lineToRelative(0.194f, 0.98f)
                curveToRelative(1.319f, -0.258f, 2.66f, -0.39f, 4.003f, -0.39f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, true, 14.846f, 6.394f)
                lineToRelative(0.728f, -0.687f)
                arcToRelative(21.4f, 21.4f, 0.0f, false, false, -7.095f, -4.962f)
                moveToRelative(-6.836f, 4.348f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, true, 9.59f, 4.744f)
                lineToRelative(-0.726f, 0.687f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, -8.97f, -4.437f)
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
        return _wifiDisabledLarge!!
    }

private var _wifiDisabledLarge: ImageVector? = null
