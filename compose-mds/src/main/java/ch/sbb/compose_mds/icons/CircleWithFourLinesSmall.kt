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

public val SBBIcons.CircleWithFourLinesSmall: ImageVector
    get() {
        if (_circleWithFourLinesSmall != null) {
            return _circleWithFourLinesSmall!!
        }
        _circleWithFourLinesSmall = Builder(
            name = "CircleWithFourLinesSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
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
                moveTo(13.0f, 6.524f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.476f, 11.0f)
                lineTo(22.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.524f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 16.475f)
                lineTo(13.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.525f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.524f, 12.0f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.524f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 6.524f)
                lineTo(12.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(12.5f, 7.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
            }
        }
            .build()
        return _circleWithFourLinesSmall!!
    }

private var _circleWithFourLinesSmall: ImageVector? = null
