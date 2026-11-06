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

public val SBBIcons.CarProfileSignParkingMedium: ImageVector
    get() {
        if (_carProfileSignParkingMedium != null) {
            return _carProfileSignParkingMedium!!
        }
        _carProfileSignParkingMedium = Builder(name = "CarProfileSignParkingMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.75f, 5.25f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(21.75f, 3.25f)
                curveToRelative(-1.106f, 0.0f, -2.0f, 0.894f, -2.0f, 2.0f)
                verticalLineToRelative(10.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(25.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                lineTo(26.75f, 17.75f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(32.75f, 5.25f)
                curveToRelative(0.0f, -1.106f, -0.894f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(24.25f, 6.25f)
                lineTo(27.0f, 6.25f)
                curveToRelative(0.817f, 0.0f, 1.527f, 0.207f, 2.031f, 0.706f)
                curveToRelative(0.505f, 0.5f, 0.719f, 1.211f, 0.719f, 2.044f)
                curveToRelative(0.0f, 0.828f, -0.208f, 1.539f, -0.71f, 2.04f)
                reflectiveCurveToRelative(-1.214f, 0.708f, -2.039f, 0.71f)
                lineTo(25.25f, 11.75f)
                lineTo(25.25f, 15.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.25f, 6.25f)
                moveToRelative(1.0f, 4.5f)
                lineTo(27.0f, 10.75f)
                curveToRelative(0.671f, -0.001f, 1.084f, -0.17f, 1.333f, -0.418f)
                reflectiveCurveToRelative(0.417f, -0.66f, 0.417f, -1.332f)
                reflectiveCurveToRelative(-0.172f, -1.085f, -0.423f, -1.334f)
                curveToRelative(-0.252f, -0.25f, -0.667f, -0.416f, -1.327f, -0.416f)
                horizontalLineToRelative(-1.75f)
                close()
                moveTo(12.75f, 26.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(-3.465f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, -3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, 3.0f)
                horizontalLineToRelative(3.535f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(3.0f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.792f)
                lineTo(8.94f, 16.395f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.353f, -0.146f)
                lineTo(3.0f, 16.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.586f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                lineToRelative(5.561f, 5.56f)
                horizontalLineToRelative(4.043f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.536f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.464f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, -3.0f)
                lineTo(3.0f, 29.749f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _carProfileSignParkingMedium!!
    }

private var _carProfileSignParkingMedium: ImageVector? = null
