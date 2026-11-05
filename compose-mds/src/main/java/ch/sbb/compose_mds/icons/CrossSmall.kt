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

public val SBBIcons.CrossSmall: ImageVector
    get() {
        if (_crossSmall != null) {
            return _crossSmall!!
        }
        _crossSmall = Builder(
            name = "CrossSmall",
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
                moveToRelative(12.707f, 12.0f)
                lineToRelative(5.647f, -5.647f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(12.0f, 11.293f)
                lineTo(6.354f, 5.646f)
                lineToRelative(-0.708f, 0.707f)
                lineTo(11.293f, 12.0f)
                lineToRelative(-5.647f, 5.646f)
                lineToRelative(0.708f, 0.707f)
                lineTo(12.0f, 12.707f)
                lineToRelative(5.647f, 5.646f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
            .build()
        return _crossSmall!!
    }

private var _crossSmall: ImageVector? = null
