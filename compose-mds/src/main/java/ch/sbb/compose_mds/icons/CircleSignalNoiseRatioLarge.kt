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

public val SBBIcons.CircleSignalNoiseRatioLarge: ImageVector
    get() {
        if (_circleSignalNoiseRatioLarge != null) {
            return _circleSignalNoiseRatioLarge!!
        }
        _circleSignalNoiseRatioLarge = Builder(name = "CircleSignalNoiseRatioLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 4.0f)
                curveTo(34.27f, 4.0f, 43.0f, 12.73f, 43.0f, 23.5f)
                reflectiveCurveTo(34.27f, 43.0f, 23.5f, 43.0f)
                reflectiveCurveTo(4.0f, 34.27f, 4.0f, 23.5f)
                reflectiveCurveTo(12.73f, 4.0f, 23.5f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(13.283f, 5.0f, 5.0f, 13.283f, 5.0f, 23.5f)
                reflectiveCurveTo(13.283f, 42.0f, 23.5f, 42.0f)
                reflectiveCurveTo(42.0f, 33.717f, 42.0f, 23.5f)
                reflectiveCurveTo(33.717f, 5.0f, 23.5f, 5.0f)
                moveToRelative(-2.936f, 27.467f)
                horizontalLineToRelative(-2.18f)
                lineTo(23.96f, 17.4f)
                horizontalLineToRelative(2.154f)
                close()
                moveTo(13.672f, 17.114f)
                quadToRelative(1.713f, 0.0f, 2.869f, 0.68f)
                quadToRelative(1.663f, 0.976f, 1.754f, 3.156f)
                horizontalLineToRelative(-2.492f)
                quadToRelative(-0.074f, -0.878f, -0.65f, -1.34f)
                quadToRelative(-0.578f, -0.463f, -1.62f, -0.463f)
                quadToRelative(-0.926f, 0.0f, -1.44f, 0.365f)
                quadToRelative(-0.511f, 0.364f, -0.511f, 1.02f)
                quadToRelative(0.0f, 0.59f, 0.492f, 0.853f)
                quadToRelative(0.475f, 0.263f, 2.41f, 0.737f)
                quadToRelative(2.04f, 0.508f, 2.829f, 1.024f)
                quadToRelative(1.449f, 0.951f, 1.449f, 2.649f)
                quadToRelative(0.0f, 1.86f, -1.46f, 2.933f)
                quadToRelative(-1.285f, 0.943f, -3.482f, 0.944f)
                quadToRelative(-2.443f, 0.0f, -3.795f, -1.115f)
                quadToRelative(-1.353f, -1.114f, -1.402f, -3.172f)
                horizontalLineToRelative(2.608f)
                quadToRelative(0.055f, 1.0f, 0.515f, 1.482f)
                quadToRelative(0.722f, 0.773f, 2.172f, 0.772f)
                quadToRelative(0.984f, -0.001f, 1.559f, -0.385f)
                quadToRelative(0.646f, -0.443f, 0.646f, -1.205f)
                reflectiveQuadToRelative(-0.91f, -1.115f)
                quadToRelative(-0.499f, -0.197f, -2.358f, -0.713f)
                quadToRelative(-1.166f, -0.32f, -1.822f, -0.607f)
                quadToRelative(-0.656f, -0.286f, -1.049f, -0.64f)
                quadToRelative(-0.919f, -0.819f, -0.918f, -2.261f)
                quadToRelative(0.0f, -1.73f, 1.434f, -2.738f)
                quadToRelative(1.22f, -0.86f, 3.172f, -0.86f)
                moveToRelative(21.443f, 8.435f)
                lineToRelative(-0.031f, -8.148f)
                lineTo(37.6f, 17.402f)
                verticalLineToRelative(11.984f)
                horizontalLineToRelative(-2.631f)
                lineTo(29.95f, 21.22f)
                lineToRelative(0.033f, 8.164f)
                lineTo(27.47f, 29.384f)
                lineTo(27.47f, 17.4f)
                horizontalLineToRelative(2.664f)
                close()
            }
        }
        .build()
        return _circleSignalNoiseRatioLarge!!
    }

private var _circleSignalNoiseRatioLarge: ImageVector? = null
