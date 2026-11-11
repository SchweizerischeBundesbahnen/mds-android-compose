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
                moveTo(9.25f, 6.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                moveToRelative(0.372f, 2.0f)
                arcToRelative(3.501f, 3.501f, 0.0f, true, true, -2.872f, -5.5f)
                curveToRelative(1.189f, 0.0f, 2.24f, 0.594f, 2.873f, 1.5f)
                horizontalLineToRelative(7.834f)
                lineToRelative(1.976f, 1.976f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-1.522f, 1.524f)
                lineToRelative(-0.147f, 0.146f)
                close()
                moveTo(10.105f, 7.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(6.938f)
                lineToRelative(0.976f, 0.976f)
                lineToRelative(-1.023f, 1.024f)
                close()
                moveTo(19.079f, 7.08f)
                lineTo(18.725f, 6.726f)
                close()
                moveTo(2.862f, 17.52f)
                lineToRelative(21.0f, -6.0f)
                lineToRelative(0.223f, -0.064f)
                lineToRelative(0.192f, 0.128f)
                lineToRelative(9.0f, 6.0f)
                lineToRelative(-0.554f, 0.832f)
                lineToRelative(-8.808f, -5.872f)
                lineToRelative(-20.777f, 5.937f)
                close()
                moveTo(14.0f, 25.933f)
                arcTo(3.247f, 3.247f, 0.0f, false, true, 12.0f, 31.743f)
                curveToRelative(-1.79f, 0.0f, -3.25f, -1.46f, -3.25f, -3.25f)
                arcToRelative(3.255f, 3.255f, 0.0f, false, true, 4.375f, -3.049f)
                lineToRelative(-1.562f, 2.813f)
                lineToRelative(0.874f, 0.486f)
                close()
                moveTo(14.49f, 25.05f)
                arcTo(4.247f, 4.247f, 0.0f, false, true, 12.0f, 32.743f)
                arcToRelative(4.255f, 4.255f, 0.0f, false, true, -4.25f, -4.25f)
                arcToRelative(4.255f, 4.255f, 0.0f, false, true, 5.865f, -3.931f)
                lineToRelative(1.697f, -3.055f)
                lineToRelative(0.144f, -0.257f)
                horizontalLineToRelative(5.794f)
                verticalLineToRelative(-2.0f)
                lineTo(19.5f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(3.418f)
                lineToRelative(0.89f, 2.67f)
                arcToRelative(4.253f, 4.253f, 0.0f, false, true, 5.11f, 4.162f)
                arcTo(4.254f, 4.254f, 0.0f, false, true, 24.0f, 32.75f)
                arcToRelative(4.254f, 4.254f, 0.0f, false, true, -4.25f, -4.25f)
                curveToRelative(0.0f, -1.698f, 1.0f, -3.166f, 2.442f, -3.846f)
                lineToRelative(-0.802f, -2.404f)
                horizontalLineToRelative(-5.345f)
                close()
                moveTo(22.512f, 25.611f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -1.761f, 2.89f)
                arcTo(3.254f, 3.254f, 0.0f, false, false, 24.0f, 31.75f)
                arcToRelative(3.254f, 3.254f, 0.0f, false, false, 3.25f, -3.25f)
                arcToRelative(3.253f, 3.253f, 0.0f, false, false, -3.79f, -3.206f)
                lineToRelative(1.015f, 3.04f)
                lineToRelative(-0.95f, 0.316f)
                close()
                moveTo(16.501f, 19.751f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _bicycleRoofKeyMedium!!
    }

private var _bicycleRoofKeyMedium: ImageVector? = null
