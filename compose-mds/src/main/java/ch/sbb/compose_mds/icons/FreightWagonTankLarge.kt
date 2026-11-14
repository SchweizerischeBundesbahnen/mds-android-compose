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

public val SBBIcons.FreightWagonTankLarge: ImageVector
    get() {
        if (_freightWagonTankLarge != null) {
            return _freightWagonTankLarge!!
        }
        _freightWagonTankLarge = Builder(name = "FreightWagonTankLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.5f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 6.0f, 20.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 4.496f, 7.5f)
                lineTo(6.0f, 29.0f)
                verticalLineToRelative(1.01f)
                lineTo(4.0f, 30.01f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 29.01f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 33.0f)
                horizontalLineToRelative(4.034f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 6.931f, 0.0f)
                horizontalLineToRelative(14.07f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 6.93f, 0.0f)
                lineTo(42.0f, 33.0f)
                verticalLineToRelative(-1.99f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(42.0f, 29.0f)
                horizontalLineToRelative(-3.496f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 43.0f, 21.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -8.5f, -8.5f)
                close()
                moveTo(42.0f, 20.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -7.5f, -7.5f)
                lineTo(19.0f, 13.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(15.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 7.5f, -7.5f)
                close()
                moveTo(18.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 23.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 24.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 29.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(14.5f, 13.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 7.0f, 21.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.5f, -7.5f)
                moveTo(7.0f, 30.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 32.0f)
                close()
                moveTo(11.049f, 33.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.902f, 0.0f)
                close()
                moveTo(36.951f, 33.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.902f, 0.0f)
                close()
                moveTo(39.533f, 17.537f)
                curveToRelative(-0.733f, -1.322f, -2.118f, -2.697f, -4.642f, -2.89f)
                lineToRelative(-0.075f, 0.998f)
                curveToRelative(2.122f, 0.162f, 3.238f, 1.287f, 3.843f, 2.376f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.694f, 2.146f)
                lineToRelative(0.002f, 0.012f)
                verticalLineToRelative(0.006f)
                lineToRelative(0.18f, -0.014f)
                lineToRelative(0.319f, -0.024f)
                curveToRelative(0.462f, -0.035f, 0.496f, -0.038f, 0.498f, -0.039f)
                verticalLineToRelative(-0.007f)
                lineToRelative(-0.001f, -0.014f)
                lineToRelative(-0.005f, -0.047f)
                lineToRelative(-0.022f, -0.167f)
                arcToRelative(7.048f, 7.048f, 0.0f, false, false, -0.791f, -2.337f)
            }
        }
        .build()
        return _freightWagonTankLarge!!
    }

private var _freightWagonTankLarge: ImageVector? = null
