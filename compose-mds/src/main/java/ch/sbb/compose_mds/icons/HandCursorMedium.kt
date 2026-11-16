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

public val SBBIcons.HandCursorMedium: ImageVector
    get() {
        if (_handCursorMedium != null) {
            return _handCursorMedium!!
        }
        _handCursorMedium = Builder(name = "HandCursorMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.75f, 8.25f)
                curveToRelative(0.0f, -0.549f, -0.451f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.451f, -1.0f, 1.0f)
                verticalLineToRelative(15.577f)
                lineToRelative(-0.854f, -0.853f)
                lineToRelative(-3.434f, -3.436f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -1.423f, 0.0f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, -0.248f, 0.607f)
                curveToRelative(0.01f, 0.243f, 0.114f, 0.548f, 0.328f, 0.921f)
                curveToRelative(0.231f, 0.403f, 1.62f, 2.757f, 2.953f, 5.016f)
                lineToRelative(0.088f, 0.148f)
                lineToRelative(1.716f, 2.906f)
                lineToRelative(0.387f, 0.655f)
                lineToRelative(0.197f, 0.332f)
                lineToRelative(0.075f, 0.127f)
                lineTo(24.59f, 30.25f)
                lineToRelative(0.02f, -0.044f)
                quadToRelative(0.021f, -0.042f, 0.043f, -0.092f)
                curveToRelative(0.119f, -0.27f, 0.28f, -0.68f, 0.443f, -1.227f)
                curveToRelative(0.325f, -1.094f, 0.654f, -2.734f, 0.654f, -4.887f)
                verticalLineToRelative(-5.25f)
                curveToRelative(0.0f, -0.549f, -0.451f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.544f, 0.0f, -0.991f, 0.443f, -1.0f, 0.984f)
                verticalLineToRelative(0.766f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0.0f, -0.549f, -0.451f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.451f, -1.0f, 1.0f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.75f)
                curveToRelative(0.0f, -0.549f, -0.451f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.451f, -1.0f, 1.0f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(20.738f, 15.527f)
                arcToRelative(2.005f, 2.005f, 0.0f, false, false, -1.988f, -1.777f)
                curveToRelative(-0.364f, 0.0f, -0.706f, 0.098f, -1.0f, 0.27f)
                lineTo(17.75f, 8.25f)
                curveToRelative(0.0f, -1.101f, -0.899f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.899f, -2.0f, 2.0f)
                verticalLineToRelative(13.162f)
                lineToRelative(-2.581f, -2.58f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, -2.838f, 0.0f)
                curveToRelative(-0.392f, 0.39f, -0.56f, 0.857f, -0.539f, 1.354f)
                curveToRelative(0.02f, 0.473f, 0.208f, 0.94f, 0.459f, 1.378f)
                curveToRelative(0.234f, 0.408f, 1.628f, 2.772f, 2.96f, 5.027f)
                lineToRelative(1.37f, 2.32f)
                lineToRelative(0.004f, 0.005f)
                lineToRelative(0.43f, 0.729f)
                lineToRelative(0.387f, 0.653f)
                lineToRelative(0.198f, 0.334f)
                lineToRelative(0.107f, 0.18f)
                lineToRelative(0.056f, 0.095f)
                lineToRelative(0.01f, 0.02f)
                lineToRelative(0.017f, 0.028f)
                lineToRelative(0.015f, 0.025f)
                lineToRelative(0.007f, 0.012f)
                lineToRelative(0.003f, 0.003f)
                lineToRelative(0.001f, 0.003f)
                lineToRelative(0.002f, 0.003f)
                verticalLineToRelative(0.002f)
                horizontalLineToRelative(0.001f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.146f, 0.245f)
                horizontalLineToRelative(11.224f)
                lineToRelative(0.144f, -0.25f)
                lineToRelative(-0.433f, -0.25f)
                lineToRelative(0.433f, 0.249f)
                horizontalLineToRelative(0.001f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.002f, -0.003f)
                lineToRelative(0.002f, -0.003f)
                lineToRelative(0.002f, -0.005f)
                lineToRelative(0.002f, -0.004f)
                lineToRelative(0.013f, -0.022f)
                lineToRelative(0.048f, -0.094f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.165f, -0.35f)
                curveToRelative(0.135f, -0.307f, 0.312f, -0.757f, 0.487f, -1.346f)
                curveToRelative(0.35f, -1.18f, 0.695f, -2.915f, 0.695f, -5.171f)
                verticalLineToRelative(-5.25f)
                curveToRelative(0.0f, -1.101f, -0.899f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.369f, 0.0f, -0.715f, 0.1f, -1.012f, 0.276f)
                arcToRelative(2.006f, 2.006f, 0.0f, false, false, -1.988f, -1.776f)
                curveToRelative(-0.369f, 0.0f, -0.715f, 0.1f, -1.012f, 0.277f)
            }
        }
        .build()
        return _handCursorMedium!!
    }

private var _handCursorMedium: ImageVector? = null
