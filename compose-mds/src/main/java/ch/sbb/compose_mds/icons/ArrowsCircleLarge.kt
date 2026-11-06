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

public val SBBIcons.ArrowsCircleLarge: ImageVector
    get() {
        if (_arrowsCircleLarge != null) {
            return _arrowsCircleLarge!!
        }
        _arrowsCircleLarge = Builder(name = "ArrowsCircleLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.0f, 23.5f)
                curveTo(39.0f, 32.06f, 32.06f, 39.0f, 23.5f, 39.0f)
                curveToRelative(-5.89f, 0.0f, -11.703f, -3.295f, -14.486f, -8.185f)
                lineTo(9.0f, 37.5f)
                lineToRelative(-1.0f, -0.002f)
                lineToRelative(0.02f, -8.98f)
                lineToRelative(0.001f, -0.498f)
                lineToRelative(0.498f, -0.002f)
                lineToRelative(8.98f, -0.02f)
                lineToRelative(0.002f, 1.0f)
                lineToRelative(-8.262f, 0.017f)
                curveTo(11.464f, 34.262f, 17.416f, 38.0f, 23.5f, 38.0f)
                curveTo(31.508f, 38.0f, 38.0f, 31.508f, 38.0f, 23.5f)
                close()
                moveTo(23.55f, 8.027f)
                curveToRelative(3.038f, 0.006f, 6.253f, 1.226f, 9.009f, 3.097f)
                curveToRelative(2.173f, 1.475f, 4.087f, 3.376f, 5.425f, 5.456f)
                lineTo(38.0f, 9.52f)
                lineToRelative(1.0f, 0.001f)
                lineToRelative(-0.02f, 8.98f)
                lineToRelative(-0.002f, 0.5f)
                horizontalLineTo(29.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.666f)
                curveToRelative(-1.241f, -2.28f, -3.277f, -4.427f, -5.669f, -6.05f)
                curveToRelative(-2.64f, -1.792f, -5.663f, -2.918f, -8.45f, -2.924f)
                curveTo(15.54f, 9.01f, 9.038f, 15.492f, 9.022f, 23.5f)
                lineToRelative(-1.0f, -0.002f)
                curveTo(8.037f, 14.938f, 14.99f, 8.01f, 23.55f, 8.027f)
            }
        }
        .build()
        return _arrowsCircleLarge!!
    }

private var _arrowsCircleLarge: ImageVector? = null
