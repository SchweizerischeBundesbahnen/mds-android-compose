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

public val SBBIcons.BluetoothMedium: ImageVector
    get() {
        if (_bluetoothMedium != null) {
            return _bluetoothMedium!!
        }
        _bluetoothMedium = Builder(name = "BluetoothMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.585f, 4.128f)
                lineToRelative(7.5f, 6.75f)
                lineToRelative(0.412f, 0.372f)
                lineToRelative(-0.412f, 0.372f)
                lineTo(17.998f, 18.0f)
                lineToRelative(7.087f, 6.378f)
                lineToRelative(0.412f, 0.372f)
                lineToRelative(-0.412f, 0.372f)
                lineToRelative(-7.5f, 6.75f)
                lineToRelative(-0.835f, 0.751f)
                verticalLineToRelative(-13.5f)
                lineToRelative(-6.665f, 6.0f)
                lineToRelative(-0.67f, -0.745f)
                lineTo(16.501f, 18.0f)
                lineToRelative(-7.086f, -6.378f)
                lineToRelative(0.67f, -0.744f)
                lineToRelative(6.665f, 5.998f)
                lineTo(16.75f, 3.377f)
                close()
                moveTo(17.75f, 30.376f)
                lineTo(24.001f, 24.75f)
                lineTo(17.75f, 19.123f)
                close()
                moveTo(17.75f, 16.876f)
                lineTo(24.001f, 11.25f)
                lineTo(17.75f, 5.623f)
                close()
            }
        }
        .build()
        return _bluetoothMedium!!
    }

private var _bluetoothMedium: ImageVector? = null
