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

public val SBBIcons.CloudRainSunSmall: ImageVector
    get() {
        if (_cloudRainSunSmall != null) {
            return _cloudRainSunSmall!!
        }
        _cloudRainSunSmall = Builder(name = "CloudRainSunSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 4.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 8.5f)
                curveTo(19.0f, 7.085f, 17.915f, 6.0f, 16.5f, 6.0f)
                curveToRelative(-0.608f, 0.0f, -1.152f, 0.2f, -1.575f, 0.537f)
                curveToRelative(0.436f, 0.292f, 0.809f, 0.69f, 1.065f, 1.18f)
                curveToRelative(0.319f, 0.607f, 0.447f, 1.335f, 0.321f, 2.14f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, true, 1.305f, 0.894f)
                curveTo(18.444f, 10.352f, 19.0f, 9.513f, 19.0f, 8.5f)
                moveTo(16.5f, 5.0f)
                curveToRelative(-1.016f, 0.0f, -1.924f, 0.41f, -2.56f, 1.086f)
                curveToRelative(-1.312f, -0.362f, -2.845f, 0.061f, -3.732f, 1.505f)
                curveToRelative(-1.516f, -0.718f, -3.428f, 0.324f, -3.52f, 2.174f)
                curveToRelative(-0.483f, 0.128f, -0.871f, 0.433f, -1.146f, 0.816f)
                curveToRelative(-0.36f, 0.504f, -0.534f, 1.154f, -0.507f, 1.79f)
                curveToRelative(0.028f, 0.641f, 0.262f, 1.304f, 0.764f, 1.81f)
                curveToRelative(0.508f, 0.51f, 1.247f, 0.82f, 2.201f, 0.82f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.95f, 0.0f, 1.698f, -0.308f, 2.22f, -0.81f)
                curveToRelative(0.518f, -0.497f, 0.781f, -1.153f, 0.823f, -1.796f)
                quadToRelative(0.023f, -0.362f, -0.046f, -0.718f)
                curveTo(19.196f, 11.126f, 20.0f, 9.924f, 20.0f, 8.5f)
                curveTo(20.0f, 6.533f, 18.467f, 5.0f, 16.5f, 5.0f)
                moveToRelative(-2.645f, 2.108f)
                curveToRelative(-1.049f, -0.38f, -2.362f, -0.045f, -2.998f, 1.394f)
                lineToRelative(-0.265f, 0.602f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-0.967f, -0.792f, -2.566f, -0.048f, -2.387f, 1.454f)
                lineTo(7.2f, 10.2f)
                lineToRelative(0.496f, -0.059f)
                lineToRelative(0.068f, 0.56f)
                lineTo(7.2f, 10.701f)
                curveToRelative(-0.348f, 0.0f, -0.634f, 0.168f, -0.845f, 0.463f)
                curveToRelative(-0.216f, 0.303f, -0.34f, 0.727f, -0.32f, 1.165f)
                curveToRelative(0.018f, 0.434f, 0.175f, 0.846f, 0.474f, 1.147f)
                curveTo(6.8f, 13.771f, 7.27f, 14.0f, 8.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.725f, 0.0f, 1.215f, -0.23f, 1.528f, -0.53f)
                curveToRelative(0.319f, -0.307f, 0.49f, -0.72f, 0.517f, -1.14f)
                curveToRelative(0.027f, -0.423f, -0.093f, -0.823f, -0.318f, -1.102f)
                curveToRelative(-0.214f, -0.267f, -0.542f, -0.446f, -1.007f, -0.428f)
                lineToRelative(-0.699f, 0.028f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.241f, -0.812f, 0.146f, -1.476f, -0.117f, -1.977f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.073f)
                moveToRelative(-0.238f, -2.205f)
                lineToRelative(-0.693f, 0.721f)
                lineToRelative(-1.442f, -1.386f)
                lineToRelative(0.694f, -0.72f)
                close()
                moveTo(20.852f, 13.631f)
                lineTo(21.559f, 12.924f)
                lineTo(20.146f, 11.51f)
                lineTo(19.438f, 12.217f)
                close()
                moveTo(23.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.328f, 4.95f)
                lineTo(20.035f, 5.656f)
                lineTo(21.449f, 4.242f)
                lineTo(20.742f, 3.535f)
                close()
                moveTo(9.948f, 16.224f)
                lineTo(8.948f, 18.224f)
                lineTo(8.053f, 17.776f)
                lineTo(9.053f, 15.776f)
                close()
                moveTo(14.948f, 18.224f)
                lineTo(15.948f, 16.224f)
                lineTo(15.053f, 15.776f)
                lineTo(14.053f, 17.776f)
                close()
                moveTo(11.948f, 16.224f)
                lineTo(9.948f, 20.224f)
                lineTo(9.053f, 19.776f)
                lineTo(11.053f, 15.776f)
                close()
                moveTo(11.998f, 20.224f)
                lineTo(13.998f, 16.224f)
                lineTo(13.102f, 15.776f)
                lineTo(11.102f, 19.776f)
                close()
            }
        }
        .build()
        return _cloudRainSunSmall!!
    }

private var _cloudRainSunSmall: ImageVector? = null
