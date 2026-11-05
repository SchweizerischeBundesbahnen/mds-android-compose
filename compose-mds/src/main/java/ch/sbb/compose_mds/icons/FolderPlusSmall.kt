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

public val SBBIcons.FolderPlusSmall: ImageVector
    get() {
        if (_folderPlusSmall != null) {
            return _folderPlusSmall!!
        }
        _folderPlusSmall = Builder(name = "FolderPlusSmall", defaultWidth = 24.0.dp, defaultHeight =
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
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(9.809f)
                lineToRelative(0.138f, -0.276f)
                lineTo(15.81f, 7.0f)
                horizontalLineToRelative(3.186f)
                lineTo(19.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-0.005f, -6.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.5f)
                moveTo(19.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _folderPlusSmall!!
    }

private var _folderPlusSmall: ImageVector? = null
