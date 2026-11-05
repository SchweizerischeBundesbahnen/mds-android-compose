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

public val SBBIcons.MicrophoneDisabledLarge: ImageVector
    get() {
        if (_microphoneDisabledLarge != null) {
            return _microphoneDisabledLarge!!
        }
        _microphoneDisabledLarge = Builder(name = "MicrophoneDisabledLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(41.854f, 41.147f)
                lineToRelative(-0.707f, 0.706f)
                lineToRelative(-9.5f, -9.498f)
                curveToRelative(-1.732f, 2.824f, -4.953f, 4.496f, -8.647f, 4.634f)
                lineTo(23.0f, 42.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(17.0f, 43.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.01f)
                curveToRelative(-5.502f, -0.206f, -10.0f, -3.795f, -10.0f, -9.49f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 5.18f, 4.18f, 8.5f, 9.5f, 8.5f)
                curveToRelative(3.718f, 0.0f, 6.857f, -1.649f, 8.417f, -4.376f)
                lineToRelative(-2.483f, -2.483f)
                curveTo(27.417f, 31.408f, 25.139f, 33.0f, 22.5f, 33.0f)
                curveToRelative(-3.576f, 0.0f, -6.5f, -2.924f, -6.5f, -6.5f)
                verticalLineToRelative(-9.793f)
                lineTo(5.146f, 5.854f)
                lineToRelative(0.708f, -0.708f)
                close()
                moveTo(17.0f, 26.5f)
                curveToRelative(0.0f, 3.024f, 2.476f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.365f, 0.0f, 4.396f, -1.516f, 5.167f, -3.626f)
                lineTo(17.0f, 17.707f)
                close()
                moveTo(22.5f, 4.0f)
                curveToRelative(3.576f, 0.0f, 6.5f, 2.924f, 6.5f, 6.5f)
                lineTo(29.0f, 24.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(28.0f, 10.5f)
                curveTo(28.0f, 7.476f, 25.524f, 5.0f, 22.5f, 5.0f)
                reflectiveCurveTo(17.0f, 7.476f, 17.0f, 10.5f)
                lineTo(17.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                curveTo(16.0f, 6.924f, 18.924f, 4.0f, 22.5f, 4.0f)
                moveTo(26.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(26.0f, 15.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _microphoneDisabledLarge!!
    }

private var _microphoneDisabledLarge: ImageVector? = null
