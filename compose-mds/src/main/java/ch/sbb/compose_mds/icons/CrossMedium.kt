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

public val SBBIcons.CrossMedium: ImageVector
    get() {
        if (_crossMedium != null) {
            return _crossMedium!!
        }
        _crossMedium = Builder(
            name = "CrossMedium",
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
                moveToRelative(18.707f, 18.0f)
                lineToRelative(8.647f, -8.647f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(18.0f, 17.293f)
                lineTo(9.354f, 8.646f)
                lineToRelative(-0.708f, 0.707f)
                lineTo(17.293f, 18.0f)
                lineToRelative(-8.647f, 8.646f)
                lineToRelative(0.708f, 0.707f)
                lineTo(18.0f, 18.707f)
                lineToRelative(8.647f, 8.646f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
            .build()
        return _crossMedium!!
    }

private var _crossMedium: ImageVector? = null
