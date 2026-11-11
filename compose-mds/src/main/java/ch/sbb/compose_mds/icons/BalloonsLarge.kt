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
                moveTo(29.508f, 7.0f)
                curveToRelative(5.162f, 0.004f, 9.494f, 5.063f, 9.494f, 11.5f)
                curveToRelative(0.0f, 6.44f, -4.336f, 11.499f, -9.5f, 11.499f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -3.998f, -1.078f)
                lineToRelative(-0.138f, -0.081f)
                curveTo(22.218f, 26.988f, 20.0f, 23.083f, 20.0f, 18.5f)
                verticalLineToRelative(-0.005f)
                arcToRelative(12.95f, 12.95f, 0.0f, false, true, 2.298f, -7.481f)
                lineToRelative(0.007f, -0.01f)
                lineToRelative(0.008f, -0.012f)
                lineToRelative(0.222f, -0.32f)
                arcTo(8.9f, 8.9f, 0.0f, false, true, 29.508f, 7.0f)
                moveToRelative(-4.244f, 22.93f)
                arcTo(9.9f, 9.9f, 0.0f, false, true, 18.0f, 33.976f)
                verticalLineToRelative(8.047f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-8.037f)
                curveTo(11.36f, 33.675f, 7.0f, 28.121f, 7.0f, 21.5f)
                curveTo(7.0f, 14.686f, 11.62f, 9.0f, 17.5f, 9.0f)
                horizontalLineToRelative(0.003f)
                lineToRelative(0.307f, 0.007f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, 3.926f, 1.063f)
                arcTo(9.9f, 9.9f, 0.0f, false, true, 29.49f, 6.0f)
                horizontalLineToRelative(0.012f)
                curveToRelative(5.88f, 0.0f, 10.5f, 5.686f, 10.5f, 12.5f)
                curveToRelative(0.0f, 6.62f, -4.36f, 12.174f, -10.0f, 12.486f)
                verticalLineToRelative(11.037f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-11.04f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, -3.737f, -1.053f)
                moveToRelative(4.238f, 0.57f)
                lineTo(29.5f, 30.5f)
                verticalLineToRelative(-0.166f)
                close()
                moveTo(8.0f, 21.5f)
                curveToRelative(0.0f, 6.438f, 4.33f, 11.494f, 9.493f, 11.5f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, false, 6.909f, -3.586f)
                curveTo(21.162f, 27.267f, 19.0f, 23.172f, 19.0f, 18.5f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, true, 2.172f, -7.597f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 17.498f, 10.0f)
                curveTo(12.335f, 10.001f, 8.0f, 15.06f, 8.0f, 21.5f)
                moveToRelative(2.988f, -2.39f)
                curveToRelative(0.764f, -3.394f, 3.355f, -5.865f, 6.058f, -6.112f)
                lineToRelative(-0.092f, -0.996f)
                curveToRelative(-3.232f, 0.295f, -6.107f, 3.175f, -6.942f, 6.889f)
                close()
                moveTo(22.989f, 16.11f)
                curveToRelative(0.762f, -3.395f, 3.354f, -5.865f, 6.058f, -6.112f)
                lineToRelative(-0.092f, -0.996f)
                curveToRelative(-3.232f, 0.295f, -6.108f, 3.174f, -6.942f, 6.889f)
                close()
            }
        }
        .build()
        return _balloonsLarge!!
    }

private var _balloonsLarge: ImageVector? = null
