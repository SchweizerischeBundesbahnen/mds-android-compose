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

public val SBBIcons.HandHeartSmall: ImageVector
    get() {
        if (_handHeartSmall != null) {
            return _handHeartSmall!!
        }
        _handHeartSmall = Builder(name = "HandHeartSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.996f, 3.0f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, false, -2.72f, 4.252f)
                lineToRelative(0.082f, 0.162f)
                quadToRelative(0.143f, 0.265f, 0.339f, 0.5f)
                lineToRelative(0.138f, 0.154f)
                lineToRelative(0.005f, 0.005f)
                lineToRelative(3.803f, 3.782f)
                lineToRelative(0.353f, 0.35f)
                lineToRelative(0.352f, -0.35f)
                lineToRelative(3.798f, -3.777f)
                lineToRelative(0.017f, -0.016f)
                lineToRelative(0.015f, -0.018f)
                curveToRelative(0.09f, -0.107f, 0.328f, -0.411f, 0.422f, -0.576f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.25f, -0.438f, 0.393f, -0.944f, 0.393f, -1.485f)
                curveToRelative(0.0f, -0.359f, -0.063f, -0.705f, -0.181f, -1.027f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 10.995f, 3.0f)
                curveToRelative(-0.774f, 0.0f, -1.472f, 0.29f, -2.0f, 0.765f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, -2.0f, -0.765f)
                moveToRelative(5.878f, 2.3f)
                lineToRelative(0.47f, -0.172f)
                lineToRelative(0.469f, -0.172f)
                close()
                moveTo(12.873f, 5.3f)
                quadToRelative(0.118f, 0.317f, 0.12f, 0.683f)
                curveToRelative(0.0f, 0.362f, -0.096f, 0.697f, -0.261f, 0.987f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.31f, 0.414f)
                lineToRelative(-3.427f, 3.41f)
                lineToRelative(-3.45f, -3.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.31f, -0.429f)
                lineToRelative(-0.104f, -0.22f)
                arcTo(1.984f, 1.984f, 0.0f, false, true, 6.995f, 4.0f)
                curveToRelative(0.662f, 0.0f, 1.237f, 0.316f, 1.601f, 0.802f)
                lineToRelative(0.402f, 0.536f)
                lineToRelative(0.399f, -0.537f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, true, 1.598f, -0.8f)
                curveToRelative(0.872f, 0.0f, 1.602f, 0.54f, 1.879f, 1.299f)
                moveToRelative(0.727f, 2.168f)
                lineToRelative(-0.435f, -0.249f)
                lineToRelative(-0.16f, -0.091f)
                close()
                moveTo(4.411f, 13.312f)
                arcToRelative(1.498f, 1.498f, 0.0f, false, false, -1.867f, 2.342f)
                verticalLineToRelative(0.001f)
                lineToRelative(5.925f, 5.22f)
                lineToRelative(0.141f, 0.125f)
                horizontalLineToRelative(3.927f)
                lineToRelative(0.861f, 0.855f)
                lineToRelative(0.146f, 0.145f)
                horizontalLineToRelative(8.857f)
                lineToRelative(-0.846f, -0.852f)
                lineToRelative(-5.028f, -5.064f)
                lineToRelative(-0.008f, -0.009f)
                curveToRelative(-1.114f, -1.071f, -2.556f, -1.93f, -4.092f, -2.06f)
                lineTo(12.119f, 14.0f)
                lineTo(10.0f, 14.0f)
                curveToRelative(-0.633f, 0.0f, -1.145f, 0.244f, -1.495f, 0.635f)
                curveToRelative(-0.3f, 0.335f, -0.465f, 0.758f, -0.503f, 1.182f)
                lineTo(4.413f, 13.31f)
                close()
                moveTo(16.527f, 16.084f)
                lineTo(16.151f, 16.456f)
                lineTo(16.171f, 16.436f)
                close()
                moveTo(8.47f, 20.875f)
                lineToRelative(0.33f, -0.376f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(3.84f, 14.13f)
                lineTo(4.127f, 13.72f)
                lineTo(4.128f, 13.719f)
                close()
                moveTo(3.827f, 14.12f)
                lineTo(3.841f, 14.13f)
                lineTo(8.539f, 17.411f)
                curveToRelative(0.35f, 0.365f, 0.848f, 0.589f, 1.462f, 0.59f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.374f, -0.001f, -0.613f, -0.134f, -0.763f, -0.302f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, true, -0.243f, -0.695f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, true, 0.256f, -0.702f)
                curveToRelative(0.153f, -0.171f, 0.391f, -0.302f, 0.75f, -0.302f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.246f, 0.013f)
                curveToRelative(1.227f, 0.104f, 2.461f, 0.804f, 3.48f, 1.783f)
                lineTo(19.998f, 21.0f)
                horizontalLineToRelative(-6.042f)
                lineToRelative(-0.862f, -0.855f)
                lineToRelative(-0.147f, -0.145f)
                horizontalLineToRelative(-3.96f)
                lineToRelative(-5.783f, -5.096f)
                lineToRelative(-0.009f, -0.006f)
                lineToRelative(-0.008f, -0.008f)
                lineToRelative(-0.073f, -0.072f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.005f, -0.63f)
                lineToRelative(-0.345f, -0.279f)
                lineToRelative(0.345f, 0.278f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.619f, -0.132f)
                lineToRelative(0.085f, 0.055f)
                close()
            }
        }
        .build()
        return _handHeartSmall!!
    }

private var _handHeartSmall: ImageVector? = null
