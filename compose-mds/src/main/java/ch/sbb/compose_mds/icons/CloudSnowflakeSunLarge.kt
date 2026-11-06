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

public val SBBIcons.CloudSnowflakeSunLarge: ImageVector
    get() {
        if (_cloudSnowflakeSunLarge != null) {
            return _cloudSnowflakeSunLarge!!
        }
        _cloudSnowflakeSunLarge = Builder(name = "CloudSnowflakeSunLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 28.32f)
                lineToRelative(4.125f, -4.125f)
                lineToRelative(0.706f, 0.707f)
                lineTo(23.734f, 29.0f)
                horizontalLineToRelative(6.294f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.32f)
                lineToRelative(4.096f, 4.097f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(23.0f, 30.707f)
                verticalLineTo(37.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.267f)
                lineToRelative(-4.069f, 4.07f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(21.32f, 30.0f)
                horizontalLineToRelative(-6.292f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.266f)
                lineToRelative(-4.097f, -4.097f)
                lineToRelative(0.707f, -0.707f)
                lineTo(22.0f, 28.293f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(32.5f, 11.0f)
                curveToRelative(3.658f, 0.0f, 6.5f, 2.842f, 6.5f, 6.5f)
                curveToRelative(0.0f, 2.835f, -1.71f, 5.185f, -4.192f, 6.095f)
                curveToRelative(0.084f, 0.312f, 0.143f, 0.634f, 0.168f, 0.959f)
                curveToRelative(0.16f, 2.058f, -0.865f, 4.4f, -3.281f, 5.19f)
                lineToRelative(-0.155f, -0.475f)
                lineToRelative(-0.157f, -0.476f)
                curveToRelative(1.874f, -0.613f, 2.729f, -2.444f, 2.596f, -4.162f)
                curveToRelative(-0.066f, -0.853f, -0.376f, -1.635f, -0.887f, -2.186f)
                curveToRelative(-0.5f, -0.54f, -1.217f, -0.883f, -2.17f, -0.844f)
                lineToRelative(-0.699f, 0.027f)
                lineToRelative(0.198f, -0.67f)
                curveToRelative(0.516f, -1.736f, 0.32f, -3.2f, -0.27f, -4.328f)
                curveToRelative(-0.594f, -1.134f, -1.605f, -1.96f, -2.773f, -2.384f)
                curveToRelative(-2.323f, -0.843f, -5.236f, -0.083f, -6.622f, 3.057f)
                lineToRelative(-0.265f, 0.601f)
                lineToRelative(-0.51f, -0.417f)
                curveToRelative(-2.285f, -1.874f, -5.996f, -0.09f, -5.583f, 3.354f)
                lineToRelative(0.066f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-1.54f, 0.0f, -2.64f, 1.38f, -2.814f, 3.125f)
                curveToRelative(-0.169f, 1.71f, 0.6f, 3.528f, 2.579f, 4.2f)
                lineToRelative(-0.16f, 0.472f)
                lineToRelative(-0.162f, 0.474f)
                curveToRelative(-2.522f, -0.856f, -3.455f, -3.188f, -3.252f, -5.244f)
                curveToRelative(0.184f, -1.857f, 1.338f, -3.7f, 3.278f, -3.988f)
                curveToRelative(-0.092f, -3.762f, 3.876f, -5.832f, 6.737f, -4.085f)
                curveToRelative(1.67f, -3.135f, 4.831f, -3.966f, 7.433f, -3.11f)
                curveTo(28.723f, 11.854f, 30.494f, 11.0f, 32.5f, 11.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-1.595f, 0.0f, -2.998f, 0.63f, -3.985f, 1.657f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.522f, 2.508f)
                curveToRelative(0.645f, 1.232f, 0.875f, 2.749f, 0.502f, 4.458f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 2.287f, 1.142f)
                curveToRelative(0.248f, 0.268f, 0.456f, 0.57f, 0.625f, 0.895f)
                curveToRelative(2.098f, -0.763f, 3.55f, -2.742f, 3.55f, -5.16f)
                curveToRelative(0.0f, -3.106f, -2.395f, -5.5f, -5.5f, -5.5f)
            }
        }
        .build()
        return _cloudSnowflakeSunLarge!!
    }

private var _cloudSnowflakeSunLarge: ImageVector? = null
