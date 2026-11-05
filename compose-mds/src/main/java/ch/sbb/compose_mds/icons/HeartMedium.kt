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

public val SBBIcons.HeartMedium: ImageVector
    get() {
        if (_heartMedium != null) {
            return _heartMedium!!
        }
        _heartMedium = Builder(name = "HeartMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.241f, 14.246f)
                arcToRelative(7.975f, 7.975f, 0.0f, false, true, 8.01f, -7.996f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 6.003f, 2.731f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, true, 5.996f, -2.73f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, true, 8.0f, 7.995f)
                curveToRelative(0.0f, 1.45f, -0.38f, 2.809f, -1.048f, 3.98f)
                curveToRelative(-0.235f, 0.414f, -0.9f, 1.269f, -1.168f, 1.593f)
                lineToRelative(-0.015f, 0.018f)
                lineToRelative(-0.017f, 0.017f)
                lineToRelative(-11.398f, 11.4f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.353f, -0.353f)
                lineTo(5.483f, 19.839f)
                lineToRelative(-0.007f, -0.008f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.267f, -1.751f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.968f, -3.834f)
                moveToRelative(8.01f, -6.996f)
                arcToRelative(6.975f, 6.975f, 0.0f, false, false, -7.01f, 6.996f)
                curveToRelative(0.0f, 1.22f, 0.307f, 2.363f, 0.847f, 3.356f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 1.106f, 1.533f)
                lineTo(17.25f, 30.193f)
                lineToRelative(11.028f, -11.03f)
                curveToRelative(0.28f, -0.34f, 0.873f, -1.11f, 1.055f, -1.432f)
                verticalLineToRelative(-0.001f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.917f, -3.484f)
                curveToRelative(0.0f, -0.85f, -0.148f, -1.661f, -0.421f, -2.41f)
                verticalLineToRelative(-0.001f)
                arcTo(6.97f, 6.97f, 0.0f, false, false, 23.25f, 7.25f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, false, -5.594f, 2.825f)
                lineToRelative(-0.4f, 0.54f)
                lineToRelative(-0.402f, -0.54f)
                arcTo(6.95f, 6.95f, 0.0f, false, false, 11.25f, 7.25f)
            }
        }
        .build()
        return _heartMedium!!
    }

private var _heartMedium: ImageVector? = null
