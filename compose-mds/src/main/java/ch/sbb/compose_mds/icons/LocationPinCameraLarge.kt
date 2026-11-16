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

public val SBBIcons.LocationPinCameraLarge: ImageVector
    get() {
        if (_locationPinCameraLarge != null) {
            return _locationPinCameraLarge!!
        }
        _locationPinCameraLarge = Builder(name = "LocationPinCameraLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 2.0f)
                curveToRelative(8.284f, 0.0f, 15.0f, 6.716f, 15.0f, 15.0f)
                verticalLineToRelative(0.005f)
                curveToRelative(-0.022f, 2.483f, -0.803f, 4.697f, -2.002f, 6.796f)
                lineToRelative(-0.446f, -0.255f)
                lineToRelative(0.438f, 0.268f)
                lineToRelative(-12.522f, 20.447f)
                lineToRelative(-0.427f, 0.696f)
                lineToRelative(-0.426f, -0.696f)
                lineToRelative(-12.523f, -20.447f)
                lineToRelative(0.427f, -0.261f)
                lineToRelative(-0.039f, 0.022f)
                lineToRelative(-0.388f, 0.24f)
                lineToRelative(-0.002f, -0.005f)
                lineToRelative(-0.224f, -0.383f)
                curveTo(9.776f, 21.502f, 9.095f, 19.44f, 9.0f, 17.02f)
                lineTo(9.0f, 17.0f)
                curveTo(9.0f, 8.716f, 15.716f, 2.0f, 24.0f, 2.0f)
                moveToRelative(12.99f, 21.815f)
                lineToRelative(0.008f, -0.014f)
                lineToRelative(-0.434f, -0.248f)
                close()
                moveTo(24.0f, 3.0f)
                curveToRelative(-7.725f, 0.0f, -13.99f, 6.257f, -14.0f, 13.98f)
                lineToRelative(0.024f, 0.444f)
                curveToRelative(0.16f, 2.196f, 0.847f, 4.074f, 1.921f, 5.868f)
                lineToRelative(12.096f, 19.751f)
                lineToRelative(12.088f, -19.738f)
                curveToRelative(1.14f, -1.995f, 1.85f, -4.04f, 1.871f, -6.305f)
                curveToRelative(0.0f, -7.732f, -6.268f, -14.0f, -14.0f, -14.0f)
                moveToRelative(0.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                moveToRelative(-7.0f, -3.0f)
                horizontalLineToRelative(3.14f)
                lineToRelative(0.885f, -2.658f)
                lineTo(21.14f, 8.0f)
                horizontalLineToRelative(5.72f)
                lineToRelative(0.115f, 0.342f)
                lineTo(27.86f, 11.0f)
                lineTo(34.0f, 11.0f)
                verticalLineToRelative(12.0f)
                lineTo(14.0f, 23.0f)
                lineTo(14.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(21.86f, 9.0f)
                lineTo(21.194f, 11.0f)
                horizontalLineToRelative(5.612f)
                lineToRelative(-0.666f, -2.0f)
                close()
                moveTo(15.0f, 22.0f)
                horizontalLineToRelative(18.0f)
                lineTo(33.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                close()
                moveTo(24.0f, 21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
            }
        }
        .build()
        return _locationPinCameraLarge!!
    }

private var _locationPinCameraLarge: ImageVector? = null
