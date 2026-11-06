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

public val SBBIcons.BluetoothSmall: ImageVector
    get() {
        if (_bluetoothSmall != null) {
            return _bluetoothSmall!!
        }
        _bluetoothSmall = Builder(name = "BluetoothSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.0f, 1.878f)
                lineToRelative(0.835f, 0.75f)
                lineToRelative(5.0f, 4.5f)
                lineToRelative(0.412f, 0.372f)
                lineToRelative(-0.413f, 0.372f)
                lineTo(12.247f, 12.0f)
                lineToRelative(4.587f, 4.129f)
                lineToRelative(0.413f, 0.371f)
                lineToRelative(-0.413f, 0.372f)
                lineToRelative(-5.0f, 4.5f)
                lineToRelative(-0.834f, 0.75f)
                verticalLineToRelative(-8.999f)
                lineToRelative(-4.166f, 3.749f)
                lineToRelative(-0.668f, -0.743f)
                lineTo(10.753f, 12.0f)
                lineTo(6.166f, 7.872f)
                lineToRelative(0.668f, -0.743f)
                lineTo(11.0f, 10.878f)
                verticalLineToRelative(-9.0f)
                moveToRelative(1.0f, 11.245f)
                lineToRelative(3.753f, 3.377f)
                lineTo(12.0f, 19.878f)
                close()
                moveTo(12.0f, 10.878f)
                lineTo(12.0f, 4.123f)
                lineTo(15.753f, 7.5f)
                close()
            }
        }
        .build()
        return _bluetoothSmall!!
    }

private var _bluetoothSmall: ImageVector? = null
