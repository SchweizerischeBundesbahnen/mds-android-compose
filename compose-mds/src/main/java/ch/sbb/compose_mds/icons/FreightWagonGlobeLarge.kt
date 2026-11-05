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

public val SBBIcons.FreightWagonGlobeLarge: ImageVector
    get() {
        if (_freightWagonGlobeLarge != null) {
            return _freightWagonGlobeLarge!!
        }
        _freightWagonGlobeLarge = Builder(
            name = "FreightWagonGlobeLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                moveTo(5.0f, 36.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(31.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                lineTo(30.0f, 39.0f)
                lineTo(17.0f, 39.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                lineTo(10.0f, 39.0f)
                lineTo(8.0f, 39.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 37.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 40.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(11.0f, 39.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                lineTo(16.0f, 39.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(31.0f, 39.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                lineTo(36.0f, 39.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(9.0f, 38.0f)
                horizontalLineToRelative(29.0f)
                verticalLineToRelative(-3.0f)
                lineTo(9.0f, 35.0f)
                close()
                moveTo(22.5f, 6.0f)
                curveTo(29.403f, 6.0f, 35.0f, 11.597f, 35.0f, 18.5f)
                reflectiveCurveTo(29.403f, 31.0f, 22.5f, 31.0f)
                reflectiveCurveTo(10.0f, 25.403f, 10.0f, 18.5f)
                reflectiveCurveTo(15.597f, 6.0f, 22.5f, 6.0f)
                moveToRelative(-4.459f, 19.0f)
                curveToRelative(0.627f, 1.854f, 1.513f, 3.497f, 2.585f, 4.845f)
                quadToRelative(0.675f, 0.111f, 1.374f, 0.142f)
                lineTo(22.0f, 25.0f)
                close()
                moveTo(23.0f, 29.987f)
                quadToRelative(0.698f, -0.031f, 1.373f, -0.142f)
                curveToRelative(1.072f, -1.348f, 1.958f, -2.99f, 2.586f, -4.845f)
                lineTo(23.0f, 25.0f)
                close()
                moveTo(13.014f, 25.0f)
                arcToRelative(11.52f, 11.52f, 0.0f, false, false, 6.12f, 4.498f)
                curveToRelative(-0.886f, -1.318f, -1.615f, -2.835f, -2.146f, -4.498f)
                close()
                moveTo(28.012f, 25.0f)
                curveToRelative(-0.53f, 1.663f, -1.26f, 3.18f, -2.146f, 4.498f)
                arcTo(11.52f, 11.52f, 0.0f, false, false, 31.986f, 25.0f)
                close()
                moveTo(11.012f, 19.0f)
                curveToRelative(0.078f, 1.806f, 0.57f, 3.503f, 1.386f, 5.0f)
                horizontalLineToRelative(4.3f)
                arcToRelative(21.6f, 21.6f, 0.0f, false, true, -0.692f, -5.0f)
                close()
                moveTo(17.006f, 19.0f)
                curveToRelative(0.04f, 1.763f, 0.297f, 3.445f, 0.728f, 5.0f)
                lineTo(22.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(23.0f, 24.0f)
                horizontalLineToRelative(4.266f)
                curveToRelative(0.431f, -1.555f, 0.687f, -3.237f, 0.727f, -5.0f)
                lineTo(23.0f, 19.0f)
                close()
                moveTo(28.994f, 19.0f)
                curveToRelative(-0.038f, 1.75f, -0.28f, 3.43f, -0.692f, 5.0f)
                horizontalLineToRelative(4.3f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, 1.385f, -5.0f)
                close()
                moveTo(12.398f, 13.0f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, -1.385f, 5.0f)
                horizontalLineToRelative(4.993f)
                curveToRelative(0.038f, -1.75f, 0.279f, -3.43f, 0.691f, -5.0f)
                close()
                moveTo(17.733f, 13.0f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, false, -0.727f, 5.0f)
                lineTo(22.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(23.0f, 18.0f)
                horizontalLineToRelative(4.993f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, false, -0.726f, -5.0f)
                lineTo(23.0f, 13.0f)
                close()
                moveTo(28.303f, 13.0f)
                curveToRelative(0.412f, 1.57f, 0.652f, 3.25f, 0.691f, 5.0f)
                horizontalLineToRelative(4.993f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, -1.385f, -5.0f)
                close()
                moveTo(19.133f, 7.501f)
                arcTo(11.52f, 11.52f, 0.0f, false, false, 13.013f, 12.0f)
                horizontalLineToRelative(3.975f)
                curveToRelative(0.53f, -1.663f, 1.259f, -3.181f, 2.145f, -4.499f)
                moveTo(22.0f, 7.011f)
                quadToRelative(-0.7f, 0.032f, -1.375f, 0.143f)
                curveToRelative(-1.072f, 1.348f, -1.957f, 2.992f, -2.584f, 4.846f)
                lineTo(22.0f, 12.0f)
                close()
                moveTo(23.0f, 12.0f)
                horizontalLineToRelative(3.959f)
                curveToRelative(-0.627f, -1.854f, -1.513f, -3.498f, -2.585f, -4.846f)
                quadToRelative(-0.675f, -0.11f, -1.374f, -0.142f)
                close()
                moveTo(25.867f, 7.501f)
                curveToRelative(0.886f, 1.318f, 1.614f, 2.836f, 2.145f, 4.499f)
                horizontalLineToRelative(3.974f)
                arcToRelative(11.52f, 11.52f, 0.0f, false, false, -6.119f, -4.499f)
            }
        }
            .build()
        return _freightWagonGlobeLarge!!
    }

private var _freightWagonGlobeLarge: ImageVector? = null
