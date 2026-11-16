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

public val SBBIcons.FolderInfoMedium: ImageVector
    get() {
        if (_folderInfoMedium != null) {
            return _folderInfoMedium!!
        }
        _folderInfoMedium = Builder(name = "FolderInfoMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.742f, 9.75f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-6.8f)
                lineToRelative(-0.14f, 0.276f)
                lineToRelative(-1.36f, 2.724f)
                lineTo(6.25f, 12.25f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(22.059f, 13.25f)
                lineTo(22.197f, 12.974f)
                lineTo(23.559f, 10.25f)
                horizontalLineToRelative(5.183f)
                lineToRelative(0.008f, 15.5f)
                lineTo(7.25f, 25.75f)
                verticalLineToRelative(-12.5f)
                close()
                moveTo(19.25f, 22.75f)
                verticalLineToRelative(-4.5f)
                lineTo(16.5f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(3.5f)
                lineTo(16.5f, 22.75f)
                verticalLineToRelative(1.0f)
                lineTo(21.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(19.25f, 15.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.25f, 15.0f)
                close()
            }
        }
        .build()
        return _folderInfoMedium!!
    }

private var _folderInfoMedium: ImageVector? = null
