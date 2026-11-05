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

public val SBBIcons.HeartFilledSmall: ImageVector
    get() {
        if (_heartFilledSmall != null) {
            return _heartFilledSmall!!
        }
        _heartFilledSmall = Builder(name = "HeartFilledSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 4.0f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, 5.169f, 3.606f)
                lineToRelative(-0.47f, 0.17f)
                lineToRelative(0.47f, -0.17f)
                curveToRelative(0.215f, 0.59f, 0.331f, 1.227f, 0.331f, 1.891f)
                curveToRelative(0.0f, 0.996f, -0.262f, 1.929f, -0.72f, 2.734f)
                curveToRelative(-0.164f, 0.29f, -0.618f, 0.872f, -0.796f, 1.088f)
                lineToRelative(-0.014f, 0.018f)
                lineToRelative(-7.616f, 7.616f)
                lineToRelative(-0.354f, 0.355f)
                lineToRelative(-0.354f, -0.355f)
                lineToRelative(-7.609f, -7.61f)
                lineToRelative(-0.007f, -0.007f)
                lineToRelative(0.35f, -0.335f)
                lineToRelative(0.01f, -0.012f)
                lineToRelative(-0.36f, 0.347f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.682f, -0.882f)
                lineToRelative(-0.188f, -0.321f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.666f, -2.636f)
                arcTo(5.483f, 5.483f, 0.0f, false, true, 7.5f, 4.0f)
                curveToRelative(1.59f, 0.0f, 3.005f, 0.673f, 4.002f, 1.738f)
                arcTo(5.44f, 5.44f, 0.0f, false, true, 15.5f, 4.0f)
            }
        }
        .build()
        return _heartFilledSmall!!
    }

private var _heartFilledSmall: ImageVector? = null
