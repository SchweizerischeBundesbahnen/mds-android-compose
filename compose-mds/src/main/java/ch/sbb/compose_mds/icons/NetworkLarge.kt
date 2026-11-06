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

public val SBBIcons.NetworkLarge: ImageVector
    get() {
        if (_networkLarge != null) {
            return _networkLarge!!
        }
        _networkLarge = Builder(name = "NetworkLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 8.0f)
                curveToRelative(0.0f, -1.424f, 1.076f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.076f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.076f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(9.5f, 9.424f, 9.5f, 8.0f)
                moveTo(12.0f, 4.5f)
                curveToRelative(-1.976f, 0.0f, -3.5f, 1.524f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.524f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.68f, 0.0f, 1.308f, -0.18f, 1.837f, -0.498f)
                lineToRelative(5.293f, 7.27f)
                curveTo(17.515f, 19.64f, 16.5f, 21.685f, 16.5f, 24.0f)
                curveToRelative(0.0f, 1.928f, 0.704f, 3.672f, 1.873f, 4.992f)
                lineToRelative(-4.566f, 4.454f)
                arcTo(4.54f, 4.54f, 0.0f, false, false, 11.0f, 32.5f)
                curveToRelative(-2.534f, 0.0f, -4.5f, 1.961f, -4.5f, 4.496f)
                reflectiveCurveTo(8.465f, 41.5f, 11.0f, 41.5f)
                curveToRelative(2.534f, 0.0f, 4.512f, -1.967f, 4.512f, -4.504f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -0.99f, -2.85f)
                lineToRelative(4.563f, -4.451f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 24.0f, 31.5f)
                curveToRelative(2.864f, 0.0f, 5.322f, -1.553f, 6.588f, -3.875f)
                lineToRelative(4.14f, 1.916f)
                arcTo(4.7f, 4.7f, 0.0f, false, false, 34.5f, 31.0f)
                curveToRelative(0.0f, 2.547f, 1.953f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -1.953f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-1.953f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-1.668f, 0.0f, -3.081f, 0.837f, -3.858f, 2.13f)
                lineToRelative(-4.136f, -1.914f)
                curveToRelative(0.32f, -0.84f, 0.496f, -1.755f, 0.496f, -2.716f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -1.165f, -4.047f)
                lineToRelative(5.097f, -3.55f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 38.0f, 17.5f)
                curveToRelative(1.96f, 0.0f, 3.519f, -1.533f, 3.519f, -3.5f)
                arcToRelative(3.486f, 3.486f, 0.0f, false, false, -3.52f, -3.51f)
                curveToRelative(-1.965f, 0.0f, -3.5f, 1.549f, -3.5f, 3.51f)
                curveToRelative(0.0f, 0.573f, 0.131f, 1.109f, 0.365f, 1.582f)
                lineToRelative(-5.119f, 3.565f)
                curveToRelative(-1.37f, -1.62f, -3.424f, -2.638f, -5.745f, -2.638f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, false, -4.064f, 1.17f)
                lineToRelative(-5.325f, -7.314f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.5f, 8.0f)
                curveToRelative(0.0f, -1.976f, -1.524f, -3.5f, -3.5f, -3.5f)
                moveToRelative(26.0f, 6.99f)
                curveToRelative(-1.41f, 0.0f, -2.5f, 1.097f, -2.5f, 2.51f)
                curveToRelative(0.0f, 1.41f, 1.089f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.415f, 0.0f, 2.519f, -1.093f, 2.519f, -2.5f)
                arcToRelative(2.486f, 2.486f, 0.0f, false, false, -2.52f, -2.51f)
                moveToRelative(-14.0f, 6.019f)
                curveToRelative(-3.633f, 0.0f, -6.5f, 2.86f, -6.5f, 6.491f)
                curveToRelative(0.0f, 3.632f, 2.868f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.502f, -2.868f, 6.502f, -6.5f)
                curveToRelative(0.0f, -3.63f, -2.87f, -6.491f, -6.502f, -6.491f)
                moveTo(35.5f, 31.0f)
                curveToRelative(0.0f, -1.995f, 1.505f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.505f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.505f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.505f, -3.5f, -3.5f)
                moveTo(11.0f, 33.5f)
                curveToRelative(-1.983f, 0.0f, -3.5f, 1.515f, -3.5f, 3.496f)
                curveTo(7.5f, 38.98f, 9.018f, 40.5f, 11.0f, 40.5f)
                curveToRelative(1.984f, 0.0f, 3.512f, -1.522f, 3.512f, -3.504f)
                curveToRelative(0.0f, -1.98f, -1.527f, -3.496f, -3.512f, -3.496f)
            }
        }
        .build()
        return _networkLarge!!
    }

private var _networkLarge: ImageVector? = null
