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

public val SBBIcons.FolderInfoSmall: ImageVector
    get() {
        if (_folderInfoSmall != null) {
            return _folderInfoSmall!!
        }
        _folderInfoSmall = Builder(name = "FolderInfoSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.5f, 6.0f)
                horizontalLineToRelative(-0.309f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(14.19f, 8.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.005f, -11.0f)
                lineTo(19.995f, 6.0f)
                lineTo(15.5f, 6.0f)
                moveToRelative(-0.553f, 2.724f)
                lineTo(15.81f, 7.0f)
                horizontalLineToRelative(3.186f)
                lineTo(19.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineToRelative(9.809f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _folderInfoSmall!!
    }

private var _folderInfoSmall: ImageVector? = null
