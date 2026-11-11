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

public val SBBIcons.TwoSpeechBubblesMedium: ImageVector
    get() {
        if (_twoSpeechBubblesMedium != null) {
            return _twoSpeechBubblesMedium!!
        }
        _twoSpeechBubblesMedium = Builder(name = "TwoSpeechBubblesMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.75f, 8.75f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-9.832f)
                lineToRelative(-2.668f, 2.668f)
                lineTo(10.25f, 21.25f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(14.75f, 22.25f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.5f)
                lineTo(27.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(2.668f)
                lineToRelative(-2.668f, -2.668f)
                lineTo(14.75f, 25.75f)
                close()
                moveTo(13.75f, 22.25f)
                horizontalLineToRelative(-0.418f)
                lineTo(9.25f, 26.332f)
                lineTo(9.25f, 22.25f)
                horizontalLineToRelative(-4.5f)
                lineTo(4.75f, 7.75f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(4.082f)
                lineToRelative(-4.082f, -4.082f)
                lineTo(13.75f, 26.75f)
                close()
                moveTo(19.5f, 13.25f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 12.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 15.25f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _twoSpeechBubblesMedium!!
    }

private var _twoSpeechBubblesMedium: ImageVector? = null
