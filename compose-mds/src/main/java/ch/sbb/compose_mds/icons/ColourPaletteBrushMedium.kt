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

public val SBBIcons.ColourPaletteBrushMedium: ImageVector
    get() {
        if (_colourPaletteBrushMedium != null) {
            return _colourPaletteBrushMedium!!
        }
        _colourPaletteBrushMedium = Builder(name = "ColourPaletteBrushMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.763f, 8.464f)
                curveToRelative(0.566f, -1.598f, 1.718f, -3.276f, 4.115f, -3.998f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -0.262f, 1.135f)
                curveToRelative(-0.157f, 1.268f, 0.082f, 2.94f, 1.582f, 4.582f)
                arcTo(3.2f, 3.2f, 0.0f, false, true, 31.75f, 12.0f)
                curveToRelative(0.0f, 1.001f, -0.46f, 1.881f, -1.176f, 2.485f)
                horizontalLineToRelative(-4.148f)
                curveToRelative(-0.716f, -0.604f, -1.176f, -1.484f, -1.176f, -2.485f)
                verticalLineToRelative(-0.02f)
                lineToRelative(-0.002f, -0.018f)
                verticalLineToRelative(-0.014f)
                lineToRelative(-0.003f, -0.052f)
                lineToRelative(-0.006f, -0.21f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.025f, -0.78f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 0.5f, -2.442f)
                moveTo(24.25f, 12.01f)
                lineToRelative(0.001f, 0.007f)
                curveToRelative(0.005f, 1.3f, 0.601f, 2.432f, 1.5f, 3.205f)
                lineTo(25.751f, 30.0f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, false, 2.75f, 2.75f)
                arcTo(2.747f, 2.747f, 0.0f, false, false, 31.25f, 30.0f)
                lineTo(31.25f, 15.223f)
                curveToRelative(0.903f, -0.777f, 1.5f, -1.915f, 1.5f, -3.223f)
                curveToRelative(0.0f, -0.897f, -0.271f, -1.732f, -0.75f, -2.417f)
                lineToRelative(-0.02f, -0.027f)
                lineToRelative(-0.022f, -0.025f)
                curveToRelative(-1.299f, -1.409f, -1.476f, -2.787f, -1.35f, -3.807f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, true, 0.502f, -1.598f)
                quadToRelative(0.03f, -0.058f, 0.048f, -0.085f)
                lineToRelative(0.01f, -0.018f)
                lineToRelative(0.003f, -0.003f)
                lineToRelative(0.618f, -0.956f)
                lineToRelative(-1.124f, 0.193f)
                curveToRelative(-3.498f, 0.6f, -5.12f, 2.826f, -5.844f, 4.873f)
                curveToRelative(-0.36f, 1.015f, -0.501f, 1.987f, -0.554f, 2.702f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.021f, 1.111f)
                close()
                moveTo(30.251f, 15.484f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(2.765f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(26.75f, 30.0f)
                lineTo(26.75f, 19.25f)
                horizontalLineToRelative(3.5f)
                lineTo(30.25f, 30.0f)
                curveToRelative(0.0f, 0.969f, -0.781f, 1.75f, -1.75f, 1.75f)
                reflectiveCurveToRelative(-1.75f, -0.781f, -1.75f, -1.75f)
                moveTo(18.0f, 7.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveTo(15.25f, 9.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                moveToRelative(-4.75f, 2.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveTo(7.75f, 13.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                moveToRelative(7.0f, 13.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                moveToRelative(1.75f, -2.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -5.5f)
                moveToRelative(1.919f, -20.985f)
                curveToRelative(-7.22f, -0.202f, -13.306f, 4.798f, -14.812f, 11.506f)
                verticalLineToRelative(0.001f)
                curveToRelative(-0.41f, 1.851f, 0.79f, 3.549f, 2.511f, 4.094f)
                curveToRelative(2.737f, 0.875f, 4.632f, 3.195f, 4.632f, 5.884f)
                curveToRelative(0.0f, 0.758f, -0.152f, 1.485f, -0.438f, 2.14f)
                lineToRelative(-0.002f, 0.005f)
                curveToRelative(-0.723f, 1.704f, -0.083f, 3.762f, 1.644f, 4.564f)
                horizontalLineToRelative(0.003f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, false, 6.028f, 1.291f)
                curveToRelative(2.144f, 0.0f, 4.316f, -0.497f, 6.212f, -1.382f)
                lineToRelative(-0.424f, -0.906f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, -5.788f, 1.288f)
                curveToRelative(-2.0f, 0.0f, -3.908f, -0.42f, -5.61f, -1.2f)
                curveToRelative(-1.181f, -0.548f, -1.681f, -1.997f, -1.146f, -3.262f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 0.52f, -2.538f)
                curveToRelative(0.0f, -3.191f, -2.244f, -5.85f, -5.327f, -6.836f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-1.308f, -0.415f, -2.118f, -1.657f, -1.838f, -2.925f)
                curveTo(5.987f, 8.736f, 11.66f, 4.077f, 18.39f, 4.265f)
                curveToRelative(1.908f, 0.058f, 3.73f, 0.52f, 5.394f, 1.316f)
                lineToRelative(0.432f, -0.902f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, -5.796f, -1.414f)
                close()
            }
        }
        .build()
        return _colourPaletteBrushMedium!!
    }

private var _colourPaletteBrushMedium: ImageVector? = null
