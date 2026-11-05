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

public val SBBIcons.ArrowChangeSmall: ImageVector
    get() {
        if (_arrowChangeSmall != null) {
            return _arrowChangeSmall!!
        }
        _arrowChangeSmall = Builder(name = "ArrowChangeSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(2.65f, 7.65f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(7.003f, 5.71f)
                verticalLineToRelative(10.793f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                verticalLineTo(7.502f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                verticalLineToRelative(10.793f)
                lineToRelative(2.646f, -2.646f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(2.646f, 2.647f)
                verticalLineTo(7.502f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                verticalLineTo(5.71f)
                lineTo(3.357f, 8.356f)
                close()
            }
        }
        .build()
        return _arrowChangeSmall!!
    }

private var _arrowChangeSmall: ImageVector? = null
