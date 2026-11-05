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

public val SBBIcons.UserHelmetLarge: ImageVector
    get() {
        if (_userHelmetLarge != null) {
            return _userHelmetLarge!!
        }
        _userHelmetLarge = Builder(name = "UserHelmetLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 7.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 3.6f, 8.0f, 8.035f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(2.469f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(30.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.996f, -0.686f, 3.838f, -1.815f, 5.197f)
                curveTo(33.899f, 26.173f, 37.0f, 33.1f, 37.0f, 39.501f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -6.366f, 3.096f, -13.312f, 8.814f, -15.805f)
                curveToRelative(-1.13f, -1.36f, -1.814f, -3.2f, -1.814f, -5.196f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-4.031f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(15.5f)
                verticalLineToRelative(-1.965f)
                curveTo(15.5f, 10.6f, 19.08f, 7.0f, 23.5f, 7.0f)
                moveToRelative(-3.936f, 17.472f)
                curveToRelative(-5.292f, 2.082f, -8.395f, 8.402f, -8.556f, 14.529f)
                horizontalLineToRelative(24.984f)
                curveToRelative(-0.16f, -6.161f, -3.269f, -12.462f, -8.557f, -14.528f)
                curveTo(26.35f, 25.427f, 24.995f, 26.0f, 23.5f, 26.0f)
                reflectiveCurveToRelative(-2.853f, -0.573f, -3.936f, -1.528f)
                moveTo(18.0f, 18.5f)
                curveToRelative(0.0f, 3.665f, 2.532f, 6.5f, 5.5f, 6.5f)
                reflectiveCurveToRelative(5.5f, -2.835f, 5.5f, -6.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(23.5f, 8.0f)
                arcToRelative(6.94f, 6.94f, 0.0f, false, false, -3.5f, 0.942f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.646f)
                arcToRelative(7.03f, 7.03f, 0.0f, false, false, -2.5f, 5.39f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.965f)
                arcTo(7.03f, 7.03f, 0.0f, false, false, 28.0f, 9.646f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.942f)
                arcTo(6.94f, 6.94f, 0.0f, false, false, 23.5f, 8.0f)
            }
        }
        .build()
        return _userHelmetLarge!!
    }

private var _userHelmetLarge: ImageVector? = null
