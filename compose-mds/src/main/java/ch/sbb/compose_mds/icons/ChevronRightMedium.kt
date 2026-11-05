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

public val SBBIcons.ChevronRightMedium: ImageVector
    get() {
        if (_chevronRightMedium != null) {
            return _chevronRightMedium!!
        }
        _chevronRightMedium = Builder(
            name = "ChevronRightMedium",
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
                moveTo(23.293f, 18.0f)
                lineTo(11.647f, 6.353f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(12.0f, 12.0f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-12.0f, 12.0f)
                lineToRelative(-0.707f, -0.707f)
                close()
            }
        }
            .build()
        return _chevronRightMedium!!
    }

private var _chevronRightMedium: ImageVector? = null
