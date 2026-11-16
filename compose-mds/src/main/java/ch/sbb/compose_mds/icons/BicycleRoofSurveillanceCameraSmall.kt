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

public val SBBIcons.BicycleRoofSurveillanceCameraSmall: ImageVector
    get() {
        if (_bicycleRoofSurveillanceCameraSmall != null) {
            return _bicycleRoofSurveillanceCameraSmall!!
        }
        _bicycleRoofSurveillanceCameraSmall = Builder(name = "BicycleRoofSurveillanceCameraSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(9.908f, 3.7f)
                lineToRelative(-0.259f, 0.965f)
                lineToRelative(1.449f, 0.389f)
                lineToRelative(-0.518f, 1.931f)
                lineToRelative(-1.449f, -0.388f)
                lineToRelative(-0.258f, 0.966f)
                lineTo(6.0f, 6.793f)
                lineTo(6.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 6.525f)
                lineToRelative(-2.889f, -0.774f)
                lineToRelative(1.035f, -3.863f)
                close()
                moveTo(3.336f, 5.043f)
                lineToRelative(4.83f, 1.294f)
                lineToRelative(0.517f, -1.931f)
                lineToRelative(-4.83f, -1.295f)
                close()
                moveTo(1.862f, 11.52f)
                lineToRelative(14.0f, -4.0f)
                lineToRelative(0.223f, -0.064f)
                lineToRelative(0.192f, 0.128f)
                lineToRelative(6.0f, 4.0f)
                lineToRelative(-0.554f, 0.832f)
                lineToRelative(-5.808f, -3.872f)
                lineTo(2.138f, 12.48f)
                close()
                moveTo(9.379f, 17.549f)
                curveToRelative(0.382f, 0.364f, 0.621f, 0.878f, 0.621f, 1.446f)
                curveToRelative(0.0f, 1.102f, -0.898f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.898f, -2.0f, -2.0f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, true, 2.505f, -1.935f)
                lineToRelative(-0.943f, 1.697f)
                lineToRelative(0.875f, 0.486f)
                close()
                moveTo(9.875f, 16.655f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 18.995f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, true, 4.001f, -2.828f)
                lineToRelative(1.062f, -1.91f)
                lineToRelative(0.143f, -0.257f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.418f)
                lineToRelative(0.54f, 1.617f)
                quadTo(15.766f, 16.0f, 16.0f, 16.0f)
                curveToRelative(1.655f, 0.0f, 3.0f, 1.345f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.654f, -1.345f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.146f, 0.645f, -2.143f, 1.59f, -2.648f)
                lineTo(14.14f, 15.0f)
                horizontalLineToRelative(-3.345f)
                close()
                moveTo(14.915f, 17.321f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.948f, -0.316f)
                lineToRelative(0.612f, 1.832f)
                lineToRelative(-0.95f, 0.316f)
                close()
            }
        }
        .build()
        return _bicycleRoofSurveillanceCameraSmall!!
    }

private var _bicycleRoofSurveillanceCameraSmall: ImageVector? = null
