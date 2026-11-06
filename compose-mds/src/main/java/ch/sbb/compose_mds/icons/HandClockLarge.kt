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

public val SBBIcons.HandClockLarge: ImageVector
    get() {
        if (_handClockLarge != null) {
            return _handClockLarge!!
        }
        _handClockLarge = Builder(name = "HandClockLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.51f, 6.0f)
                arcTo(2.49f, 2.49f, 0.0f, false, true, 35.0f, 8.488f)
                verticalLineToRelative(0.015f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.5f, -0.503f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 39.0f, 10.501f)
                verticalLineToRelative(4.009f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, 3.999f, 1.983f)
                verticalLineToRelative(0.524f)
                lineToRelative(-0.001f, 1.415f)
                verticalLineToRelative(4.565f)
                lineToRelative(-0.003f, 9.503f)
                curveToRelative(0.0f, 2.075f, -0.516f, 4.133f, -1.023f, 5.658f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -0.933f, 2.373f)
                quadToRelative(-0.042f, 0.093f, -0.066f, 0.14f)
                lineToRelative(-0.024f, 0.048f)
                verticalLineToRelative(0.003f)
                horizontalLineToRelative(-0.002f)
                verticalLineToRelative(0.002f)
                lineTo(40.81f, 41.0f)
                horizontalLineTo(26.212f)
                lineToRelative(-0.145f, -0.246f)
                lineToRelative(-7.59f, -12.892f)
                verticalLineToRelative(0.001f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, 0.538f, -3.157f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, true, 3.364f, 0.151f)
                lineToRelative(3.619f, 3.659f)
                lineTo(26.0f, 10.503f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 2.501f, -2.51f)
                lineToRelative(0.258f, 0.012f)
                curveToRelative(0.473f, 0.046f, 0.905f, 0.226f, 1.264f, 0.498f)
                lineToRelative(0.001f, -0.019f)
                lineToRelative(0.013f, -0.254f)
                arcTo(2.487f, 2.487f, 0.0f, false, true, 32.511f, 6.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.82f, 0.0f, -1.485f, 0.665f, -1.486f, 1.485f)
                lineTo(31.0f, 25.501f)
                lineToRelative(-1.0f, -0.002f)
                lineToRelative(0.021f, -14.993f)
                lineToRelative(-0.007f, -0.155f)
                arcTo(1.51f, 1.51f, 0.0f, false, false, 28.66f, 9.0f)
                lineToRelative(-0.155f, -0.007f)
                arcTo(1.51f, 1.51f, 0.0f, false, false, 27.0f, 10.503f)
                lineToRelative(-0.002f, 19.23f)
                verticalLineToRelative(1.215f)
                lineToRelative(-0.855f, -0.864f)
                lineToRelative(-4.474f, -4.523f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, false, -1.896f, -0.177f)
                lineToRelative(-0.114f, 0.087f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, false, -0.385f, 1.765f)
                lineToRelative(0.064f, 0.12f)
                lineTo(26.784f, 40.0f)
                horizontalLineToRelative(13.398f)
                quadToRelative(0.07f, -0.154f, 0.17f, -0.384f)
                curveToRelative(0.182f, -0.427f, 0.427f, -1.04f, 0.671f, -1.774f)
                curveToRelative(0.49f, -1.475f, 0.972f, -3.418f, 0.972f, -5.342f)
                lineToRelative(0.002f, -9.504f)
                lineToRelative(0.001f, -4.564f)
                lineToRelative(0.001f, -1.415f)
                verticalLineToRelative(-0.525f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, false, -2.985f, -0.002f)
                lineTo(39.0f, 25.501f)
                lineToRelative(-1.0f, -0.001f)
                verticalLineTo(10.501f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, false, -3.001f, 0.0f)
                verticalLineTo(25.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.488f)
                curveToRelative(0.0f, -0.822f, -0.666f, -1.488f, -1.488f, -1.488f)
                moveTo(17.5f, 6.0f)
                curveToRelative(2.247f, 0.0f, 4.367f, 0.55f, 6.231f, 1.521f)
                lineToRelative(-0.462f, 0.887f)
                arcTo(12.44f, 12.44f, 0.0f, false, false, 17.5f, 7.0f)
                curveTo(10.597f, 7.0f, 5.0f, 12.597f, 5.0f, 19.5f)
                curveTo(5.0f, 26.405f, 10.597f, 32.0f, 17.5f, 32.0f)
                verticalLineToRelative(1.0f)
                curveTo(10.045f, 33.0f, 4.0f, 26.957f, 4.0f, 19.5f)
                curveTo(4.0f, 12.045f, 10.045f, 6.0f, 17.5f, 6.0f)
                moveTo(17.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _handClockLarge!!
    }

private var _handClockLarge: ImageVector? = null
