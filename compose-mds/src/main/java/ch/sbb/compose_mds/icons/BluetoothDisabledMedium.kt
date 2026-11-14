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

public val SBBIcons.BluetoothDisabledMedium: ImageVector
    get() {
        if (_bluetoothDisabledMedium != null) {
            return _bluetoothDisabledMedium!!
        }
        _bluetoothDisabledMedium = Builder(name = "BluetoothDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(25.085f, 10.878f)
                lineToRelative(-7.5f, -6.75f)
                lineToRelative(-0.835f, -0.75f)
                lineTo(16.75f, 13.5f)
                horizontalLineToRelative(1.0f)
                lineTo(17.75f, 5.623f)
                lineToRelative(6.227f, 5.605f)
                lineToRelative(-3.29f, 2.632f)
                lineToRelative(0.625f, 0.78f)
                lineToRelative(3.75f, -3.0f)
                lineToRelative(0.46f, -0.367f)
                close()
                moveTo(28.146f, 30.354f)
                lineTo(28.854f, 29.647f)
                lineTo(6.354f, 7.147f)
                lineTo(5.647f, 7.854f)
                lineTo(16.129f, 18.336f)
                lineTo(9.416f, 24.378f)
                lineTo(10.084f, 25.122f)
                lineTo(16.75f, 19.123f)
                verticalLineToRelative(13.49f)
                lineToRelative(0.832f, -0.74f)
                lineToRelative(6.398f, -5.686f)
                close()
                moveTo(23.271f, 25.478f)
                lineTo(17.75f, 19.958f)
                verticalLineToRelative(10.427f)
                close()
            }
        }
        .build()
        return _bluetoothDisabledMedium!!
    }

private var _bluetoothDisabledMedium: ImageVector? = null
