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

public val SBBIcons.UserHelmetSmall: ImageVector
    get() {
        if (_userHelmetSmall != null) {
            return _userHelmetSmall!!
        }
        _userHelmetSmall = Builder(name = "UserHelmetSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveTo(9.65f, 3.0f, 7.75f, 4.913f, 7.75f, 7.267f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-0.766f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.5f)
                curveToRelative(0.0f, 0.93f, 0.284f, 1.807f, 0.77f, 2.503f)
                curveTo(6.473f, 12.902f, 5.0f, 16.367f, 5.0f, 19.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.15f, -1.475f, -6.606f, -4.27f, -7.997f)
                curveToRelative(0.486f, -0.696f, 0.77f, -1.574f, 0.77f, -2.503f)
                horizontalLineToRelative(1.484f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-0.734f)
                verticalLineToRelative(-0.733f)
                curveTo(16.25f, 4.913f, 14.35f, 3.0f, 12.0f, 3.0f)
                moveToRelative(3.25f, 5.0f)
                verticalLineToRelative(-0.733f)
                curveToRelative(0.0f, -0.794f, -0.282f, -1.521f, -0.75f, -2.087f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(4.368f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 12.0f, 4.0f)
                curveToRelative(-0.54f, 0.0f, -1.051f, 0.133f, -1.5f, 0.368f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(5.18f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, false, -0.75f, 2.087f)
                verticalLineTo(8.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(1.311f, 0.0f, 2.5f, -1.268f, 2.5f, -3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(0.0f, 1.732f, 1.189f, 3.0f, 2.5f, 3.0f)
                moveToRelative(2.016f, 0.274f)
                arcTo(3.18f, 3.18f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, true, -2.016f, -0.726f)
                curveTo(7.619f, 13.29f, 6.166f, 16.136f, 6.014f, 19.0f)
                horizontalLineToRelative(11.973f)
                curveToRelative(-0.152f, -2.88f, -1.608f, -5.717f, -3.971f, -6.726f)
            }
        }
        .build()
        return _userHelmetSmall!!
    }

private var _userHelmetSmall: ImageVector? = null
