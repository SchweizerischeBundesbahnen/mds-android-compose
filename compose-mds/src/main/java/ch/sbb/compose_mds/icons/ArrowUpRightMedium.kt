package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ArrowUpRightMedium: ImageVector
    get() {
        if (_arrowUpRightMedium != null) {
            return _arrowUpRightMedium!!
        }
        _arrowUpRightMedium = Builder(
            name = "ArrowUpRightMedium",
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
                pathFillType = NonZero,
            ) {
                moveTo(9.0f, 26.5f)
                curveToRelative(0.0f, -3.247f, 0.746f, -6.11f, 2.518f, -8.158f)
                curveTo(13.278f, 16.308f, 16.123f, 15.0f, 20.5f, 15.0f)
                horizontalLineToRelative(6.292f)
                lineToRelative(-3.873f, 3.865f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(4.73f, -4.718f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(-0.355f, -0.354f)
                lineToRelative(-4.729f, -4.717f)
                lineToRelative(-0.354f, 0.355f)
                lineToRelative(-0.353f, 0.353f)
                lineTo(26.792f, 14.0f)
                horizontalLineTo(20.5f)
                curveToRelative(-4.583f, 0.0f, -7.739f, 1.378f, -9.738f, 3.688f)
                curveTo(8.774f, 19.984f, 8.0f, 23.12f, 8.0f, 26.5f)
                close()
            }
        }
            .build()
        return _arrowUpRightMedium!!
    }

private var _arrowUpRightMedium: ImageVector? = null
