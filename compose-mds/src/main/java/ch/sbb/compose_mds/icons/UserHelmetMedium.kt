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

public val SBBIcons.UserHelmetMedium: ImageVector
    get() {
        if (_userHelmetMedium != null) {
            return _userHelmetMedium!!
        }
        _userHelmetMedium = Builder(name = "UserHelmetMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.5f, 7.139f)
                curveToRelative(1.0f, 0.94f, 1.625f, 2.277f, 1.625f, 3.762f)
                verticalLineToRelative(1.349f)
                horizontalLineToRelative(-10.25f)
                verticalLineToRelative(-1.349f)
                curveToRelative(0.0f, -1.485f, 0.625f, -2.823f, 1.625f, -3.763f)
                lineTo(14.5f, 10.5f)
                horizontalLineToRelative(1.0f)
                lineTo(15.5f, 6.404f)
                arcTo(5.1f, 5.1f, 0.0f, false, true, 18.0f, 5.75f)
                curveToRelative(0.908f, 0.0f, 1.76f, 0.237f, 2.5f, 0.654f)
                lineTo(20.5f, 10.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(11.875f, 12.25f)
                verticalLineToRelative(-1.349f)
                curveToRelative(0.0f, -3.395f, 2.74f, -6.151f, 6.125f, -6.151f)
                reflectiveCurveToRelative(6.125f, 2.756f, 6.125f, 6.151f)
                verticalLineToRelative(1.349f)
                horizontalLineToRelative(1.352f)
                verticalLineToRelative(1.0f)
                lineTo(23.0f, 13.25f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 1.46f, -0.481f, 2.82f, -1.285f, 3.85f)
                curveToRelative(4.25f, 1.939f, 6.535f, 7.127f, 6.535f, 11.9f)
                verticalLineToRelative(0.5f)
                lineTo(7.75f, 29.75f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.747f, 2.281f, -9.95f, 6.535f, -11.9f)
                curveTo(13.48f, 16.318f, 13.0f, 14.96f, 13.0f, 13.5f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-2.523f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.0f, 13.5f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 2.698f, 1.86f, 4.75f, 4.0f, 4.75f)
                reflectiveCurveToRelative(4.0f, -2.052f, 4.0f, -4.75f)
                moveToRelative(-1.02f, 4.622f)
                curveToRelative(-0.824f, 0.705f, -1.85f, 1.128f, -2.98f, 1.128f)
                reflectiveCurveToRelative(-2.156f, -0.423f, -2.98f, -1.128f)
                curveToRelative(-3.824f, 1.55f, -6.102f, 6.131f, -6.26f, 10.628f)
                lineTo(27.24f, 28.75f)
                curveToRelative(-0.157f, -4.522f, -2.44f, -9.088f, -6.262f, -10.628f)
            }
        }
        .build()
        return _userHelmetMedium!!
    }

private var _userHelmetMedium: ImageVector? = null
