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

public val SBBIcons.SpeechBubbleEmptySmall: ImageVector
    get() {
        if (_speechBubbleEmptySmall != null) {
            return _speechBubbleEmptySmall!!
        }
        _speechBubbleEmptySmall = Builder(
            name = "SpeechBubbleEmptySmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(9.957f)
                lineToRelative(-2.103f, 2.104f)
                lineToRelative(-0.854f, 0.853f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.543f)
                lineToRelative(1.396f, -1.397f)
                lineToRelative(0.147f, -0.146f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
            .build()
        return _speechBubbleEmptySmall!!
    }

private var _speechBubbleEmptySmall: ImageVector? = null
