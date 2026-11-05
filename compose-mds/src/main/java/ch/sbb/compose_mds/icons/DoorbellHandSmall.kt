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

public val SBBIcons.DoorbellHandSmall: ImageVector
    get() {
        if (_doorbellHandSmall != null) {
            return _doorbellHandSmall!!
        }
        _doorbellHandSmall = Builder(
            name = "DoorbellHandSmall",
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
                moveTo(2.5f, 2.0f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.298f)
                lineToRelative(0.429f, 0.428f)
                quadToRelative(-0.226f, 0.108f, -0.414f, 0.293f)
                arcToRelative(1.504f, 1.504f, 0.0f, false, false, -0.244f, 1.803f)
                arcToRelative(1.504f, 1.504f, 0.0f, false, false, -0.705f, 2.124f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, false, -0.466f, 2.44f)
                lineToRelative(0.002f, 0.001f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.004f, 0.004f)
                lineToRelative(0.016f, 0.016f)
                lineToRelative(0.074f, 0.073f)
                lineToRelative(0.364f, 0.362f)
                lineToRelative(2.016f, 2.014f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 2.783f, 1.38f)
                curveToRelative(0.4f, 0.067f, 0.745f, 0.08f, 0.991f, 0.075f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.378f, -0.025f)
                lineToRelative(0.025f, -0.003f)
                horizontalLineToRelative(0.008f)
                lineToRelative(0.003f, -0.001f)
                horizontalLineToRelative(0.001f)
                lineTo(13.5f, 21.5f)
                lineToRelative(0.074f, 0.494f)
                lineToRelative(0.178f, -0.026f)
                lineToRelative(0.12f, -0.134f)
                lineToRelative(4.5f, -5.0f)
                lineToRelative(0.177f, -0.197f)
                lineToRelative(-0.064f, -0.258f)
                lineToRelative(-1.346f, -5.38f)
                lineTo(22.0f, 10.999f)
                lineTo(22.0f, 2.0f)
                lineTo(2.5f, 2.0f)
                moveToRelative(14.36f, 8.0f)
                lineTo(21.0f, 10.0f)
                lineTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.298f)
                lineTo(6.288f, 8.99f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 9.0f, 6.5f)
                curveToRelative(0.0f, 0.286f, -0.052f, 0.555f, -0.14f, 0.803f)
                lineTo(11.627f, 10.0f)
                horizontalLineToRelative(2.457f)
                curveToRelative(0.206f, -0.583f, 0.762f, -1.0f, 1.415f, -1.0f)
                curveToRelative(0.417f, 0.0f, 0.762f, 0.16f, 1.018f, 0.438f)
                curveToRelative(0.15f, 0.164f, 0.261f, 0.357f, 0.344f, 0.562f)
                moveToRelative(-2.862f, 1.0f)
                horizontalLineToRelative(-1.346f)
                lineToRelative(1.347f, 1.313f)
                close()
                moveTo(8.0f, 6.53f)
                lineTo(8.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.247f, 1.3f)
                arcTo(1.503f, 1.503f, 0.0f, false, true, 8.0f, 6.53f)
                moveTo(10.012f, 6.0f)
                horizontalLineToRelative(9.0f)
                lineTo(19.012f, 5.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(10.012f, 8.0f)
                horizontalLineToRelative(9.0f)
                lineTo(19.012f, 7.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(17.45f, 16.363f)
                lineTo(13.26f, 21.02f)
                lineTo(13.14f, 21.024f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -0.808f, -0.062f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.256f, -1.115f)
                lineTo(7.7f, 17.474f)
                lineToRelative(-0.074f, -0.074f)
                lineToRelative(-0.017f, -0.016f)
                lineToRelative(-0.003f, -0.004f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(0.501f, 0.501f, 0.0f, false, true, 0.71f, -0.71f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(-1.063f, -1.061f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, 0.668f, -0.746f)
                lineToRelative(1.105f, 1.1f)
                lineToRelative(0.705f, -0.71f)
                lineToRelative(-1.063f, -1.059f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(-0.072f, -0.067f)
                lineToRelative(-0.637f, -0.634f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, 0.678f, -0.739f)
                lineTo(11.5f, 14.2f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-1.77f, -1.772f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.055f, -0.053f)
                lineToRelative(-3.483f, -3.482f)
                arcToRelative(0.501f, 0.501f, 0.0f, false, true, 0.708f, -0.71f)
                lineToRelative(0.005f, 0.006f)
                lineToRelative(6.538f, 6.375f)
                lineToRelative(0.85f, 0.829f)
                lineTo(14.999f, 13.5f)
                lineToRelative(-0.002f, -2.998f)
                curveToRelative(0.0f, -0.279f, 0.224f, -0.502f, 0.5f, -0.502f)
                curveToRelative(0.137f, 0.0f, 0.215f, 0.042f, 0.282f, 0.115f)
                curveToRelative(0.083f, 0.09f, 0.168f, 0.252f, 0.235f, 0.51f)
                close()
            }
        }
            .build()
        return _doorbellHandSmall!!
    }

private var _doorbellHandSmall: ImageVector? = null
