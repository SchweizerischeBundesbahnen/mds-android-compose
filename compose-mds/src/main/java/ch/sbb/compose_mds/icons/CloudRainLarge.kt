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

public val SBBIcons.CloudRainLarge: ImageVector
    get() {
        if (_cloudRainLarge != null) {
            return _cloudRainLarge!!
        }
        _cloudRainLarge = Builder(name = "CloudRainLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.947f, 31.724f)
                lineToRelative(-4.0f, 8.0f)
                lineToRelative(-0.894f, -0.448f)
                lineToRelative(4.0f, -8.0f)
                close()
                moveTo(26.047f, 31.724f)
                lineTo(22.047f, 39.724f)
                lineTo(21.152f, 39.276f)
                lineTo(25.152f, 31.276f)
                close()
                moveTo(17.947f, 31.724f)
                lineTo(15.947f, 35.724f)
                lineTo(15.053f, 35.276f)
                lineTo(17.053f, 31.276f)
                close()
                moveTo(29.947f, 31.724f)
                lineTo(27.947f, 35.724f)
                lineTo(27.053f, 35.276f)
                lineTo(29.053f, 31.276f)
                close()
                moveTo(21.108f, 15.355f)
                curveToRelative(1.708f, -3.207f, 4.979f, -4.005f, 7.613f, -3.05f)
                curveToRelative(1.382f, 0.502f, 2.597f, 1.489f, 3.316f, 2.861f)
                curveToRelative(0.645f, 1.232f, 0.874f, 2.748f, 0.5f, 4.457f)
                curveToRelative(1.097f, 0.116f, 1.966f, 0.638f, 2.562f, 1.396f)
                curveToRelative(0.7f, 0.891f, 1.002f, 2.077f, 0.913f, 3.245f)
                curveToRelative(-0.09f, 1.17f, -0.577f, 2.358f, -1.5f, 3.255f)
                curveTo(33.585f, 28.42f, 32.243f, 29.0f, 30.5f, 29.0f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-1.796f, 0.0f, -3.14f, -0.578f, -4.048f, -1.492f)
                curveToRelative(-0.901f, -0.909f, -1.331f, -2.108f, -1.383f, -3.286f)
                curveToRelative(-0.05f, -1.175f, 0.273f, -2.363f, 0.921f, -3.27f)
                curveToRelative(0.56f, -0.782f, 1.37f, -1.36f, 2.38f, -1.512f)
                curveToRelative(-0.091f, -3.762f, 3.876f, -5.833f, 6.738f, -4.085f)
                moveToRelative(7.272f, -2.109f)
                curveToRelative(-2.323f, -0.843f, -5.237f, -0.083f, -6.622f, 3.057f)
                lineToRelative(-0.266f, 0.601f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-2.288f, -1.874f, -5.998f, -0.089f, -5.587f, 3.355f)
                lineToRelative(0.068f, 0.558f)
                lineTo(14.9f, 20.4f)
                curveToRelative(-0.883f, 0.0f, -1.597f, 0.438f, -2.096f, 1.135f)
                curveToRelative(-0.505f, 0.706f, -0.778f, 1.669f, -0.736f, 2.644f)
                curveToRelative(0.043f, 0.972f, 0.395f, 1.922f, 1.094f, 2.626f)
                curveTo(13.854f, 27.502f, 14.93f, 28.0f, 16.5f, 28.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.508f, 0.0f, 2.591f, -0.496f, 3.315f, -1.2f)
                curveToRelative(0.73f, -0.709f, 1.127f, -1.66f, 1.2f, -2.613f)
                curveToRelative(0.073f, -0.958f, -0.181f, -1.885f, -0.703f, -2.55f)
                curveToRelative(-0.512f, -0.652f, -1.302f, -1.08f, -2.392f, -1.037f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.516f, -1.736f, 0.32f, -3.2f, -0.27f, -4.328f)
                curveToRelative(-0.593f, -1.134f, -1.604f, -1.96f, -2.771f, -2.384f)
            }
        }
        .build()
        return _cloudRainLarge!!
    }

private var _cloudRainLarge: ImageVector? = null
