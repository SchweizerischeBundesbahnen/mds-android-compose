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

public val SBBIcons.CarProfileRoofLarge: ImageVector
    get() {
        if (_carProfileRoofLarge != null) {
            return _carProfileRoofLarge!!
        }
        _carProfileRoofLarge = Builder(
            name = "CarProfileRoofLarge",
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
                moveTo(25.669f, 26.0f)
                curveToRelative(0.505f, 0.0f, 0.983f, 0.21f, 1.331f, 0.575f)
                lineToRelative(4.924f, 5.153f)
                lineToRelative(3.202f, 0.002f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.31f, 0.013f, 0.757f, 0.12f, 1.14f, 0.413f)
                curveToRelative(0.405f, 0.309f, 0.711f, 0.808f, 0.711f, 1.52f)
                lineTo(37.0f, 39.386f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.142f)
                curveToRelative(-0.231f, 1.605f, -1.559f, 2.864f, -3.2f, 2.864f)
                curveToRelative(-1.64f, 0.0f, -2.97f, -1.259f, -3.201f, -2.863f)
                horizontalLineToRelative(-7.282f)
                curveToRelative(-0.232f, 1.604f, -1.56f, 2.863f, -3.2f, 2.863f)
                curveToRelative(-1.642f, 0.0f, -2.971f, -1.26f, -3.202f, -2.864f)
                lineTo(10.0f, 39.886f)
                verticalLineToRelative(-7.121f)
                curveToRelative(0.0f, -0.462f, 0.16f, -0.911f, 0.455f, -1.265f)
                lineToRelative(4.041f, -4.832f)
                arcTo(1.85f, 1.85f, 0.0f, false, true, 15.911f, 26.0f)
                close()
                moveTo(15.975f, 37.023f)
                curveToRelative(-1.214f, 0.0f, -2.238f, 1.038f, -2.238f, 2.365f)
                curveToRelative(0.0f, 1.326f, 1.024f, 2.363f, 2.238f, 2.363f)
                curveToRelative(1.212f, 0.0f, 2.236f, -1.037f, 2.236f, -2.363f)
                reflectiveCurveToRelative(-1.024f, -2.364f, -2.236f, -2.365f)
                moveToRelative(13.683f, 0.0f)
                curveToRelative(-1.213f, 0.0f, -2.237f, 1.038f, -2.237f, 2.365f)
                curveToRelative(0.0f, 1.326f, 1.024f, 2.363f, 2.237f, 2.363f)
                reflectiveCurveToRelative(2.236f, -1.037f, 2.236f, -2.363f)
                reflectiveCurveToRelative(-1.022f, -2.364f, -2.236f, -2.365f)
                moveToRelative(2.053f, -4.295f)
                lineTo(11.003f, 32.728f)
                quadToRelative(-0.001f, 0.019f, -0.003f, 0.038f)
                verticalLineToRelative(6.12f)
                horizontalLineToRelative(1.773f)
                curveToRelative(0.231f, -1.604f, 1.56f, -2.863f, 3.202f, -2.863f)
                curveToRelative(1.64f, 0.0f, 2.968f, 1.26f, 3.2f, 2.865f)
                horizontalLineToRelative(7.282f)
                curveToRelative(0.231f, -1.605f, 1.56f, -2.864f, 3.201f, -2.865f)
                curveToRelative(1.641f, 0.0f, 2.969f, 1.26f, 3.2f, 2.864f)
                lineTo(36.0f, 38.887f)
                lineToRelative(-0.003f, -5.225f)
                curveToRelative(0.0f, -0.39f, -0.151f, -0.598f, -0.317f, -0.724f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.567f, -0.209f)
                close()
                moveTo(26.0f, 35.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(15.911f, 27.0f)
                curveToRelative(-0.241f, 0.0f, -0.48f, 0.11f, -0.647f, 0.31f)
                lineToRelative(-3.695f, 4.419f)
                horizontalLineToRelative(8.01f)
                lineTo(19.579f, 27.0f)
                close()
                moveTo(20.579f, 31.729f)
                horizontalLineToRelative(9.963f)
                lineToRelative(-4.266f, -4.462f)
                arcTo(0.84f, 0.84f, 0.0f, false, false, 25.67f, 27.0f)
                horizontalLineToRelative(-5.09f)
                close()
                moveTo(31.777f, 15.084f)
                lineTo(43.777f, 23.084f)
                lineTo(43.223f, 23.916f)
                lineTo(31.414f, 16.044f)
                lineTo(3.638f, 23.98f)
                lineToRelative(-0.276f, -0.96f)
                lineToRelative(28.0f, -8.0f)
                lineToRelative(0.223f, -0.064f)
                close()
            }
        }
            .build()
        return _carProfileRoofLarge!!
    }

private var _carProfileRoofLarge: ImageVector? = null
