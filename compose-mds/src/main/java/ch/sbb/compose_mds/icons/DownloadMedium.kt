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

public val SBBIcons.DownloadMedium: ImageVector
    get() {
        if (_downloadMedium != null) {
            return _downloadMedium!!
        }
        _downloadMedium = Builder(name = "DownloadMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.75f, 21.721f)
                lineToRelative(5.002f, -5.041f)
                lineToRelative(0.71f, 0.704f)
                lineToRelative(-5.857f, 5.903f)
                lineToRelative(-0.354f, 0.357f)
                lineToRelative(-0.355f, -0.357f)
                lineToRelative(-5.862f, -5.903f)
                lineToRelative(0.71f, -0.704f)
                lineToRelative(5.006f, 5.041f)
                lineTo(16.75f, 10.498f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(6.25f, 26.265f)
                lineTo(6.25f, 22.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.265f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.25f)
                horizontalLineToRelative(-22.0f)
                close()
            }
        }
        .build()
        return _downloadMedium!!
    }

private var _downloadMedium: ImageVector? = null
