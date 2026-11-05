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

public val SBBIcons.KeyboardLarge: ImageVector
    get() {
        if (_keyboardLarge != null) {
            return _keyboardLarge!!
        }
        _keyboardLarge = Builder(
            name = "KeyboardLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(33.0f, 14.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.001f)
                horizontalLineToRelative(-8.0f)
                lineTo(21.0f, 20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(17.0f)
                lineTo(6.0f, 37.0f)
                lineTo(6.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-8.001f)
                horizontalLineToRelative(9.0f)
                lineTo(29.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(7.0f, 36.0f)
                horizontalLineToRelative(33.0f)
                lineTo(40.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                close()
                moveTo(12.0f, 32.999f)
                lineTo(9.0f, 32.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 32.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(30.0f, 32.999f)
                lineTo(17.0f, 32.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(34.0f, 32.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(38.0f, 32.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(37.0f, 29.999f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(14.0f, 28.999f)
                lineTo(9.0f, 28.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(18.0f, 28.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(22.0f, 28.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(26.0f, 28.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(30.0f, 28.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(34.0f, 28.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 24.999f)
                lineTo(9.0f, 24.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 24.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.0f, 24.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 24.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(28.0f, 24.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(32.0f, 24.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(30.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
            .build()
        return _keyboardLarge!!
    }

private var _keyboardLarge: ImageVector? = null
