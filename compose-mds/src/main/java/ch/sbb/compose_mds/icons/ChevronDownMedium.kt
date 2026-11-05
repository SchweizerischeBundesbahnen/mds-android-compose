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

public val SBBIcons.ChevronDownMedium: ImageVector
    get() {
        if (_chevronDownMedium != null) {
            return _chevronDownMedium!!
        }
        _chevronDownMedium = Builder(
            name = "ChevronDownMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveToRelative(18.0f, 23.293f)
                lineToRelative(11.647f, -11.646f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-12.0f, 12.0f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-12.0f, -12.0f)
                lineToRelative(0.708f, -0.707f)
                close()
            }
        }
            .build()
        return _chevronDownMedium!!
    }

private var _chevronDownMedium: ImageVector? = null
