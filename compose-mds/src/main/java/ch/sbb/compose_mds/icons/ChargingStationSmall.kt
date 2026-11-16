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

public val SBBIcons.ChargingStationSmall: ImageVector
    get() {
        if (_chargingStationSmall != null) {
            return _chargingStationSmall!!
        }
        _chargingStationSmall = Builder(name = "ChargingStationSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 3.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 4.5f)
                lineTo(6.0f, 21.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(5.0f, 4.5f)
                lineTo(5.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.423f, 0.0f, 0.64f, 0.104f, 0.76f, 0.225f)
                curveToRelative(0.108f, 0.107f, 0.203f, 0.296f, 0.232f, 0.632f)
                lineToRelative(0.008f, 0.155f)
                verticalLineToRelative(1.019f)
                curveToRelative(0.0f, 0.248f, 0.0f, 0.702f, 0.161f, 1.1f)
                curveToRelative(0.089f, 0.22f, 0.234f, 0.446f, 0.47f, 0.615f)
                curveToRelative(0.24f, 0.17f, 0.534f, 0.254f, 0.869f, 0.254f)
                curveToRelative(0.333f, 0.0f, 0.626f, -0.08f, 0.866f, -0.248f)
                curveToRelative(0.239f, -0.166f, 0.385f, -0.39f, 0.475f, -0.61f)
                curveToRelative(0.126f, -0.311f, 0.153f, -0.657f, 0.158f, -0.917f)
                lineToRelative(0.001f, -0.228f)
                lineTo(21.0f, 13.95f)
                curveToRelative(1.14f, -0.232f, 2.0f, -1.241f, 2.0f, -2.45f)
                lineTo(23.0f, 10.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(22.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.209f, 0.86f, 2.218f, 2.0f, 2.45f)
                verticalLineToRelative(3.053f)
                curveToRelative(0.002f, 0.29f, -0.005f, 0.562f, -0.086f, 0.762f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, -0.12f, 0.167f)
                curveToRelative(-0.042f, 0.029f, -0.125f, 0.068f, -0.294f, 0.068f)
                curveToRelative(-0.165f, 0.0f, -0.247f, -0.039f, -0.288f, -0.068f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.123f, -0.174f)
                curveToRelative(-0.062f, -0.154f, -0.08f, -0.347f, -0.086f, -0.551f)
                lineTo(19.0f, 16.999f)
                verticalLineToRelative(-1.01f)
                curveToRelative(-0.013f, -0.573f, -0.157f, -1.095f, -0.53f, -1.47f)
                curveToRelative(-0.374f, -0.377f, -0.895f, -0.519f, -1.47f, -0.519f)
                lineTo(17.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.0f, 4.5f)
                moveTo(15.0f, 10.0f)
                lineTo(15.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(14.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                lineTo(8.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chargingStationSmall!!
    }

private var _chargingStationSmall: ImageVector? = null
