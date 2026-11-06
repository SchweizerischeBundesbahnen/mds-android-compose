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

public val SBBIcons.FolderOpenArrowMedium: ImageVector
    get() {
        if (_folderOpenArrowMedium != null) {
            return _folderOpenArrowMedium!!
        }
        _folderOpenArrowMedium = Builder(name = "FolderOpenArrowMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(16.25f, 10.793f)
                lineToRelative(3.647f, -3.647f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(3.646f, 3.647f)
                lineTo(15.25f, 3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(22.956f, 12.25f)
                horizontalLineToRelative(6.809f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(4.424f)
                lineToRelative(-0.257f, 0.677f)
                lineToRelative(-3.976f, 10.5f)
                lineToRelative(-0.122f, 0.323f)
                lineTo(6.265f, 31.25f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.015f, -15.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(15.206f)
                lineToRelative(1.362f, -2.723f)
                close()
                moveTo(28.765f, 19.75f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-5.191f)
                lineToRelative(-1.362f, 2.724f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(7.25f, 16.25f)
                lineToRelative(0.012f, 11.953f)
                lineToRelative(3.315f, -8.141f)
                lineToRelative(0.127f, -0.312f)
                horizontalLineToRelative(18.061f)
                moveTo(7.508f, 30.25f)
                horizontalLineToRelative(21.635f)
                lineToRelative(3.598f, -9.5f)
                lineTo(11.376f, 20.75f)
                close()
            }
        }
        .build()
        return _folderOpenArrowMedium!!
    }

private var _folderOpenArrowMedium: ImageVector? = null
