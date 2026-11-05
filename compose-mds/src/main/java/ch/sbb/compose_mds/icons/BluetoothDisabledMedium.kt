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
                moveToRelative(17.585f, 4.129f)
                lineToRelative(-0.835f, -0.751f)
                lineTo(16.75f, 13.5f)
                horizontalLineToRelative(1.0f)
                lineTo(17.75f, 5.623f)
                lineToRelative(6.228f, 5.605f)
                lineToRelative(-3.29f, 2.632f)
                lineToRelative(0.624f, 0.78f)
                lineToRelative(3.75f, -3.0f)
                lineToRelative(0.46f, -0.367f)
                lineToRelative(-0.437f, -0.394f)
                close()
                moveTo(5.645f, 7.854f)
                lineTo(16.13f, 18.336f)
                lineToRelative(-6.713f, 6.042f)
                lineToRelative(0.668f, 0.743f)
                lineToRelative(6.666f, -5.998f)
                verticalLineToRelative(13.49f)
                lineToRelative(0.832f, -0.74f)
                lineToRelative(6.398f, -5.686f)
                lineToRelative(4.166f, 4.167f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(-22.5f, -22.5f)
                close()
                moveTo(23.27f, 25.478f)
                lineTo(17.749f, 19.958f)
                verticalLineToRelative(10.428f)
                close()
            }
        }
        .build()
        return _bluetoothDisabledMedium!!
    }

private var _bluetoothDisabledMedium: ImageVector? = null
