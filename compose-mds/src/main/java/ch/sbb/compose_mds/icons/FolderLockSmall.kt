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

public val SBBIcons.FolderLockSmall: ImageVector
    get() {
        if (_folderLockSmall != null) {
            return _folderLockSmall!!
        }
        _folderLockSmall = Builder(name = "FolderLockSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.5f, 6.0f)
                horizontalLineToRelative(-0.309f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(14.19f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(9.809f)
                lineToRelative(0.138f, -0.276f)
                lineTo(15.81f, 7.0f)
                horizontalLineToRelative(3.187f)
                lineTo(19.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-0.005f, -5.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.5f)
                moveToRelative(2.5f, 8.5f)
                arcToRelative(0.499f, 0.499f, 0.0f, true, true, 1.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                moveToRelative(2.0f, 1.969f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.031f)
                close()
                moveTo(16.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _folderLockSmall!!
    }

private var _folderLockSmall: ImageVector? = null
