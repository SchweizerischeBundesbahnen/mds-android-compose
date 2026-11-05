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

public val SBBIcons.HandClockMedium: ImageVector
    get() {
        if (_handClockMedium != null) {
            return _handClockMedium!!
        }
        _handClockMedium = Builder(name = "HandClockMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.758f, 4.75f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 1.979f, 1.776f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 29.75f, 8.25f)
                verticalLineToRelative(2.773f)
                arcToRelative(1.995f, 1.995f, 0.0f, false, true, 2.99f, 1.518f)
                lineToRelative(0.008f, 0.204f)
                verticalLineToRelative(4.877f)
                lineToRelative(-0.003f, 7.128f)
                curveToRelative(0.0f, 1.575f, -0.39f, 3.132f, -0.773f, 4.282f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -0.705f, 1.794f)
                lineToRelative(-0.051f, 0.107f)
                lineToRelative(-0.014f, 0.028f)
                lineToRelative(-0.003f, 0.009f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-0.138f, 0.278f)
                horizontalLineTo(19.963f)
                lineToRelative(-0.145f, -0.246f)
                lineToRelative(-5.694f, -9.669f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, true, 3.124f, -2.405f)
                lineToRelative(-0.71f, 0.704f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, -1.552f, 1.194f)
                lineToRelative(5.548f, 9.422f)
                horizontalLineToRelative(9.895f)
                lineToRelative(0.095f, -0.213f)
                curveToRelative(0.136f, -0.318f, 0.318f, -0.773f, 0.5f, -1.32f)
                curveToRelative(0.366f, -1.1f, 0.722f, -2.543f, 0.722f, -3.967f)
                lineToRelative(0.002f, -7.128f)
                lineToRelative(0.001f, -3.424f)
                verticalLineToRelative(-1.453f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, -1.989f, -0.003f)
                lineToRelative(-0.01f, 6.759f)
                lineToRelative(-1.0f, -0.001f)
                verticalLineTo(8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(19.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(6.74f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, false, -1.977f, -0.102f)
                lineToRelative(-0.005f, 0.101f)
                lineToRelative(-0.003f, 1.515f)
                lineTo(23.75f, 19.5f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-0.5f, -0.001f)
                lineToRelative(0.015f, -11.249f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, -2.015f, 0.002f)
                lineToRelative(-0.002f, 14.422f)
                verticalLineToRelative(1.216f)
                lineToRelative(-0.855f, -0.865f)
                lineToRelative(-3.356f, -3.391f)
                lineToRelative(0.711f, -0.703f)
                lineToRelative(2.5f, 2.526f)
                lineToRelative(0.002f, -13.205f)
                arcToRelative(2.008f, 2.008f, 0.0f, false, true, 3.03f, -1.727f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 1.978f, -1.775f)
                moveToRelative(-11.258f, 0.0f)
                curveToRelative(1.706f, 0.0f, 3.316f, 0.417f, 4.732f, 1.155f)
                lineToRelative(-0.463f, 0.887f)
                arcTo(9.25f, 9.25f, 0.0f, true, false, 13.5f, 24.25f)
                verticalLineToRelative(1.0f)
                curveTo(7.84f, 25.25f, 3.25f, 20.662f, 3.25f, 15.0f)
                curveToRelative(0.0f, -5.66f, 4.59f, -10.25f, 10.25f, -10.25f)
                moveToRelative(-0.25f, 10.5f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.75f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _handClockMedium!!
    }

private var _handClockMedium: ImageVector? = null
