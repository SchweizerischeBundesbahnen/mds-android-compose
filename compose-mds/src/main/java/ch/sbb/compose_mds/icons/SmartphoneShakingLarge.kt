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

public val SBBIcons.SmartphoneShakingLarge: ImageVector
    get() {
        if (_smartphoneShakingLarge != null) {
            return _smartphoneShakingLarge!!
        }
        _smartphoneShakingLarge = Builder(
            name = "SmartphoneShakingLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(29.5f, 14.998f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(24.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                lineTo(15.0f, 17.496f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(17.5f, 15.996f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(24.002f)
                curveToRelative(0.0f, 0.83f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.347f, -1.492f)
                lineToRelative(-0.153f, -0.008f)
                close()
                moveTo(12.672f, 17.189f)
                lineTo(6.95f, 19.285f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.897f, 1.92f)
                lineToRelative(6.916f, 18.62f)
                lineTo(12.5f, 40.0f)
                lineToRelative(-0.469f, 0.174f)
                lineToRelative(-6.916f, -18.621f)
                lineToRelative(-0.002f, -0.003f)
                arcToRelative(2.503f, 2.503f, 0.0f, false, true, 1.494f, -3.204f)
                lineToRelative(5.721f, -2.096f)
                close()
                moveTo(40.269f, 18.346f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.494f, 3.204f)
                lineToRelative(-0.001f, 0.003f)
                lineToRelative(-6.916f, 18.62f)
                lineToRelative(-0.469f, -0.173f)
                lineToRelative(-0.469f, -0.175f)
                lineToRelative(6.916f, -18.62f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.897f, -1.92f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-5.72f, -2.096f)
                lineToRelative(0.343f, -0.939f)
                close()
                moveTo(26.0f, 17.997f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(37.929f, 9.242f)
                lineTo(38.185f, 9.671f)
                lineTo(37.757f, 9.928f)
                lineTo(32.757f, 12.928f)
                lineTo(32.243f, 12.07f)
                lineTo(36.252f, 9.663f)
                curveTo(32.217f, 8.564f, 27.872f, 8.0f, 23.5f, 8.0f)
                curveToRelative(-4.402f, 0.0f, -8.71f, 0.554f, -12.756f, 1.663f)
                lineToRelative(4.013f, 2.408f)
                lineToRelative(-0.514f, 0.858f)
                lineToRelative(-5.0f, -3.0f)
                lineToRelative(-0.429f, -0.257f)
                lineToRelative(0.257f, -0.429f)
                lineToRelative(3.0f, -5.0f)
                lineToRelative(0.858f, 0.514f)
                lineToRelative(-2.35f, 3.915f)
                curveToRelative(4.11f, -1.117f, 8.472f, -1.672f, 12.921f, -1.672f)
                curveToRelative(4.422f, 0.0f, 8.822f, 0.567f, 12.92f, 1.674f)
                lineToRelative(-2.349f, -3.917f)
                lineToRelative(0.858f, -0.514f)
                close()
            }
        }
            .build()
        return _smartphoneShakingLarge!!
    }

private var _smartphoneShakingLarge: ImageVector? = null
