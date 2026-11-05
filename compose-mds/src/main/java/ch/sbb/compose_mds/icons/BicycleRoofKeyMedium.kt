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

public val SBBIcons.BicycleRoofKeyMedium: ImageVector
    get() {
        if (_bicycleRoofKeyMedium != null) {
            return _bicycleRoofKeyMedium!!
        }
        _bicycleRoofKeyMedium = Builder(name = "BicycleRoofKeyMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.25f, 6.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.373f, -2.0f)
                horizontalLineToRelative(7.834f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(1.476f, 1.476f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-1.523f, 1.524f)
                lineToRelative(-0.146f, 0.146f)
                lineTo(9.623f, 8.75f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, -6.372f, -2.0f)
                moveToRelative(6.855f, 1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(6.938f)
                lineToRelative(0.976f, 0.977f)
                lineToRelative(-1.023f, 1.023f)
                close()
                moveTo(6.75f, 4.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(17.113f, 7.27f)
                lineToRelative(0.222f, -0.064f)
                lineToRelative(0.192f, 0.128f)
                lineToRelative(9.0f, 6.0f)
                lineToRelative(-0.554f, 0.832f)
                lineToRelative(-8.808f, -5.872f)
                lineToRelative(-20.778f, 5.937f)
                lineToRelative(-0.274f, -0.962f)
                close()
                moveTo(8.75f, 28.492f)
                arcToRelative(3.255f, 3.255f, 0.0f, false, true, 4.376f, -3.049f)
                lineToRelative(-1.563f, 2.813f)
                lineToRelative(0.874f, 0.486f)
                lineTo(14.0f, 25.933f)
                arcTo(3.247f, 3.247f, 0.0f, false, true, 12.0f, 31.742f)
                curveToRelative(-1.79f, 0.0f, -3.25f, -1.46f, -3.25f, -3.25f)
                moveToRelative(5.739f, -3.443f)
                arcTo(4.248f, 4.248f, 0.0f, false, true, 12.0f, 32.743f)
                arcToRelative(4.255f, 4.255f, 0.0f, false, true, -4.25f, -4.25f)
                arcToRelative(4.255f, 4.255f, 0.0f, false, true, 5.866f, -3.931f)
                lineToRelative(1.697f, -3.055f)
                lineToRelative(0.143f, -0.257f)
                horizontalLineToRelative(5.794f)
                verticalLineToRelative(-2.0f)
                lineTo(19.5f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(3.419f)
                lineToRelative(0.89f, 2.668f)
                quadToRelative(0.418f, -0.086f, 0.86f, -0.087f)
                arcToRelative(4.253f, 4.253f, 0.0f, false, true, 4.25f, 4.25f)
                arcTo(4.254f, 4.254f, 0.0f, false, true, 24.0f, 32.75f)
                arcToRelative(4.254f, 4.254f, 0.0f, false, true, -4.25f, -4.25f)
                curveToRelative(0.0f, -1.698f, 1.0f, -3.166f, 2.442f, -3.846f)
                lineToRelative(-0.802f, -2.404f)
                horizontalLineToRelative(-5.346f)
                close()
                moveTo(23.46f, 25.294f)
                lineTo(24.474f, 28.334f)
                lineTo(23.526f, 28.65f)
                lineTo(22.511f, 25.61f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -1.761f, 2.89f)
                arcTo(3.254f, 3.254f, 0.0f, false, false, 24.0f, 31.75f)
                arcToRelative(3.254f, 3.254f, 0.0f, false, false, 3.25f, -3.25f)
                arcToRelative(3.253f, 3.253f, 0.0f, false, false, -3.79f, -3.206f)
                moveTo(16.5f, 20.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bicycleRoofKeyMedium!!
    }

private var _bicycleRoofKeyMedium: ImageVector? = null
