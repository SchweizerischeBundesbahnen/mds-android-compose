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
                moveTo(21.544f, 14.58f)
                curveToRelative(-1.093f, 0.672f, -1.818f, 1.966f, -1.818f, 3.42f)
                curveToRelative(0.0f, 1.362f, 0.637f, 2.584f, 1.617f, 3.286f)
                lineToRelative(0.2f, 0.133f)
                lineToRelative(0.004f, 0.002f)
                curveToRelative(2.853f, 1.72f, 5.495f, 5.033f, 5.711f, 8.829f)
                lineTo(8.742f, 30.25f)
                curveToRelative(0.209f, -3.673f, 2.687f, -6.891f, 5.431f, -8.655f)
                lineToRelative(0.279f, -0.174f)
                lineToRelative(0.004f, -0.002f)
                curveToRelative(1.092f, -0.672f, 1.818f, -1.966f, 1.818f, -3.42f)
                reflectiveCurveToRelative(-0.726f, -2.747f, -1.82f, -3.418f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-0.279f, -0.173f)
                curveTo(11.43f, 12.642f, 8.951f, 9.422f, 8.742f, 5.75f)
                horizontalLineToRelative(18.516f)
                curveToRelative(-0.216f, 3.796f, -2.858f, 7.108f, -5.71f, 8.829f)
                close()
                moveTo(14.456f, 21.42f)
                lineTo(14.227f, 21.05f)
                lineTo(14.194f, 20.994f)
                close()
                moveTo(22.064f, 20.565f)
                curveToRelative(-0.777f, -0.48f, -1.338f, -1.438f, -1.338f, -2.565f)
                reflectiveCurveToRelative(0.562f, -2.087f, 1.338f, -2.565f)
                curveToRelative(3.182f, -1.919f, 6.21f, -5.732f, 6.21f, -10.185f)
                verticalLineToRelative(-0.5f)
                lineTo(7.726f, 4.75f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 4.45f, 3.025f, 8.263f, 6.205f, 10.182f)
                verticalLineToRelative(0.001f)
                curveToRelative(0.779f, 0.478f, 1.343f, 1.438f, 1.343f, 2.567f)
                curveToRelative(0.0f, 1.126f, -0.562f, 2.085f, -1.339f, 2.565f)
                curveToRelative(-3.182f, 1.918f, -6.209f, 5.731f, -6.209f, 10.185f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(20.548f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.315f, -2.842f, -8.027f, -5.912f, -10.0f)
                close()
                moveTo(15.496f, 12.867f)
                lineTo(15.498f, 12.868f)
                curveToRelative(0.87f, 0.536f, 1.563f, 1.471f, 2.044f, 2.535f)
                lineToRelative(0.456f, 1.007f)
                lineToRelative(0.455f, -1.007f)
                curveToRelative(0.48f, -1.062f, 1.17f, -1.995f, 2.034f, -2.526f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, false, 1.657f, -1.26f)
                lineToRelative(0.934f, -0.867f)
                lineTo(12.924f, 10.75f)
                lineToRelative(0.93f, 0.867f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 1.624f, 1.238f)
                lineToRelative(0.005f, 0.004f)
                lineToRelative(0.006f, 0.004f)
                close()
                moveTo(16.014f, 12.012f)
                lineTo(15.638f, 11.769f)
                lineTo(15.625f, 11.759f)
                lineTo(15.613f, 11.75f)
                horizontalLineToRelative(4.773f)
                lineToRelative(-0.018f, 0.013f)
                lineToRelative(-0.02f, 0.015f)
                lineToRelative(-0.382f, 0.247f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.816f, 0.502f, -1.469f, 1.255f, -1.967f, 2.09f)
                curveToRelative(-0.5f, -0.837f, -1.155f, -1.593f, -1.975f, -2.098f)
                close()
            }
        }
        .build()
        return _hourglassMedium!!
    }

private var _hourglassMedium: ImageVector? = null
