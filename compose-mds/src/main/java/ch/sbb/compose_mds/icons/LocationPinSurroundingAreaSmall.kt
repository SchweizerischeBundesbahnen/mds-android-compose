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
        _locationPinSurroundingAreaSmall = Builder(
            name = "LocationPinSurroundingAreaSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                moveTo(6.0f, 8.015f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                verticalLineToRelative(0.004f)
                curveToRelative(-0.009f, 1.01f, -0.328f, 1.901f, -0.8f, 2.73f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-0.007f, 0.01f)
                lineToRelative(-4.75f, 7.497f)
                lineToRelative(-0.422f, 0.667f)
                lineToRelative(-0.422f, -0.667f)
                lineToRelative(-4.75f, -7.498f)
                lineToRelative(-0.007f, -0.01f)
                curveToRelative(-0.486f, -0.81f, -0.796f, -1.685f, -0.837f, -2.724f)
                verticalLineToRelative(-0.02f)
                moveToRelative(1.0f, -0.01f)
                curveToRelative(0.035f, 0.84f, 0.282f, 1.55f, 0.692f, 2.233f)
                lineToRelative(4.324f, 6.826f)
                lineToRelative(4.321f, -6.82f)
                curveToRelative(0.41f, -0.723f, 0.656f, -1.443f, 0.663f, -2.232f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -10.0f, -0.007f)
                moveToRelative(5.008f, -2.998f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                moveToRelative(-4.0f, 3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                moveToRelative(0.738f, 7.171f)
                curveToRelative(-1.871f, 0.212f, -3.501f, 0.603f, -4.678f, 1.123f)
                curveToRelative(-0.588f, 0.26f, -1.088f, 0.562f, -1.449f, 0.911f)
                curveToRelative(-0.362f, 0.35f, -0.62f, 0.783f, -0.62f, 1.288f)
                curveToRelative(0.0f, 0.642f, 0.413f, 1.165f, 0.945f, 1.563f)
                curveToRelative(0.541f, 0.404f, 1.293f, 0.749f, 2.18f, 1.03f)
                curveTo(6.9f, 21.657f, 9.328f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(5.1f, -0.343f, 6.877f, -0.907f)
                curveToRelative(0.886f, -0.281f, 1.638f, -0.626f, 2.179f, -1.03f)
                curveToRelative(0.532f, -0.398f, 0.944f, -0.921f, 0.944f, -1.563f)
                curveToRelative(0.0f, -0.501f, -0.254f, -0.932f, -0.611f, -1.28f)
                curveToRelative(-0.357f, -0.347f, -0.85f, -0.648f, -1.43f, -0.906f)
                curveToRelative(-1.162f, -0.519f, -2.771f, -0.91f, -4.62f, -1.126f)
                lineToRelative(-0.115f, 0.993f)
                curveToRelative(1.79f, 0.209f, 3.29f, 0.583f, 4.327f, 1.046f)
                curveToRelative(0.52f, 0.232f, 0.899f, 0.475f, 1.14f, 0.71f)
                curveToRelative(0.24f, 0.233f, 0.309f, 0.422f, 0.309f, 0.563f)
                curveToRelative(0.0f, 0.18f, -0.117f, 0.443f, -0.543f, 0.762f)
                curveToRelative(-0.417f, 0.311f, -1.052f, 0.614f, -1.883f, 0.878f)
                curveToRelative(-1.655f, 0.525f, -3.977f, 0.86f, -6.574f, 0.86f)
                reflectiveCurveToRelative(-4.919f, -0.335f, -6.575f, -0.86f)
                curveToRelative(-0.83f, -0.264f, -1.465f, -0.567f, -1.882f, -0.878f)
                curveTo(3.117f, 18.943f, 3.0f, 18.68f, 3.0f, 18.5f)
                curveToRelative(0.0f, -0.142f, 0.07f, -0.333f, 0.314f, -0.569f)
                curveToRelative(0.245f, -0.237f, 0.63f, -0.482f, 1.158f, -0.715f)
                curveToRelative(1.052f, -0.465f, 2.574f, -0.84f, 4.386f, -1.044f)
                close()
            }
        }
            .build()
        return _locationPinSurroundingAreaSmall!!
    }

private var _locationPinSurroundingAreaSmall: ImageVector? = null
