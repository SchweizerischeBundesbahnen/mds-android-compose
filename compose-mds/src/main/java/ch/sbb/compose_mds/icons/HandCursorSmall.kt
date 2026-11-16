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

public val SBBIcons.HandCursorSmall: ImageVector
    get() {
        if (_handCursorSmall != null) {
            return _handCursorSmall!!
        }
        _handCursorSmall = Builder(name = "HandCursorSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 5.5f)
                curveToRelative(0.0f, -0.274f, -0.226f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.226f, -0.5f, 0.5f)
                verticalLineToRelative(10.787f)
                lineToRelative(-3.143f, -3.143f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, -0.713f, 0.0f)
                curveToRelative(-0.096f, 0.095f, -0.122f, 0.18f, -0.117f, 0.279f)
                curveToRelative(0.005f, 0.124f, 0.06f, 0.3f, 0.197f, 0.538f)
                arcToRelative(801.0f, 801.0f, 0.0f, false, false, 1.968f, 3.343f)
                lineToRelative(0.817f, 1.382f)
                lineToRelative(0.386f, 0.653f)
                lineToRelative(0.238f, 0.403f)
                lineToRelative(0.15f, 0.255f)
                lineToRelative(0.002f, 0.003f)
                horizontalLineToRelative(6.501f)
                curveToRelative(0.076f, -0.174f, 0.18f, -0.439f, 0.285f, -0.79f)
                curveToRelative(0.212f, -0.715f, 0.43f, -1.792f, 0.43f, -3.21f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.274f, -0.227f, -0.5f, -0.5f, -0.5f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.226f, -0.5f, 0.5f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.274f, -0.226f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.226f, -0.5f, 0.5f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.274f, -0.226f, -0.5f, -0.5f, -0.5f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, false, -0.5f, 0.484f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(5.5f)
                moveToRelative(2.947f, 4.606f)
                arcTo(1.504f, 1.504f, 0.0f, false, false, 12.0f, 9.086f)
                verticalLineTo(5.5f)
                curveToRelative(0.0f, -0.826f, -0.674f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(9.0f, 4.674f, 9.0f, 5.5f)
                verticalLineToRelative(8.373f)
                lineToRelative(-1.436f, -1.436f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, -2.127f, 0.0f)
                curveToRelative(-0.294f, 0.294f, -0.425f, 0.65f, -0.41f, 1.028f)
                curveToRelative(0.015f, 0.353f, 0.156f, 0.692f, 0.33f, 0.994f)
                curveToRelative(0.157f, 0.274f, 1.086f, 1.85f, 1.973f, 3.352f)
                lineTo(8.4f, 19.62f)
                lineToRelative(0.134f, 0.228f)
                lineToRelative(0.252f, 0.425f)
                lineToRelative(0.138f, 0.233f)
                lineToRelative(0.108f, 0.183f)
                lineToRelative(0.02f, 0.033f)
                lineToRelative(0.009f, 0.016f)
                lineToRelative(0.007f, 0.012f)
                verticalLineToRelative(0.003f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.146f, 0.245f)
                horizontalLineToRelative(7.674f)
                lineToRelative(0.144f, -0.25f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(0.002f, -0.005f)
                lineToRelative(0.004f, -0.007f)
                lineToRelative(0.003f, -0.005f)
                lineToRelative(0.004f, -0.006f)
                lineToRelative(0.002f, -0.003f)
                lineToRelative(0.033f, -0.064f)
                quadToRelative(0.044f, -0.085f, 0.114f, -0.243f)
                curveToRelative(0.093f, -0.21f, 0.213f, -0.516f, 0.331f, -0.916f)
                curveToRelative(0.238f, -0.8f, 0.471f, -1.973f, 0.471f, -3.495f)
                verticalLineToRelative(-3.5f)
                arcToRelative(1.503f, 1.503f, 0.0f, false, false, -2.053f, -1.394f)
                arcToRelative(1.504f, 1.504f, 0.0f, false, false, -2.0f, -1.0f)
            }
        }
        .build()
        return _handCursorSmall!!
    }

private var _handCursorSmall: ImageVector? = null
