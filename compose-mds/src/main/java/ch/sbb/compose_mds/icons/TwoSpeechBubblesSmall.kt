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

public val SBBIcons.TwoSpeechBubblesSmall: ImageVector
    get() {
        if (_twoSpeechBubblesSmall != null) {
            return _twoSpeechBubblesSmall!!
        }
        _twoSpeechBubblesSmall = Builder(name = "TwoSpeechBubblesSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 5.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.957f)
                lineToRelative(0.854f, -0.853f)
                lineTo(8.957f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.043f)
                lineToRelative(2.103f, 2.104f)
                lineToRelative(0.854f, 0.853f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(16.0f, 5.0f)
                lineTo(3.5f, 5.0f)
                moveTo(16.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(16.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.543f)
                lineToRelative(-1.396f, -1.397f)
                lineToRelative(-0.147f, -0.146f)
                lineTo(10.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(4.0f, 14.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(8.0f)
                lineTo(8.543f, 14.0f)
                lineToRelative(-0.147f, 0.146f)
                lineTo(7.0f, 15.543f)
                lineTo(7.0f, 14.0f)
                lineTo(4.0f, 14.0f)
                moveToRelative(2.0f, -5.0f)
                horizontalLineToRelative(7.0f)
                lineTo(13.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                close()
                moveTo(12.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _twoSpeechBubblesSmall!!
    }

private var _twoSpeechBubblesSmall: ImageVector? = null
