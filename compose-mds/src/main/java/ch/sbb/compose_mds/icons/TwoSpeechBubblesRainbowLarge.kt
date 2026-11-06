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

public val SBBIcons.TwoSpeechBubblesRainbowLarge: ImageVector
    get() {
        if (_twoSpeechBubblesRainbowLarge != null) {
            return _twoSpeechBubblesRainbowLarge!!
        }
        _twoSpeechBubblesRainbowLarge = Builder(name = "TwoSpeechBubblesRainbowLarge", defaultWidth
                = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.207f)
                lineTo(30.793f, 35.0f)
                lineTo(19.0f, 35.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.275f)
                lineToRelative(-3.851f, 4.332f)
                lineToRelative(-0.874f, 0.983f)
                lineTo(13.0f, 29.0f)
                lineTo(5.0f, 29.0f)
                lineTo(5.0f, 10.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(32.0f, 22.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                lineTo(20.0f, 29.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(11.207f)
                lineTo(35.0f, 37.793f)
                lineTo(35.0f, 34.0f)
                horizontalLineToRelative(6.0f)
                lineTo(41.0f, 17.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(6.0f, 28.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.685f)
                lineToRelative(3.126f, -3.517f)
                lineToRelative(0.15f, -0.168f)
                lineTo(31.0f, 28.0f)
                lineTo(31.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(18.5f, 16.0f)
                curveToRelative(5.256f, 0.0f, 9.5f, 4.244f, 9.5f, 9.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.704f, -3.796f, -8.5f, -8.5f, -8.5f)
                arcToRelative(8.49f, 8.49f, 0.0f, false, false, -8.5f, 8.5f)
                lineTo(9.0f, 25.5f)
                curveToRelative(0.0f, -5.256f, 4.244f, -9.5f, 9.5f, -9.5f)
                moveToRelative(0.0f, 4.0f)
                curveToRelative(3.036f, 0.0f, 5.5f, 2.464f, 5.5f, 5.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.484f, -2.016f, -4.5f, -4.5f, -4.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.036f, 2.464f, -5.5f, 5.5f, -5.5f)
            }
        }
        .build()
        return _twoSpeechBubblesRainbowLarge!!
    }

private var _twoSpeechBubblesRainbowLarge: ImageVector? = null
