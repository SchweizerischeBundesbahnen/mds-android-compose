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

public val SBBIcons.SpeechBubbleGroupEmptyLarge: ImageVector
    get() {
        if (_speechBubbleGroupEmptyLarge != null) {
            return _speechBubbleGroupEmptyLarge!!
        }
        _speechBubbleGroupEmptyLarge = Builder(name = "SpeechBubbleGroupEmptyLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.0f, 37.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.207f)
                lineTo(23.793f, 37.0f)
                lineTo(14.0f, 37.0f)
                lineTo(14.0f, 24.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(15.0f, 36.0f)
                horizontalLineToRelative(9.207f)
                lineTo(28.0f, 39.793f)
                lineTo(28.0f, 36.0f)
                horizontalLineToRelative(4.0f)
                lineTo(32.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                close()
                moveTo(23.0f, 19.0f)
                horizontalLineToRelative(-9.793f)
                lineTo(8.0f, 24.207f)
                lineTo(8.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(41.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.207f)
                lineTo(33.793f, 19.0f)
                lineTo(28.0f, 19.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.793f)
                lineTo(12.793f, 18.0f)
                lineTo(22.0f, 18.0f)
                lineTo(22.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                close()
                moveTo(29.0f, 18.0f)
                horizontalLineToRelative(5.207f)
                lineTo(38.0f, 21.793f)
                lineTo(38.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                lineTo(29.0f, 11.0f)
                close()
            }
        }
        .build()
        return _speechBubbleGroupEmptyLarge!!
    }

private var _speechBubbleGroupEmptyLarge: ImageVector? = null
