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

public val SBBIcons.SpeechBubbleEmptySmall: ImageVector
    get() {
        if (_speechBubbleEmptySmall != null) {
            return _speechBubbleEmptySmall!!
        }
        _speechBubbleEmptySmall = Builder(name = "SpeechBubbleEmptySmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(9.957f)
                lineTo(7.0f, 20.957f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.543f)
                lineTo(9.543f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _speechBubbleEmptySmall!!
    }

private var _speechBubbleEmptySmall: ImageVector? = null
