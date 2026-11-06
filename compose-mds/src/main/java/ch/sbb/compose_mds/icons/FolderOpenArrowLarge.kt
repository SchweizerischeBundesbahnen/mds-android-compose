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

public val SBBIcons.FolderOpenArrowLarge: ImageVector
    get() {
        if (_folderOpenArrowLarge != null) {
            return _folderOpenArrowLarge!!
        }
        _folderOpenArrowLarge = Builder(name = "FolderOpenArrowLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.02f, 27.0f)
                horizontalLineToRelative(5.824f)
                lineToRelative(-0.256f, 0.677f)
                lineToRelative(-5.303f, 14.0f)
                lineToRelative(-0.122f, 0.323f)
                lineTo(8.021f, 42.0f)
                lineToRelative(-0.001f, -0.499f)
                lineToRelative(-0.02f, -20.0f)
                lineTo(7.999f, 21.0f)
                horizontalLineToRelative(20.213f)
                lineToRelative(1.861f, -3.724f)
                lineToRelative(0.138f, -0.276f)
                horizontalLineToRelative(8.809f)
                close()
                moveTo(9.264f, 41.0f)
                horizontalLineToRelative(29.209f)
                lineToRelative(4.924f, -13.0f)
                lineTo(14.556f, 28.0f)
                close()
                moveTo(28.967f, 21.724f)
                lineTo(28.829f, 22.0f)
                lineTo(9.001f, 22.0f)
                lineToRelative(0.016f, 16.952f)
                lineToRelative(4.74f, -11.64f)
                lineToRelative(0.127f, -0.312f)
                lineTo(38.02f, 27.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-7.192f)
                close()
                moveTo(21.0f, 15.293f)
                lineToRelative(5.147f, -5.146f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-6.354f, 6.353f)
                lineToRelative(-6.353f, -6.353f)
                lineToRelative(0.707f, -0.707f)
                lineTo(20.0f, 15.293f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _folderOpenArrowLarge!!
    }

private var _folderOpenArrowLarge: ImageVector? = null
