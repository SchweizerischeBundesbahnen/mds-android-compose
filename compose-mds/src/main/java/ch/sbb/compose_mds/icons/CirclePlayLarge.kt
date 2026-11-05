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
                moveTo(3.0f, 23.5f)
                curveTo(3.0f, 12.178f, 12.178f, 3.0f, 23.5f, 3.0f)
                reflectiveCurveTo(44.0f, 12.178f, 44.0f, 23.5f)
                reflectiveCurveTo(34.822f, 44.0f, 23.5f, 44.0f)
                reflectiveCurveTo(3.0f, 34.822f, 3.0f, 23.5f)
                moveTo(23.5f, 2.0f)
                curveTo(11.626f, 2.0f, 2.0f, 11.626f, 2.0f, 23.5f)
                reflectiveCurveTo(11.626f, 45.0f, 23.5f, 45.0f)
                reflectiveCurveTo(45.0f, 35.374f, 45.0f, 23.5f)
                reflectiveCurveTo(35.374f, 2.0f, 23.5f, 2.0f)
                moveToRelative(-7.757f, 8.063f)
                lineTo(15.0f, 9.65f)
                verticalLineToRelative(27.733f)
                lineToRelative(0.757f, -0.454f)
                lineToRelative(22.5f, -13.5f)
                lineToRelative(0.743f, -0.446f)
                lineToRelative(-0.757f, -0.42f)
                close()
                moveTo(16.0f, 35.617f)
                verticalLineTo(11.35f)
                lineToRelative(21.0f, 11.667f)
                close()
            }
        }
        .build()
        return _circlePlayLarge!!
    }

private var _circlePlayLarge: ImageVector? = null
