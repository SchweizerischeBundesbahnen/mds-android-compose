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

public val SBBIcons.HandCursorLarge: ImageVector
    get() {
        if (_handCursorLarge != null) {
            return _handCursorLarge!!
        }
        _handCursorLarge = Builder(name = "HandCursorLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 24.0f, 9.5f)
                verticalLineToRelative(6.004f)
                arcToRelative(2.496f, 2.496f, 0.0f, false, true, 4.0f, 1.996f)
                verticalLineToRelative(0.004f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.267f, 0.228f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 32.0f, 19.5f)
                verticalLineToRelative(0.004f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.267f, 0.228f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 36.0f, 21.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.992f, -0.51f, 5.295f, -1.025f, 6.857f)
                curveToRelative(-0.244f, 0.741f, -0.491f, 1.315f, -0.683f, 1.716f)
                curveToRelative(0.414f, 0.158f, 0.708f, 0.557f, 0.709f, 1.027f)
                verticalLineToRelative(2.8f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -1.1f, 1.1f)
                lineTo(19.1f, 42.0f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -1.1f, -1.1f)
                verticalLineToRelative(-2.8f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 0.67f, -1.013f)
                lineToRelative(-7.1f, -11.911f)
                lineToRelative(-0.001f, -0.002f)
                curveToRelative(-0.335f, -0.57f, -0.575f, -1.165f, -0.598f, -1.758f)
                curveToRelative(-0.024f, -0.617f, 0.187f, -1.192f, 0.675f, -1.68f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 2.735f, -0.546f)
                curveToRelative(0.3f, 0.125f, 0.571f, 0.308f, 0.801f, 0.537f)
                horizontalLineToRelative(0.001f)
                lineTo(19.0f, 25.337f)
                lineTo(19.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.5f, 7.0f)
                moveToRelative(-2.4f, 31.0f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, 0.1f)
                verticalLineToRelative(2.8f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.1f, 0.1f)
                horizontalLineToRelative(14.8f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.1f, -0.1f)
                verticalLineToRelative(-2.8f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, -0.1f)
                close()
                moveTo(21.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 9.5f)
                verticalLineToRelative(18.161f)
                lineToRelative(-0.844f, -0.798f)
                lineToRelative(-4.66f, -4.41f)
                lineToRelative(-0.011f, -0.01f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.643f, -0.33f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.488f, 0.33f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.292f, 0.292f, -0.396f, 0.598f, -0.383f, 0.934f)
                quadToRelative(0.02f, 0.539f, 0.46f, 1.287f)
                lineTo(19.783f, 37.0f)
                horizontalLineToRelative(13.423f)
                curveToRelative(0.042f, -0.08f, 0.097f, -0.18f, 0.156f, -0.3f)
                curveToRelative(0.178f, -0.366f, 0.42f, -0.92f, 0.662f, -1.655f)
                curveToRelative(0.485f, -1.47f, 0.974f, -3.668f, 0.974f, -6.545f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(23.998f, 22.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(22.998f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.5f, 8.0f)
            }
        }
        .build()
        return _handCursorLarge!!
    }

private var _handCursorLarge: ImageVector? = null
