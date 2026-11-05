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

public val SBBIcons.SpeechBubbleExclamationPointLarge: ImageVector
    get() {
        if (_speechBubbleExclamationPointLarge != null) {
            return _speechBubbleExclamationPointLarge!!
        }
        _speechBubbleExclamationPointLarge = Builder(
            name = "SpeechBubbleExclamationPointLarge",
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
                moveTo(41.0f, 35.0f)
                lineTo(19.207f, 35.0f)
                lineTo(14.0f, 40.207f)
                lineTo(14.0f, 35.0f)
                lineTo(8.0f, 35.0f)
                lineTo(8.0f, 12.0f)
                horizontalLineToRelative(33.0f)
                close()
                moveTo(9.0f, 34.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.793f)
                lineTo(18.793f, 34.0f)
                lineTo(40.0f, 34.0f)
                lineTo(40.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                close()
                moveTo(25.0f, 32.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(25.0f, 26.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _speechBubbleExclamationPointLarge!!
    }

private var _speechBubbleExclamationPointLarge: ImageVector? = null
