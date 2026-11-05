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

public val SBBIcons.ElephantSmall: ImageVector
    get() {
        if (_elephantSmall != null) {
            return _elephantSmall!!
        }
        _elephantSmall = Builder(
            name = "ElephantSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(7.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                curveToRelative(0.0f, 1.075f, 0.392f, 3.264f, 1.162f, 5.156f)
                curveToRelative(0.386f, 0.948f, 0.882f, 1.861f, 1.503f, 2.528f)
                curveToRelative(0.62f, 0.666f, 1.41f, 1.13f, 2.356f, 1.056f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.745f, -0.574f)
                quadToRelative(0.12f, 0.068f, 0.244f, 0.13f)
                curveToRelative(0.104f, 1.594f, 1.043f, 2.988f, 2.289f, 3.984f)
                curveTo(12.623f, 21.338f, 14.356f, 22.0f, 16.0f, 22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.803f, 0.0f, -1.26f, -0.31f, -1.547f, -0.784f)
                curveToRelative(-0.28f, -0.462f, -0.422f, -1.123f, -0.448f, -1.927f)
                quadToRelative(0.116f, -0.06f, 0.23f, -0.123f)
                curveToRelative(0.49f, 0.357f, 1.092f, 0.57f, 1.744f, 0.574f)
                curveToRelative(0.946f, 0.074f, 1.736f, -0.39f, 2.356f, -1.056f)
                curveToRelative(0.62f, -0.667f, 1.117f, -1.58f, 1.503f, -2.528f)
                curveTo(21.608f, 11.264f, 22.0f, 9.075f, 22.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -8.275f, -3.778f)
                arcTo(6.8f, 6.8f, 0.0f, false, false, 12.0f, 4.0f)
                curveToRelative(-0.598f, 0.0f, -1.178f, 0.077f, -1.725f, 0.222f)
                arcTo(4.98f, 4.98f, 0.0f, false, false, 7.0f, 3.0f)
                moveToRelative(7.025f, 13.69f)
                arcTo(6.7f, 6.7f, 0.0f, false, true, 12.0f, 17.0f)
                curveToRelative(-0.672f, 0.0f, -1.32f, -0.098f, -1.925f, -0.279f)
                curveToRelative(0.218f, 1.048f, 0.896f, 2.016f, 1.848f, 2.778f)
                curveTo(13.09f, 20.43f, 14.607f, 21.0f, 16.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.13f, 0.0f, -1.923f, -0.474f, -2.403f, -1.266f)
                curveToRelative(-0.348f, -0.576f, -0.514f, -1.29f, -0.572f, -2.043f)
                moveTo(6.0f, 11.7f)
                curveToRelative(0.0f, 1.527f, 0.728f, 2.887f, 1.867f, 3.843f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 15.74f)
                horizontalLineToRelative(-0.022f)
                lineToRelative(-0.021f, 0.002f)
                curveToRelative(-0.544f, 0.047f, -1.06f, -0.202f, -1.56f, -0.74f)
                curveToRelative(-0.504f, -0.54f, -0.945f, -1.329f, -1.309f, -2.223f)
                curveTo(3.358f, 10.986f, 3.0f, 8.925f, 3.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.158f, -3.369f)
                curveTo(7.303f, 5.515f, 6.0f, 7.251f, 6.0f, 9.298f)
                verticalLineTo(11.7f)
                moveToRelative(1.0f, 0.0f)
                verticalLineTo(9.3f)
                curveToRelative(0.0f, -1.821f, 1.334f, -3.43f, 3.293f, -4.043f)
                arcTo(5.7f, 5.7f, 0.0f, false, true, 12.0f, 5.0f)
                curveToRelative(0.6f, 0.0f, 1.175f, 0.091f, 1.707f, 0.257f)
                curveTo(15.667f, 5.87f, 17.0f, 7.48f, 17.0f, 9.3f)
                verticalLineToRelative(2.4f)
                curveToRelative(0.0f, 1.384f, -0.765f, 2.637f, -1.993f, 3.434f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 12.0f, 16.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -3.007f, -0.866f)
                curveTo(7.765f, 14.337f, 7.0f, 13.084f, 7.0f, 11.7f)
                moveToRelative(11.0f, -2.4f)
                verticalLineToRelative(-0.002f)
                curveToRelative(-0.001f, -2.047f, -1.303f, -3.783f, -3.158f, -4.667f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 21.0f, 8.0f)
                curveToRelative(0.0f, 0.925f, -0.358f, 2.986f, -1.088f, 4.779f)
                curveToRelative(-0.364f, 0.894f, -0.805f, 1.682f, -1.31f, 2.224f)
                curveToRelative(-0.5f, 0.537f, -1.015f, 0.786f, -1.559f, 0.739f)
                lineToRelative(-0.021f, -0.002f)
                horizontalLineTo(17.0f)
                curveToRelative(-0.31f, 0.0f, -0.605f, -0.07f, -0.867f, -0.197f)
                curveTo(17.273f, 14.587f, 18.0f, 13.227f, 18.0f, 11.7f)
                close()
                moveTo(8.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(6.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
            }
        }
            .build()
        return _elephantSmall!!
    }

private var _elephantSmall: ImageVector? = null
