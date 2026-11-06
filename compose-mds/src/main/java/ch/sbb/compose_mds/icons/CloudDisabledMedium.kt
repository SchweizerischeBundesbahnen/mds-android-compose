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

public val SBBIcons.CloudDisabledMedium: ImageVector
    get() {
        if (_cloudDisabledMedium != null) {
            return _cloudDisabledMedium!!
        }
        _cloudDisabledMedium = Builder(name = "CloudDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(30.707f, 30.0f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-6.634f, -6.634f)
                quadToRelative(-0.271f, 0.029f, -0.561f, 0.03f)
                horizontalLineToRelative(-10.5f)
                curveToRelative(-1.374f, 0.0f, -2.415f, -0.44f, -3.123f, -1.15f)
                curveToRelative(-0.702f, -0.704f, -1.035f, -1.632f, -1.075f, -2.538f)
                curveToRelative(-0.04f, -0.903f, 0.21f, -1.818f, 0.714f, -2.52f)
                curveToRelative(0.417f, -0.58f, 1.015f, -1.02f, 1.758f, -1.163f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, 2.174f, -3.272f)
                lineTo(6.0f, 6.707f)
                lineTo(6.707f, 6.0f)
                close()
                moveTo(13.546f, 14.253f)
                curveToRelative(-1.158f, 0.258f, -2.13f, 1.33f, -1.944f, 2.871f)
                lineToRelative(0.066f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-0.617f, 0.0f, -1.117f, 0.302f, -1.471f, 0.794f)
                curveToRelative(-0.36f, 0.502f, -0.558f, 1.191f, -0.528f, 1.893f)
                curveToRelative(0.031f, 0.699f, 0.285f, 1.376f, 0.784f, 1.876f)
                curveToRelative(0.492f, 0.494f, 1.264f, 0.857f, 2.415f, 0.857f)
                horizontalLineToRelative(10.092f)
                close()
                moveTo(16.016f, 13.136f)
                curveToRelative(1.496f, -2.122f, 4.012f, -2.464f, 5.919f, -1.566f)
                curveToRelative(1.789f, 0.843f, 3.045f, 2.773f, 2.548f, 5.297f)
                curveToRelative(1.304f, 0.191f, 2.159f, 1.128f, 2.48f, 2.244f)
                curveToRelative(0.366f, 1.268f, 0.065f, 2.81f, -1.017f, 3.85f)
                lineToRelative(-0.346f, -0.36f)
                lineToRelative(-0.346f, -0.36f)
                curveToRelative(0.79f, -0.76f, 1.021f, -1.908f, 0.749f, -2.852f)
                curveToRelative(-0.265f, -0.92f, -0.987f, -1.601f, -2.128f, -1.556f)
                lineToRelative(-0.7f, 0.028f)
                lineToRelative(0.201f, -0.67f)
                curveToRelative(0.696f, -2.332f, -0.369f, -4.01f, -1.868f, -4.716f)
                curveToRelative(-1.524f, -0.718f, -3.493f, -0.439f, -4.676f, 1.238f)
                lineToRelative(-0.408f, -0.29f)
                close()
            }
        }
        .build()
        return _cloudDisabledMedium!!
    }

private var _cloudDisabledMedium: ImageVector? = null
