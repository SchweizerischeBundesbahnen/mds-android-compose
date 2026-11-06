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
                moveTo(12.5f, 13.5f)
                curveToRelative(0.0f, -2.698f, 1.86f, -4.75f, 4.0f, -4.75f)
                reflectiveCurveToRelative(4.0f, 2.052f, 4.0f, 4.75f)
                reflectiveCurveToRelative(-1.86f, 4.75f, -4.0f, 4.75f)
                reflectiveCurveToRelative(-4.0f, -2.051f, -4.0f, -4.75f)
                moveToRelative(4.0f, -5.75f)
                curveToRelative(-2.831f, 0.0f, -5.0f, 2.65f, -5.0f, 5.75f)
                curveToRelative(0.0f, 1.46f, 0.48f, 2.82f, 1.285f, 3.85f)
                curveTo(8.53f, 19.3f, 6.25f, 24.503f, 6.25f, 29.25f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.259f)
                curveToRelative(0.158f, -4.496f, 2.436f, -9.077f, 6.26f, -10.628f)
                curveToRelative(0.824f, 0.705f, 1.85f, 1.128f, 2.981f, 1.128f)
                reflectiveCurveToRelative(2.156f, -0.422f, 2.98f, -1.128f)
                curveToRelative(2.52f, 1.01f, 4.534f, 3.31f, 5.551f, 6.052f)
                lineToRelative(0.938f, -0.348f)
                curveToRelative(-1.048f, -2.824f, -3.099f, -5.277f, -5.753f, -6.477f)
                curveToRelative(0.804f, -1.03f, 1.284f, -2.39f, 1.284f, -3.849f)
                curveToRelative(0.0f, -3.1f, -2.169f, -5.75f, -5.0f, -5.75f)
                moveTo(27.25f, 25.5f)
                verticalLineToRelative(3.25f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineTo(33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineTo(25.5f)
                close()
            }
        }
        .build()
        return _userPlusMedium!!
    }

private var _userPlusMedium: ImageVector? = null
