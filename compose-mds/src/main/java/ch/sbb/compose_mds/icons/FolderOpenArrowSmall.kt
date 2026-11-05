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

public val SBBIcons.FolderOpenArrowSmall: ImageVector
    get() {
        if (_folderOpenArrowSmall != null) {
            return _folderOpenArrowSmall!!
        }
        _folderOpenArrowSmall = Builder(name = "FolderOpenArrowSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.0f, 6.793f)
                lineToRelative(2.146f, -2.147f)
                lineToRelative(0.708f, 0.708f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(0.708f, -0.708f)
                lineTo(10.0f, 6.793f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(15.2f, 8.0f)
                horizontalLineToRelative(4.81f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.024f)
                lineToRelative(-0.257f, 0.677f)
                lineToRelative(-2.65f, 7.0f)
                lineToRelative(-0.123f, 0.323f)
                lineTo(4.01f, 21.0f)
                verticalLineToRelative(-0.5f)
                lineTo(4.0f, 10.5f)
                lineTo(4.0f, 10.0f)
                horizontalLineToRelative(10.2f)
                lineToRelative(0.863f, -1.723f)
                close()
                moveTo(19.01f, 9.0f)
                horizontalLineToRelative(-3.191f)
                lineToRelative(-0.862f, 1.724f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(5.0f, 11.0f)
                lineToRelative(0.007f, 6.953f)
                lineToRelative(1.89f, -4.641f)
                lineToRelative(0.126f, -0.312f)
                lineTo(19.01f, 13.0f)
                close()
                moveTo(5.253f, 20.0f)
                horizontalLineToRelative(14.06f)
                lineToRelative(2.273f, -6.0f)
                lineTo(7.696f, 14.0f)
                close()
            }
        }
        .build()
        return _folderOpenArrowSmall!!
    }

private var _folderOpenArrowSmall: ImageVector? = null
