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

public val SBBIcons.BluetoothSmall: ImageVector
    get() {
        if (_bluetoothSmall != null) {
            return _bluetoothSmall!!
        }
        _bluetoothSmall = Builder(name = "BluetoothSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.835f, 2.628f)
                lineToRelative(5.0f, 4.5f)
                lineToRelative(0.412f, 0.372f)
                lineToRelative(-0.412f, 0.372f)
                lineTo(12.248f, 12.0f)
                lineToRelative(4.587f, 4.128f)
                lineToRelative(0.412f, 0.372f)
                lineToRelative(-0.412f, 0.372f)
                lineToRelative(-5.0f, 4.5f)
                lineToRelative(-0.835f, 0.751f)
                verticalLineToRelative(-9.0f)
                lineToRelative(-4.165f, 3.75f)
                lineToRelative(-0.67f, -0.745f)
                lineTo(10.751f, 12.0f)
                lineTo(6.165f, 7.872f)
                lineToRelative(0.67f, -0.744f)
                lineTo(11.0f, 10.876f)
                lineTo(11.0f, 1.877f)
                close()
                moveTo(12.0f, 19.876f)
                lineToRelative(3.751f, -3.376f)
                lineTo(12.0f, 13.123f)
                close()
                moveTo(12.0f, 10.876f)
                lineTo(15.751f, 7.5f)
                lineTo(12.0f, 4.123f)
                close()
            }
        }
        .build()
        return _bluetoothSmall!!
    }

private var _bluetoothSmall: ImageVector? = null
