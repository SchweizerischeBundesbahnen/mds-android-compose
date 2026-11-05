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

public val SBBIcons.CloudRainSunLarge: ImageVector
    get() {
        if (_cloudRainSunLarge != null) {
            return _cloudRainSunLarge!!
        }
        _cloudRainSunLarge = Builder(name = "CloudRainSunLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.947f, 32.724f)
                lineToRelative(-4.0f, 8.0f)
                lineToRelative(-0.895f, -0.448f)
                lineToRelative(4.0f, -8.0f)
                close()
                moveTo(27.047f, 32.724f)
                lineTo(23.047f, 40.724f)
                lineTo(22.153f, 40.276f)
                lineTo(26.153f, 32.276f)
                close()
                moveTo(18.947f, 32.724f)
                lineTo(16.947f, 36.724f)
                lineTo(16.052f, 36.276f)
                lineTo(18.052f, 32.276f)
                close()
                moveTo(30.947f, 32.724f)
                lineTo(28.947f, 36.724f)
                lineTo(28.052f, 36.276f)
                lineTo(30.052f, 32.276f)
                close()
                moveTo(32.499f, 11.0f)
                curveToRelative(3.659f, 0.0f, 6.5f, 2.842f, 6.5f, 6.5f)
                curveToRelative(0.0f, 2.797f, -1.663f, 5.12f, -4.091f, 6.057f)
                curveToRelative(0.156f, 0.546f, 0.216f, 1.126f, 0.178f, 1.702f)
                curveToRelative(-0.076f, 1.174f, -0.557f, 2.364f, -1.492f, 3.262f)
                curveToRelative(-0.94f, 0.904f, -2.307f, 1.481f, -4.094f, 1.481f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-1.796f, 0.0f, -3.14f, -0.578f, -4.048f, -1.492f)
                curveToRelative(-0.902f, -0.909f, -1.332f, -2.109f, -1.383f, -3.286f)
                curveToRelative(-0.051f, -1.175f, 0.272f, -2.364f, 0.92f, -3.27f)
                curveToRelative(0.56f, -0.782f, 1.371f, -1.36f, 2.38f, -1.512f)
                curveToRelative(-0.091f, -3.763f, 3.876f, -5.834f, 6.739f, -4.086f)
                curveToRelative(1.669f, -3.134f, 4.83f, -3.967f, 7.43f, -3.112f)
                curveTo(28.723f, 11.855f, 30.494f, 11.0f, 32.5f, 11.0f)
                moveToRelative(-5.12f, 3.247f)
                curveToRelative(-2.323f, -0.843f, -5.236f, -0.083f, -6.622f, 3.057f)
                lineToRelative(-0.265f, 0.601f)
                lineToRelative(-0.51f, -0.417f)
                curveToRelative(-2.287f, -1.874f, -5.997f, -0.089f, -5.586f, 3.355f)
                lineToRelative(0.067f, 0.558f)
                lineTo(13.9f, 21.401f)
                curveToRelative(-0.883f, 0.0f, -1.598f, 0.438f, -2.097f, 1.135f)
                curveToRelative(-0.505f, 0.706f, -0.778f, 1.669f, -0.735f, 2.644f)
                curveToRelative(0.042f, 0.971f, 0.395f, 1.922f, 1.094f, 2.626f)
                curveToRelative(0.692f, 0.697f, 1.767f, 1.196f, 3.337f, 1.196f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.563f, 0.0f, 2.671f, -0.499f, 3.403f, -1.201f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, false, 1.186f, -2.607f)
                curveToRelative(0.062f, -0.954f, -0.207f, -1.882f, -0.745f, -2.55f)
                curveToRelative(-0.528f, -0.656f, -1.333f, -1.086f, -2.424f, -1.042f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.516f, -1.736f, 0.32f, -3.2f, -0.27f, -4.328f)
                curveToRelative(-0.594f, -1.134f, -1.604f, -1.96f, -2.772f, -2.384f)
                moveToRelative(14.888f, 12.456f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.828f, -2.828f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(32.5f, 12.0f)
                curveToRelative(-1.595f, 0.0f, -2.998f, 0.63f, -3.985f, 1.658f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.523f, 2.509f)
                curveToRelative(0.645f, 1.232f, 0.874f, 2.748f, 0.5f, 4.457f)
                curveToRelative(1.099f, 0.116f, 1.976f, 0.637f, 2.585f, 1.393f)
                quadToRelative(0.23f, 0.288f, 0.407f, 0.614f)
                curveToRelative(2.056f, -0.784f, 3.47f, -2.743f, 3.47f, -5.131f)
                curveToRelative(0.0f, -3.106f, -2.394f, -5.5f, -5.5f, -5.5f)
                moveTo(46.0f, 18.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(42.045f, 8.63f)
                lineTo(39.217f, 11.459f)
                lineTo(38.51f, 10.752f)
                lineTo(41.338f, 7.924f)
                close()
                moveTo(26.387f, 10.668f)
                lineTo(25.694f, 11.388f)
                lineTo(22.812f, 8.616f)
                lineTo(23.505f, 7.896f)
                close()
                moveTo(33.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(32.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _cloudRainSunLarge!!
    }

private var _cloudRainSunLarge: ImageVector? = null
