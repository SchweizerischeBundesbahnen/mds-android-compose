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

public val SBBIcons.SpeechBubbleSparklesLarge: ImageVector
    get() {
        if (_speechBubbleSparklesLarge != null) {
            return _speechBubbleSparklesLarge!!
        }
        _speechBubbleSparklesLarge = Builder(name = "SpeechBubbleSparklesLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.793f)
                lineTo(18.793f, 35.0f)
                lineTo(38.0f, 35.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                lineTo(19.207f, 36.0f)
                lineTo(14.0f, 41.207f)
                lineTo(14.0f, 36.0f)
                lineTo(8.0f, 36.0f)
                lineTo(8.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(33.0f, 6.5f)
                curveTo(33.0f, 12.299f, 37.701f, 17.0f, 43.5f, 17.0f)
                verticalLineToRelative(1.0f)
                curveTo(37.701f, 18.0f, 33.0f, 22.701f, 33.0f, 28.5f)
                horizontalLineToRelative(-1.0f)
                curveTo(32.0f, 22.701f, 27.299f, 18.0f, 21.5f, 18.0f)
                verticalLineToRelative(-1.0f)
                curveTo(27.299f, 17.0f, 32.0f, 12.299f, 32.0f, 6.5f)
                close()
                moveTo(32.5f, 9.86f)
                arcToRelative(11.52f, 11.52f, 0.0f, false, true, -7.64f, 7.64f)
                arcToRelative(11.52f, 11.52f, 0.0f, false, true, 7.64f, 7.639f)
                arcToRelative(11.52f, 11.52f, 0.0f, false, true, 7.639f, -7.639f)
                arcTo(11.52f, 11.52f, 0.0f, false, true, 32.5f, 9.86f)
                moveTo(21.0f, 4.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 25.5f, 9.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, -4.5f)
                lineTo(15.5f, 9.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 20.0f, 4.5f)
                close()
                moveTo(20.5f, 6.791f)
                arcTo(5.52f, 5.52f, 0.0f, false, true, 17.791f, 9.5f)
                arcToRelative(5.52f, 5.52f, 0.0f, false, true, 2.709f, 2.708f)
                arcTo(5.52f, 5.52f, 0.0f, false, true, 23.208f, 9.5f)
                arcTo(5.52f, 5.52f, 0.0f, false, true, 20.5f, 6.791f)
            }
        }
        .build()
        return _speechBubbleSparklesLarge!!
    }

private var _speechBubbleSparklesLarge: ImageVector? = null
