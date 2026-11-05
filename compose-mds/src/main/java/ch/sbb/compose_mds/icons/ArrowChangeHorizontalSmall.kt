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

public val SBBIcons.ArrowChangeHorizontalSmall: ImageVector
    get() {
        if (_arrowChangeHorizontalSmall != null) {
            return _arrowChangeHorizontalSmall!!
        }
        _arrowChangeHorizontalSmall = Builder(name = "ArrowChangeHorizontalSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(16.354f, 2.647f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(18.293f, 7.0f)
                horizontalLineTo(7.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                horizontalLineToRelative(9.001f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 7.0f)
                horizontalLineTo(5.708f)
                lineToRelative(2.646f, 2.646f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(0.707f, 0.707f)
                lineTo(5.707f, 18.0f)
                horizontalLineTo(16.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                horizontalLineToRelative(10.792f)
                lineToRelative(-2.646f, -2.646f)
                close()
            }
        }
        .build()
        return _arrowChangeHorizontalSmall!!
    }

private var _arrowChangeHorizontalSmall: ImageVector? = null
