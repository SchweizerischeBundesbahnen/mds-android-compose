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

public val SBBIcons.ArrowsCircleSmall: ImageVector
    get() {
        if (_arrowsCircleSmall != null) {
            return _arrowsCircleSmall!!
        }
        _arrowsCircleSmall = Builder(name = "ArrowsCircleSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.01f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.013f, -6.986f)
                curveToRelative(1.33f, 0.002f, 2.793f, 0.542f, 4.084f, 1.419f)
                curveToRelative(1.038f, 0.704f, 1.934f, 1.605f, 2.54f, 2.567f)
                lineTo(15.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.989f)
                lineToRelative(0.001f, -0.499f)
                lineToRelative(0.01f, -4.49f)
                lineToRelative(-1.0f, -0.002f)
                lineToRelative(-0.006f, 2.75f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, false, -2.325f, -2.154f)
                curveToRelative(-1.407f, -0.955f, -3.062f, -1.588f, -4.644f, -1.591f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.015f, 7.985f)
                close()
                moveTo(5.26f, 15.008f)
                lineTo(9.0f, 15.0f)
                lineTo(9.0f, 14.0f)
                lineToRelative(-4.49f, 0.01f)
                lineTo(4.01f, 14.01f)
                lineToRelative(-0.001f, 0.499f)
                lineToRelative(-0.01f, 4.49f)
                lineTo(5.0f, 19.0f)
                lineToRelative(0.006f, -2.501f)
                curveTo(6.566f, 18.626f, 9.27f, 20.0f, 12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -7.0f, 7.0f)
                curveToRelative(-2.816f, 0.0f, -5.564f, -1.652f, -6.74f, -3.992f)
            }
        }
        .build()
        return _arrowsCircleSmall!!
    }

private var _arrowsCircleSmall: ImageVector? = null
