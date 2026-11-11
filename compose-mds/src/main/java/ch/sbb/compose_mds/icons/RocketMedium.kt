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

public val SBBIcons.RocketMedium: ImageVector
    get() {
        if (_rocketMedium != null) {
            return _rocketMedium!!
        }
        _rocketMedium = Builder(name = "RocketMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.379f, 4.174f)
                curveToRelative(5.636f, 6.557f, 6.959f, 13.434f, 6.867f, 18.669f)
                quadToRelative(-0.015f, 0.83f, -0.073f, 1.601f)
                curveToRelative(2.312f, 1.47f, 3.367f, 4.174f, 2.867f, 6.728f)
                lineToRelative(-0.183f, 0.938f)
                lineToRelative(-0.666f, -0.685f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, false, -2.95f, -1.553f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -0.53f, 1.645f)
                lineToRelative(-0.04f, 0.102f)
                lineToRelative(-0.01f, 0.026f)
                lineToRelative(-0.018f, 0.044f)
                verticalLineToRelative(0.003f)
                lineToRelative(-0.462f, -0.192f)
                lineToRelative(0.46f, 0.193f)
                lineToRelative(-0.279f, 0.668f)
                lineToRelative(-0.525f, -0.498f)
                curveToRelative(-2.437f, -2.309f, -4.83f, -2.294f, -6.63f, -1.726f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -3.035f, 1.718f)
                lineToRelative(-0.009f, 0.008f)
                lineToRelative(-0.525f, 0.498f)
                lineToRelative(-0.28f, -0.668f)
                lineToRelative(0.461f, -0.193f)
                lineToRelative(-0.462f, 0.192f)
                verticalLineToRelative(-0.003f)
                lineToRelative(-0.018f, -0.044f)
                lineToRelative(-0.01f, -0.026f)
                lineToRelative(-0.041f, -0.102f)
                arcToRelative(21.653f, 21.653f, 0.0f, false, true, -0.53f, -1.645f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, false, -2.95f, 1.553f)
                lineToRelative(-0.666f, 0.685f)
                lineToRelative(-0.182f, -0.938f)
                curveToRelative(-0.5f, -2.554f, 0.555f, -5.258f, 2.867f, -6.728f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, true, -0.073f, -1.601f)
                curveToRelative(-0.092f, -5.235f, 1.23f, -12.112f, 6.867f, -18.67f)
                lineToRelative(0.379f, -0.44f)
                close()
                moveTo(24.49f, 28.9f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 2.668f, 1.17f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, -2.093f, -4.48f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -0.575f, 3.31f)
                moveTo(10.934f, 25.59f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.575f, 3.311f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -2.668f, 1.17f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, 2.093f, -4.481f)
                moveToRelative(4.18f, -16.129f)
                curveToRelative(-2.715f, 4.82f, -3.427f, 9.545f, -3.36f, 13.364f)
                curveToRelative(0.044f, 2.524f, 0.429f, 4.652f, 0.802f, 6.148f)
                curveToRelative(0.18f, 0.723f, 0.357f, 1.297f, 0.49f, 1.695f)
                arcToRelative(9.69f, 9.69f, 0.0f, false, true, 2.86f, -1.485f)
                curveToRelative(1.944f, -0.614f, 4.497f, -0.643f, 7.055f, 1.458f)
                curveToRelative(0.133f, -0.397f, 0.307f, -0.962f, 0.483f, -1.668f)
                curveToRelative(0.373f, -1.496f, 0.758f, -3.624f, 0.802f, -6.148f)
                curveToRelative(0.067f, -3.82f, -0.646f, -8.544f, -3.36f, -13.364f)
                arcToRelative(5.68f, 5.68f, 0.0f, false, true, -5.772f, 0.0f)
                moveToRelative(0.507f, -0.861f)
                arcToRelative(4.681f, 4.681f, 0.0f, false, false, 4.758f, 0.0f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, false, -2.38f, -3.322f)
                arcTo(29.0f, 29.0f, 0.0f, false, false, 15.622f, 8.6f)
                moveToRelative(4.129f, 7.9f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 5.5f, 0.0f)
            }
        }
        .build()
        return _rocketMedium!!
    }

private var _rocketMedium: ImageVector? = null
