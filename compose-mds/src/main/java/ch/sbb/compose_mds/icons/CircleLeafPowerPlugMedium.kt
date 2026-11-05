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

public val SBBIcons.CircleLeafPowerPlugMedium: ImageVector
    get() {
        if (_circleLeafPowerPlugMedium != null) {
            return _circleLeafPowerPlugMedium!!
        }
        _circleLeafPowerPlugMedium = Builder(
            name = "CircleLeafPowerPlugMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveToRelative(12.02f, 4.364f)
                lineToRelative(-0.175f, -0.622f)
                lineToRelative(-0.558f, 0.327f)
                curveToRelative(-0.06f, 0.035f, -0.163f, 0.09f, -0.299f, 0.162f)
                curveToRelative(-0.612f, 0.325f, -1.884f, 1.002f, -2.805f, 1.784f)
                curveToRelative(-0.68f, 0.58f, -1.16f, 1.048f, -1.524f, 1.555f)
                curveToRelative(-0.368f, 0.514f, -0.6f, 1.044f, -0.818f, 1.72f)
                curveToRelative(-0.252f, 0.782f, -0.333f, 1.672f, -0.355f, 2.435f)
                curveToRelative(-0.015f, 0.519f, -0.002f, 1.024f, 0.007f, 1.388f)
                lineToRelative(0.006f, 0.301f)
                curveTo(4.993f, 14.829f, 4.75f, 16.436f, 4.75f, 18.0f)
                curveToRelative(0.0f, 7.318f, 5.932f, 13.25f, 13.25f, 13.25f)
                reflectiveCurveTo(31.25f, 25.318f, 31.25f, 18.0f)
                reflectiveCurveTo(25.318f, 4.75f, 18.0f, 4.75f)
                verticalLineToRelative(1.0f)
                curveToRelative(6.765f, 0.0f, 12.25f, 5.485f, 12.25f, 12.25f)
                reflectiveCurveTo(24.765f, 30.25f, 18.0f, 30.25f)
                reflectiveCurveTo(5.75f, 24.765f, 5.75f, 18.0f)
                curveToRelative(0.0f, -1.396f, 0.207f, -2.813f, 0.625f, -4.058f)
                curveToRelative(0.431f, -0.077f, 1.08f, -0.197f, 1.735f, -0.368f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 1.22f, -0.393f)
                curveToRelative(0.376f, -0.152f, 0.745f, -0.343f, 1.018f, -0.586f)
                quadToRelative(0.042f, -0.038f, 0.109f, -0.092f)
                curveToRelative(0.44f, -0.367f, 1.578f, -1.315f, 1.936f, -3.263f)
                curveToRelative(0.157f, -0.85f, 0.12f, -1.858f, 0.022f, -2.738f)
                curveToRelative(-0.1f, -0.886f, -0.267f, -1.685f, -0.394f, -2.138f)
                moveTo(8.832f, 6.777f)
                curveToRelative(0.745f, -0.633f, 1.72f, -1.175f, 2.374f, -1.527f)
                curveToRelative(0.079f, 0.382f, 0.16f, 0.856f, 0.216f, 1.363f)
                curveToRelative(0.095f, 0.843f, 0.12f, 1.737f, -0.01f, 2.446f)
                curveToRelative(-0.293f, 1.583f, -1.177f, 2.326f, -1.605f, 2.684f)
                lineToRelative(-0.123f, 0.105f)
                curveToRelative(-0.148f, 0.132f, -0.394f, 0.27f, -0.729f, 0.407f)
                curveToRelative(-0.327f, 0.133f, -0.707f, 0.25f, -1.096f, 0.351f)
                curveToRelative(-0.49f, 0.128f, -0.977f, 0.226f, -1.37f, 0.3f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, -0.002f, -1.152f)
                curveToRelative(0.02f, -0.73f, 0.098f, -1.51f, 0.307f, -2.157f)
                curveToRelative(0.2f, -0.62f, 0.392f, -1.044f, 0.679f, -1.444f)
                curveToRelative(0.291f, -0.407f, 0.697f, -0.813f, 1.36f, -1.376f)
                moveTo(17.5f, 23.721f)
                verticalLineToRelative(3.28f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.28f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, 3.75f, -4.22f)
                verticalLineToRelative(-2.75f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-3.5f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.75f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, 3.75f, 4.22f)
                moveToRelative(-2.75f, -4.22f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(1.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
            }
        }
            .build()
        return _circleLeafPowerPlugMedium!!
    }

private var _circleLeafPowerPlugMedium: ImageVector? = null
