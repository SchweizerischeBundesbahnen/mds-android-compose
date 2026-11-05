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

public val SBBIcons.CoinDollarMedium: ImageVector
    get() {
        if (_coinDollarMedium != null) {
            return _coinDollarMedium!!
        }
        _coinDollarMedium = Builder(name = "CoinDollarMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.25f)
                curveTo(10.406f, 4.25f, 4.25f, 10.406f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(31.75f, 25.594f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 4.25f, 18.0f, 4.25f)
                moveTo(3.25f, 18.0f)
                curveTo(3.25f, 9.853f, 9.853f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(32.75f, 9.853f, 32.75f, 18.0f)
                reflectiveCurveTo(26.147f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(3.25f, 26.147f, 3.25f, 18.0f)
                moveToRelative(15.402f, 6.127f)
                quadToRelative(1.232f, -0.01f, 2.02f, -0.77f)
                quadToRelative(0.784f, -0.76f, 0.784f, -1.948f)
                quadToRelative(0.001f, -1.22f, -0.68f, -1.928f)
                quadToRelative(-0.679f, -0.706f, -2.124f, -0.972f)
                close()
                moveTo(17.485f, 11.427f)
                quadToRelative(-1.03f, 0.031f, -1.614f, 0.434f)
                quadToRelative(-1.042f, 0.722f, -1.042f, 2.082f)
                quadToRelative(0.0f, 1.063f, 0.65f, 1.677f)
                quadToRelative(0.646f, 0.618f, 2.006f, 0.85f)
                close()
                moveTo(12.759f, 20.727f)
                horizontalLineToRelative(1.804f)
                quadToRelative(0.0f, 3.231f, 2.922f, 3.4f)
                verticalLineToRelative(-5.873f)
                quadToRelative(-1.624f, -0.275f, -2.74f, -0.987f)
                quadToRelative(-1.7f, -1.073f, -1.7f, -3.175f)
                quadToRelative(0.0f, -1.795f, 1.205f, -2.927f)
                quadToRelative(1.207f, -1.13f, 3.235f, -1.227f)
                verticalLineToRelative(-1.9f)
                horizontalLineToRelative(1.167f)
                verticalLineToRelative(1.9f)
                quadToRelative(2.02f, 0.16f, 3.059f, 1.19f)
                quadToRelative(1.127f, 1.105f, 1.104f, 2.91f)
                lineTo(21.03f, 14.038f)
                quadToRelative(-0.169f, -2.517f, -2.379f, -2.601f)
                verticalLineToRelative(5.32f)
                quadToRelative(1.34f, 0.34f, 1.854f, 0.52f)
                quadToRelative(0.516f, 0.181f, 0.962f, 0.467f)
                quadToRelative(1.773f, 1.148f, 1.773f, 3.494f)
                quadToRelative(0.0f, 2.422f, -1.976f, 3.685f)
                quadToRelative(-0.945f, 0.607f, -2.613f, 0.702f)
                verticalLineToRelative(2.337f)
                horizontalLineToRelative(-1.167f)
                verticalLineToRelative(-2.337f)
                quadToRelative(-2.39f, -0.149f, -3.547f, -1.423f)
                quadToRelative(-1.19f, -1.317f, -1.18f, -3.474f)
                moveTo(13.3f, 7.235f)
                arcToRelative(11.77f, 11.77f, 0.0f, false, false, -6.607f, 7.633f)
                lineToRelative(0.964f, 0.267f)
                curveToRelative(0.87f, -3.135f, 3.107f, -5.7f, 6.044f, -6.983f)
                close()
            }
        }
        .build()
        return _coinDollarMedium!!
    }

private var _coinDollarMedium: ImageVector? = null
