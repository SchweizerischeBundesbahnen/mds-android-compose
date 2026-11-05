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

public val SBBIcons.RunLarge: ImageVector
    get() {
        if (_runLarge != null) {
            return _runLarge!!
        }
        _runLarge = Builder(name = "RunLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(41.968f, 12.676f)
                lineToRelative(-3.273f, 8.726f)
                lineToRelative(-3.888f, -3.888f)
                lineToRelative(-1.751f, 8.756f)
                lineTo(39.0f, 30.232f)
                lineTo(39.0f, 40.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.232f)
                lineTo(32.349f, 27.0f)
                lineTo(28.86f, 27.0f)
                lineToRelative(-1.944f, 5.834f)
                lineToRelative(-0.16f, 0.095f)
                lineToRelative(-10.0f, 6.0f)
                lineToRelative(-0.513f, -0.858f)
                lineToRelative(9.84f, -5.904f)
                lineToRelative(1.934f, -5.8f)
                lineToRelative(1.838f, -9.191f)
                lineToRelative(-6.733f, 1.683f)
                lineToRelative(1.858f, 6.503f)
                lineToRelative(-0.96f, 0.276f)
                lineToRelative(-2.0f, -7.0f)
                lineToRelative(-0.143f, -0.497f)
                lineToRelative(0.502f, -0.126f)
                lineToRelative(8.0f, -2.0f)
                lineToRelative(0.06f, -0.015f)
                horizontalLineToRelative(4.268f)
                lineToRelative(3.598f, 3.598f)
                lineToRelative(2.727f, -7.274f)
                close()
                moveTo(29.276f, 26.0f)
                horizontalLineToRelative(2.814f)
                lineToRelative(1.8f, -9.0f)
                horizontalLineToRelative(-2.813f)
                close()
                moveTo(18.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(32.5f, 8.0f)
                curveToRelative(1.342f, 0.0f, 2.5f, 1.158f, 2.5f, 2.5f)
                reflectiveCurveTo(33.842f, 13.0f, 32.5f, 13.0f)
                reflectiveCurveTo(30.0f, 11.842f, 30.0f, 10.5f)
                reflectiveCurveTo(31.158f, 8.0f, 32.5f, 8.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.79f, 0.0f, -1.5f, 0.71f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.71f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.71f, 1.5f, -1.5f)
                reflectiveCurveTo(33.29f, 9.0f, 32.5f, 9.0f)
            }
        }
        .build()
        return _runLarge!!
    }

private var _runLarge: ImageVector? = null
