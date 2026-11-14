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

public val SBBIcons.CarProfileSignParkingSmall: ImageVector
    get() {
        if (_carProfileSignParkingSmall != null) {
            return _carProfileSignParkingSmall!!
        }
        _carProfileSignParkingSmall = Builder(name = "CarProfileSignParkingSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                close()
                moveTo(20.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.828f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(17.0f, 12.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.0f)
                lineTo(18.0f, 12.0f)
                close()
                moveTo(19.0f, 6.0f)
                curveToRelative(0.0f, -0.42f, -0.107f, -0.646f, -0.232f, -0.77f)
                curveTo(18.642f, 5.104f, 18.414f, 5.0f, 18.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.999f)
                curveToRelative(0.422f, 0.0f, 0.649f, -0.106f, 0.773f, -0.23f)
                curveToRelative(0.123f, -0.123f, 0.228f, -0.348f, 0.228f, -0.77f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.578f, -0.145f, 1.102f, -0.523f, 1.479f)
                curveToRelative(-0.376f, 0.375f, -0.9f, 0.52f, -1.476f, 0.521f)
                lineTo(17.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.57f, 0.0f, 1.094f, 0.144f, 1.472f, 0.519f)
                reflectiveCurveTo(20.0f, 5.419f, 20.0f, 6.0f)
                moveTo(10.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.002f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 19.499f)
                moveToRelative(0.95f, 0.5f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(2.0f, 19.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.05f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(13.0f, 18.999f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(2.0f, 14.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.792f)
                lineTo(5.94f, 11.145f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 5.586f, 11.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.586f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                lineTo(10.207f, 14.0f)
                lineTo(12.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                lineTo(14.0f, 20.0f)
                close()
            }
        }
        .build()
        return _carProfileSignParkingSmall!!
    }

private var _carProfileSignParkingSmall: ImageVector? = null
