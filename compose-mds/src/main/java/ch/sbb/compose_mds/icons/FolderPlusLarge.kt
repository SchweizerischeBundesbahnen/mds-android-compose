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

public val SBBIcons.FolderPlusLarge: ImageVector
    get() {
        if (_folderPlusLarge != null) {
            return _folderPlusLarge!!
        }
        _folderPlusLarge = Builder(name = "FolderPlusLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.0f, 34.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(38.99f, 12.5f)
                lineTo(39.0f, 25.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(37.99f, 13.0f)
                lineTo(30.81f, 13.0f)
                lineToRelative(-1.862f, 3.724f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 35.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineToRelative(20.191f)
                lineToRelative(1.862f, -3.724f)
                lineToRelative(0.138f, -0.276f)
                horizontalLineToRelative(8.798f)
                close()
            }
        }
        .build()
        return _folderPlusLarge!!
    }

private var _folderPlusLarge: ImageVector? = null
