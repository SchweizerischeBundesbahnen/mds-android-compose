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

public val SBBIcons.OwnerUserGroupLarge: ImageVector
    get() {
        if (_ownerUserGroupLarge != null) {
            return _ownerUserGroupLarge!!
        }
        _ownerUserGroupLarge = Builder(
            name = "OwnerUserGroupLarge",
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
                moveTo(34.3f, 5.6f)
                curveToRelative(1.33f, 0.0f, 2.515f, 0.502f, 3.365f, 1.408f)
                curveToRelative(0.849f, 0.906f, 1.336f, 2.184f, 1.336f, 3.692f)
                curveToRelative(0.0f, 1.46f, -0.511f, 2.798f, -1.327f, 3.79f)
                curveToRelative(2.647f, 1.909f, 3.97f, 4.87f, 4.634f, 7.33f)
                curveToRelative(0.346f, 1.282f, 0.519f, 2.447f, 0.605f, 3.292f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.085f, 1.284f)
                lineToRelative(0.002f, 0.075f)
                lineTo(43.0f, 27.0f)
                horizontalLineToRelative(-6.412f)
                curveToRelative(0.163f, 0.796f, 0.262f, 1.51f, 0.321f, 2.08f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.089f, 1.314f)
                lineToRelative(0.002f, 0.077f)
                verticalLineToRelative(0.53f)
                lineTo(26.206f, 31.001f)
                arcToRelative(24.6f, 24.6f, 0.0f, false, true, 1.751f, 4.591f)
                curveToRelative(0.521f, 1.895f, 0.782f, 3.617f, 0.912f, 4.866f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.129f, 1.892f)
                lineToRelative(0.002f, 0.11f)
                lineTo(29.0f, 43.0f)
                lineTo(4.0f, 43.0f)
                verticalLineToRelative(-0.54f)
                quadToRelative(0.0f, -0.04f, 0.002f, -0.11f)
                quadToRelative(0.002f, -0.142f, 0.015f, -0.408f)
                curveToRelative(0.016f, -0.353f, 0.049f, -0.86f, 0.114f, -1.484f)
                curveToRelative(0.13f, -1.249f, 0.39f, -2.97f, 0.912f, -4.866f)
                curveToRelative(1.016f, -3.69f, 3.04f, -8.105f, 7.093f, -10.914f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.224f, -0.262f)
                curveTo(10.74f, 22.976f, 10.0f, 21.014f, 10.0f, 18.9f)
                curveToRelative(0.0f, -4.234f, 2.984f, -7.3f, 6.5f, -7.3f)
                curveToRelative(3.507f, 0.0f, 6.5f, 2.855f, 6.5f, 7.3f)
                curveToRelative(0.0f, 0.535f, -0.046f, 1.057f, -0.129f, 1.561f)
                curveToRelative(0.68f, -0.77f, 1.428f, -1.542f, 2.194f, -2.12f)
                curveToRelative(-0.921f, -1.014f, -1.464f, -2.461f, -1.464f, -4.042f)
                curveToRelative(0.0f, -1.508f, 0.486f, -2.786f, 1.335f, -3.691f)
                curveTo(25.786f, 9.7f, 26.97f, 9.2f, 28.3f, 9.2f)
                quadToRelative(0.752f, 0.001f, 1.427f, 0.208f)
                curveTo(30.243f, 7.06f, 32.078f, 5.6f, 34.3f, 5.6f)
                moveTo(16.915f, 30.78f)
                lineToRelative(-0.414f, 0.61f)
                lineToRelative(-0.413f, -0.61f)
                lineToRelative(-3.519f, -5.184f)
                curveToRelative(-3.686f, 2.623f, -5.586f, 6.718f, -6.561f, 10.262f)
                arcToRelative(29.5f, 29.5f, 0.0f, false, false, -0.882f, 4.703f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, -0.11f, 1.428f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(22.97f)
                verticalLineToRelative(-0.01f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, -0.11f, -1.428f)
                arcToRelative(29.5f, 29.5f, 0.0f, false, false, -0.882f, -4.703f)
                curveToRelative(-0.975f, -3.544f, -2.876f, -7.64f, -6.562f, -10.262f)
                close()
                moveTo(30.774f, 19.016f)
                arcToRelative(4.24f, 4.24f, 0.0f, false, true, -2.472f, 0.783f)
                curveToRelative(-0.931f, 0.0f, -1.77f, -0.287f, -2.47f, -0.78f)
                curveToRelative(-1.078f, 0.764f, -2.173f, 2.032f, -3.136f, 3.188f)
                lineToRelative(-1.097f, 1.584f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.269f, 0.39f)
                lineToRelative(-0.384f, 0.554f)
                curveTo(23.0f, 26.179f, 24.527f, 28.037f, 25.665f, 30.0f)
                lineTo(35.98f, 30.0f)
                curveToRelative(-0.013f, -0.214f, -0.031f, -0.491f, -0.065f, -0.817f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.598f, -3.2f)
                curveToRelative(-0.673f, -2.452f, -1.989f, -5.253f, -4.544f, -6.967f)
                moveTo(16.5f, 29.61f)
                lineToRelative(2.233f, -3.291f)
                arcToRelative(5.46f, 5.46f, 0.0f, false, true, -2.233f, 0.482f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, true, -2.26f, -0.522f)
                close()
                moveTo(36.956f, 15.208f)
                curveToRelative(-0.762f, 0.623f, -1.68f, 0.992f, -2.655f, 0.993f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.502f, -0.272f)
                curveToRelative(-0.235f, 0.927f, -0.669f, 1.754f, -1.257f, 2.403f)
                curveToRelative(2.7f, 1.915f, 4.057f, 4.897f, 4.74f, 7.387f)
                quadToRelative(0.038f, 0.143f, 0.074f, 0.282f)
                horizontalLineToRelative(5.624f)
                curveToRelative(-0.011f, -0.208f, -0.03f, -0.474f, -0.062f, -0.787f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.576f, -3.133f)
                curveToRelative(-0.65f, -2.406f, -1.92f, -5.162f, -4.386f, -6.872f)
                moveTo(16.5f, 12.6f)
                curveToRelative(-2.884f, 0.0f, -5.5f, 2.534f, -5.5f, 6.3f)
                curveToRelative(0.0f, 1.886f, 0.66f, 3.625f, 1.688f, 4.885f)
                curveToRelative(1.028f, 1.262f, 2.396f, 2.015f, 3.812f, 2.015f)
                curveToRelative(2.84f, 0.0f, 5.5f, -2.885f, 5.5f, -6.9f)
                curveToRelative(0.0f, -3.955f, -2.607f, -6.3f, -5.5f, -6.3f)
                moveToRelative(11.8f, -2.4f)
                curveToRelative(-1.07f, 0.0f, -1.985f, 0.399f, -2.635f, 1.092f)
                curveToRelative(-0.651f, 0.694f, -1.064f, 1.716f, -1.064f, 3.007f)
                curveToRelative(0.0f, 2.613f, 1.657f, 4.5f, 3.7f, 4.5f)
                curveToRelative(2.042f, 0.0f, 3.7f, -1.887f, 3.7f, -4.5f)
                curveToRelative(0.0f, -1.29f, -0.414f, -2.313f, -1.065f, -3.008f)
                curveToRelative(-0.65f, -0.692f, -1.565f, -1.091f, -2.635f, -1.091f)
                moveToRelative(6.0f, -3.6f)
                curveToRelative(-1.772f, 0.0f, -3.274f, 1.177f, -3.636f, 3.215f)
                curveToRelative(0.368f, 0.213f, 0.706f, 0.478f, 1.001f, 0.793f)
                curveToRelative(0.849f, 0.905f, 1.336f, 2.183f, 1.336f, 3.691f)
                quadToRelative(-0.002f, 0.31f, -0.03f, 0.613f)
                curveToRelative(0.393f, 0.193f, 0.807f, 0.288f, 1.33f, 0.288f)
                curveToRelative(1.856f, 0.0f, 3.7f, -1.904f, 3.7f, -4.5f)
                curveToRelative(0.0f, -1.292f, -0.414f, -2.314f, -1.065f, -3.008f)
                curveTo(36.286f, 6.999f, 35.37f, 6.6f, 34.3f, 6.6f)
            }
        }
            .build()
        return _ownerUserGroupLarge!!
    }

private var _ownerUserGroupLarge: ImageVector? = null
