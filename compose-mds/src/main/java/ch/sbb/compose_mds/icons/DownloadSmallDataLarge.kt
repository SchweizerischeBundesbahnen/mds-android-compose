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

public val SBBIcons.DownloadSmallDataLarge: ImageVector
    get() {
        if (_downloadSmallDataLarge != null) {
            return _downloadSmallDataLarge!!
        }
        _downloadSmallDataLarge = Builder(name = "DownloadSmallDataLarge", defaultWidth = 48.0.dp,
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
                moveTo(37.0f, 32.0f)
                lineTo(10.0f, 32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(24.0f, 18.291f)
                lineToRelative(4.147f, -4.145f)
                lineToRelative(0.707f, 0.706f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(-0.354f, 0.355f)
                lineToRelative(-0.354f, -0.355f)
                lineToRelative(-5.005f, -5.015f)
                lineToRelative(0.707f, -0.707f)
                lineTo(23.0f, 18.29f)
                lineTo(23.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _downloadSmallDataLarge!!
    }

private var _downloadSmallDataLarge: ImageVector? = null
