package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ArrowsCircleMedium: ImageVector
    get() {
        if (_arrowsCircleMedium != null) {
            return _arrowsCircleMedium!!
        }
        _arrowsCircleMedium = Builder(name = "ArrowsCircleMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.265f, 18.0f)
                curveToRelative(0.011f, -5.936f, 4.833f, -10.74f, 10.77f, -10.73f)
                curveToRelative(2.058f, 0.005f, 4.3f, 0.838f, 6.267f, 2.172f)
                curveToRelative(1.715f, 1.165f, 3.183f, 2.687f, 4.11f, 4.308f)
                lineTo(22.5f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.234f)
                lineToRelative(0.001f, -0.499f)
                lineToRelative(0.015f, -6.735f)
                lineToRelative(-1.0f, -0.002f)
                lineToRelative(-0.01f, 4.882f)
                curveToRelative(-0.999f, -1.44f, -2.356f, -2.749f, -3.877f, -3.781f)
                curveToRelative(-2.081f, -1.413f, -4.516f, -2.34f, -6.826f, -2.344f)
                curveToRelative(-6.49f, -0.013f, -11.76f, 5.238f, -11.772f, 11.728f)
                close()
                moveTo(7.494f, 22.263f)
                lineTo(13.501f, 22.249f)
                lineTo(13.499f, 21.249f)
                lineTo(6.764f, 21.265f)
                horizontalLineToRelative(-0.498f)
                lineToRelative(-0.001f, 0.498f)
                lineToRelative(-0.015f, 6.735f)
                lineToRelative(1.0f, 0.003f)
                lineToRelative(0.01f, -4.562f)
                curveTo(9.451f, 27.432f, 13.7f, 29.75f, 18.0f, 29.75f)
                curveToRelative(6.49f, 0.0f, 11.75f, -5.26f, 11.75f, -11.75f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 5.937f, -4.813f, 10.75f, -10.75f, 10.75f)
                curveToRelative(-4.45f, 0.0f, -8.802f, -2.694f, -10.506f, -6.487f)
            }
        }
        .build()
        return _arrowsCircleMedium!!
    }

private var _arrowsCircleMedium: ImageVector? = null
