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

public val SBBIcons.DownloadLargeDataMedium: ImageVector
    get() {
        if (_downloadLargeDataMedium != null) {
            return _downloadLargeDataMedium!!
        }
        _downloadLargeDataMedium = Builder(
            name = "DownloadLargeDataMedium",
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
                pathFillType = EvenOdd,
            ) {
                moveToRelative(17.75f, 13.043f)
                lineToRelative(2.897f, -2.897f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-3.754f, -3.762f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(2.9f, 2.907f)
                lineTo(16.75f, 4.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(5.25f, 9.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(25.0f)
                lineTo(29.75f, 9.25f)
                lineTo(22.5f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-23.0f)
                verticalLineToRelative(-15.5f)
                lineTo(12.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.5f, 17.75f)
                lineTo(27.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 16.75f)
                close()
                moveTo(27.0f, 20.741f)
                lineTo(7.5f, 20.741f)
                verticalLineToRelative(-1.0f)
                lineTo(27.0f, 19.741f)
                close()
                moveTo(7.5f, 23.751f)
                lineTo(27.0f, 23.751f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 22.751f)
                close()
            }
        }
            .build()
        return _downloadLargeDataMedium!!
    }

private var _downloadLargeDataMedium: ImageVector? = null
