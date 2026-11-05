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

public val SBBIcons.CloudSnowflakeLarge: ImageVector
    get() {
        if (_cloudSnowflakeLarge != null) {
            return _cloudSnowflakeLarge!!
        }
        _cloudSnowflakeLarge = Builder(
            name = "CloudSnowflakeLarge",
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
                moveToRelative(24.0f, 28.32f)
                lineToRelative(4.125f, -4.125f)
                lineToRelative(0.707f, 0.707f)
                lineTo(24.735f, 29.0f)
                horizontalLineToRelative(6.294f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.322f)
                lineToRelative(4.097f, 4.097f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(24.0f, 30.707f)
                lineTo(24.0f, 37.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.266f)
                lineToRelative(-4.068f, 4.069f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(22.32f, 30.0f)
                horizontalLineToRelative(-6.292f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.264f)
                lineToRelative(-4.096f, -4.097f)
                lineToRelative(0.707f, -0.707f)
                lineTo(23.0f, 28.293f)
                lineTo(23.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(21.107f, 16.354f)
                curveToRelative(1.708f, -3.207f, 4.98f, -4.004f, 7.613f, -3.05f)
                curveToRelative(1.382f, 0.502f, 2.597f, 1.488f, 3.316f, 2.86f)
                curveToRelative(0.646f, 1.232f, 0.876f, 2.749f, 0.502f, 4.458f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 2.287f, 1.142f)
                curveToRelative(0.692f, 0.745f, 1.07f, 1.754f, 1.15f, 2.789f)
                curveToRelative(0.16f, 2.058f, -0.864f, 4.4f, -3.28f, 5.19f)
                lineToRelative(-0.156f, -0.475f)
                lineToRelative(-0.156f, -0.476f)
                curveToRelative(1.874f, -0.613f, 2.729f, -2.444f, 2.596f, -4.162f)
                curveToRelative(-0.066f, -0.853f, -0.376f, -1.635f, -0.887f, -2.186f)
                curveToRelative(-0.501f, -0.54f, -1.217f, -0.883f, -2.17f, -0.844f)
                lineToRelative(-0.7f, 0.027f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.515f, -1.736f, 0.32f, -3.2f, -0.271f, -4.328f)
                curveToRelative(-0.594f, -1.134f, -1.605f, -1.96f, -2.773f, -2.384f)
                curveToRelative(-2.323f, -0.842f, -5.237f, -0.083f, -6.622f, 3.057f)
                lineToRelative(-0.265f, 0.601f)
                lineToRelative(-0.51f, -0.417f)
                curveToRelative(-2.286f, -1.873f, -5.996f, -0.089f, -5.583f, 3.354f)
                lineToRelative(0.066f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-1.54f, 0.0f, -2.64f, 1.38f, -2.814f, 3.125f)
                curveToRelative(-0.17f, 1.71f, 0.6f, 3.528f, 2.578f, 4.2f)
                lineToRelative(-0.16f, 0.472f)
                lineToRelative(-0.161f, 0.474f)
                curveToRelative(-2.522f, -0.856f, -3.456f, -3.188f, -3.252f, -5.244f)
                curveToRelative(0.184f, -1.857f, 1.338f, -3.7f, 3.277f, -3.988f)
                curveToRelative(-0.091f, -3.761f, 3.877f, -5.832f, 6.738f, -4.085f)
            }
        }
            .build()
        return _cloudSnowflakeLarge!!
    }

private var _cloudSnowflakeLarge: ImageVector? = null
