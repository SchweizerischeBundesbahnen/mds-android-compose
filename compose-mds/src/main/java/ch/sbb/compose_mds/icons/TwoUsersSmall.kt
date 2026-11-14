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

public val SBBIcons.TwoUsersSmall: ImageVector
    get() {
        if (_twoUsersSmall != null) {
            return _twoUsersSmall!!
        }
        _twoUsersSmall = Builder(name = "TwoUsersSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 7.0f)
                curveToRelative(0.0f, -1.707f, -1.153f, -3.0f, -2.5f, -3.0f)
                curveToRelative(-0.742f, 0.0f, -1.362f, 0.239f, -1.792f, 0.65f)
                curveToRelative(-0.344f, 0.328f, -0.594f, 0.79f, -0.678f, 1.394f)
                curveToRelative(1.713f, 0.292f, 2.944f, 1.98f, 2.97f, 3.896f)
                curveToRelative(1.12f, -0.274f, 2.0f, -1.449f, 2.0f, -2.94f)
                moveToRelative(-4.982f, -3.074f)
                curveToRelative(-0.553f, 0.526f, -0.902f, 1.247f, -0.994f, 2.11f)
                curveTo(8.764f, 6.304f, 7.5f, 8.038f, 7.5f, 10.0f)
                curveToRelative(0.0f, 0.924f, 0.281f, 1.799f, 0.762f, 2.493f)
                curveTo(5.502f, 13.913f, 4.0f, 17.312f, 4.0f, 20.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.834f, -0.104f, -1.68f, -0.306f, -2.5f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.194f, -1.556f, -6.523f, -4.309f, -7.936f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 17.5f, 7.0f)
                curveToRelative(0.0f, -2.093f, -1.447f, -4.0f, -3.5f, -4.0f)
                curveToRelative(-0.957f, 0.0f, -1.838f, 0.31f, -2.482f, 0.926f)
                moveToRelative(4.443f, 6.398f)
                curveToRelative(-0.448f, 0.347f, -0.978f, 0.58f, -1.567f, 0.652f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -0.673f, 1.54f)
                curveToRelative(1.74f, 0.895f, 2.988f, 2.569f, 3.672f, 4.484f)
                horizontalLineToRelative(2.592f)
                curveToRelative(-0.158f, -2.88f, -1.671f, -5.63f, -4.024f, -6.676f)
                moveTo(13.5f, 10.0f)
                curveToRelative(0.0f, -1.732f, -1.189f, -3.0f, -2.5f, -3.0f)
                reflectiveCurveToRelative(-2.5f, 1.268f, -2.5f, 3.0f)
                reflectiveCurveToRelative(1.189f, 3.0f, 2.5f, 3.0f)
                reflectiveCurveToRelative(2.5f, -1.268f, 2.5f, -3.0f)
                moveToRelative(-4.53f, 3.262f)
                curveTo(6.632f, 14.314f, 5.168f, 17.11f, 5.015f, 20.0f)
                horizontalLineToRelative(11.97f)
                curveToRelative(-0.154f, -2.886f, -1.636f, -5.668f, -3.979f, -6.718f)
                curveToRelative(-0.56f, 0.45f, -1.247f, 0.718f, -2.006f, 0.718f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, true, -2.03f, -0.738f)
            }
        }
        .build()
        return _twoUsersSmall!!
    }

private var _twoUsersSmall: ImageVector? = null
