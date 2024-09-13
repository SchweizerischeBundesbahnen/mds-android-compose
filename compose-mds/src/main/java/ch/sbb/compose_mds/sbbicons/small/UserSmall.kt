package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.UserSmall: ImageVector
    get() {
        if (_userSmall != null) {
            return _userSmall!!
        }
        _userSmall = Builder(name = "UserSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 9.0f)
                curveToRelative(0.0f, -1.732f, 1.189f, -3.0f, 2.5f, -3.0f)
                reflectiveCurveToRelative(2.5f, 1.268f, 2.5f, 3.0f)
                reflectiveCurveToRelative(-1.189f, 3.0f, -2.5f, 3.0f)
                reflectiveCurveToRelative(-2.5f, -1.268f, -2.5f, -3.0f)
                moveTo(12.0f, 5.0f)
                curveTo(9.997f, 5.0f, 8.5f, 6.866f, 8.5f, 9.0f)
                curveToRelative(0.0f, 0.929f, 0.284f, 1.807f, 0.77f, 2.503f)
                curveTo(6.473f, 12.902f, 5.0f, 16.367f, 5.0f, 19.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.15f, -1.475f, -6.606f, -4.27f, -7.997f)
                curveToRelative(0.486f, -0.696f, 0.77f, -1.574f, 0.77f, -2.503f)
                curveToRelative(0.0f, -2.134f, -1.497f, -4.0f, -3.5f, -4.0f)
                moveToRelative(2.016f, 7.274f)
                arcTo(3.18f, 3.18f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, true, -2.016f, -0.726f)
                curveTo(7.619f, 13.29f, 6.166f, 16.136f, 6.014f, 19.0f)
                horizontalLineToRelative(11.973f)
                curveToRelative(-0.152f, -2.88f, -1.608f, -5.717f, -3.971f, -6.726f)
            }
        }
        .build()
        return _userSmall!!
    }

private var _userSmall: ImageVector? = null
