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

public val SBBIcons.ArrowDownSmall: ImageVector
    get() {
        if (_arrowDownSmall != null) {
            return _arrowDownSmall!!
        }
        _arrowDownSmall = Builder(name = "ArrowDownSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 16.293f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(11.293f)
                lineToRelative(-3.146f, -3.147f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(4.353f, 4.354f)
                lineToRelative(4.354f, -4.354f)
                lineToRelative(-0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _arrowDownSmall!!
    }

private var _arrowDownSmall: ImageVector? = null
