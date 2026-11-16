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

public val SBBIcons.UserPlusMedium: ImageVector
    get() {
        if (_userPlusMedium != null) {
            return _userPlusMedium!!
        }
        _userPlusMedium = Builder(name = "UserPlusMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 8.75f)
                curveToRelative(2.14f, 0.0f, 4.0f, 2.052f, 4.0f, 4.75f)
                reflectiveCurveToRelative(-1.86f, 4.75f, -4.0f, 4.75f)
                reflectiveCurveToRelative(-4.0f, -2.051f, -4.0f, -4.75f)
                reflectiveCurveToRelative(1.86f, -4.75f, 4.0f, -4.75f)
                moveToRelative(3.716f, 8.599f)
                curveToRelative(0.804f, -1.03f, 1.284f, -2.39f, 1.284f, -3.849f)
                curveToRelative(0.0f, -3.1f, -2.169f, -5.75f, -5.0f, -5.75f)
                reflectiveCurveToRelative(-5.0f, 2.65f, -5.0f, 5.75f)
                curveToRelative(0.0f, 1.46f, 0.48f, 2.82f, 1.284f, 3.85f)
                curveToRelative(-4.253f, 1.95f, -6.534f, 7.153f, -6.534f, 11.9f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.26f)
                curveToRelative(0.158f, -4.497f, 2.436f, -9.077f, 6.26f, -10.628f)
                curveToRelative(0.824f, 0.706f, 1.849f, 1.128f, 2.98f, 1.128f)
                reflectiveCurveToRelative(2.157f, -0.423f, 2.98f, -1.128f)
                curveToRelative(2.52f, 1.01f, 4.534f, 3.311f, 5.551f, 6.052f)
                lineToRelative(0.938f, -0.349f)
                curveToRelative(-1.048f, -2.823f, -3.099f, -5.276f, -5.753f, -6.476f)
                moveToRelative(7.034f, 15.65f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineTo(25.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.25f)
                close()
            }
        }
        .build()
        return _userPlusMedium!!
    }

private var _userPlusMedium: ImageVector? = null
