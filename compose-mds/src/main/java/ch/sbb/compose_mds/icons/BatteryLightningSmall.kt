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

public val SBBIcons.BatteryLightningSmall: ImageVector
    get() {
        if (_batteryLightningSmall != null) {
            return _batteryLightningSmall!!
        }
        _batteryLightningSmall = Builder(name = "BatteryLightningSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 22.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(17.916f, 8.777f)
                lineTo(16.435f, 11.0f)
                horizontalLineToRelative(3.143f)
                lineToRelative(-0.696f, 0.823f)
                lineToRelative(-5.5f, 6.5f)
                lineToRelative(-1.677f, 1.982f)
                lineToRelative(0.82f, -2.463f)
                lineTo(13.805f, 14.0f)
                horizontalLineToRelative(-3.043f)
                lineToRelative(0.274f, -0.685f)
                lineToRelative(2.0f, -5.0f)
                lineTo(13.161f, 8.0f)
                horizontalLineToRelative(5.274f)
                close()
                moveTo(12.238f, 13.0f)
                horizontalLineToRelative(2.955f)
                lineToRelative(-0.218f, 0.658f)
                lineToRelative(-0.68f, 2.035f)
                lineTo(17.423f, 12.0f)
                horizontalLineToRelative(-2.857f)
                lineToRelative(0.519f, -0.777f)
                lineTo(16.565f, 9.0f)
                horizontalLineToRelative(-2.727f)
                close()
            }
        }
        .build()
        return _batteryLightningSmall!!
    }

private var _batteryLightningSmall: ImageVector? = null
