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

public val SBBIcons.BluetoothLarge: ImageVector
    get() {
        if (_bluetoothLarge != null) {
            return _bluetoothLarge!!
        }
        _bluetoothLarge = Builder(name = "BluetoothLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(24.0f, 2.293f)
                lineToRelative(0.854f, 0.853f)
                lineToRelative(10.0f, 10.0f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-9.647f, 9.646f)
                lineToRelative(9.647f, 9.646f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-10.0f, 10.0f)
                lineToRelative(-0.854f, 0.853f)
                verticalLineToRelative(-20.0f)
                lineToRelative(-9.146f, 9.147f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(9.646f, -9.646f)
                lineToRelative(-9.646f, -9.646f)
                lineToRelative(0.707f, -0.708f)
                lineTo(24.0f, 22.293f)
                verticalLineToRelative(-20.0f)
                moveToRelative(1.0f, 22.414f)
                lineToRelative(8.793f, 8.793f)
                lineTo(25.0f, 42.293f)
                close()
                moveTo(25.0f, 22.293f)
                lineTo(25.0f, 4.707f)
                lineToRelative(8.793f, 8.793f)
                close()
            }
        }
        .build()
        return _bluetoothLarge!!
    }

private var _bluetoothLarge: ImageVector? = null
