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
                moveTo(18.858f, 12.014f)
                curveToRelative(0.92f, 0.072f, 1.765f, 0.422f, 2.447f, 0.966f)
                lineToRelative(-0.624f, 0.782f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.0f, 16.499f)
                verticalLineToRelative(0.5f)
                lineTo(8.95f, 16.999f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(2.014f, 16.999f)
                lineTo(2.0f, 16.514f)
                curveToRelative(-0.055f, -1.922f, 0.788f, -3.526f, 1.813f, -4.648f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, true, 1.62f, -1.328f)
                curveToRelative(0.53f, -0.31f, 1.077f, -0.516f, 1.544f, -0.537f)
                horizontalLineToRelative(3.372f)
                lineToRelative(-0.411f, 0.741f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(-0.007f, 0.012f)
                lineToRelative(-0.027f, 0.053f)
                quadToRelative(-0.038f, 0.073f, -0.105f, 0.217f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.325f, 0.814f)
                curveToRelative(-0.2f, 0.578f, -0.395f, 1.33f, -0.455f, 2.16f)
                horizontalLineToRelative(2.739f)
                lineToRelative(4.635f, -5.915f)
                lineTo(15.648f, 6.0f)
                lineTo(14.0f, 6.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(2.352f)
                lineToRelative(0.119f, 0.332f)
                close()
                moveTo(16.79f, 9.2f)
                lineToRelative(-4.396f, 5.609f)
                lineToRelative(-0.15f, 0.191f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.17f, 0.266f, -2.226f, 0.527f, -2.985f)
                quadToRelative(0.1f, -0.285f, 0.193f, -0.514f)
                lineTo(7.013f, 11.001f)
                curveToRelative(-0.24f, 0.014f, -0.62f, 0.135f, -1.075f, 0.401f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -1.387f, 1.14f)
                curveToRelative(-0.805f, 0.88f, -1.451f, 2.067f, -1.542f, 3.458f)
                horizontalLineToRelative(11.019f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.781f, -3.946f)
                close()
                moveTo(5.085f, 17.0f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, false, 2.83f, 0.0f)
                close()
                moveTo(18.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.001f, 3.002f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.001f, -3.002f)
                moveTo(16.0f, 16.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.002f, 0.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 16.5f)
            }
        }
        .build()
        return _scooterProfileSmall!!
    }

private var _scooterProfileSmall: ImageVector? = null
