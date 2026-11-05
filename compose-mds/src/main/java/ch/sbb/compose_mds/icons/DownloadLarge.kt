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

public val SBBIcons.DownloadLarge: ImageVector
    get() {
        if (_downloadLarge != null) {
            return _downloadLarge!!
        }
        _downloadLarge = Builder(
            name = "DownloadLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(23.0f, 37.756f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(23.756f)
                lineToRelative(10.639f, -11.102f)
                lineToRelative(0.722f, 0.692f)
                lineToRelative(-11.5f, 12.0f)
                lineToRelative(-0.361f, 0.377f)
                lineToRelative(-0.361f, -0.377f)
                lineToRelative(-11.5f, -12.0f)
                lineToRelative(0.722f, -0.692f)
                close()
                moveTo(3.0f, 45.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(43.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
            .build()
        return _downloadLarge!!
    }

private var _downloadLarge: ImageVector? = null
