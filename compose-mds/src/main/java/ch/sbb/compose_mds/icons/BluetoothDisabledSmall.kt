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

public val SBBIcons.BluetoothDisabledSmall: ImageVector
    get() {
        if (_bluetoothDisabledSmall != null) {
            return _bluetoothDisabledSmall!!
        }
        _bluetoothDisabledSmall = Builder(name = "BluetoothDisabledSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(16.835f, 7.128f)
                lineToRelative(-5.0f, -4.5f)
                lineToRelative(-0.835f, -0.75f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 4.123f)
                lineToRelative(3.727f, 3.355f)
                lineToRelative(-2.04f, 1.632f)
                lineToRelative(0.626f, 0.78f)
                lineToRelative(2.5f, -2.0f)
                lineToRelative(0.46f, -0.367f)
                close()
                moveTo(18.646f, 20.354f)
                lineTo(19.354f, 19.647f)
                lineTo(4.354f, 4.647f)
                lineTo(3.647f, 5.354f)
                lineTo(10.51f, 12.217f)
                lineTo(6.166f, 16.128f)
                lineTo(6.834f, 16.872f)
                lineTo(11.0f, 13.122f)
                verticalLineToRelative(8.991f)
                lineToRelative(0.832f, -0.74f)
                lineToRelative(4.148f, -3.686f)
                close()
                moveTo(15.271f, 16.978f)
                lineTo(12.0f, 13.708f)
                verticalLineToRelative(6.177f)
                close()
            }
        }
        .build()
        return _bluetoothDisabledSmall!!
    }

private var _bluetoothDisabledSmall: ImageVector? = null
