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

public val SBBIcons.LocationPinCameraSmall: ImageVector
    get() {
        if (_locationPinCameraSmall != null) {
            return _locationPinCameraSmall!!
        }
        _locationPinCameraSmall = Builder(name = "LocationPinCameraSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 9.006f)
                arcTo(7.003f, 7.003f, 0.0f, false, true, 12.0f, 2.0f)
                curveToRelative(3.866f, 0.0f, 7.0f, 3.137f, 7.0f, 7.006f)
                verticalLineToRelative(0.005f)
                curveToRelative(-0.01f, 1.173f, -0.38f, 2.213f, -0.934f, 3.183f)
                lineToRelative(-0.004f, 0.008f)
                lineToRelative(-0.005f, 0.008f)
                lineToRelative(-5.614f, 9.054f)
                lineToRelative(-0.425f, 0.685f)
                lineToRelative(-0.425f, -0.686f)
                lineTo(5.98f, 12.21f)
                lineToRelative(-0.004f, -0.007f)
                curveToRelative(-0.567f, -0.946f, -0.928f, -1.965f, -0.976f, -3.177f)
                verticalLineToRelative(-0.02f)
                moveToRelative(1.0f, -0.01f)
                curveToRelative(0.041f, 1.014f, 0.34f, 1.868f, 0.832f, 2.69f)
                lineToRelative(5.187f, 8.365f)
                lineToRelative(5.183f, -8.36f)
                curveToRelative(0.492f, -0.864f, 0.789f, -1.734f, 0.798f, -2.687f)
                arcTo(6.003f, 6.003f, 0.0f, false, false, 12.0f, 3.0f)
                arcToRelative(6.003f, 6.003f, 0.0f, false, false, -6.0f, 5.996f)
                moveToRelative(6.0f, 0.416f)
                arcToRelative(0.032f, 0.032f, 0.0f, true, false, 0.0f, -0.064f)
                arcToRelative(0.032f, 0.032f, 0.0f, false, false, 0.0f, 0.064f)
                moveToRelative(-0.968f, -0.032f)
                arcToRelative(0.968f, 0.968f, 0.0f, true, true, 1.936f, 0.0f)
                arcToRelative(0.968f, 0.968f, 0.0f, false, true, -1.936f, 0.0f)
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(-0.309f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(10.19f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-2.191f)
                lineToRelative(-0.362f, -0.724f)
                lineTo(13.31f, 6.0f)
                horizontalLineTo(11.0f)
                moveToRelative(-0.053f, 1.724f)
                lineTo(11.31f, 7.0f)
                horizontalLineToRelative(1.382f)
                lineToRelative(0.362f, 0.724f)
                lineToRelative(0.138f, 0.276f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.809f)
                close()
            }
        }
        .build()
        return _locationPinCameraSmall!!
    }

private var _locationPinCameraSmall: ImageVector? = null
