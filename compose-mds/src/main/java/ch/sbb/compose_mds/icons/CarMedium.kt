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

public val SBBIcons.CarMedium: ImageVector
    get() {
        if (_carMedium != null) {
            return _carMedium!!
        }
        _carMedium = Builder(name = "CarMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.519f, 11.019f)
                curveToRelative(-0.486f, 0.486f, -0.769f, 1.27f, -0.769f, 2.481f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(9.535f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, 6.93f, 0.0f)
                horizontalLineToRelative(2.035f)
                lineTo(27.25f, 13.5f)
                curveToRelative(0.0f, -1.211f, -0.282f, -1.995f, -0.769f, -2.481f)
                curveToRelative(-0.486f, -0.486f, -1.27f, -0.769f, -2.481f, -0.769f)
                lineTo(12.0f, 10.25f)
                curveToRelative(-1.211f, 0.0f, -1.995f, 0.283f, -2.481f, 0.769f)
                moveTo(24.2f, 16.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, -4.9f, 0.0f)
                close()
                moveTo(8.75f, 24.25f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(8.812f, 10.312f)
                curveTo(9.56f, 9.563f, 10.652f, 9.25f, 12.0f, 9.25f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.348f, 0.0f, 2.44f, 0.313f, 3.188f, 1.062f)
                reflectiveCurveToRelative(1.062f, 1.84f, 1.062f, 3.188f)
                verticalLineToRelative(1.75f)
                lineTo(30.0f, 15.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-5.498f)
                verticalLineToRelative(-3.0f)
                lineTo(13.25f, 25.25f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-12.0f)
                lineTo(6.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                lineTo(7.75f, 13.5f)
                curveToRelative(0.0f, -1.348f, 0.313f, -2.44f, 1.062f, -3.188f)
                moveToRelative(14.94f, 14.938f)
                horizontalLineToRelative(3.498f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.498f)
                close()
                moveTo(8.75f, 25.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(10.75f, 21.0f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(1.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(10.75f, 0.25f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(1.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
            }
        }
        .build()
        return _carMedium!!
    }

private var _carMedium: ImageVector? = null
