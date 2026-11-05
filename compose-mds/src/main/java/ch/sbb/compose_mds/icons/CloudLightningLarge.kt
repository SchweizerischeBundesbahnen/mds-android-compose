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

public val SBBIcons.CloudLightningLarge: ImageVector
    get() {
        if (_cloudLightningLarge != null) {
            return _cloudLightningLarge!!
        }
        _cloudLightningLarge = Builder(name = "CloudLightningLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.707f, 32.0f)
                horizontalLineToRelative(4.535f)
                lineToRelative(-1.088f, 0.888f)
                lineToRelative(-6.66f, 5.43f)
                lineToRelative(-3.169f, 2.583f)
                lineToRelative(2.453f, -3.271f)
                lineTo(21.5f, 34.0f)
                horizontalLineToRelative(-5.207f)
                lineToRelative(7.0f, -7.0f)
                horizontalLineToRelative(4.414f)
                close()
                moveTo(22.9f, 33.8f)
                lineTo(22.031f, 34.958f)
                lineTo(24.434f, 33.0f)
                lineTo(23.5f, 33.0f)
                close()
                moveTo(18.707f, 33.0f)
                horizontalLineToRelative(1.586f)
                lineToRelative(5.0f, -5.0f)
                horizontalLineToRelative(-1.586f)
                close()
                moveTo(21.108f, 16.354f)
                curveToRelative(1.709f, -3.207f, 4.98f, -4.005f, 7.613f, -3.05f)
                curveToRelative(1.382f, 0.502f, 2.597f, 1.489f, 3.316f, 2.861f)
                curveToRelative(0.645f, 1.232f, 0.874f, 2.748f, 0.5f, 4.457f)
                curveToRelative(1.096f, 0.116f, 1.963f, 0.639f, 2.556f, 1.398f)
                curveToRelative(0.695f, 0.892f, 0.994f, 2.077f, 0.902f, 3.244f)
                curveToRelative(-0.092f, 1.17f, -0.58f, 2.357f, -1.5f, 3.254f)
                curveTo(33.567f, 29.42f, 32.231f, 30.0f, 30.5f, 30.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.496f, 0.0f, 2.574f, -0.495f, 3.297f, -1.2f)
                curveToRelative(0.728f, -0.709f, 1.126f, -1.66f, 1.201f, -2.614f)
                curveToRelative(0.076f, -0.958f, -0.174f, -1.886f, -0.693f, -2.55f)
                curveToRelative(-0.508f, -0.65f, -1.295f, -1.08f, -2.385f, -1.036f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.516f, -1.736f, 0.32f, -3.2f, -0.27f, -4.328f)
                curveToRelative(-0.593f, -1.134f, -1.604f, -1.96f, -2.771f, -2.384f)
                curveToRelative(-2.323f, -0.843f, -5.237f, -0.083f, -6.622f, 3.057f)
                lineToRelative(-0.266f, 0.601f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-2.286f, -1.874f, -5.998f, -0.089f, -5.587f, 3.355f)
                lineToRelative(0.068f, 0.558f)
                lineTo(14.9f, 21.399f)
                curveToRelative(-0.883f, 0.0f, -1.597f, 0.438f, -2.096f, 1.135f)
                curveToRelative(-0.505f, 0.706f, -0.778f, 1.669f, -0.736f, 2.644f)
                curveToRelative(0.043f, 0.971f, 0.396f, 1.922f, 1.094f, 2.626f)
                curveTo(13.854f, 28.5f, 14.93f, 29.0f, 16.5f, 29.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.796f, 0.0f, -3.14f, -0.577f, -4.048f, -1.492f)
                curveToRelative(-0.901f, -0.909f, -1.331f, -2.108f, -1.383f, -3.286f)
                curveToRelative(-0.05f, -1.175f, 0.273f, -2.364f, 0.921f, -3.27f)
                curveToRelative(0.56f, -0.782f, 1.37f, -1.36f, 2.38f, -1.512f)
                curveToRelative(-0.091f, -3.762f, 3.877f, -5.834f, 6.738f, -4.087f)
            }
        }
        .build()
        return _cloudLightningLarge!!
    }

private var _cloudLightningLarge: ImageVector? = null
