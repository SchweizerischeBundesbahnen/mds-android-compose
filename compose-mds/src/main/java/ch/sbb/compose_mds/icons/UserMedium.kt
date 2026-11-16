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

public val SBBIcons.UserMedium: ImageVector
    get() {
        if (_userMedium != null) {
            return _userMedium!!
        }
        _userMedium = Builder(name = "UserMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 8.75f)
                curveToRelative(2.14f, 0.0f, 4.0f, 2.051f, 4.0f, 4.75f)
                reflectiveCurveToRelative(-1.86f, 4.75f, -4.0f, 4.75f)
                reflectiveCurveToRelative(-4.0f, -2.052f, -4.0f, -4.75f)
                reflectiveCurveToRelative(1.86f, -4.75f, 4.0f, -4.75f)
                moveToRelative(3.715f, 8.6f)
                curveTo(22.519f, 16.32f, 23.0f, 14.96f, 23.0f, 13.5f)
                curveToRelative(0.0f, -3.1f, -2.169f, -5.75f, -5.0f, -5.75f)
                reflectiveCurveToRelative(-5.0f, 2.65f, -5.0f, 5.75f)
                curveToRelative(0.0f, 1.46f, 0.48f, 2.819f, 1.285f, 3.85f)
                curveToRelative(-4.254f, 1.95f, -6.535f, 7.153f, -6.535f, 11.9f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.773f, -2.284f, -9.961f, -6.535f, -11.9f)
                moveToRelative(-0.736f, 0.772f)
                curveToRelative(-0.823f, 0.705f, -1.848f, 1.128f, -2.979f, 1.128f)
                curveToRelative(-1.13f, 0.0f, -2.156f, -0.423f, -2.98f, -1.128f)
                curveToRelative(-3.824f, 1.55f, -6.102f, 6.131f, -6.26f, 10.628f)
                horizontalLineTo(27.24f)
                curveToRelative(-0.157f, -4.522f, -2.44f, -9.089f, -6.262f, -10.628f)
            }
        }
        .build()
        return _userMedium!!
    }

private var _userMedium: ImageVector? = null
