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

public val SBBIcons.FolderLarge: ImageVector
    get() {
        if (_folderLarge != null) {
            return _folderLarge!!
        }
        _folderLarge = Builder(
            name = "FolderLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveToRelative(38.991f, 12.5f)
                lineToRelative(0.009f, 22.0f)
                verticalLineToRelative(0.5f)
                lineTo(8.0f, 35.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineToRelative(20.191f)
                lineToRelative(1.862f, -3.724f)
                lineToRelative(0.138f, -0.276f)
                horizontalLineToRelative(8.8f)
                close()
                moveTo(28.947f, 16.724f)
                lineTo(28.81f, 17.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(29.0f)
                lineToRelative(-0.009f, -21.0f)
                lineTo(30.81f, 13.0f)
                close()
            }
        }
            .build()
        return _folderLarge!!
    }

private var _folderLarge: ImageVector? = null
