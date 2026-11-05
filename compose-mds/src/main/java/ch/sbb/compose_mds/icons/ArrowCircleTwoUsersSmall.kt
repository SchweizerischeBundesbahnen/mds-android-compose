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

public val SBBIcons.ArrowCircleTwoUsersSmall: ImageVector
    get() {
        if (_arrowCircleTwoUsersSmall != null) {
            return _arrowCircleTwoUsersSmall!!
        }
        _arrowCircleTwoUsersSmall = Builder(
            name = "ArrowCircleTwoUsersSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
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
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-3.823f, 0.0f, -7.292f, -2.15f, -9.0f, -5.319f)
                lineTo(3.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.773f, 16.0f)
                curveToRelative(1.49f, 2.956f, 4.687f, 5.0f, 8.227f, 5.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -9.0f, -9.0f)
                close()
                moveTo(13.5f, 5.0f)
                curveToRelative(-1.16f, 0.0f, -2.045f, 0.908f, -2.366f, 2.03f)
                curveTo(9.855f, 7.247f, 9.0f, 8.584f, 9.0f, 10.0f)
                curveToRelative(0.0f, 0.75f, 0.24f, 1.477f, 0.655f, 2.028f)
                curveTo(8.043f, 12.985f, 7.0f, 15.128f, 7.0f, 17.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.514f, -0.049f, -1.017f, -0.142f, -1.5f)
                lineTo(18.0f, 16.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.372f, -1.043f, -4.515f, -2.655f, -5.472f)
                curveTo(15.76f, 9.477f, 16.0f, 8.749f, 16.0f, 8.0f)
                curveToRelative(0.0f, -1.547f, -1.02f, -3.0f, -2.5f, -3.0f)
                moveToRelative(2.092f, 10.0f)
                horizontalLineToRelative(1.39f)
                curveToRelative(-0.144f, -2.078f, -1.179f, -3.694f, -2.441f, -4.265f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.677f, 0.235f)
                curveToRelative(-0.11f, 0.39f, -0.288f, 0.75f, -0.519f, 1.058f)
                curveToRelative(1.013f, 0.601f, 1.802f, 1.671f, 2.247f, 2.972f)
                moveToRelative(-3.052f, -2.265f)
                curveToRelative(-0.31f, 0.169f, -0.66f, 0.265f, -1.04f, 0.265f)
                reflectiveCurveToRelative(-0.73f, -0.096f, -1.04f, -0.265f)
                curveToRelative(-1.263f, 0.571f, -2.298f, 2.187f, -2.443f, 4.265f)
                horizontalLineToRelative(6.966f)
                curveToRelative(-0.145f, -2.078f, -1.18f, -3.694f, -2.443f, -4.265f)
                moveToRelative(1.458f, -2.854f)
                curveToRelative(-0.043f, -1.26f, -0.757f, -2.433f, -1.837f, -2.779f)
                curveTo(12.425f, 6.405f, 12.969f, 6.0f, 13.5f, 6.0f)
                curveToRelative(0.73f, 0.0f, 1.5f, 0.786f, 1.5f, 2.0f)
                curveToRelative(0.0f, 0.936f, -0.459f, 1.618f, -1.003f, 1.88f)
                moveTo(11.5f, 8.0f)
                curveToRelative(-0.73f, 0.0f, -1.5f, 0.786f, -1.5f, 2.0f)
                reflectiveCurveToRelative(0.77f, 2.0f, 1.5f, 2.0f)
                reflectiveCurveToRelative(1.5f, -0.786f, 1.5f, -2.0f)
                reflectiveCurveToRelative(-0.77f, -2.0f, -1.5f, -2.0f)
            }
        }
            .build()
        return _arrowCircleTwoUsersSmall!!
    }

private var _arrowCircleTwoUsersSmall: ImageVector? = null
