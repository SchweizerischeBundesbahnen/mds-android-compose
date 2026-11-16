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
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(5.292f)
                lineToRelative(1.646f, -1.646f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-2.502f, -2.508f)
                lineToRelative(0.707f, -0.707f)
                lineTo(11.0f, 8.292f)
                lineTo(11.0f, 3.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(8.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(17.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(10.0f)
                lineTo(4.0f, 17.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _downloadSmallDataSmall!!
    }

private var _downloadSmallDataSmall: ImageVector? = null
