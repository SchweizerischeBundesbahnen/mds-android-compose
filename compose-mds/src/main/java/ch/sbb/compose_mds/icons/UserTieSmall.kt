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
                moveTo(12.0f, 6.0f)
                curveToRelative(-1.311f, 0.0f, -2.5f, 1.268f, -2.5f, 3.0f)
                reflectiveCurveToRelative(1.189f, 3.0f, 2.5f, 3.0f)
                reflectiveCurveToRelative(2.5f, -1.268f, 2.5f, -3.0f)
                reflectiveCurveToRelative(-1.189f, -3.0f, -2.5f, -3.0f)
                moveTo(8.5f, 9.0f)
                curveToRelative(0.0f, -2.134f, 1.497f, -4.0f, 3.5f, -4.0f)
                reflectiveCurveToRelative(3.5f, 1.866f, 3.5f, 4.0f)
                curveToRelative(0.0f, 0.93f, -0.284f, 1.807f, -0.77f, 2.503f)
                curveTo(17.525f, 12.894f, 19.0f, 16.35f, 19.0f, 19.5f)
                verticalLineToRelative(0.5f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.133f, 1.473f, -6.598f, 4.27f, -7.997f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 8.5f, 9.0f)
                moveToRelative(3.685f, 3.995f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.371f, 0.0f)
                lineToRelative(0.186f, 0.223f)
                close()
                moveTo(9.932f, 12.297f)
                curveTo(7.598f, 13.332f, 6.165f, 16.157f, 6.013f, 19.0f)
                horizontalLineToRelative(5.28f)
                lineToRelative(-0.647f, -0.646f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(0.069f, -0.275f)
                lineToRelative(0.938f, -3.754f)
                close()
                moveTo(12.707f, 19.0f)
                horizontalLineToRelative(5.28f)
                curveToRelative(-0.151f, -2.86f, -1.588f, -5.677f, -3.922f, -6.704f)
                lineToRelative(-1.518f, 1.829f)
                lineToRelative(0.938f, 3.754f)
                lineToRelative(0.069f, 0.275f)
                lineToRelative(-0.2f, 0.2f)
                close()
                moveTo(12.447f, 17.847f)
                lineTo(12.0f, 16.062f)
                lineToRelative(-0.446f, 1.785f)
                lineToRelative(0.446f, 0.446f)
                close()
            }
        }
        .build()
        return _userTieSmall!!
    }

private var _userTieSmall: ImageVector? = null
