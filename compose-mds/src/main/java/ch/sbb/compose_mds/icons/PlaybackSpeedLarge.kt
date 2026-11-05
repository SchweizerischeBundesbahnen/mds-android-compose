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

public val SBBIcons.PlaybackSpeedLarge: ImageVector
    get() {
        if (_playbackSpeedLarge != null) {
            return _playbackSpeedLarge!!
        }
        _playbackSpeedLarge = Builder(name = "PlaybackSpeedLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 4.999f)
                curveToRelative(10.77f, 0.0f, 19.5f, 8.73f, 19.5f, 19.5f)
                reflectiveCurveToRelative(-8.73f, 19.5f, -19.5f, 19.5f)
                curveToRelative(-1.33f, 0.0f, -2.631f, -0.133f, -3.888f, -0.388f)
                lineToRelative(0.2f, -0.98f)
                curveToRelative(1.19f, 0.241f, 2.425f, 0.368f, 3.688f, 0.368f)
                curveToRelative(10.218f, 0.0f, 18.5f, -8.282f, 18.5f, -18.5f)
                reflectiveCurveToRelative(-8.282f, -18.5f, -18.5f, -18.5f)
                curveToRelative(-1.237f, 0.0f, -2.447f, 0.122f, -3.615f, 0.353f)
                lineToRelative(-0.097f, -0.49f)
                lineToRelative(-0.097f, -0.492f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 23.5f, 5.0f)
                moveTo(8.125f, 34.792f)
                arcToRelative(18.6f, 18.6f, 0.0f, false, false, 5.113f, 5.103f)
                lineToRelative(-0.554f, 0.832f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, true, -5.39f, -5.378f)
                close()
                moveTo(16.741f, 15.062f)
                lineTo(32.393f, 23.671f)
                lineTo(33.155f, 24.09f)
                lineTo(32.409f, 24.538f)
                lineTo(16.757f, 33.928f)
                lineTo(16.0f, 34.383f)
                lineTo(16.0f, 14.654f)
                close()
                moveTo(17.0f, 32.617f)
                lineToRelative(14.148f, -8.49f)
                lineTo(17.0f, 16.346f)
                close()
                moveTo(5.355f, 20.874f)
                arcTo(18.5f, 18.5f, 0.0f, false, false, 5.0f, 24.499f)
                curveToRelative(0.0f, 1.24f, 0.122f, 2.452f, 0.354f, 3.622f)
                lineToRelative(-0.49f, 0.098f)
                lineToRelative(-0.49f, 0.096f)
                arcTo(19.6f, 19.6f, 0.0f, false, true, 4.0f, 24.5f)
                curveToRelative(0.0f, -1.306f, 0.129f, -2.584f, 0.375f, -3.82f)
                close()
                moveTo(12.895f, 8.731f)
                lineTo(13.175f, 9.146f)
                arcToRelative(18.6f, 18.6f, 0.0f, false, false, -5.05f, 5.06f)
                lineToRelative(-0.83f, -0.557f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, true, 5.321f, -5.333f)
                close()
            }
        }
        .build()
        return _playbackSpeedLarge!!
    }

private var _playbackSpeedLarge: ImageVector? = null
