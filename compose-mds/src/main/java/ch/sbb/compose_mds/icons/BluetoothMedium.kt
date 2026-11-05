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

public val SBBIcons.BluetoothMedium: ImageVector
    get() {
        if (_bluetoothMedium != null) {
            return _bluetoothMedium!!
        }
        _bluetoothMedium = Builder(name = "BluetoothMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(16.75f, 3.378f)
                lineToRelative(0.834f, 0.75f)
                lineToRelative(7.5f, 6.75f)
                lineToRelative(0.413f, 0.372f)
                lineToRelative(-0.413f, 0.372f)
                lineTo(17.998f, 18.0f)
                lineToRelative(7.087f, 6.379f)
                lineToRelative(0.413f, 0.371f)
                lineToRelative(-0.413f, 0.372f)
                lineToRelative(-7.5f, 6.75f)
                lineToRelative(-0.834f, 0.751f)
                verticalLineToRelative(-13.5f)
                lineToRelative(-6.665f, 5.999f)
                lineToRelative(-0.67f, -0.743f)
                lineTo(16.504f, 18.0f)
                lineToRelative(-7.087f, -6.378f)
                lineToRelative(0.668f, -0.743f)
                lineToRelative(6.666f, 5.999f)
                verticalLineToRelative(-13.5f)
                moveToRelative(1.0f, 15.745f)
                lineToRelative(6.253f, 5.627f)
                lineToRelative(-6.253f, 5.628f)
                close()
                moveTo(17.751f, 16.878f)
                lineTo(17.751f, 5.623f)
                lineToRelative(6.253f, 5.627f)
                close()
            }
        }
        .build()
        return _bluetoothMedium!!
    }

private var _bluetoothMedium: ImageVector? = null
