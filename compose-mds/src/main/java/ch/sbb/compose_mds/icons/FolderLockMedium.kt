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

public val SBBIcons.FolderLockMedium: ImageVector
    get() {
        if (_folderLockMedium != null) {
            return _folderLockMedium!!
        }
        _folderLockMedium = Builder(name = "FolderLockMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.25f, 9.25f)
                horizontalLineToRelative(-0.309f)
                lineToRelative(-0.138f, 0.276f)
                lineToRelative(-1.362f, 2.724f)
                lineTo(6.25f, 12.25f)
                verticalLineToRelative(14.5f)
                lineTo(19.5f, 26.75f)
                verticalLineToRelative(-1.0f)
                lineTo(7.25f, 25.75f)
                verticalLineToRelative(-12.5f)
                horizontalLineToRelative(14.809f)
                lineToRelative(0.138f, -0.276f)
                lineToRelative(1.362f, -2.724f)
                horizontalLineToRelative(5.184f)
                lineTo(28.75f, 18.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-0.008f, -8.25f)
                verticalLineToRelative(-0.5f)
                lineTo(23.25f, 9.25f)
                moveToRelative(3.5f, 12.5f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(25.75f, 24.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.106f, 0.894f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.894f, 2.0f, 2.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(3.0f)
                moveToRelative(2.5f, 2.703f)
                lineTo(28.25f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.047f)
                close()
                moveTo(23.75f, 31.75f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.5f)
                close()
            }
        }
        .build()
        return _folderLockMedium!!
    }

private var _folderLockMedium: ImageVector? = null
