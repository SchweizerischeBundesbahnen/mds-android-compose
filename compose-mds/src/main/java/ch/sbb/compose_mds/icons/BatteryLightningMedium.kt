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

public val SBBIcons.BatteryLightningMedium: ImageVector
    get() {
        if (_batteryLightningMedium != null) {
            return _batteryLightningMedium!!
        }
        _batteryLightningMedium = Builder(name = "BatteryLightningMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.75f, 4.75f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(-1.0f)
                lineTo(22.75f, 5.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(11.0f)
                lineTo(22.75f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-28.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(26.666f, 13.027f)
                lineTo(24.185f, 16.75f)
                horizontalLineToRelative(4.643f)
                lineToRelative(-0.696f, 0.823f)
                lineToRelative(-8.25f, 9.75f)
                lineToRelative(-1.677f, 1.982f)
                lineToRelative(0.82f, -2.463f)
                lineToRelative(2.03f, -6.092f)
                horizontalLineToRelative(-4.543f)
                lineToRelative(0.274f, -0.686f)
                lineToRelative(3.0f, -7.5f)
                lineToRelative(0.125f, -0.314f)
                horizontalLineToRelative(7.274f)
                close()
                moveTo(17.988f, 19.75f)
                horizontalLineToRelative(4.455f)
                lineToRelative(-0.218f, 0.658f)
                lineToRelative(-1.43f, 4.285f)
                lineToRelative(5.877f, -6.943f)
                horizontalLineToRelative(-4.357f)
                lineToRelative(0.519f, -0.777f)
                lineToRelative(2.481f, -3.723f)
                horizontalLineToRelative(-4.727f)
                close()
            }
        }
        .build()
        return _batteryLightningMedium!!
    }

private var _batteryLightningMedium: ImageVector? = null
