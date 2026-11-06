package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.RobotLarge: ImageVector
    get() {
        if (_robotLarge != null) {
            return _robotLarge!!
        }
        _robotLarge = Builder(name = "RobotLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.939f, 34.0f)
                curveToRelative(2.213f, 0.0f, 4.06f, 1.695f, 4.061f, 3.85f)
                lineTo(43.0f, 44.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.15f)
                curveToRelative(0.0f, -1.546f, -1.342f, -2.85f, -3.062f, -2.85f)
                lineTo(10.063f, 35.0f)
                curveTo(8.343f, 35.0f, 7.0f, 36.304f, 7.0f, 37.85f)
                lineTo(7.0f, 44.0f)
                lineTo(6.0f, 44.0f)
                verticalLineToRelative(-6.15f)
                curveTo(6.0f, 35.695f, 7.849f, 34.0f, 10.063f, 34.0f)
                close()
                moveTo(24.5f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.5f, 4.95f)
                lineTo(25.0f, 12.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                lineTo(12.0f, 31.0f)
                verticalLineToRelative(-6.0f)
                lineTo(8.0f, 25.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                lineTo(24.0f, 8.95f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 24.5f, 4.0f)
                moveTo(13.0f, 30.0f)
                horizontalLineToRelative(23.0f)
                lineTo(36.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                close()
                moveTo(30.935f, 23.747f)
                curveTo(29.822f, 25.707f, 27.366f, 27.0f, 24.5f, 27.0f)
                reflectiveCurveToRelative(-5.322f, -1.293f, -6.435f, -3.253f)
                lineToRelative(0.87f, -0.494f)
                curveTo(19.83f, 24.83f, 21.906f, 26.0f, 24.5f, 26.0f)
                reflectiveCurveToRelative(4.67f, -1.17f, 5.565f, -2.747f)
                close()
                moveTo(9.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                lineTo(9.0f, 17.0f)
                close()
                moveTo(37.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(20.5f, 18.4f)
                arcToRelative(1.1f, 1.1f, 0.0f, true, true, 0.0f, 2.201f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 0.0f, -2.2f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.1f, 1.1f, 0.0f, true, true, 0.0f, 2.201f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 0.0f, -2.2f)
                moveToRelative(-8.0f, 1.0f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, 0.1f)
                curveToRelative(0.0f, 0.055f, 0.045f, 0.1f, 0.1f, 0.1f)
                reflectiveCurveToRelative(0.1f, -0.045f, 0.1f, -0.1f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, -0.1f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, 0.1f)
                curveToRelative(0.0f, 0.055f, 0.045f, 0.1f, 0.1f, 0.1f)
                reflectiveCurveToRelative(0.1f, -0.045f, 0.1f, -0.1f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, -0.1f)
                moveTo(24.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.5f, 5.0f)
            }
        }
        .build()
        return _robotLarge!!
    }

private var _robotLarge: ImageVector? = null
