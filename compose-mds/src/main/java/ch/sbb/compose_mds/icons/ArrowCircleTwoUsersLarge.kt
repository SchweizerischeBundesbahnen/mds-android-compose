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

public val SBBIcons.ArrowCircleTwoUsersLarge: ImageVector
    get() {
        if (_arrowCircleTwoUsersLarge != null) {
            return _arrowCircleTwoUsersLarge!!
        }
        _arrowCircleTwoUsersLarge = Builder(name = "ArrowCircleTwoUsersLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 4.0f)
                curveTo(34.27f, 4.0f, 43.0f, 12.73f, 43.0f, 23.5f)
                reflectiveCurveTo(34.27f, 43.0f, 23.5f, 43.0f)
                curveToRelative(-8.1f, 0.0f, -15.379f, -4.95f, -18.332f, -12.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(6.255f)
                curveToRelative(2.897f, 6.47f, 9.692f, 11.0f, 17.245f, 11.0f)
                curveTo(33.717f, 42.0f, 42.0f, 33.717f, 42.0f, 23.5f)
                reflectiveCurveTo(33.717f, 5.0f, 23.5f, 5.0f)
                reflectiveCurveTo(5.0f, 13.283f, 5.0f, 23.5f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 12.73f, 12.73f, 4.0f, 23.5f, 4.0f)
                moveToRelative(3.0f, 6.0f)
                curveToRelative(2.584f, 0.0f, 4.5f, 2.573f, 4.5f, 5.5f)
                curveToRelative(0.0f, 1.644f, -0.605f, 3.176f, -1.593f, 4.203f)
                curveTo(32.726f, 21.328f, 35.0f, 25.603f, 35.0f, 30.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.403f)
                curveToRelative(0.261f, 1.108f, 0.403f, 2.285f, 0.403f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.896f, 2.274f, -9.172f, 5.592f, -10.798f)
                curveTo(18.605f, 22.675f, 18.0f, 21.143f, 18.0f, 19.5f)
                curveToRelative(0.0f, -2.8f, 1.754f, -5.275f, 4.168f, -5.484f)
                curveTo(22.683f, 11.769f, 24.366f, 10.0f, 26.5f, 10.0f)
                moveToRelative(-1.962f, 14.41f)
                arcTo(3.83f, 3.83f, 0.0f, false, true, 22.5f, 25.0f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, true, -2.04f, -0.59f)
                curveToRelative(-2.975f, 1.184f, -5.295f, 4.933f, -5.451f, 9.59f)
                horizontalLineTo(29.99f)
                curveToRelative(-0.156f, -4.658f, -2.477f, -8.407f, -5.453f, -9.59f)
                moveToRelative(4.0f, -4.0f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, true, -1.708f, 0.573f)
                curveToRelative(-0.244f, 1.061f, -0.741f, 2.01f, -1.423f, 2.72f)
                curveTo(27.65f, 24.8f, 29.413f, 27.107f, 30.322f, 30.0f)
                horizontalLineToRelative(3.67f)
                curveToRelative(-0.157f, -4.657f, -2.478f, -8.406f, -5.454f, -9.59f)
                moveTo(22.5f, 15.0f)
                curveToRelative(-1.834f, 0.0f, -3.5f, 1.905f, -3.5f, 4.5f)
                reflectiveCurveToRelative(1.666f, 4.5f, 3.5f, 4.5f)
                reflectiveCurveToRelative(3.5f, -1.905f, 3.5f, -4.5f)
                reflectiveCurveToRelative(-1.666f, -4.5f, -3.5f, -4.5f)
                moveToRelative(4.0f, -4.0f)
                curveToRelative(-1.475f, 0.0f, -2.83f, 1.22f, -3.314f, 3.063f)
                curveTo(25.417f, 14.47f, 27.0f, 16.839f, 27.0f, 19.5f)
                quadToRelative(0.0f, 0.228f, -0.018f, 0.453f)
                curveTo(28.616f, 19.654f, 30.0f, 17.865f, 30.0f, 15.5f)
                curveToRelative(0.0f, -2.595f, -1.666f, -4.5f, -3.5f, -4.5f)
            }
        }
        .build()
        return _arrowCircleTwoUsersLarge!!
    }

private var _arrowCircleTwoUsersLarge: ImageVector? = null
