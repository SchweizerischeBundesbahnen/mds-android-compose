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

public val SBBIcons.BatteryLightningLarge: ImageVector
    get() {
        if (_batteryLightningLarge != null) {
            return _batteryLightningLarge!!
        }
        _batteryLightningLarge = Builder(name = "BatteryLightningLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(30.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(26.0f, 5.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(35.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                lineTo(14.0f, 43.0f)
                lineTo(14.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(34.916f, 16.777f)
                lineTo(31.435f, 22.0f)
                horizontalLineToRelative(6.143f)
                lineToRelative(-0.696f, 0.823f)
                lineToRelative(-11.0f, 13.0f)
                lineToRelative(-1.677f, 1.982f)
                lineToRelative(0.82f, -2.463f)
                lineTo(27.805f, 27.0f)
                horizontalLineToRelative(-6.043f)
                lineToRelative(0.274f, -0.686f)
                lineToRelative(4.0f, -10.0f)
                lineToRelative(0.125f, -0.314f)
                horizontalLineToRelative(9.274f)
                close()
                moveTo(23.238f, 26.0f)
                horizontalLineToRelative(5.955f)
                lineToRelative(-0.218f, 0.658f)
                lineToRelative(-2.18f, 6.535f)
                lineTo(35.423f, 23.0f)
                horizontalLineToRelative(-5.857f)
                lineToRelative(0.519f, -0.777f)
                lineTo(33.565f, 17.0f)
                horizontalLineToRelative(-6.727f)
                close()
            }
        }
        .build()
        return _batteryLightningLarge!!
    }

private var _batteryLightningLarge: ImageVector? = null
