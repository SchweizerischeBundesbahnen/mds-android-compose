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

public val SBBIcons.TwoFoldersSmall: ImageVector
    get() {
        if (_twoFoldersSmall != null) {
            return _twoFoldersSmall!!
        }
        _twoFoldersSmall = Builder(
            name = "TwoFoldersSmall",
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
                moveTo(17.5f, 3.0f)
                horizontalLineToRelative(-0.309f)
                lineToRelative(-0.138f, 0.277f)
                lineTo(16.19f, 5.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(10.01f)
                horizontalLineToRelative(0.5f)
                lineToRelative(15.0f, -0.01f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-4.5f)
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-3.191f)
                lineToRelative(-0.862f, 1.724f)
                lineTo(16.81f, 6.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.191f)
                lineToRelative(0.862f, -1.723f)
                lineTo(14.19f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(5.0f)
                moveToRelative(-5.053f, -2.276f)
                lineTo(14.81f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(10.001f)
                lineToRelative(-14.0f, 0.008f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(9.809f)
                close()
            }
        }
            .build()
        return _twoFoldersSmall!!
    }

private var _twoFoldersSmall: ImageVector? = null
