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

public val SBBIcons.ExitSmall: ImageVector
    get() {
        if (_exitSmall != null) {
            return _exitSmall!!
        }
        _exitSmall = Builder(name = "ExitSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 4.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.5f)
                moveToRelative(14.212f, 5.005f)
                lineToRelative(3.142f, 3.141f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-3.142f, 3.15f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(19.295f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.293f)
                lineToRelative(-2.288f, -2.287f)
                close()
            }
        }
        .build()
        return _exitSmall!!
    }

private var _exitSmall: ImageVector? = null
