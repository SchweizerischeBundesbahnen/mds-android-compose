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

public val SBBIcons.MountainLakeSunSmall: ImageVector
    get() {
        if (_mountainLakeSunSmall != null) {
            return _mountainLakeSunSmall!!
        }
        _mountainLakeSunSmall = Builder(
            name = "MountainLakeSunSmall",
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
                moveTo(4.0f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveTo(5.5f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(11.441f, 3.265f)
                lineToRelative(-0.317f, -0.596f)
                lineToRelative(-0.478f, 0.477f)
                lineToRelative(-5.693f, 5.694f)
                lineTo(6.8f, 9.1f)
                lineToRelative(-0.423f, -0.317f)
                lineToRelative(-0.293f, 0.44f)
                lineToRelative(-3.0f, 4.5f)
                lineToRelative(0.832f, 0.554f)
                lineToRelative(2.707f, -4.06f)
                lineTo(10.2f, 12.9f)
                lineToRelative(0.347f, 0.26f)
                lineToRelative(0.306f, -0.306f)
                lineToRelative(5.523f, -5.523f)
                lineToRelative(3.683f, 6.904f)
                lineToRelative(0.882f, -0.47f)
                close()
                moveTo(5.301f, 19.362f)
                curveTo(5.761f, 19.14f, 6.305f, 19.0f, 7.003f, 19.0f)
                reflectiveCurveToRelative(1.24f, 0.14f, 1.701f, 0.362f)
                curveToRelative(0.443f, 0.212f, 0.793f, 0.492f, 1.098f, 0.736f)
                lineToRelative(0.014f, 0.012f)
                curveToRelative(0.318f, 0.253f, 0.589f, 0.468f, 0.92f, 0.627f)
                curveToRelative(0.322f, 0.154f, 0.717f, 0.263f, 1.27f, 0.263f)
                curveToRelative(0.552f, 0.0f, 0.946f, -0.11f, 1.267f, -0.263f)
                curveToRelative(0.332f, -0.16f, 0.602f, -0.373f, 0.92f, -0.627f)
                lineToRelative(0.015f, -0.012f)
                curveToRelative(0.304f, -0.244f, 0.654f, -0.524f, 1.096f, -0.736f)
                curveToRelative(0.46f, -0.221f, 1.004f, -0.362f, 1.701f, -0.362f)
                reflectiveCurveToRelative(1.24f, 0.14f, 1.7f, 0.362f)
                curveToRelative(0.441f, 0.212f, 0.791f, 0.493f, 1.095f, 0.736f)
                lineToRelative(0.015f, 0.012f)
                curveToRelative(0.317f, 0.254f, 0.587f, 0.468f, 0.919f, 0.627f)
                curveToRelative(0.32f, 0.154f, 0.714f, 0.263f, 1.266f, 0.263f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.697f, 0.0f, -1.24f, -0.14f, -1.7f, -0.362f)
                curveToRelative(-0.441f, -0.212f, -0.791f, -0.493f, -1.095f, -0.736f)
                lineToRelative(-0.015f, -0.012f)
                curveToRelative(-0.317f, -0.254f, -0.587f, -0.468f, -0.919f, -0.627f)
                curveToRelative(-0.32f, -0.154f, -0.714f, -0.263f, -1.266f, -0.263f)
                reflectiveCurveToRelative(-0.947f, 0.11f, -1.268f, 0.263f)
                curveToRelative(-0.331f, 0.16f, -0.602f, 0.373f, -0.92f, 0.627f)
                lineToRelative(-0.014f, 0.012f)
                curveToRelative(-0.304f, 0.244f, -0.655f, 0.524f, -1.097f, 0.736f)
                curveToRelative(-0.46f, 0.221f, -1.003f, 0.362f, -1.7f, 0.362f)
                reflectiveCurveToRelative(-1.241f, -0.14f, -1.702f, -0.362f)
                curveToRelative(-0.442f, -0.212f, -0.793f, -0.492f, -1.097f, -0.736f)
                lineToRelative(-0.015f, -0.012f)
                curveToRelative(-0.318f, -0.253f, -0.588f, -0.468f, -0.92f, -0.627f)
                curveTo(7.95f, 20.11f, 7.556f, 20.0f, 7.002f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -0.947f, 0.11f, -1.268f, 0.263f)
                curveToRelative(-0.332f, 0.16f, -0.603f, 0.373f, -0.92f, 0.627f)
                lineToRelative(-0.015f, 0.012f)
                curveToRelative(-0.304f, 0.244f, -0.655f, 0.524f, -1.098f, 0.736f)
                curveTo(3.241f, 21.86f, 2.698f, 22.0f, 2.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.553f, 0.0f, 0.948f, -0.11f, 1.269f, -0.263f)
                curveToRelative(0.332f, -0.16f, 0.602f, -0.373f, 0.92f, -0.627f)
                lineToRelative(0.015f, -0.012f)
                curveToRelative(0.304f, -0.244f, 0.655f, -0.524f, 1.097f, -0.736f)
                moveTo(7.003f, 15.0f)
                curveToRelative(-0.698f, 0.0f, -1.241f, 0.14f, -1.702f, 0.362f)
                curveToRelative(-0.442f, 0.212f, -0.793f, 0.492f, -1.097f, 0.736f)
                lineToRelative(-0.015f, 0.012f)
                curveToRelative(-0.318f, 0.253f, -0.588f, 0.468f, -0.92f, 0.627f)
                curveTo(2.948f, 16.89f, 2.553f, 17.0f, 2.0f, 17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.698f, 0.0f, 1.241f, -0.14f, 1.701f, -0.362f)
                curveToRelative(0.443f, -0.212f, 0.794f, -0.492f, 1.098f, -0.736f)
                lineToRelative(0.015f, -0.012f)
                curveToRelative(0.317f, -0.253f, 0.588f, -0.468f, 0.92f, -0.627f)
                curveToRelative(0.321f, -0.154f, 0.716f, -0.263f, 1.269f, -0.263f)
                reflectiveCurveToRelative(0.947f, 0.11f, 1.269f, 0.263f)
                curveToRelative(0.332f, 0.16f, 0.602f, 0.373f, 0.92f, 0.627f)
                lineToRelative(0.015f, 0.012f)
                curveToRelative(0.304f, 0.244f, 0.655f, 0.524f, 1.097f, 0.736f)
                curveToRelative(0.46f, 0.221f, 1.004f, 0.362f, 1.702f, 0.362f)
                curveToRelative(0.697f, 0.0f, 1.24f, -0.14f, 1.7f, -0.362f)
                curveToRelative(0.442f, -0.212f, 0.793f, -0.492f, 1.097f, -0.736f)
                lineToRelative(0.015f, -0.012f)
                curveToRelative(0.317f, -0.254f, 0.588f, -0.468f, 0.92f, -0.627f)
                curveToRelative(0.32f, -0.154f, 0.715f, -0.263f, 1.267f, -0.263f)
                reflectiveCurveToRelative(0.946f, 0.11f, 1.266f, 0.263f)
                curveToRelative(0.332f, 0.16f, 0.602f, 0.373f, 0.919f, 0.627f)
                lineToRelative(0.015f, 0.012f)
                curveToRelative(0.304f, 0.243f, 0.654f, 0.524f, 1.096f, 0.736f)
                curveToRelative(0.46f, 0.221f, 1.002f, 0.362f, 1.699f, 0.362f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -0.946f, -0.11f, -1.266f, -0.263f)
                curveToRelative(-0.332f, -0.16f, -0.602f, -0.373f, -0.919f, -0.627f)
                lineToRelative(-0.015f, -0.012f)
                curveToRelative(-0.304f, -0.243f, -0.654f, -0.524f, -1.096f, -0.736f)
                curveToRelative(-0.46f, -0.221f, -1.002f, -0.362f, -1.699f, -0.362f)
                reflectiveCurveToRelative(-1.24f, 0.14f, -1.7f, 0.362f)
                curveToRelative(-0.443f, 0.212f, -0.793f, 0.492f, -1.097f, 0.736f)
                lineToRelative(-0.015f, 0.012f)
                curveToRelative(-0.318f, 0.254f, -0.588f, 0.468f, -0.92f, 0.627f)
                curveToRelative(-0.32f, 0.154f, -0.715f, 0.263f, -1.267f, 0.263f)
                curveToRelative(-0.553f, 0.0f, -0.948f, -0.11f, -1.27f, -0.263f)
                curveToRelative(-0.331f, -0.16f, -0.602f, -0.373f, -0.92f, -0.627f)
                lineToRelative(-0.014f, -0.012f)
                curveToRelative(-0.305f, -0.244f, -0.655f, -0.524f, -1.098f, -0.736f)
                curveTo(8.244f, 15.14f, 7.701f, 15.0f, 7.003f, 15.0f)
            }
        }
            .build()
        return _mountainLakeSunSmall!!
    }

private var _mountainLakeSunSmall: ImageVector? = null
