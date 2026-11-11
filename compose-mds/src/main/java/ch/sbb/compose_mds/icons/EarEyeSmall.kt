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

public val SBBIcons.EarEyeSmall: ImageVector
    get() {
        if (_earEyeSmall != null) {
            return _earEyeSmall!!
        }
        _earEyeSmall = Builder(name = "EarEyeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, 0.17f, 0.055f, 0.436f, 0.206f, 0.646f)
                curveToRelative(0.132f, 0.183f, 0.357f, 0.354f, 0.794f, 0.354f)
                reflectiveCurveToRelative(0.662f, -0.17f, 0.794f, -0.354f)
                curveToRelative(0.15f, -0.21f, 0.206f, -0.476f, 0.206f, -0.646f)
                curveToRelative(0.0f, -1.708f, 1.127f, -2.835f, 1.63f, -3.336f)
                lineToRelative(0.016f, -0.018f)
                curveTo(8.154f, 8.14f, 9.0f, 7.272f, 9.0f, 6.0f)
                curveToRelative(0.0f, -0.505f, -0.155f, -1.271f, -0.605f, -1.896f)
                curveTo(7.962f, 3.504f, 7.237f, 3.0f, 6.0f, 3.0f)
                reflectiveCurveToRelative(-1.962f, 0.504f, -2.395f, 1.104f)
                curveTo(3.155f, 4.729f, 3.0f, 5.494f, 3.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                curveToRelative(0.0f, -0.665f, 0.194f, -1.65f, 0.794f, -2.481f)
                curveTo(3.412f, 2.66f, 4.437f, 2.0f, 6.0f, 2.0f)
                reflectiveCurveToRelative(2.588f, 0.661f, 3.206f, 1.519f)
                curveTo(9.806f, 4.35f, 10.0f, 5.335f, 10.0f, 6.0f)
                curveToRelative(0.0f, 1.708f, -1.127f, 2.835f, -1.63f, 3.336f)
                lineToRelative(-0.016f, 0.018f)
                curveTo(7.846f, 9.86f, 7.0f, 10.728f, 7.0f, 12.0f)
                curveToRelative(0.0f, 0.33f, -0.095f, 0.814f, -0.395f, 1.23f)
                curveToRelative(-0.317f, 0.44f, -0.842f, 0.77f, -1.605f, 0.77f)
                reflectiveCurveToRelative(-1.288f, -0.33f, -1.605f, -0.77f)
                curveTo(3.095f, 12.814f, 3.0f, 12.33f, 3.0f, 12.0f)
                close()
                moveTo(19.354f, 4.354f)
                lineTo(4.354f, 19.354f)
                lineTo(3.646f, 18.647f)
                lineTo(18.646f, 3.647f)
                close()
                moveTo(17.0f, 18.0f)
                curveToRelative(0.0f, -0.554f, -0.446f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.446f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.446f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.446f, 1.0f, -1.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.106f, -0.894f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.894f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.894f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.894f, 2.0f, 2.0f)
                moveTo(4.633f, 7.277f)
                curveToRelative(0.225f, 0.244f, 0.367f, 0.5f, 0.367f, 0.723f)
                curveToRelative(0.0f, 0.554f, -0.446f, 1.0f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.106f, 0.0f, 2.0f, -0.894f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.607f, -0.358f, -1.102f, -0.633f, -1.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.361f, -0.34f)
                curveToRelative(0.031f, -0.532f, 0.168f, -0.83f, 0.31f, -0.994f)
                curveTo(5.468f, 5.09f, 5.687f, 5.0f, 6.0f, 5.0f)
                curveToRelative(0.554f, 0.0f, 1.0f, 0.446f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -1.106f, -0.894f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.517f, 0.0f, -1.048f, 0.16f, -1.438f, 0.61f)
                curveTo(4.182f, 5.047f, 4.0f, 5.684f, 4.0f, 6.5f)
                verticalLineToRelative(0.267f)
                lineToRelative(0.222f, 0.148f)
                lineTo(4.22f, 6.915f)
                lineToRelative(0.005f, 0.003f)
                lineToRelative(0.01f, 0.007f)
                lineToRelative(0.012f, 0.01f)
                quadToRelative(0.033f, 0.023f, 0.094f, 0.072f)
                curveToRelative(0.08f, 0.065f, 0.187f, 0.157f, 0.29f, 0.27f)
                moveTo(21.487f, 17.34f)
                curveTo(20.107f, 15.457f, 18.11f, 14.0f, 16.0f, 14.0f)
                curveToRelative(-2.25f, 0.0f, -4.372f, 1.658f, -5.755f, 3.722f)
                lineToRelative(-0.186f, 0.278f)
                lineToRelative(0.186f, 0.278f)
                curveTo(11.628f, 20.342f, 13.75f, 22.0f, 16.0f, 22.0f)
                curveToRelative(2.1f, 0.0f, 4.105f, -1.457f, 5.487f, -3.34f)
                lineToRelative(0.269f, -0.382f)
                lineToRelative(0.186f, -0.278f)
                lineToRelative(-0.186f, -0.278f)
                close()
                moveTo(11.27f, 18.0f)
                curveToRelative(1.285f, -1.785f, 3.047f, -3.0f, 4.73f, -3.0f)
                reflectiveCurveToRelative(3.444f, 1.215f, 4.728f, 3.0f)
                curveToRelative(-1.285f, 1.784f, -3.054f, 3.0f, -4.728f, 3.0f)
                curveToRelative(-1.684f, 0.0f, -3.445f, -1.215f, -4.73f, -3.0f)
            }
        }
        .build()
        return _earEyeSmall!!
    }

private var _earEyeSmall: ImageVector? = null
