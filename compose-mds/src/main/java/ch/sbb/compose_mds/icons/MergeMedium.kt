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

public val SBBIcons.MergeMedium: ImageVector
    get() {
        if (_mergeMedium != null) {
            return _mergeMedium!!
        }
        _mergeMedium = Builder(name = "MergeMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.006f, 6.59f)
                curveToRelative(2.284f, 2.369f, 4.457f, 4.623f, 7.74f, 6.42f)
                curveToRelative(3.87f, 2.12f, 9.311f, 3.61f, 18.289f, 3.732f)
                lineToRelative(-4.974f, -4.974f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(6.189f, 6.189f)
                lineToRelative(-6.189f, 6.188f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(4.974f, -4.973f)
                curveToRelative(-8.978f, 0.123f, -14.419f, 1.612f, -18.289f, 3.731f)
                curveToRelative(-3.283f, 1.798f, -5.456f, 4.052f, -7.74f, 6.421f)
                curveToRelative(-0.54f, 0.56f, -1.085f, 1.126f, -1.652f, 1.694f)
                lineToRelative(-0.708f, -0.707f)
                curveToRelative(0.543f, -0.543f, 1.073f, -1.093f, 1.602f, -1.643f)
                curveToRelative(2.293f, -2.38f, 4.59f, -4.764f, 8.019f, -6.642f)
                curveToRelative(2.804f, -1.535f, 6.352f, -2.73f, 11.272f, -3.362f)
                curveToRelative(-4.92f, -0.633f, -8.468f, -1.827f, -11.272f, -3.362f)
                curveToRelative(-3.43f, -1.878f, -5.726f, -4.262f, -8.019f, -6.642f)
                curveToRelative(-0.53f, -0.55f, -1.059f, -1.1f, -1.602f, -1.642f)
                lineToRelative(0.708f, -0.708f)
                curveToRelative(0.567f, 0.568f, 1.113f, 1.134f, 1.652f, 1.694f)
            }
        }
        .build()
        return _mergeMedium!!
    }

private var _mergeMedium: ImageVector? = null
