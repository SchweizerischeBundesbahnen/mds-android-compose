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

public val SBBIcons.PinSmall: ImageVector
    get() {
        if (_pinSmall != null) {
            return _pinSmall!!
        }
        _pinSmall = Builder(name = "PinSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.978f, 5.647f)
                lineTo(17.177f, 5.0f)
                lineTo(6.823f, 5.0f)
                lineToRelative(0.2f, 0.647f)
                lineToRelative(1.97f, 6.408f)
                lineToRelative(-0.252f, 3.408f)
                lineToRelative(-0.04f, 0.537f)
                horizontalLineToRelative(2.8f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.786f)
                lineToRelative(-0.038f, -0.535f)
                lineToRelative(-0.244f, -3.41f)
                close()
                moveTo(10.006f, 11.943f)
                lineTo(9.978f, 11.853f)
                lineTo(8.177f, 6.0f)
                horizontalLineToRelative(7.647f)
                lineToRelative(-1.801f, 5.852f)
                lineToRelative(-0.029f, 0.09f)
                lineToRelative(0.007f, 0.093f)
                lineToRelative(0.212f, 2.965f)
                lineTo(9.78f, 15.0f)
                lineToRelative(0.22f, -2.963f)
                close()
            }
        }
        .build()
        return _pinSmall!!
    }

private var _pinSmall: ImageVector? = null
