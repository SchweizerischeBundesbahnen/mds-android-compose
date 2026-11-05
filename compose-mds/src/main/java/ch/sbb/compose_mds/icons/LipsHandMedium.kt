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

public val SBBIcons.LipsHandMedium: ImageVector
    get() {
        if (_lipsHandMedium != null) {
            return _lipsHandMedium!!
        }
        _lipsHandMedium = Builder(
            name = "LipsHandMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(11.031f, 9.856f)
                curveToRelative(1.208f, -0.353f, 2.36f, -0.606f, 3.219f, -0.606f)
                curveToRelative(1.65f, 0.0f, 2.623f, 0.397f, 3.235f, 0.847f)
                curveToRelative(0.225f, 0.166f, 0.392f, 0.332f, 0.515f, 0.468f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.515f, -0.468f)
                curveToRelative(0.611f, -0.45f, 1.585f, -0.847f, 3.235f, -0.847f)
                curveToRelative(0.858f, 0.0f, 2.01f, 0.253f, 3.218f, 0.606f)
                curveToRelative(1.22f, 0.357f, 2.544f, 0.831f, 3.761f, 1.303f)
                arcToRelative(87.0f, 87.0f, 0.0f, false, true, 4.386f, 1.844f)
                lineToRelative(0.07f, 0.032f)
                lineToRelative(0.018f, 0.008f)
                lineToRelative(0.005f, 0.002f)
                horizontalLineToRelative(0.001f)
                lineTo(33.0f, 13.5f)
                lineToRelative(0.21f, -0.453f)
                lineToRelative(0.799f, 0.369f)
                lineToRelative(-0.727f, 0.497f)
                lineToRelative(-0.281f, -0.411f)
                lineToRelative(0.281f, 0.412f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.005f, 0.004f)
                lineToRelative(-0.02f, 0.014f)
                lineToRelative(-0.078f, 0.053f)
                lineToRelative(-0.296f, 0.197f)
                arcToRelative(73.356f, 73.356f, 0.0f, false, true, -4.777f, 2.891f)
                curveToRelative(-2.743f, 1.516f, -6.155f, 3.142f, -8.854f, 3.56f)
                verticalLineToRelative(0.886f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.988f, 1.508f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.0f, 1.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.012f, 1.725f)
                lineTo(28.25f, 31.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(25.25f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, -0.002f)
                lineTo(19.25f, 27.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.25f, 15.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                lineTo(16.25f, 28.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(5.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.0f, -1.732f)
                verticalLineToRelative(-4.21f)
                curveToRelative(-2.651f, -0.736f, -5.71f, -2.288f, -8.121f, -3.664f)
                arcToRelative(75.0f, 75.0f, 0.0f, false, true, -4.076f, -2.507f)
                lineToRelative(-0.248f, -0.165f)
                lineToRelative(-0.065f, -0.044f)
                lineToRelative(-0.017f, -0.012f)
                lineToRelative(-0.004f, -0.002f)
                lineToRelative(-0.001f, -0.001f)
                lineTo(3.0f, 13.5f)
                lineToRelative(-0.21f, -0.454f)
                horizontalLineToRelative(0.002f)
                lineToRelative(0.005f, -0.003f)
                lineToRelative(0.018f, -0.008f)
                lineToRelative(0.07f, -0.032f)
                lineToRelative(0.265f, -0.12f)
                arcToRelative(86.832f, 86.832f, 0.0f, false, true, 4.12f, -1.724f)
                curveToRelative(1.218f, -0.472f, 2.541f, -0.946f, 3.761f, -1.303f)
                moveTo(3.0f, 13.5f)
                lineToRelative(-0.283f, 0.412f)
                lineToRelative(-0.726f, -0.497f)
                lineToRelative(0.8f, -0.37f)
                close()
                moveTo(28.368f, 12.091f)
                curveToRelative(1.158f, 0.449f, 2.228f, 0.898f, 3.025f, 1.243f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, true, -3.063f, 0.563f)
                curveToRelative(-2.612f, 0.434f, -6.006f, 0.878f, -9.29f, 0.96f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.55f, -0.059f)
                curveToRelative(-3.054f, -0.168f, -6.088f, -0.6f, -8.391f, -0.998f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -2.492f, -0.467f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, 3.025f, -1.242f)
                curveToRelative(1.204f, -0.466f, 2.498f, -0.93f, 3.68f, -1.275f)
                curveToRelative(1.196f, -0.35f, 2.232f, -0.566f, 2.938f, -0.566f)
                curveToRelative(1.48f, 0.0f, 2.234f, 0.352f, 2.642f, 0.652f)
                curveToRelative(0.209f, 0.154f, 0.346f, 0.307f, 0.459f, 0.44f)
                lineToRelative(0.02f, 0.022f)
                curveToRelative(0.047f, 0.056f, 0.11f, 0.128f, 0.167f, 0.184f)
                curveToRelative(0.053f, 0.05f, 0.215f, 0.202f, 0.462f, 0.202f)
                curveToRelative(0.246f, 0.0f, 0.41f, -0.152f, 0.461f, -0.202f)
                curveToRelative(0.059f, -0.056f, 0.12f, -0.128f, 0.168f, -0.184f)
                lineToRelative(0.02f, -0.023f)
                curveToRelative(0.113f, -0.132f, 0.25f, -0.285f, 0.459f, -0.438f)
                curveToRelative(0.407f, -0.3f, 1.162f, -0.653f, 2.642f, -0.653f)
                curveToRelative(0.706f, 0.0f, 1.742f, 0.216f, 2.938f, 0.566f)
                curveToRelative(1.182f, 0.346f, 2.476f, 0.809f, 3.68f, 1.275f)
                moveTo(5.532f, 14.533f)
                curveToRelative(0.611f, 0.377f, 1.32f, 0.802f, 2.092f, 1.242f)
                curveToRelative(2.318f, 1.322f, 5.164f, 2.764f, 7.626f, 3.493f)
                verticalLineToRelative(-3.482f)
                curveToRelative(-3.044f, -0.178f, -6.043f, -0.607f, -8.321f, -1.0f)
                quadToRelative(-0.756f, -0.131f, -1.397f, -0.253f)
                moveTo(19.25f, 19.62f)
                verticalLineToRelative(-3.768f)
                curveToRelative(3.291f, -0.094f, 6.658f, -0.538f, 9.244f, -0.967f)
                curveToRelative(0.724f, -0.12f, 1.387f, -0.24f, 1.972f, -0.35f)
                arcToRelative(71.0f, 71.0f, 0.0f, false, true, -2.846f, 1.663f)
                curveToRelative(-2.698f, 1.491f, -5.895f, 2.999f, -8.37f, 3.422f)
                moveToRelative(-1.477f, -8.796f)
                quadToRelative(-0.016f, 0.013f, 0.002f, -0.002f)
                close()
                moveTo(18.225f, 10.822f)
                lineTo(18.227f, 10.824f)
                close()
            }
        }
            .build()
        return _lipsHandMedium!!
    }

private var _lipsHandMedium: ImageVector? = null
