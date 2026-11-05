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

public val SBBIcons.WheelMicrophoneSmall: ImageVector
    get() {
        if (_wheelMicrophoneSmall != null) {
            return _wheelMicrophoneSmall!!
        }
        _wheelMicrophoneSmall = Builder(name = "WheelMicrophoneSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(3.485f, 0.0f, 6.625f, 1.76f, 8.417f, 4.475f)
                lineToRelative(-0.834f, 0.55f)
                curveTo(17.976f, 4.59f, 15.147f, 3.0f, 12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 18.0f)
                curveToRelative(0.927f, 0.0f, 1.77f, -0.122f, 2.602f, -0.378f)
                lineToRelative(0.296f, 0.956f)
                arcTo(9.7f, 9.7f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                moveToRelative(3.0f, 14.5f)
                curveToRelative(0.0f, 1.477f, 1.246f, 2.5f, 3.0f, 2.5f)
                reflectiveCurveToRelative(3.0f, -1.023f, 3.0f, -2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.03f, -1.599f, 3.286f, -3.5f, 3.474f)
                lineTo(18.5f, 21.0f)
                lineTo(20.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.026f)
                curveToRelative(-1.901f, -0.188f, -3.5f, -1.445f, -3.5f, -3.474f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(2.268f, 0.0f, 4.305f, 0.938f, 5.76f, 2.454f)
                lineToRelative(-0.72f, 0.692f)
                arcTo(6.95f, 6.95f, 0.0f, false, false, 12.0f, 5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, 14.0f)
                curveToRelative(0.577f, 0.0f, 1.114f, -0.093f, 1.678f, -0.235f)
                lineToRelative(0.244f, 0.97f)
                curveToRelative(-0.61f, 0.154f, -1.234f, 0.265f, -1.922f, 0.265f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                moveToRelative(6.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.796f, 1.99f)
                lineTo(18.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.796f, -1.99f)
                close()
                moveTo(18.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineToRelative(0.102f, -0.005f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 16.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.898f, -0.995f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _wheelMicrophoneSmall!!
    }

private var _wheelMicrophoneSmall: ImageVector? = null
