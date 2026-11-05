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
        _chargingStationSmall = Builder(
            name = "ChargingStationSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(7.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 4.5f)
                lineTo(6.0f, 21.0f)
                horizontalLineToRelative(10.0f)
                lineTo(16.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 3.0f)
                close()
                moveTo(5.0f, 4.5f)
                lineTo(5.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.423f, 0.0f, 0.641f, 0.104f, 0.76f, 0.224f)
                curveToRelative(0.123f, 0.123f, 0.23f, 0.35f, 0.24f, 0.782f)
                verticalLineToRelative(1.023f)
                curveToRelative(0.0f, 0.248f, 0.0f, 0.703f, 0.162f, 1.103f)
                curveToRelative(0.088f, 0.22f, 0.233f, 0.445f, 0.47f, 0.614f)
                curveToRelative(0.24f, 0.17f, 0.533f, 0.254f, 0.868f, 0.254f)
                curveToRelative(0.333f, 0.0f, 0.626f, -0.08f, 0.866f, -0.248f)
                curveToRelative(0.239f, -0.166f, 0.385f, -0.39f, 0.475f, -0.61f)
                curveToRelative(0.163f, -0.403f, 0.16f, -0.865f, 0.16f, -1.123f)
                lineTo(21.0f, 17.0f)
                verticalLineToRelative(-3.05f)
                curveToRelative(1.14f, -0.23f, 2.0f, -1.24f, 2.0f, -2.449f)
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
                curveToRelative(0.002f, 0.29f, -0.004f, 0.562f, -0.086f, 0.762f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, -0.12f, 0.167f)
                curveToRelative(-0.042f, 0.029f, -0.125f, 0.068f, -0.294f, 0.068f)
                curveToRelative(-0.165f, 0.0f, -0.247f, -0.04f, -0.288f, -0.069f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.123f, -0.173f)
                curveToRelative(-0.082f, -0.205f, -0.088f, -0.48f, -0.089f, -0.758f)
                verticalLineToRelative(-1.011f)
                curveToRelative(-0.013f, -0.573f, -0.157f, -1.095f, -0.53f, -1.47f)
                curveToRelative(-0.375f, -0.377f, -0.895f, -0.519f, -1.47f, -0.519f)
                lineTo(17.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.0f, 4.5f)
                moveToRelative(2.5f, 0.5f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                lineTo(15.0f, 5.0f)
                lineTo(7.5f, 5.0f)
                moveTo(8.0f, 9.0f)
                lineTo(8.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 11.5f)
                lineTo(19.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
            }
        }
            .build()
        return _chargingStationSmall!!
    }

private var _chargingStationSmall: ImageVector? = null
