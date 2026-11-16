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

public val SBBIcons.LotusSmall: ImageVector
    get() {
        if (_lotusSmall != null) {
            return _lotusSmall!!
        }
        _lotusSmall = Builder(name = "LotusSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.0f, 17.125f)
                lineToRelative(0.3f, -0.224f)
                lineToRelative(-0.3f, -0.4f)
                lineToRelative(0.3f, 0.398f)
                lineToRelative(0.003f, -0.002f)
                lineToRelative(0.007f, -0.004f)
                quadToRelative(0.006f, -0.007f, 0.02f, -0.016f)
                lineToRelative(0.009f, -0.008f)
                lineToRelative(0.063f, -0.05f)
                arcToRelative(11.135f, 11.135f, 0.0f, false, false, 1.09f, -1.035f)
                curveToRelative(0.651f, -0.707f, 1.441f, -1.741f, 1.97f, -3.032f)
                curveToRelative(0.533f, -1.296f, 0.803f, -2.856f, 0.4f, -4.592f)
                curveToRelative(-0.402f, -1.734f, -1.465f, -3.599f, -3.52f, -5.525f)
                lineTo(12.0f, 2.315f)
                lineToRelative(-0.342f, 0.32f)
                curveTo(9.603f, 4.56f, 8.54f, 6.425f, 8.138f, 8.16f)
                reflectiveCurveToRelative(-0.132f, 3.296f, 0.4f, 4.592f)
                curveToRelative(0.529f, 1.29f, 1.319f, 2.325f, 1.969f, 3.032f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 1.09f, 1.035f)
                lineToRelative(0.088f, 0.07f)
                lineToRelative(0.005f, 0.004f)
                lineToRelative(0.007f, 0.005f)
                lineToRelative(0.001f, 0.002f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.301f, -0.4f)
                lineToRelative(-0.3f, 0.4f)
                close()
                moveTo(9.112f, 8.387f)
                curveTo(9.44f, 6.977f, 10.286f, 5.393f, 12.0f, 3.694f)
                curveToRelative(1.714f, 1.7f, 2.56f, 3.284f, 2.888f, 4.693f)
                curveToRelative(0.347f, 1.498f, 0.117f, 2.845f, -0.35f, 3.986f)
                curveToRelative(-0.471f, 1.147f, -1.181f, 2.081f, -1.781f, 2.734f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -0.758f, 0.744f)
                curveToRelative(-0.192f, -0.17f, -0.458f, -0.421f, -0.756f, -0.745f)
                curveToRelative(-0.6f, -0.652f, -1.31f, -1.586f, -1.78f, -2.733f)
                curveToRelative(-0.468f, -1.141f, -0.698f, -2.488f, -0.35f, -3.986f)
                moveTo(7.177f, 6.74f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, false, -3.507f, -0.604f)
                lineToRelative(-0.391f, 0.013f)
                lineToRelative(-0.081f, 0.384f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, false, 6.804f, 10.602f)
                lineToRelative(0.219f, -0.976f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, -6.12f, -9.025f)
                curveToRelative(0.931f, 0.019f, 1.849f, 0.204f, 2.717f, 0.54f)
                close()
                moveTo(21.345f, 12.538f)
                curveToRelative(0.599f, 0.33f, 1.157f, 0.726f, 1.667f, 1.18f)
                lineToRelative(0.293f, 0.262f)
                lineToRelative(-0.185f, 0.347f)
                arcToRelative(8.97f, 8.97f, 0.0f, false, true, -9.191f, 4.66f)
                lineTo(14.07f, 18.0f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, false, 7.967f, -3.794f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.177f, -0.792f)
                close()
                moveTo(3.139f, 13.413f)
                quadToRelative(-0.625f, 0.346f, -1.178f, 0.792f)
                arcTo(7.975f, 7.975f, 0.0f, false, false, 9.93f, 18.0f)
                lineToRelative(0.141f, 0.99f)
                arcTo(8.975f, 8.975f, 0.0f, false, true, 0.88f, 14.326f)
                lineToRelative(-0.185f, -0.347f)
                lineToRelative(0.293f, -0.261f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 1.667f, -1.18f)
                close()
                moveTo(20.329f, 6.136f)
                lineTo(20.722f, 6.149f)
                lineTo(20.803f, 6.533f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, true, -6.805f, 10.602f)
                lineToRelative(-0.218f, -0.976f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, 6.119f, -9.025f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.716f, 0.54f)
                lineToRelative(-0.36f, -0.934f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, true, 3.506f, -0.604f)
            }
        }
        .build()
        return _lotusSmall!!
    }

private var _lotusSmall: ImageVector? = null
