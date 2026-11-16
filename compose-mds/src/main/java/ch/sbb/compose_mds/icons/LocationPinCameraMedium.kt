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

public val SBBIcons.LocationPinCameraMedium: ImageVector
    get() {
        if (_locationPinCameraMedium != null) {
            return _locationPinCameraMedium!!
        }
        _locationPinCameraMedium = Builder(name = "LocationPinCameraMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.25f)
                curveToRelative(-5.102f, 0.0f, -9.24f, 4.134f, -9.25f, 9.24f)
                lineToRelative(0.016f, 0.292f)
                curveToRelative(0.104f, 1.448f, 0.556f, 2.686f, 1.266f, 3.874f)
                lineToRelative(7.995f, 12.894f)
                lineToRelative(7.987f, -12.878f)
                curveToRelative(0.756f, -1.326f, 1.222f, -2.675f, 1.236f, -4.163f)
                curveToRelative(0.0f, -5.114f, -4.142f, -9.259f, -9.25f, -9.259f)
                moveToRelative(9.75f, 9.259f)
                horizontalLineToRelative(-0.056f)
                lineToRelative(0.556f, 0.005f)
                curveToRelative(-0.015f, 1.706f, -0.552f, 3.223f, -1.367f, 4.653f)
                lineToRelative(-0.435f, -0.248f)
                lineToRelative(0.009f, 0.006f)
                lineToRelative(0.426f, 0.242f)
                lineToRelative(-0.005f, 0.009f)
                lineToRelative(-0.005f, 0.007f)
                lineToRelative(-8.42f, 13.58f)
                lineToRelative(-0.426f, 0.686f)
                lineToRelative(-0.425f, -0.685f)
                lineToRelative(-8.42f, -13.581f)
                lineToRelative(-0.003f, -0.006f)
                curveToRelative(-0.832f, -1.39f, -1.36f, -2.878f, -1.429f, -4.649f)
                verticalLineToRelative(-0.02f)
                curveTo(7.75f, 7.844f, 12.339f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveToRelative(10.25f, 4.593f, 10.25f, 10.259f)
                verticalLineToRelative(0.005f)
                close()
                moveTo(18.202f, 14.069f)
                arcToRelative(0.202f, 0.202f, 0.0f, true, false, -0.405f, 0.0f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, false, 0.405f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.202f, 1.202f, 0.0f, true, true, -2.404f, 0.0f)
                arcToRelative(1.202f, 1.202f, 0.0f, false, true, 2.404f, 0.0f)
                moveToRelative(0.745f, -4.543f)
                lineToRelative(-0.138f, -0.276f)
                lineTo(16.19f, 9.25f)
                lineToRelative(-0.138f, 0.276f)
                lineToRelative(-0.612f, 1.224f)
                lineTo(12.25f, 10.75f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.191f)
                close()
                moveTo(16.06f, 11.75f)
                lineToRelative(0.138f, -0.276f)
                lineToRelative(0.612f, -1.224f)
                horizontalLineToRelative(2.382f)
                lineToRelative(0.612f, 1.224f)
                lineToRelative(0.138f, 0.276f)
                horizontalLineToRelative(2.809f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _locationPinCameraMedium!!
    }

private var _locationPinCameraMedium: ImageVector? = null
