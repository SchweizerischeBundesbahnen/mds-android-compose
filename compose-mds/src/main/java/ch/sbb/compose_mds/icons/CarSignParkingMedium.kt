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

public val SBBIcons.CarSignParkingMedium: ImageVector
    get() {
        if (_carSignParkingMedium != null) {
            return _carSignParkingMedium!!
        }
        _carSignParkingMedium = Builder(name = "CarSignParkingMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.25f, 6.25f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.25f, 31.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(6.25f, 14.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-8.5f)
                close()
                moveTo(4.25f, 13.75f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(30.25f, 16.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 27.0f, 13.25f)
                lineTo(16.5f, 13.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.25f, 3.25f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(8.035f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, -3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, 3.0f)
                horizontalLineToRelative(2.035f)
                close()
                moveTo(27.2f, 19.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.45f, -2.0f)
                curveToRelative(-1.21f, 0.0f, -2.219f, 0.86f, -2.45f, 2.0f)
                close()
                moveTo(13.25f, 27.25f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(25.752f, 28.25f)
                lineTo(17.75f, 28.25f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-12.0f)
                lineTo(10.5f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                lineTo(12.25f, 16.5f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 4.25f, -4.25f)
                lineTo(27.0f, 12.25f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 4.25f, 4.25f)
                verticalLineToRelative(1.75f)
                lineTo(33.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-5.498f)
                close()
                moveTo(26.752f, 28.25f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.498f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.25f, 28.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(16.75f, 24.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.25f, 0.25f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, -0.001f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                moveToRelative(9.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.501f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
            }
        }
        .build()
        return _carSignParkingMedium!!
    }

private var _carSignParkingMedium: ImageVector? = null
