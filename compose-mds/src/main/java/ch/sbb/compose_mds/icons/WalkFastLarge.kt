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

public val SBBIcons.WalkFastLarge: ImageVector
    get() {
        if (_walkFastLarge != null) {
            return _walkFastLarge!!
        }
        _walkFastLarge = Builder(name = "WalkFastLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(36.782f, 20.074f)
                lineToRelative(4.905f, 1.962f)
                lineToRelative(-0.372f, 0.928f)
                lineToRelative(-5.0f, -2.0f)
                lineToRelative(-0.095f, -0.038f)
                lineToRelative(-3.411f, -3.411f)
                lineToRelative(-1.767f, 8.82f)
                lineToRelative(3.813f, 3.811f)
                lineToRelative(0.195f, 0.195f)
                lineToRelative(-0.06f, 0.267f)
                lineToRelative(-2.002f, 9.0f)
                lineToRelative(-0.976f, -0.216f)
                lineToRelative(1.942f, -8.733f)
                lineTo(30.293f, 27.0f)
                horizontalLineToRelative(-3.291f)
                verticalLineToRelative(5.708f)
                lineToRelative(-6.146f, 6.147f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(5.854f, -5.854f)
                lineTo(26.002f, 27.0f)
                horizontalLineToRelative(-0.11f)
                lineToRelative(0.12f, -0.598f)
                lineToRelative(1.762f, -8.818f)
                lineToRelative(-4.843f, 3.23f)
                lineToRelative(-1.95f, 6.824f)
                lineToRelative(-0.96f, -0.276f)
                lineToRelative(2.0f, -7.0f)
                lineToRelative(0.05f, -0.176f)
                lineToRelative(0.153f, -0.102f)
                lineTo(28.35f, 16.0f)
                horizontalLineToRelative(4.358f)
                close()
                moveTo(20.0f, 33.0f)
                lineTo(9.0f, 33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(16.0f, 27.0f)
                lineTo(5.0f, 27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(28.127f, 20.926f)
                lineTo(27.111f, 26.0f)
                horizontalLineToRelative(2.979f)
                lineToRelative(1.802f, -9.0f)
                horizontalLineToRelative(-2.98f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(24.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(30.482f, 8.0f)
                curveToRelative(1.342f, 0.0f, 2.5f, 1.158f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.158f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.158f, -2.5f, -2.5f)
                reflectiveCurveTo(29.14f, 8.0f, 30.482f, 8.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.79f, 0.0f, -1.5f, 0.71f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.71f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.71f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.71f, -1.5f, -1.5f, -1.5f)
            }
        }
        .build()
        return _walkFastLarge!!
    }

private var _walkFastLarge: ImageVector? = null
