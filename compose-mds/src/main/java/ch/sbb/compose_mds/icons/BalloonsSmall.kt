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

public val SBBIcons.BalloonsSmall: ImageVector
    get() {
        if (_balloonsSmall != null) {
            return _balloonsSmall!!
        }
        _balloonsSmall = Builder(name = "BalloonsSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 9.0f)
                curveToRelative(0.0f, -1.694f, 0.529f, -3.21f, 1.36f, -4.291f)
                reflectiveCurveTo(14.308f, 3.0f, 15.5f, 3.0f)
                reflectiveCurveToRelative(2.308f, 0.628f, 3.14f, 1.709f)
                curveTo(19.47f, 5.79f, 20.0f, 7.306f, 20.0f, 9.0f)
                reflectiveCurveToRelative(-0.529f, 3.21f, -1.36f, 4.291f)
                reflectiveCurveTo(16.692f, 15.0f, 15.5f, 15.0f)
                reflectiveCurveToRelative(-2.308f, -0.628f, -3.14f, -1.709f)
                curveTo(11.53f, 12.21f, 11.0f, 10.694f, 11.0f, 9.0f)
                moveToRelative(4.5f, -7.0f)
                curveToRelative(-1.568f, 0.0f, -2.954f, 0.827f, -3.932f, 2.099f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.482f, 0.717f)
                arcTo(4.7f, 4.7f, 0.0f, false, false, 8.507f, 4.0f)
                horizontalLineTo(8.5f)
                curveToRelative(-1.567f, 0.0f, -2.953f, 0.827f, -3.931f, 2.099f)
                curveTo(3.59f, 7.369f, 3.0f, 9.104f, 3.0f, 11.0f)
                reflectiveCurveToRelative(0.59f, 3.63f, 1.569f, 4.901f)
                curveToRelative(0.873f, 1.135f, 2.07f, 1.916f, 3.431f, 2.07f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.05f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, 3.936f, -2.752f)
                arcToRelative(4.64f, 4.64f, 0.0f, false, false, 2.064f, 0.774f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.028f)
                curveToRelative(1.362f, -0.155f, 2.56f, -0.936f, 3.432f, -2.071f)
                curveTo(20.41f, 12.631f, 21.0f, 10.896f, 21.0f, 9.0f)
                reflectiveCurveToRelative(-0.59f, -3.63f, -1.568f, -4.901f)
                curveTo(18.454f, 2.827f, 17.068f, 2.0f, 15.5f, 2.0f)
                moveToRelative(-3.355f, 12.552f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 8.485f, 17.0f)
                curveToRelative(-1.187f, -0.005f, -2.295f, -0.632f, -3.124f, -1.709f)
                curveTo(4.53f, 14.21f, 4.0f, 12.694f, 4.0f, 11.0f)
                reflectiveCurveToRelative(0.53f, -3.21f, 1.361f, -4.291f)
                curveTo(6.192f, 5.629f, 7.305f, 5.0f, 8.497f, 5.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 2.14f, 0.723f)
                arcTo(8.6f, 8.6f, 0.0f, false, false, 10.0f, 9.0f)
                curveToRelative(0.0f, 1.896f, 0.59f, 3.63f, 1.568f, 4.901f)
                quadToRelative(0.27f, 0.35f, 0.577f, 0.651f)
                moveToRelative(-0.06f, -6.628f)
                curveToRelative(0.285f, -1.85f, 1.31f, -3.466f, 2.79f, -3.848f)
                lineToRelative(0.25f, 0.968f)
                curveToRelative(-0.92f, 0.238f, -1.795f, 1.363f, -2.05f, 3.032f)
                close()
                moveTo(7.88f, 6.094f)
                curveToRelative(-1.483f, 0.372f, -2.51f, 1.979f, -2.793f, 3.83f)
                lineToRelative(0.988f, 0.152f)
                curveToRelative(0.256f, -1.669f, 1.13f, -2.782f, 2.047f, -3.01f)
                close()
            }
        }
        .build()
        return _balloonsSmall!!
    }

private var _balloonsSmall: ImageVector? = null
