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

public val SBBIcons.DownloadSmall: ImageVector
    get() {
        if (_downloadSmall != null) {
            return _downloadSmall!!
        }
        _downloadSmall = Builder(
            name = "DownloadSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveToRelative(12.0f, 14.076f)
                lineToRelative(3.05f, -3.074f)
                lineToRelative(0.71f, 0.705f)
                lineToRelative(-3.905f, 3.935f)
                lineToRelative(-0.354f, 0.357f)
                lineToRelative(-0.355f, -0.357f)
                lineToRelative(-3.908f, -3.935f)
                lineToRelative(0.709f, -0.705f)
                lineTo(11.0f, 14.076f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(4.0f, 17.51f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
            .build()
        return _downloadSmall!!
    }

private var _downloadSmall: ImageVector? = null
