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

public val SBBIcons.CloudSnowLarge: ImageVector
    get() {
        if (_cloudSnowLarge != null) {
            return _cloudSnowLarge!!
        }
        _cloudSnowLarge = Builder(
            name = "CloudSnowLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(19.5f, 36.0f)
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
                moveToRelative(-12.0f, -5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-16.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(21.108f, 16.356f)
                curveToRelative(1.708f, -3.208f, 4.979f, -4.006f, 7.613f, -3.05f)
                curveToRelative(1.382f, 0.501f, 2.597f, 1.488f, 3.316f, 2.86f)
                curveToRelative(0.645f, 1.232f, 0.874f, 2.748f, 0.5f, 4.457f)
                curveToRelative(1.096f, 0.116f, 1.964f, 0.638f, 2.558f, 1.397f)
                curveToRelative(0.697f, 0.892f, 0.995f, 2.078f, 0.904f, 3.245f)
                curveToRelative(-0.092f, 1.17f, -0.578f, 2.357f, -1.499f, 3.254f)
                curveToRelative(-0.927f, 0.902f, -2.265f, 1.482f, -4.0f, 1.482f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-1.796f, 0.0f, -3.14f, -0.578f, -4.048f, -1.492f)
                curveToRelative(-0.901f, -0.909f, -1.331f, -2.108f, -1.383f, -3.286f)
                curveToRelative(-0.05f, -1.175f, 0.273f, -2.363f, 0.921f, -3.27f)
                curveToRelative(0.56f, -0.782f, 1.37f, -1.36f, 2.38f, -1.512f)
                curveToRelative(-0.091f, -3.762f, 3.876f, -5.833f, 6.738f, -4.085f)
                moveToRelative(7.272f, -2.11f)
                curveToRelative(-2.323f, -0.843f, -5.237f, -0.083f, -6.622f, 3.057f)
                lineToRelative(-0.266f, 0.601f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-2.288f, -1.874f, -5.998f, -0.089f, -5.587f, 3.355f)
                lineToRelative(0.068f, 0.558f)
                horizontalLineTo(14.9f)
                curveToRelative(-0.883f, 0.0f, -1.597f, 0.438f, -2.096f, 1.135f)
                curveToRelative(-0.505f, 0.706f, -0.778f, 1.669f, -0.736f, 2.644f)
                curveToRelative(0.043f, 0.972f, 0.395f, 1.922f, 1.094f, 2.626f)
                curveTo(13.854f, 28.502f, 14.93f, 29.0f, 16.5f, 29.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.5f, 0.0f, 2.579f, -0.495f, 3.302f, -1.2f)
                curveToRelative(0.729f, -0.709f, 1.125f, -1.66f, 1.2f, -2.614f)
                curveToRelative(0.075f, -0.958f, -0.176f, -1.886f, -0.695f, -2.55f)
                curveToRelative(-0.51f, -0.651f, -1.297f, -1.08f, -2.387f, -1.036f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.516f, -1.736f, 0.32f, -3.2f, -0.27f, -4.328f)
                curveToRelative(-0.593f, -1.133f, -1.604f, -1.96f, -2.771f, -2.384f)
            }
        }
            .build()
        return _cloudSnowLarge!!
    }

private var _cloudSnowLarge: ImageVector? = null
