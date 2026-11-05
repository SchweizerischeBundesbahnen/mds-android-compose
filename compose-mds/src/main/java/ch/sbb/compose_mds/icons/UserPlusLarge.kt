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

public val SBBIcons.UserPlusLarge: ImageVector
    get() {
        if (_userPlusLarge != null) {
            return _userPlusLarge!!
        }
        _userPlusLarge = Builder(
            name = "UserPlusLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(37.0f, 38.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(21.5f, 10.0f)
                curveToRelative(3.66f, 0.0f, 6.5f, 3.433f, 6.5f, 7.5f)
                curveToRelative(0.0f, 1.995f, -0.686f, 3.837f, -1.814f, 5.196f)
                curveToRelative(3.587f, 1.544f, 6.372f, 4.828f, 7.783f, 8.63f)
                lineToRelative(-0.469f, 0.174f)
                lineToRelative(-0.469f, 0.174f)
                curveToRelative(-1.382f, -3.724f, -4.135f, -6.858f, -7.592f, -8.204f)
                curveToRelative(-1.085f, 0.956f, -2.443f, 1.53f, -3.939f, 1.53f)
                reflectiveCurveToRelative(-2.853f, -0.573f, -3.936f, -1.528f)
                curveTo(12.272f, 25.554f, 9.169f, 31.874f, 9.008f, 38.0f)
                horizontalLineTo(28.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -6.366f, 3.096f, -13.312f, 8.814f, -15.805f)
                curveToRelative(-1.13f, -1.36f, -1.814f, -3.2f, -1.814f, -5.196f)
                curveToRelative(0.0f, -4.067f, 2.84f, -7.5f, 6.5f, -7.5f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-2.968f, 0.0f, -5.5f, 2.835f, -5.5f, 6.5f)
                reflectiveCurveToRelative(2.532f, 6.5f, 5.5f, 6.5f)
                reflectiveCurveToRelative(5.5f, -2.835f, 5.5f, -6.5f)
                reflectiveCurveToRelative(-2.532f, -6.5f, -5.5f, -6.5f)
            }
        }
            .build()
        return _userPlusLarge!!
    }

private var _userPlusLarge: ImageVector? = null
