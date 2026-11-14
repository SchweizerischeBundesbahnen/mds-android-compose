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

public val SBBIcons.BellDisabledSmall: ImageVector
    get() {
        if (_bellDisabledSmall != null) {
            return _bellDisabledSmall!!
        }
        _bellDisabledSmall = Builder(name = "BellDisabledSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.277f)
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.277f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, -1.812f, 0.944f)
                lineToRelative(0.625f, 0.78f)
                curveTo(9.543f, 5.416f, 10.565f, 5.0f, 12.0f, 5.0f)
                curveToRelative(2.037f, 0.0f, 3.262f, 0.837f, 3.994f, 1.854f)
                curveTo(16.744f, 7.897f, 17.0f, 9.164f, 17.0f, 10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.997f, -0.295f, -2.48f, -1.194f, -3.73f)
                arcTo(5.26f, 5.26f, 0.0f, false, false, 14.0f, 4.278f)
                moveToRelative(-1.0f, -0.213f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(-0.942f)
                quadToRelative(0.495f, 0.003f, 0.942f, 0.064f)
                moveTo(11.942f, 4.0f)
                lineTo(11.0f, 4.0f)
                verticalLineToRelative(0.064f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 11.942f, 4.0f)
                moveTo(6.0f, 16.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.556f, 0.091f, -1.252f, 0.32f, -1.972f)
                lineTo(3.648f, 5.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(15.0f, 15.0f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(17.293f, 19.0f)
                horizontalLineToRelative(-2.337f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.895f, 1.423f)
                curveToRelative(-0.566f, 0.409f, -1.306f, 0.577f, -2.061f, 0.577f)
                reflectiveCurveToRelative(-1.495f, -0.169f, -2.06f, -0.577f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 9.043f, 19.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.337f, 0.0f, 0.853f, -0.106f, 1.27f, -0.406f)
                curveToRelative(0.392f, -0.283f, 0.73f, -0.757f, 0.73f, -1.594f)
                moveToRelative(10.293f, 2.0f)
                lineTo(7.135f, 8.843f)
                curveTo(7.04f, 9.272f, 7.0f, 9.672f, 7.0f, 10.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.875f, -0.28f, 1.53f, -0.696f, 2.0f)
                close()
                moveTo(10.525f, 19.613f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.452f, -0.613f)
                horizontalLineToRelative(3.854f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.452f, 0.613f)
                curveToRelative(-0.34f, 0.245f, -0.85f, 0.387f, -1.475f, 0.387f)
                reflectiveCurveToRelative(-1.135f, -0.142f, -1.475f, -0.387f)
            }
        }
        .build()
        return _bellDisabledSmall!!
    }

private var _bellDisabledSmall: ImageVector? = null
