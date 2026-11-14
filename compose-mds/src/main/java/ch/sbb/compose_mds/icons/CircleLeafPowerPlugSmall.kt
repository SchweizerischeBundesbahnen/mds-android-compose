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

public val SBBIcons.CircleLeafPowerPlugSmall: ImageVector
    get() {
        if (_circleLeafPowerPlugSmall != null) {
            return _circleLeafPowerPlugSmall!!
        }
        _circleLeafPowerPlugSmall = Builder(name = "CircleLeafPowerPlugSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.442f, 4.316f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.268f, -1.452f)
                lineTo(8.0f, 2.241f)
                lineToRelative(-0.559f, 0.327f)
                lineToRelative(-0.182f, 0.099f)
                curveToRelative(-0.4f, 0.212f, -1.28f, 0.68f, -1.91f, 1.216f)
                curveToRelative(-0.458f, 0.388f, -0.79f, 0.712f, -1.044f, 1.067f)
                curveToRelative(-0.259f, 0.362f, -0.42f, 0.732f, -0.569f, 1.193f)
                curveToRelative(-0.175f, 0.542f, -0.23f, 1.155f, -0.244f, 1.669f)
                curveToRelative(-0.01f, 0.35f, -0.002f, 0.702f, 0.004f, 0.946f)
                lineToRelative(0.004f, 0.157f)
                curveTo(3.16f, 9.872f, 3.0f, 10.952f, 3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.0f, -9.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                curveToRelative(0.0f, -0.88f, 0.126f, -1.771f, 0.378f, -2.56f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 1.07f, -0.229f)
                curveToRelative(0.28f, -0.073f, 0.57f, -0.161f, 0.835f, -0.269f)
                curveToRelative(0.257f, -0.104f, 0.523f, -0.24f, 0.726f, -0.42f)
                quadToRelative(0.027f, -0.025f, 0.07f, -0.06f)
                curveToRelative(0.296f, -0.245f, 1.097f, -0.912f, 1.347f, -2.272f)
                curveToRelative(0.11f, -0.59f, 0.082f, -1.28f, 0.016f, -1.874f)
                moveToRelative(-2.446f, 0.33f)
                curveToRelative(0.415f, -0.354f, 0.938f, -0.66f, 1.352f, -0.888f)
                curveToRelative(0.037f, 0.202f, 0.074f, 0.43f, 0.1f, 0.67f)
                curveToRelative(0.063f, 0.555f, 0.078f, 1.132f, -0.005f, 1.58f)
                curveToRelative(-0.183f, 0.997f, -0.732f, 1.458f, -1.014f, 1.695f)
                lineToRelative(-0.084f, 0.071f)
                curveToRelative(-0.078f, 0.07f, -0.222f, 0.154f, -0.438f, 0.242f)
                curveToRelative(-0.21f, 0.085f, -0.455f, 0.16f, -0.71f, 0.227f)
                curveToRelative(-0.246f, 0.064f, -0.491f, 0.116f, -0.71f, 0.158f)
                quadToRelative(-0.004f, -0.25f, 0.004f, -0.56f)
                curveToRelative(0.014f, -0.481f, 0.064f, -0.983f, 0.196f, -1.392f)
                curveToRelative(0.13f, -0.404f, 0.252f, -0.67f, 0.43f, -0.917f)
                curveToRelative(0.182f, -0.254f, 0.44f, -0.514f, 0.879f, -0.886f)
                moveTo(12.5f, 15.959f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(15.96f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-0.004f, 0.154f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.5f, 15.96f)
                moveTo(10.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _circleLeafPowerPlugSmall!!
    }

private var _circleLeafPowerPlugSmall: ImageVector? = null
