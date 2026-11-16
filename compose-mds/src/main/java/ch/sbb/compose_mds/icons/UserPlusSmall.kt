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

public val SBBIcons.UserPlusSmall: ImageVector
    get() {
        if (_userPlusSmall != null) {
            return _userPlusSmall!!
        }
        _userPlusSmall = Builder(name = "UserPlusSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 6.0f)
                curveToRelative(1.311f, 0.0f, 2.5f, 1.268f, 2.5f, 3.0f)
                reflectiveCurveToRelative(-1.189f, 3.0f, -2.5f, 3.0f)
                reflectiveCurveToRelative(-2.5f, -1.268f, -2.5f, -3.0f)
                reflectiveCurveTo(9.689f, 6.0f, 11.0f, 6.0f)
                moveToRelative(2.732f, 5.502f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 14.5f, 9.0f)
                curveToRelative(0.0f, -2.134f, -1.497f, -4.0f, -3.5f, -4.0f)
                reflectiveCurveTo(7.5f, 6.866f, 7.5f, 9.0f)
                curveToRelative(0.0f, 0.93f, 0.284f, 1.807f, 0.77f, 2.503f)
                curveTo(5.472f, 12.902f, 4.0f, 16.367f, 4.0f, 19.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(5.015f)
                curveToRelative(0.152f, -2.864f, 1.605f, -5.709f, 3.969f, -6.726f)
                arcTo(3.18f, 3.18f, 0.0f, false, false, 11.0f, 13.0f)
                curveToRelative(0.764f, 0.0f, 1.455f, -0.271f, 2.017f, -0.726f)
                curveToRelative(1.586f, 0.67f, 2.862f, 2.141f, 3.514f, 3.9f)
                lineToRelative(0.938f, -0.348f)
                curveToRelative(-0.687f, -1.85f, -2.011f, -3.475f, -3.738f, -4.324f)
                moveTo(18.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _userPlusSmall!!
    }

private var _userPlusSmall: ImageVector? = null
