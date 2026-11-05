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

public val SBBIcons.SpeechBubbleSparklesMedium: ImageVector
    get() {
        if (_speechBubbleSparklesMedium != null) {
            return _speechBubbleSparklesMedium!!
        }
        _speechBubbleSparklesMedium = Builder(
            name = "SpeechBubbleSparklesMedium",
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
                pathFillType = NonZero,
            ) {
                moveTo(12.0f, 10.25f)
                lineTo(7.25f, 10.25f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.668f)
                lineToRelative(2.668f, -2.668f)
                lineTo(28.75f, 25.75f)
                lineTo(28.75f, 19.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.75f)
                lineTo(14.832f, 26.75f)
                lineToRelative(-4.082f, 4.082f)
                lineTo(10.75f, 26.75f)
                horizontalLineToRelative(-4.5f)
                lineTo(6.25f, 9.25f)
                lineTo(12.0f, 9.25f)
                close()
                moveTo(25.25f, 4.5f)
                arcTo(7.75f, 7.75f, 0.0f, false, false, 33.0f, 12.25f)
                verticalLineToRelative(1.0f)
                arcTo(7.75f, 7.75f, 0.0f, false, false, 25.25f, 21.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, false, -7.75f, -7.75f)
                verticalLineToRelative(-1.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, false, 7.75f, -7.75f)
                close()
                moveTo(24.75f, 7.416f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, -5.334f, 5.334f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, 5.334f, 5.333f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, 5.333f, -5.333f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, -5.333f, -5.334f)
                moveTo(16.25f, 3.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 3.25f, 3.25f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.25f, 3.25f)
                horizontalLineToRelative(-1.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 12.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 15.25f, 3.0f)
                close()
                moveTo(15.75f, 5.0f)
                arcTo(4.27f, 4.27f, 0.0f, false, true, 14.0f, 6.75f)
                arcToRelative(4.27f, 4.27f, 0.0f, false, true, 1.75f, 1.749f)
                arcToRelative(4.27f, 4.27f, 0.0f, false, true, 1.749f, -1.749f)
                arcTo(4.27f, 4.27f, 0.0f, false, true, 15.75f, 5.0f)
            }
        }
            .build()
        return _speechBubbleSparklesMedium!!
    }

private var _speechBubbleSparklesMedium: ImageVector? = null
