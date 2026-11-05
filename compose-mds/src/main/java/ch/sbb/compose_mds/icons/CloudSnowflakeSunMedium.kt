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
                moveTo(21.968f, 9.839f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 1.795f, 1.851f)
                curveToRelative(0.482f, 0.92f, 0.663f, 2.041f, 0.417f, 3.296f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, true, 1.656f, 0.877f)
                quadToRelative(0.255f, 0.276f, 0.436f, 0.602f)
                curveToRelative(1.47f, -0.58f, 2.478f, -1.993f, 2.478f, -3.715f)
                curveToRelative(0.0f, -2.26f, -1.74f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.1f, 0.0f, -2.073f, 0.411f, -2.782f, 1.089f)
                moveToRelative(4.665f, 7.56f)
                quadToRelative(0.074f, 0.31f, 0.099f, 0.63f)
                curveToRelative(0.122f, 1.587f, -0.667f, 3.407f, -2.547f, 4.022f)
                lineToRelative(-0.311f, -0.95f)
                curveToRelative(1.337f, -0.438f, 1.957f, -1.748f, 1.86f, -2.994f)
                curveToRelative(-0.047f, -0.617f, -0.271f, -1.175f, -0.632f, -1.564f)
                curveToRelative(-0.35f, -0.378f, -0.852f, -0.62f, -1.531f, -0.594f)
                lineToRelative(-0.699f, 0.028f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.378f, -1.274f, 0.232f, -2.338f, -0.195f, -3.153f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -2.01f, -1.728f)
                curveToRelative(-1.686f, -0.611f, -3.8f, -0.064f, -4.81f, 2.226f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.509f, -0.418f)
                curveToRelative(-1.626f, -1.333f, -4.281f, -0.068f, -3.985f, 2.404f)
                lineToRelative(0.067f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-1.065f, 0.0f, -1.86f, 0.956f, -1.986f, 2.231f)
                curveToRelative(-0.123f, 1.24f, 0.433f, 2.538f, 1.85f, 3.019f)
                lineToRelative(-0.322f, 0.947f)
                curveToRelative(-1.96f, -0.665f, -2.68f, -2.48f, -2.523f, -4.065f)
                curveToRelative(0.138f, -1.39f, 0.99f, -2.807f, 2.454f, -3.084f)
                curveToRelative(0.007f, -2.801f, 2.943f, -4.358f, 5.133f, -3.133f)
                curveToRelative(1.281f, -2.282f, 3.627f, -2.91f, 5.584f, -2.302f)
                curveToRelative(0.91f, -1.031f, 2.248f, -1.663f, 3.759f, -1.663f)
                curveToRelative(2.813f, 0.0f, 5.0f, 2.187f, 5.0f, 5.0f)
                curveToRelative(0.0f, 2.138f, -1.265f, 3.92f, -3.117f, 4.648f)
                moveToRelative(-13.45f, 0.992f)
                lineToRelative(2.86f, 2.859f)
                horizontalLineTo(12.02f)
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
                lineToRelative(-2.859f, -2.859f)
                horizontalLineToRelative(4.064f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.044f)
                lineToRelative(2.86f, -2.86f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-2.88f, 2.88f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.043f)
                lineToRelative(-2.86f, -2.86f)
                close()
            }
        }
        .build()
        return _cloudSnowflakeSunMedium!!
    }

private var _cloudSnowflakeSunMedium: ImageVector? = null
