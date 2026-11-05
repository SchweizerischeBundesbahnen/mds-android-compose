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

public val SBBIcons.HandMotionLarge: ImageVector
    get() {
        if (_handMotionLarge != null) {
            return _handMotionLarge!!
        }
        _handMotionLarge = Builder(
            name = "HandMotionLarge",
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
                moveTo(43.0f, 29.5f)
                curveTo(43.0f, 36.956f, 36.956f, 43.0f, 29.5f, 43.0f)
                verticalLineToRelative(-1.0f)
                curveTo(36.404f, 42.0f, 42.0f, 36.404f, 42.0f, 29.5f)
                close()
                moveTo(30.636f, 9.08f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 3.543f, -0.006f)
                curveToRelative(0.407f, 0.403f, 0.643f, 0.912f, 0.715f, 1.438f)
                lineToRelative(0.014f, -0.013f)
                arcToRelative(2.488f, 2.488f, 0.0f, false, true, 3.516f, 3.52f)
                lineToRelative(-0.012f, 0.011f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.417f, 0.705f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 3.537f)
                lineToRelative(-2.836f, 2.834f)
                curveToRelative(0.443f, 0.06f, 0.873f, 0.237f, 1.238f, 0.535f)
                lineToRelative(0.19f, 0.17f)
                lineToRelative(0.17f, 0.19f)
                curveToRelative(0.799f, 0.98f, 0.742f, 2.424f, -0.17f, 3.337f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.37f, 0.37f)
                lineToRelative(-1.001f, 1.0f)
                lineToRelative(-3.229f, 3.227f)
                lineToRelative(-6.721f, 6.717f)
                curveToRelative(-1.468f, 1.468f, -3.288f, 2.558f, -4.725f, 3.278f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -2.338f, 1.018f)
                lineToRelative(-0.146f, 0.053f)
                lineToRelative(-0.04f, 0.013f)
                lineToRelative(-0.01f, 0.004f)
                horizontalLineToRelative(-0.004f)
                verticalLineToRelative(0.002f)
                lineToRelative(-0.294f, 0.097f)
                lineToRelative(-0.219f, -0.219f)
                lineToRelative(-9.9f, -9.9f)
                lineToRelative(-0.202f, -0.202f)
                lineToRelative(0.071f, -0.277f)
                lineToRelative(3.748f, -14.483f)
                arcToRelative(2.482f, 2.482f, 0.0f, false, true, 4.885f, 0.635f)
                lineToRelative(-0.029f, 5.145f)
                close()
                moveTo(33.475f, 9.784f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, -2.132f, 0.003f)
                lineTo(17.744f, 23.384f)
                lineToRelative(-0.86f, 0.86f)
                lineToRelative(0.007f, -1.217f)
                lineToRelative(0.034f, -6.362f)
                arcToRelative(1.482f, 1.482f, 0.0f, false, false, -2.917f, -0.379f)
                lineTo(10.33f, 30.491f)
                lineToRelative(9.474f, 9.475f)
                quadToRelative(0.16f, -0.06f, 0.392f, -0.15f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, 1.73f, -0.78f)
                curveToRelative(1.39f, -0.696f, 3.104f, -1.73f, 4.465f, -3.09f)
                curveToRelative(1.414f, -1.415f, 4.245f, -4.243f, 6.721f, -6.718f)
                lineTo(36.343f, 26.0f)
                lineToRelative(1.37f, -1.37f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, false, 0.0f, -2.112f)
                verticalLineToRelative(-0.001f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, false, -2.11f, 0.0f)
                lineToRelative(-6.38f, 6.36f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.706f, -0.706f)
                lineToRelative(10.605f, -10.606f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, false, -2.121f, -2.123f)
                lineTo(26.394f, 26.05f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(12.03f, -12.03f)
                arcToRelative(1.488f, 1.488f, 0.0f, false, false, -1.99f, -2.206f)
                lineToRelative(-0.113f, 0.101f)
                lineToRelative(-12.048f, 12.015f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(1.152f, -1.149f)
                lineToRelative(9.465f, -9.44f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, -0.002f, -2.14f)
                moveTo(39.0f, 29.5f)
                curveToRelative(0.0f, 5.062f, -4.438f, 9.5f, -9.5f, 9.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(4.51f, 0.0f, 8.5f, -3.99f, 8.5f, -8.5f)
                close()
                moveTo(17.5f, 5.0f)
                curveTo(10.596f, 5.0f, 5.0f, 10.596f, 5.0f, 17.5f)
                lineTo(4.0f, 17.5f)
                curveTo(4.0f, 10.044f, 10.044f, 4.0f, 17.5f, 4.0f)
                close()
                moveTo(17.5f, 9.0f)
                curveTo(12.99f, 9.0f, 9.0f, 12.99f, 9.0f, 17.5f)
                lineTo(8.0f, 17.5f)
                curveTo(8.0f, 12.438f, 12.438f, 8.0f, 17.5f, 8.0f)
                close()
            }
        }
            .build()
        return _handMotionLarge!!
    }

private var _handMotionLarge: ImageVector? = null
