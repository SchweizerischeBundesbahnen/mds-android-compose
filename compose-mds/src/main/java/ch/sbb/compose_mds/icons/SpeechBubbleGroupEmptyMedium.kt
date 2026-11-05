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
        _speechBubbleGroupEmptyMedium = Builder(
            name = "SpeechBubbleGroupEmptyMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
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
                moveTo(4.75f, 6.25f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-7.418f)
                lineToRelative(-3.228f, 3.229f)
                lineToRelative(-0.854f, 0.853f)
                lineTo(6.25f, 14.75f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-8.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.668f)
                lineToRelative(2.521f, -2.522f)
                lineToRelative(0.147f, -0.146f)
                horizontalLineToRelative(6.832f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(10.75f, 18.25f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.082f)
                lineToRelative(-0.854f, -0.853f)
                lineToRelative(-3.228f, -3.229f)
                lineTo(10.75f, 28.25f)
                verticalLineToRelative(-10.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(6.832f)
                lineToRelative(0.147f, 0.146f)
                lineToRelative(2.521f, 2.522f)
                lineTo(21.25f, 27.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(21.75f, 7.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.418f)
                lineToRelative(3.228f, 3.229f)
                lineToRelative(0.854f, 0.853f)
                lineTo(29.75f, 14.75f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-9.5f)
                moveToRelative(0.5f, 6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.668f)
                lineToRelative(-2.521f, -2.522f)
                lineToRelative(-0.147f, -0.146f)
                lineTo(22.25f, 13.75f)
            }
        }
            .build()
        return _speechBubbleGroupEmptyMedium!!
    }

private var _speechBubbleGroupEmptyMedium: ImageVector? = null
