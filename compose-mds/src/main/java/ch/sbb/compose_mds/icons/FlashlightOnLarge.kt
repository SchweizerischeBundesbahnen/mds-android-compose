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

public val SBBIcons.FlashlightOnLarge: ImageVector
    get() {
        if (_flashlightOnLarge != null) {
            return _flashlightOnLarge!!
        }
        _flashlightOnLarge = Builder(name = "FlashlightOnLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(32.0f, 18.597f)
                lineToRelative(-0.036f, 0.088f)
                lineTo(30.0f, 23.596f)
                lineTo(30.0f, 44.0f)
                lineTo(17.006f, 44.0f)
                lineTo(17.006f, 23.61f)
                lineToRelative(-1.97f, -4.924f)
                lineToRelative(-0.036f, -0.09f)
                lineTo(15.0f, 13.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(18.006f, 43.0f)
                lineTo(29.0f, 43.0f)
                lineTo(29.0f, 24.0f)
                lineTo(18.006f, 24.0f)
                close()
                moveTo(26.0f, 40.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(21.0f, 27.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(22.0f, 39.0f)
                horizontalLineToRelative(3.0f)
                lineTo(25.0f, 28.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 32.999f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.838f, 23.0f)
                horizontalLineToRelative(11.324f)
                lineToRelative(1.6f, -4.0f)
                lineTo(16.238f, 19.0f)
                close()
                moveTo(16.0f, 18.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-4.0f)
                lineTo(16.0f, 14.0f)
                close()
                moveTo(24.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(23.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.916f, 10.223f)
                lineTo(18.084f, 10.777f)
                lineTo(14.084f, 4.777f)
                lineTo(14.916f, 4.223f)
                close()
                moveTo(32.916f, 4.777f)
                lineTo(28.916f, 10.777f)
                lineTo(28.084f, 10.223f)
                lineTo(32.084f, 4.223f)
                close()
            }
        }
        .build()
        return _flashlightOnLarge!!
    }

private var _flashlightOnLarge: ImageVector? = null
