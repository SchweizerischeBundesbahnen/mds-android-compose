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

public val SBBIcons.BikeTrailerSmall: ImageVector
    get() {
        if (_bikeTrailerSmall != null) {
            return _bikeTrailerSmall!!
        }
        _bikeTrailerSmall = Builder(name = "BikeTrailerSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.098f)
                lineToRelative(-0.625f, 1.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.14f)
                lineToRelative(-0.114f, 0.342f)
                lineToRelative(-0.226f, 0.676f)
                arcTo(2.503f, 2.503f, 0.0f, false, false, 11.05f, 13.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(-0.73f)
                lineToRelative(-0.175f, -0.15f)
                lineToRelative(-3.5f, -3.0f)
                lineToRelative(-0.14f, -0.12f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.732f, 1.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.05f)
                curveToRelative(0.232f, 1.14f, 1.242f, 2.0f, 2.45f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.249f, -4.665f)
                lineTo(14.86f, 11.0f)
                horizontalLineToRelative(2.603f)
                lineToRelative(0.371f, 0.637f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.0f, 13.5f)
                curveToRelative(0.0f, 1.379f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, false, -3.302f, -2.368f)
                lineToRelative(-0.364f, -0.623f)
                lineToRelative(1.09f, -1.744f)
                lineToRelative(0.478f, -0.765f)
                close()
                moveTo(6.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.0f, -1.732f)
                lineTo(3.0f, 10.0f)
                horizontalLineToRelative(1.815f)
                lineTo(8.0f, 12.73f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(3.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(16.932f, -0.752f)
                lineToRelative(-0.713f, -1.222f)
                arcTo(1.503f, 1.503f, 0.0f, false, true, 21.0f, 13.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, true, -1.144f, -2.469f)
                lineToRelative(0.712f, 1.22f)
                close()
                moveTo(14.422f, 12.318f)
                arcTo(1.499f, 1.499f, 0.0f, false, true, 13.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.414f, -1.0f)
                horizontalLineToRelative(1.774f)
                lineToRelative(0.114f, -0.342f)
                close()
                moveTo(12.085f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.387f, -1.0f)
                lineToRelative(-0.333f, 1.0f)
                close()
            }
        }
        .build()
        return _bikeTrailerSmall!!
    }

private var _bikeTrailerSmall: ImageVector? = null
