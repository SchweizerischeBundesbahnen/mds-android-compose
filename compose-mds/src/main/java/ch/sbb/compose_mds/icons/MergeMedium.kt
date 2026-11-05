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
        _mergeMedium = Builder(
            name = "MergeMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                pathFillType = EvenOdd,
            ) {
                moveTo(12.746f, 13.01f)
                curveToRelative(3.87f, 2.12f, 9.311f, 3.61f, 18.289f, 3.732f)
                lineToRelative(-4.974f, -4.974f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(5.835f, 5.835f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-5.835f, 5.835f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(4.974f, -4.973f)
                curveToRelative(-8.978f, 0.123f, -14.419f, 1.612f, -18.289f, 3.731f)
                curveToRelative(-3.283f, 1.798f, -5.456f, 4.052f, -7.74f, 6.421f)
                curveToRelative(-0.539f, 0.56f, -1.085f, 1.126f, -1.652f, 1.694f)
                lineToRelative(-0.708f, -0.707f)
                curveToRelative(0.544f, -0.544f, 1.073f, -1.094f, 1.603f, -1.644f)
                curveToRelative(2.292f, -2.38f, 4.588f, -4.763f, 8.017f, -6.64f)
                curveToRelative(2.804f, -1.536f, 6.352f, -2.73f, 11.272f, -3.363f)
                curveToRelative(-4.92f, -0.632f, -8.468f, -1.827f, -11.272f, -3.362f)
                curveTo(8.837f, 12.01f, 6.541f, 9.626f, 4.25f, 7.247f)
                curveToRelative(-0.53f, -0.55f, -1.06f, -1.1f, -1.603f, -1.643f)
                lineToRelative(0.708f, -0.708f)
                curveToRelative(0.567f, 0.568f, 1.113f, 1.134f, 1.652f, 1.694f)
                curveToRelative(2.284f, 2.369f, 4.457f, 4.623f, 7.74f, 6.42f)
            }
        }
            .build()
        return _mergeMedium!!
    }

private var _mergeMedium: ImageVector? = null
