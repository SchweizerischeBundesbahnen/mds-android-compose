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

public val SBBIcons.ScooterProfilePowerPlugSmall: ImageVector
    get() {
        if (_scooterProfilePowerPlugSmall != null) {
            return _scooterProfilePowerPlugSmall!!
        }
        _scooterProfilePowerPlugSmall = Builder(name = "ScooterProfilePowerPlugSmall", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.47f, 2.332f)
                lineTo(16.354f, 2.0f)
                lineTo(14.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.648f)
                lineToRelative(0.744f, 2.085f)
                lineTo(11.757f, 11.0f)
                lineTo(9.02f, 11.0f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, 0.452f, -2.16f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.431f, -1.032f)
                lineToRelative(0.027f, -0.053f)
                lineToRelative(0.004f, -0.008f)
                lineToRelative(0.002f, -0.003f)
                lineToRelative(0.002f, -0.003f)
                lineToRelative(0.41f, -0.742f)
                horizontalLineToRelative(-3.37f)
                curveToRelative(-0.468f, 0.022f, -1.014f, 0.228f, -1.545f, 0.539f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -1.62f, 1.327f)
                curveTo(2.786f, 9.987f, 1.945f, 11.592f, 2.0f, 13.513f)
                lineToRelative(0.013f, 0.486f)
                lineTo(4.05f, 13.999f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, false, 4.9f, 0.0f)
                lineTo(15.0f, 13.999f)
                verticalLineToRelative(-0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 5.681f, -2.737f)
                lineToRelative(0.624f, -0.781f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -2.448f, -0.967f)
                close()
                moveTo(17.81f, 9.053f)
                lineTo(16.79f, 6.2f)
                lineToRelative(-4.397f, 5.61f)
                lineToRelative(-0.15f, 0.192f)
                lineTo(8.0f, 12.002f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.17f, 0.266f, -2.228f, 0.527f, -2.987f)
                quadToRelative(0.1f, -0.285f, 0.193f, -0.514f)
                lineTo(7.013f, 8.001f)
                curveToRelative(-0.24f, 0.014f, -0.62f, 0.134f, -1.075f, 0.4f)
                curveToRelative(-0.451f, 0.265f, -0.94f, 0.65f, -1.387f, 1.14f)
                curveToRelative(-0.805f, 0.88f, -1.45f, 2.069f, -1.54f, 3.46f)
                horizontalLineToRelative(11.017f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.782f, -3.947f)
                moveTo(5.086f, 14.0f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, false, 2.829f, 0.0f)
                close()
                moveTo(20.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.002f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 13.499f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.001f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.001f, 0.0f)
                moveTo(14.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.501f)
                lineToRelative(-1.002f, 0.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.05f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.232f, 1.14f, 1.241f, 2.0f, 2.45f, 2.0f)
                lineTo(14.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.001f)
                lineToRelative(2.001f, -0.005f)
                lineToRelative(-0.002f, -1.0f)
                close()
                moveTo(12.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.002f, -2.998f)
                lineToRelative(0.502f, -0.002f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _scooterProfilePowerPlugSmall!!
    }

private var _scooterProfilePowerPlugSmall: ImageVector? = null
