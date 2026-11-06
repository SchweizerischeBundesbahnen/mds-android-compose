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

public val SBBIcons.BicycleRoofKeySmall: ImageVector
    get() {
        if (_bicycleRoofKeySmall != null) {
            return _bicycleRoofKeySmall!!
        }
        _bicycleRoofKeySmall = Builder(name = "BicycleRoofKeySmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 3.0f)
                horizontalLineToRelative(5.207f)
                lineToRelative(0.146f, 0.146f)
                lineToRelative(0.985f, 0.984f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-1.015f, 1.016f)
                lineToRelative(-0.147f, 0.147f)
                lineTo(6.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 4.5f)
                moveToRelative(4.95f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(4.343f)
                lineToRelative(0.484f, 0.484f)
                lineToRelative(-0.515f, 0.516f)
                close()
                moveTo(4.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(11.363f, 4.519f)
                lineToRelative(0.222f, -0.064f)
                lineToRelative(0.192f, 0.129f)
                lineToRelative(6.0f, 4.0f)
                lineToRelative(-0.554f, 0.832f)
                lineToRelative(-5.808f, -3.872f)
                lineTo(2.137f, 12.48f)
                lineToRelative(-0.274f, -0.961f)
                close()
                moveTo(6.0f, 18.995f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, true, 2.506f, -1.935f)
                lineToRelative(-0.943f, 1.697f)
                lineToRelative(0.874f, 0.486f)
                lineToRelative(0.942f, -1.695f)
                curveToRelative(0.382f, 0.365f, 0.621f, 0.879f, 0.621f, 1.447f)
                curveToRelative(0.0f, 1.102f, -0.898f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.898f, -2.0f, -2.0f)
                moveToRelative(3.875f, -2.34f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 18.995f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, true, 4.002f, -2.828f)
                lineToRelative(1.06f, -1.91f)
                lineToRelative(0.144f, -0.257f)
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
                quadTo(15.764f, 16.0f, 16.0f, 16.0f)
                curveToRelative(1.655f, 0.0f, 3.0f, 1.345f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.654f, -1.345f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.146f, 0.645f, -2.143f, 1.59f, -2.649f)
                lineTo(14.14f, 15.0f)
                horizontalLineToRelative(-3.346f)
                close()
                moveTo(15.863f, 17.005f)
                lineTo(16.474f, 18.837f)
                lineTo(15.526f, 19.153f)
                lineTo(14.914f, 17.321f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.949f, -0.317f)
            }
        }
        .build()
        return _bicycleRoofKeySmall!!
    }

private var _bicycleRoofKeySmall: ImageVector? = null
