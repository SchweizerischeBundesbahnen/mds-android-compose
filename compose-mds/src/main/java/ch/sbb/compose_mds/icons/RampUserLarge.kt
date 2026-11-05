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

public val SBBIcons.RampUserLarge: ImageVector
    get() {
        if (_rampUserLarge != null) {
            return _rampUserLarge!!
        }
        _rampUserLarge = Builder(name = "RampUserLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.947f, 20.276f)
                lineToRelative(1.98f, 3.96f)
                lineTo(17.9f, 28.2f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-3.0f, -4.0f)
                lineToRelative(-0.027f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineTo(13.0f, 22.617f)
                verticalLineToRelative(7.765f)
                lineToRelative(2.0f, 4.0f)
                verticalLineToRelative(6.187f)
                lineToRelative(27.35f, -8.547f)
                lineToRelative(0.65f, -0.202f)
                lineTo(43.0f, 43.0f)
                lineTo(10.5f, 43.0f)
                lineToRelative(-0.15f, -0.977f)
                lineTo(14.0f, 40.882f)
                verticalLineToRelative(-6.264f)
                lineTo(12.191f, 31.0f)
                lineTo(9.0f, 31.0f)
                verticalLineToRelative(13.0f)
                lineTo(8.0f, 44.0f)
                lineTo(8.0f, 21.707f)
                lineToRelative(-3.0f, 3.0f)
                lineTo(5.0f, 30.0f)
                lineTo(4.0f, 30.0f)
                verticalLineToRelative(-5.707f)
                lineTo(8.293f, 20.0f)
                horizontalLineToRelative(4.516f)
                close()
                moveTo(13.777f, 42.0f)
                lineTo(42.0f, 42.0f)
                verticalLineToRelative(-8.82f)
                close()
                moveTo(9.0f, 30.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                lineTo(9.0f, 21.0f)
                close()
                moveTo(10.5f, 12.0f)
                curveToRelative(1.342f, 0.0f, 2.5f, 1.158f, 2.5f, 2.5f)
                reflectiveCurveTo(11.842f, 17.0f, 10.5f, 17.0f)
                reflectiveCurveTo(8.0f, 15.842f, 8.0f, 14.5f)
                reflectiveCurveTo(9.158f, 12.0f, 10.5f, 12.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.79f, 0.0f, -1.5f, 0.71f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.71f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.71f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.71f, -1.5f, -1.5f, -1.5f)
            }
        }
        .build()
        return _rampUserLarge!!
    }

private var _rampUserLarge: ImageVector? = null
