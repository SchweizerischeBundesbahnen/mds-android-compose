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

public val SBBIcons.CircleTriangleSquareSmall: ImageVector
    get() {
        if (_circleTriangleSquareSmall != null) {
            return _circleTriangleSquareSmall!!
        }
        _circleTriangleSquareSmall = Builder(name = "CircleTriangleSquareSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveTo(2.0f, 6.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -9.0f, 0.0f)
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(13.0f, 5.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                lineTo(21.0f, 6.0f)
                close()
                moveTo(9.929f, 13.743f)
                lineTo(9.5f, 13.028f)
                lineTo(9.071f, 13.743f)
                lineTo(4.571f, 21.243f)
                lineTo(4.117f, 22.0f)
                horizontalLineToRelative(10.766f)
                lineToRelative(-0.454f, -0.757f)
                close()
                moveTo(9.5f, 14.972f)
                lineTo(13.117f, 21.0f)
                lineTo(5.883f, 21.0f)
                close()
            }
        }
        .build()
        return _circleTriangleSquareSmall!!
    }

private var _circleTriangleSquareSmall: ImageVector? = null
