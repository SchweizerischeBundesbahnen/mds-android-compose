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

public val SBBIcons.SunriseLarge: ImageVector
    get() {
        if (_sunriseLarge != null) {
            return _sunriseLarge!!
        }
        _sunriseLarge = Builder(
            name = "SunriseLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(37.986f, 34.0f)
                lineTo(9.0f, 34.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(28.986f)
                close()
                moveTo(24.5f, 17.0f)
                curveToRelative(4.712f, 0.0f, 8.5f, 3.79f, 8.5f, 8.5f)
                curveToRelative(0.0f, 2.02f, -0.758f, 3.86f, -1.91f, 5.306f)
                lineToRelative(-0.39f, -0.312f)
                lineToRelative(-0.391f, -0.311f)
                curveTo(31.337f, 28.89f, 32.0f, 27.265f, 32.0f, 25.5f)
                curveToRelative(0.0f, -4.158f, -3.34f, -7.5f, -7.5f, -7.5f)
                arcToRelative(7.48f, 7.48f, 0.0f, false, false, -7.5f, 7.5f)
                curveToRelative(0.0f, 1.75f, 0.532f, 3.444f, 1.496f, 4.695f)
                lineToRelative(-0.396f, 0.305f)
                lineToRelative(-0.396f, 0.305f)
                curveTo(16.588f, 29.356f, 16.0f, 27.44f, 16.0f, 25.5f)
                curveToRelative(0.0f, -4.71f, 3.79f, -8.5f, 8.5f, -8.5f)
                moveTo(14.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(42.0f, 26.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(37.16f, 13.74f)
                lineTo(32.627f, 18.241f)
                lineTo(31.922f, 17.532f)
                lineTo(36.454f, 13.03f)
                close()
                moveTo(17.264f, 17.36f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-0.352f, 0.354f)
                lineToRelative(-4.537f, -4.515f)
                lineToRelative(0.706f, -0.71f)
                close()
                moveTo(25.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _sunriseLarge!!
    }

private var _sunriseLarge: ImageVector? = null
