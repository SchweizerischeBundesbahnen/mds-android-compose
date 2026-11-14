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
                moveTo(19.995f, 6.5f)
                lineTo(19.995f, 6.0f)
                lineTo(15.19f, 6.0f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(14.19f, 8.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineToRelative(9.809f)
                lineToRelative(0.138f, -0.276f)
                lineTo(15.81f, 7.0f)
                horizontalLineToRelative(3.186f)
                lineTo(19.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.5f, 14.0f)
                curveToRelative(0.277f, 0.0f, 0.5f, 0.223f, 0.5f, 0.5f)
                lineTo(19.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.277f, 0.223f, -0.5f, 0.5f, -0.5f)
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                lineTo(20.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(19.0f, 17.969f)
                lineTo(19.0f, 20.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 17.97f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _folderLockSmall!!
    }

private var _folderLockSmall: ImageVector? = null
