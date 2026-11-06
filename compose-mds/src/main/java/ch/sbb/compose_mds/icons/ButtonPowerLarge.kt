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

public val SBBIcons.ButtonPowerLarge: ImageVector
    get() {
        if (_buttonPowerLarge != null) {
            return _buttonPowerLarge!!
        }
        _buttonPowerLarge = Builder(name = "ButtonPowerLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.768f, 14.862f)
                curveTo(32.912f, 16.914f, 35.0f, 20.47f, 35.0f, 24.5f)
                curveToRelative(0.0f, 6.342f, -5.16f, 11.5f, -11.5f, 11.5f)
                reflectiveCurveTo(12.0f, 30.841f, 12.0f, 24.499f)
                curveToRelative(0.0f, -4.027f, 2.087f, -7.565f, 5.227f, -9.618f)
                lineToRelative(0.273f, 0.418f)
                lineToRelative(0.273f, 0.419f)
                curveTo(14.902f, 17.596f, 13.0f, 20.827f, 13.0f, 24.499f)
                curveToRelative(0.0f, 5.79f, 4.712f, 10.5f, 10.5f, 10.5f)
                reflectiveCurveToRelative(10.5f, -4.71f, 10.5f, -10.5f)
                curveToRelative(0.0f, -3.677f, -1.904f, -6.923f, -4.78f, -8.799f)
                close()
                moveTo(24.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _buttonPowerLarge!!
    }

private var _buttonPowerLarge: ImageVector? = null
