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

public val SBBIcons.WheelchairUncertainSmall: ImageVector
    get() {
        if (_wheelchairUncertainSmall != null) {
            return _wheelchairUncertainSmall!!
        }
        _wheelchairUncertainSmall = Builder(name = "WheelchairUncertainSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.019f, 5.378f)
                curveToRelative(1.081f, -0.531f, 2.397f, -0.507f, 3.506f, -0.038f)
                lineToRelative(0.22f, 0.1f)
                lineToRelative(0.007f, 0.003f)
                lineToRelative(0.009f, 0.005f)
                curveToRelative(0.746f, 0.398f, 1.408f, 1.125f, 1.62f, 2.064f)
                curveToRelative(0.219f, 0.962f, -0.053f, 2.055f, -1.008f, 3.122f)
                lineToRelative(-0.02f, 0.02f)
                lineToRelative(-1.484f, 1.483f)
                curveToRelative(-0.436f, 0.496f, -0.636f, 0.855f, -0.741f, 1.236f)
                curveToRelative(-0.111f, 0.404f, -0.128f, 0.87f, -0.128f, 1.627f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.74f, 0.011f, -1.339f, 0.164f, -1.893f)
                curveToRelative(0.159f, -0.575f, 0.458f, -1.067f, 0.961f, -1.637f)
                lineToRelative(0.379f, 0.333f)
                lineToRelative(-0.004f, -0.003f)
                lineToRelative(-0.375f, -0.33f)
                lineToRelative(0.021f, -0.024f)
                lineToRelative(1.486f, -1.486f)
                curveToRelative(0.777f, -0.871f, 0.907f, -1.64f, 0.774f, -2.226f)
                curveToRelative(-0.137f, -0.606f, -0.575f, -1.11f, -1.105f, -1.397f)
                curveToRelative(-0.91f, -0.442f, -2.0f, -0.475f, -2.842f, -0.062f)
                curveTo(15.649f, 6.673f, 15.0f, 7.517f, 15.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.825f, 0.832f, -3.04f, 2.019f, -3.622f)
                moveTo(7.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(2.0f, 14.5f)
                curveToRelative(0.0f, -1.749f, 1.01f, -3.27f, 2.471f, -4.013f)
                lineToRelative(0.454f, 0.89f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 3.0f, 14.501f)
                curveToRelative(0.0f, 1.922f, 1.577f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.39f, 0.0f, 2.605f, -0.826f, 3.167f, -2.017f)
                lineToRelative(0.904f, 0.426f)
                arcTo(4.51f, 4.51f, 0.0f, false, true, 6.5f, 19.001f)
                arcToRelative(4.514f, 4.514f, 0.0f, false, true, -4.5f, -4.5f)
                moveToRelative(16.045f, 4.497f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.5f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _wheelchairUncertainSmall!!
    }

private var _wheelchairUncertainSmall: ImageVector? = null
