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

public val SBBIcons.SpeechBubbleGroupEmptyMedium: ImageVector
    get() {
        if (_speechBubbleGroupEmptyMedium != null) {
            return _speechBubbleGroupEmptyMedium!!
        }
        _speechBubbleGroupEmptyMedium = Builder(name = "SpeechBubbleGroupEmptyMedium", defaultWidth
                = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.75f, 6.25f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-7.418f)
                lineTo(6.25f, 18.832f)
                lineTo(6.25f, 14.75f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-8.5f)
                close()
                moveTo(5.75f, 13.75f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.668f)
                lineToRelative(2.668f, -2.668f)
                horizontalLineToRelative(6.832f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(25.25f, 18.25f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.082f)
                lineToRelative(-4.082f, -4.082f)
                lineTo(10.75f, 28.25f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(11.75f, 27.25f)
                horizontalLineToRelative(6.832f)
                lineToRelative(2.668f, 2.668f)
                lineTo(21.25f, 27.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-12.5f)
                close()
                moveTo(31.25f, 14.75f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.418f)
                lineToRelative(4.082f, 4.082f)
                lineTo(29.75f, 14.75f)
                close()
                moveTo(26.082f, 13.75f)
                lineTo(22.25f, 13.75f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.668f)
                close()
            }
        }
        .build()
        return _speechBubbleGroupEmptyMedium!!
    }

private var _speechBubbleGroupEmptyMedium: ImageVector? = null
