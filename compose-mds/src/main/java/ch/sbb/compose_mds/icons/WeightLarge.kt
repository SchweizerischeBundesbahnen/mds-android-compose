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

public val SBBIcons.WeightLarge: ImageVector
    get() {
        if (_weightLarge != null) {
            return _weightLarge!!
        }
        _weightLarge = Builder(name = "WeightLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 6.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.826f, 8.0f)
                lineTo(36.93f, 14.0f)
                lineToRelative(0.065f, 0.424f)
                lineToRelative(4.0f, 26.0f)
                lineToRelative(0.089f, 0.576f)
                lineTo(5.917f, 41.0f)
                lineToRelative(0.089f, -0.576f)
                lineToRelative(4.0f, -26.0f)
                lineTo(10.07f, 14.0f)
                horizontalLineToRelative(10.603f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 23.5f, 6.0f)
                moveTo(7.083f, 40.0f)
                horizontalLineToRelative(32.834f)
                lineToRelative(-3.846f, -25.0f)
                lineTo(10.93f, 15.0f)
                close()
                moveTo(29.058f, 23.247f)
                quadToRelative(2.25f, 0.001f, 3.664f, 1.454f)
                arcToRelative(4.26f, 4.26f, 0.0f, false, true, 1.212f, 2.578f)
                lineTo(31.52f, 27.279f)
                curveToRelative(-0.127f, -0.616f, -0.404f, -1.094f, -0.84f, -1.438f)
                quadToRelative(-0.654f, -0.515f, -1.652f, -0.514f)
                quadToRelative(-1.516f, 0.0f, -2.344f, 1.17f)
                quadToRelative(-0.726f, 1.023f, -0.726f, 2.766f)
                quadToRelative(0.0f, 1.702f, 0.678f, 2.704f)
                quadToRelative(0.837f, 1.225f, 2.47f, 1.226f)
                quadToRelative(1.18f, -0.001f, 1.934f, -0.71f)
                quadToRelative(0.753f, -0.713f, 0.792f, -1.868f)
                horizontalLineToRelative(-2.538f)
                verticalLineToRelative(-1.828f)
                horizontalLineToRelative(4.796f)
                verticalLineToRelative(6.156f)
                horizontalLineToRelative(-1.594f)
                lineToRelative(-0.25f, -1.304f)
                quadToRelative(-1.266f, 1.576f, -3.414f, 1.578f)
                quadToRelative(-2.617f, 0.002f, -4.132f, -1.938f)
                quadToRelative(-1.258f, -1.618f, -1.258f, -3.992f)
                quadToRelative(0.0f, -2.695f, 1.64f, -4.414f)
                quadToRelative(1.54f, -1.626f, 3.976f, -1.626f)
                moveToRelative(-13.522f, 5.0f)
                lineToRelative(4.476f, -4.725f)
                horizontalLineToRelative(3.156f)
                lineToRelative(-4.476f, 4.515f)
                lineToRelative(4.898f, 6.906f)
                horizontalLineToRelative(-3.148f)
                lineToRelative(-3.468f, -5.126f)
                lineToRelative(-1.438f, 1.438f)
                verticalLineToRelative(3.688f)
                horizontalLineToRelative(-2.492f)
                lineTo(13.044f, 23.522f)
                horizontalLineToRelative(2.492f)
                close()
                moveTo(23.5f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
            }
        }
        .build()
        return _weightLarge!!
    }

private var _weightLarge: ImageVector? = null
