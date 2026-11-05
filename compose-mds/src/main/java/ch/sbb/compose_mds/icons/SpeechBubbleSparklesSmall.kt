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

public val SBBIcons.SpeechBubbleSparklesSmall: ImageVector
    get() {
        if (_speechBubbleSparklesSmall != null) {
            return _speechBubbleSparklesSmall!!
        }
        _speechBubbleSparklesSmall = Builder(name = "SpeechBubbleSparklesSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.543f)
                lineTo(9.543f, 17.0f)
                lineTo(19.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                lineTo(9.957f, 18.0f)
                lineTo(7.0f, 20.957f)
                lineTo(7.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                lineTo(11.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                close()
                moveTo(16.5f, 5.398f)
                arcTo(6.02f, 6.02f, 0.0f, false, true, 13.398f, 8.5f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, true, 3.102f, 3.1f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, true, 3.1f, -3.1f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, true, -3.1f, -3.102f)
                moveTo(11.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(8.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(10.5f, 3.656f)
                curveToRelative(-0.222f, 0.335f, -0.51f, 0.622f, -0.844f, 0.844f)
                curveToRelative(0.335f, 0.222f, 0.622f, 0.508f, 0.844f, 0.843f)
                curveToRelative(0.222f, -0.334f, 0.509f, -0.621f, 0.843f, -0.843f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.843f, -0.844f)
            }
        }
        .build()
        return _speechBubbleSparklesSmall!!
    }

private var _speechBubbleSparklesSmall: ImageVector? = null
