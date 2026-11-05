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

public val SBBIcons.WheelchairSubstituteTransportLarge: ImageVector
    get() {
        if (_wheelchairSubstituteTransportLarge != null) {
            return _wheelchairSubstituteTransportLarge!!
        }
        _wheelchairSubstituteTransportLarge = Builder(name = "WheelchairSubstituteTransportLarge",
                defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f,
                viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.0f, 43.0f)
                lineTo(4.0f, 43.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(39.0f)
                close()
                moveTo(5.0f, 42.0f)
                horizontalLineToRelative(37.0f)
                lineTo(42.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(17.0f, 28.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(16.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.1f, 24.1f)
                lineTo(13.307f, 24.556f)
                curveTo(11.295f, 25.47f, 10.0f, 27.486f, 10.0f, 29.9f)
                curveToRelative(0.0f, 3.324f, 2.776f, 6.1f, 6.1f, 6.1f)
                curveToRelative(2.382f, 0.0f, 4.43f, -1.467f, 5.561f, -3.54f)
                lineToRelative(0.439f, 0.24f)
                lineToRelative(0.44f, 0.24f)
                curveTo(21.27f, 35.267f, 18.916f, 37.0f, 16.1f, 37.0f)
                curveTo(12.224f, 37.0f, 9.0f, 33.776f, 9.0f, 29.9f)
                curveToRelative(0.0f, -2.785f, 1.505f, -5.17f, 3.894f, -6.255f)
                close()
                moveTo(34.48f, 10.0f)
                curveToRelative(1.508f, 0.0f, 2.5f, 1.257f, 2.5f, 2.5f)
                verticalLineToRelative(1.009f)
                horizontalLineToRelative(0.449f)
                lineToRelative(0.5f, -0.001f)
                verticalLineToRelative(0.5f)
                lineToRelative(0.002f, 2.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.95f)
                lineTo(36.981f, 21.0f)
                horizontalLineToRelative(-0.003f)
                verticalLineToRelative(0.993f)
                horizontalLineToRelative(-3.0f)
                lineTo(33.978f, 21.0f)
                lineTo(28.98f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.491f)
                horizontalLineToRelative(-0.938f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.001f, -2.0f)
                verticalLineToRelative(-0.501f)
                horizontalLineToRelative(0.938f)
                lineTo(25.981f, 12.5f)
                curveToRelative(0.0f, -0.714f, 0.24f, -1.347f, 0.696f, -1.804f)
                curveToRelative(0.456f, -0.456f, 1.09f, -0.696f, 1.803f, -0.696f)
                close()
                moveTo(26.98f, 20.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(16.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(11.98f, -4.0f)
                curveToRelative(-0.486f, 0.0f, -0.853f, 0.16f, -1.096f, 0.403f)
                reflectiveCurveToRelative(-0.404f, 0.61f, -0.404f, 1.097f)
                lineTo(26.98f, 16.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.757f, -0.608f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _wheelchairSubstituteTransportLarge!!
    }

private var _wheelchairSubstituteTransportLarge: ImageVector? = null
