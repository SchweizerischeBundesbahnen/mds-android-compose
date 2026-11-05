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

public val SBBIcons.HouseLarge: ImageVector
    get() {
        if (_houseLarge != null) {
            return _houseLarge!!
        }
        _houseLarge = Builder(
            name = "HouseLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                pathFillType = EvenOdd,
            ) {
                moveTo(38.0f, 2.0f)
                curveToRelative(-1.495f, 0.0f, -2.87f, 0.628f, -3.55f, 1.638f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -0.95f, -0.138f)
                curveToRelative(-1.547f, 0.0f, -3.0f, 1.026f, -3.0f, 2.5f)
                curveToRelative(0.0f, 0.788f, 0.432f, 1.45f, 1.046f, 1.893f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -0.046f, 0.357f)
                curveToRelative(0.0f, 1.047f, 0.983f, 1.75f, 2.0f, 1.75f)
                reflectiveCurveToRelative(2.0f, -0.703f, 2.0f, -1.75f)
                quadToRelative(0.0f, -0.184f, -0.043f, -0.357f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.406f, -0.36f)
                arcTo(4.95f, 4.95f, 0.0f, false, false, 38.0f, 8.0f)
                curveToRelative(0.785f, 0.0f, 1.516f, -0.177f, 2.133f, -0.47f)
                curveToRelative(0.559f, 0.607f, 1.425f, 0.97f, 2.367f, 0.97f)
                curveToRelative(1.547f, 0.0f, 3.0f, -1.026f, 3.0f, -2.5f)
                reflectiveCurveToRelative(-1.453f, -2.5f, -3.0f, -2.5f)
                quadToRelative(-0.501f, 0.001f, -0.953f, 0.134f)
                curveTo(40.866f, 2.626f, 39.493f, 2.0f, 38.0f, 2.0f)
                moveToRelative(-2.863f, 2.453f)
                curveTo(35.48f, 3.68f, 36.567f, 3.0f, 38.0f, 3.0f)
                curveToRelative(1.432f, 0.0f, 2.519f, 0.68f, 2.863f, 1.453f)
                lineToRelative(0.206f, 0.462f)
                lineToRelative(0.459f, -0.21f)
                curveToRelative(0.283f, -0.13f, 0.612f, -0.205f, 0.972f, -0.205f)
                curveToRelative(1.213f, 0.0f, 2.0f, 0.774f, 2.0f, 1.5f)
                reflectiveCurveToRelative(-0.787f, 1.5f, -2.0f, 1.5f)
                curveToRelative(-0.837f, 0.0f, -1.501f, -0.384f, -1.805f, -0.874f)
                lineToRelative(-0.261f, -0.42f)
                lineToRelative(-0.423f, 0.256f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 38.0f, 7.0f)
                curveToRelative(-0.784f, 0.0f, -1.481f, -0.208f, -2.006f, -0.534f)
                lineToRelative(-0.42f, -0.262f)
                lineToRelative(-0.266f, 0.418f)
                curveToRelative(-0.16f, 0.25f, -0.4f, 0.47f, -0.702f, 0.62f)
                lineToRelative(-0.5f, 0.25f)
                lineToRelative(0.304f, 0.47f)
                quadToRelative(0.091f, 0.143f, 0.09f, 0.288f)
                curveToRelative(0.0f, 0.333f, -0.357f, 0.75f, -1.0f, 0.75f)
                reflectiveCurveToRelative(-1.0f, -0.417f, -1.0f, -0.75f)
                curveToRelative(0.0f, -0.083f, 0.03f, -0.185f, 0.101f, -0.306f)
                lineToRelative(0.268f, -0.457f)
                lineToRelative(-0.47f, -0.242f)
                curveToRelative(-0.585f, -0.3f, -0.899f, -0.773f, -0.899f, -1.245f)
                curveToRelative(0.0f, -0.726f, 0.787f, -1.5f, 2.0f, -1.5f)
                curveToRelative(0.352f, 0.0f, 0.685f, 0.082f, 0.983f, 0.21f)
                lineToRelative(0.453f, 0.194f)
                close()
                moveTo(24.0f, 8.827f)
                lineToRelative(0.334f, 0.301f)
                lineToRelative(6.666f, 6.0f)
                lineTo(31.0f, 12.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.627f)
                lineToRelative(8.334f, 7.501f)
                lineToRelative(0.969f, 0.872f)
                lineTo(41.0f, 28.0f)
                verticalLineToRelative(18.0f)
                lineTo(7.0f, 46.0f)
                lineTo(7.0f, 28.0f)
                lineTo(2.697f, 28.0f)
                lineToRelative(0.969f, -0.872f)
                lineToRelative(20.0f, -18.0f)
                close()
                moveTo(8.0f, 45.0f)
                lineTo(8.0f, 28.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(17.0f)
                lineTo(29.0f, 45.0f)
                lineTo(29.0f, 33.0f)
                lineTo(19.0f, 33.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(42.697f, 27.0f)
                lineTo(35.165f, 20.222f)
                lineTo(35.0f, 20.072f)
                lineTo(35.0f, 13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.373f)
                lineToRelative(-0.834f, -0.751f)
                lineTo(24.0f, 10.172f)
                lineTo(5.303f, 27.0f)
                close()
                moveTo(28.0f, 45.0f)
                lineTo(28.0f, 34.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(32.5f, 33.0f)
                lineTo(32.0f, 33.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.5f)
                moveToRelative(0.5f, 4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.0f, 33.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(26.0f, 40.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _houseLarge!!
    }

private var _houseLarge: ImageVector? = null
