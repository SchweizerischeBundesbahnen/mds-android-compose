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

public val SBBIcons.TelephoneReceiverLarge: ImageVector
    get() {
        if (_telephoneReceiverLarge != null) {
            return _telephoneReceiverLarge!!
        }
        _telephoneReceiverLarge = Builder(
            name = "TelephoneReceiverLarge",
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
                moveTo(16.31f, 5.326f)
                curveToRelative(1.333f, -0.771f, 3.033f, -0.111f, 3.827f, 1.262f)
                lineToRelative(3.514f, 6.084f)
                curveToRelative(0.795f, 1.375f, 0.512f, 3.177f, -0.823f, 3.947f)
                lineToRelative(-3.948f, 2.283f)
                curveToRelative(-0.15f, 0.086f, -0.273f, 0.331f, -0.166f, 0.632f)
                horizontalLineToRelative(0.001f)
                arcToRelative(38.4f, 38.4f, 0.0f, false, false, 2.887f, 6.198f)
                horizontalLineToRelative(0.001f)
                arcToRelative(38.4f, 38.4f, 0.0f, false, false, 3.924f, 5.6f)
                curveToRelative(0.208f, 0.246f, 0.48f, 0.263f, 0.632f, 0.174f)
                horizontalLineToRelative(0.002f)
                lineToRelative(3.947f, -2.279f)
                curveToRelative(1.333f, -0.769f, 3.034f, -0.114f, 3.829f, 1.264f)
                lineToRelative(3.513f, 6.084f)
                lineToRelative(0.136f, 0.263f)
                curveToRelative(0.619f, 1.34f, 0.27f, 2.965f, -0.955f, 3.684f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-3.404f, 1.964f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-0.203f, 0.119f, -0.41f, 0.18f, -0.595f, 0.218f)
                curveToRelative(-2.583f, 0.862f, -5.809f, -0.217f, -8.953f, -2.511f)
                curveToRelative(-3.178f, -2.32f, -6.39f, -5.96f, -8.99f, -10.465f)
                curveToRelative(-2.602f, -4.507f, -4.15f, -9.11f, -4.57f, -13.021f)
                curveToRelative(-0.414f, -3.865f, 0.261f, -7.194f, 2.293f, -9.002f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.481f, -0.415f)
                horizontalLineToRelative(0.001f)
                lineToRelative(3.418f, -1.966f)
                moveToRelative(2.961f, 1.762f)
                curveToRelative(-0.586f, -1.013f, -1.716f, -1.328f, -2.462f, -0.897f)
                horizontalLineToRelative(-0.002f)
                lineTo(13.39f, 8.158f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.247f, 0.227f)
                lineToRelative(-0.022f, 0.027f)
                lineToRelative(-0.027f, 0.023f)
                curveToRelative(-1.676f, 1.474f, -2.389f, 4.387f, -1.983f, 8.167f)
                curveToRelative(0.402f, 3.75f, 1.896f, 8.219f, 4.44f, 12.628f)
                lineToRelative(0.484f, 0.815f)
                curveToRelative(2.45f, 4.028f, 5.375f, 7.258f, 8.23f, 9.342f)
                curveToRelative(3.072f, 2.242f, 5.95f, 3.08f, 8.066f, 2.364f)
                lineToRelative(0.032f, -0.01f)
                lineToRelative(0.034f, -0.006f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.322f, -0.11f)
                lineToRelative(0.005f, -0.002f)
                lineToRelative(3.404f, -1.964f)
                curveToRelative(0.735f, -0.434f, 1.037f, -1.575f, 0.456f, -2.583f)
                lineTo(33.07f, 30.99f)
                curveToRelative(-0.585f, -1.014f, -1.716f, -1.328f, -2.463f, -0.898f)
                lineTo(26.66f, 32.37f)
                curveToRelative(-0.599f, 0.349f, -1.33f, 0.185f, -1.804f, -0.29f)
                lineToRelative(-0.092f, -0.1f)
                arcToRelative(39.4f, 39.4f, 0.0f, false, true, -4.027f, -5.747f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -2.672f, -5.576f)
                lineToRelative(-0.291f, -0.785f)
                curveToRelative(-0.244f, -0.68f, -0.03f, -1.471f, 0.607f, -1.837f)
                lineToRelative(3.947f, -2.282f)
                curveToRelative(0.749f, -0.43f, 1.043f, -1.568f, 0.458f, -2.58f)
                close()
            }
        }
            .build()
        return _telephoneReceiverLarge!!
    }

private var _telephoneReceiverLarge: ImageVector? = null
