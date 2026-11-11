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
                moveTo(12.0f, 3.0f)
                arcToRelative(6.003f, 6.003f, 0.0f, false, false, -6.0f, 5.991f)
                curveToRelative(0.04f, 1.015f, 0.339f, 1.87f, 0.83f, 2.692f)
                lineToRelative(5.189f, 8.368f)
                lineToRelative(5.188f, -8.368f)
                curveToRelative(0.489f, -0.861f, 0.784f, -1.727f, 0.793f, -2.677f)
                arcTo(6.003f, 6.003f, 0.0f, false, false, 12.0f, 3.0f)
                moveToRelative(6.5f, 6.006f)
                horizontalLineToRelative(-0.056f)
                lineTo(19.0f, 9.01f)
                curveToRelative(-0.01f, 1.173f, -0.38f, 2.213f, -0.934f, 3.183f)
                lineToRelative(-0.44f, -0.252f)
                lineToRelative(0.006f, 0.004f)
                lineToRelative(0.434f, 0.248f)
                lineToRelative(-0.01f, 0.016f)
                lineToRelative(-5.613f, 9.054f)
                lineToRelative(-0.424f, 0.685f)
                lineToRelative(-0.425f, -0.685f)
                lineToRelative(-5.615f, -9.054f)
                lineToRelative(-0.003f, -0.007f)
                curveToRelative(-0.567f, -0.946f, -0.929f, -1.965f, -0.976f, -3.178f)
                verticalLineToRelative(-0.02f)
                arcTo(7.003f, 7.003f, 0.0f, false, true, 12.0f, 2.0f)
                curveToRelative(3.866f, 0.0f, 7.0f, 3.137f, 7.0f, 7.006f)
                verticalLineToRelative(0.005f)
                close()
                moveTo(12.0f, 9.348f)
                arcToRelative(0.03f, 0.03f, 0.0f, false, false, -0.032f, 0.031f)
                lineToRelative(0.01f, 0.023f)
                quadToRelative(0.009f, 0.009f, 0.021f, 0.01f)
                arcToRelative(0.033f, 0.033f, 0.0f, false, false, 0.033f, -0.033f)
                arcToRelative(0.03f, 0.03f, 0.0f, false, false, -0.01f, -0.021f)
                close()
                moveTo(12.968f, 9.379f)
                arcToRelative(0.97f, 0.97f, 0.0f, true, true, -1.938f, 0.0f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, true, 1.938f, 0.0f)
                moveToRelative(0.48f, -3.103f)
                lineTo(13.307f, 6.0f)
                horizontalLineToRelative(-2.617f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(10.19f, 7.0f)
                lineTo(8.0f, 7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(-2.191f)
                close()
                moveTo(10.807f, 8.0f)
                lineToRelative(0.14f, -0.276f)
                lineToRelative(0.36f, -0.724f)
                horizontalLineToRelative(1.383f)
                lineToRelative(0.362f, 0.724f)
                lineToRelative(0.138f, 0.276f)
                lineTo(15.0f, 8.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 11.0f)
                lineTo(9.0f, 8.0f)
                close()
            }
        }
        .build()
        return _locationPinCameraSmall!!
    }

private var _locationPinCameraSmall: ImageVector? = null
