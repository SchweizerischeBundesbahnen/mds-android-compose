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

public val SBBIcons.CloudSmall: ImageVector
    get() {
        if (_cloudSmall != null) {
            return _cloudSmall!!
        }
        _cloudSmall = Builder(name = "CloudSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.176f, 7.62f)
                curveToRelative(0.946f, -1.532f, 2.625f, -1.908f, 3.986f, -1.416f)
                curveToRelative(0.745f, 0.268f, 1.404f, 0.8f, 1.795f, 1.542f)
                curveToRelative(0.318f, 0.605f, 0.447f, 1.329f, 0.322f, 2.13f)
                curveToRelative(0.493f, 0.11f, 0.898f, 0.377f, 1.19f, 0.742f)
                curveToRelative(0.4f, 0.498f, 0.574f, 1.152f, 0.53f, 1.789f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, true, -0.823f, 1.787f)
                curveToRelative(-0.52f, 0.499f, -1.265f, 0.805f, -2.208f, 0.805f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.953f, 0.0f, -1.693f, -0.306f, -2.2f, -0.815f)
                curveToRelative(-0.502f, -0.503f, -0.737f, -1.164f, -0.765f, -1.803f)
                curveToRelative(-0.028f, -0.635f, 0.147f, -1.283f, 0.507f, -1.784f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.144f, -0.812f)
                curveToRelative(0.094f, -1.847f, 2.009f, -2.879f, 3.522f, -2.165f)
                moveToRelative(3.646f, -0.476f)
                curveToRelative(-1.05f, -0.379f, -2.363f, -0.044f, -2.998f, 1.388f)
                lineToRelative(-0.264f, 0.598f)
                lineToRelative(-0.508f, -0.414f)
                lineToRelative(-0.093f, -0.07f)
                curveToRelative(-0.977f, -0.675f, -2.468f, 0.073f, -2.295f, 1.515f)
                lineToRelative(-0.496f, 0.058f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.496f, -0.06f)
                lineToRelative(0.067f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-0.35f, 0.0f, -0.636f, 0.168f, -0.846f, 0.46f)
                curveToRelative(-0.216f, 0.3f, -0.339f, 0.723f, -0.32f, 1.157f)
                curveToRelative(0.019f, 0.431f, 0.175f, 0.842f, 0.474f, 1.14f)
                curveToRelative(0.292f, 0.294f, 0.762f, 0.522f, 1.492f, 0.522f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.717f, 0.0f, 1.203f, -0.227f, 1.515f, -0.527f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, false, 0.519f, -1.134f)
                curveToRelative(0.029f, -0.42f, -0.09f, -0.818f, -0.312f, -1.094f)
                curveToRelative(-0.211f, -0.264f, -0.536f, -0.443f, -1.003f, -0.424f)
                lineToRelative(-0.699f, 0.027f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.241f, -0.808f, 0.146f, -1.468f, -0.116f, -1.966f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.067f)
            }
        }
        .build()
        return _cloudSmall!!
    }

private var _cloudSmall: ImageVector? = null
