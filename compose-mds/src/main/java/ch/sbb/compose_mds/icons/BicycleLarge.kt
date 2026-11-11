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

public val SBBIcons.BicycleLarge: ImageVector
    get() {
        if (_bicycleLarge != null) {
            return _bicycleLarge!!
        }
        _bicycleLarge = Builder(name = "BicycleLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(34.0f, 12.0f)
                lineToRelative(-0.6f, 0.8f)
                lineToRelative(-4.319f, 5.758f)
                lineToRelative(1.924f, 4.022f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 42.001f, 30.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.897f, -14.988f)
                lineTo(28.184f, 19.0f)
                horizontalLineToRelative(-9.342f)
                lineToRelative(-1.466f, 3.745f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 22.0f, 30.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 2.444f, -15.62f)
                lineToRelative(1.59f, -4.063f)
                lineToRelative(0.125f, -0.317f)
                horizontalLineToRelative(10.09f)
                lineTo(32.0f, 13.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(33.55f, 30.216f)
                lineTo(30.536f, 23.916f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 34.001f, 37.0f)
                curveToRelative(3.867f, 0.0f, 7.0f, -3.133f, 7.0f, -7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.563f, -6.516f)
                lineToRelative(3.014f, 6.3f)
                close()
                moveTo(16.079f, 23.314f)
                lineTo(13.534f, 29.817f)
                lineTo(14.466f, 30.183f)
                lineTo(17.011f, 23.679f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 14.0f, 37.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -0.001f, -14.0f)
                curveToRelative(0.724f, 0.0f, 1.422f, 0.11f, 2.079f, 0.314f)
                moveTo(20.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _bicycleLarge!!
    }

private var _bicycleLarge: ImageVector? = null
