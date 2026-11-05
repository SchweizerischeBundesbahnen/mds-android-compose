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

public val SBBIcons.CloudSunLarge: ImageVector
    get() {
        if (_cloudSunLarge != null) {
            return _cloudSunLarge!!
        }
        _cloudSunLarge = Builder(name = "CloudSunLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.5f, 11.0f)
                curveToRelative(3.658f, 0.0f, 6.5f, 2.842f, 6.5f, 6.5f)
                curveToRelative(0.0f, 2.826f, -1.698f, 5.17f, -4.168f, 6.086f)
                curveToRelative(0.138f, 0.541f, 0.184f, 1.114f, 0.137f, 1.682f)
                curveToRelative(-0.098f, 1.169f, -0.586f, 2.355f, -1.502f, 3.25f)
                curveToRelative(-0.923f, 0.902f, -2.25f, 1.484f, -3.967f, 1.484f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-1.795f, 0.0f, -3.14f, -0.578f, -4.048f, -1.492f)
                curveToRelative(-0.901f, -0.909f, -1.331f, -2.109f, -1.383f, -3.286f)
                curveToRelative(-0.05f, -1.175f, 0.273f, -2.364f, 0.921f, -3.27f)
                curveToRelative(0.56f, -0.782f, 1.37f, -1.36f, 2.38f, -1.512f)
                curveToRelative(-0.092f, -3.763f, 3.876f, -5.834f, 6.738f, -4.086f)
                curveToRelative(1.67f, -3.134f, 4.83f, -3.967f, 7.431f, -3.112f)
                curveTo(28.722f, 11.855f, 30.493f, 11.0f, 32.5f, 11.0f)
                moveToRelative(-5.12f, 3.247f)
                curveToRelative(-2.323f, -0.843f, -5.237f, -0.083f, -6.622f, 3.057f)
                lineToRelative(-0.266f, 0.601f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-2.288f, -1.874f, -5.998f, -0.089f, -5.587f, 3.355f)
                lineToRelative(0.068f, 0.558f)
                horizontalLineTo(13.9f)
                curveToRelative(-0.883f, 0.0f, -1.597f, 0.438f, -2.096f, 1.135f)
                curveToRelative(-0.505f, 0.706f, -0.778f, 1.668f, -0.736f, 2.644f)
                curveToRelative(0.043f, 0.971f, 0.396f, 1.922f, 1.094f, 2.626f)
                curveToRelative(0.693f, 0.697f, 1.767f, 1.196f, 3.338f, 1.196f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.477f, 0.0f, 2.547f, -0.494f, 3.268f, -1.198f)
                curveToRelative(0.726f, -0.71f, 1.125f, -1.663f, 1.205f, -2.618f)
                curveToRelative(0.08f, -0.96f, -0.166f, -1.887f, -0.68f, -2.55f)
                curveToRelative(-0.501f, -0.65f, -1.283f, -1.078f, -2.373f, -1.034f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.516f, -1.736f, 0.32f, -3.2f, -0.27f, -4.328f)
                curveToRelative(-0.593f, -1.134f, -1.604f, -1.96f, -2.771f, -2.384f)
                moveTo(32.5f, 12.0f)
                curveToRelative(-1.596f, 0.0f, -2.998f, 0.63f, -3.985f, 1.658f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.522f, 2.509f)
                curveToRelative(0.645f, 1.232f, 0.874f, 2.748f, 0.5f, 4.457f)
                curveToRelative(1.095f, 0.116f, 1.96f, 0.639f, 2.548f, 1.4f)
                quadToRelative(0.226f, 0.294f, 0.395f, 0.625f)
                curveTo(36.562f, 21.88f, 38.0f, 19.907f, 38.0f, 17.5f)
                curveToRelative(0.0f, -3.106f, -2.394f, -5.5f, -5.5f, -5.5f)
            }
        }
        .build()
        return _cloudSunLarge!!
    }

private var _cloudSunLarge: ImageVector? = null
