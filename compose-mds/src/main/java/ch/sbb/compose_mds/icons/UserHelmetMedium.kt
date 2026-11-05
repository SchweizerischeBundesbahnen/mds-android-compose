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
        _userHelmetMedium = Builder(
            name = "UserHelmetMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(18.0f, 4.75f)
                curveToRelative(-3.385f, 0.0f, -6.125f, 2.756f, -6.125f, 6.151f)
                verticalLineToRelative(1.349f)
                horizontalLineToRelative(-1.398f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 1.46f, 0.48f, 2.82f, 1.285f, 3.85f)
                curveToRelative(-4.254f, 1.95f, -6.535f, 7.153f, -6.535f, 11.9f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.773f, -2.284f, -9.961f, -6.535f, -11.9f)
                curveTo(22.519f, 16.32f, 23.0f, 14.96f, 23.0f, 13.5f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(2.477f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.352f)
                verticalLineToRelative(-1.349f)
                curveToRelative(0.0f, -3.395f, -2.74f, -6.151f, -6.125f, -6.151f)
                moveToRelative(5.125f, 7.5f)
                verticalLineToRelative(-1.349f)
                arcTo(5.15f, 5.15f, 0.0f, false, false, 21.5f, 7.139f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(6.404f)
                arcTo(5.1f, 5.1f, 0.0f, false, false, 18.0f, 5.75f)
                curveToRelative(-0.907f, 0.0f, -1.76f, 0.237f, -2.5f, 0.653f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.138f)
                arcToRelative(5.15f, 5.15f, 0.0f, false, false, -1.625f, 3.763f)
                verticalLineToRelative(1.349f)
                close()
                moveTo(14.0f, 13.5f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 2.698f, -1.86f, 4.75f, -4.0f, 4.75f)
                reflectiveCurveToRelative(-4.0f, -2.052f, -4.0f, -4.75f)
                moveToRelative(6.979f, 4.622f)
                curveToRelative(-0.824f, 0.705f, -1.848f, 1.128f, -2.979f, 1.128f)
                reflectiveCurveToRelative(-2.156f, -0.423f, -2.98f, -1.129f)
                curveToRelative(-3.825f, 1.552f, -6.103f, 6.132f, -6.261f, 10.629f)
                horizontalLineTo(27.24f)
                curveToRelative(-0.157f, -4.522f, -2.44f, -9.088f, -6.262f, -10.628f)
            }
        }
            .build()
        return _userHelmetMedium!!
    }

private var _userHelmetMedium: ImageVector? = null
