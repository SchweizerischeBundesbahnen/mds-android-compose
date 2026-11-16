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

public val SBBIcons.TwoSpeechBubblesLarge: ImageVector
    get() {
        if (_twoSpeechBubblesLarge != null) {
            return _twoSpeechBubblesLarge!!
        }
        _twoSpeechBubblesLarge = Builder(name = "TwoSpeechBubblesLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(17.0f)
                lineTo(16.793f, 27.0f)
                lineTo(13.0f, 30.793f)
                lineTo(13.0f, 27.0f)
                lineTo(7.0f, 27.0f)
                close()
                moveTo(18.0f, 28.0f)
                horizontalLineToRelative(-0.793f)
                lineTo(12.0f, 33.207f)
                lineTo(12.0f, 28.0f)
                lineTo(6.0f, 28.0f)
                lineTo(6.0f, 9.0f)
                horizontalLineToRelative(25.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.207f)
                lineTo(29.793f, 36.0f)
                lineTo(18.0f, 36.0f)
                close()
                moveTo(31.0f, 18.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                lineTo(19.0f, 28.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(11.207f)
                lineTo(34.0f, 38.793f)
                lineTo(34.0f, 35.0f)
                horizontalLineToRelative(6.0f)
                lineTo(40.0f, 18.0f)
                close()
                moveTo(25.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(23.0f, 22.0f)
                verticalLineToRelative(1.0f)
                lineTo(11.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(26.0f, 18.0f)
                verticalLineToRelative(1.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(33.0f, 31.0f)
                verticalLineToRelative(-1.0f)
                lineTo(23.0f, 30.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _twoSpeechBubblesLarge!!
    }

private var _twoSpeechBubblesLarge: ImageVector? = null
