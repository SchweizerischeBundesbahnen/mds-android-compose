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

public val SBBIcons.TwoFingerTapSmall: ImageVector
    get() {
        if (_twoFingerTapSmall != null) {
            return _twoFingerTapSmall!!
        }
        _twoFingerTapSmall = Builder(name = "TwoFingerTapSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 3.0f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, false, -2.48f, 1.048f)
                arcToRelative(3.482f, 3.482f, 0.0f, false, false, -2.444f, 5.37f)
                lineToRelative(0.836f, -0.55f)
                arcToRelative(2.482f, 2.482f, 0.0f, false, true, 1.887f, -3.845f)
                lineToRelative(0.202f, -0.017f)
                lineToRelative(0.133f, -0.151f)
                arcTo(2.48f, 2.48f, 0.0f, false, true, 12.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 6.5f)
                curveToRelative(0.0f, 0.51f, -0.153f, 0.982f, -0.415f, 1.374f)
                lineToRelative(0.83f, 0.556f)
                curveToRelative(0.37f, -0.552f, 0.585f, -1.216f, 0.585f, -1.93f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 3.0f)
                moveToRelative(-0.502f, 3.501f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.003f, 0.0f)
                lineTo(13.0f, 11.408f)
                lineToRelative(-0.003f, 0.09f)
                lineTo(13.0f, 11.498f)
                verticalLineToRelative(1.503f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.555f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.053f)
                lineTo(15.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.507f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.003f, 0.008f)
                verticalLineToRelative(0.132f)
                lineToRelative(-0.002f, 0.515f)
                lineTo(17.0f, 16.0f)
                curveToRelative(0.0f, 1.417f, -0.217f, 2.494f, -0.43f, 3.21f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.283f, 0.79f)
                lineTo(9.786f, 20.0f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-0.389f, -0.66f)
                lineToRelative(-1.2f, -2.037f)
                curveToRelative(-0.889f, -1.507f, -1.815f, -3.08f, -1.97f, -3.344f)
                curveToRelative(-0.137f, -0.232f, -0.19f, -0.406f, -0.196f, -0.53f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, 0.117f, -0.28f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.71f, 0.0f)
                lineToRelative(2.29f, 2.291f)
                lineToRelative(0.146f, 0.146f)
                lineTo(10.0f, 15.584f)
                verticalLineToRelative(-3.083f)
                lineToRelative(-0.002f, -5.0f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, true, 1.0f, -0.048f)
                lineTo(11.0f, 12.5f)
                verticalLineToRelative(0.507f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.001f, -5.505f)
                quadToRelative(0.0f, -0.043f, -0.002f, -0.085f)
                close()
                moveTo(14.001f, 6.501f)
                lineTo(14.0f, 10.082f)
                quadToRelative(0.235f, -0.083f, 0.498f, -0.084f)
                curveToRelative(0.694f, 0.0f, 1.277f, 0.469f, 1.45f, 1.108f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, true, 2.055f, 1.396f)
                verticalLineToRelative(0.135f)
                lineTo(18.0f, 13.15f)
                lineTo(18.0f, 16.0f)
                curveToRelative(0.0f, 1.52f, -0.233f, 2.694f, -0.47f, 3.494f)
                curveToRelative(-0.12f, 0.4f, -0.24f, 0.707f, -0.331f, 0.917f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.15f, 0.31f)
                lineToRelative(-0.01f, 0.019f)
                lineToRelative(-0.004f, 0.006f)
                verticalLineToRelative(0.002f)
                lineToRelative(-0.001f, 0.001f)
                lineToRelative(-0.434f, -0.248f)
                lineToRelative(0.433f, 0.249f)
                lineToRelative(-0.144f, 0.25f)
                lineTo(9.214f, 21.0f)
                lineToRelative(-0.145f, -0.246f)
                lineToRelative(0.431f, -0.254f)
                lineToRelative(-0.43f, 0.254f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.002f, -0.004f)
                lineToRelative(-0.007f, -0.012f)
                lineToRelative(-0.029f, -0.048f)
                lineToRelative(-0.108f, -0.184f)
                lineToRelative(-0.39f, -0.66f)
                lineToRelative(-1.2f, -2.038f)
                curveToRelative(-0.888f, -1.506f, -1.815f, -3.079f, -1.971f, -3.346f)
                curveToRelative(-0.176f, -0.3f, -0.318f, -0.638f, -0.332f, -0.993f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, true, 0.41f, -1.03f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.123f, 0.0f)
                verticalLineToRelative(0.001f)
                lineTo(9.0f, 13.878f)
                verticalLineToRelative(-1.377f)
                lineToRelative(-0.002f, -5.0f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, true, 2.053f, -1.396f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, true, 2.95f, 0.396f)
            }
        }
        .build()
        return _twoFingerTapSmall!!
    }

private var _twoFingerTapSmall: ImageVector? = null
