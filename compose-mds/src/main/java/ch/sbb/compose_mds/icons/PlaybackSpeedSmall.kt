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

public val SBBIcons.PlaybackSpeedSmall: ImageVector
    get() {
        if (_playbackSpeedSmall != null) {
            return _playbackSpeedSmall!!
        }
        _playbackSpeedSmall = Builder(name = "PlaybackSpeedSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.515f, 2.013f)
                curveTo(17.799f, 2.28f, 22.0f, 6.649f, 22.0f, 12.0f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-0.682f, 0.0f, -1.349f, -0.068f, -1.993f, -0.198f)
                lineToRelative(0.2f, -0.98f)
                curveToRelative(0.578f, 0.116f, 1.178f, 0.178f, 1.793f, 0.178f)
                lineTo(12.0f, 21.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.463f, -17.99f)
                lineTo(12.0f, 3.0f)
                quadToRelative(-0.904f, 0.002f, -1.759f, 0.172f)
                lineToRelative(-0.096f, -0.491f)
                lineToRelative(-0.097f, -0.49f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(4.52f, 17.007f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, false, 2.488f, 2.483f)
                lineToRelative(-0.278f, 0.415f)
                lineToRelative(-0.277f, 0.416f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, -2.764f, -2.758f)
                close()
                moveTo(8.74f, 7.062f)
                lineToRelative(7.826f, 4.304f)
                lineToRelative(0.762f, 0.42f)
                lineToRelative(-0.746f, 0.447f)
                lineToRelative(-7.826f, 4.696f)
                lineToRelative(-0.757f, 0.454f)
                lineTo(7.999f, 6.654f)
                close()
                moveTo(9.0f, 15.616f)
                lineToRelative(6.322f, -3.794f)
                lineTo(9.0f, 8.346f)
                close()
                moveTo(3.173f, 10.236f)
                arcToRelative(9.05f, 9.05f, 0.0f, false, false, -0.001f, 3.526f)
                lineToRelative(-0.49f, 0.097f)
                lineToRelative(-0.49f, 0.097f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, 0.0f, -3.916f)
                close()
                moveTo(6.977f, 4.53f)
                arcTo(9.1f, 9.1f, 0.0f, false, false, 4.52f, 6.992f)
                lineToRelative(-0.416f, -0.278f)
                lineToRelative(-0.415f, -0.28f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 6.418f, 3.7f)
                close()
            }
        }
        .build()
        return _playbackSpeedSmall!!
    }

private var _playbackSpeedSmall: ImageVector? = null
