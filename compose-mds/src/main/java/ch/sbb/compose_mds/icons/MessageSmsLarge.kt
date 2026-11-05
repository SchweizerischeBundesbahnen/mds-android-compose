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

public val SBBIcons.MessageSmsLarge: ImageVector
    get() {
        if (_messageSmsLarge != null) {
            return _messageSmsLarge!!
        }
        _messageSmsLarge = Builder(
            name = "MessageSmsLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveTo(14.0f, 11.0f)
                lineTo(6.5f, 11.0f)
                curveToRelative(-0.413f, 0.0f, -0.689f, 0.102f, -0.879f, 0.229f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, false, -0.424f, 0.495f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.194f, 0.725f)
                lineTo(5.0f, 12.494f)
                lineTo(5.0f, 40.5f)
                curveToRelative(0.0f, 0.413f, 0.102f, 0.689f, 0.229f, 0.879f)
                curveToRelative(0.128f, 0.193f, 0.304f, 0.328f, 0.495f, 0.424f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.725f, 0.194f)
                lineToRelative(0.045f, 0.003f)
                horizontalLineToRelative(14.012f)
                lineToRelative(0.045f, -0.003f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, false, 0.726f, -0.194f)
                curveToRelative(0.19f, -0.096f, 0.366f, -0.23f, 0.494f, -0.424f)
                curveToRelative(0.127f, -0.19f, 0.229f, -0.466f, 0.229f, -0.879f)
                lineTo(22.0f, 35.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.587f, -0.148f, 1.061f, -0.396f, 1.434f)
                curveToRelative(-0.247f, 0.369f, -0.571f, 0.609f, -0.88f, 0.763f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.103f, 0.298f)
                quadToRelative(-0.05f, 0.004f, -0.082f, 0.004f)
                lineToRelative(-0.025f, 0.001f)
                lineTo(6.5f, 43.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.001f, 0.5f)
                horizontalLineToRelative(-0.013f)
                lineToRelative(-0.025f, -0.001f)
                lineToRelative(-0.082f, -0.004f)
                arcToRelative(2.96f, 2.96f, 0.0f, false, true, -1.103f, -0.298f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, true, -0.88f, -0.763f)
                curveTo(4.148f, 41.56f, 4.0f, 41.088f, 4.0f, 40.5f)
                verticalLineToRelative(-28.0f)
                horizontalLineToRelative(0.5f)
                lineToRelative(-0.5f, -0.001f)
                verticalLineToRelative(-0.013f)
                lineToRelative(0.001f, -0.025f)
                quadToRelative(0.0f, -0.03f, 0.004f, -0.082f)
                quadToRelative(0.007f, -0.104f, 0.033f, -0.274f)
                curveToRelative(0.037f, -0.22f, 0.111f, -0.521f, 0.265f, -0.829f)
                curveToRelative(0.154f, -0.309f, 0.394f, -0.633f, 0.763f, -0.88f)
                curveTo(5.44f, 10.149f, 5.913f, 10.0f, 6.5f, 10.0f)
                lineTo(14.0f, 10.0f)
                close()
                moveTo(43.0f, 27.0f)
                lineTo(26.707f, 27.0f)
                lineTo(22.0f, 31.707f)
                lineTo(22.0f, 27.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(17.0f, 26.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.293f)
                lineTo(26.293f, 26.0f)
                lineTo(42.0f, 26.0f)
                lineTo(42.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                close()
                moveTo(34.0f, 19.0f)
                lineTo(21.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(38.0f, 15.0f)
                lineTo(21.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(14.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(38.0f, 11.0f)
                lineTo(21.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
            }
        }
            .build()
        return _messageSmsLarge!!
    }

private var _messageSmsLarge: ImageVector? = null
