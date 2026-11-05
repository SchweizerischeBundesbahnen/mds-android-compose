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

public val SBBIcons.HandClockSmall: ImageVector
    get() {
        if (_handClockSmall != null) {
            return _handClockSmall!!
        }
        _handClockSmall = Builder(
            name = "HandClockSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(16.506f, 3.0f)
                curveToRelative(0.69f, 0.0f, 1.27f, 0.47f, 1.44f, 1.106f)
                arcTo(1.497f, 1.497f, 0.0f, false, true, 20.0f, 5.5f)
                verticalLineToRelative(1.588f)
                arcToRelative(1.497f, 1.497f, 0.0f, false, true, 2.0f, 1.41f)
                verticalLineToRelative(3.25f)
                lineToRelative(-0.003f, 4.752f)
                curveToRelative(0.0f, 1.075f, -0.267f, 2.132f, -0.524f, 2.907f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.477f, 1.214f)
                quadToRelative(-0.022f, 0.048f, -0.035f, 0.073f)
                lineToRelative(-0.01f, 0.02f)
                quadToRelative(0.0f, 0.004f, -0.003f, 0.006f)
                verticalLineToRelative(0.002f)
                lineTo(20.81f, 21.0f)
                horizontalLineToRelative(-7.597f)
                lineToRelative(-0.144f, -0.246f)
                lineToRelative(-3.796f, -6.445f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, true, 2.344f, -1.806f)
                lineTo(13.0f, 13.898f)
                lineTo(13.0f, 5.501f)
                arcToRelative(1.505f, 1.505f, 0.0f, false, true, 2.064f, -1.397f)
                arcTo(1.494f, 1.494f, 0.0f, false, true, 16.506f, 3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, false, -0.494f, 0.493f)
                lineTo(16.0f, 13.001f)
                lineToRelative(-1.0f, -0.002f)
                lineToRelative(0.01f, -7.497f)
                arcTo(0.505f, 0.505f, 0.0f, true, false, 14.0f, 5.5f)
                verticalLineToRelative(9.615f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-0.356f, 0.352f)
                lineToRelative(-2.238f, -2.262f)
                arcToRelative(0.491f, 0.491f, 0.0f, false, false, -0.772f, 0.595f)
                lineTo(13.785f, 20.0f)
                horizontalLineToRelative(6.394f)
                lineToRelative(0.017f, -0.04f)
                curveToRelative(0.09f, -0.209f, 0.209f, -0.509f, 0.328f, -0.868f)
                curveToRelative(0.242f, -0.725f, 0.473f, -1.668f, 0.473f, -2.592f)
                lineTo(21.0f, 11.748f)
                verticalLineToRelative(-2.99f)
                lineTo(21.0f, 8.564f)
                verticalLineToRelative(-0.068f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, -0.993f, 0.0f)
                lineTo(20.0f, 13.0f)
                lineTo(19.0f, 13.0f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(4.494f)
                arcTo(0.494f, 0.494f, 0.0f, false, false, 16.505f, 4.0f)
                moveTo(9.0f, 3.0f)
                curveToRelative(1.165f, 0.0f, 2.264f, 0.285f, 3.232f, 0.79f)
                lineToRelative(-0.463f, 0.886f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 9.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 9.0f, 3.0f)
                moveToRelative(5.0f, 13.332f)
                lineToRelative(-0.856f, -0.864f)
                lineToRelative(0.355f, -0.352f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(9.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _handClockSmall!!
    }

private var _handClockSmall: ImageVector? = null
