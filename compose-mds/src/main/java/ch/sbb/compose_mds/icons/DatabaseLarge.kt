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

public val SBBIcons.DatabaseLarge: ImageVector
    get() {
        if (_databaseLarge != null) {
            return _databaseLarge!!
        }
        _databaseLarge = Builder(
            name = "DatabaseLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveTo(23.5f, 6.0f)
                curveToRelative(4.763f, 0.0f, 9.063f, 0.563f, 12.188f, 1.484f)
                curveToRelative(1.56f, 0.46f, 2.856f, 1.018f, 3.773f, 1.66f)
                curveToRelative(0.903f, 0.632f, 1.539f, 1.42f, 1.539f, 2.356f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 1.074f, -0.69f, 1.936f, -1.682f, 2.603f)
                curveToRelative(-0.996f, 0.67f, -2.386f, 1.21f, -4.003f, 1.632f)
                curveToRelative(-3.243f, 0.849f, -7.54f, 1.268f, -11.815f, 1.268f)
                reflectiveCurveToRelative(-8.572f, -0.42f, -11.814f, -1.268f)
                curveToRelative(-1.618f, -0.423f, -3.008f, -0.961f, -4.004f, -1.632f)
                curveTo(6.69f, 37.436f, 6.0f, 36.575f, 6.0f, 35.5f)
                verticalLineToRelative(-24.0f)
                curveToRelative(0.0f, -0.936f, 0.636f, -1.724f, 1.54f, -2.356f)
                curveToRelative(0.916f, -0.642f, 2.212f, -1.2f, 3.772f, -1.66f)
                curveTo(14.437f, 6.563f, 18.737f, 6.0f, 23.5f, 6.0f)
                moveTo(40.0f, 29.593f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.68f, 0.54f)
                curveToRelative(-0.997f, 0.673f, -2.388f, 1.214f, -4.005f, 1.639f)
                curveToRelative(-3.243f, 0.851f, -7.54f, 1.272f, -11.815f, 1.272f)
                reflectiveCurveToRelative(-8.571f, -0.421f, -11.814f, -1.272f)
                curveToRelative(-1.618f, -0.425f, -3.009f, -0.966f, -4.005f, -1.64f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.681f, -0.54f)
                lineTo(7.0f, 35.5f)
                curveToRelative(0.0f, 0.593f, 0.373f, 1.19f, 1.24f, 1.773f)
                curveToRelative(0.863f, 0.58f, 2.13f, 1.085f, 3.7f, 1.496f)
                curveToRelative(3.132f, 0.819f, 7.336f, 1.234f, 11.56f, 1.234f)
                reflectiveCurveToRelative(8.428f, -0.415f, 11.56f, -1.234f)
                curveToRelative(1.57f, -0.411f, 2.837f, -0.915f, 3.7f, -1.496f)
                curveToRelative(0.867f, -0.583f, 1.24f, -1.18f, 1.24f, -1.773f)
                close()
                moveTo(40.0f, 21.573f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.68f, 0.538f)
                curveToRelative(-0.997f, 0.673f, -2.388f, 1.214f, -4.005f, 1.639f)
                curveToRelative(-3.243f, 0.852f, -7.54f, 1.273f, -11.815f, 1.273f)
                reflectiveCurveToRelative(-8.571f, -0.421f, -11.814f, -1.273f)
                curveToRelative(-1.618f, -0.425f, -3.009f, -0.966f, -4.005f, -1.639f)
                arcTo(5.4f, 5.4f, 0.0f, false, true, 7.0f, 21.572f)
                verticalLineToRelative(5.95f)
                lineToRelative(0.005f, 0.11f)
                curveToRelative(0.044f, 0.561f, 0.423f, 1.124f, 1.236f, 1.673f)
                curveToRelative(0.863f, 0.582f, 2.13f, 1.088f, 3.699f, 1.5f)
                curveToRelative(3.132f, 0.822f, 7.336f, 1.239f, 11.56f, 1.239f)
                reflectiveCurveToRelative(8.429f, -0.417f, 11.56f, -1.24f)
                curveToRelative(1.57f, -0.411f, 2.836f, -0.917f, 3.699f, -1.5f)
                curveToRelative(0.813f, -0.548f, 1.192f, -1.11f, 1.236f, -1.671f)
                lineToRelative(0.005f, -0.111f)
                close()
                moveTo(40.0f, 13.428f)
                quadToRelative(-0.248f, 0.225f, -0.54f, 0.428f)
                curveToRelative(-0.916f, 0.642f, -2.212f, 1.2f, -3.772f, 1.66f)
                curveTo(32.563f, 16.437f, 28.263f, 17.0f, 23.5f, 17.0f)
                reflectiveCurveToRelative(-9.063f, -0.563f, -12.188f, -1.484f)
                curveToRelative(-1.56f, -0.46f, -2.856f, -1.018f, -3.773f, -1.66f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 7.0f, 13.428f)
                lineTo(7.0f, 19.5f)
                curveToRelative(0.0f, 0.597f, 0.374f, 1.198f, 1.241f, 1.783f)
                curveToRelative(0.863f, 0.582f, 2.13f, 1.088f, 3.699f, 1.5f)
                curveToRelative(3.132f, 0.823f, 7.335f, 1.24f, 11.56f, 1.24f)
                reflectiveCurveToRelative(8.429f, -0.417f, 11.56f, -1.24f)
                curveToRelative(1.57f, -0.412f, 2.836f, -0.918f, 3.699f, -1.5f)
                curveTo(39.626f, 20.698f, 40.0f, 20.097f, 40.0f, 19.5f)
                close()
                moveTo(23.5f, 7.0f)
                curveToRelative(-4.696f, 0.0f, -8.897f, 0.556f, -11.906f, 1.443f)
                curveToRelative(-1.508f, 0.445f, -2.69f, 0.964f, -3.482f, 1.519f)
                curveTo(7.306f, 10.526f, 7.0f, 11.054f, 7.0f, 11.5f)
                reflectiveCurveToRelative(0.306f, 0.974f, 1.112f, 1.538f)
                curveToRelative(0.793f, 0.555f, 1.974f, 1.074f, 3.482f, 1.519f)
                curveTo(14.604f, 15.444f, 18.804f, 16.0f, 23.5f, 16.0f)
                reflectiveCurveToRelative(8.897f, -0.556f, 11.906f, -1.443f)
                curveToRelative(1.508f, -0.445f, 2.69f, -0.964f, 3.482f, -1.519f)
                curveTo(39.694f, 12.474f, 40.0f, 11.946f, 40.0f, 11.5f)
                reflectiveCurveToRelative(-0.306f, -0.974f, -1.112f, -1.538f)
                curveToRelative(-0.793f, -0.555f, -1.974f, -1.074f, -3.482f, -1.519f)
                curveTo(32.396f, 7.556f, 28.196f, 7.0f, 23.5f, 7.0f)
            }
        }
            .build()
        return _databaseLarge!!
    }

private var _databaseLarge: ImageVector? = null
