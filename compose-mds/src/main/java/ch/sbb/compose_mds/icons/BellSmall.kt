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

public val SBBIcons.BellSmall: ImageVector
    get() {
        if (_bellSmall != null) {
            return _bellSmall!!
        }
        _bellSmall = Builder(name = "BellSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.277f)
                arcToRelative(5.26f, 5.26f, 0.0f, false, true, 2.806f, 1.993f)
                curveTo(17.706f, 7.52f, 18.0f, 9.003f, 18.0f, 10.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.337f, 0.105f, 0.853f, 0.406f, 1.27f)
                curveToRelative(0.282f, 0.392f, 0.757f, 0.73f, 1.594f, 0.73f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.044f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.895f, 1.423f)
                curveToRelative(-0.565f, 0.409f, -1.306f, 0.577f, -2.061f, 0.577f)
                reflectiveCurveToRelative(-1.496f, -0.168f, -2.061f, -0.577f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 9.044f, 19.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.337f, 0.0f, 0.853f, -0.105f, 1.27f, -0.406f)
                curveToRelative(0.392f, -0.282f, 0.73f, -0.757f, 0.73f, -1.594f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.997f, 0.295f, -2.48f, 1.194f, -3.73f)
                arcTo(5.26f, 5.26f, 0.0f, false, true, 10.0f, 4.277f)
                lineTo(10.0f, 3.0f)
                moveToRelative(1.0f, 1.064f)
                quadToRelative(0.447f, -0.06f, 0.942f, -0.064f)
                lineTo(11.0f, 4.0f)
                close()
                moveTo(12.058f, 4.0f)
                quadToRelative(0.495f, 0.003f, 0.942f, 0.064f)
                lineTo(13.0f, 4.0f)
                close()
                moveTo(10.073f, 19.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.452f, 0.613f)
                curveToRelative(0.34f, 0.245f, 0.85f, 0.387f, 1.475f, 0.387f)
                reflectiveCurveToRelative(1.135f, -0.142f, 1.475f, -0.387f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.452f, -0.613f)
                horizontalLineToRelative(-3.854f)
                moveTo(7.0f, 10.0f)
                curveToRelative(0.0f, -0.837f, 0.255f, -2.103f, 1.006f, -3.145f)
                curveTo(8.738f, 5.838f, 9.963f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveToRelative(3.262f, 0.838f, 3.994f, 1.855f)
                curveTo(16.744f, 7.897f, 17.0f, 9.163f, 17.0f, 10.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.497f, 0.145f, 1.23f, 0.594f, 1.855f)
                quadToRelative(0.054f, 0.074f, 0.112f, 0.145f)
                lineTo(6.304f, 18.0f)
                curveToRelative(0.416f, -0.47f, 0.696f, -1.125f, 0.696f, -2.0f)
                verticalLineToRelative(-6.0f)
            }
        }
        .build()
        return _bellSmall!!
    }

private var _bellSmall: ImageVector? = null
