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

public val SBBIcons.MagicWandLarge: ImageVector
    get() {
        if (_magicWandLarge != null) {
            return _magicWandLarge!!
        }
        _magicWandLarge = Builder(name = "MagicWandLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.207f, 19.5f)
                lineTo(8.5f, 44.207f)
                lineTo(3.793f, 39.5f)
                lineTo(28.5f, 14.793f)
                close()
                moveTo(5.207f, 39.5f)
                lineTo(8.5f, 42.793f)
                lineTo(23.793f, 27.5f)
                lineTo(20.5f, 24.207f)
                close()
                moveTo(35.0f, 35.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(43.0f, 25.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 23.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 24.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 27.0f)
                verticalLineToRelative(-3.0f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(21.207f, 23.5f)
                lineTo(24.5f, 26.793f)
                lineTo(28.793f, 22.5f)
                lineTo(25.5f, 19.207f)
                close()
                moveTo(26.207f, 18.5f)
                lineTo(29.5f, 21.793f)
                lineTo(31.793f, 19.5f)
                lineTo(28.5f, 16.207f)
                close()
                moveTo(15.0f, 9.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 9.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(39.0f, 9.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(33.0f, 9.0f)
                horizontalLineToRelative(5.0f)
                lineTo(38.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _magicWandLarge!!
    }

private var _magicWandLarge: ImageVector? = null
