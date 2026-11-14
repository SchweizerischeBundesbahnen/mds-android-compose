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

public val SBBIcons.SpeechBubbleEmptyMedium: ImageVector
    get() {
        if (_speechBubbleEmptyMedium != null) {
            return _speechBubbleEmptyMedium!!
        }
        _speechBubbleEmptyMedium = Builder(name = "SpeechBubbleEmptyMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.75f, 9.25f)
                verticalLineToRelative(17.5f)
                lineTo(14.832f, 26.75f)
                lineToRelative(-4.082f, 4.082f)
                lineTo(10.75f, 26.75f)
                horizontalLineToRelative(-4.5f)
                lineTo(6.25f, 9.25f)
                close()
                moveTo(7.25f, 25.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.668f)
                lineToRelative(2.668f, -2.668f)
                lineTo(28.75f, 25.75f)
                verticalLineToRelative(-15.5f)
                lineTo(7.25f, 10.25f)
                close()
            }
        }
        .build()
        return _speechBubbleEmptyMedium!!
    }

private var _speechBubbleEmptyMedium: ImageVector? = null
