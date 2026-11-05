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

public val SBBIcons.SpeechBubbleExclamationPointSmall: ImageVector
    get() {
        if (_speechBubbleExclamationPointSmall != null) {
            return _speechBubbleExclamationPointSmall!!
        }
        _speechBubbleExclamationPointSmall = Builder(name = "SpeechBubbleExclamationPointSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                lineTo(9.957f, 18.0f)
                lineTo(7.0f, 20.957f)
                lineTo(7.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.543f)
                lineTo(9.543f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(13.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _speechBubbleExclamationPointSmall!!
    }

private var _speechBubbleExclamationPointSmall: ImageVector? = null
