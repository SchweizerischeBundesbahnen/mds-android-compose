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

public val SBBIcons.AvatarPoliceLarge: ImageVector
    get() {
        if (_avatarPoliceLarge != null) {
            return _avatarPoliceLarge!!
        }
        _avatarPoliceLarge = Builder(
            name = "AvatarPoliceLarge",
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
                pathFillType = EvenOdd,
            ) {
                moveToRelative(24.5f, 1.982f)
                lineToRelative(0.129f, 0.035f)
                lineToRelative(15.0f, 4.0f)
                lineToRelative(0.524f, 0.14f)
                lineToRelative(-0.182f, 0.51f)
                lineToRelative(-2.115f, 5.932f)
                lineToRelative(-0.004f, 0.072f)
                arcToRelative(119.0f, 119.0f, 0.0f, false, true, -0.116f, 1.9f)
                curveToRelative(-0.084f, 1.239f, -0.211f, 2.915f, -0.386f, 4.661f)
                curveToRelative(-0.174f, 1.744f, -0.396f, 3.566f, -0.67f, 5.093f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, -0.457f, 2.043f)
                curveToRelative(-0.164f, 0.57f, -0.356f, 1.073f, -0.591f, 1.415f)
                verticalLineToRelative(0.001f)
                arcTo(21.7f, 21.7f, 0.0f, false, true, 33.0f, 30.944f)
                verticalLineToRelative(3.242f)
                lineToRelative(8.317f, 4.003f)
                lineToRelative(0.012f, 0.006f)
                lineToRelative(0.012f, 0.007f)
                arcTo(7.06f, 7.06f, 0.0f, false, true, 45.0f, 44.379f)
                lineTo(45.0f, 46.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.618f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, false, -3.13f, -5.297f)
                lineToRelative(-8.072f, -3.886f)
                arcTo(8.83f, 8.83f, 0.0f, false, true, 25.0f, 40.994f)
                lineTo(25.0f, 46.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.006f)
                arcToRelative(8.83f, 8.83f, 0.0f, false, true, -7.798f, -5.796f)
                lineTo(8.13f, 39.084f)
                arcTo(6.06f, 6.06f, 0.0f, false, false, 5.0f, 44.38f)
                lineTo(5.0f, 46.0f)
                lineTo(4.0f, 46.0f)
                verticalLineToRelative(-1.62f)
                arcToRelative(7.06f, 7.06f, 0.0f, false, true, 3.66f, -6.178f)
                lineToRelative(0.011f, -0.007f)
                lineToRelative(0.012f, -0.006f)
                lineTo(16.0f, 34.186f)
                verticalLineToRelative(-3.204f)
                arcToRelative(21.5f, 21.5f, 0.0f, false, true, -2.66f, -3.197f)
                curveToRelative(-0.239f, -0.338f, -0.43f, -0.84f, -0.594f, -1.405f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, -0.455f, -2.039f)
                curveToRelative(-0.272f, -1.526f, -0.49f, -3.349f, -0.66f, -5.095f)
                arcToRelative(147.0f, 147.0f, 0.0f, false, true, -0.483f, -6.576f)
                lineToRelative(-0.004f, -0.071f)
                lineTo(9.03f, 6.668f)
                lineToRelative(-0.182f, -0.511f)
                lineToRelative(0.524f, -0.14f)
                lineToRelative(15.0f, -4.0f)
                close()
                moveTo(17.0f, 34.428f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, 15.0f, 0.0f)
                verticalLineToRelative(-2.572f)
                curveTo(29.032f, 34.36f, 26.2f, 35.0f, 24.48f, 35.0f)
                curveToRelative(-1.712f, 0.0f, -4.53f, -0.634f, -7.48f, -3.11f)
                close()
                moveTo(12.166f, 13.0f)
                lineToRelative(0.002f, 0.03f)
                arcToRelative(150.0f, 150.0f, 0.0f, false, false, 0.459f, 6.119f)
                curveToRelative(0.168f, 1.736f, 0.383f, 3.529f, 0.649f, 5.017f)
                curveToRelative(0.132f, 0.744f, 0.276f, 1.403f, 0.43f, 1.936f)
                curveToRelative(0.158f, 0.546f, 0.314f, 0.914f, 0.453f, 1.11f)
                lineToRelative(0.003f, 0.005f)
                curveTo(18.072f, 32.907f, 22.402f, 34.0f, 24.48f, 34.0f)
                reflectiveCurveToRelative(6.398f, -1.093f, 10.329f, -6.784f)
                curveToRelative(0.14f, -0.203f, 0.295f, -0.577f, 0.453f, -1.125f)
                curveToRelative(0.155f, -0.536f, 0.3f, -1.198f, 0.433f, -1.943f)
                curveToRelative(0.268f, -1.49f, 0.487f, -3.282f, 0.66f, -5.015f)
                arcToRelative(147.0f, 147.0f, 0.0f, false, false, 0.476f, -6.107f)
                lineToRelative(0.001f, -0.026f)
                horizontalLineToRelative(-1.92f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -0.55f, 0.605f)
                arcTo(13.5f, 13.5f, 0.0f, false, true, 24.504f, 18.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(13.71f, 13.71f, 0.0f, false, true, -10.413f, -5.0f)
                close()
                moveTo(15.412f, 13.0f)
                lineTo(33.56f, 13.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -9.059f, 4.0f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, true, -9.089f, -4.0f)
                moveToRelative(-5.259f, -6.157f)
                lineTo(11.993f, 12.0f)
                horizontalLineToRelative(25.015f)
                lineToRelative(1.839f, -5.157f)
                lineTo(24.5f, 3.017f)
                close()
                moveTo(29.673f, 26.222f)
                arcTo(7.34f, 7.34f, 0.0f, false, true, 24.552f, 28.0f)
                horizontalLineToRelative(-0.041f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -4.923f, -1.593f)
                lineToRelative(-0.617f, 0.786f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 24.53f, 29.0f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, false, 5.798f, -2.022f)
                close()
                moveTo(22.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.854f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.851f, 1.385f)
                lineToRelative(-1.427f, 0.709f)
                lineToRelative(-0.223f, 0.11f)
                lineToRelative(-0.223f, -0.11f)
                lineToRelative(-1.34f, -0.67f)
                lineToRelative(-0.003f, -0.003f)
                arcTo(1.71f, 1.71f, 0.0f, false, true, 22.0f, 8.763f)
                lineTo(22.0f, 5.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(2.758f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.386f, 0.626f)
                lineToRelative(1.115f, 0.557f)
                lineToRelative(1.207f, -0.599f)
                lineToRelative(0.007f, -0.004f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 26.0f, 8.873f)
                lineTo(26.0f, 6.0f)
                close()
                moveTo(28.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-0.278f, 1.084f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.556f, 0.83f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.556f, -0.83f)
                moveToRelative(-8.555f, -0.831f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.667f, 2.495f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.667f, -2.495f)
                moveTo(20.5f, 20.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 0.999f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
            }
        }
            .build()
        return _avatarPoliceLarge!!
    }

private var _avatarPoliceLarge: ImageVector? = null
