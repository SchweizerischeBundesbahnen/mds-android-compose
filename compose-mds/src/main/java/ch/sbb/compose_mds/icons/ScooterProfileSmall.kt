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

public val SBBIcons.ScooterProfileSmall: ImageVector
    get() {
        if (_scooterProfileSmall != null) {
            return _scooterProfileSmall!!
        }
        _scooterProfileSmall = Builder(name = "ScooterProfileSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.47f, 5.332f)
                lineTo(16.354f, 5.0f)
                lineTo(14.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.648f)
                lineToRelative(0.744f, 2.085f)
                lineToRelative(-4.635f, 5.914f)
                lineTo(9.02f, 13.999f)
                curveToRelative(0.06f, -0.828f, 0.253f, -1.58f, 0.452f, -2.159f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.431f, -1.03f)
                lineToRelative(0.032f, -0.062f)
                lineToRelative(0.001f, -0.003f)
                quadToRelative(0.001f, -0.003f, 0.002f, -0.003f)
                lineToRelative(0.41f, -0.742f)
                horizontalLineToRelative(-3.37f)
                curveToRelative(-0.468f, 0.022f, -1.014f, 0.228f, -1.545f, 0.539f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -1.62f, 1.327f)
                curveTo(2.786f, 12.987f, 1.945f, 14.592f, 2.0f, 16.513f)
                lineToRelative(0.013f, 0.486f)
                lineTo(4.05f, 16.999f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, false, 4.9f, 0.0f)
                lineTo(15.0f, 16.999f)
                verticalLineToRelative(-0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 5.681f, -2.737f)
                lineToRelative(0.624f, -0.781f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -2.448f, -0.966f)
                close()
                moveTo(17.81f, 12.053f)
                lineTo(16.79f, 9.2f)
                lineToRelative(-4.397f, 5.61f)
                lineToRelative(-0.15f, 0.19f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.17f, 0.266f, -2.226f, 0.527f, -2.985f)
                quadToRelative(0.099f, -0.286f, 0.192f, -0.513f)
                lineTo(7.013f, 11.002f)
                curveToRelative(-0.24f, 0.013f, -0.62f, 0.133f, -1.075f, 0.4f)
                curveToRelative(-0.451f, 0.264f, -0.94f, 0.65f, -1.387f, 1.14f)
                curveToRelative(-0.805f, 0.88f, -1.45f, 2.068f, -1.54f, 3.458f)
                horizontalLineToRelative(11.017f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.782f, -3.946f)
                moveTo(7.915f, 17.0f)
                horizontalLineToRelative(-2.83f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, false, 2.83f, 0.0f)
                moveTo(20.0f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 16.499f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.001f, -0.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 16.5f)
            }
        }
        .build()
        return _scooterProfileSmall!!
    }

private var _scooterProfileSmall: ImageVector? = null
