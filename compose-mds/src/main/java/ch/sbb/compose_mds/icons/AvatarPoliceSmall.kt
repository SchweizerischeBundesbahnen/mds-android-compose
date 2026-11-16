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

public val SBBIcons.AvatarPoliceSmall: ImageVector
    get() {
        if (_avatarPoliceSmall != null) {
            return _avatarPoliceSmall!!
        }
        _avatarPoliceSmall = Builder(name = "AvatarPoliceSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.999f, 11.03f)
                verticalLineToRelative(0.016f)
                lineToRelative(-0.003f, 0.042f)
                lineToRelative(-0.01f, 0.16f)
                arcToRelative(53.0f, 53.0f, 0.0f, false, true, -0.226f, 2.399f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -0.318f, 2.053f)
                curveToRelative(-0.125f, 0.608f, -0.29f, 1.206f, -0.52f, 1.569f)
                lineToRelative(-0.507f, -0.323f)
                lineToRelative(0.505f, 0.326f)
                curveTo(14.965f, 20.297f, 12.727f, 21.0f, 11.49f, 21.0f)
                curveToRelative(-1.236f, 0.0f, -3.474f, -0.703f, -5.429f, -3.728f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-0.233f, -0.361f, -0.397f, -0.96f, -0.522f, -1.568f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, -0.317f, -2.053f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, -0.236f, -2.562f)
                lineToRelative(-0.003f, -0.042f)
                verticalLineToRelative(-0.016f)
                lineToRelative(0.997f, -0.06f)
                verticalLineToRelative(0.003f)
                lineToRelative(0.001f, 0.01f)
                lineToRelative(0.002f, 0.04f)
                lineToRelative(0.011f, 0.155f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, false, 0.22f, 2.353f)
                curveToRelative(0.081f, 0.676f, 0.182f, 1.376f, 0.304f, 1.97f)
                curveToRelative(0.128f, 0.618f, 0.264f, 1.042f, 0.383f, 1.228f)
                curveTo(8.693f, 19.502f, 10.631f, 20.0f, 11.491f, 20.0f)
                reflectiveCurveToRelative(2.797f, -0.498f, 4.589f, -3.271f)
                curveToRelative(0.12f, -0.19f, 0.256f, -0.615f, 0.383f, -1.232f)
                curveToRelative(0.122f, -0.594f, 0.224f, -1.294f, 0.304f, -1.968f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, false, 0.22f, -2.351f)
                quadToRelative(0.008f, -0.102f, 0.01f, -0.155f)
                lineToRelative(0.004f, -0.04f)
                verticalLineToRelative(-0.013f)
                close()
                moveTo(14.418f, 16.892f)
                curveToRelative(-0.646f, 0.695f, -1.739f, 1.107f, -2.918f, 1.107f)
                curveToRelative(-1.112f, 0.0f, -2.14f, -0.366f, -2.795f, -0.983f)
                lineToRelative(0.685f, -0.728f)
                curveToRelative(0.431f, 0.407f, 1.195f, 0.711f, 2.11f, 0.711f)
                curveToRelative(0.976f, 0.0f, 1.775f, -0.345f, 2.185f, -0.788f)
                close()
                moveTo(16.922f, 17.269f)
                lineTo(16.921f, 17.272f)
                lineTo(16.5f, 17.0f)
                close()
                moveTo(13.5f, 13.8f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.2f, 0.2f)
                lineToRelative(0.003f, 0.04f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, 0.392f, 0.0f)
                lineTo(13.7f, 14.0f)
                lineToRelative(-0.005f, -0.04f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.155f, -0.156f)
                close()
                moveTo(9.695f, 13.96f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.155f, -0.156f)
                lineTo(9.5f, 13.8f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.2f, 0.2f)
                lineToRelative(0.004f, 0.04f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, 0.391f, 0.0f)
                lineTo(9.7f, 14.0f)
                close()
                moveTo(11.637f, 4.02f)
                lineTo(18.637f, 6.02f)
                lineTo(19.14f, 6.163f)
                lineTo(17.974f, 9.658f)
                lineTo(17.86f, 10.0f)
                horizontalLineToRelative(-1.372f)
                curveToRelative(-1.244f, 1.513f, -2.998f, 2.5f, -4.988f, 2.5f)
                reflectiveCurveToRelative(-3.744f, -0.987f, -4.988f, -2.5f)
                lineTo(5.139f, 10.0f)
                lineToRelative(-0.114f, -0.342f)
                lineTo(3.86f, 6.163f)
                lineToRelative(0.502f, -0.143f)
                lineToRelative(7.0f, -2.0f)
                lineToRelative(0.138f, -0.04f)
                close()
                moveTo(7.88f, 10.0f)
                curveToRelative(1.009f, 0.943f, 2.263f, 1.5f, 3.62f, 1.5f)
                curveToRelative(1.359f, 0.0f, 2.613f, -0.557f, 3.622f, -1.5f)
                close()
                moveTo(5.14f, 6.837f)
                lineTo(5.86f, 9.0f)
                horizontalLineToRelative(11.28f)
                lineToRelative(0.72f, -2.163f)
                lineTo(11.5f, 5.02f)
                close()
                moveTo(10.5f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 12.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-0.2f, 7.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -1.595f, 0.081f)
                lineTo(8.7f, 14.0f)
                lineToRelative(0.004f, -0.08f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.796f, -0.72f)
                lineToRelative(0.082f, 0.005f)
                arcTo(0.8f, 0.8f, 0.0f, false, true, 10.3f, 14.0f)
                moveToRelative(4.0f, 0.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -1.595f, 0.081f)
                lineTo(12.7f, 14.0f)
                lineToRelative(0.004f, -0.08f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.796f, -0.72f)
                lineToRelative(0.082f, 0.005f)
                arcTo(0.8f, 0.8f, 0.0f, false, true, 14.3f, 14.0f)
            }
        }
        .build()
        return _avatarPoliceSmall!!
    }

private var _avatarPoliceSmall: ImageVector? = null
