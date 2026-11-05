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

public val SBBIcons.SmartwatchLarge: ImageVector
    get() {
        if (_smartwatchLarge != null) {
            return _smartwatchLarge!!
        }
        _smartwatchLarge = Builder(name = "SmartwatchLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.0f, 12.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                lineTo(35.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(31.0f, 35.0f)
                verticalLineToRelative(8.0f)
                lineTo(16.0f, 43.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                lineTo(16.0f, 12.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(17.0f, 42.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-7.0f)
                lineTo(17.0f, 35.0f)
                close()
                moveTo(23.5f, 37.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-9.0f, -25.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(23.0f, 23.997f)
                lineToRelative(6.577f, -0.037f)
                lineToRelative(0.006f, 1.0f)
                lineToRelative(-7.08f, 0.04f)
                lineToRelative(-0.503f, 0.003f)
                lineTo(22.0f, 17.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(35.0f, 24.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 12.0f)
                horizontalLineToRelative(13.0f)
                lineTo(30.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                close()
            }
        }
        .build()
        return _smartwatchLarge!!
    }

private var _smartwatchLarge: ImageVector? = null
