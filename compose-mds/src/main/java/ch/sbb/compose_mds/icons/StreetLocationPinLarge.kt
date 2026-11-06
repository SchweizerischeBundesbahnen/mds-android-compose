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
                moveTo(20.318f, 3.328f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 28.0f, 6.51f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(0.5f, 0.006f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.568f, 2.055f)
                lineToRelative(-0.008f, 0.015f)
                lineToRelative(-0.01f, 0.014f)
                lineToRelative(-3.5f, 5.18f)
                lineToRelative(-0.418f, 0.618f)
                lineToRelative(-0.412f, -0.622f)
                lineToRelative(-3.44f, -5.18f)
                lineToRelative(-0.008f, -0.01f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 19.0f, 6.53f)
                verticalLineToRelative(-0.02f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 1.318f, -3.182f)
                moveTo(27.0f, 6.507f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -7.0f, -0.007f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 0.48f, 1.549f)
                lineToRelative(3.024f, 4.552f)
                lineToRelative(3.072f, -4.547f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 27.0f, 6.507f)
                moveTo(2.0f, 17.0f)
                horizontalLineToRelative(17.771f)
                lineTo(9.034f, 44.82f)
                lineToRelative(0.932f, 0.36f)
                lineToRelative(11.0f, -28.5f)
                lineToRelative(0.263f, -0.68f)
                lineTo(2.0f, 16.0f)
                close()
                moveTo(26.5f, 16.0f)
                horizontalLineToRelative(-0.729f)
                lineToRelative(0.262f, 0.68f)
                lineToRelative(11.0f, 28.5f)
                lineToRelative(0.934f, -0.36f)
                lineTo(27.229f, 17.0f)
                lineTo(46.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(23.0f, 45.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(23.0f, 32.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(23.0f, 29.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(23.0f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(22.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveTo(23.5f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
        .build()
        return _streetLocationPinLarge!!
    }

private var _streetLocationPinLarge: ImageVector? = null
