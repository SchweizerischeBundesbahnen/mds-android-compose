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

public val SBBIcons.BluetoothDisabledLarge: ImageVector
    get() {
        if (_bluetoothDisabledLarge != null) {
            return _bluetoothDisabledLarge!!
        }
        _bluetoothDisabledLarge = Builder(name = "BluetoothDisabledLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(24.0f, 24.707f)
                lineToRelative(-9.146f, 9.147f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(9.646f, -9.646f)
                lineTo(2.646f, 2.354f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(43.0f, 43.0f)
                lineToRelative(-0.707f, 0.708f)
                lineTo(34.5f, 34.207f)
                lineToRelative(-9.646f, 9.647f)
                lineToRelative(-0.854f, 0.853f)
                verticalLineToRelative(-20.0f)
                moveToRelative(9.793f, 8.793f)
                lineTo(25.0f, 42.293f)
                lineTo(25.0f, 24.707f)
                close()
                moveTo(24.853f, 3.146f)
                lineTo(24.0f, 2.293f)
                lineTo(24.0f, 20.0f)
                horizontalLineToRelative(1.0f)
                lineTo(25.0f, 4.707f)
                lineToRelative(8.793f, 8.793f)
                lineToRelative(-7.146f, 7.146f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(7.5f, -7.5f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(-0.353f, -0.354f)
                close()
            }
        }
        .build()
        return _bluetoothDisabledLarge!!
    }

private var _bluetoothDisabledLarge: ImageVector? = null
