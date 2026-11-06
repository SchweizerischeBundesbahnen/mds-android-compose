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

public val SBBIcons.SmartwatchSmall: ImageVector
    get() {
        if (_smartwatchSmall != null) {
            return _smartwatchSmall!!
        }
        _smartwatchSmall = Builder(name = "SmartwatchSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 7.5f)
                lineTo(18.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(16.0f, 18.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 16.5f)
                verticalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 2.0f)
                moveToRelative(1.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(7.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(12.0f, 9.0f)
                verticalLineToRelative(2.997f)
                lineToRelative(3.037f, -0.017f)
                lineToRelative(0.006f, 1.0f)
                lineToRelative(-3.54f, 0.02f)
                lineToRelative(-0.503f, 0.003f)
                lineTo(11.0f, 9.0f)
                close()
            }
        }
        .build()
        return _smartwatchSmall!!
    }

private var _smartwatchSmall: ImageVector? = null
