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

public val SBBIcons.LowVisionSmall: ImageVector
    get() {
        if (_lowVisionSmall != null) {
            return _lowVisionSmall!!
        }
        _lowVisionSmall = Builder(name = "LowVisionSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.757f, 19.704f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-15.0f, -15.0f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(2.816f, 2.815f)
                arcToRelative(17.2f, 17.2f, 0.0f, false, false, -3.37f, 3.541f)
                lineToRelative(-0.2f, 0.282f)
                lineToRelative(0.192f, 0.288f)
                curveToRelative(0.392f, 0.581f, 1.485f, 1.994f, 3.03f, 3.268f)
                curveToRelative(1.54f, 1.269f, 3.591f, 2.452f, 5.885f, 2.452f)
                horizontalLineToRelative(0.015f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 3.41f, -0.869f)
                close()
                moveTo(14.785f, 15.731f)
                lineTo(7.285f, 8.231f)
                quadToRelative(-0.726f, 0.565f, -1.382f, 1.206f)
                lineToRelative(6.854f, 6.862f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 2.028f, -0.568f)
                moveToRelative(-2.66f, 1.618f)
                lineToRelative(-0.008f, -0.276f)
                close()
                moveTo(12.11f, 5.35f)
                curveToRelative(2.294f, 0.0f, 4.346f, 1.183f, 5.885f, 2.452f)
                curveToRelative(1.545f, 1.274f, 2.639f, 2.687f, 3.03f, 3.269f)
                lineToRelative(0.194f, 0.288f)
                lineToRelative(-0.202f, 0.282f)
                arcToRelative(17.6f, 17.6f, 0.0f, false, true, -2.922f, 3.18f)
                lineToRelative(-0.649f, -0.762f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, 2.546f, -2.715f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, -2.634f, -2.77f)
                curveToRelative(-1.462f, -1.206f, -3.289f, -2.222f, -5.243f, -2.224f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -2.28f, 0.464f)
                lineToRelative(-0.37f, -0.928f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.1f, 5.35f)
                close()
                moveTo(4.228f, 11.355f)
                quadToRelative(0.462f, -0.623f, 0.982f, -1.197f)
                lineToRelative(6.133f, 6.14f)
                curveToRelative(-1.665f, -0.22f, -3.21f, -1.124f, -4.48f, -2.171f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, -2.635f, -2.772f)
                moveToRelative(8.944f, -3.869f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, false, -2.052f, 0.001f)
                lineToRelative(0.26f, 0.966f)
                arcToRelative(2.96f, 2.96f, 0.0f, false, true, 3.627f, 3.627f)
                lineToRelative(0.966f, 0.26f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, false, -2.8f, -4.854f)
            }
        }
        .build()
        return _lowVisionSmall!!
    }

private var _lowVisionSmall: ImageVector? = null
