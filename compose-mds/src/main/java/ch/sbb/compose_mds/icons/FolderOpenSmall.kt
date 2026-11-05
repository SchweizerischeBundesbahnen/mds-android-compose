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

public val SBBIcons.FolderOpenSmall: ImageVector
    get() {
        if (_folderOpenSmall != null) {
            return _folderOpenSmall!!
        }
        _folderOpenSmall = Builder(
            name = "FolderOpenSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(15.2f, 5.0f)
                horizontalLineToRelative(4.81f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.024f)
                lineToRelative(-0.257f, 0.677f)
                lineToRelative(-2.65f, 7.0f)
                lineToRelative(-0.123f, 0.323f)
                lineTo(4.01f, 18.0f)
                verticalLineToRelative(-0.5f)
                lineTo(4.0f, 7.5f)
                lineTo(4.0f, 7.0f)
                horizontalLineToRelative(10.2f)
                lineToRelative(0.863f, -1.723f)
                close()
                moveTo(19.01f, 10.0f)
                lineTo(19.01f, 6.0f)
                horizontalLineToRelative(-3.191f)
                lineToRelative(-0.862f, 1.724f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(5.0f, 8.0f)
                lineToRelative(0.007f, 6.953f)
                lineToRelative(1.89f, -4.641f)
                lineToRelative(0.126f, -0.312f)
                lineTo(19.01f, 10.0f)
                moveTo(5.253f, 17.0f)
                horizontalLineToRelative(14.06f)
                lineToRelative(2.273f, -6.0f)
                lineTo(7.696f, 11.0f)
                close()
            }
        }
            .build()
        return _folderOpenSmall!!
    }

private var _folderOpenSmall: ImageVector? = null
