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
        _mergeSmall = Builder(
            name = "MergeSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(8.578f, 8.528f)
                curveToRelative(2.49f, 1.363f, 5.98f, 2.339f, 11.702f, 2.46f)
                lineToRelative(-3.024f, -3.024f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(3.89f, 3.89f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-3.89f, 3.89f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(3.024f, -3.023f)
                curveToRelative(-5.722f, 0.12f, -9.213f, 1.096f, -11.702f, 2.46f)
                curveToRelative(-2.165f, 1.184f, -3.593f, 2.666f, -5.114f, 4.243f)
                curveToRelative(-0.361f, 0.375f, -0.728f, 0.755f, -1.11f, 1.138f)
                lineToRelative(-0.708f, -0.707f)
                quadToRelative(0.537f, -0.54f, 1.06f, -1.088f)
                curveToRelative(1.53f, -1.588f, 3.081f, -3.199f, 5.391f, -4.464f)
                curveToRelative(1.669f, -0.913f, 3.722f, -1.645f, 6.446f, -2.095f)
                curveToRelative(-2.724f, -0.45f, -4.777f, -1.182f, -6.446f, -2.095f)
                curveToRelative(-2.31f, -1.265f, -3.861f, -2.876f, -5.39f, -4.464f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -1.06f, -1.087f)
                lineToRelative(0.707f, -0.708f)
                curveToRelative(0.382f, 0.383f, 0.749f, 0.763f, 1.11f, 1.138f)
                curveToRelative(1.52f, 1.577f, 2.95f, 3.059f, 5.114f, 4.244f)
            }
        }
            .build()
        return _mergeSmall!!
    }

private var _mergeSmall: ImageVector? = null
