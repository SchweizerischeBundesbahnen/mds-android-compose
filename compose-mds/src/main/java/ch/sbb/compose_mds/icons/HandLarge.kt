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

public val SBBIcons.HandLarge: ImageVector
    get() {
        if (_handLarge != null) {
            return _handLarge!!
        }
        _handLarge = Builder(
            name = "HandLarge",
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
                moveTo(25.5f, 6.0f)
                curveTo(26.877f, 6.0f, 28.0f, 7.124f, 28.0f, 8.5f)
                verticalLineToRelative(0.005f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 29.5f, 8.0f)
                curveToRelative(1.377f, 0.0f, 2.5f, 1.124f, 2.5f, 2.5f)
                verticalLineToRelative(4.005f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 33.5f, 14.0f)
                curveToRelative(1.376f, 0.0f, 2.5f, 1.124f, 2.5f, 2.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.997f, -0.51f, 5.3f, -1.025f, 6.861f)
                curveToRelative(-0.257f, 0.78f, -0.516f, 1.376f, -0.713f, 1.779f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -0.311f, 0.582f)
                lineToRelative(-0.02f, 0.033f)
                lineToRelative(-0.007f, 0.01f)
                lineToRelative(-0.002f, 0.003f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.002f, -0.001f, -0.03f, -0.018f, -0.422f, -0.27f)
                lineToRelative(0.42f, 0.27f)
                lineToRelative(-0.147f, 0.23f)
                horizontalLineTo(19.213f)
                lineToRelative(-0.144f, -0.245f)
                lineToRelative(-0.001f, -0.001f)
                lineToRelative(-0.004f, -0.008f)
                lineToRelative(-0.015f, -0.024f)
                lineToRelative(-0.057f, -0.097f)
                lineToRelative(-0.217f, -0.367f)
                lineToRelative(-0.778f, -1.318f)
                lineToRelative(-2.406f, -4.07f)
                arcToRelative(1695.0f, 1695.0f, 0.0f, false, true, -3.946f, -6.701f)
                curveToRelative(-0.328f, -0.572f, -0.566f, -1.169f, -0.59f, -1.76f)
                curveToRelative(-0.027f, -0.617f, 0.181f, -1.193f, 0.67f, -1.682f)
                arcToRelative(2.517f, 2.517f, 0.0f, false, true, 3.548f, 0.0f)
                lineToRelative(3.726f, 3.725f)
                verticalLineTo(10.5f)
                curveToRelative(0.0f, -1.376f, 1.124f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.563f, 0.0f, 1.082f, 0.19f, 1.502f, 0.507f)
                verticalLineTo(8.5f)
                curveTo(23.0f, 7.124f, 24.124f, 6.0f, 25.5f, 6.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.823f, 0.0f, -1.5f, 0.676f, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.002f)
                verticalLineTo(26.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(10.5f)
                curveToRelative(0.0f, -0.824f, -0.676f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.823f, 0.0f, -1.5f, 0.676f, -1.5f, 1.5f)
                verticalLineToRelative(20.367f)
                lineToRelative(-5.433f, -5.433f)
                arcToRelative(1.516f, 1.516f, 0.0f, false, false, -2.133f, 0.0f)
                curveToRelative(-0.29f, 0.29f, -0.393f, 0.594f, -0.379f, 0.932f)
                quadToRelative(0.022f, 0.544f, 0.46f, 1.305f)
                curveToRelative(0.307f, 0.536f, 2.16f, 3.677f, 3.939f, 6.69f)
                lineToRelative(2.405f, 4.07f)
                curveToRelative(0.323f, 0.548f, 0.592f, 1.002f, 0.78f, 1.318f)
                quadToRelative(0.085f, 0.146f, 0.148f, 0.251f)
                horizontalLineToRelative(13.421f)
                quadToRelative(0.066f, -0.12f, 0.156f, -0.299f)
                curveToRelative(0.178f, -0.365f, 0.42f, -0.919f, 0.662f, -1.653f)
                curveToRelative(0.485f, -1.469f, 0.974f, -3.666f, 0.974f, -6.548f)
                verticalLineToRelative(-15.0f)
                curveToRelative(0.0f, -0.824f, -0.676f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.81f, 0.0f, -1.477f, 0.656f, -1.497f, 1.462f)
                verticalLineTo(26.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(0.002f, -0.04f)
                verticalLineTo(10.5f)
                curveToRelative(0.0f, -0.824f, -0.676f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.772f, 0.0f, -1.415f, 0.594f, -1.492f, 1.348f)
                lineTo(28.0f, 10.5f)
                verticalLineTo(26.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.5f)
                curveToRelative(0.0f, -0.824f, -0.676f, -1.5f, -1.5f, -1.5f)
            }
        }
            .build()
        return _handLarge!!
    }

private var _handLarge: ImageVector? = null
