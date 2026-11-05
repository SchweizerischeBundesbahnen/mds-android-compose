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

public val SBBIcons.LocomotiveViaductLarge: ImageVector
    get() {
        if (_locomotiveViaductLarge != null) {
            return _locomotiveViaductLarge!!
        }
        _locomotiveViaductLarge = Builder(
            name = "LocomotiveViaductLarge",
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
                moveTo(21.5f, 5.0f)
                curveToRelative(-0.747f, 0.0f, -1.397f, 0.409f, -1.74f, 1.014f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.118f, 3.954f)
                curveToRelative(0.356f, 0.33f, 0.834f, 0.532f, 1.358f, 0.532f)
                curveToRelative(0.473f, 0.0f, 0.908f, -0.165f, 1.25f, -0.439f)
                curveToRelative(0.342f, 0.274f, 0.777f, 0.439f, 1.25f, 0.439f)
                curveToRelative(0.364f, 0.0f, 0.706f, -0.098f, 1.0f, -0.268f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, 2.437f, -0.342f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.563f, -0.272f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -2.236f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, -1.563f, -0.273f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.614f, -0.432f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.11f, -0.709f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.5f, 5.0f)
                moveTo(28.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.844f, -0.363f)
                lineToRelative(-0.383f, 0.363f)
                lineToRelative(0.383f, 0.363f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 28.0f, 8.5f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                moveToRelative(-8.444f, -1.832f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.942f, 0.39f)
                lineToRelative(-0.042f, 0.751f)
                lineToRelative(0.709f, -0.252f)
                lineToRelative(0.044f, -0.014f)
                lineToRelative(0.256f, -0.078f)
                lineToRelative(0.078f, -0.256f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.914f, 0.0f)
                lineToRelative(0.078f, 0.256f)
                lineToRelative(0.256f, 0.078f)
                curveToRelative(0.25f, 0.075f, 0.46f, 0.247f, 0.584f, 0.473f)
                lineToRelative(0.269f, 0.484f)
                lineToRelative(-0.269f, 0.484f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.541f, 0.261f)
                lineToRelative(-0.334f, -0.298f)
                lineToRelative(-0.334f, 0.298f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, true, -1.5f, -0.193f)
                lineToRelative(-0.416f, -0.626f)
                lineToRelative(-0.416f, 0.627f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.582f, 0.11f)
                lineToRelative(-0.134f, -0.15f)
                lineToRelative(-0.2f, -0.016f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.139f, -1.995f)
                lineToRelative(0.375f, 0.02f)
                close()
                moveTo(28.501f, 10.994f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.993f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-7.0f, -0.006f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(10.999f)
                horizontalLineToRelative(2.267f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, false, 3.465f, 0.0f)
                horizontalLineToRelative(2.535f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, false, 3.465f, 0.0f)
                horizontalLineToRelative(2.536f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.465f, 0.0f)
                horizontalLineToRelative(4.282f)
                lineToRelative(-0.307f, -0.7f)
                lineToRelative(-1.707f, -3.896f)
                lineTo(32.0f, 14.494f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.5f)
                moveToRelative(1.5f, 10.0f)
                horizontalLineToRelative(2.485f)
                lineToRelative(-1.312f, -2.993f)
                lineTo(13.001f, 18.001f)
                verticalLineToRelative(2.993f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveToRelative(1.0f, -3.993f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-5.006f)
                lineToRelative(6.0f, 0.006f)
                verticalLineToRelative(2.993f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(30.001f, 13.994f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(43.999f, 24.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(38.0f)
                close()
                moveTo(13.001f, 29.001f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-12.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                verticalLineToRelative(6.018f)
                quadToRelative(0.483f, -0.572f, 1.001f, -1.107f)
                verticalLineToRelative(-4.911f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                verticalLineToRelative(0.513f)
                curveToRelative(3.245f, -1.626f, 6.97f, -2.513f, 10.998f, -2.513f)
                verticalLineToRelative(1.0f)
                curveToRelative(-9.861f, 0.0f, -17.774f, 5.515f, -21.032f, 14.176f)
                lineToRelative(-0.122f, 0.324f)
                lineTo(6.0f, 42.501f)
                verticalLineToRelative(-13.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.001f, 41.501f)
                verticalLineToRelative(-12.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(32.002f, 30.047f)
                verticalLineToRelative(-1.046f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(3.94f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 4.0f, -2.894f)
                moveToRelative(-7.001f, 6.246f)
                verticalLineToRelative(-7.292f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(1.156f)
                arcTo(23.3f, 23.3f, 0.0f, false, true, 25.0f, 36.293f)
                moveTo(7.0f, 29.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(12.5f)
                lineTo(7.0f, 41.501f)
                close()
                moveTo(21.001f, 20.995f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 23.0f, 20.993f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.999f, 0.002f)
                moveToRelative(-5.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.002f, 1.998f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 19.995f)
                moveToRelative(11.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
            }
        }
            .build()
        return _locomotiveViaductLarge!!
    }

private var _locomotiveViaductLarge: ImageVector? = null
