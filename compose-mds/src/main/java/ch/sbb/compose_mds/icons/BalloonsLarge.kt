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

public val SBBIcons.BalloonsLarge: ImageVector
    get() {
        if (_balloonsLarge != null) {
            return _balloonsLarge!!
        }
        _balloonsLarge = Builder(name = "BalloonsLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.501f, 6.0f)
                horizontalLineToRelative(-0.013f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, false, -7.751f, 4.07f)
                arcTo(9.1f, 9.1f, 0.0f, false, false, 17.503f, 9.0f)
                lineTo(17.5f, 9.0f)
                curveTo(11.62f, 9.0f, 7.0f, 14.686f, 7.0f, 21.5f)
                curveToRelative(0.0f, 6.62f, 4.36f, 12.175f, 10.0f, 12.486f)
                verticalLineToRelative(8.036f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-8.046f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, false, 7.264f, -4.045f)
                arcTo(9.1f, 9.1f, 0.0f, false, false, 29.0f, 30.983f)
                verticalLineToRelative(11.04f)
                horizontalLineToRelative(1.0f)
                lineTo(30.0f, 30.985f)
                curveToRelative(5.64f, -0.312f, 10.0f, -5.867f, 10.0f, -12.486f)
                curveToRelative(0.0f, -6.814f, -4.62f, -12.5f, -10.5f, -12.5f)
                moveToRelative(-4.097f, 22.863f)
                lineToRelative(-0.034f, -0.021f)
                lineToRelative(-0.004f, -0.002f)
                curveTo(22.218f, 26.99f, 20.0f, 23.083f, 20.0f, 18.5f)
                verticalLineToRelative(-0.004f)
                arcToRelative(12.95f, 12.95f, 0.0f, false, true, 2.299f, -7.482f)
                lineToRelative(0.238f, -0.345f)
                arcTo(8.9f, 8.9f, 0.0f, false, true, 29.507f, 7.0f)
                curveToRelative(5.162f, 0.005f, 9.494f, 5.063f, 9.494f, 11.5f)
                curveToRelative(0.0f, 6.44f, -4.335f, 11.5f, -9.499f, 11.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -4.043f, -1.104f)
                close()
                moveTo(17.5f, 10.0f)
                curveTo(12.334f, 10.001f, 8.0f, 15.06f, 8.0f, 21.5f)
                curveToRelative(0.0f, 6.439f, 4.332f, 11.496f, 9.494f, 11.5f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, false, 6.907f, -3.584f)
                curveToRelative(-3.24f, -2.147f, -5.4f, -6.242f, -5.4f, -10.914f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, true, 2.172f, -7.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 17.499f, 10.0f)
                moveToRelative(-0.544f, 2.002f)
                curveToRelative(-3.233f, 0.295f, -6.108f, 3.175f, -6.943f, 6.888f)
                lineToRelative(0.976f, 0.22f)
                curveToRelative(0.763f, -3.394f, 3.354f, -5.865f, 6.058f, -6.112f)
                close()
                moveTo(28.955f, 9.002f)
                curveToRelative(-3.232f, 0.295f, -6.108f, 3.173f, -6.942f, 6.889f)
                lineToRelative(0.976f, 0.219f)
                curveToRelative(0.762f, -3.395f, 3.354f, -5.865f, 6.057f, -6.112f)
                close()
            }
        }
        .build()
        return _balloonsLarge!!
    }

private var _balloonsLarge: ImageVector? = null
