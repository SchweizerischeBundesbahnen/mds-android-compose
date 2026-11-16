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

public val SBBIcons.EarEyeMedium: ImageVector
    get() {
        if (_earEyeMedium != null) {
            return _earEyeMedium!!
        }
        _earEyeMedium = Builder(name = "EarEyeMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.75f, 18.0f)
                curveToRelative(0.0f, 0.295f, 0.092f, 0.749f, 0.355f, 1.114f)
                curveToRelative(0.245f, 0.34f, 0.658f, 0.636f, 1.395f, 0.636f)
                reflectiveCurveToRelative(1.15f, -0.296f, 1.395f, -0.636f)
                curveToRelative(0.263f, -0.365f, 0.355f, -0.819f, 0.355f, -1.114f)
                curveToRelative(0.0f, -2.458f, 1.627f, -4.084f, 2.378f, -4.835f)
                lineToRelative(0.018f, -0.018f)
                curveToRelative(0.758f, -0.758f, 2.104f, -2.125f, 2.104f, -4.147f)
                curveToRelative(0.0f, -0.798f, -0.243f, -2.001f, -0.956f, -2.991f)
                curveTo(12.099f, 5.045f, 10.937f, 4.25f, 9.0f, 4.25f)
                reflectiveCurveToRelative(-3.1f, 0.795f, -3.794f, 1.759f)
                curveTo(4.493f, 6.999f, 4.25f, 8.202f, 4.25f, 9.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.957f, 0.283f, -2.379f, 1.145f, -3.575f)
                curveTo(5.275f, 4.203f, 6.737f, 3.25f, 9.0f, 3.25f)
                reflectiveCurveToRelative(3.725f, 0.953f, 4.605f, 2.175f)
                curveTo(14.468f, 6.62f, 14.75f, 8.043f, 14.75f, 9.0f)
                curveToRelative(0.0f, 2.458f, -1.627f, 4.084f, -2.378f, 4.835f)
                lineToRelative(-0.018f, 0.018f)
                curveToRelative(-0.758f, 0.758f, -2.104f, 2.125f, -2.104f, 4.147f)
                curveToRelative(0.0f, 0.455f, -0.132f, 1.126f, -0.544f, 1.698f)
                curveToRelative(-0.43f, 0.598f, -1.143f, 1.052f, -2.206f, 1.052f)
                reflectiveCurveToRelative(-1.776f, -0.454f, -2.206f, -1.052f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.75f, 18.0f)
                close()
                moveTo(28.854f, 6.354f)
                lineToRelative(-22.5f, 22.5f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(22.5f, -22.5f)
                close()
                moveTo(25.75f, 27.0f)
                curveToRelative(0.0f, -0.969f, -0.781f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.781f, -1.75f, 1.75f)
                reflectiveCurveToRelative(0.781f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.781f, 1.75f, -1.75f)
                moveToRelative(1.0f, 0.0f)
                arcTo(2.747f, 2.747f, 0.0f, false, true, 24.0f, 29.75f)
                arcTo(2.747f, 2.747f, 0.0f, false, true, 21.25f, 27.0f)
                arcTo(2.747f, 2.747f, 0.0f, false, true, 24.0f, 24.25f)
                arcTo(2.747f, 2.747f, 0.0f, false, true, 26.75f, 27.0f)
                moveTo(7.133f, 10.747f)
                curveToRelative(0.35f, 0.38f, 0.617f, 0.823f, 0.617f, 1.253f)
                curveToRelative(0.0f, 0.969f, -0.781f, 1.75f, -1.75f, 1.75f)
                verticalLineToRelative(1.0f)
                arcTo(2.747f, 2.747f, 0.0f, false, false, 8.75f, 12.0f)
                curveToRelative(0.0f, -0.815f, -0.483f, -1.497f, -0.883f, -1.93f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -0.568f, -0.532f)
                lineToRelative(-0.028f, -0.022f)
                lineToRelative(-0.014f, -0.011f)
                curveToRelative(0.034f, -0.911f, 0.255f, -1.455f, 0.53f, -1.77f)
                curveToRelative(0.286f, -0.332f, 0.693f, -0.485f, 1.213f, -0.485f)
                curveToRelative(0.969f, 0.0f, 1.75f, 0.781f, 1.75f, 1.75f)
                horizontalLineToRelative(1.0f)
                arcTo(2.747f, 2.747f, 0.0f, false, false, 9.0f, 6.25f)
                curveToRelative(-0.725f, 0.0f, -1.443f, 0.222f, -1.97f, 0.828f)
                curveToRelative(-0.516f, 0.595f, -0.78f, 1.482f, -0.78f, 2.672f)
                verticalLineToRelative(0.267f)
                lineToRelative(0.222f, 0.148f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(0.005f, 0.004f)
                lineToRelative(0.008f, 0.005f)
                lineToRelative(0.032f, 0.022f)
                quadToRelative(0.054f, 0.04f, 0.15f, 0.116f)
                curveToRelative(0.127f, 0.103f, 0.296f, 0.251f, 0.463f, 0.432f)
                moveToRelative(24.895f, 15.408f)
                curveTo(29.982f, 23.366f, 27.052f, 21.25f, 24.0f, 21.25f)
                curveToRelative(-3.255f, 0.0f, -6.372f, 2.408f, -8.425f, 5.472f)
                lineToRelative(-0.186f, 0.278f)
                lineToRelative(0.186f, 0.278f)
                curveToRelative(2.053f, 3.064f, 5.17f, 5.472f, 8.425f, 5.472f)
                curveToRelative(3.037f, 0.0f, 5.98f, -2.116f, 8.028f, -4.905f)
                lineToRelative(0.398f, -0.567f)
                lineToRelative(0.186f, -0.278f)
                lineToRelative(-0.186f, -0.278f)
                close()
                moveTo(16.6f, 27.0f)
                curveToRelative(1.959f, -2.788f, 4.715f, -4.75f, 7.4f, -4.75f)
                reflectiveCurveToRelative(5.442f, 1.962f, 7.4f, 4.75f)
                curveToRelative(-1.959f, 2.788f, -4.728f, 4.75f, -7.4f, 4.75f)
                curveToRelative(-2.685f, 0.0f, -5.441f, -1.962f, -7.4f, -4.75f)
            }
        }
        .build()
        return _earEyeMedium!!
    }

private var _earEyeMedium: ImageVector? = null
