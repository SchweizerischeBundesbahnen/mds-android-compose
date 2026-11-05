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
                moveTo(5.25f, 7.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(4.082f)
                lineToRelative(0.854f, -0.853f)
                lineToRelative(3.228f, -3.229f)
                horizontalLineToRelative(0.418f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(8.918f)
                lineToRelative(3.228f, 3.229f)
                lineToRelative(0.854f, 0.853f)
                lineTo(26.75f, 26.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-4.5f)
                lineTo(5.25f, 7.75f)
                moveToRelative(18.5f, 5.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(2.0f)
                lineTo(27.0f, 19.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(8.332f)
                lineToRelative(0.147f, 0.146f)
                lineToRelative(2.521f, 2.522f)
                lineTo(25.75f, 25.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-12.5f)
                close()
                moveTo(5.75f, 21.25f)
                lineTo(5.75f, 8.75f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-9.832f)
                lineToRelative(-0.147f, 0.146f)
                lineToRelative(-2.521f, 2.522f)
                lineTo(10.25f, 21.25f)
                horizontalLineToRelative(-4.5f)
                moveToRelative(3.25f, -8.0f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 12.25f)
                close()
                moveTo(18.0f, 16.25f)
                lineTo(9.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _twoSpeechBubblesMedium!!
    }

private var _twoSpeechBubblesMedium: ImageVector? = null
