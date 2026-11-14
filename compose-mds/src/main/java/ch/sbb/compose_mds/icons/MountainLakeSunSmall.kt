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
        _mountainLakeSunSmall = Builder(name = "MountainLakeSunSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.5f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                moveToRelative(15.441f, 5.765f)
                lineToRelative(-4.0f, -7.5f)
                lineToRelative(-0.317f, -0.596f)
                lineToRelative(-0.477f, 0.477f)
                lineToRelative(-5.694f, 5.693f)
                lineTo(6.8f, 9.099f)
                lineToRelative(-0.423f, -0.316f)
                lineToRelative(-3.293f, 4.94f)
                lineToRelative(0.832f, 0.554f)
                lineToRelative(2.706f, -4.06f)
                lineTo(10.2f, 12.9f)
                lineToRelative(0.347f, 0.26f)
                lineToRelative(0.306f, -0.306f)
                lineToRelative(5.523f, -5.524f)
                lineToRelative(3.683f, 6.905f)
                close()
                moveTo(17.005f, 19.0f)
                curveToRelative(0.697f, 0.0f, 1.24f, 0.141f, 1.7f, 0.362f)
                curveToRelative(0.445f, 0.215f, 0.798f, 0.498f, 1.104f, 0.742f)
                lineToRelative(0.006f, 0.005f)
                curveToRelative(0.318f, 0.254f, 0.587f, 0.47f, 0.918f, 0.628f)
                curveToRelative(0.321f, 0.154f, 0.715f, 0.263f, 1.267f, 0.263f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.697f, 0.0f, -1.24f, -0.141f, -1.7f, -0.362f)
                curveToRelative(-0.443f, -0.214f, -0.794f, -0.495f, -1.099f, -0.739f)
                lineToRelative(-0.01f, -0.008f)
                curveToRelative(-0.318f, -0.254f, -0.588f, -0.47f, -0.92f, -0.628f)
                curveToRelative(-0.32f, -0.154f, -0.714f, -0.263f, -1.266f, -0.263f)
                reflectiveCurveToRelative(-0.947f, 0.11f, -1.268f, 0.264f)
                curveToRelative(-0.331f, 0.159f, -0.602f, 0.373f, -0.92f, 0.627f)
                lineToRelative(-0.016f, 0.013f)
                curveToRelative(-0.304f, 0.243f, -0.654f, 0.523f, -1.095f, 0.735f)
                curveToRelative(-0.46f, 0.22f, -1.003f, 0.361f, -1.7f, 0.361f)
                reflectiveCurveToRelative(-1.242f, -0.14f, -1.702f, -0.361f)
                curveToRelative(-0.44f, -0.211f, -0.789f, -0.49f, -1.092f, -0.733f)
                lineToRelative(-0.02f, -0.015f)
                curveToRelative(-0.317f, -0.254f, -0.589f, -0.468f, -0.92f, -0.627f)
                curveTo(7.95f, 20.11f, 7.555f, 20.0f, 7.001f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -0.947f, 0.11f, -1.269f, 0.264f)
                curveToRelative(-0.331f, 0.159f, -0.602f, 0.373f, -0.92f, 0.627f)
                lineToRelative(-0.015f, 0.012f)
                curveToRelative(-0.304f, 0.243f, -0.655f, 0.524f, -1.097f, 0.736f)
                curveToRelative(-0.46f, 0.22f, -1.003f, 0.361f, -1.701f, 0.361f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.553f, 0.0f, 0.947f, -0.11f, 1.269f, -0.264f)
                curveToRelative(0.331f, -0.159f, 0.603f, -0.373f, 0.92f, -0.627f)
                lineToRelative(0.016f, -0.012f)
                curveToRelative(0.304f, -0.243f, 0.655f, -0.524f, 1.097f, -0.736f)
                curveToRelative(0.46f, -0.22f, 1.003f, -0.361f, 1.7f, -0.361f)
                curveToRelative(0.699f, 0.0f, 1.242f, 0.14f, 1.702f, 0.361f)
                curveToRelative(0.442f, 0.212f, 0.793f, 0.493f, 1.097f, 0.736f)
                lineToRelative(0.015f, 0.012f)
                curveToRelative(0.318f, 0.254f, 0.589f, 0.468f, 0.92f, 0.627f)
                curveToRelative(0.322f, 0.154f, 0.717f, 0.264f, 1.27f, 0.264f)
                curveToRelative(0.552f, 0.0f, 0.947f, -0.11f, 1.267f, -0.264f)
                curveToRelative(0.332f, -0.159f, 0.603f, -0.373f, 0.92f, -0.627f)
                lineToRelative(0.017f, -0.013f)
                curveToRelative(0.303f, -0.243f, 0.653f, -0.523f, 1.095f, -0.735f)
                curveToRelative(0.46f, -0.22f, 1.003f, -0.361f, 1.7f, -0.361f)
                moveToRelative(1.7f, -3.638f)
                curveToRelative(-0.46f, -0.22f, -1.003f, -0.362f, -1.7f, -0.362f)
                reflectiveCurveToRelative(-1.24f, 0.14f, -1.7f, 0.361f)
                curveToRelative(-0.442f, 0.212f, -0.792f, 0.492f, -1.095f, 0.735f)
                lineToRelative(-0.017f, 0.013f)
                curveToRelative(-0.317f, 0.254f, -0.588f, 0.468f, -0.92f, 0.627f)
                curveToRelative(-0.32f, 0.154f, -0.715f, 0.264f, -1.267f, 0.264f)
                curveToRelative(-0.553f, 0.0f, -0.948f, -0.11f, -1.27f, -0.264f)
                curveToRelative(-0.331f, -0.159f, -0.602f, -0.373f, -0.92f, -0.627f)
                lineToRelative(-0.015f, -0.012f)
                curveToRelative(-0.304f, -0.243f, -0.655f, -0.524f, -1.097f, -0.736f)
                curveToRelative(-0.46f, -0.22f, -1.003f, -0.361f, -1.701f, -0.361f)
                reflectiveCurveToRelative(-1.24f, 0.14f, -1.701f, 0.361f)
                curveToRelative(-0.442f, 0.212f, -0.793f, 0.493f, -1.097f, 0.736f)
                lineToRelative(-0.016f, 0.012f)
                curveToRelative(-0.317f, 0.254f, -0.589f, 0.468f, -0.92f, 0.627f)
                curveTo(2.947f, 16.89f, 2.553f, 17.0f, 2.0f, 17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.698f, 0.0f, 1.24f, -0.14f, 1.701f, -0.361f)
                curveToRelative(0.442f, -0.212f, 0.793f, -0.493f, 1.097f, -0.736f)
                lineToRelative(0.015f, -0.012f)
                curveToRelative(0.318f, -0.254f, 0.589f, -0.468f, 0.92f, -0.627f)
                curveToRelative(0.322f, -0.154f, 0.717f, -0.264f, 1.27f, -0.264f)
                reflectiveCurveToRelative(0.947f, 0.11f, 1.268f, 0.264f)
                curveToRelative(0.332f, 0.159f, 0.604f, 0.373f, 0.921f, 0.627f)
                lineToRelative(0.02f, 0.015f)
                curveToRelative(0.303f, 0.243f, 0.652f, 0.522f, 1.092f, 0.733f)
                curveToRelative(0.46f, 0.22f, 1.004f, 0.361f, 1.702f, 0.361f)
                curveToRelative(0.697f, 0.0f, 1.24f, -0.14f, 1.7f, -0.361f)
                curveToRelative(0.441f, -0.212f, 0.791f, -0.492f, 1.095f, -0.735f)
                lineToRelative(0.016f, -0.013f)
                curveToRelative(0.318f, -0.254f, 0.589f, -0.468f, 0.92f, -0.627f)
                curveToRelative(0.321f, -0.154f, 0.716f, -0.264f, 1.268f, -0.264f)
                reflectiveCurveToRelative(0.946f, 0.109f, 1.267f, 0.263f)
                curveToRelative(0.33f, 0.159f, 0.601f, 0.374f, 0.918f, 0.628f)
                lineToRelative(0.011f, 0.008f)
                curveToRelative(0.305f, 0.244f, 0.656f, 0.525f, 1.1f, 0.739f)
                curveToRelative(0.46f, 0.22f, 1.002f, 0.362f, 1.699f, 0.362f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -0.946f, -0.109f, -1.267f, -0.263f)
                curveToRelative(-0.33f, -0.159f, -0.6f, -0.374f, -0.918f, -0.628f)
                lineToRelative(-0.006f, -0.005f)
                curveToRelative(-0.306f, -0.244f, -0.659f, -0.527f, -1.105f, -0.742f)
            }
        }
        .build()
        return _mountainLakeSunSmall!!
    }

private var _mountainLakeSunSmall: ImageVector? = null
