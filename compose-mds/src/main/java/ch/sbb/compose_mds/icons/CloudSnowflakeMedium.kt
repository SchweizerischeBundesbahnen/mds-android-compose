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

public val SBBIcons.CloudSnowflakeMedium: ImageVector
    get() {
        if (_cloudSnowflakeMedium != null) {
            return _cloudSnowflakeMedium!!
        }
        _cloudSnowflakeMedium = Builder(
            name = "CloudSnowflakeMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(24.18f, 14.986f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, true, 1.656f, 0.877f)
                curveToRelative(0.54f, 0.583f, 0.834f, 1.368f, 0.896f, 2.167f)
                curveToRelative(0.123f, 1.586f, -0.667f, 3.406f, -2.547f, 4.02f)
                lineToRelative(-0.311f, -0.95f)
                curveToRelative(1.337f, -0.437f, 1.957f, -1.747f, 1.86f, -2.993f)
                curveToRelative(-0.047f, -0.617f, -0.271f, -1.175f, -0.632f, -1.564f)
                curveToRelative(-0.35f, -0.378f, -0.852f, -0.62f, -1.531f, -0.594f)
                lineToRelative(-0.698f, 0.028f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.378f, -1.274f, 0.232f, -2.338f, -0.194f, -3.153f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -2.011f, -1.728f)
                curveToRelative(-1.686f, -0.612f, -3.8f, -0.064f, -4.81f, 2.226f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.508f, -0.418f)
                curveToRelative(-1.627f, -1.333f, -4.282f, -0.068f, -3.986f, 2.404f)
                lineToRelative(0.067f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-1.064f, 0.0f, -1.86f, 0.956f, -1.986f, 2.231f)
                curveToRelative(-0.123f, 1.24f, 0.433f, 2.538f, 1.85f, 3.019f)
                lineToRelative(-0.322f, 0.947f)
                curveToRelative(-1.96f, -0.666f, -2.68f, -2.48f, -2.523f, -4.065f)
                curveToRelative(0.138f, -1.39f, 0.99f, -2.807f, 2.454f, -3.084f)
                curveToRelative(0.007f, -2.802f, 2.943f, -4.358f, 5.134f, -3.133f)
                curveToRelative(1.328f, -2.367f, 3.802f, -2.954f, 5.8f, -2.23f)
                curveToRelative(1.064f, 0.387f, 2.0f, 1.146f, 2.555f, 2.205f)
                curveToRelative(0.482f, 0.92f, 0.663f, 2.041f, 0.417f, 3.296f)
                moveTo(13.184f, 18.39f)
                lineToRelative(2.859f, 2.859f)
                horizontalLineToRelative(-4.022f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.042f)
                lineToRelative(-2.858f, 2.858f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(2.838f, -2.838f)
                verticalLineTo(27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.043f)
                lineToRelative(2.859f, 2.859f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-2.859f, -2.86f)
                horizontalLineToRelative(4.064f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.044f)
                lineToRelative(2.86f, -2.859f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-2.88f, 2.88f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.043f)
                lineToRelative(-2.859f, -2.86f)
                close()
            }
        }
            .build()
        return _cloudSnowflakeMedium!!
    }

private var _cloudSnowflakeMedium: ImageVector? = null
