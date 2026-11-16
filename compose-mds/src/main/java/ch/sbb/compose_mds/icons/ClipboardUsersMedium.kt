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

public val SBBIcons.ClipboardUsersMedium: ImageVector
    get() {
        if (_clipboardUsersMedium != null) {
            return _clipboardUsersMedium!!
        }
        _clipboardUsersMedium = Builder(name = "ClipboardUsersMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.75f, 4.75f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(1.5f)
                lineTo(3.25f, 4.75f)
                verticalLineToRelative(26.5f)
                horizontalLineToRelative(29.5f)
                lineTo(32.75f, 4.75f)
                close()
                moveTo(23.75f, 5.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(24.5f)
                horizontalLineToRelative(27.5f)
                lineTo(31.75f, 5.75f)
                close()
                moveTo(22.75f, 6.25f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(16.5f, 10.75f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.5f, 16.25f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 15.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(10.5f, 19.75f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(15.65f, 25.75f)
                curveToRelative(0.15f, -2.5f, 1.417f, -4.895f, 3.424f, -5.817f)
                curveToRelative(0.5f, 0.398f, 1.112f, 0.637f, 1.79f, 0.637f)
                curveToRelative(0.673f, 0.0f, 1.282f, -0.235f, 1.78f, -0.627f)
                curveToRelative(2.005f, 0.918f, 3.297f, 3.309f, 3.45f, 5.807f)
                close()
                moveTo(26.856f, 24.11f)
                curveToRelative(0.168f, 0.704f, 0.254f, 1.428f, 0.254f, 2.14f)
                verticalLineToRelative(0.5f)
                lineTo(14.635f, 26.75f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.804f, 1.307f, -5.8f, 3.737f, -7.087f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, true, -0.647f, -2.183f)
                curveToRelative(0.0f, -1.739f, 1.109f, -3.286f, 2.666f, -3.55f)
                curveToRelative(0.09f, -0.755f, 0.4f, -1.387f, 0.887f, -1.852f)
                curveToRelative(0.58f, -0.553f, 1.37f, -0.828f, 2.227f, -0.828f)
                curveToRelative(1.854f, 0.0f, 3.14f, 1.719f, 3.14f, 3.59f)
                curveToRelative(0.0f, 0.82f, -0.247f, 1.612f, -0.681f, 2.241f)
                curveToRelative(2.42f, 1.275f, 3.786f, 4.213f, 3.786f, 7.029f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(26.557f, 23.11f)
                horizontalLineToRelative(2.178f)
                curveToRelative(-0.157f, -2.492f, -1.474f, -4.854f, -3.492f, -5.768f)
                curveToRelative(-0.386f, 0.293f, -0.84f, 0.492f, -1.344f, 0.561f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -0.55f, 1.272f)
                curveToRelative(1.513f, 0.8f, 2.603f, 2.264f, 3.208f, 3.935f)
                moveToRelative(-2.553f, -6.251f)
                curveToRelative(-0.05f, -1.666f, -1.115f, -3.132f, -2.605f, -3.418f)
                curveToRelative(0.079f, -0.495f, 0.287f, -0.872f, 0.569f, -1.14f)
                curveToRelative(0.364f, -0.346f, 0.893f, -0.55f, 1.537f, -0.551f)
                curveToRelative(1.145f, 0.0f, 2.14f, 1.1f, 2.14f, 2.59f)
                curveToRelative(0.0f, 1.267f, -0.72f, 2.253f, -1.642f, 2.519f)
                moveToRelative(-0.999f, 0.12f)
                curveToRelative(0.0f, -1.509f, -1.032f, -2.589f, -2.14f, -2.589f)
                reflectiveCurveToRelative(-2.14f, 1.08f, -2.14f, 2.59f)
                reflectiveCurveToRelative(1.031f, 2.59f, 2.14f, 2.59f)
                curveToRelative(1.108f, 0.0f, 2.14f, -1.08f, 2.14f, -2.59f)
            }
        }
        .build()
        return _clipboardUsersMedium!!
    }

private var _clipboardUsersMedium: ImageVector? = null
