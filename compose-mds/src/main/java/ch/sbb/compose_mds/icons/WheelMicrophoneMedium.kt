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

public val SBBIcons.WheelMicrophoneMedium: ImageVector
    get() {
        if (_wheelMicrophoneMedium != null) {
            return _wheelMicrophoneMedium!!
        }
        _wheelMicrophoneMedium = Builder(name = "WheelMicrophoneMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.25f)
                curveToRelative(5.142f, 0.0f, 9.776f, 2.598f, 12.417f, 6.6f)
                lineToRelative(-0.834f, 0.55f)
                curveTo(27.126f, 6.678f, 22.805f, 4.25f, 18.0f, 4.25f)
                curveTo(10.406f, 4.25f, 4.25f, 10.406f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 31.75f, 18.0f, 31.75f)
                curveToRelative(1.414f, 0.0f, 2.702f, -0.186f, 3.977f, -0.578f)
                lineToRelative(0.296f, 0.956f)
                curveToRelative(-1.378f, 0.424f, -2.766f, 0.622f, -4.273f, 0.622f)
                curveToRelative(-8.146f, 0.0f, -14.75f, -6.604f, -14.75f, -14.75f)
                reflectiveCurveTo(9.854f, 3.25f, 18.0f, 3.25f)
                moveToRelative(4.25f, 21.5f)
                curveToRelative(0.0f, 2.398f, 2.03f, 4.0f, 4.75f, 4.0f)
                reflectiveCurveToRelative(4.75f, -1.602f, 4.75f, -4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.955f, -2.388f, 4.79f, -5.25f, 4.982f)
                verticalLineToRelative(2.018f)
                lineTo(30.0f, 31.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.018f)
                curveToRelative(-2.862f, -0.191f, -5.25f, -2.027f, -5.25f, -4.982f)
                close()
                moveTo(18.0f, 6.25f)
                curveToRelative(3.331f, 0.0f, 6.323f, 1.377f, 8.46f, 3.604f)
                lineToRelative(-0.72f, 0.692f)
                arcTo(10.67f, 10.67f, 0.0f, false, false, 18.0f, 7.25f)
                curveTo(12.063f, 7.25f, 7.25f, 12.063f, 7.25f, 18.0f)
                reflectiveCurveTo(12.063f, 28.75f, 18.0f, 28.75f)
                curveToRelative(0.894f, 0.0f, 1.72f, -0.145f, 2.578f, -0.36f)
                lineToRelative(0.244f, 0.97f)
                curveToRelative(-0.903f, 0.227f, -1.817f, 0.39f, -2.822f, 0.39f)
                curveToRelative(-6.49f, 0.0f, -11.75f, -5.26f, -11.75f, -11.75f)
                reflectiveCurveTo(11.51f, 6.25f, 18.0f, 6.25f)
                moveToRelative(9.0f, 6.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 29.75f, 15.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.469f, 2.735f)
                lineTo(27.0f, 26.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 24.25f, 24.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.469f, -2.735f)
                close()
                moveTo(27.0f, 13.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 25.25f, 15.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                lineToRelative(0.179f, -0.009f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 28.75f, 24.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.571f, -1.741f)
                close()
                moveTo(18.0f, 15.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 0.0f, -5.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
            }
        }
        .build()
        return _wheelMicrophoneMedium!!
    }

private var _wheelMicrophoneMedium: ImageVector? = null
