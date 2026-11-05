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

public val SBBIcons.SpeechBubbleSmall: ImageVector
    get() {
        if (_speechBubbleSmall != null) {
            return _speechBubbleSmall!!
        }
        _speechBubbleSmall = Builder(name = "SpeechBubbleSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5f, 6.0f)
                lineTo(4.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.957f)
                lineToRelative(0.854f, -0.853f)
                lineTo(9.957f, 18.0f)
                lineTo(20.0f, 18.0f)
                lineTo(20.0f, 6.0f)
                lineTo(4.5f, 6.0f)
                moveTo(5.0f, 17.0f)
                lineTo(5.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(10.0f)
                lineTo(9.543f, 17.0f)
                lineToRelative(-0.147f, 0.146f)
                lineTo(8.0f, 18.543f)
                lineTo(8.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                moveToRelative(2.0f, -7.021f)
                horizontalLineToRelative(10.021f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 8.979f)
                close()
                moveTo(17.0f, 12.063f)
                lineTo(6.979f, 12.063f)
                verticalLineToRelative(-1.0f)
                lineTo(17.0f, 11.063f)
                close()
                moveTo(6.979f, 14.063f)
                horizontalLineToRelative(7.979f)
                verticalLineToRelative(-1.0f)
                lineTo(6.979f, 13.063f)
                close()
            }
        }
        .build()
        return _speechBubbleSmall!!
    }

private var _speechBubbleSmall: ImageVector? = null
