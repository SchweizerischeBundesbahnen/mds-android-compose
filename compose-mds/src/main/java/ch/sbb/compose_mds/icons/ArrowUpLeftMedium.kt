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

public val SBBIcons.ArrowUpLeftMedium: ImageVector
    get() {
        if (_arrowUpLeftMedium != null) {
            return _arrowUpLeftMedium!!
        }
        _arrowUpLeftMedium = Builder(
            name = "ArrowUpLeftMedium",
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
                moveTo(27.002f, 26.5f)
                curveToRelative(0.0f, -3.247f, -0.745f, -6.11f, -2.517f, -8.158f)
                curveTo(22.725f, 16.308f, 19.88f, 15.0f, 15.502f, 15.0f)
                horizontalLineTo(9.21f)
                lineToRelative(3.874f, 3.865f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-4.73f, -4.718f)
                lineToRelative(-0.355f, -0.354f)
                lineToRelative(0.355f, -0.354f)
                lineToRelative(4.73f, -4.717f)
                lineToRelative(0.353f, 0.355f)
                lineToRelative(0.354f, 0.353f)
                lineTo(9.21f, 14.0f)
                horizontalLineToRelative(6.292f)
                curveToRelative(4.584f, 0.0f, 7.74f, 1.378f, 9.739f, 3.688f)
                curveToRelative(1.987f, 2.296f, 2.761f, 5.432f, 2.761f, 8.812f)
                close()
            }
        }
            .build()
        return _arrowUpLeftMedium!!
    }

private var _arrowUpLeftMedium: ImageVector? = null
