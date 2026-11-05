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
        _circleLeafPowerPlugSmall = Builder(
            name = "CircleLeafPowerPlugSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
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
                moveToRelative(8.174f, 2.864f)
                lineToRelative(-0.176f, -0.622f)
                lineToRelative(-0.558f, 0.327f)
                quadToRelative(-0.053f, 0.03f, -0.182f, 0.098f)
                curveToRelative(-0.399f, 0.212f, -1.279f, 0.68f, -1.91f, 1.216f)
                curveToRelative(-0.457f, 0.389f, -0.79f, 0.712f, -1.044f, 1.067f)
                curveToRelative(-0.26f, 0.362f, -0.42f, 0.732f, -0.569f, 1.193f)
                curveToRelative(-0.175f, 0.543f, -0.23f, 1.155f, -0.244f, 1.669f)
                curveToRelative(-0.01f, 0.35f, -0.002f, 0.701f, 0.004f, 0.945f)
                lineToRelative(0.004f, 0.158f)
                curveTo(3.161f, 9.872f, 3.0f, 10.952f, 3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.0f, -9.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                curveToRelative(0.0f, -0.88f, 0.126f, -1.77f, 0.377f, -2.559f)
                curveToRelative(0.285f, -0.051f, 0.677f, -0.127f, 1.072f, -0.23f)
                curveToRelative(0.279f, -0.073f, 0.57f, -0.162f, 0.834f, -0.269f)
                curveToRelative(0.257f, -0.104f, 0.523f, -0.24f, 0.726f, -0.42f)
                lineToRelative(0.07f, -0.06f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 8.427f, 6.19f)
                curveToRelative(0.109f, -0.59f, 0.083f, -1.28f, 0.016f, -1.874f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.268f, -1.452f)
                moveTo(5.995f, 4.645f)
                curveToRelative(0.417f, -0.354f, 0.94f, -0.662f, 1.355f, -0.89f)
                curveToRelative(0.036f, 0.203f, 0.071f, 0.432f, 0.098f, 0.672f)
                curveToRelative(0.063f, 0.556f, 0.077f, 1.133f, -0.005f, 1.582f)
                curveToRelative(-0.183f, 0.995f, -0.732f, 1.456f, -1.014f, 1.693f)
                quadToRelative(-0.048f, 0.04f, -0.084f, 0.072f)
                curveToRelative(-0.078f, 0.07f, -0.222f, 0.154f, -0.438f, 0.242f)
                curveToRelative(-0.21f, 0.085f, -0.455f, 0.16f, -0.71f, 0.227f)
                curveToRelative(-0.246f, 0.064f, -0.491f, 0.117f, -0.71f, 0.16f)
                quadToRelative(-0.005f, -0.251f, 0.003f, -0.562f)
                curveToRelative(0.014f, -0.481f, 0.065f, -0.983f, 0.197f, -1.392f)
                curveToRelative(0.13f, -0.404f, 0.252f, -0.669f, 0.43f, -0.917f)
                curveToRelative(0.182f, -0.254f, 0.44f, -0.515f, 0.878f, -0.887f)
                moveTo(11.5f, 15.96f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(15.96f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.5f, 2.959f)
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
