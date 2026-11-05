package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.CloudFogLarge: ImageVector
    get() {
        if (_cloudFogLarge != null) {
            return _cloudFogLarge!!
        }
        _cloudFogLarge = Builder(
            name = "CloudFogLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(34.986f, 38.0f)
                lineTo(12.0f, 38.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(22.986f)
                close()
                moveTo(36.986f, 34.0f)
                lineTo(10.0f, 34.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(26.986f)
                close()
                moveTo(21.108f, 16.356f)
                curveToRelative(1.708f, -3.208f, 4.98f, -4.006f, 7.613f, -3.05f)
                curveToRelative(1.382f, 0.501f, 2.597f, 1.488f, 3.316f, 2.86f)
                curveToRelative(0.645f, 1.232f, 0.874f, 2.748f, 0.5f, 4.457f)
                curveToRelative(1.098f, 0.116f, 1.974f, 0.637f, 2.578f, 1.394f)
                curveToRelative(0.71f, 0.889f, 1.029f, 2.073f, 0.95f, 3.243f)
                curveToRelative(-0.08f, 1.173f, -0.563f, 2.362f, -1.494f, 3.26f)
                curveToRelative(-0.937f, 0.903f, -2.297f, 1.48f, -4.071f, 1.481f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-1.796f, 0.0f, -3.14f, -0.578f, -4.048f, -1.492f)
                curveToRelative(-0.901f, -0.909f, -1.331f, -2.108f, -1.383f, -3.286f)
                curveToRelative(-0.05f, -1.175f, 0.273f, -2.363f, 0.921f, -3.27f)
                curveToRelative(0.56f, -0.782f, 1.37f, -1.36f, 2.38f, -1.512f)
                curveToRelative(-0.091f, -3.762f, 3.876f, -5.833f, 6.738f, -4.085f)
                moveToRelative(7.272f, -2.11f)
                curveToRelative(-2.323f, -0.843f, -5.237f, -0.083f, -6.622f, 3.057f)
                lineToRelative(-0.266f, 0.601f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-2.288f, -1.874f, -5.998f, -0.089f, -5.587f, 3.355f)
                lineToRelative(0.068f, 0.558f)
                lineTo(14.9f, 21.4f)
                curveToRelative(-0.883f, 0.0f, -1.597f, 0.438f, -2.096f, 1.135f)
                curveToRelative(-0.505f, 0.706f, -0.778f, 1.669f, -0.736f, 2.644f)
                curveToRelative(0.043f, 0.972f, 0.396f, 1.922f, 1.094f, 2.626f)
                curveTo(13.854f, 28.502f, 14.93f, 29.0f, 16.5f, 29.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.547f, 0.0f, 2.648f, -0.498f, 3.377f, -1.201f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.19f, -2.609f)
                curveToRelative(0.065f, -0.955f, -0.2f, -1.883f, -0.733f, -2.55f)
                curveToRelative(-0.523f, -0.654f, -1.324f, -1.084f, -2.414f, -1.04f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.516f, -1.736f, 0.32f, -3.2f, -0.27f, -4.328f)
                curveToRelative(-0.593f, -1.133f, -1.604f, -1.96f, -2.771f, -2.384f)
            }
        }
            .build()
        return _cloudFogLarge!!
    }

private var _cloudFogLarge: ImageVector? = null
