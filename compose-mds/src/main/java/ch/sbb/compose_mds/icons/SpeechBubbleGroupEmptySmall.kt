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

public val SBBIcons.SpeechBubbleGroupEmptySmall: ImageVector
    get() {
        if (_speechBubbleGroupEmptySmall != null) {
            return _speechBubbleGroupEmptySmall!!
        }
        _speechBubbleGroupEmptySmall = Builder(name = "SpeechBubbleGroupEmptySmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 4.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.957f, 10.0f)
                lineToRelative(-2.103f, 2.104f)
                lineToRelative(-0.854f, 0.853f)
                lineTo(4.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                lineTo(3.0f, 4.0f)
                moveToRelative(1.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.543f)
                lineToRelative(1.396f, -1.397f)
                lineTo(6.543f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(7.0f, 12.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.957f)
                lineToRelative(-0.854f, -0.853f)
                lineTo(12.043f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.457f)
                lineToRelative(0.147f, 0.146f)
                lineTo(14.0f, 19.543f)
                lineTo(14.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(14.5f, 5.0f)
                lineTo(14.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.043f)
                lineToRelative(2.103f, 2.104f)
                lineToRelative(0.854f, 0.853f)
                lineTo(20.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 5.0f)
                horizontalLineToRelative(-6.5f)
                moveTo(20.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.543f)
                lineToRelative(-1.396f, -1.397f)
                lineTo(17.457f, 9.0f)
                lineTo(15.0f, 9.0f)
                lineTo(15.0f, 6.0f)
                close()
            }
        }
        .build()
        return _speechBubbleGroupEmptySmall!!
    }

private var _speechBubbleGroupEmptySmall: ImageVector? = null
