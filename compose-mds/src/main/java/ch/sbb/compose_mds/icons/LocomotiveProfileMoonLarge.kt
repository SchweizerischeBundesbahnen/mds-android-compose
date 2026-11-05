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

public val SBBIcons.LocomotiveProfileMoonLarge: ImageVector
    get() {
        if (_locomotiveProfileMoonLarge != null) {
            return _locomotiveProfileMoonLarge!!
        }
        _locomotiveProfileMoonLarge = Builder(
            name = "LocomotiveProfileMoonLarge",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(37.003f, 3.999f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(38.663f, 4.499f)
                curveToRelative(0.332f, 0.222f, 0.619f, 0.508f, 0.84f, 0.841f)
                curveToRelative(0.222f, -0.333f, 0.508f, -0.62f, 0.841f, -0.841f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.84f, -0.841f)
                curveToRelative(-0.222f, 0.333f, -0.509f, 0.62f, -0.842f, 0.841f)
                moveToRelative(-3.791f, -0.797f)
                lineToRelative(-0.342f, 0.965f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -0.349f, 1.965f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, false, 6.187f, 6.187f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.966f, -0.35f)
                lineToRelative(0.964f, -0.34f)
                lineToRelative(-0.324f, 0.97f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, true, -8.763f, 4.628f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, true, -4.938f, -4.938f)
                arcTo(7.172f, 7.172f, 0.0f, false, true, 33.9f, 4.026f)
                close()
                moveTo(33.309f, 5.36f)
                arcToRelative(6.174f, 6.174f, 0.0f, false, false, -3.074f, 7.155f)
                close()
                moveTo(33.309f, 5.36f)
                quadToRelative(-0.12f, 0.625f, -0.128f, 1.263f)
                verticalLineToRelative(0.006f)
                arcToRelative(7.19f, 7.19f, 0.0f, false, false, 7.19f, 7.189f)
                horizontalLineToRelative(0.006f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 1.262f, -0.128f)
                arcToRelative(6.17f, 6.17f, 0.0f, false, true, -9.831f, 1.501f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -1.573f, -2.676f)
                close()
                moveTo(10.04f, 19.0f)
                lineTo(17.0f, 19.0f)
                curveToRelative(1.91f, 0.001f, 4.2f, 0.757f, 6.532f, 1.939f)
                curveToRelative(2.341f, 1.187f, 4.77f, 2.829f, 6.97f, 4.658f)
                curveToRelative(2.197f, 1.828f, 4.18f, 3.855f, 5.618f, 5.82f)
                curveToRelative(1.425f, 1.945f, 2.373f, 3.903f, 2.38f, 5.58f)
                verticalLineToRelative(0.011f)
                curveToRelative(-0.017f, 0.91f, -0.454f, 1.692f, -1.254f, 2.224f)
                curveToRelative(-0.781f, 0.52f, -1.885f, 0.786f, -3.25f, 0.767f)
                horizontalLineToRelative(-3.803f)
                lineToRelative(0.781f, 2.343f)
                lineToRelative(0.22f, 0.658f)
                horizontalLineToRelative(-9.531f)
                curveToRelative(-0.178f, 0.375f, -0.42f, 0.713f, -0.713f, 1.0f)
                lineTo(46.0f, 44.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 45.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.05f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.713f, -1.0f)
                lineTo(2.0f, 43.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.035f)
                arcToRelative(3.43f, 3.43f, 0.0f, false, true, 0.31f, -2.001f)
                lineTo(2.0f, 39.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(32.007f)
                curveToRelative(1.246f, 0.018f, 2.128f, -0.229f, 2.686f, -0.6f)
                curveToRelative(0.538f, -0.358f, 0.795f, -0.841f, 0.807f, -1.403f)
                curveToRelative(-0.008f, -1.35f, -0.795f, -3.09f, -2.187f, -4.989f)
                lineTo(35.308f, 32.0f)
                lineTo(26.0f, 32.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.128f)
                curveToRelative(-1.654f, -1.232f, -3.379f, -2.323f, -5.049f, -3.17f)
                curveToRelative(-2.275f, -1.153f, -4.4f, -1.829f, -6.08f, -1.83f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.76f)
                lineToRelative(1.463f, -1.83f)
                lineTo(5.882f, 15.0f)
                horizontalLineToRelative(-0.881f)
                curveToRelative(-0.068f, 0.0f, -0.195f, 0.057f, -0.356f, 0.213f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.216f, 0.251f)
                lineToRelative(-0.01f, 0.014f)
                verticalLineToRelative(0.001f)
                lineTo(4.0f, 15.206f)
                lineToRelative(-0.42f, -0.272f)
                horizontalLineToRelative(0.001f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(0.002f, -0.003f)
                lineToRelative(0.007f, -0.01f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.094f, -0.129f)
                curveToRelative(0.062f, -0.079f, 0.152f, -0.186f, 0.264f, -0.295f)
                curveToRelative(0.203f, -0.196f, 0.575f, -0.493f, 1.05f, -0.494f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.373f, 1.202f)
                curveToRelative(-0.137f, -0.139f, -0.264f, -0.203f, -0.369f, -0.202f)
                horizontalLineToRelative(-0.885f)
                lineToRelative(3.106f, 1.553f)
                lineToRelative(0.553f, 0.276f)
                lineToRelative(-0.387f, 0.483f)
                close()
                moveTo(21.965f, 42.0f)
                horizontalLineToRelative(7.841f)
                lineToRelative(-0.667f, -2.001f)
                horizontalLineToRelative(-7.484f)
                arcToRelative(3.43f, 3.43f, 0.0f, false, true, 0.31f, 2.001f)
                moveTo(15.0f, 41.5f)
                quadToRelative(0.0f, 0.255f, 0.035f, 0.5f)
                horizontalLineToRelative(-5.07f)
                arcToRelative(3.43f, 3.43f, 0.0f, false, false, -0.31f, -2.001f)
                horizontalLineToRelative(5.69f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 15.0f, 41.5f)
                moveTo(8.95f, 44.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.713f, -1.0f)
                horizontalLineToRelative(5.674f)
                curveToRelative(0.178f, 0.375f, 0.42f, 0.713f, 0.713f, 1.0f)
                close()
                moveTo(4.514f, 39.999f)
                horizontalLineToRelative(3.972f)
                curveToRelative(0.322f, 0.421f, 0.514f, 0.938f, 0.514f, 1.501f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                curveToRelative(0.0f, -0.563f, 0.192f, -1.08f, 0.514f, -1.501f)
                moveToRelative(12.0f, 0.0f)
                arcTo(2.46f, 2.46f, 0.0f, false, false, 16.0f, 41.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                curveToRelative(0.0f, -0.563f, -0.192f, -1.08f, -0.514f, -1.501f)
                close()
                moveTo(29.862f, 26.365f)
                curveToRelative(1.77f, 1.473f, 3.384f, 3.067f, 4.67f, 4.635f)
                lineTo(27.0f, 31.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.416f)
                quadToRelative(0.224f, 0.18f, 0.446f, 0.366f)
                moveTo(12.5f, 25.0f)
                lineTo(12.0f, 25.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-9.5f)
                moveToRelative(0.5f, 6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(9.0f, 26.0f)
                lineTo(2.0f, 26.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                lineTo(2.0f, 32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(42.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(43.323f, 7.5f)
                quadToRelative(0.095f, 0.082f, 0.177f, 0.177f)
                quadToRelative(0.082f, -0.095f, 0.177f, -0.177f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.177f, -0.177f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.177f, 0.177f)
            }
        }
            .build()
        return _locomotiveProfileMoonLarge!!
    }

private var _locomotiveProfileMoonLarge: ImageVector? = null
