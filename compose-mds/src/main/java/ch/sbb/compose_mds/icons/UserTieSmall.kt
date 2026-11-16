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

public val SBBIcons.UserTieSmall: ImageVector
    get() {
        if (_userTieSmall != null) {
            return _userTieSmall!!
        }
        _userTieSmall = Builder(name = "UserTieSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.5f, 9.0f)
                curveToRelative(0.0f, -1.732f, -1.189f, -3.0f, -2.5f, -3.0f)
                reflectiveCurveTo(9.5f, 7.268f, 9.5f, 9.0f)
                reflectiveCurveToRelative(1.189f, 3.0f, 2.5f, 3.0f)
                reflectiveCurveToRelative(2.5f, -1.268f, 2.5f, -3.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.93f, -0.284f, 1.808f, -0.77f, 2.503f)
                curveTo(17.525f, 12.894f, 19.0f, 16.35f, 19.0f, 19.5f)
                verticalLineToRelative(0.5f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.133f, 1.473f, -6.598f, 4.27f, -7.997f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 8.5f, 9.0f)
                curveToRelative(0.0f, -2.134f, 1.497f, -4.0f, 3.5f, -4.0f)
                reflectiveCurveToRelative(3.5f, 1.866f, 3.5f, 4.0f)
                moveToRelative(-3.316f, 3.995f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.37f, 0.0f)
                lineToRelative(0.185f, 0.222f)
                close()
                moveTo(9.932f, 12.297f)
                curveTo(7.6f, 13.333f, 6.166f, 16.157f, 6.015f, 19.0f)
                horizontalLineToRelative(5.278f)
                lineToRelative(-0.847f, -0.847f)
                lineToRelative(0.069f, -0.274f)
                lineToRelative(0.937f, -3.754f)
                close()
                moveTo(12.707f, 19.0f)
                horizontalLineToRelative(5.278f)
                curveToRelative(-0.15f, -2.86f, -1.586f, -5.677f, -3.92f, -6.704f)
                lineToRelative(-1.52f, 1.828f)
                lineToRelative(0.94f, 3.755f)
                lineToRelative(0.069f, 0.274f)
                close()
                moveTo(12.0f, 18.293f)
                lineToRelative(-0.446f, -0.446f)
                lineToRelative(0.446f, -1.785f)
                lineToRelative(0.445f, 1.785f)
                close()
            }
        }
        .build()
        return _userTieSmall!!
    }

private var _userTieSmall: ImageVector? = null
