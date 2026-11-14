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
                moveTo(14.5f, 5.18f)
                curveToRelative(0.468f, 0.566f, 0.75f, 1.293f, 0.75f, 2.088f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-0.732f)
                curveToRelative(0.0f, -0.795f, 0.282f, -1.522f, 0.75f, -2.088f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(4.368f)
                curveTo(10.949f, 4.133f, 11.46f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(1.051f, 0.133f, 1.5f, 0.368f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(7.75f, 8.0f)
                verticalLineToRelative(-0.732f)
                curveTo(7.75f, 4.913f, 9.65f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(4.25f, 1.913f, 4.25f, 4.268f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(0.734f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(15.5f)
                curveToRelative(0.0f, 0.93f, -0.284f, 1.807f, -0.77f, 2.503f)
                curveTo(17.525f, 12.894f, 19.0f, 16.35f, 19.0f, 19.5f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.133f, 1.473f, -6.598f, 4.27f, -7.997f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 8.5f, 9.0f)
                horizontalLineTo(6.984f)
                verticalLineTo(8.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-1.311f, 0.0f, -2.5f, -1.268f, -2.5f, -3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.732f, -1.189f, 3.0f, -2.5f, 3.0f)
                moveToRelative(2.016f, 0.274f)
                arcTo(3.18f, 3.18f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, true, -2.016f, -0.726f)
                curveTo(7.62f, 13.291f, 6.167f, 16.136f, 6.014f, 19.0f)
                horizontalLineToRelative(11.971f)
                curveToRelative(-0.152f, -2.88f, -1.606f, -5.717f, -3.969f, -6.726f)
            }
        }
        .build()
        return _userHelmetSmall!!
    }

private var _userHelmetSmall: ImageVector? = null
