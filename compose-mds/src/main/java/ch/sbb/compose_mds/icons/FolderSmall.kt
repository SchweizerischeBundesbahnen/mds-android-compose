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

public val SBBIcons.FolderSmall: ImageVector
    get() {
        if (_folderSmall != null) {
            return _folderSmall!!
        }
        _folderSmall = Builder(name = "FolderSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.191f, 6.0f)
                horizontalLineToRelative(4.804f)
                verticalLineToRelative(0.5f)
                lineToRelative(0.005f, 11.0f)
                verticalLineToRelative(0.5f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(10.191f)
                lineToRelative(0.862f, -1.724f)
                close()
                moveTo(15.809f, 7.0f)
                lineTo(14.947f, 8.724f)
                lineTo(14.81f, 9.0f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(-0.004f, -10.0f)
                close()
            }
        }
        .build()
        return _folderSmall!!
    }

private var _folderSmall: ImageVector? = null
