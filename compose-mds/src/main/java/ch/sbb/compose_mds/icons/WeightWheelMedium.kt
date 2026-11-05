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

public val SBBIcons.WeightWheelMedium: ImageVector
    get() {
        if (_weightWheelMedium != null) {
            return _weightWheelMedium!!
        }
        _weightWheelMedium = Builder(name = "WeightWheelMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.746f, 22.566f)
                curveTo(28.98f, 28.318f, 24.01f, 32.75f, 18.0f, 32.75f)
                curveToRelative(-6.005f, 0.0f, -10.972f, -4.439f, -11.745f, -10.184f)
                lineToRelative(0.99f, -0.132f)
                curveTo(7.952f, 27.682f, 12.496f, 31.75f, 18.0f, 31.75f)
                curveToRelative(5.51f, 0.0f, 10.053f, -4.062f, 10.754f, -9.316f)
                close()
                moveTo(26.742f, 22.592f)
                curveTo(25.98f, 26.655f, 22.35f, 29.75f, 18.0f, 29.75f)
                curveToRelative(-4.358f, 0.0f, -7.99f, -3.081f, -8.742f, -7.16f)
                lineToRelative(0.984f, -0.18f)
                curveToRelative(0.664f, 3.598f, 3.878f, 6.34f, 7.758f, 6.34f)
                curveToRelative(3.87f, 0.0f, 7.086f, -2.753f, 7.759f, -6.342f)
                close()
                moveTo(16.869f, 22.162f)
                curveToRelative(0.319f, 0.348f, 0.75f, 0.588f, 1.131f, 0.588f)
                curveToRelative(0.436f, 0.0f, 0.813f, -0.202f, 1.113f, -0.567f)
                lineToRelative(0.774f, 0.634f)
                curveToRelative(-0.456f, 0.555f, -1.1f, 0.933f, -1.887f, 0.933f)
                curveToRelative(-0.76f, 0.0f, -1.44f, -0.443f, -1.869f, -0.912f)
                close()
                moveTo(18.0f, 3.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.121f, 4.5f)
                horizontalLineToRelative(6.52f)
                lineToRelative(3.25f, 13.0f)
                lineTo(6.11f, 20.75f)
                lineToRelative(3.25f, -13.0f)
                horizontalLineToRelative(6.52f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.0f, 3.25f)
                moveTo(7.39f, 19.75f)
                horizontalLineToRelative(21.22f)
                lineToRelative(-2.75f, -11.0f)
                lineTo(10.14f, 8.75f)
                close()
                moveTo(13.396f, 13.625f)
                lineTo(16.046f, 10.5f)
                horizontalLineToRelative(1.815f)
                lineToRelative(-2.652f, 2.969f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(-1.814f)
                lineToRelative(-1.953f, -3.281f)
                lineToRelative(-0.837f, 0.937f)
                lineTo(13.396f, 18.0f)
                lineTo(12.0f, 18.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1.396f)
                close()
                moveTo(21.273f, 10.5f)
                quadToRelative(1.227f, 0.0f, 2.046f, 0.9f)
                curveToRelative(0.408f, 0.45f, 0.681f, 1.05f, 0.681f, 1.65f)
                horizontalLineToRelative(-1.364f)
                quadToRelative(-0.204f, -0.675f, -0.41f, -0.9f)
                curveToRelative(-0.272f, -0.15f, -0.544f, -0.3f, -0.953f, -0.3f)
                curveToRelative(-0.546f, 0.0f, -0.955f, 0.3f, -1.364f, 0.75f)
                curveToRelative(-0.272f, 0.3f, -0.409f, 0.9f, -0.409f, 1.65f)
                reflectiveCurveToRelative(0.137f, 1.35f, 0.41f, 1.65f)
                curveToRelative(0.272f, 0.45f, 0.817f, 0.75f, 1.363f, 0.75f)
                curveToRelative(0.409f, 0.0f, 0.818f, -0.15f, 1.09f, -0.45f)
                reflectiveCurveToRelative(0.41f, -0.75f, 0.41f, -1.2f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.2f)
                lineTo(24.0f, 13.8f)
                verticalLineToRelative(3.9f)
                horizontalLineToRelative(-0.955f)
                lineToRelative(-0.136f, -0.75f)
                curveTo(22.364f, 17.55f, 21.82f, 18.0f, 21.0f, 18.0f)
                curveToRelative(-0.954f, 0.0f, -1.773f, -0.45f, -2.318f, -1.2f)
                curveToRelative(-0.41f, -0.75f, -0.682f, -1.5f, -0.682f, -2.55f)
                curveToRelative(0.0f, -1.2f, 0.273f, -2.1f, 0.954f, -2.7f)
                curveToRelative(0.546f, -0.75f, 1.364f, -1.05f, 2.319f, -1.05f)
                moveTo(18.0f, 4.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
            }
        }
        .build()
        return _weightWheelMedium!!
    }

private var _weightWheelMedium: ImageVector? = null
