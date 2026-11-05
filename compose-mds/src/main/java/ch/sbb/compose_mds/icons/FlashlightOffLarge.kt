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

public val SBBIcons.FlashlightOffLarge: ImageVector
    get() {
        if (_flashlightOffLarge != null) {
            return _flashlightOffLarge!!
        }
        _flashlightOffLarge = Builder(
            name = "FlashlightOffLarge",
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
                moveToRelative(32.0f, 17.597f)
                lineToRelative(-0.036f, 0.088f)
                lineTo(30.0f, 22.596f)
                lineTo(30.0f, 43.0f)
                lineTo(17.007f, 43.0f)
                lineTo(17.007f, 22.612f)
                lineToRelative(-1.97f, -4.926f)
                lineToRelative(-0.037f, -0.09f)
                lineTo(15.0f, 12.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(18.007f, 42.0f)
                lineTo(29.0f, 42.0f)
                lineTo(29.0f, 23.0f)
                lineTo(18.007f, 23.0f)
                close()
                moveTo(26.0f, 39.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(21.0f, 26.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(22.0f, 38.0f)
                horizontalLineToRelative(3.0f)
                lineTo(25.0f, 27.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 36.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.238f, 18.0f)
                lineTo(17.838f, 22.0f)
                horizontalLineToRelative(11.324f)
                lineToRelative(1.6f, -4.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-4.0f)
                lineTo(16.0f, 13.0f)
                close()
            }
        }
            .build()
        return _flashlightOffLarge!!
    }

private var _flashlightOffLarge: ImageVector? = null
