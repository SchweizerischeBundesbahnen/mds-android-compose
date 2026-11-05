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

public val SBBIcons.FolderLockLarge: ImageVector
    get() {
        if (_folderLockLarge != null) {
            return _folderLockLarge!!
        }
        _folderLockLarge = Builder(
            name = "FolderLockLarge",
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
                moveTo(36.5f, 26.0f)
                curveToRelative(1.382f, 0.0f, 2.5f, 1.118f, 2.5f, 2.5f)
                lineTo(39.0f, 32.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(11.0f)
                lineTo(30.0f, 43.0f)
                lineTo(30.0f, 32.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.382f, 1.118f, -2.5f, 2.5f, -2.5f)
                moveTo(31.0f, 42.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-9.0f)
                lineTo(31.0f, 33.0f)
                close()
                moveTo(37.0f, 39.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(38.99f, 12.5f)
                lineTo(39.0f, 23.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(37.99f, 13.0f)
                lineTo(30.81f, 13.0f)
                lineToRelative(-1.862f, 3.724f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 35.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineToRelative(20.191f)
                lineToRelative(1.862f, -3.724f)
                lineToRelative(0.138f, -0.276f)
                horizontalLineToRelative(8.798f)
                close()
                moveTo(36.5f, 27.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(35.0f, 32.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            }
        }
            .build()
        return _folderLockLarge!!
    }

private var _folderLockLarge: ImageVector? = null
