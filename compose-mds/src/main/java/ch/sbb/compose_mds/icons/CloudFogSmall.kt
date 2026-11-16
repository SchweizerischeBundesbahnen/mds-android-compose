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

public val SBBIcons.CloudFogSmall: ImageVector
    get() {
        if (_cloudFogSmall != null) {
            return _cloudFogSmall!!
        }
        _cloudFogSmall = Builder(name = "CloudFogSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.208f, 7.591f)
                curveToRelative(0.945f, -1.539f, 2.624f, -1.918f, 3.987f, -1.424f)
                curveToRelative(0.745f, 0.27f, 1.405f, 0.803f, 1.795f, 1.55f)
                curveToRelative(0.319f, 0.607f, 0.447f, 1.335f, 0.321f, 2.14f)
                curveToRelative(0.494f, 0.111f, 0.899f, 0.379f, 1.192f, 0.745f)
                curveToRelative(0.4f, 0.5f, 0.573f, 1.157f, 0.53f, 1.795f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, -0.824f, 1.793f)
                curveToRelative(-0.52f, 0.502f, -1.265f, 0.81f, -2.209f, 0.81f)
                lineTo(8.0f, 15.0f)
                curveToRelative(-0.954f, 0.0f, -1.693f, -0.308f, -2.201f, -0.82f)
                curveToRelative(-0.502f, -0.505f, -0.736f, -1.168f, -0.764f, -1.809f)
                curveToRelative(-0.027f, -0.636f, 0.147f, -1.286f, 0.507f, -1.79f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.146f, -0.816f)
                curveToRelative(0.092f, -1.85f, 2.004f, -2.893f, 3.52f, -2.174f)
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
                curveToRelative(0.716f, 0.0f, 1.202f, -0.229f, 1.515f, -0.53f)
                curveToRelative(0.318f, -0.307f, 0.49f, -0.72f, 0.52f, -1.142f)
                curveToRelative(0.028f, -0.423f, -0.091f, -0.823f, -0.313f, -1.101f)
                curveToRelative(-0.213f, -0.265f, -0.537f, -0.445f, -1.002f, -0.427f)
                lineToRelative(-0.699f, 0.028f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.241f, -0.812f, 0.146f, -1.476f, -0.117f, -1.977f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.073f)
                moveTo(17.995f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.995f, 19.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _cloudFogSmall!!
    }

private var _cloudFogSmall: ImageVector? = null
