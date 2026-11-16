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

public val SBBIcons.ArrowDownMedium: ImageVector
    get() {
        if (_arrowDownMedium != null) {
            return _arrowDownMedium!!
        }
        _arrowDownMedium = Builder(name = "ArrowDownMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.75f, 25.043f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(17.543f)
                lineToRelative(-5.146f, -5.147f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(6.353f, 6.354f)
                lineToRelative(6.354f, -6.354f)
                lineToRelative(-0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _arrowDownMedium!!
    }

private var _arrowDownMedium: ImageVector? = null
