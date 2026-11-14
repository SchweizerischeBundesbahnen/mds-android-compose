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

public val SBBIcons.GpsDisabledLarge: ImageVector
    get() {
        if (_gpsDisabledLarge != null) {
            return _gpsDisabledLarge!!
        }
        _gpsDisabledLarge = Builder(name = "GpsDisabledLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(45.647f, 46.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-43.0f, -43.0f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(9.838f, 9.838f)
                arcTo(16.44f, 16.44f, 0.0f, false, false, 7.995f, 24.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.995f)
                arcToRelative(16.45f, 16.45f, 0.0f, false, false, 4.838f, 11.167f)
                arcTo(16.45f, 16.45f, 0.0f, false, false, 24.0f, 41.005f)
                verticalLineTo(46.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.995f)
                arcToRelative(16.44f, 16.44f, 0.0f, false, false, 10.808f, -4.49f)
                close()
                moveTo(35.1f, 35.808f)
                lineToRelative(-4.246f, -4.246f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, true, -13.074f, -0.344f)
                arcToRelative(9.483f, 9.483f, 0.0f, false, true, -0.344f, -13.074f)
                lineTo(13.192f, 13.9f)
                arcToRelative(15.467f, 15.467f, 0.0f, false, false, 0.348f, 21.561f)
                arcToRelative(15.467f, 15.467f, 0.0f, false, false, 21.56f, 0.348f)
                moveTo(18.146f, 18.853f)
                arcToRelative(8.48f, 8.48f, 0.0f, false, false, 0.342f, 11.657f)
                arcToRelative(8.483f, 8.483f, 0.0f, false, false, 11.659f, 0.344f)
                close()
                moveTo(24.0f, 8.008f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, -8.911f, 2.956f)
                lineToRelative(0.572f, 0.82f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 24.5f, 9.002f)
                curveTo(33.085f, 9.0f, 40.0f, 15.915f, 40.0f, 24.5f)
                curveToRelative(0.0f, 3.295f, -1.039f, 6.331f, -2.785f, 8.838f)
                lineToRelative(0.82f, 0.573f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 40.993f, 25.0f)
                horizontalLineToRelative(5.006f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.006f)
                arcTo(16.466f, 16.466f, 0.0f, false, false, 25.0f, 8.008f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(33.0f, 24.5f)
                curveToRelative(0.0f, -4.708f, -3.791f, -8.5f, -8.5f, -8.5f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -3.803f, 0.92f)
                lineToRelative(-0.45f, -0.894f)
                arcTo(9.4f, 9.4f, 0.0f, false, true, 24.502f, 15.0f)
                curveToRelative(5.26f, 0.0f, 9.5f, 4.24f, 9.5f, 9.5f)
                curveToRelative(0.0f, 1.54f, -0.385f, 2.976f, -1.027f, 4.252f)
                lineToRelative(-0.893f, -0.449f)
                curveToRelative(0.578f, -1.15f, 0.92f, -2.433f, 0.92f, -3.803f)
            }
        }
        .build()
        return _gpsDisabledLarge!!
    }

private var _gpsDisabledLarge: ImageVector? = null
