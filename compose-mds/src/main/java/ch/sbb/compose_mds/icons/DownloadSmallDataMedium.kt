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
        _downloadSmallDataMedium = Builder(name = "DownloadSmallDataMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.75f, 4.5f)
                verticalLineToRelative(8.542f)
                lineToRelative(2.897f, -2.896f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-4.104f, 4.104f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-3.754f, -3.762f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(2.901f, 2.908f)
                lineTo(16.75f, 4.5f)
                close()
                moveTo(12.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                lineTo(4.75f, 9.25f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(25.0f)
                lineTo(29.75f, 9.25f)
                lineTo(22.5f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-23.0f)
                verticalLineToRelative(-15.5f)
                close()
                moveTo(27.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 22.75f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _downloadSmallDataMedium!!
    }

private var _downloadSmallDataMedium: ImageVector? = null
