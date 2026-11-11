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

public val SBBIcons.FolderOpenMedium: ImageVector
    get() {
        if (_folderOpenMedium != null) {
            return _folderOpenMedium!!
        }
        _folderOpenMedium = Builder(name = "FolderOpenMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.764f, 7.75f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(4.425f)
                lineToRelative(-0.257f, 0.677f)
                lineToRelative(-3.976f, 10.5f)
                lineToRelative(-0.122f, 0.323f)
                lineTo(6.265f, 26.75f)
                verticalLineToRelative(-0.498f)
                lineToRelative(-0.015f, -15.0f)
                lineToRelative(-0.001f, -0.502f)
                horizontalLineToRelative(15.207f)
                lineToRelative(1.36f, -2.723f)
                lineToRelative(0.14f, -0.277f)
                close()
                moveTo(7.508f, 25.75f)
                horizontalLineToRelative(21.634f)
                lineToRelative(3.599f, -9.5f)
                lineTo(11.376f, 16.25f)
                close()
                moveTo(22.211f, 11.474f)
                lineTo(22.074f, 11.751f)
                lineTo(7.25f, 11.751f)
                lineToRelative(0.011f, 11.952f)
                lineToRelative(3.316f, -8.141f)
                lineToRelative(0.127f, -0.311f)
                horizontalLineToRelative(18.06f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-5.191f)
                close()
            }
        }
        .build()
        return _folderOpenMedium!!
    }

private var _folderOpenMedium: ImageVector? = null
