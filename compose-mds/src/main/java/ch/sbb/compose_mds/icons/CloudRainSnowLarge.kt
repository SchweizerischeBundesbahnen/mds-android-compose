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

public val SBBIcons.CloudRainSnowLarge: ImageVector
    get() {
        if (_cloudRainSnowLarge != null) {
            return _cloudRainSnowLarge!!
        }
        _cloudRainSnowLarge = Builder(name = "CloudRainSnowLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.5f, 38.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-12.553f, -7.276f)
                lineToRelative(-4.0f, 8.0f)
                lineToRelative(-0.894f, -0.447f)
                lineToRelative(4.0f, -8.0f)
                close()
                moveTo(13.947f, 31.726f)
                lineTo(11.947f, 35.726f)
                lineTo(11.053f, 35.279f)
                lineTo(13.053f, 31.279f)
                close()
                moveTo(21.947f, 31.726f)
                lineTo(19.947f, 35.726f)
                lineTo(19.053f, 35.279f)
                lineTo(21.053f, 31.279f)
                close()
                moveTo(26.5f, 32.003f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-8.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(21.108f, 15.356f)
                curveToRelative(1.708f, -3.207f, 4.979f, -4.005f, 7.613f, -3.05f)
                curveToRelative(1.382f, 0.502f, 2.597f, 1.488f, 3.316f, 2.86f)
                curveToRelative(0.645f, 1.232f, 0.874f, 2.749f, 0.5f, 4.458f)
                curveToRelative(1.096f, 0.116f, 1.964f, 0.638f, 2.558f, 1.397f)
                curveToRelative(0.697f, 0.891f, 0.997f, 2.077f, 0.906f, 3.244f)
                curveToRelative(-0.091f, 1.17f, -0.579f, 2.358f, -1.5f, 3.254f)
                curveToRelative(-0.927f, 0.902f, -2.266f, 1.482f, -4.001f, 1.483f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-1.796f, 0.0f, -3.14f, -0.578f, -4.048f, -1.493f)
                curveToRelative(-0.901f, -0.908f, -1.331f, -2.108f, -1.383f, -3.286f)
                curveToRelative(-0.05f, -1.174f, 0.273f, -2.363f, 0.921f, -3.27f)
                curveToRelative(0.56f, -0.781f, 1.37f, -1.36f, 2.38f, -1.511f)
                curveToRelative(-0.092f, -3.763f, 3.876f, -5.834f, 6.738f, -4.086f)
                moveToRelative(7.272f, -2.11f)
                curveToRelative(-2.323f, -0.842f, -5.237f, -0.082f, -6.622f, 3.057f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-2.288f, -1.874f, -5.998f, -0.09f, -5.587f, 3.354f)
                lineToRelative(0.068f, 0.559f)
                lineTo(14.9f, 20.401f)
                curveToRelative(-0.883f, 0.0f, -1.597f, 0.438f, -2.096f, 1.135f)
                curveToRelative(-0.505f, 0.706f, -0.778f, 1.668f, -0.736f, 2.643f)
                curveToRelative(0.043f, 0.972f, 0.395f, 1.922f, 1.094f, 2.626f)
                curveToRelative(0.692f, 0.698f, 1.767f, 1.196f, 3.338f, 1.197f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.5f, 0.0f, 2.58f, -0.496f, 3.304f, -1.2f)
                curveToRelative(0.729f, -0.71f, 1.125f, -1.66f, 1.2f, -2.615f)
                curveToRelative(0.075f, -0.957f, -0.176f, -1.885f, -0.696f, -2.55f)
                curveToRelative(-0.51f, -0.65f, -1.298f, -1.08f, -2.388f, -1.036f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.516f, -1.736f, 0.32f, -3.2f, -0.27f, -4.328f)
                curveToRelative(-0.593f, -1.133f, -1.604f, -1.96f, -2.771f, -2.383f)
            }
        }
        .build()
        return _cloudRainSnowLarge!!
    }

private var _cloudRainSnowLarge: ImageVector? = null
