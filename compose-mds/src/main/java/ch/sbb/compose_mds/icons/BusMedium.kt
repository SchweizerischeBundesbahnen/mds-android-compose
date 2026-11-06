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

public val SBBIcons.BusMedium: ImageVector
    get() {
        if (_busMedium != null) {
            return _busMedium!!
        }
        _busMedium = Builder(name = "BusMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.019f, 6.519f)
                curveTo(7.533f, 7.005f, 7.25f, 7.789f, 7.25f, 9.0f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(21.5f)
                lineTo(28.75f, 9.0f)
                curveToRelative(0.0f, -1.211f, -0.282f, -1.995f, -0.769f, -2.481f)
                curveToRelative(-0.486f, -0.486f, -1.27f, -0.769f, -2.481f, -0.769f)
                horizontalLineToRelative(-15.0f)
                curveToRelative(-1.211f, 0.0f, -1.995f, 0.283f, -2.481f, 0.769f)
                moveTo(7.25f, 27.25f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(7.312f, 5.812f)
                curveTo(8.06f, 5.063f, 9.152f, 4.75f, 10.5f, 4.75f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.348f, 0.0f, 2.44f, 0.313f, 3.188f, 1.062f)
                reflectiveCurveTo(29.75f, 7.652f, 29.75f, 9.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-5.498f)
                verticalLineToRelative(-3.0f)
                lineTo(11.75f, 28.25f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-15.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.5f)
                lineTo(6.25f, 9.0f)
                curveToRelative(0.0f, -1.348f, 0.313f, -2.44f, 1.062f, -3.188f)
                moveTo(29.75f, 15.25f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(25.252f, 28.25f)
                horizontalLineToRelative(3.498f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.498f)
                close()
                moveTo(7.25f, 28.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(6.25f, 14.75f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(25.5f, 7.75f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(10.5f, 22.75f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveTo(10.25f, 24.0f)
                curveToRelative(0.0f, -0.138f, 0.113f, -0.25f, 0.25f, -0.25f)
                reflectiveCurveToRelative(0.25f, 0.112f, 0.25f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(14.0f, 0.0f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(1.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
            }
        }
        .build()
        return _busMedium!!
    }

private var _busMedium: ImageVector? = null
