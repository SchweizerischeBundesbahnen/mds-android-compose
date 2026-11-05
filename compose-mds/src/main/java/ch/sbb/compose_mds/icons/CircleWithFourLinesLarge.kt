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

public val SBBIcons.CircleWithFourLinesLarge: ImageVector
    get() {
        if (_circleWithFourLinesLarge != null) {
            return _circleWithFourLinesLarge!!
        }
        _circleWithFourLinesLarge = Builder(
            name = "CircleWithFourLinesLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
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
                moveTo(25.0f, 14.013f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 33.986f, 23.0f)
                lineTo(44.0f, 23.0f)
                verticalLineToRelative(1.0f)
                lineTo(33.986f, 24.0f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 25.0f, 32.986f)
                lineTo(25.0f, 43.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.0f, 32.986f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 15.014f, 24.0f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.014f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 24.0f, 14.013f)
                lineTo(24.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(24.5f, 15.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -8.5f, 8.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 8.5f, 8.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 8.5f, -8.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -8.5f, -8.5f)
            }
        }
            .build()
        return _circleWithFourLinesLarge!!
    }

private var _circleWithFourLinesLarge: ImageVector? = null
