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

public val SBBIcons.FolderMedium: ImageVector
    get() {
        if (_folderMedium != null) {
            return _folderMedium!!
        }
        _folderMedium = Builder(name = "FolderMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.941f, 9.25f)
                horizontalLineToRelative(6.802f)
                verticalLineToRelative(0.5f)
                lineToRelative(0.007f, 16.5f)
                verticalLineToRelative(0.5f)
                lineTo(6.25f, 26.75f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(15.191f)
                lineToRelative(1.362f, -2.724f)
                close()
                moveTo(23.559f, 10.25f)
                lineTo(22.197f, 12.974f)
                lineTo(22.059f, 13.25f)
                lineTo(7.25f, 13.25f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(21.5f)
                lineToRelative(-0.007f, -15.5f)
                close()
            }
        }
        .build()
        return _folderMedium!!
    }

private var _folderMedium: ImageVector? = null
