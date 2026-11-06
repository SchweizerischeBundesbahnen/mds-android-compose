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

public val SBBIcons.WalkSlowLarge: ImageVector
    get() {
        if (_walkSlowLarge != null) {
            return _walkSlowLarge!!
        }
        _walkSlowLarge = Builder(name = "WalkSlowLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.69f, 37.615f)
                arcToRelative(1.001f, 1.001f, 0.0f, true, true, -0.374f, 1.928f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, true, -0.555f, -1.304f)
                curveToRelative(0.158f, -0.388f, 0.533f, -0.624f, 0.928f, -0.624f)
                moveToRelative(13.258f, -21.339f)
                lineToRelative(1.98f, 3.96f)
                lineTo(34.9f, 24.2f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-3.0f, -4.0f)
                lineToRelative(-0.027f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineTo(30.0f, 18.615f)
                verticalLineToRelative(7.949f)
                lineToRelative(1.942f, 3.705f)
                lineToRelative(0.058f, 0.108f)
                verticalLineToRelative(9.124f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-8.879f)
                lineToRelative(-1.802f, -3.436f)
                lineTo(26.0f, 27.186f)
                verticalLineToRelative(5.35f)
                lineToRelative(-0.005f, 0.035f)
                lineToRelative(-1.0f, 7.0f)
                lineToRelative(-0.495f, -0.07f)
                lineToRelative(-0.495f, -0.071f)
                lineToRelative(0.995f, -6.966f)
                lineTo(25.0f, 17.708f)
                lineToRelative(-2.999f, 2.999f)
                lineTo(22.001f, 25.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.207f)
                lineTo(25.294f, 16.0f)
                horizontalLineToRelative(4.516f)
                close()
                moveTo(12.981f, 36.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.003f, 1.997f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.002f, -1.997f)
                moveToRelative(9.054f, -9.36f)
                lineToRelative(-4.12f, 10.201f)
                lineToRelative(-0.188f, 0.465f)
                lineToRelative(-0.465f, -0.19f)
                lineToRelative(-3.704f, -1.511f)
                lineToRelative(-0.461f, -0.189f)
                lineToRelative(0.186f, -0.462f)
                lineToRelative(2.248f, -5.564f)
                lineToRelative(0.189f, -0.465f)
                lineToRelative(0.464f, 0.19f)
                lineToRelative(3.239f, 1.319f)
                lineToRelative(1.684f, -4.168f)
                close()
                moveTo(14.397f, 34.982f)
                lineTo(17.174f, 36.117f)
                lineTo(19.048f, 31.479f)
                lineTo(16.269f, 30.346f)
                close()
                moveTo(26.0f, 26.186f)
                horizontalLineToRelative(3.0f)
                lineTo(29.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(27.5f, 8.0f)
                curveToRelative(1.342f, 0.0f, 2.5f, 1.158f, 2.5f, 2.5f)
                reflectiveCurveTo(28.842f, 13.0f, 27.5f, 13.0f)
                reflectiveCurveTo(25.0f, 11.842f, 25.0f, 10.5f)
                reflectiveCurveTo(26.158f, 8.0f, 27.5f, 8.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.79f, 0.0f, -1.5f, 0.71f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.71f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.71f, 1.5f, -1.5f)
                reflectiveCurveTo(28.29f, 9.0f, 27.5f, 9.0f)
            }
        }
        .build()
        return _walkSlowLarge!!
    }

private var _walkSlowLarge: ImageVector? = null
