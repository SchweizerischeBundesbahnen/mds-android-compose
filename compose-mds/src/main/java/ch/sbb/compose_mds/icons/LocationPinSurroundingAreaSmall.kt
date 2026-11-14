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

public val SBBIcons.LocationPinSurroundingAreaSmall: ImageVector
    get() {
        if (_locationPinSurroundingAreaSmall != null) {
            return _locationPinSurroundingAreaSmall!!
        }
        _locationPinSurroundingAreaSmall = Builder(name = "LocationPinSurroundingAreaSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.015f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                verticalLineToRelative(0.005f)
                curveToRelative(-0.01f, 1.009f, -0.328f, 1.9f, -0.8f, 2.728f)
                lineToRelative(-0.442f, -0.253f)
                lineToRelative(0.012f, 0.008f)
                lineToRelative(0.43f, 0.245f)
                lineToRelative(-0.006f, 0.01f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-4.75f, 7.499f)
                lineToRelative(-0.423f, 0.666f)
                lineToRelative(-0.422f, -0.666f)
                lineToRelative(-4.75f, -7.498f)
                lineToRelative(-0.007f, -0.011f)
                verticalLineToRelative(-0.001f)
                curveTo(6.35f, 9.947f, 6.04f, 9.073f, 6.0f, 8.034f)
                verticalLineToRelative(-0.02f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                moveToRelative(0.0f, 1.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 8.0f)
                curveToRelative(0.034f, 0.84f, 0.28f, 1.55f, 0.688f, 2.233f)
                lineToRelative(4.328f, 6.831f)
                lineToRelative(4.319f, -6.818f)
                curveToRelative(0.41f, -0.722f, 0.657f, -1.443f, 0.665f, -2.231f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                moveToRelative(3.008f, 4.992f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                moveToRelative(-13.39f, 9.205f)
                curveToRelative(-0.36f, 0.35f, -0.618f, 0.783f, -0.618f, 1.288f)
                curveToRelative(0.0f, 0.642f, 0.412f, 1.165f, 0.944f, 1.563f)
                curveToRelative(0.541f, 0.404f, 1.293f, 0.749f, 2.179f, 1.03f)
                curveTo(6.9f, 21.657f, 9.329f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(5.1f, -0.343f, 6.877f, -0.907f)
                curveToRelative(0.885f, -0.281f, 1.637f, -0.626f, 2.178f, -1.03f)
                curveToRelative(0.532f, -0.398f, 0.945f, -0.921f, 0.945f, -1.563f)
                curveToRelative(0.0f, -0.5f, -0.254f, -0.932f, -0.612f, -1.28f)
                curveToRelative(-0.356f, -0.347f, -0.85f, -0.648f, -1.43f, -0.906f)
                curveToRelative(-1.161f, -0.519f, -2.77f, -0.91f, -4.618f, -1.126f)
                lineToRelative(-0.117f, 0.994f)
                curveToRelative(1.79f, 0.208f, 3.291f, 0.582f, 4.329f, 1.045f)
                curveToRelative(0.52f, 0.231f, 0.898f, 0.475f, 1.14f, 0.71f)
                curveToRelative(0.24f, 0.233f, 0.308f, 0.422f, 0.308f, 0.563f)
                curveToRelative(0.0f, 0.18f, -0.117f, 0.443f, -0.543f, 0.762f)
                curveToRelative(-0.417f, 0.311f, -1.052f, 0.614f, -1.883f, 0.878f)
                curveToRelative(-1.655f, 0.525f, -3.977f, 0.86f, -6.574f, 0.86f)
                reflectiveCurveToRelative(-4.919f, -0.335f, -6.574f, -0.86f)
                curveToRelative(-0.831f, -0.264f, -1.467f, -0.567f, -1.883f, -0.878f)
                curveTo(3.117f, 18.943f, 3.0f, 18.68f, 3.0f, 18.5f)
                curveToRelative(0.0f, -0.142f, 0.07f, -0.333f, 0.314f, -0.57f)
                curveToRelative(0.245f, -0.236f, 0.63f, -0.481f, 1.157f, -0.714f)
                curveToRelative(1.053f, -0.465f, 2.575f, -0.839f, 4.387f, -1.044f)
                lineToRelative(-0.112f, -0.994f)
                curveToRelative(-1.87f, 0.211f, -3.5f, 0.604f, -4.678f, 1.124f)
                curveToRelative(-0.587f, 0.26f, -1.088f, 0.561f, -1.45f, 0.91f)
            }
        }
        .build()
        return _locationPinSurroundingAreaSmall!!
    }

private var _locationPinSurroundingAreaSmall: ImageVector? = null
