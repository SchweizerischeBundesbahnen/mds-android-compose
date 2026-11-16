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
        _elephantSmall = Builder(name = "ElephantSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.707f, 5.258f)
                curveTo(15.666f, 5.87f, 17.0f, 7.478f, 17.0f, 9.3f)
                verticalLineToRelative(2.4f)
                curveToRelative(0.0f, 1.384f, -0.765f, 2.637f, -1.993f, 3.435f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 12.0f, 16.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -3.007f, -0.865f)
                curveTo(7.765f, 14.337f, 7.0f, 13.084f, 7.0f, 11.7f)
                verticalLineTo(9.3f)
                curveToRelative(0.0f, -1.821f, 1.334f, -3.43f, 3.293f, -4.042f)
                arcTo(5.7f, 5.7f, 0.0f, false, true, 12.0f, 5.0f)
                curveToRelative(0.6f, 0.0f, 1.175f, 0.092f, 1.707f, 0.258f)
                moveToRelative(2.426f, 10.283f)
                curveTo(17.27f, 14.585f, 18.0f, 13.227f, 18.0f, 11.701f)
                verticalLineTo(9.297f)
                curveToRelative(0.0f, -2.047f, -1.302f, -3.784f, -3.157f, -4.667f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 21.0f, 8.0f)
                curveToRelative(0.0f, 0.924f, -0.358f, 2.986f, -1.088f, 4.778f)
                curveToRelative(-0.364f, 0.894f, -0.805f, 1.683f, -1.31f, 2.224f)
                curveToRelative(-0.5f, 0.537f, -1.016f, 0.786f, -1.559f, 0.74f)
                lineToRelative(-0.021f, -0.003f)
                horizontalLineTo(17.0f)
                curveToRelative(-0.311f, 0.0f, -0.605f, -0.072f, -0.867f, -0.199f)
                moveTo(4.088f, 12.779f)
                curveTo(3.358f, 10.987f, 3.0f, 8.925f, 3.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.156f, -3.37f)
                curveTo(7.302f, 5.515f, 6.001f, 7.252f, 6.0f, 9.299f)
                verticalLineTo(11.7f)
                curveToRelative(0.0f, 1.527f, 0.728f, 2.885f, 1.866f, 3.841f)
                curveToRelative(-0.262f, 0.126f, -0.555f, 0.2f, -0.866f, 0.2f)
                horizontalLineToRelative(-0.021f)
                lineToRelative(-0.022f, 0.001f)
                curveToRelative(-0.543f, 0.047f, -1.06f, -0.202f, -1.56f, -0.74f)
                curveToRelative(-0.504f, -0.54f, -0.945f, -1.329f, -1.31f, -2.223f)
                moveToRelative(16.75f, 0.377f)
                curveTo(21.608f, 11.264f, 22.0f, 9.075f, 22.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -8.275f, -3.777f)
                arcTo(6.7f, 6.7f, 0.0f, false, false, 12.0f, 4.0f)
                curveToRelative(-0.599f, 0.0f, -1.178f, 0.078f, -1.726f, 0.223f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 2.0f, 8.0f)
                curveToRelative(0.0f, 1.075f, 0.392f, 3.264f, 1.162f, 5.156f)
                curveToRelative(0.386f, 0.948f, 0.882f, 1.862f, 1.503f, 2.529f)
                curveToRelative(0.625f, 0.67f, 1.422f, 1.136f, 2.378f, 1.053f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.722f, -0.575f)
                quadToRelative(0.12f, 0.069f, 0.246f, 0.132f)
                curveToRelative(0.104f, 1.594f, 1.042f, 2.988f, 2.289f, 3.984f)
                curveTo(12.623f, 21.338f, 14.356f, 22.0f, 16.0f, 22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.803f, 0.0f, -1.26f, -0.31f, -1.547f, -0.784f)
                curveToRelative(-0.28f, -0.463f, -0.422f, -1.124f, -0.448f, -1.929f)
                quadToRelative(0.117f, -0.06f, 0.23f, -0.124f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.722f, 0.574f)
                verticalLineToRelative(0.001f)
                curveToRelative(0.956f, 0.083f, 1.753f, -0.383f, 2.378f, -1.053f)
                curveToRelative(0.62f, -0.667f, 1.117f, -1.58f, 1.503f, -2.529f)
                moveToRelative(-6.813f, 3.534f)
                arcTo(6.7f, 6.7f, 0.0f, false, true, 12.0f, 17.0f)
                curveToRelative(-0.672f, 0.0f, -1.32f, -0.098f, -1.925f, -0.28f)
                curveToRelative(0.217f, 1.049f, 0.896f, 2.017f, 1.848f, 2.778f)
                curveTo(13.089f, 20.43f, 14.607f, 21.0f, 16.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.13f, 0.0f, -1.923f, -0.474f, -2.402f, -1.267f)
                curveToRelative(-0.349f, -0.576f, -0.515f, -1.29f, -0.573f, -2.043f)
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
