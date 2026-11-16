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

public val SBBIcons.MergeSmall: ImageVector
    get() {
        if (_mergeSmall != null) {
            return _mergeSmall!!
        }
        _mergeSmall = Builder(name = "MergeSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.354f, 3.146f)
                curveToRelative(0.382f, 0.383f, 0.748f, 0.763f, 1.11f, 1.137f)
                curveToRelative(1.52f, 1.578f, 2.949f, 3.06f, 5.113f, 4.244f)
                curveToRelative(2.49f, 1.363f, 5.98f, 2.34f, 11.703f, 2.46f)
                lineToRelative(-3.024f, -3.023f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(4.244f, 4.244f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-3.89f, 3.89f)
                lineToRelative(-0.707f, -0.706f)
                lineToRelative(3.024f, -3.024f)
                curveToRelative(-5.723f, 0.12f, -9.214f, 1.097f, -11.703f, 2.46f)
                curveToRelative(-2.164f, 1.185f, -3.593f, 2.666f, -5.113f, 4.243f)
                curveToRelative(-0.362f, 0.375f, -0.728f, 0.755f, -1.11f, 1.137f)
                lineToRelative(-0.708f, -0.707f)
                curveToRelative(0.359f, -0.358f, 0.71f, -0.722f, 1.061f, -1.087f)
                curveToRelative(1.53f, -1.588f, 3.08f, -3.2f, 5.39f, -4.464f)
                curveToRelative(1.669f, -0.914f, 3.722f, -1.645f, 6.445f, -2.095f)
                curveToRelative(-2.723f, -0.45f, -4.776f, -1.181f, -6.444f, -2.095f)
                curveToRelative(-2.31f, -1.265f, -3.862f, -2.876f, -5.39f, -4.464f)
                curveToRelative(-0.353f, -0.365f, -0.703f, -0.73f, -1.062f, -1.087f)
                close()
            }
        }
        .build()
        return _mergeSmall!!
    }

private var _mergeSmall: ImageVector? = null
