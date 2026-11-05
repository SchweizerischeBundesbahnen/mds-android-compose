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

public val SBBIcons.FactoryLarge: ImageVector
    get() {
        if (_factoryLarge != null) {
            return _factoryLarge!!
        }
        _factoryLarge = Builder(
            name = "FactoryLarge",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(11.498f, 3.0f)
                horizontalLineToRelative(0.002f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.858f, 2.19f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.182f, 5.928f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -5.204f, 0.127f)
                curveToRelative(0.102f, 0.762f, -0.094f, 1.406f, -0.513f, 1.884f)
                curveToRelative(-0.499f, 0.568f, -1.25f, 0.826f, -1.96f, 0.826f)
                reflectiveCurveToRelative(-1.46f, -0.258f, -1.959f, -0.826f)
                curveToRelative(-0.46f, -0.526f, -0.651f, -1.252f, -0.472f, -2.116f)
                curveToRelative(-1.4f, -1.27f, -1.28f, -3.113f, -0.444f, -4.393f)
                curveToRelative(0.81f, -1.238f, 2.375f, -2.08f, 4.036f, -1.442f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 11.498f, 3.0f)
                moveToRelative(1.888f, 1.555f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.5f, 4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.167f, 2.039f)
                lineToRelative(-0.224f, 0.488f)
                lineToRelative(-0.47f, -0.259f)
                curveToRelative(-1.254f, -0.687f, -2.503f, -0.136f, -3.18f, 0.9f)
                curveToRelative(-0.674f, 1.032f, -0.677f, 2.392f, 0.472f, 3.264f)
                lineToRelative(0.277f, 0.21f)
                lineToRelative(-0.1f, 0.333f)
                curveToRelative(-0.225f, 0.741f, -0.067f, 1.21f, 0.183f, 1.494f)
                curveToRelative(0.268f, 0.306f, 0.718f, 0.486f, 1.208f, 0.486f)
                reflectiveCurveToRelative(0.94f, -0.18f, 1.208f, -0.486f)
                curveToRelative(0.25f, -0.284f, 0.408f, -0.753f, 0.183f, -1.494f)
                lineToRelative(-0.098f, -0.326f)
                lineToRelative(0.266f, -0.21f)
                quadToRelative(0.173f, -0.137f, 0.309f, -0.31f)
                lineToRelative(0.336f, -0.424f)
                lineToRelative(0.396f, 0.369f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.77f, 0.0f)
                lineToRelative(0.383f, -0.357f)
                lineToRelative(0.338f, 0.4f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.767f, -3.842f)
                lineToRelative(-0.465f, 0.238f)
                lineToRelative(-0.218f, -0.474f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.29f, -1.484f)
                moveTo(2.5f, 16.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(29.0f)
                horizontalLineToRelative(44.0f)
                lineTo(46.0f, 21.566f)
                lineToRelative(-0.777f, 0.518f)
                lineTo(34.0f, 29.566f)
                verticalLineToRelative(-8.0f)
                lineToRelative(-0.777f, 0.518f)
                lineTo(22.0f, 29.566f)
                verticalLineToRelative(-8.0f)
                lineToRelative(-0.777f, 0.518f)
                lineTo(10.0f, 29.566f)
                lineTo(10.0f, 16.0f)
                lineTo(2.5f, 16.0f)
                moveTo(18.0f, 44.0f)
                horizontalLineToRelative(27.0f)
                lineTo(45.0f, 23.434f)
                lineToRelative(-11.223f, 7.482f)
                lineToRelative(-0.777f, 0.518f)
                verticalLineToRelative(-8.0f)
                lineToRelative(-11.223f, 7.482f)
                lineToRelative(-0.777f, 0.518f)
                verticalLineToRelative(-8.0f)
                lineTo(9.777f, 30.916f)
                lineTo(9.0f, 31.434f)
                lineTo(9.0f, 17.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(8.0f)
                moveToRelative(-8.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(14.0f, 44.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(22.5f, 36.0f)
                lineTo(22.0f, 36.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-4.5f)
                moveToRelative(0.5f, 5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(32.0f, 36.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-6.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(27.377f, 10.072f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.815f, 1.219f)
                lineToRelative(0.31f, 0.565f)
                lineToRelative(0.47f, -0.441f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.958f, -0.083f)
                lineToRelative(0.497f, 0.394f)
                lineToRelative(0.267f, -0.576f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 3.612f, 0.0f)
                lineToRelative(0.272f, 0.588f)
                lineToRelative(0.5f, -0.412f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, true, 0.919f, -0.326f)
                horizontalLineToRelative(0.002f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.413f, 2.0f)
                horizontalLineToRelative(-14.86f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -0.052f, -0.497f)
                lineTo(25.5f, 12.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.877f, -2.427f)
                moveToRelative(2.013f, -0.79f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.89f, 3.217f)
                curveToRelative(-0.002f, 0.402f, 0.07f, 0.802f, 0.213f, 1.178f)
                lineToRelative(0.122f, 0.323f)
                horizontalLineToRelative(16.184f)
                lineToRelative(0.144f, -0.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.234f, -3.508f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -4.862f, 0.006f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.31f, 0.09f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.367f, -1.057f)
            }
        }
            .build()
        return _factoryLarge!!
    }

private var _factoryLarge: ImageVector? = null
