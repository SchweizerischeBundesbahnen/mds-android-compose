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

public val SBBIcons.HandSafetyShieldSmall: ImageVector
    get() {
        if (_handSafetyShieldSmall != null) {
            return _handSafetyShieldSmall!!
        }
        _handSafetyShieldSmall = Builder(
            name = "HandSafetyShieldSmall",
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
                moveToRelative(12.0f, 1.988f)
                lineToRelative(0.108f, 0.024f)
                lineToRelative(4.5f, 1.0f)
                lineToRelative(0.392f, 0.087f)
                lineTo(17.0f, 3.5f)
                curveToRelative(0.0f, 3.375f, -1.172f, 5.732f, -2.357f, 7.246f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -1.629f, 1.653f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.705f, 0.5f)
                lineToRelative(-0.046f, 0.026f)
                lineToRelative(-0.014f, 0.008f)
                lineToRelative(-0.004f, 0.003f)
                horizontalLineToRelative(-0.002f)
                lineTo(12.0f, 12.5f)
                lineToRelative(-0.244f, 0.437f)
                lineToRelative(-0.002f, -0.001f)
                lineToRelative(-0.004f, -0.003f)
                lineToRelative(-0.014f, -0.008f)
                lineToRelative(-0.045f, -0.027f)
                lineToRelative(-0.16f, -0.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.546f, -0.399f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -1.629f, -1.652f)
                curveTo(8.171f, 9.234f, 7.0f, 6.881f, 7.0f, 3.51f)
                verticalLineToRelative(-0.4f)
                lineToRelative(0.39f, -0.088f)
                lineToRelative(4.5f, -1.01f)
                close()
                moveTo(12.0f, 12.5f)
                lineToRelative(0.242f, 0.437f)
                lineToRelative(-0.242f, 0.135f)
                lineToRelative(-0.243f, -0.135f)
                close()
                moveTo(12.0f, 11.907f)
                curveToRelative(0.104f, -0.071f, 0.237f, -0.168f, 0.391f, -0.29f)
                curveToRelative(0.397f, -0.316f, 0.93f, -0.805f, 1.465f, -1.488f)
                curveToRelative(1.019f, -1.302f, 2.05f, -3.32f, 2.138f, -6.23f)
                lineTo(12.0f, 3.013f)
                lineToRelative(-3.994f, 0.897f)
                curveToRelative(0.087f, 2.904f, 1.118f, 4.92f, 2.137f, 6.221f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 1.465f, 1.487f)
                quadToRelative(0.233f, 0.183f, 0.392f, 0.29f)
                moveTo(4.42f, 13.32f)
                lineToRelative(3.575f, 2.496f)
                curveToRelative(0.039f, -0.423f, 0.202f, -0.846f, 0.501f, -1.18f)
                curveToRelative(0.35f, -0.392f, 0.862f, -0.636f, 1.494f, -0.636f)
                horizontalLineToRelative(2.238f)
                verticalLineToRelative(0.004f)
                curveToRelative(1.609f, 0.073f, 3.117f, 0.965f, 4.277f, 2.075f)
                lineToRelative(0.01f, 0.008f)
                lineToRelative(5.03f, 5.06f)
                lineToRelative(0.847f, 0.853f)
                horizontalLineToRelative(-8.858f)
                lineToRelative(-0.146f, -0.145f)
                lineToRelative(-0.864f, -0.855f)
                lineTo(8.601f, 21.0f)
                lineToRelative(-0.142f, -0.125f)
                lineToRelative(-5.923f, -5.214f)
                arcTo(1.502f, 1.502f, 0.0f, false, true, 4.42f, 13.32f)
                moveTo(12.095f, 15.0f)
                lineTo(9.99f, 15.0f)
                curveToRelative(-0.358f, 0.0f, -0.595f, 0.13f, -0.748f, 0.302f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, -0.256f, 0.702f)
                curveToRelative(-0.002f, 0.268f, 0.086f, 0.518f, 0.243f, 0.695f)
                curveToRelative(0.149f, 0.168f, 0.387f, 0.301f, 0.76f, 0.301f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.622f, 0.0f, -1.128f, -0.228f, -1.478f, -0.603f)
                lineTo(3.833f, 14.13f)
                lineToRelative(-0.015f, -0.01f)
                lineToRelative(-0.014f, -0.012f)
                arcToRelative(0.502f, 0.502f, 0.0f, true, false, -0.629f, 0.784f)
                lineToRelative(0.008f, 0.006f)
                lineToRelative(0.007f, 0.007f)
                lineTo(8.978f, 20.0f)
                horizontalLineToRelative(3.957f)
                lineToRelative(0.146f, 0.145f)
                lineToRelative(0.864f, 0.855f)
                horizontalLineToRelative(6.043f)
                lineToRelative(-4.178f, -4.203f)
                curveToRelative(-1.09f, -1.04f, -2.412f, -1.769f, -3.716f, -1.797f)
                moveToRelative(-0.192f, -6.646f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(-2.147f, 2.147f)
                lineToRelative(-0.896f, -0.897f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(0.353f, 0.353f)
                close()
            }
        }
            .build()
        return _handSafetyShieldSmall!!
    }

private var _handSafetyShieldSmall: ImageVector? = null
