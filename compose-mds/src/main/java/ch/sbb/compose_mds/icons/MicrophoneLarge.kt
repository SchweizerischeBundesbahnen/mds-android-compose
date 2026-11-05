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

public val SBBIcons.MicrophoneLarge: ImageVector
    get() {
        if (_microphoneLarge != null) {
            return _microphoneLarge!!
        }
        _microphoneLarge = Builder(
            name = "MicrophoneLarge",
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
                moveTo(14.0f, 28.499f)
                curveToRelative(0.0f, 5.18f, 4.182f, 8.5f, 9.5f, 8.5f)
                curveToRelative(5.32f, 0.0f, 9.5f, -3.32f, 9.5f, -8.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 5.696f, -4.497f, 9.284f, -10.0f, 9.49f)
                verticalLineToRelative(5.01f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(18.0f, 43.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.01f)
                curveToRelative(-5.501f, -0.206f, -10.0f, -3.794f, -10.0f, -9.49f)
                close()
                moveTo(23.5f, 4.999f)
                curveToRelative(3.576f, 0.0f, 6.5f, 2.926f, 6.5f, 6.5f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 3.576f, -2.924f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.924f, -6.5f, -6.5f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -3.574f, 2.924f, -6.5f, 6.5f, -6.5f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-3.024f, 0.0f, -5.5f, 2.478f, -5.5f, 5.5f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 3.024f, 2.476f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.476f, 5.5f, -5.5f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -3.022f, -2.476f, -5.5f, -5.5f, -5.5f)
                moveTo(27.0f, 25.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(27.0f, 20.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(27.0f, 15.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
            .build()
        return _microphoneLarge!!
    }

private var _microphoneLarge: ImageVector? = null
