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

public val SBBIcons.BellDisabledLarge: ImageVector
    get() {
        if (_bellDisabledLarge != null) {
            return _bellDisabledLarge!!
        }
        _bellDisabledLarge = Builder(
            name = "BellDisabledLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveToRelative(33.293f, 33.0f)
                lineToRelative(5.0f, 5.0f)
                lineTo(34.68f, 38.0f)
                lineToRelative(-23.062f, -5.0f)
                close()
                moveTo(11.613f, 33.0f)
                horizontalLineToRelative(0.005f)
                lineToRelative(-4.613f, -1.0f)
                curveToRelative(1.306f, -0.002f, 2.542f, -0.771f, 3.473f, -2.126f)
                curveTo(11.408f, 28.52f, 12.0f, 26.622f, 12.0f, 24.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.394f, 0.302f, -2.734f, 0.84f, -3.953f)
                lineTo(2.646f, 2.354f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(43.0f, 43.0f)
                lineToRelative(-0.707f, 0.708f)
                lineTo(39.293f, 39.0f)
                lineToRelative(-4.613f, -1.0f)
                close()
                moveTo(11.613f, 33.0f)
                lineTo(7.0f, 33.0f)
                curveToRelative(-0.124f, 0.0f, -0.37f, 0.113f, -0.614f, 0.601f)
                curveToRelative(-0.23f, 0.46f, -0.386f, 1.13f, -0.386f, 1.899f)
                reflectiveCurveToRelative(0.156f, 1.44f, 0.386f, 1.899f)
                curveToRelative(0.244f, 0.488f, 0.49f, 0.601f, 0.614f, 0.601f)
                horizontalLineToRelative(27.68f)
                lineToRelative(4.613f, 1.0f)
                lineTo(28.978f, 39.0f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, true, -5.478f, 5.0f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, true, -5.477f, -5.0f)
                lineTo(7.0f, 39.0f)
                curveToRelative(-0.706f, 0.0f, -1.21f, -0.557f, -1.508f, -1.154f)
                curveTo(5.179f, 37.22f, 5.0f, 36.391f, 5.0f, 35.5f)
                curveToRelative(0.0f, -0.89f, 0.179f, -1.72f, 0.492f, -2.346f)
                curveTo(5.79f, 32.557f, 6.294f, 32.0f, 7.0f, 32.0f)
                close()
                moveTo(13.0f, 16.5f)
                curveToRelative(0.0f, -1.113f, 0.215f, -2.19f, 0.605f, -3.188f)
                lineToRelative(1.77f, 1.77f)
                curveTo(15.113f, 16.15f, 15.0f, 17.335f, 15.0f, 18.63f)
                lineTo(15.0f, 23.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.37f)
                curveToRelative(0.0f, -0.991f, 0.069f, -1.892f, 0.218f, -2.705f)
                lineTo(32.293f, 32.0f)
                lineTo(9.838f, 32.0f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 1.464f, -1.56f)
                curveTo(12.362f, 28.9f, 13.0f, 26.799f, 13.0f, 24.5f)
                close()
                moveTo(23.5f, 43.0f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, true, -4.472f, -4.0f)
                horizontalLineToRelative(8.945f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, true, -4.473f, 4.0f)
                moveToRelative(-6.25f, -29.924f)
                curveToRelative(0.924f, -1.552f, 2.365f, -2.59f, 4.371f, -3.09f)
                lineToRelative(-0.242f, -0.971f)
                curveToRelative(-2.234f, 0.558f, -3.913f, 1.742f, -4.989f, 3.55f)
                close()
                moveTo(15.0f, 10.923f)
                curveTo(16.902f, 8.555f, 19.997f, 7.0f, 23.5f, 7.0f)
                curveTo(29.35f, 7.0f, 34.0f, 11.3f, 34.0f, 16.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.298f, 0.639f, 4.4f, 1.698f, 5.94f)
                arcTo(6.7f, 6.7f, 0.0f, false, false, 37.162f, 32.0f)
                lineTo(37.0f, 32.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.124f, 0.0f, 0.37f, 0.113f, 0.614f, 0.601f)
                curveToRelative(0.23f, 0.46f, 0.386f, 1.13f, 0.386f, 1.899f)
                curveToRelative(0.0f, 0.575f, -0.084f, 1.097f, -0.231f, 1.513f)
                lineToRelative(0.943f, 0.334f)
                curveToRelative(0.192f, -0.544f, 0.288f, -1.182f, 0.288f, -1.847f)
                curveToRelative(0.0f, -0.89f, -0.178f, -1.72f, -0.491f, -2.346f)
                curveTo(41.21f, 32.557f, 40.706f, 32.0f, 40.0f, 32.0f)
                curveToRelative(-1.308f, 0.0f, -2.546f, -0.77f, -3.478f, -2.126f)
                curveTo(35.592f, 28.52f, 35.0f, 26.622f, 35.0f, 24.5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -4.712f, -3.38f, -8.657f, -8.0f, -10.004f)
                lineTo(27.0f, 5.5f)
                curveTo(27.0f, 3.564f, 25.436f, 2.0f, 23.5f, 2.0f)
                arcTo(3.496f, 3.496f, 0.0f, false, false, 20.0f, 5.5f)
                verticalLineToRelative(0.996f)
                curveToRelative(-2.337f, 0.681f, -4.355f, 2.028f, -5.78f, 3.8f)
                close()
                moveTo(26.0f, 5.5f)
                verticalLineToRelative(0.75f)
                arcTo(12.6f, 12.6f, 0.0f, false, false, 23.5f, 6.0f)
                quadToRelative(-1.289f, 0.002f, -2.5f, 0.25f)
                lineTo(21.0f, 5.5f)
                curveTo(21.0f, 4.116f, 22.116f, 3.0f, 23.5f, 3.0f)
                reflectiveCurveTo(26.0f, 4.116f, 26.0f, 5.5f)
            }
        }
            .build()
        return _bellDisabledLarge!!
    }

private var _bellDisabledLarge: ImageVector? = null
