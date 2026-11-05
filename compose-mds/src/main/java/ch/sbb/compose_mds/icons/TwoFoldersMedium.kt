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

public val SBBIcons.TwoFoldersMedium: ImageVector
    get() {
        if (_twoFoldersMedium != null) {
            return _twoFoldersMedium!!
        }
        _twoFoldersMedium = Builder(
            name = "TwoFoldersMedium",
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
                moveTo(26.25f, 4.75f)
                horizontalLineToRelative(-0.309f)
                lineToRelative(-0.138f, 0.277f)
                lineTo(24.44f, 7.75f)
                horizontalLineTo(9.25f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(14.514f)
                horizontalLineToRelative(0.5f)
                lineToRelative(22.5f, -0.014f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(4.75f)
                horizontalLineToRelative(-6.5f)
                moveToRelative(2.0f, 16.5f)
                horizontalLineToRelative(3.5f)
                verticalLineTo(5.75f)
                horizontalLineToRelative(-5.191f)
                lineToRelative(-1.362f, 2.724f)
                lineToRelative(-0.138f, 0.276f)
                horizontalLineTo(10.25f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(9.691f)
                lineToRelative(1.362f, -2.723f)
                lineToRelative(0.138f, -0.276f)
                horizontalLineToRelative(6.809f)
                verticalLineToRelative(7.5f)
                moveToRelative(-7.553f, -3.776f)
                lineToRelative(1.362f, -2.723f)
                horizontalLineToRelative(5.191f)
                verticalLineToRelative(15.5f)
                lineToRelative(-21.5f, 0.013f)
                verticalLineTo(17.75f)
                horizontalLineToRelative(14.809f)
                close()
            }
        }
            .build()
        return _twoFoldersMedium!!
    }

private var _twoFoldersMedium: ImageVector? = null
