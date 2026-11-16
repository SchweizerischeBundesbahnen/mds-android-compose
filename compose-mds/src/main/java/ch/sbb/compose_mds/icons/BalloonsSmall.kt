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
                moveTo(18.64f, 4.709f)
                curveTo(19.47f, 5.791f, 20.0f, 7.306f, 20.0f, 9.0f)
                reflectiveCurveToRelative(-0.529f, 3.21f, -1.36f, 4.291f)
                reflectiveCurveTo(16.693f, 15.0f, 15.5f, 15.0f)
                reflectiveCurveToRelative(-2.308f, -0.628f, -3.14f, -1.709f)
                curveTo(11.528f, 12.209f, 11.0f, 10.694f, 11.0f, 9.0f)
                reflectiveCurveToRelative(0.528f, -3.21f, 1.36f, -4.291f)
                reflectiveCurveTo(14.307f, 3.0f, 15.5f, 3.0f)
                reflectiveCurveToRelative(2.308f, 0.628f, 3.14f, 1.709f)
                moveToRelative(0.792f, 9.192f)
                curveTo(20.409f, 12.631f, 21.0f, 10.896f, 21.0f, 9.0f)
                reflectiveCurveToRelative(-0.59f, -3.63f, -1.568f, -4.901f)
                curveTo(18.454f, 2.827f, 17.068f, 2.0f, 15.5f, 2.0f)
                reflectiveCurveToRelative(-2.954f, 0.827f, -3.932f, 2.099f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.482f, 0.717f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -2.366f, -0.808f)
                lineTo(8.507f, 4.0f)
                lineTo(8.5f, 4.0f)
                curveToRelative(-1.567f, 0.0f, -2.953f, 0.827f, -3.932f, 2.099f)
                curveTo(3.591f, 7.369f, 3.0f, 9.104f, 3.0f, 11.0f)
                reflectiveCurveToRelative(0.59f, 3.63f, 1.568f, 4.901f)
                curveToRelative(0.873f, 1.135f, 2.07f, 1.916f, 3.432f, 2.07f)
                lineTo(8.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.05f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, 3.936f, -2.752f)
                arcToRelative(4.64f, 4.64f, 0.0f, false, false, 2.064f, 0.774f)
                lineTo(15.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.028f)
                curveToRelative(1.362f, -0.155f, 2.559f, -0.936f, 3.432f, -2.07f)
                moveToRelative(-7.287f, 0.651f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -3.662f, 2.447f)
                curveToRelative(-1.186f, -0.006f, -2.294f, -0.632f, -3.122f, -1.708f)
                curveTo(4.53f, 14.209f, 4.0f, 12.694f, 4.0f, 11.0f)
                reflectiveCurveToRelative(0.53f, -3.21f, 1.361f, -4.291f)
                curveTo(6.192f, 5.629f, 7.305f, 5.001f, 8.496f, 5.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 2.14f, 0.723f)
                arcTo(8.6f, 8.6f, 0.0f, false, false, 10.0f, 9.0f)
                curveToRelative(0.0f, 1.896f, 0.59f, 3.63f, 1.568f, 4.901f)
                quadToRelative(0.27f, 0.35f, 0.577f, 0.651f)
                moveToRelative(2.98f, -9.508f)
                curveToRelative(-0.92f, 0.238f, -1.795f, 1.363f, -2.05f, 3.032f)
                lineToRelative(-0.99f, -0.152f)
                curveToRelative(0.285f, -1.85f, 1.31f, -3.466f, 2.79f, -3.848f)
                close()
                moveTo(6.075f, 10.076f)
                curveToRelative(0.255f, -1.669f, 1.13f, -2.781f, 2.046f, -3.01f)
                lineToRelative(-0.242f, -0.971f)
                curveToRelative(-1.483f, 0.37f, -2.509f, 1.978f, -2.793f, 3.829f)
                close()
            }
        }
        .build()
        return _balloonsSmall!!
    }

private var _balloonsSmall: ImageVector? = null
