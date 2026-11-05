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

public val SBBIcons.TranslateLarge: ImageVector
    get() {
        if (_translateLarge != null) {
            return _translateLarge!!
        }
        _translateLarge = Builder(name = "TranslateLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.0f, 20.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.29f)
                lineTo(31.71f, 39.0f)
                lineTo(16.0f, 39.0f)
                lineTo(16.0f, 24.349f)
                lineToRelative(-6.0f, 6.0f)
                lineTo(10.0f, 25.0f)
                lineTo(4.0f, 25.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(5.0f, 38.0f)
                horizontalLineToRelative(5.878f)
                lineToRelative(-2.682f, -2.682f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(3.89f, 3.89f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-3.537f, 3.534f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(10.878f, 39.0f)
                lineTo(4.0f, 39.0f)
                lineTo(4.0f, 29.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 38.0f)
                horizontalLineToRelative(15.125f)
                lineTo(36.0f, 41.875f)
                lineTo(36.0f, 38.0f)
                horizontalLineToRelative(6.0f)
                lineTo(42.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                close()
                moveTo(40.0f, 31.0f)
                lineTo(19.0f, 31.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(5.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.935f)
                lineToRelative(5.0f, -5.0f)
                lineTo(16.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                lineTo(30.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(40.0f, 27.0f)
                lineTo(19.0f, 27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(38.803f, 7.318f)
                lineTo(36.119f, 10.0f)
                lineTo(43.0f, 10.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.879f)
                lineToRelative(2.682f, 2.682f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.89f, -3.89f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(3.536f, -3.534f)
                close()
                moveTo(24.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(28.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
            }
        }
        .build()
        return _translateLarge!!
    }

private var _translateLarge: ImageVector? = null
