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

public val SBBIcons.PlaybackSpeedMedium: ImageVector
    get() {
        if (_playbackSpeedMedium != null) {
            return _playbackSpeedMedium!!
        }
        _playbackSpeedMedium = Builder(
            name = "PlaybackSpeedMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(18.0f, 3.249f)
                curveToRelative(8.147f, 0.0f, 14.75f, 6.603f, 14.75f, 14.75f)
                reflectiveCurveTo(26.147f, 32.749f, 18.0f, 32.749f)
                curveToRelative(-1.006f, 0.0f, -1.99f, -0.1f, -2.94f, -0.293f)
                lineToRelative(0.199f, -0.98f)
                curveToRelative(0.885f, 0.179f, 1.802f, 0.273f, 2.741f, 0.273f)
                curveToRelative(7.594f, 0.0f, 13.75f, -6.156f, 13.75f, -13.75f)
                reflectiveCurveTo(25.594f, 4.249f, 18.0f, 4.249f)
                curveToRelative(-0.92f, 0.0f, -1.82f, 0.09f, -2.687f, 0.262f)
                lineToRelative(-0.194f, -0.98f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 18.0f, 3.248f)
                moveToRelative(-11.428f, 22.4f)
                curveToRelative(1.006f, 1.5f, 2.3f, 2.79f, 3.802f, 3.793f)
                lineToRelative(-0.278f, 0.416f)
                lineToRelative(-0.278f, 0.416f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, -4.076f, -4.068f)
                close()
                moveTo(12.992f, 10.811f)
                lineTo(24.73f, 17.268f)
                lineTo(25.492f, 17.687f)
                lineTo(24.746f, 18.135f)
                lineTo(13.006f, 25.178f)
                lineTo(12.25f, 25.632f)
                lineTo(12.25f, 10.404f)
                close()
                moveTo(13.25f, 23.865f)
                lineTo(23.484f, 17.724f)
                lineTo(13.25f, 12.094f)
                close()
                moveTo(4.514f, 15.304f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 0.0f, 5.386f)
                lineToRelative(-0.492f, 0.098f)
                lineToRelative(-0.49f, 0.098f)
                curveToRelative(-0.185f, -0.934f, -0.282f, -1.9f, -0.282f, -2.887f)
                reflectiveCurveToRelative(0.098f, -1.956f, 0.283f, -2.89f)
                close()
                moveTo(10.326f, 6.587f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -3.754f, 3.76f)
                lineToRelative(-0.83f, -0.556f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, 4.026f, -4.034f)
                close()
            }
        }
            .build()
        return _playbackSpeedMedium!!
    }

private var _playbackSpeedMedium: ImageVector? = null
