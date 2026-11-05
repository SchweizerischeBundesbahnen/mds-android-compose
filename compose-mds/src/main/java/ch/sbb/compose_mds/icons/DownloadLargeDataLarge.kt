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

public val SBBIcons.DownloadLargeDataLarge: ImageVector
    get() {
        if (_downloadLargeDataLarge != null) {
            return _downloadLargeDataLarge!!
        }
        _downloadLargeDataLarge = Builder(name = "DownloadLargeDataLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                lineTo(8.0f, 14.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(31.0f)
                lineTo(39.0f, 14.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(23.0f)
                lineTo(7.0f, 36.0f)
                lineTo(7.0f, 13.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(37.0f, 32.002f)
                lineTo(10.0f, 32.002f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(37.0f, 27.988f)
                lineTo(10.0f, 27.988f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(37.0f, 24.0f)
                lineTo(10.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(24.0f, 18.291f)
                lineTo(28.147f, 14.146f)
                lineTo(28.854f, 14.852f)
                lineTo(23.854f, 19.852f)
                lineTo(23.5f, 20.207f)
                lineTo(23.146f, 19.852f)
                lineTo(18.141f, 14.837f)
                lineTo(18.848f, 14.13f)
                lineTo(23.0f, 18.29f)
                lineTo(23.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _downloadLargeDataLarge!!
    }

private var _downloadLargeDataLarge: ImageVector? = null
