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
                moveTo(26.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(-0.6f, 0.8f)
                lineToRelative(-4.318f, 5.758f)
                lineToRelative(1.924f, 4.022f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 42.0f, 30.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.897f, -14.988f)
                lineTo(28.184f, 19.0f)
                horizontalLineToRelative(-9.343f)
                lineToRelative(-1.465f, 3.745f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 22.0f, 30.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 2.445f, -15.62f)
                lineToRelative(1.59f, -4.062f)
                lineToRelative(0.124f, -0.318f)
                lineTo(28.25f, 18.0f)
                lineTo(32.0f, 13.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(33.55f, 30.216f)
                lineTo(30.537f, 23.916f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 34.0f, 37.0f)
                curveToRelative(3.867f, 0.0f, 7.0f, -3.133f, 7.0f, -7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.563f, -6.516f)
                lineToRelative(3.014f, 6.3f)
                close()
                moveTo(16.08f, 23.314f)
                lineTo(13.534f, 29.818f)
                lineTo(14.466f, 30.182f)
                lineTo(17.011f, 23.679f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -0.932f, -0.365f)
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _bicycleLarge!!
    }

private var _bicycleLarge: ImageVector? = null
