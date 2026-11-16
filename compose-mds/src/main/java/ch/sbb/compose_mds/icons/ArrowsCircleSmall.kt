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
                moveTo(16.669f, 5.605f)
                curveToRelative(-1.407f, -0.955f, -3.063f, -1.588f, -4.645f, -1.591f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.014f, 7.985f)
                lineToRelative(1.0f, 0.002f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.013f, -6.987f)
                curveToRelative(1.33f, 0.002f, 2.793f, 0.542f, 4.084f, 1.419f)
                curveToRelative(1.038f, 0.704f, 1.933f, 1.605f, 2.54f, 2.567f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.99f)
                verticalLineToRelative(-0.499f)
                lineToRelative(0.01f, -4.49f)
                lineToRelative(-1.0f, -0.002f)
                lineToRelative(-0.006f, 2.75f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, false, -2.325f, -2.154f)
                moveToRelative(-11.41f, 9.402f)
                lineTo(9.001f, 15.0f)
                lineToRelative(-0.002f, -1.0f)
                lineToRelative(-4.49f, 0.01f)
                horizontalLineTo(4.01f)
                lineToRelative(-0.001f, 0.498f)
                lineToRelative(-0.01f, 4.49f)
                lineToRelative(1.0f, 0.003f)
                lineToRelative(0.005f, -2.502f)
                curveTo(6.565f, 18.626f, 9.27f, 20.0f, 12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -7.0f, 7.0f)
                curveToRelative(-2.816f, 0.0f, -5.564f, -1.653f, -6.74f, -3.993f)
            }
        }
        .build()
        return _arrowsCircleSmall!!
    }

private var _arrowsCircleSmall: ImageVector? = null
