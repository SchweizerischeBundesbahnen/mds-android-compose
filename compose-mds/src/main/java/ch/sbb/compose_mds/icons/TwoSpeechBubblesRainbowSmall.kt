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

public val SBBIcons.TwoSpeechBubblesRainbowSmall: ImageVector
    get() {
        if (_twoSpeechBubblesRainbowSmall != null) {
            return _twoSpeechBubblesRainbowSmall!!
        }
        _twoSpeechBubblesRainbowSmall = Builder(name = "TwoSpeechBubblesRainbowSmall", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 5.0f)
                lineTo(2.0f, 5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.065f)
                lineToRelative(0.874f, -0.983f)
                lineTo(8.724f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.043f)
                lineToRelative(2.103f, 2.104f)
                lineToRelative(0.854f, 0.853f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(16.0f, 5.0f)
                lineTo(2.5f, 5.0f)
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.457f)
                lineToRelative(0.147f, 0.146f)
                lineTo(17.0f, 18.543f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                lineTo(20.0f, 9.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(3.0f, 14.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(8.0f)
                lineTo(8.275f, 14.0f)
                lineToRelative(-0.149f, 0.168f)
                lineTo(7.0f, 15.435f)
                lineTo(7.0f, 14.0f)
                lineTo(3.0f, 14.0f)
                moveToRelative(3.0f, -1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(-2.766f, 0.0f, -5.0f, 2.234f, -5.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -2.214f, 1.786f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.786f, 4.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -2.766f, -2.234f, -5.0f, -5.0f, -5.0f)
            }
        }
        .build()
        return _twoSpeechBubblesRainbowSmall!!
    }

private var _twoSpeechBubblesRainbowSmall: ImageVector? = null
