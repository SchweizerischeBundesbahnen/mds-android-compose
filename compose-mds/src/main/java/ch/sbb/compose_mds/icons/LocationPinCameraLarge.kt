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
        _locationPinCameraLarge = Builder(
            name = "LocationPinCameraLarge",
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
                moveTo(9.0f, 17.0f)
                curveTo(9.0f, 8.716f, 15.716f, 2.0f, 24.0f, 2.0f)
                reflectiveCurveToRelative(15.0f, 6.716f, 15.0f, 15.0f)
                verticalLineToRelative(0.005f)
                curveToRelative(-0.022f, 2.482f, -0.803f, 4.697f, -2.002f, 6.796f)
                lineToRelative(-0.004f, 0.007f)
                lineToRelative(-0.004f, 0.006f)
                lineToRelative(-12.522f, 20.447f)
                lineToRelative(-0.427f, 0.696f)
                lineToRelative(-0.426f, -0.696f)
                lineToRelative(-12.523f, -20.447f)
                lineToRelative(-0.002f, -0.004f)
                curveTo(9.87f, 21.775f, 9.1f, 19.603f, 9.0f, 17.02f)
                lineTo(9.0f, 17.0f)
                moveToRelative(1.0f, -0.01f)
                curveToRelative(0.095f, 2.385f, 0.8f, 4.392f, 1.946f, 6.304f)
                lineToRelative(0.001f, 0.002f)
                lineToRelative(12.094f, 19.747f)
                lineToRelative(12.092f, -19.745f)
                curveToRelative(1.138f, -1.993f, 1.846f, -4.037f, 1.867f, -6.3f)
                curveTo(37.999f, 9.267f, 31.731f, 3.0f, 24.0f, 3.0f)
                curveToRelative(-7.729f, 0.0f, -13.995f, 6.263f, -14.0f, 13.99f)
                moveToRelative(4.0f, -5.49f)
                lineTo(14.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.14f)
                lineToRelative(0.886f, -2.658f)
                lineTo(21.14f, 8.0f)
                horizontalLineToRelative(5.72f)
                lineToRelative(0.114f, 0.342f)
                lineTo(27.86f, 11.0f)
                lineTo(34.0f, 11.0f)
                verticalLineToRelative(12.0f)
                lineTo(14.0f, 23.0f)
                lineTo(14.0f, 11.5f)
                moveToRelative(7.0f, 5.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                moveToRelative(5.806f, -6.0f)
                horizontalLineToRelative(-5.612f)
                lineToRelative(0.666f, -2.0f)
                horizontalLineToRelative(4.28f)
                close()
                moveTo(15.0f, 12.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(18.0f)
                lineTo(33.0f, 12.0f)
                close()
                moveTo(24.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
            }
        }
            .build()
        return _locationPinCameraLarge!!
    }

private var _locationPinCameraLarge: ImageVector? = null
