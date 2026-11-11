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

public val SBBIcons.SignParkingSmall: ImageVector
    get() {
        if (_signParkingSmall != null) {
            return _signParkingSmall!!
        }
        _signParkingSmall = Builder(name = "SignParkingSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                close()
                moveTo(14.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 3.5f)
                verticalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 12.0f)
                lineTo(11.0f, 12.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 12.0f)
                close()
                moveTo(13.0f, 6.0f)
                curveToRelative(0.0f, -0.42f, -0.107f, -0.646f, -0.232f, -0.77f)
                curveTo(12.642f, 5.104f, 12.414f, 5.0f, 12.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.999f)
                curveToRelative(0.422f, 0.0f, 0.649f, -0.106f, 0.772f, -0.23f)
                curveToRelative(0.124f, -0.123f, 0.229f, -0.348f, 0.229f, -0.77f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.578f, -0.145f, 1.102f, -0.523f, 1.479f)
                curveToRelative(-0.376f, 0.375f, -0.9f, 0.52f, -1.476f, 0.521f)
                lineTo(11.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.57f, 0.0f, 1.094f, 0.144f, 1.472f, 0.519f)
                reflectiveCurveTo(14.0f, 5.419f, 14.0f, 6.0f)
            }
        }
        .build()
        return _signParkingSmall!!
    }

private var _signParkingSmall: ImageVector? = null
