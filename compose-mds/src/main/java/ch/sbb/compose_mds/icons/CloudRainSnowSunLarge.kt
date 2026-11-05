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

public val SBBIcons.CloudRainSnowSunLarge: ImageVector
    get() {
        if (_cloudRainSnowSunLarge != null) {
            return _cloudRainSnowSunLarge!!
        }
        _cloudRainSnowSunLarge = Builder(
            name = "CloudRainSnowSunLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                moveTo(29.5f, 39.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-12.553f, -7.276f)
                lineToRelative(-4.0f, 8.0f)
                lineToRelative(-0.894f, -0.448f)
                lineToRelative(4.0f, -8.0f)
                close()
                moveTo(12.947f, 32.724f)
                lineTo(10.947f, 36.724f)
                lineTo(10.053f, 36.276f)
                lineTo(12.053f, 32.276f)
                close()
                moveTo(20.947f, 32.724f)
                lineTo(18.947f, 36.724f)
                lineTo(18.053f, 36.276f)
                lineTo(20.053f, 32.276f)
                close()
                moveTo(25.5f, 33.0f)
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
                moveToRelative(-1.0f, -23.0f)
                curveToRelative(3.658f, 0.0f, 6.5f, 2.842f, 6.5f, 6.5f)
                curveToRelative(0.0f, 2.818f, -1.689f, 5.157f, -4.148f, 6.078f)
                curveToRelative(0.143f, 0.543f, 0.194f, 1.117f, 0.149f, 1.688f)
                curveToRelative(-0.092f, 1.17f, -0.579f, 2.357f, -1.5f, 3.254f)
                curveToRelative(-0.927f, 0.902f, -2.266f, 1.482f, -4.001f, 1.482f)
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
                lineTo(13.9f, 21.401f)
                curveToRelative(-0.883f, 0.0f, -1.597f, 0.438f, -2.096f, 1.135f)
                curveToRelative(-0.505f, 0.706f, -0.778f, 1.668f, -0.736f, 2.644f)
                curveToRelative(0.043f, 0.971f, 0.396f, 1.922f, 1.094f, 2.626f)
                curveToRelative(0.693f, 0.697f, 1.767f, 1.196f, 3.338f, 1.196f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.5f, 0.0f, 2.58f, -0.496f, 3.304f, -1.2f)
                curveToRelative(0.729f, -0.709f, 1.125f, -1.66f, 1.2f, -2.614f)
                curveToRelative(0.075f, -0.958f, -0.176f, -1.886f, -0.696f, -2.55f)
                curveToRelative(-0.51f, -0.651f, -1.298f, -1.08f, -2.388f, -1.036f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.516f, -1.736f, 0.32f, -3.2f, -0.27f, -4.328f)
                curveToRelative(-0.593f, -1.134f, -1.604f, -1.96f, -2.771f, -2.384f)
                moveToRelative(14.888f, 12.456f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(-2.828f, -2.828f)
                lineToRelative(0.708f, -0.707f)
                close()
                moveTo(32.5f, 12.0f)
                curveToRelative(-1.596f, 0.0f, -2.998f, 0.63f, -3.985f, 1.658f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.522f, 2.509f)
                curveToRelative(0.645f, 1.232f, 0.874f, 2.748f, 0.5f, 4.457f)
                curveToRelative(1.096f, 0.116f, 1.964f, 0.638f, 2.558f, 1.398f)
                quadToRelative(0.227f, 0.292f, 0.398f, 0.623f)
                curveTo(36.568f, 21.87f, 38.0f, 19.902f, 38.0f, 17.5f)
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
                lineTo(25.693f, 11.388f)
                lineTo(22.811f, 8.616f)
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
        return _cloudRainSnowSunLarge!!
    }

private var _cloudRainSnowSunLarge: ImageVector? = null
