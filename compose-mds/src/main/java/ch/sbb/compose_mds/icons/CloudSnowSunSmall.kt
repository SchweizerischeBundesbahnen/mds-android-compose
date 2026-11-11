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

public val SBBIcons.CloudSnowSunSmall: ImageVector
    get() {
        if (_cloudSnowSunSmall != null) {
            return _cloudSnowSunSmall!!
        }
        _cloudSnowSunSmall = Builder(name = "CloudSnowSunSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 8.5f)
                curveTo(19.0f, 7.085f, 17.915f, 6.0f, 16.5f, 6.0f)
                curveToRelative(-0.608f, 0.0f, -1.152f, 0.2f, -1.575f, 0.537f)
                curveToRelative(0.436f, 0.292f, 0.809f, 0.69f, 1.065f, 1.18f)
                curveToRelative(0.319f, 0.607f, 0.447f, 1.335f, 0.321f, 2.14f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 1.311f, 0.89f)
                curveTo(18.447f, 10.35f, 19.0f, 9.512f, 19.0f, 8.5f)
                moveTo(16.5f, 5.0f)
                curveToRelative(-1.016f, 0.0f, -1.924f, 0.41f, -2.56f, 1.086f)
                curveToRelative(-1.312f, -0.362f, -2.845f, 0.061f, -3.732f, 1.505f)
                curveToRelative(-1.516f, -0.718f, -3.428f, 0.324f, -3.52f, 2.174f)
                curveToRelative(-0.483f, 0.128f, -0.871f, 0.433f, -1.146f, 0.816f)
                curveToRelative(-0.36f, 0.504f, -0.534f, 1.154f, -0.507f, 1.79f)
                curveToRelative(0.028f, 0.641f, 0.262f, 1.304f, 0.764f, 1.81f)
                curveToRelative(0.508f, 0.51f, 1.247f, 0.82f, 2.201f, 0.82f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.96f, 0.0f, 1.714f, -0.307f, 2.24f, -0.81f)
                curveToRelative(0.52f, -0.497f, 0.781f, -1.155f, 0.82f, -1.799f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.051f, -0.72f)
                curveTo(19.2f, 11.118f, 20.0f, 9.919f, 20.0f, 8.5f)
                curveTo(20.0f, 6.533f, 18.467f, 5.0f, 16.5f, 5.0f)
                moveToRelative(-2.645f, 2.108f)
                curveToRelative(-1.049f, -0.38f, -2.362f, -0.045f, -2.998f, 1.394f)
                lineToRelative(-0.265f, 0.602f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-0.967f, -0.792f, -2.566f, -0.048f, -2.387f, 1.454f)
                lineTo(7.2f, 10.2f)
                lineToRelative(0.496f, -0.059f)
                lineToRelative(0.068f, 0.56f)
                horizontalLineTo(7.2f)
                curveToRelative(-0.348f, 0.0f, -0.634f, 0.168f, -0.845f, 0.463f)
                curveToRelative(-0.216f, 0.303f, -0.34f, 0.727f, -0.32f, 1.165f)
                curveToRelative(0.018f, 0.434f, 0.175f, 0.846f, 0.474f, 1.147f)
                curveTo(6.8f, 13.771f, 7.27f, 14.0f, 8.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.738f, 0.0f, 1.233f, -0.23f, 1.548f, -0.532f)
                curveToRelative(0.32f, -0.305f, 0.489f, -0.716f, 0.514f, -1.134f)
                curveToRelative(0.025f, -0.423f, -0.099f, -0.824f, -0.327f, -1.104f)
                curveToRelative(-0.218f, -0.268f, -0.55f, -0.448f, -1.015f, -0.43f)
                lineToRelative(-0.699f, 0.028f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.241f, -0.812f, 0.146f, -1.476f, -0.117f, -1.977f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.073f)
                moveTo(15.5f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-5.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-3.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(5.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-3.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _cloudSnowSunSmall!!
    }

private var _cloudSnowSunSmall: ImageVector? = null
