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

public val SBBIcons.StrollerLarge: ImageVector
    get() {
        if (_strollerLarge != null) {
            return _strollerLarge!!
        }
        _strollerLarge = Builder(
            name = "StrollerLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(25.507f, 9.0f)
                curveTo(33.51f, 9.0f, 40.0f, 15.489f, 40.0f, 23.493f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.016f)
                lineTo(39.984f, 29.5f)
                curveToRelative(0.0f, 2.576f, -1.81f, 4.983f, -4.132f, 5.994f)
                arcTo(3.497f, 3.497f, 0.0f, false, true, 32.5f, 40.0f)
                arcToRelative(3.497f, 3.497f, 0.0f, false, true, -3.464f, -4.0f)
                horizontalLineToRelative(-7.072f)
                quadToRelative(0.035f, 0.245f, 0.036f, 0.5f)
                curveToRelative(0.0f, 1.935f, -1.565f, 3.5f, -3.5f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.354f, -4.505f)
                curveToRelative(-2.327f, -1.01f, -4.149f, -3.417f, -4.149f, -5.995f)
                lineTo(10.997f, 18.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.997f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(12.994f)
                lineToRelative(0.016f, -13.501f)
                lineTo(25.007f, 9.0f)
                close()
                moveTo(18.5f, 34.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, true, false, 0.002f, 5.002f)
                arcTo(2.501f, 2.501f, 0.0f, false, false, 18.5f, 34.0f)
                moveToRelative(14.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.383f, 1.117f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.117f, 2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                moveToRelative(-14.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(14.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-14.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(14.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-20.503f, -6.5f)
                curveToRelative(0.0f, 2.138f, 1.553f, 4.224f, 3.571f, 5.088f)
                arcToRelative(3.499f, 3.499f, 0.0f, false, true, 6.095f, 0.412f)
                horizontalLineToRelative(7.674f)
                arcToRelative(3.499f, 3.499f, 0.0f, false, true, 6.094f, -0.414f)
                curveToRelative(2.01f, -0.863f, 3.553f, -2.946f, 3.553f, -5.086f)
                lineTo(38.984f, 24.0f)
                lineTo(11.997f, 24.0f)
                close()
                moveTo(25.991f, 22.993f)
                lineTo(38.99f, 22.993f)
                curveToRelative(-0.257f, -7.055f, -5.928f, -12.727f, -12.983f, -12.983f)
                close()
            }
        }
            .build()
        return _strollerLarge!!
    }

private var _strollerLarge: ImageVector? = null
