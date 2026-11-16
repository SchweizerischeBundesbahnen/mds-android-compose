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

public val SBBIcons.ArrowUpSmall: ImageVector
    get() {
        if (_arrowUpSmall != null) {
            return _arrowUpSmall!!
        }
        _arrowUpSmall = Builder(name = "ArrowUpSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(15.147f, 9.854f)
                lineToRelative(0.707f, -0.707f)
                lineTo(11.5f, 4.792f)
                lineTo(7.147f, 9.146f)
                lineToRelative(0.707f, 0.708f)
                lineTo(11.0f, 6.707f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(6.707f)
                close()
            }
        }
        .build()
        return _arrowUpSmall!!
    }

private var _arrowUpSmall: ImageVector? = null
