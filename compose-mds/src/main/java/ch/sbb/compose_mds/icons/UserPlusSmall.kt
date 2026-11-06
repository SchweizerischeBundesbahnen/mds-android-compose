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
                moveTo(8.5f, 9.0f)
                curveToRelative(0.0f, -1.732f, 1.189f, -3.0f, 2.5f, -3.0f)
                reflectiveCurveToRelative(2.5f, 1.268f, 2.5f, 3.0f)
                reflectiveCurveToRelative(-1.189f, 3.0f, -2.5f, 3.0f)
                reflectiveCurveToRelative(-2.5f, -1.268f, -2.5f, -3.0f)
                moveTo(11.0f, 5.0f)
                curveTo(8.997f, 5.0f, 7.5f, 6.866f, 7.5f, 9.0f)
                curveToRelative(0.0f, 0.93f, 0.284f, 1.808f, 0.77f, 2.503f)
                curveTo(5.473f, 12.903f, 4.0f, 16.367f, 4.0f, 19.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(5.013f)
                curveToRelative(0.153f, -2.864f, 1.606f, -5.71f, 3.97f, -6.726f)
                arcTo(3.18f, 3.18f, 0.0f, false, false, 11.0f, 13.0f)
                curveToRelative(0.764f, 0.0f, 1.455f, -0.271f, 2.017f, -0.726f)
                curveToRelative(1.586f, 0.671f, 2.862f, 2.142f, 3.514f, 3.9f)
                lineToRelative(0.938f, -0.348f)
                curveToRelative(-0.687f, -1.85f, -2.011f, -3.476f, -3.737f, -4.324f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 14.5f, 9.0f)
                curveToRelative(0.0f, -2.134f, -1.497f, -4.0f, -3.5f, -4.0f)
                moveToRelative(7.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _userPlusSmall!!
    }

private var _userPlusSmall: ImageVector? = null
