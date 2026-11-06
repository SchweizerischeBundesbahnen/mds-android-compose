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

public val SBBIcons.MicrophoneDisabledSmall: ImageVector
    get() {
        if (_microphoneDisabledSmall != null) {
            return _microphoneDisabledSmall!!
        }
        _microphoneDisabledSmall = Builder(name = "MicrophoneDisabledSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 5.5f)
                curveTo(9.0f, 4.126f, 10.126f, 3.0f, 11.5f, 3.0f)
                reflectiveCurveTo(14.0f, 4.126f, 14.0f, 5.5f)
                lineTo(14.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.0f, 5.5f)
                curveTo(15.0f, 3.574f, 13.426f, 2.0f, 11.5f, 2.0f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 8.0f, 5.5f)
                lineTo(8.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.114f, 16.82f)
                lineTo(20.646f, 21.354f)
                lineTo(21.354f, 20.646f)
                lineTo(3.354f, 2.646f)
                lineTo(2.646f, 3.354f)
                lineTo(8.0f, 8.707f)
                lineTo(8.0f, 13.5f)
                curveToRelative(0.0f, 1.926f, 1.574f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.295f, 0.0f, 2.428f, -0.71f, 3.034f, -1.76f)
                lineToRelative(0.86f, 0.86f)
                curveTo(14.635f, 17.278f, 13.21f, 18.0f, 11.5f, 18.0f)
                curveTo(8.942f, 18.0f, 7.0f, 16.418f, 7.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                curveToRelative(0.0f, 2.929f, 2.255f, 4.781f, 5.0f, 4.982f)
                lineTo(11.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.018f)
                curveToRelative(1.703f, -0.125f, 3.208f, -0.887f, 4.114f, -2.161f)
                moveTo(9.0f, 13.5f)
                lineTo(9.0f, 9.707f)
                lineToRelative(4.79f, 4.79f)
                arcTo(2.51f, 2.51f, 0.0f, false, true, 11.5f, 16.0f)
                arcTo(2.51f, 2.51f, 0.0f, false, true, 9.0f, 13.5f)
            }
        }
        .build()
        return _microphoneDisabledSmall!!
    }

private var _microphoneDisabledSmall: ImageVector? = null
