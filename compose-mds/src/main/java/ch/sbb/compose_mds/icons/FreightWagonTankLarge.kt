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
        _freightWagonTankLarge = Builder(
            name = "FreightWagonTankLarge",
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
                moveTo(23.0f, 11.0f)
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
                lineTo(26.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(42.0f, 21.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -7.5f, 7.5f)
                lineTo(19.0f, 29.0f)
                lineTo(19.0f, 13.0f)
                horizontalLineToRelative(15.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.5f, 7.5f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
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
                moveTo(15.0f, 13.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 7.0f, 21.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.5f, -7.5f)
                close()
                moveTo(7.0f, 30.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 32.0f)
                close()
                moveTo(15.952f, 33.0f)
                horizontalLineToRelative(-4.903f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.903f, 0.0f)
                moveToRelative(16.78f, 1.278f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 32.048f, 33.0f)
                horizontalLineToRelative(4.904f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.22f, 1.278f)
                moveToRelative(2.084f, -18.633f)
                curveToRelative(2.122f, 0.161f, 3.238f, 1.287f, 3.843f, 2.377f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.693f, 2.126f)
                lineToRelative(0.003f, 0.03f)
                verticalLineToRelative(0.007f)
                lineToRelative(0.499f, -0.039f)
                lineToRelative(0.498f, -0.038f)
                lineTo(40.352f, 20.1f)
                lineToRelative(-0.002f, -0.014f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.026f, -0.214f)
                arcToRelative(7.05f, 7.05f, 0.0f, false, false, -0.79f, -2.337f)
                curveToRelative(-0.734f, -1.321f, -2.119f, -2.696f, -4.642f, -2.888f)
                close()
            }
        }
            .build()
        return _freightWagonTankLarge!!
    }

private var _freightWagonTankLarge: ImageVector? = null
