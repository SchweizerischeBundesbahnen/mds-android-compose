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

public val SBBIcons.HeartSmall: ImageVector
    get() {
        if (_heartSmall != null) {
            return _heartSmall!!
        }
        _heartSmall = Builder(name = "HeartSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.994f, 9.497f)
                arcTo(5.483f, 5.483f, 0.0f, false, true, 7.5f, 4.0f)
                curveToRelative(1.59f, 0.0f, 3.005f, 0.673f, 4.003f, 1.739f)
                arcTo(5.44f, 5.44f, 0.0f, false, true, 15.5f, 4.0f)
                arcTo(5.477f, 5.477f, 0.0f, false, true, 21.0f, 9.497f)
                curveToRelative(0.0f, 0.996f, -0.261f, 1.93f, -0.72f, 2.736f)
                curveToRelative(-0.166f, 0.29f, -0.618f, 0.87f, -0.795f, 1.085f)
                lineToRelative(-0.015f, 0.019f)
                lineToRelative(-0.017f, 0.017f)
                lineToRelative(-7.6f, 7.6f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(-7.61f, -7.61f)
                lineToRelative(-0.007f, -0.008f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -0.87f, -1.203f)
                moveTo(7.5f, 5.0f)
                arcToRelative(4.483f, 4.483f, 0.0f, false, false, -4.506f, 4.497f)
                curveToRelative(0.0f, 0.785f, 0.198f, 1.52f, 0.544f, 2.158f)
                quadToRelative(0.298f, 0.552f, 0.71f, 0.985f)
                lineToRelative(7.252f, 7.253f)
                lineToRelative(7.228f, -7.23f)
                curveToRelative(0.189f, -0.23f, 0.57f, -0.726f, 0.682f, -0.925f)
                curveToRelative(0.376f, -0.657f, 0.59f, -1.421f, 0.59f, -2.24f)
                arcTo(4.477f, 4.477f, 0.0f, false, false, 15.5f, 5.0f)
                arcToRelative(4.45f, 4.45f, 0.0f, false, false, -3.595f, 1.815f)
                lineToRelative(-0.401f, 0.54f)
                lineToRelative(-0.402f, -0.54f)
                arcTo(4.47f, 4.47f, 0.0f, false, false, 7.5f, 5.0f)
                moveTo(1.994f, 9.497f)
                curveToRelative(0.0f, 0.955f, 0.24f, 1.854f, 0.666f, 2.636f)
                close()
            }
        }
        .build()
        return _heartSmall!!
    }

private var _heartSmall: ImageVector? = null
