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

public val SBBIcons.DoubleDeckWagonLarge: ImageVector
    get() {
        if (_doubleDeckWagonLarge != null) {
            return _doubleDeckWagonLarge!!
        }
        _doubleDeckWagonLarge = Builder(
            name = "DoubleDeckWagonLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                moveTo(39.498f, 13.994f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                lineTo(42.0f, 16.494f)
                verticalLineToRelative(15.501f)
                horizontalLineToRelative(2.998f)
                verticalLineToRelative(1.0f)
                lineTo(42.0f, 32.995f)
                verticalLineToRelative(2.001f)
                horizontalLineToRelative(-2.046f)
                quadToRelative(0.041f, 0.242f, 0.043f, 0.498f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                curveToRelative(0.0f, -0.171f, 0.018f, -0.337f, 0.043f, -0.498f)
                lineTo(15.954f, 34.996f)
                curveToRelative(0.025f, 0.161f, 0.043f, 0.327f, 0.043f, 0.498f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                curveToRelative(0.0f, -0.171f, 0.018f, -0.337f, 0.043f, -0.498f)
                lineTo(6.996f, 34.996f)
                verticalLineToRelative(-2.0f)
                lineTo(3.998f, 32.996f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.997f)
                lineToRelative(-0.003f, -15.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                close()
                moveTo(10.057f, 34.996f)
                curveToRelative(-0.037f, 0.164f, -0.06f, 0.33f, -0.06f, 0.498f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                quadToRelative(-0.002f, -0.252f, -0.06f, -0.498f)
                close()
                moveTo(34.057f, 34.996f)
                quadToRelative(-0.058f, 0.246f, -0.06f, 0.498f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                curveToRelative(0.0f, -0.168f, -0.023f, -0.334f, -0.06f, -0.498f)
                close()
                moveTo(9.492f, 14.996f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                lineToRelative(0.004f, 17.5f)
                horizontalLineToRelative(3.002f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(8.0f)
                lineTo(41.0f, 33.996f)
                lineTo(41.0f, 16.494f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(11.998f, 33.996f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(38.0f, 30.996f)
                lineTo(20.998f, 30.996f)
                verticalLineToRelative(-5.0f)
                lineTo(38.0f, 25.996f)
                close()
                moveTo(21.998f, 29.996f)
                lineTo(37.0f, 29.996f)
                verticalLineToRelative(-3.0f)
                lineTo(21.998f, 26.996f)
                close()
                moveTo(38.0f, 22.994f)
                lineTo(10.998f, 22.994f)
                verticalLineToRelative(-5.0f)
                lineTo(38.0f, 17.994f)
                close()
                moveTo(11.998f, 21.994f)
                lineTo(37.0f, 21.994f)
                verticalLineToRelative(-3.0f)
                lineTo(11.998f, 18.994f)
                close()
            }
        }
            .build()
        return _doubleDeckWagonLarge!!
    }

private var _doubleDeckWagonLarge: ImageVector? = null
