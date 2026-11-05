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

public val SBBIcons.FolderOpenMedium: ImageVector
    get() {
        if (_folderOpenMedium != null) {
            return _folderOpenMedium!!
        }
        _folderOpenMedium = Builder(
            name = "FolderOpenMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(22.956f, 7.75f)
                horizontalLineToRelative(6.809f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(4.423f)
                lineToRelative(-0.256f, 0.678f)
                lineToRelative(-3.976f, 10.5f)
                lineToRelative(-0.123f, 0.322f)
                lineTo(6.265f, 26.75f)
                verticalLineToRelative(-0.499f)
                lineToRelative(-0.015f, -15.0f)
                lineToRelative(-0.001f, -0.5f)
                horizontalLineToRelative(15.207f)
                lineToRelative(1.361f, -2.724f)
                close()
                moveTo(28.765f, 15.25f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-5.192f)
                lineToRelative(-1.361f, 2.724f)
                lineToRelative(-0.139f, 0.277f)
                lineTo(7.25f, 11.751f)
                lineToRelative(0.012f, 11.952f)
                lineToRelative(3.314f, -8.141f)
                lineToRelative(0.127f, -0.311f)
                horizontalLineToRelative(18.062f)
                moveTo(7.508f, 25.75f)
                horizontalLineToRelative(21.635f)
                lineToRelative(3.597f, -9.5f)
                lineTo(11.376f, 16.25f)
                close()
            }
        }
            .build()
        return _folderOpenMedium!!
    }

private var _folderOpenMedium: ImageVector? = null
