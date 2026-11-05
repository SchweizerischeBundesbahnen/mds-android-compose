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

public val SBBIcons.ArrowUpMedium: ImageVector
    get() {
        if (_arrowUpMedium != null) {
            return _arrowUpMedium!!
        }
        _arrowUpMedium = Builder(
            name = "ArrowUpMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveToRelative(17.604f, 7.896f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(5.146f, -5.146f)
                verticalLineTo(27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.457f)
                lineToRelative(5.147f, 5.147f)
                lineToRelative(0.707f, -0.708f)
                close()
            }
        }
            .build()
        return _arrowUpMedium!!
    }

private var _arrowUpMedium: ImageVector? = null
