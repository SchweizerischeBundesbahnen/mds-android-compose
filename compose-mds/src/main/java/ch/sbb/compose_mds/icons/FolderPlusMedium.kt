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

public val SBBIcons.FolderPlusMedium: ImageVector
    get() {
        if (_folderPlusMedium != null) {
            return _folderPlusMedium!!
        }
        _folderPlusMedium = Builder(name = "FolderPlusMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.25f, 9.25f)
                horizontalLineToRelative(-0.309f)
                lineToRelative(-0.138f, 0.276f)
                lineToRelative(-1.362f, 2.724f)
                horizontalLineTo(6.25f)
                verticalLineToRelative(14.5f)
                horizontalLineTo(22.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.25f)
                verticalLineToRelative(-12.5f)
                horizontalLineToRelative(14.809f)
                lineToRelative(0.138f, -0.276f)
                lineToRelative(1.362f, -2.724f)
                horizontalLineToRelative(5.184f)
                lineToRelative(0.007f, 9.25f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-0.008f, -9.75f)
                verticalLineToRelative(-0.5f)
                horizontalLineTo(23.25f)
                moveTo(28.75f, 30.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineTo(25.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineTo(22.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineTo(33.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineTo(30.0f)
                close()
            }
        }
        .build()
        return _folderPlusMedium!!
    }

private var _folderPlusMedium: ImageVector? = null
