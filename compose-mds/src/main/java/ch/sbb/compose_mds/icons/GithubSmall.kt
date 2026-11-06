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

public val SBBIcons.GithubSmall: ImageVector
    get() {
        if (_githubSmall != null) {
            return _githubSmall!!
        }
        _githubSmall = Builder(name = "GithubSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.375f, 2.0f)
                arcToRelative(5.38f, 5.38f, 0.0f, false, true, 4.37f, 2.25f)
                horizontalLineToRelative(2.51f)
                arcTo(5.37f, 5.37f, 0.0f, false, true, 17.625f, 2.0f)
                horizontalLineToRelative(0.288f)
                lineToRelative(0.145f, 0.25f)
                curveToRelative(0.4f, 0.694f, 0.642f, 1.47f, 0.705f, 2.27f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -0.26f, 2.109f)
                curveToRelative(0.48f, 0.788f, 0.74f, 1.692f, 0.747f, 2.617f)
                verticalLineTo(10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.459f, 4.306f)
                quadToRelative(0.357f, 0.181f, 0.648f, 0.457f)
                curveToRelative(0.256f, 0.244f, 0.461f, 0.537f, 0.601f, 0.86f)
                reflectiveCurveToRelative(0.211f, 0.67f, 0.21f, 1.02f)
                verticalLineToRelative(0.716f)
                lineToRelative(0.008f, 0.16f)
                quadToRelative(0.024f, 0.238f, 0.12f, 0.462f)
                curveToRelative(0.085f, 0.197f, 0.212f, 0.378f, 0.373f, 0.532f)
                curveToRelative(0.161f, 0.153f, 0.355f, 0.277f, 0.57f, 0.361f)
                reflectiveCurveToRelative(0.444f, 0.127f, 0.677f, 0.126f)
                lineToRelative(0.004f, 1.0f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -1.047f, -0.195f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.893f, -0.568f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -0.602f, -0.86f)
                arcToRelative(2.55f, 2.55f, 0.0f, false, true, -0.21f, -1.022f)
                verticalLineToRelative(-0.714f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, false, -0.128f, -0.621f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.373f, -0.533f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.57f, -0.361f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.677f, -0.126f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(3.502f)
                curveToRelative(0.0f, 0.188f, 0.04f, 0.377f, 0.122f, 0.555f)
                curveToRelative(0.083f, 0.178f, 0.206f, 0.344f, 0.366f, 0.486f)
                reflectiveCurveToRelative(0.355f, 0.258f, 0.572f, 0.338f)
                curveToRelative(0.08f, 0.03f, 0.238f, 0.062f, 0.436f, 0.086f)
                curveToRelative(0.19f, 0.023f, 0.378f, 0.034f, 0.502f, 0.033f)
                lineToRelative(0.004f, 1.0f)
                curveToRelative(-0.172f, 0.0f, -0.403f, -0.014f, -0.627f, -0.041f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.66f, -0.14f)
                curveToRelative(-0.33f, -0.12f, -0.633f, -0.3f, -0.89f, -0.529f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.61f, -0.813f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -0.215f, -0.979f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.498f)
                lineToRelative(-0.013f, 0.252f)
                quadToRelative(-0.041f, 0.377f, -0.202f, 0.727f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.61f, 0.813f)
                curveToRelative(-0.257f, 0.23f, -0.56f, 0.409f, -0.89f, 0.53f)
                curveToRelative(-0.194f, 0.07f, -0.445f, 0.113f, -0.66f, 0.139f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.627f, 0.041f)
                lineToRelative(0.004f, -1.0f)
                curveToRelative(0.124f, 0.0f, 0.312f, -0.01f, 0.502f, -0.033f)
                curveToRelative(0.198f, -0.024f, 0.356f, -0.057f, 0.436f, -0.086f)
                curveToRelative(0.217f, -0.08f, 0.411f, -0.195f, 0.572f, -0.338f)
                curveToRelative(0.16f, -0.142f, 0.283f, -0.308f, 0.366f, -0.486f)
                curveToRelative(0.082f, -0.178f, 0.123f, -0.367f, 0.122f, -0.555f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.498f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.678f, 0.126f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.569f, 0.361f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.373f, 0.533f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.12f, 0.462f)
                lineToRelative(-0.008f, 0.159f)
                verticalLineToRelative(0.715f)
                lineToRelative(-0.013f, 0.261f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -0.197f, 0.76f)
                curveToRelative(-0.14f, 0.323f, -0.345f, 0.616f, -0.602f, 0.86f)
                curveToRelative(-0.256f, 0.245f, -0.56f, 0.437f, -0.893f, 0.568f)
                reflectiveCurveTo(4.357f, 20.0f, 3.998f, 20.0f)
                lineToRelative(0.004f, -1.0f)
                curveToRelative(0.233f, 0.0f, 0.463f, -0.042f, 0.678f, -0.126f)
                curveToRelative(0.214f, -0.084f, 0.408f, -0.207f, 0.569f, -0.361f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 0.373f, -0.533f)
                curveToRelative(0.086f, -0.197f, 0.129f, -0.408f, 0.128f, -0.62f)
                verticalLineToRelative(-0.717f)
                curveToRelative(-0.001f, -0.35f, 0.07f, -0.697f, 0.21f, -1.02f)
                reflectiveCurveToRelative(0.345f, -0.616f, 0.602f, -0.86f)
                curveToRelative(0.191f, -0.183f, 0.41f, -0.337f, 0.646f, -0.457f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 4.75f, 10.0f)
                verticalLineToRelative(-0.754f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 0.745f, -2.617f)
                arcToRelative(5.37f, 5.37f, 0.0f, false, true, 0.447f, -4.379f)
                lineTo(6.087f, 2.0f)
                close()
                moveTo(17.33f, 3.01f)
                arcToRelative(4.38f, 4.38f, 0.0f, false, false, -3.39f, 2.01f)
                lineToRelative(-0.421f, -0.271f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.421f, 0.27f)
                lineToRelative(-0.147f, 0.23f)
                horizontalLineToRelative(-3.586f)
                lineToRelative(-0.147f, -0.23f)
                lineToRelative(0.421f, -0.27f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.421f, 0.27f)
                arcToRelative(4.38f, 4.38f, 0.0f, false, false, -3.391f, -2.01f)
                arcToRelative(4.38f, 4.38f, 0.0f, false, false, -0.155f, 3.502f)
                lineToRelative(0.093f, 0.244f)
                lineToRelative(-0.146f, 0.217f)
                lineToRelative(-0.414f, -0.282f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(0.415f, 0.282f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.711f, 2.282f)
                verticalLineTo(10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineToRelative(-0.746f)
                lineToRelative(-0.014f, -0.305f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.697f, -1.977f)
                lineToRelative(-0.146f, -0.217f)
                lineToRelative(0.093f, -0.244f)
                arcToRelative(4.38f, 4.38f, 0.0f, false, false, -0.156f, -3.501f)
            }
        }
        .build()
        return _githubSmall!!
    }

private var _githubSmall: ImageVector? = null
