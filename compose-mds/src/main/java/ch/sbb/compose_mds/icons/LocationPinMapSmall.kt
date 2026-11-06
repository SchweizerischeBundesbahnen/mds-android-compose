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

public val SBBIcons.LocationPinMapSmall: ImageVector
    get() {
        if (_locationPinMapSmall != null) {
            return _locationPinMapSmall!!
        }
        _locationPinMapSmall = Builder(name = "LocationPinMapSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(13.446f, 4.003f)
                lineToRelative(0.292f, 0.157f)
                lineToRelative(5.0f, 2.7f)
                lineToRelative(0.262f, 0.142f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 7.598f)
                lineToRelative(-4.0f, -2.16f)
                verticalLineToRelative(7.772f)
                lineToRelative(0.674f, 0.758f)
                lineToRelative(-0.748f, 0.664f)
                lineToRelative(-0.484f, -0.545f)
                lineToRelative(-4.63f, 3.704f)
                lineToRelative(-0.298f, 0.238f)
                lineToRelative(-0.309f, -0.225f)
                lineToRelative(-5.0f, -3.65f)
                lineToRelative(-0.205f, -0.15f)
                verticalLineToRelative(-9.98f)
                lineToRelative(0.792f, 0.57f)
                lineToRelative(4.692f, 3.379f)
                lineToRelative(4.704f, -3.763f)
                close()
                moveTo(13.0f, 13.16f)
                lineTo(13.0f, 5.64f)
                lineToRelative(-4.0f, 3.2f)
                verticalLineToRelative(7.52f)
                close()
                moveTo(4.0f, 5.976f)
                lineToRelative(4.0f, 2.88f)
                verticalLineToRelative(7.56f)
                lineToRelative(-4.0f, -2.92f)
                close()
                moveTo(15.004f, 13.189f)
                curveTo(15.004f, 11.463f, 16.312f, 10.0f, 18.0f, 10.0f)
                curveToRelative(1.69f, 0.0f, 2.997f, 1.462f, 2.997f, 3.188f)
                verticalLineToRelative(0.004f)
                curveToRelative(-0.005f, 0.54f, -0.165f, 1.015f, -0.392f, 1.444f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-0.006f, 0.01f)
                lineToRelative(-2.155f, 3.665f)
                lineToRelative(-0.43f, 0.733f)
                lineToRelative(-0.432f, -0.733f)
                lineToRelative(-2.157f, -3.665f)
                lineToRelative(-0.006f, -0.01f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -0.41f, -1.441f)
                verticalLineToRelative(-0.017f)
                moveToRelative(1.0f, -0.01f)
                curveToRelative(0.014f, 0.366f, 0.113f, 0.674f, 0.281f, 0.976f)
                lineToRelative(1.723f, 2.928f)
                lineToRelative(1.718f, -2.923f)
                curveToRelative(0.171f, -0.326f, 0.268f, -0.638f, 0.271f, -0.974f)
                curveToRelative(-0.001f, -1.243f, -0.929f, -2.185f, -1.997f, -2.185f)
                curveToRelative(-1.065f, 0.0f, -1.991f, 0.939f, -1.996f, 2.179f)
                moveTo(18.0f, 12.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.451f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.556f, 0.462f, 1.0f, 1.005f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 12.0f)
            }
        }
        .build()
        return _locationPinMapSmall!!
    }

private var _locationPinMapSmall: ImageVector? = null
