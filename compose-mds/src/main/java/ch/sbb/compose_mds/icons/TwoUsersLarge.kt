package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.TwoUsersLarge: ImageVector
    get() {
        if (_twoUsersLarge != null) {
            return _twoUsersLarge!!
        }
        _twoUsersLarge = Builder(name = "TwoUsersLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.5f, 7.0f)
                curveToRelative(3.753f, 0.0f, 6.5f, 3.507f, 6.5f, 7.5f)
                curveToRelative(0.0f, 2.027f, -0.71f, 3.928f, -1.898f, 5.31f)
                curveTo(37.735f, 22.355f, 41.0f, 29.024f, 41.0f, 35.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-6.763f)
                curveToRelative(0.501f, 1.787f, 0.763f, 3.655f, 0.763f, 5.499f)
                verticalLineToRelative(0.5f)
                lineTo(8.0f, 41.999f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -6.47f, 3.15f, -13.274f, 8.792f, -15.828f)
                curveTo(15.676f, 24.314f, 15.0f, 22.483f, 15.0f, 20.5f)
                curveToRelative(0.0f, -3.885f, 2.592f, -7.19f, 6.015f, -7.478f)
                curveToRelative(0.1f, -1.8f, 0.774f, -3.27f, 1.865f, -4.31f)
                curveTo(24.062f, 7.587f, 25.693f, 7.0f, 27.5f, 7.0f)
                moveTo(17.405f, 26.495f)
                curveTo(12.258f, 28.702f, 9.168f, 34.851f, 9.008f, 41.0f)
                horizontalLineToRelative(24.984f)
                curveToRelative(-0.162f, -6.167f, -3.315f, -12.306f, -8.504f, -14.487f)
                lineToRelative(-3.574f, 5.27f)
                lineToRelative(-0.408f, 0.6f)
                lineToRelative(-0.416f, -0.596f)
                close()
                moveTo(31.335f, 20.569f)
                curveToRelative(-0.966f, 0.816f, -2.146f, 1.336f, -3.464f, 1.418f)
                curveToRelative(-0.25f, 1.423f, -0.85f, 2.711f, -1.7f, 3.728f)
                curveTo(29.9f, 27.4f, 32.556f, 30.93f, 33.929f, 35.0f)
                horizontalLineToRelative(6.063f)
                curveToRelative(-0.167f, -6.187f, -3.416f, -12.278f, -8.657f, -14.43f)
                moveToRelative(-9.84f, 10.048f)
                lineToRelative(2.026f, -2.986f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, true, -4.13f, -0.034f)
                close()
                moveTo(21.5f, 14.0f)
                curveToRelative(-2.968f, 0.0f, -5.5f, 2.835f, -5.5f, 6.5f)
                reflectiveCurveToRelative(2.532f, 6.5f, 5.5f, 6.5f)
                reflectiveCurveToRelative(5.5f, -2.835f, 5.5f, -6.5f)
                reflectiveCurveToRelative(-2.532f, -6.5f, -5.5f, -6.5f)
                moveToRelative(6.0f, -6.0f)
                curveToRelative(-1.592f, 0.0f, -2.962f, 0.514f, -3.93f, 1.437f)
                curveToRelative(-0.876f, 0.835f, -1.455f, 2.038f, -1.553f, 3.587f)
                curveTo(25.424f, 13.33f, 28.0f, 16.627f, 28.0f, 20.5f)
                quadToRelative(0.0f, 0.238f, -0.015f, 0.473f)
                curveTo(30.803f, 20.685f, 33.0f, 17.913f, 33.0f, 14.5f)
                curveToRelative(0.0f, -3.607f, -2.453f, -6.5f, -5.5f, -6.5f)
            }
        }
        .build()
        return _twoUsersLarge!!
    }

private var _twoUsersLarge: ImageVector? = null
