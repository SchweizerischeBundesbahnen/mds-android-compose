package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.PinLarge: ImageVector
    get() {
        if (_pinLarge != null) {
            return _pinLarge!!
        }
        _pinLarge = Builder(
            name = "PinLarge",
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
                pathFillType = NonZero,
            ) {
                moveToRelative(32.978f, 10.648f)
                lineToRelative(-3.973f, 12.908f)
                lineToRelative(0.494f, 6.909f)
                lineToRelative(0.038f, 0.535f)
                lineTo(24.0f, 31.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.559f)
                lineToRelative(0.04f, -0.537f)
                lineToRelative(0.512f, -6.908f)
                lineToRelative(-3.97f, -12.907f)
                lineToRelative(-0.2f, -0.648f)
                horizontalLineToRelative(19.354f)
                close()
                moveTo(18.667f, 28.0f)
                lineToRelative(-0.148f, 2.0f)
                horizontalLineToRelative(9.944f)
                lineToRelative(-0.143f, -2.0f)
                close()
                moveTo(18.977f, 23.352f)
                lineTo(19.006f, 23.443f)
                lineTo(18.999f, 23.537f)
                lineTo(18.741f, 27.0f)
                horizontalLineToRelative(9.508f)
                lineToRelative(-0.248f, -3.465f)
                lineToRelative(-0.007f, -0.093f)
                lineToRelative(0.029f, -0.09f)
                lineTo(30.285f, 16.0f)
                horizontalLineToRelative(-13.57f)
                close()
                moveTo(16.408f, 15.0f)
                horizontalLineToRelative(14.186f)
                lineToRelative(1.23f, -4.0f)
                lineTo(15.177f, 11.0f)
                close()
            }
        }
            .build()
        return _pinLarge!!
    }

private var _pinLarge: ImageVector? = null
