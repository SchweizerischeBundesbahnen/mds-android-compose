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
                moveTo(29.742f, 9.75f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-6.8f)
                lineToRelative(-0.14f, 0.276f)
                lineToRelative(-1.36f, 2.724f)
                lineTo(6.25f, 12.25f)
                verticalLineToRelative(14.5f)
                lineTo(22.5f, 26.75f)
                verticalLineToRelative(-1.0f)
                lineTo(7.25f, 25.75f)
                verticalLineToRelative(-12.5f)
                horizontalLineToRelative(14.809f)
                lineToRelative(0.138f, -0.276f)
                lineToRelative(1.362f, -2.724f)
                horizontalLineToRelative(5.183f)
                lineToRelative(0.008f, 9.25f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(29.75f, 22.5f)
                verticalLineToRelative(3.25f)
                lineTo(33.0f, 25.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                lineTo(29.75f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                lineTo(25.5f, 26.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                lineTo(28.75f, 22.5f)
                close()
            }
        }
        .build()
        return _folderPlusMedium!!
    }

private var _folderPlusMedium: ImageVector? = null
