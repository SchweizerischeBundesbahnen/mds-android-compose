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

public val SBBIcons.TrainProfileSignParkingSmall: ImageVector
    get() {
        if (_trainProfileSignParkingSmall != null) {
            return _trainProfileSignParkingSmall!!
        }
        _trainProfileSignParkingSmall = Builder(name = "TrainProfileSignParkingSmall", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 2.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(18.0f, 12.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.842f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.454f, -1.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.338f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.108f, -0.44f)
                lineToRelative(-0.012f, -0.025f)
                lineToRelative(-0.01f, -0.025f)
                lineTo(12.66f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.778f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, false, -3.44f, -2.0f)
                lineTo(5.65f, 9.0f)
                lineToRelative(-0.151f, 0.1f)
                lineToRelative(-0.151f, -0.1f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 8.0f)
                horizontalLineToRelative(1.849f)
                lineToRelative(-2.25f, -1.5f)
                lineToRelative(3.624f, -2.416f)
                lineToRelative(0.277f, -0.186f)
                lineToRelative(0.277f, 0.186f)
                lineTo(9.401f, 6.5f)
                lineTo(7.151f, 8.0f)
                horizontalLineToRelative(0.187f)
                curveToRelative(2.19f, 0.0f, 4.029f, 1.415f, 4.706f, 3.367f)
                lineToRelative(2.104f, 5.801f)
                curveToRelative(0.114f, 0.248f, 0.19f, 0.528f, 0.19f, 0.832f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.075f, 0.37f, -0.235f, 0.709f, -0.454f, 1.0f)
                lineTo(17.0f, 21.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6.426f, 20.0f)
                curveToRelative(0.206f, 0.582f, 0.76f, 1.0f, 1.412f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.412f, -1.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(8.0f, 15.0f)
                horizontalLineToRelative(4.298f)
                lineToRelative(-1.089f, -3.0f)
                lineTo(8.0f, 12.0f)
                close()
                moveTo(14.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(18.0f, 4.0f)
                curveToRelative(0.57f, 0.0f, 1.094f, 0.144f, 1.472f, 0.519f)
                reflectiveCurveTo(20.0f, 5.419f, 20.0f, 6.0f)
                curveToRelative(0.0f, 0.578f, -0.145f, 1.102f, -0.523f, 1.479f)
                curveToRelative(-0.376f, 0.375f, -0.9f, 0.52f, -1.476f, 0.521f)
                lineTo(17.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 4.0f)
                close()
                moveTo(3.401f, 6.5f)
                lineTo(5.5f, 7.898f)
                lineTo(7.599f, 6.5f)
                lineTo(5.5f, 5.1f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineToRelative(0.999f)
                curveToRelative(0.422f, 0.0f, 0.649f, -0.106f, 0.773f, -0.23f)
                curveToRelative(0.123f, -0.123f, 0.228f, -0.348f, 0.228f, -0.77f)
                curveToRelative(0.0f, -0.42f, -0.107f, -0.646f, -0.232f, -0.77f)
                curveTo(18.642f, 5.104f, 18.414f, 5.0f, 18.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _trainProfileSignParkingSmall!!
    }

private var _trainProfileSignParkingSmall: ImageVector? = null
