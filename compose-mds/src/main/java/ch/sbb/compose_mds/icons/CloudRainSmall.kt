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

public val SBBIcons.CloudRainSmall: ImageVector
    get() {
        if (_cloudRainSmall != null) {
            return _cloudRainSmall!!
        }
        _cloudRainSmall = Builder(name = "CloudRainSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.208f, 7.591f)
                curveToRelative(0.945f, -1.539f, 2.624f, -1.918f, 3.987f, -1.424f)
                curveToRelative(0.745f, 0.27f, 1.405f, 0.803f, 1.795f, 1.55f)
                curveToRelative(0.319f, 0.607f, 0.447f, 1.335f, 0.321f, 2.14f)
                curveToRelative(0.493f, 0.112f, 0.896f, 0.38f, 1.185f, 0.749f)
                curveToRelative(0.394f, 0.502f, 0.558f, 1.159f, 0.509f, 1.795f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.824f, 1.788f)
                curveToRelative(-0.516f, 0.5f, -1.252f, 0.811f, -2.181f, 0.811f)
                lineTo(8.0f, 15.0f)
                curveToRelative(-0.954f, 0.0f, -1.693f, -0.308f, -2.201f, -0.82f)
                curveToRelative(-0.502f, -0.505f, -0.736f, -1.168f, -0.764f, -1.809f)
                curveToRelative(-0.027f, -0.636f, 0.147f, -1.286f, 0.507f, -1.79f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.145f, -0.816f)
                curveToRelative(0.093f, -1.85f, 2.005f, -2.893f, 3.521f, -2.174f)
                moveToRelative(3.646f, -0.483f)
                curveToRelative(-1.048f, -0.38f, -2.361f, -0.045f, -2.997f, 1.394f)
                lineToRelative(-0.265f, 0.602f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-0.967f, -0.792f, -2.566f, -0.048f, -2.387f, 1.454f)
                lineTo(7.2f, 10.2f)
                lineToRelative(0.496f, -0.059f)
                lineToRelative(0.068f, 0.56f)
                lineTo(7.2f, 10.701f)
                curveToRelative(-0.348f, 0.0f, -0.634f, 0.168f, -0.845f, 0.463f)
                curveToRelative(-0.216f, 0.302f, -0.34f, 0.727f, -0.32f, 1.165f)
                curveToRelative(0.018f, 0.434f, 0.175f, 0.846f, 0.474f, 1.147f)
                curveTo(6.8f, 13.77f, 7.27f, 14.0f, 8.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.695f, 0.0f, 1.172f, -0.227f, 1.483f, -0.529f)
                curveToRelative(0.317f, -0.308f, 0.492f, -0.724f, 0.525f, -1.146f)
                curveToRelative(0.032f, -0.426f, -0.082f, -0.826f, -0.299f, -1.102f)
                curveToRelative(-0.206f, -0.262f, -0.524f, -0.441f, -0.99f, -0.423f)
                lineToRelative(-0.697f, 0.028f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.241f, -0.812f, 0.146f, -1.476f, -0.117f, -1.977f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.073f)
                moveToRelative(-4.907f, 9.116f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-0.894f, -0.448f)
                lineToRelative(1.0f, -2.0f)
                close()
                moveTo(13.947f, 18.224f)
                lineTo(14.947f, 16.224f)
                lineTo(14.053f, 15.776f)
                lineTo(13.053f, 17.776f)
                close()
                moveTo(10.947f, 16.224f)
                lineTo(8.947f, 20.224f)
                lineTo(8.053f, 19.776f)
                lineTo(10.053f, 15.776f)
                close()
                moveTo(10.997f, 20.224f)
                lineTo(12.997f, 16.224f)
                lineTo(12.102f, 15.776f)
                lineTo(10.102f, 19.776f)
                close()
            }
        }
        .build()
        return _cloudRainSmall!!
    }

private var _cloudRainSmall: ImageVector? = null
