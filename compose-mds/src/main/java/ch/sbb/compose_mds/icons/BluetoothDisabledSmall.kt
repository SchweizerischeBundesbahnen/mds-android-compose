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
                moveTo(11.835f, 2.629f)
                lineTo(11.0f, 1.878f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 4.123f)
                lineToRelative(3.728f, 3.355f)
                lineToRelative(-2.04f, 1.632f)
                lineToRelative(0.624f, 0.78f)
                lineToRelative(2.5f, -2.0f)
                lineToRelative(0.46f, -0.367f)
                lineToRelative(-0.437f, -0.394f)
                close()
                moveTo(3.646f, 5.354f)
                lineToRelative(6.865f, 6.864f)
                lineToRelative(-4.345f, 3.91f)
                lineToRelative(0.669f, 0.743f)
                lineTo(11.0f, 13.123f)
                verticalLineToRelative(8.99f)
                lineToRelative(0.832f, -0.74f)
                lineToRelative(4.148f, -3.686f)
                lineToRelative(2.666f, 2.667f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(-15.0f, -15.0f)
                close()
                moveTo(15.271f, 16.979f)
                lineTo(12.0f, 13.707f)
                verticalLineToRelative(6.18f)
                close()
            }
        }
        .build()
        return _bluetoothDisabledSmall!!
    }

private var _bluetoothDisabledSmall: ImageVector? = null
