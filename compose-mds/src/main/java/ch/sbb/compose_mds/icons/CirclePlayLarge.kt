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

public val SBBIcons.CirclePlayLarge: ImageVector
    get() {
        if (_circlePlayLarge != null) {
            return _circlePlayLarge!!
        }
        _circlePlayLarge = Builder(name = "CirclePlayLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.5f, 3.0f)
                curveTo(34.822f, 3.0f, 44.0f, 12.178f, 44.0f, 23.5f)
                reflectiveCurveTo(34.822f, 44.0f, 23.5f, 44.0f)
                reflectiveCurveTo(3.0f, 34.822f, 3.0f, 23.5f)
                reflectiveCurveTo(12.178f, 3.0f, 23.5f, 3.0f)
                moveToRelative(0.0f, 42.0f)
                curveTo(35.374f, 45.0f, 45.0f, 35.374f, 45.0f, 23.5f)
                reflectiveCurveTo(35.374f, 2.0f, 23.5f, 2.0f)
                reflectiveCurveTo(2.0f, 11.626f, 2.0f, 23.5f)
                reflectiveCurveTo(11.626f, 45.0f, 23.5f, 45.0f)
                moveToRelative(14.743f, -22.437f)
                lineToRelative(-22.5f, -12.5f)
                lineTo(15.0f, 9.65f)
                verticalLineToRelative(27.733f)
                lineToRelative(23.257f, -13.954f)
                lineToRelative(0.743f, -0.446f)
                close()
                moveTo(37.0f, 23.017f)
                lineToRelative(-21.0f, 12.6f)
                verticalLineTo(11.35f)
                close()
            }
        }
        .build()
        return _circlePlayLarge!!
    }

private var _circlePlayLarge: ImageVector? = null
