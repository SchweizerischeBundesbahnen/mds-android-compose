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

public val SBBIcons.FolderInfoLarge: ImageVector
    get() {
        if (_folderInfoLarge != null) {
            return _folderInfoLarge!!
        }
        _folderInfoLarge = Builder(
            name = "FolderInfoLarge",
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
                moveToRelative(38.99f, 12.5f)
                lineToRelative(0.01f, 22.0f)
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
                lineToRelative(-0.01f, -21.0f)
                lineTo(30.81f, 13.0f)
                close()
                moveTo(25.0f, 30.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(25.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _folderInfoLarge!!
    }

private var _folderInfoLarge: ImageVector? = null
