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

public val SBBIcons.ArrowsUpDownSmall: ImageVector
    get() {
        if (_arrowsUpDownSmall != null) {
            return _arrowsUpDownSmall!!
        }
        _arrowsUpDownSmall = Builder(name = "ArrowsUpDownSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.0f, 16.031f)
                lineToRelative(2.988f, -3.03f)
                lineToRelative(0.712f, 0.702f)
                lineToRelative(-3.842f, 3.898f)
                lineToRelative(-0.356f, -0.352f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-3.854f, -3.895f)
                lineToRelative(0.71f, -0.703f)
                lineTo(16.0f, 16.03f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.148f, 17.601f)
                lineTo(16.502f, 17.25f)
                lineTo(16.858f, 17.6f)
                lineTo(16.503f, 17.96f)
                close()
                moveTo(11.708f, 9.292f)
                lineTo(7.855f, 5.398f)
                lineToRelative(-0.355f, -0.36f)
                lineToRelative(-0.355f, 0.36f)
                lineTo(3.3f, 9.295f)
                lineToRelative(0.713f, 0.702f)
                lineTo(7.0f, 6.97f)
                lineTo(7.0f, 18.0f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 6.966f)
                lineToRelative(2.997f, 3.03f)
                close()
            }
        }
        .build()
        return _arrowsUpDownSmall!!
    }

private var _arrowsUpDownSmall: ImageVector? = null
