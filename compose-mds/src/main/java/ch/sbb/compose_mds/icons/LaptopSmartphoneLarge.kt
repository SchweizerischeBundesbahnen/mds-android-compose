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

public val SBBIcons.LaptopSmartphoneLarge: ImageVector
    get() {
        if (_laptopSmartphoneLarge != null) {
            return _laptopSmartphoneLarge!!
        }
        _laptopSmartphoneLarge = Builder(name = "LaptopSmartphoneLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.938f, 10.502f)
                close()
                lineTo(7.998f, 31.0f)
                lineTo(9.0f, 31.0f)
                lineTo(9.0f, 10.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                lineTo(10.0f, 11.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 32.0f)
                verticalLineToRelative(0.508f)
                curveTo(5.0f, 33.331f, 5.668f, 34.0f, 6.493f, 34.0f)
                lineTo(29.0f, 34.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.493f, 35.0f)
                arcTo(2.493f, 2.493f, 0.0f, false, true, 4.0f, 32.508f)
                lineTo(4.0f, 31.0f)
                horizontalLineToRelative(2.999f)
                lineToRelative(-0.061f, -20.495f)
                verticalLineToRelative(-0.002f)
                arcTo(2.503f, 2.503f, 0.0f, false, true, 9.441f, 8.0f)
                horizontalLineToRelative(29.055f)
                arcTo(2.503f, 2.503f, 0.0f, false, true, 41.0f, 10.503f)
                lineTo(41.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.497f)
                curveTo(40.0f, 9.673f, 39.328f, 9.0f, 38.496f, 9.0f)
                lineTo(9.441f, 9.0f)
                curveToRelative(-0.83f, 0.0f, -1.503f, 0.673f, -1.503f, 1.502f)
                moveTo(32.357f, 19.0f)
                curveToRelative(-0.732f, 0.0f, -1.357f, 0.622f, -1.357f, 1.409f)
                lineTo(31.0f, 35.0f)
                horizontalLineToRelative(12.0f)
                lineTo(43.0f, 20.409f)
                curveToRelative(0.0f, -0.787f, -0.625f, -1.409f, -1.357f, -1.409f)
                close()
                moveTo(43.0f, 36.0f)
                lineTo(31.0f, 36.0f)
                verticalLineToRelative(1.591f)
                curveToRelative(0.0f, 0.786f, 0.625f, 1.409f, 1.357f, 1.409f)
                horizontalLineToRelative(9.286f)
                curveToRelative(0.732f, 0.0f, 1.357f, -0.623f, 1.357f, -1.409f)
                close()
                moveTo(30.0f, 20.409f)
                curveTo(30.0f, 19.096f, 31.047f, 18.0f, 32.357f, 18.0f)
                horizontalLineToRelative(9.286f)
                curveTo(42.953f, 18.0f, 44.0f, 19.096f, 44.0f, 20.409f)
                verticalLineToRelative(17.182f)
                curveTo(44.0f, 38.903f, 42.953f, 40.0f, 41.643f, 40.0f)
                horizontalLineToRelative(-9.286f)
                curveTo(31.047f, 40.0f, 30.0f, 38.903f, 30.0f, 37.591f)
                close()
                moveTo(38.0f, 38.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(39.0f, 21.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _laptopSmartphoneLarge!!
    }

private var _laptopSmartphoneLarge: ImageVector? = null
