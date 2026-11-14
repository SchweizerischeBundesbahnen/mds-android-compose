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

public val SBBIcons.HeartSmall: ImageVector
    get() {
        if (_heartSmall != null) {
            return _heartSmall!!
        }
        _heartSmall = Builder(name = "HeartSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.994f, 9.497f)
                arcTo(5.483f, 5.483f, 0.0f, false, true, 7.5f, 4.0f)
                curveToRelative(1.59f, 0.0f, 3.005f, 0.673f, 4.002f, 1.738f)
                arcTo(5.44f, 5.44f, 0.0f, false, true, 15.5f, 4.0f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, 5.169f, 3.606f)
                lineToRelative(-0.94f, 0.34f)
                arcTo(4.48f, 4.48f, 0.0f, false, false, 15.5f, 5.0f)
                arcToRelative(4.45f, 4.45f, 0.0f, false, false, -3.596f, 1.817f)
                lineToRelative(-0.4f, 0.54f)
                lineToRelative(-0.402f, -0.54f)
                lineToRelative(-0.16f, -0.203f)
                arcTo(4.46f, 4.46f, 0.0f, false, false, 7.5f, 5.0f)
                arcToRelative(4.483f, 4.483f, 0.0f, false, false, -4.506f, 4.497f)
                curveToRelative(0.0f, 0.785f, 0.197f, 1.52f, 0.544f, 2.158f)
                quadToRelative(0.299f, 0.554f, 0.714f, 0.989f)
                lineToRelative(7.247f, 7.248f)
                lineToRelative(7.228f, -7.229f)
                curveToRelative(0.189f, -0.23f, 0.57f, -0.726f, 0.683f, -0.925f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.375f, -0.657f, 0.589f, -1.421f, 0.589f, -2.24f)
                curveToRelative(0.0f, -0.548f, -0.095f, -1.07f, -0.27f, -1.55f)
                lineToRelative(0.47f, -0.172f)
                lineToRelative(0.469f, -0.17f)
                curveToRelative(0.215f, 0.59f, 0.331f, 1.227f, 0.331f, 1.891f)
                curveToRelative(0.0f, 0.996f, -0.262f, 1.929f, -0.72f, 2.734f)
                curveToRelative(-0.164f, 0.29f, -0.618f, 0.872f, -0.796f, 1.088f)
                lineToRelative(-0.014f, 0.018f)
                lineToRelative(-0.017f, 0.017f)
                lineToRelative(-7.6f, 7.6f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-0.354f, -0.355f)
                lineToRelative(-7.609f, -7.61f)
                lineToRelative(-0.007f, -0.007f)
                lineToRelative(0.35f, -0.335f)
                lineToRelative(0.023f, -0.023f)
                lineToRelative(-0.373f, 0.358f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.682f, -0.882f)
                lineToRelative(-0.188f, -0.321f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.666f, -2.636f)
            }
        }
        .build()
        return _heartSmall!!
    }

private var _heartSmall: ImageVector? = null
