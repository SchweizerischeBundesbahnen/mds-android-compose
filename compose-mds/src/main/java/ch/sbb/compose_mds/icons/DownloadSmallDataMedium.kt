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

public val SBBIcons.DownloadSmallDataMedium: ImageVector
    get() {
        if (_downloadSmallDataMedium != null) {
            return _downloadSmallDataMedium!!
        }
        _downloadSmallDataMedium = Builder(
            name = "DownloadSmallDataMedium",
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
                moveToRelative(20.647f, 10.146f)
                lineToRelative(-2.897f, 2.896f)
                lineTo(17.75f, 4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.54f)
                lineToRelative(-2.9f, -2.906f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(3.754f, 3.762f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(3.75f, -3.75f)
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
                moveTo(7.5f, 23.75f)
                lineTo(27.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 22.75f)
                close()
            }
        }
            .build()
        return _downloadSmallDataMedium!!
    }

private var _downloadSmallDataMedium: ImageVector? = null
