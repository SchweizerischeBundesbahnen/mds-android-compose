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

public val SBBIcons.FolderOpenLarge: ImageVector
    get() {
        if (_folderOpenLarge != null) {
            return _folderOpenLarge!!
        }
        _folderOpenLarge = Builder(name = "FolderOpenLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.02f, 21.0f)
                horizontalLineToRelative(5.824f)
                lineToRelative(-0.256f, 0.677f)
                lineToRelative(-5.303f, 14.0f)
                lineToRelative(-0.122f, 0.323f)
                lineTo(8.021f, 36.0f)
                lineToRelative(-0.001f, -0.499f)
                lineToRelative(-0.02f, -20.0f)
                lineTo(7.999f, 15.0f)
                horizontalLineToRelative(20.213f)
                lineToRelative(1.861f, -3.724f)
                lineToRelative(0.138f, -0.276f)
                horizontalLineToRelative(8.809f)
                close()
                moveTo(9.264f, 35.0f)
                horizontalLineToRelative(29.209f)
                lineToRelative(4.924f, -13.0f)
                lineTo(14.556f, 22.0f)
                close()
                moveTo(28.967f, 15.724f)
                lineTo(28.829f, 16.0f)
                lineTo(9.001f, 16.0f)
                lineToRelative(0.016f, 16.952f)
                lineToRelative(4.74f, -11.64f)
                lineToRelative(0.127f, -0.312f)
                lineTo(38.02f, 21.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-7.192f)
                close()
            }
        }
        .build()
        return _folderOpenLarge!!
    }

private var _folderOpenLarge: ImageVector? = null
