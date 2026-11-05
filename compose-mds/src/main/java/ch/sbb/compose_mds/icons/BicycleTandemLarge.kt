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

public val SBBIcons.BicycleTandemLarge: ImageVector
    get() {
        if (_bicycleTandemLarge != null) {
            return _bicycleTandemLarge!!
        }
        _bicycleTandemLarge = Builder(
            name = "BicycleTandemLarge",
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
                moveToRelative(36.916f, 12.777f)
                lineToRelative(-3.84f, 5.758f)
                lineToRelative(0.82f, 1.639f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 35.5f, 20.0f)
                curveToRelative(4.136f, 0.0f, 7.5f, 3.364f, 7.5f, 7.5f)
                reflectiveCurveTo(39.636f, 35.0f, 35.5f, 35.0f)
                reflectiveCurveTo(28.0f, 31.636f, 28.0f, 27.5f)
                quadToRelative(0.001f, -0.252f, 0.019f, -0.5f)
                lineTo(18.98f, 27.0f)
                quadToRelative(0.018f, 0.248f, 0.019f, 0.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveTo(4.0f, 31.636f, 4.0f, 27.5f)
                reflectiveCurveTo(7.364f, 20.0f, 11.5f, 20.0f)
                curveToRelative(1.186f, 0.0f, 2.308f, 0.278f, 3.306f, 0.77f)
                lineTo(16.0f, 18.38f)
                lineTo(16.0f, 15.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.232f)
                lineToRelative(3.333f, -5.0f)
                lineTo(31.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.435f)
                close()
                moveTo(11.5f, 21.0f)
                arcTo(6.51f, 6.51f, 0.0f, false, false, 5.0f, 27.5f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.916f, 6.5f, -6.5f)
                quadToRelative(-0.002f, -0.252f, -0.021f, -0.5f)
                lineTo(11.69f, 27.0f)
                lineToRelative(0.362f, -0.724f)
                lineToRelative(2.305f, -4.613f)
                arcTo(6.46f, 6.46f, 0.0f, false, false, 11.5f, 21.0f)
                moveToRelative(24.0f, 0.0f)
                quadToRelative(-0.585f, 0.002f, -1.14f, 0.102f)
                lineToRelative(2.587f, 5.174f)
                lineToRelative(0.362f, 0.724f)
                horizontalLineToRelative(-8.287f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.022f, 0.5f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.916f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.916f, -6.5f, -6.5f, -6.5f)
                moveToRelative(-22.191f, 5.0f)
                horizontalLineToRelative(4.514f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, -2.602f, -3.825f)
                close()
                moveTo(15.673f, 21.27f)
                arcTo(7.52f, 7.52f, 0.0f, false, true, 18.85f, 26.0f)
                horizontalLineToRelative(3.341f)
                lineToRelative(3.5f, -7.0f)
                lineTo(16.81f, 19.0f)
                close()
                moveTo(23.309f, 26.0f)
                horizontalLineToRelative(4.841f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, true, 4.77f, -5.543f)
                lineTo(32.19f, 19.0f)
                lineTo(26.81f, 19.0f)
                close()
                moveTo(33.371f, 21.36f)
                arcTo(6.52f, 6.52f, 0.0f, false, false, 29.177f, 26.0f)
                horizontalLineToRelative(6.514f)
                close()
            }
        }
            .build()
        return _bicycleTandemLarge!!
    }

private var _bicycleTandemLarge: ImageVector? = null
