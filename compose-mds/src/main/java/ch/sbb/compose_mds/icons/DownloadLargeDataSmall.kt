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

public val SBBIcons.DownloadLargeDataSmall: ImageVector
    get() {
        if (_downloadLargeDataSmall != null) {
            return _downloadLargeDataSmall!!
        }
        _downloadLargeDataSmall = Builder(name = "DownloadLargeDataSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.292f)
                lineTo(12.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.292f)
                lineTo(9.35f, 6.638f)
                lineToRelative(-0.706f, 0.707f)
                lineToRelative(2.502f, 2.508f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-0.707f, -0.707f)
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
                moveTo(18.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 11.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 12.994f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 13.994f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.0f, 16.001f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 15.001f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _downloadLargeDataSmall!!
    }

private var _downloadLargeDataSmall: ImageVector? = null
