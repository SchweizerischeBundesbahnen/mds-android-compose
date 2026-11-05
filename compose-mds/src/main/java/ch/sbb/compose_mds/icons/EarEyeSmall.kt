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
                moveTo(3.606f, 4.104f)
                curveTo(3.156f, 4.729f, 3.0f, 5.494f, 3.0f, 6.0f)
                horizontalLineTo(2.0f)
                curveToRelative(0.0f, -0.665f, 0.195f, -1.649f, 0.794f, -2.481f)
                curveTo(3.412f, 2.661f, 4.437f, 2.0f, 6.0f, 2.0f)
                reflectiveCurveToRelative(2.588f, 0.661f, 3.206f, 1.519f)
                curveTo(9.806f, 4.351f, 10.0f, 5.335f, 10.0f, 6.0f)
                curveToRelative(0.0f, 1.708f, -1.127f, 2.835f, -1.63f, 3.336f)
                lineToRelative(-0.016f, 0.018f)
                curveTo(7.846f, 9.86f, 7.0f, 10.728f, 7.0f, 12.0f)
                curveToRelative(0.0f, 0.33f, -0.095f, 0.814f, -0.394f, 1.23f)
                curveToRelative(-0.318f, 0.44f, -0.843f, 0.77f, -1.606f, 0.77f)
                reflectiveCurveToRelative(-1.288f, -0.33f, -1.606f, -0.77f)
                curveTo(3.094f, 12.814f, 3.0f, 12.33f, 3.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.17f, 0.055f, 0.436f, 0.206f, 0.645f)
                curveToRelative(0.132f, 0.184f, 0.357f, 0.355f, 0.794f, 0.355f)
                reflectiveCurveToRelative(0.662f, -0.17f, 0.794f, -0.355f)
                curveTo(5.944f, 12.436f, 6.0f, 12.17f, 6.0f, 12.0f)
                curveToRelative(0.0f, -1.708f, 1.127f, -2.835f, 1.63f, -3.336f)
                lineToRelative(0.016f, -0.018f)
                curveTo(8.154f, 8.14f, 9.0f, 7.272f, 9.0f, 6.0f)
                curveToRelative(0.0f, -0.505f, -0.155f, -1.271f, -0.606f, -1.896f)
                curveTo(7.962f, 3.504f, 7.237f, 3.0f, 6.0f, 3.0f)
                reflectiveCurveToRelative(-1.962f, 0.504f, -2.394f, 1.104f)
                moveToRelative(0.04f, 14.542f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(0.708f, 0.708f)
                lineToRelative(-15.0f, 15.0f)
                close()
                moveTo(14.0f, 18.0f)
                curveToRelative(0.0f, -1.106f, 0.894f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.894f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.894f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.894f, -2.0f, -2.0f)
                moveToRelative(2.0f, -1.0f)
                curveToRelative(-0.554f, 0.0f, -1.0f, 0.446f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.446f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.446f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.446f, -1.0f, -1.0f, -1.0f)
                moveTo(5.316f, 5.265f)
                curveToRelative(-0.142f, 0.164f, -0.277f, 0.462f, -0.31f, 0.994f)
                curveToRelative(0.103f, 0.084f, 0.232f, 0.2f, 0.362f, 0.34f)
                curveTo(5.643f, 6.9f, 6.0f, 7.393f, 6.0f, 8.0f)
                curveToRelative(0.0f, 1.106f, -0.894f, 2.0f, -2.0f, 2.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.554f, 0.0f, 1.0f, -0.446f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.223f, -0.143f, -0.478f, -0.368f, -0.722f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.407f, -0.36f)
                lineToRelative(-0.004f, -0.003f)
                lineTo(4.0f, 6.767f)
                verticalLineTo(6.5f)
                curveToRelative(0.0f, -0.815f, 0.18f, -1.452f, 0.561f, -1.89f)
                curveTo(4.952f, 4.16f, 5.483f, 4.0f, 6.0f, 4.0f)
                curveToRelative(1.106f, 0.0f, 2.0f, 0.894f, 2.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveToRelative(0.0f, -0.554f, -0.446f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.313f, 0.0f, -0.532f, 0.09f, -0.684f, 0.265f)
                moveTo(16.0f, 14.0f)
                curveToRelative(-2.25f, 0.0f, -4.373f, 1.658f, -5.755f, 3.722f)
                lineToRelative(-0.187f, 0.278f)
                lineToRelative(0.187f, 0.278f)
                curveTo(11.627f, 20.342f, 13.75f, 22.0f, 16.0f, 22.0f)
                curveToRelative(2.24f, 0.0f, 4.372f, -1.657f, 5.755f, -3.722f)
                lineToRelative(0.187f, -0.278f)
                lineToRelative(-0.187f, -0.278f)
                curveTo(20.373f, 15.658f, 18.25f, 14.0f, 16.0f, 14.0f)
                moveToRelative(0.0f, 7.0f)
                curveToRelative(-1.684f, 0.0f, -3.447f, -1.215f, -4.731f, -3.0f)
                curveToRelative(1.284f, -1.785f, 3.047f, -3.0f, 4.731f, -3.0f)
                reflectiveCurveToRelative(3.447f, 1.215f, 4.731f, 3.0f)
                curveToRelative(-1.285f, 1.785f, -3.056f, 3.0f, -4.731f, 3.0f)
            }
        }
        .build()
        return _earEyeSmall!!
    }

private var _earEyeSmall: ImageVector? = null
