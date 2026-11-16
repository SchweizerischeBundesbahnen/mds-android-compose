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

public val SBBIcons.StreetLocationPinLarge: ImageVector
    get() {
        if (_streetLocationPinLarge != null) {
            return _streetLocationPinLarge!!
        }
        _streetLocationPinLarge = Builder(name = "StreetLocationPinLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.5f, 2.01f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, 4.5f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(0.5f, 0.007f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.567f, 2.054f)
                lineToRelative(-0.01f, 0.015f)
                lineToRelative(-0.009f, 0.014f)
                lineToRelative(-3.5f, 5.18f)
                lineToRelative(-0.414f, -0.281f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.414f, 0.28f)
                lineToRelative(-0.418f, 0.618f)
                lineToRelative(-0.413f, -0.622f)
                lineToRelative(-3.44f, -5.18f)
                lineToRelative(-0.006f, -0.01f)
                lineToRelative(-0.138f, -0.236f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 19.0f, 6.53f)
                verticalLineToRelative(-0.02f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, -4.5f)
                moveToRelative(0.0f, 1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.0f, 6.49f)
                lineToRelative(0.015f, 0.207f)
                curveToRelative(0.05f, 0.48f, 0.209f, 0.943f, 0.465f, 1.353f)
                lineToRelative(3.023f, 4.55f)
                lineToRelative(3.066f, -4.537f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 27.0f, 6.51f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                moveToRelative(-2.533f, 13.67f)
                lineToRelative(0.262f, -0.68f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(17.77f)
                lineTo(9.033f, 44.82f)
                lineToRelative(0.934f, 0.36f)
                close()
                moveTo(46.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                lineTo(25.772f, 16.0f)
                lineToRelative(0.261f, 0.68f)
                lineToRelative(11.0f, 28.5f)
                lineToRelative(0.934f, -0.36f)
                lineTo(27.23f, 17.0f)
                close()
                moveTo(24.0f, 40.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(24.0f, 37.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.0f, 24.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(23.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
            }
        }
        .build()
        return _streetLocationPinLarge!!
    }

private var _streetLocationPinLarge: ImageVector? = null
