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

public val SBBIcons.CloudSnowflakeSunMedium: ImageVector
    get() {
        if (_cloudSnowflakeSunMedium != null) {
            return _cloudSnowflakeSunMedium!!
        }
        _cloudSnowflakeSunMedium = Builder(name = "CloudSnowflakeSunMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.75f, 8.75f)
                curveToRelative(2.26f, 0.0f, 4.0f, 1.74f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.722f, -1.008f, 3.135f, -2.478f, 3.715f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -0.436f, -0.602f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, false, -1.657f, -0.877f)
                curveToRelative(0.246f, -1.255f, 0.066f, -2.376f, -0.415f, -3.296f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -1.796f, -1.851f)
                curveToRelative(0.709f, -0.677f, 1.68f, -1.089f, 2.782f, -1.089f)
                moveToRelative(-3.76f, 0.663f)
                curveToRelative(0.91f, -1.031f, 2.25f, -1.663f, 3.76f, -1.663f)
                curveToRelative(2.812f, 0.0f, 5.0f, 2.187f, 5.0f, 5.0f)
                curveToRelative(0.0f, 2.138f, -1.265f, 3.92f, -3.117f, 4.648f)
                quadToRelative(0.074f, 0.312f, 0.098f, 0.631f)
                curveToRelative(0.123f, 1.587f, -0.666f, 3.406f, -2.547f, 4.022f)
                lineToRelative(-0.31f, -0.95f)
                curveToRelative(1.337f, -0.438f, 1.957f, -1.747f, 1.86f, -2.994f)
                curveToRelative(-0.048f, -0.617f, -0.271f, -1.175f, -0.632f, -1.564f)
                curveToRelative(-0.35f, -0.378f, -0.852f, -0.62f, -1.53f, -0.594f)
                lineToRelative(-0.021f, -0.5f)
                lineToRelative(-0.48f, -0.141f)
                curveToRelative(0.379f, -1.275f, 0.233f, -2.34f, -0.193f, -3.154f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -2.012f, -1.728f)
                curveToRelative(-1.686f, -0.611f, -3.8f, -0.064f, -4.81f, 2.225f)
                lineToRelative(-0.458f, -0.202f)
                lineToRelative(-0.316f, 0.388f)
                curveToRelative(-1.626f, -1.333f, -4.281f, -0.07f, -3.984f, 2.403f)
                lineToRelative(0.066f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-1.065f, 0.0f, -1.86f, 0.956f, -1.986f, 2.231f)
                curveToRelative(-0.123f, 1.24f, 0.433f, 2.538f, 1.85f, 3.019f)
                lineToRelative(-0.321f, 0.947f)
                curveToRelative(-1.96f, -0.665f, -2.681f, -2.479f, -2.524f, -4.064f)
                curveToRelative(0.138f, -1.392f, 0.99f, -2.81f, 2.455f, -3.085f)
                curveToRelative(0.008f, -2.801f, 2.94f, -4.356f, 5.131f, -3.131f)
                curveToRelative(1.28f, -2.284f, 3.627f, -2.91f, 5.584f, -2.304f)
                moveToRelative(-5.708f, 3.424f)
                lineToRelative(0.317f, -0.387f)
                lineToRelative(0.457f, 0.201f)
                lineToRelative(-0.265f, 0.603f)
                close()
                moveTo(23.072f, 15.307f)
                lineTo(23.551f, 15.45f)
                lineTo(23.571f, 15.95f)
                lineTo(22.873f, 15.977f)
                close()
                moveTo(21.316f, 25.109f)
                lineTo(18.457f, 22.25f)
                horizontalLineToRelative(4.064f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.044f)
                lineToRelative(2.86f, -2.86f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-2.88f, 2.88f)
                lineTo(17.75f, 16.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.043f)
                lineToRelative(-2.86f, -2.86f)
                lineToRelative(-0.706f, 0.708f)
                lineToRelative(2.859f, 2.859f)
                lineTo(12.02f, 21.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.042f)
                lineToRelative(-2.858f, 2.858f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(2.838f, -2.838f)
                lineTo(16.749f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.043f)
                lineToRelative(2.859f, 2.859f)
                close()
            }
        }
        .build()
        return _cloudSnowflakeSunMedium!!
    }

private var _cloudSnowflakeSunMedium: ImageVector? = null
