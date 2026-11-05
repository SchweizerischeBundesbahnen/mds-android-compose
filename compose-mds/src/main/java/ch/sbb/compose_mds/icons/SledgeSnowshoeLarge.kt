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

public val SBBIcons.SledgeSnowshoeLarge: ImageVector
    get() {
        if (_sledgeSnowshoeLarge != null) {
            return _sledgeSnowshoeLarge!!
        }
        _sledgeSnowshoeLarge = Builder(name = "SledgeSnowshoeLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 10.374f)
                arcToRelative(8.504f, 8.504f, 0.0f, false, false, 0.0f, 16.252f)
                verticalLineToRelative(-4.384f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -2.0f, -3.742f)
                curveToRelative(0.0f, -1.56f, 0.794f, -2.935f, 2.0f, -3.742f)
                close()
                moveTo(14.0f, 14.256f)
                curveToRelative(0.47f, -0.166f, 0.974f, -0.256f, 1.5f, -0.256f)
                reflectiveCurveToRelative(1.031f, 0.09f, 1.5f, 0.256f)
                verticalLineToRelative(-4.195f)
                quadToRelative(-0.728f, -0.06f, -1.5f, -0.061f)
                quadToRelative(-0.769f, 0.0f, -1.5f, 0.132f)
                close()
                moveTo(18.0f, 14.758f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 19.973f, 18.0f)
                lineTo(26.0f, 18.0f)
                verticalLineToRelative(-4.83f)
                curveToRelative(-2.418f, -1.382f, -4.938f, -2.568f, -8.0f, -2.998f)
                close()
                moveTo(19.973f, 19.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 18.0f, 22.242f)
                verticalLineToRelative(4.586f)
                curveToRelative(3.063f, -0.43f, 5.583f, -1.616f, 8.001f, -2.998f)
                lineTo(26.001f, 19.0f)
                close()
                moveTo(17.0f, 22.744f)
                curveToRelative(-0.47f, 0.166f, -0.975f, 0.256f, -1.501f, 0.256f)
                reflectiveCurveToRelative(-1.03f, -0.09f, -1.5f, -0.256f)
                verticalLineToRelative(4.124f)
                quadToRelative(0.731f, 0.131f, 1.5f, 0.132f)
                quadToRelative(0.773f, 0.0f, 1.5f, -0.061f)
                close()
                moveTo(27.0f, 23.246f)
                lineTo(27.0f, 19.0f)
                horizontalLineToRelative(8.102f)
                curveToRelative(-2.515f, 0.87f, -4.703f, 2.194f, -6.86f, 3.498f)
                lineToRelative(-0.122f, 0.074f)
                quadToRelative(-0.56f, 0.34f, -1.12f, 0.674f)
                moveTo(41.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-5.04f, 0.0f, -8.596f, -2.15f, -12.304f, -4.393f)
                lineToRelative(-0.057f, -0.035f)
                curveTo(24.92f, 11.324f, 21.05f, 9.0f, 15.5f, 9.0f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 6.0f, 18.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, 9.5f)
                curveToRelative(5.55f, 0.0f, 9.421f, -2.324f, 13.139f, -4.572f)
                lineToRelative(0.057f, -0.035f)
                curveTo(32.404f, 21.15f, 35.96f, 19.0f, 41.0f, 19.0f)
                moveToRelative(-13.999f, -1.0f)
                horizontalLineToRelative(8.102f)
                curveToRelative(-2.515f, -0.87f, -4.703f, -2.194f, -6.86f, -3.498f)
                lineToRelative(-0.122f, -0.074f)
                quadToRelative(-0.56f, -0.34f, -1.12f, -0.674f)
                close()
                moveTo(32.5f, 39.0f)
                curveToRelative(2.773f, 0.0f, 4.914f, -0.453f, 6.364f, -1.597f)
                curveTo(40.343f, 36.236f, 41.0f, 34.435f, 41.0f, 32.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 2.259f, -0.603f, 3.708f, -1.756f, 4.618f)
                curveTo(37.064f, 37.55f, 35.205f, 38.0f, 32.5f, 38.0f)
                horizontalLineToRelative(-1.499f)
                verticalLineToRelative(-4.999f)
                lineTo(34.0f, 33.001f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 32.001f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 38.0f)
                lineTo(6.0f, 38.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(30.001f, 33.001f)
                horizontalLineToRelative(-6.0f)
                lineTo(24.001f, 38.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(23.001f, 33.001f)
                lineTo(23.001f, 38.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-4.999f)
                close()
                moveTo(16.001f, 33.001f)
                lineTo(10.0f, 33.001f)
                lineTo(10.0f, 38.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(12.0f, 18.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
            }
        }
        .build()
        return _sledgeSnowshoeLarge!!
    }

private var _sledgeSnowshoeLarge: ImageVector? = null
