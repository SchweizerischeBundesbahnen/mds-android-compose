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

public val SBBIcons.DownloadSmallDataSmall: ImageVector
    get() {
        if (_downloadSmallDataSmall != null) {
            return _downloadSmallDataSmall!!
        }
        _downloadSmallDataSmall = Builder(name = "DownloadSmallDataSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.647f, 6.646f)
                lineTo(12.0f, 8.293f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.29f)
                lineTo(9.351f, 6.64f)
                lineToRelative(-0.708f, 0.706f)
                lineToRelative(2.503f, 2.508f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(2.5f, -2.5f)
                close()
                moveTo(3.5f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(17.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _downloadSmallDataSmall!!
    }

private var _downloadSmallDataSmall: ImageVector? = null
