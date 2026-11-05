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

public val SBBIcons.CloudSmall: ImageVector
    get() {
        if (_cloudSmall != null) {
            return _cloudSmall!!
        }
        _cloudSmall = Builder(name = "CloudSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.28f, 9.875f)
                curveToRelative(0.493f, 0.111f, 0.897f, 0.378f, 1.19f, 0.742f)
                curveToRelative(0.4f, 0.498f, 0.573f, 1.153f, 0.53f, 1.79f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, true, -0.824f, 1.786f)
                curveToRelative(-0.52f, 0.5f, -1.265f, 0.807f, -2.208f, 0.807f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.954f, 0.0f, -1.693f, -0.307f, -2.2f, -0.816f)
                curveToRelative(-0.503f, -0.503f, -0.737f, -1.164f, -0.765f, -1.802f)
                curveToRelative(-0.028f, -0.636f, 0.146f, -1.284f, 0.507f, -1.785f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.143f, -0.811f)
                curveToRelative(0.093f, -1.847f, 2.01f, -2.88f, 3.523f, -2.166f)
                curveToRelative(0.946f, -1.532f, 2.625f, -1.908f, 3.986f, -1.416f)
                arcToRelative(3.27f, 3.27f, 0.0f, false, true, 1.795f, 1.542f)
                curveToRelative(0.318f, 0.605f, 0.447f, 1.329f, 0.323f, 2.13f)
                moveToRelative(-2.457f, -2.73f)
                curveToRelative(-1.05f, -0.38f, -2.364f, -0.045f, -2.998f, 1.386f)
                lineToRelative(-0.266f, 0.6f)
                lineToRelative(-0.507f, -0.415f)
                curveToRelative(-0.972f, -0.792f, -2.567f, -0.044f, -2.388f, 1.444f)
                lineToRelative(0.067f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-0.35f, 0.0f, -0.636f, 0.168f, -0.846f, 0.46f)
                curveToRelative(-0.216f, 0.301f, -0.34f, 0.723f, -0.32f, 1.158f)
                curveToRelative(0.019f, 0.431f, 0.175f, 0.84f, 0.474f, 1.14f)
                curveToRelative(0.292f, 0.293f, 0.762f, 0.522f, 1.492f, 0.522f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.717f, 0.0f, 1.203f, -0.228f, 1.515f, -0.528f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, false, 0.519f, -1.134f)
                curveToRelative(0.028f, -0.421f, -0.09f, -0.818f, -0.312f, -1.094f)
                curveToRelative(-0.212f, -0.264f, -0.536f, -0.443f, -1.003f, -0.425f)
                lineToRelative(-0.699f, 0.028f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.242f, -0.808f, 0.146f, -1.468f, -0.116f, -1.965f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, false, -1.25f, -1.068f)
            }
        }
        .build()
        return _cloudSmall!!
    }

private var _cloudSmall: ImageVector? = null
