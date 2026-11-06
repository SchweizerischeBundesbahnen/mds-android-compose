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

public val SBBIcons.EarthSmall: ImageVector
    get() {
        if (_earthSmall != null) {
            return _earthSmall!!
        }
        _earthSmall = Builder(name = "EarthSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.598f, 3.109f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 3.0f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, true, 4.218f, 1.048f)
                lineToRelative(-0.571f, 0.373f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.841f, 0.805f)
                lineToRelative(-0.56f, 0.77f)
                lineToRelative(-0.003f, 0.004f)
                lineTo(11.7f, 6.0f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, false, -0.711f, 0.304f)
                lineTo(9.203f, 8.09f)
                lineToRelative(-0.01f, 0.008f)
                lineToRelative(-0.01f, 0.007f)
                lineToRelative(-1.898f, 1.07f)
                curveToRelative(-0.79f, 0.444f, -0.624f, 1.581f, 0.21f, 1.833f)
                lineToRelative(0.004f, 0.002f)
                lineToRelative(1.74f, 0.51f)
                lineToRelative(0.01f, 0.002f)
                lineToRelative(0.01f, 0.003f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.469f, 0.013f)
                lineToRelative(3.743f, -0.755f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.053f, 0.0f)
                lineToRelative(0.378f, 0.093f)
                lineToRelative(0.01f, 0.002f)
                curveToRelative(0.034f, 0.008f, 0.098f, 0.08f, 0.098f, 0.132f)
                verticalLineToRelative(2.29f)
                curveToRelative(0.0f, 0.281f, 0.119f, 0.536f, 0.296f, 0.713f)
                lineToRelative(0.008f, 0.007f)
                lineToRelative(4.276f, 4.11f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.25f, 1.756f)
                lineToRelative(-0.315f, -2.285f)
                lineToRelative(-0.001f, -0.01f)
                lineToRelative(-0.002f, -0.01f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, false, -0.288f, -0.554f)
                lineToRelative(-1.87f, -1.87f)
                lineToRelative(-0.75f, -0.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.158f, -0.184f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.944f, 0.478f)
                verticalLineToRelative(-0.691f)
                curveToRelative(0.0f, -0.556f, -0.444f, -1.0f, -1.0f, -1.0f)
                lineTo(4.8f, 13.01f)
                curveToRelative(-0.364f, 0.0f, -0.699f, 0.2f, -0.876f, 0.515f)
                lineToRelative(-0.004f, 0.007f)
                lineToRelative(-0.552f, 1.023f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 12.0f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, true, 3.746f, -7.308f)
                lineToRelative(1.012f, 0.624f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.262f, 0.074f)
                horizontalLineToRelative(1.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.484f, -0.375f)
                close()
                moveTo(19.231f, 17.359f)
                arcTo(8.96f, 8.96f, 0.0f, false, false, 21.0f, 12.0f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, false, -3.839f, -7.374f)
                lineToRelative(-0.968f, 0.632f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.579f, 0.556f)
                lineToRelative(-0.557f, 0.766f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.817f, 0.42f)
                horizontalLineToRelative(-2.533f)
                lineToRelative(-0.004f, 0.003f)
                lineToRelative(-1.81f, 1.81f)
                lineToRelative(-0.013f, 0.014f)
                lineToRelative(-0.015f, 0.012f)
                lineToRelative(-0.325f, -0.38f)
                lineToRelative(0.325f, 0.38f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.002f, 0.001f)
                lineToRelative(-0.004f, 0.004f)
                lineToRelative(-0.012f, 0.01f)
                lineToRelative(-0.04f, 0.032f)
                curveToRelative(-0.02f, 0.015f, -0.075f, 0.058f, -0.138f, 0.092f)
                lineToRelative(-1.893f, 1.066f)
                lineToRelative(-0.002f, 0.001f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.009f, 0.004f)
                lineToRelative(1.725f, 0.506f)
                lineToRelative(0.013f, 0.002f)
                lineToRelative(3.77f, -0.76f)
                lineToRelative(0.013f, -0.002f)
                lineToRelative(0.014f, -0.002f)
                quadToRelative(0.178f, -0.024f, 0.353f, -0.001f)
                lineToRelative(0.028f, 0.003f)
                lineToRelative(0.029f, 0.007f)
                lineToRelative(0.405f, 0.099f)
                curveToRelative(0.503f, 0.115f, 0.876f, 0.601f, 0.876f, 1.107f)
                verticalLineToRelative(2.292f)
                lineToRelative(0.003f, 0.003f)
                close()
                moveTo(15.036f, 17.751f)
                lineTo(15.394f, 20.338f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 21.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -8.164f, -5.207f)
                lineToRelative(0.96f, -1.779f)
                lineToRelative(0.004f, -0.004f)
                horizontalLineToRelative(5.21f)
                verticalLineToRelative(0.69f)
                curveToRelative(0.0f, 0.724f, 0.768f, 1.243f, 1.447f, 0.895f)
                lineToRelative(0.947f, -0.478f)
                lineToRelative(0.004f, -0.002f)
                lineToRelative(0.749f, 0.748f)
                lineToRelative(1.877f, 1.878f)
                close()
                moveTo(9.502f, 3.351f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -1.814f, 0.747f)
                lineToRelative(0.474f, 0.292f)
                horizontalLineToRelative(1.071f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
            }
        }
        .build()
        return _earthSmall!!
    }

private var _earthSmall: ImageVector? = null
