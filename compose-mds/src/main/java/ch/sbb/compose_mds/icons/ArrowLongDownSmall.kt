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

public val SBBIcons.ArrowLongDownSmall: ImageVector
    get() {
        if (_arrowLongDownSmall != null) {
            return _arrowLongDownSmall!!
        }
        _arrowLongDownSmall = Builder(name = "ArrowLongDownSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.859f, 19.844f)
                lineTo(15.0f, 16.702f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-2.288f, 2.288f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(14.285f)
                lineToRelative(-2.295f, -2.29f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(3.15f, 3.142f)
                lineToRelative(0.353f, 0.352f)
                close()
            }
        }
        .build()
        return _arrowLongDownSmall!!
    }

private var _arrowLongDownSmall: ImageVector? = null
