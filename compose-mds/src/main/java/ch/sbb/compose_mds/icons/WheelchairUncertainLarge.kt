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

public val SBBIcons.WheelchairUncertainLarge: ImageVector
    get() {
        if (_wheelchairUncertainLarge != null) {
            return _wheelchairUncertainLarge!!
        }
        _wheelchairUncertainLarge = Builder(name = "WheelchairUncertainLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 27.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(22.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                lineTo(12.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(35.09f, 38.996f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(8.896f, 22.366f)
                lineToRelative(0.227f, 0.445f)
                curveTo(6.681f, 24.054f, 5.0f, 26.595f, 5.0f, 29.502f)
                curveToRelative(0.0f, 4.12f, 3.378f, 7.5f, 7.5f, 7.5f)
                curveToRelative(2.984f, 0.0f, 5.583f, -1.772f, 6.786f, -4.321f)
                lineToRelative(0.452f, 0.214f)
                lineToRelative(0.452f, 0.212f)
                curveToRelative(-1.36f, 2.883f, -4.302f, 4.895f, -7.69f, 4.895f)
                curveToRelative(-4.674f, 0.0f, -8.5f, -3.828f, -8.5f, -8.5f)
                curveToRelative(0.0f, -3.3f, 1.908f, -6.176f, 4.669f, -7.581f)
                close()
                moveTo(31.758f, 11.706f)
                curveToRelative(2.018f, -0.991f, 4.495f, -0.952f, 6.597f, -0.065f)
                lineToRelative(0.415f, 0.188f)
                lineToRelative(0.015f, 0.008f)
                curveToRelative(1.388f, 0.74f, 2.603f, 2.086f, 2.991f, 3.8f)
                curveToRelative(0.394f, 1.736f, -0.08f, 3.76f, -1.903f, 5.797f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-2.99f, 2.99f)
                curveToRelative(-0.904f, 1.027f, -1.352f, 1.81f, -1.589f, 2.668f)
                curveToRelative(-0.243f, 0.883f, -0.274f, 1.882f, -0.274f, 3.388f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.488f, 0.026f, -2.62f, 0.31f, -3.653f)
                curveToRelative(0.291f, -1.055f, 0.84f, -1.972f, 1.815f, -3.078f)
                lineToRelative(0.022f, -0.023f)
                lineToRelative(2.986f, -2.987f)
                curveToRelative(1.644f, -1.84f, 1.976f, -3.54f, 1.668f, -4.902f)
                curveToRelative(-0.313f, -1.38f, -1.304f, -2.504f, -2.476f, -3.132f)
                curveToRelative(-1.94f, -0.945f, -4.287f, -1.025f, -6.127f, -0.123f)
                curveTo(30.39f, 13.49f, 29.0f, 15.363f, 29.0f, 18.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.48f, 1.573f, -5.723f, 3.758f, -6.795f)
                moveTo(12.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
            }
        }
        .build()
        return _wheelchairUncertainLarge!!
    }

private var _wheelchairUncertainLarge: ImageVector? = null
