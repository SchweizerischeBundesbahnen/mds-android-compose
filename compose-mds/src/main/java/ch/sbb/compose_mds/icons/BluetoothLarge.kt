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

public val SBBIcons.BluetoothLarge: ImageVector
    get() {
        if (_bluetoothLarge != null) {
            return _bluetoothLarge!!
        }
        _bluetoothLarge = Builder(name = "BluetoothLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(35.207f, 13.5f)
                lineToRelative(-10.0f, 10.0f)
                lineToRelative(10.0f, 10.0f)
                lineTo(24.0f, 44.707f)
                verticalLineToRelative(-20.0f)
                lineToRelative(-9.146f, 9.146f)
                lineToRelative(-0.707f, -0.706f)
                lineToRelative(9.646f, -9.647f)
                lineToRelative(-9.646f, -9.646f)
                lineToRelative(0.707f, -0.707f)
                lineTo(24.0f, 22.293f)
                verticalLineToRelative(-20.0f)
                close()
                moveTo(25.0f, 42.293f)
                lineToRelative(8.793f, -8.793f)
                lineTo(25.0f, 24.707f)
                close()
                moveTo(25.0f, 22.293f)
                lineTo(33.793f, 13.5f)
                lineTo(25.0f, 4.707f)
                close()
            }
        }
        .build()
        return _bluetoothLarge!!
    }

private var _bluetoothLarge: ImageVector? = null
