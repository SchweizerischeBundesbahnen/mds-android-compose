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

public val SBBIcons.HandSbbSmall: ImageVector
    get() {
        if (_handSbbSmall != null) {
            return _handSbbSmall!!
        }
        _handSbbSmall = Builder(name = "HandSbbSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.22f, 6.704f)
                lineTo(10.473f, 4.0f)
                horizontalLineToRelative(2.04f)
                lineTo(16.0f, 7.5f)
                lineTo(12.514f, 11.0f)
                horizontalLineToRelative(-2.04f)
                lineToRelative(2.745f, -2.686f)
                lineTo(9.807f, 8.314f)
                lineTo(9.807f, 11.0f)
                lineTo(8.193f, 11.0f)
                lineTo(8.193f, 8.314f)
                lineTo(4.8f, 8.314f)
                lineTo(7.544f, 11.0f)
                horizontalLineToRelative(-2.04f)
                lineTo(2.0f, 7.5f)
                lineTo(5.504f, 4.0f)
                horizontalLineToRelative(2.04f)
                lineTo(4.8f, 6.704f)
                horizontalLineToRelative(3.393f)
                lineTo(8.193f, 4.0f)
                horizontalLineToRelative(1.614f)
                verticalLineToRelative(2.704f)
                close()
                moveTo(4.41f, 13.312f)
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
                curveToRelative(-1.114f, -1.072f, -2.556f, -1.93f, -4.092f, -2.06f)
                lineTo(12.119f, 14.0f)
                lineTo(10.0f, 14.0f)
                curveToRelative(-0.633f, 0.0f, -1.145f, 0.244f, -1.495f, 0.635f)
                curveToRelative(-0.3f, 0.335f, -0.465f, 0.758f, -0.503f, 1.182f)
                lineTo(4.413f, 13.31f)
                close()
                moveTo(16.526f, 16.084f)
                lineTo(16.15f, 16.456f)
                lineTo(16.17f, 16.436f)
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
                curveToRelative(0.35f, 0.365f, 0.848f, 0.589f, 1.462f, 0.589f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.374f, 0.0f, -0.613f, -0.133f, -0.763f, -0.3f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, true, -0.243f, -0.696f)
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
                lineToRelative(0.345f, 0.277f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.619f, -0.131f)
                lineToRelative(0.085f, 0.055f)
                close()
            }
        }
        .build()
        return _handSbbSmall!!
    }

private var _handSbbSmall: ImageVector? = null
