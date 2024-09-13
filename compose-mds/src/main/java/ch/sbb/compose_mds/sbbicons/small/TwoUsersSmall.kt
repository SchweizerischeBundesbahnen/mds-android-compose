package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.TwoUsersSmall: ImageVector
    get() {
        if (_twoUsersSmall != null) {
            return _twoUsersSmall!!
        }
        _twoUsersSmall = Builder(name = "TwoUsersSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.208f, 4.65f)
                curveToRelative(-0.345f, 0.328f, -0.594f, 0.79f, -0.678f, 1.394f)
                curveToRelative(1.713f, 0.292f, 2.944f, 1.98f, 2.97f, 3.896f)
                curveToRelative(1.12f, -0.274f, 2.0f, -1.449f, 2.0f, -2.94f)
                curveToRelative(0.0f, -1.707f, -1.153f, -3.0f, -2.5f, -3.0f)
                curveToRelative(-0.742f, 0.0f, -1.362f, 0.239f, -1.793f, 0.65f)
                moveToRelative(-0.69f, -0.725f)
                curveToRelative(-0.553f, 0.527f, -0.902f, 1.248f, -0.994f, 2.11f)
                curveTo(8.764f, 6.305f, 7.5f, 8.039f, 7.5f, 10.0f)
                curveToRelative(0.0f, 0.924f, 0.281f, 1.799f, 0.763f, 2.493f)
                curveTo(5.5f, 13.913f, 4.0f, 17.31f, 4.0f, 20.499f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.833f, -0.104f, -1.679f, -0.306f, -2.5f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.193f, -1.556f, -6.521f, -4.309f, -7.935f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 17.5f, 7.0f)
                curveToRelative(0.0f, -2.093f, -1.447f, -4.0f, -3.5f, -4.0f)
                curveToRelative(-0.957f, 0.0f, -1.838f, 0.31f, -2.482f, 0.925f)
                moveToRelative(4.444f, 6.399f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -1.568f, 0.652f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -0.673f, 1.54f)
                curveToRelative(1.74f, 0.895f, 2.988f, 2.569f, 3.672f, 4.484f)
                horizontalLineToRelative(2.593f)
                curveToRelative(-0.158f, -2.88f, -1.672f, -5.63f, -4.024f, -6.676f)
                moveTo(11.0f, 7.0f)
                curveToRelative(-1.311f, 0.0f, -2.5f, 1.268f, -2.5f, 3.0f)
                reflectiveCurveToRelative(1.189f, 3.0f, 2.5f, 3.0f)
                reflectiveCurveToRelative(2.5f, -1.268f, 2.5f, -3.0f)
                reflectiveCurveToRelative(-1.189f, -3.0f, -2.5f, -3.0f)
                moveToRelative(-2.03f, 6.262f)
                curveTo(6.631f, 14.314f, 5.165f, 17.11f, 5.012f, 20.0f)
                horizontalLineToRelative(11.974f)
                curveToRelative(-0.155f, -2.886f, -1.638f, -5.667f, -3.98f, -6.717f)
                curveToRelative(-0.56f, 0.45f, -1.248f, 0.718f, -2.007f, 0.718f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, true, -2.03f, -0.738f)
            }
        }
        .build()
        return _twoUsersSmall!!
    }

private var _twoUsersSmall: ImageVector? = null
