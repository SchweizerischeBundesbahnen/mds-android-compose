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

public val SBBIcons.HourglassMedium: ImageVector
    get() {
        if (_hourglassMedium != null) {
            return _hourglassMedium!!
        }
        _hourglassMedium = Builder(name = "HourglassMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.226f, 4.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 4.452f, 3.026f, 8.265f, 6.207f, 10.184f)
                curveToRelative(0.778f, 0.478f, 1.341f, 1.437f, 1.341f, 2.566f)
                reflectiveCurveToRelative(-0.563f, 2.087f, -1.341f, 2.567f)
                curveToRelative(-3.181f, 1.918f, -6.207f, 5.73f, -6.207f, 10.183f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(20.548f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.453f, -3.027f, -8.265f, -6.208f, -10.183f)
                curveToRelative(-0.778f, -0.48f, -1.34f, -1.439f, -1.34f, -2.567f)
                curveToRelative(0.0f, -1.13f, 0.562f, -2.088f, 1.34f, -2.566f)
                curveToRelative(3.18f, -1.919f, 6.208f, -5.732f, 6.208f, -10.184f)
                verticalLineToRelative(-0.5f)
                horizontalLineTo(8.226f)
                moveToRelative(19.034f, 1.0f)
                horizontalLineTo(8.74f)
                curveToRelative(0.216f, 3.796f, 2.859f, 7.109f, 5.711f, 8.829f)
                lineToRelative(0.004f, 0.002f)
                curveToRelative(1.093f, 0.671f, 1.82f, 1.965f, 1.82f, 3.419f)
                reflectiveCurveToRelative(-0.727f, 2.747f, -1.82f, 3.42f)
                lineToRelative(-0.004f, 0.002f)
                curveToRelative(-2.853f, 1.72f, -5.495f, 5.031f, -5.71f, 8.828f)
                horizontalLineTo(27.26f)
                curveToRelative(-0.216f, -3.796f, -2.86f, -7.108f, -5.713f, -8.828f)
                lineToRelative(-0.003f, -0.003f)
                curveToRelative(-1.094f, -0.672f, -1.818f, -1.966f, -1.818f, -3.42f)
                reflectiveCurveToRelative(0.724f, -2.747f, 1.818f, -3.418f)
                lineToRelative(0.003f, -0.002f)
                curveToRelative(2.853f, -1.72f, 5.497f, -5.033f, 5.713f, -8.83f)
                moveToRelative(-13.064f, 5.0f)
                horizontalLineToRelative(-1.272f)
                lineToRelative(0.931f, 0.866f)
                curveToRelative(0.515f, 0.479f, 1.068f, 0.903f, 1.632f, 1.246f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(0.008f, 0.004f)
                curveToRelative(0.87f, 0.536f, 1.563f, 1.471f, 2.045f, 2.535f)
                lineToRelative(0.455f, 1.007f)
                lineToRelative(0.456f, -1.007f)
                curveToRelative(0.48f, -1.062f, 1.168f, -1.994f, 2.032f, -2.524f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, false, 1.658f, -1.262f)
                lineToRelative(0.934f, -0.867f)
                horizontalLineToRelative(-8.882f)
                moveToRelative(1.819f, 1.262f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.405f, -0.262f)
                horizontalLineToRelative(4.778f)
                quadToRelative(-0.21f, 0.146f, -0.422f, 0.274f)
                lineToRelative(-0.002f, 0.002f)
                curveToRelative(-0.816f, 0.501f, -1.468f, 1.255f, -1.966f, 2.09f)
                curveToRelative(-0.499f, -0.836f, -1.152f, -1.59f, -1.968f, -2.094f)
                lineToRelative(-0.006f, -0.004f)
                close()
            }
        }
        .build()
        return _hourglassMedium!!
    }

private var _hourglassMedium: ImageVector? = null
