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

public val SBBIcons.WheelchairSubstituteTransportMedium: ImageVector
    get() {
        if (_wheelchairSubstituteTransportMedium != null) {
            return _wheelchairSubstituteTransportMedium!!
        }
        _wheelchairSubstituteTransportMedium = Builder(name = "WheelchairSubstituteTransportMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.75f, 32.75f)
                lineTo(3.25f, 32.75f)
                lineTo(3.25f, 3.25f)
                horizontalLineToRelative(29.5f)
                close()
                moveTo(4.25f, 31.75f)
                horizontalLineToRelative(27.5f)
                lineTo(31.75f, 4.25f)
                lineTo(4.25f, 4.25f)
                close()
                moveTo(13.25f, 21.25f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(7.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.25f)
                horizontalLineToRelative(-6.0f)
                lineTo(12.25f, 15.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.407f, 18.905f)
                curveTo(8.945f, 19.57f, 8.0f, 21.035f, 8.0f, 22.8f)
                curveToRelative(0.0f, 2.424f, 2.026f, 4.45f, 4.45f, 4.45f)
                curveToRelative(1.732f, 0.0f, 3.23f, -1.068f, 4.06f, -2.59f)
                lineToRelative(0.879f, 0.48f)
                curveToRelative(-0.97f, 1.777f, -2.771f, 3.11f, -4.939f, 3.11f)
                curveTo(9.474f, 28.25f, 7.0f, 25.776f, 7.0f, 22.8f)
                curveToRelative(0.0f, -2.135f, 1.155f, -3.97f, 2.993f, -4.805f)
                close()
                moveTo(26.234f, 7.75f)
                curveToRelative(1.208f, 0.0f, 2.0f, 1.007f, 2.0f, 2.0f)
                verticalLineToRelative(0.632f)
                horizontalLineToRelative(0.712f)
                verticalLineToRelative(0.5f)
                lineToRelative(0.001f, 1.499f)
                lineToRelative(0.001f, 0.5f)
                horizontalLineToRelative(-0.714f)
                verticalLineToRelative(4.113f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-0.744f)
                horizontalLineToRelative(-3.5f)
                lineTo(22.234f, 17.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-4.118f)
                horizontalLineToRelative(-0.703f)
                verticalLineToRelative(-0.501f)
                lineToRelative(0.001f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.702f)
                lineTo(19.734f, 9.75f)
                curveToRelative(0.0f, -0.564f, 0.19f, -1.073f, 0.559f, -1.441f)
                curveToRelative(0.369f, -0.37f, 0.878f, -0.559f, 1.441f, -0.559f)
                close()
                moveTo(20.734f, 15.25f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(12.75f, 10.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(8.984f, -3.0f)
                curveToRelative(-0.336f, 0.0f, -0.578f, 0.11f, -0.734f, 0.266f)
                reflectiveCurveToRelative(-0.266f, 0.398f, -0.266f, 0.734f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.507f, -0.408f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _wheelchairSubstituteTransportMedium!!
    }

private var _wheelchairSubstituteTransportMedium: ImageVector? = null
