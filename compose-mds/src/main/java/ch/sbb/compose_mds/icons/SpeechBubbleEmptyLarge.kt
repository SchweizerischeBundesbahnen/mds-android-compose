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

public val SBBIcons.SpeechBubbleEmptyLarge: ImageVector
    get() {
        if (_speechBubbleEmptyLarge != null) {
            return _speechBubbleEmptyLarge!!
        }
        _speechBubbleEmptyLarge = Builder(name = "SpeechBubbleEmptyLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.0f, 35.0f)
                horizontalLineTo(19.207f)
                lineTo(14.0f, 40.207f)
                verticalLineTo(35.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(9.0f, 34.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.793f)
                lineTo(18.793f, 34.0f)
                horizontalLineTo(38.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _speechBubbleEmptyLarge!!
    }

private var _speechBubbleEmptyLarge: ImageVector? = null
