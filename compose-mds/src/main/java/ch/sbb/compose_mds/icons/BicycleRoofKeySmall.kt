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
                moveTo(6.0f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                moveTo(6.5f, 6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -3.0f)
                horizontalLineToRelative(5.208f)
                lineToRelative(0.145f, 0.146f)
                lineToRelative(0.984f, 0.985f)
                lineToRelative(0.354f, 0.352f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-1.014f, 1.017f)
                lineToRelative(-0.147f, 0.146f)
                close()
                moveTo(6.95f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(4.343f)
                lineToRelative(0.484f, 0.484f)
                lineTo(11.26f, 5.0f)
                close()
                moveTo(1.862f, 11.52f)
                lineTo(15.862f, 7.52f)
                lineTo(16.085f, 7.456f)
                lineTo(16.277f, 7.584f)
                lineTo(22.277f, 11.584f)
                lineTo(21.723f, 12.416f)
                lineTo(15.915f, 8.544f)
                lineTo(2.138f, 12.48f)
                close()
                moveTo(9.379f, 17.548f)
                curveToRelative(0.382f, 0.365f, 0.621f, 0.879f, 0.621f, 1.447f)
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
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.948f, -0.317f)
                lineToRelative(0.612f, 1.833f)
                lineToRelative(-0.95f, 0.316f)
                close()
            }
        }
        .build()
        return _bicycleRoofKeySmall!!
    }

private var _bicycleRoofKeySmall: ImageVector? = null
