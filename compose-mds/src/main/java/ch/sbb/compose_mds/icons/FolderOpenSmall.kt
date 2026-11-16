package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.FolderOpenSmall: ImageVector
    get() {
        if (_folderOpenSmall != null) {
            return _folderOpenSmall!!
        }
        _folderOpenSmall = Builder(name = "FolderOpenSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.01f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.024f)
                lineToRelative(-0.257f, 0.677f)
                lineToRelative(-2.65f, 7.0f)
                lineToRelative(-0.123f, 0.323f)
                lineTo(4.01f, 18.0f)
                lineToRelative(-0.001f, -0.499f)
                lineToRelative(-0.01f, -10.0f)
                lineToRelative(-0.001f, -0.5f)
                lineTo(14.2f, 7.001f)
                lineToRelative(0.861f, -1.724f)
                lineToRelative(0.139f, -0.277f)
                close()
                moveTo(5.252f, 17.0f)
                horizontalLineToRelative(14.06f)
                lineToRelative(2.274f, -6.0f)
                lineTo(7.697f, 11.0f)
                close()
                moveTo(14.956f, 7.724f)
                lineTo(14.819f, 8.0f)
                lineTo(5.001f, 8.0f)
                lineToRelative(0.006f, 6.952f)
                lineToRelative(1.89f, -4.64f)
                lineToRelative(0.126f, -0.312f)
                lineTo(19.01f, 10.0f)
                lineTo(19.01f, 6.0f)
                horizontalLineToRelative(-3.192f)
                close()
            }
        }
        .build()
        return _folderOpenSmall!!
    }

private var _folderOpenSmall: ImageVector? = null
