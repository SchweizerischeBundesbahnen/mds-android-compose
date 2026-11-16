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
        _twoFoldersSmall = Builder(name = "TwoFoldersSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                lineTo(22.0f, 3.0f)
                horizontalLineToRelative(-4.809f)
                lineToRelative(-0.138f, 0.277f)
                lineTo(16.19f, 5.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(6.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(10.01f)
                lineToRelative(0.5f, -0.001f)
                lineToRelative(15.0f, -0.009f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 4.0f)
                horizontalLineToRelative(-3.191f)
                lineToRelative(-0.862f, 1.724f)
                lineTo(16.81f, 6.0f)
                lineTo(7.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.191f)
                lineToRelative(0.862f, -1.723f)
                lineTo(14.19f, 9.0f)
                lineTo(19.0f, 9.0f)
                close()
                moveTo(14.809f, 10.0f)
                lineTo(18.0f, 10.0f)
                verticalLineToRelative(10.0f)
                lineToRelative(-14.0f, 0.008f)
                lineTo(4.0f, 12.0f)
                horizontalLineToRelative(9.809f)
                lineToRelative(0.138f, -0.276f)
                close()
            }
        }
        .build()
        return _twoFoldersSmall!!
    }

private var _twoFoldersSmall: ImageVector? = null
