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

public val SBBIcons.TwoLinesDiagonalSmall: ImageVector
    get() {
        if (_twoLinesDiagonalSmall != null) {
            return _twoLinesDiagonalSmall!!
        }
        _twoLinesDiagonalSmall = Builder(
            name = "TwoLinesDiagonalSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveToRelative(14.647f, 9.146f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(6.0f, -6.0f)
                close()
                moveTo(14.647f, 13.146f)
                lineTo(12.647f, 15.146f)
                lineTo(13.354f, 15.854f)
                lineTo(15.354f, 13.854f)
                close()
            }
        }
            .build()
        return _twoLinesDiagonalSmall!!
    }

private var _twoLinesDiagonalSmall: ImageVector? = null
