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

public val SBBIcons.ClipboardUsersLarge: ImageVector
    get() {
        if (_clipboardUsersLarge != null) {
            return _clipboardUsersLarge!!
        }
        _clipboardUsersLarge = Builder(
            name = "ClipboardUsersLarge",
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
                moveTo(31.0f, 7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(35.0f)
                lineTo(4.0f, 42.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                lineTo(18.0f, 5.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(5.0f, 41.0f)
                horizontalLineToRelative(37.0f)
                lineTo(42.0f, 8.0f)
                lineTo(31.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(30.84f, 15.0f)
                curveToRelative(2.354f, 0.0f, 4.02f, 2.19f, 4.02f, 4.62f)
                curveToRelative(0.0f, 1.136f, -0.364f, 2.217f, -0.992f, 3.049f)
                curveToRelative(3.264f, 1.613f, 5.133f, 5.532f, 5.133f, 9.311f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.905f)
                curveToRelative(0.253f, 0.989f, 0.384f, 2.012f, 0.384f, 3.02f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-16.3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.765f, 1.787f, -7.761f, 5.063f, -9.388f)
                arcToRelative(5.06f, 5.06f, 0.0f, false, true, -0.943f, -2.971f)
                curveToRelative(0.0f, -2.304f, 1.496f, -4.314f, 3.54f, -4.588f)
                curveToRelative(0.094f, -1.028f, 0.5f, -1.88f, 1.145f, -2.495f)
                curveToRelative(0.738f, -0.703f, 1.749f, -1.058f, 2.855f, -1.058f)
                moveToRelative(-5.882f, 11.88f)
                curveToRelative(-2.853f, 1.252f, -4.61f, 4.646f, -4.766f, 8.12f)
                horizontalLineToRelative(14.275f)
                curveToRelative(-0.158f, -3.475f, -1.953f, -6.86f, -4.803f, -8.105f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, true, -2.345f, 0.866f)
                curveToRelative(-0.896f, 0.0f, -1.706f, -0.33f, -2.361f, -0.88f)
                moveToRelative(8.174f, -3.45f)
                curveToRelative(-0.54f, 0.43f, -1.185f, 0.712f, -1.904f, 0.788f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -0.844f, 1.91f)
                curveToRelative(2.095f, 1.04f, 3.599f, 3.049f, 4.408f, 5.352f)
                horizontalLineToRelative(3.195f)
                curveToRelative(-0.161f, -3.468f, -1.991f, -6.81f, -4.855f, -8.05f)
                moveTo(14.0f, 28.0f)
                lineTo(7.0f, 28.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(27.32f, 19.52f)
                curveToRelative(-1.594f, 0.001f, -3.02f, 1.541f, -3.02f, 3.62f)
                reflectiveCurveToRelative(1.426f, 3.62f, 3.02f, 3.62f)
                curveToRelative(1.593f, 0.0f, 3.02f, -1.54f, 3.02f, -3.62f)
                reflectiveCurveToRelative(-1.427f, -3.62f, -3.02f, -3.62f)
                moveTo(30.84f, 16.0f)
                curveToRelative(-0.894f, 0.0f, -1.643f, 0.285f, -2.165f, 0.782f)
                curveToRelative(-0.436f, 0.415f, -0.742f, 1.005f, -0.83f, 1.778f)
                curveToRelative(2.022f, 0.298f, 3.495f, 2.295f, 3.495f, 4.58f)
                lineToRelative(-0.002f, 0.05f)
                curveToRelative(1.416f, -0.28f, 2.522f, -1.732f, 2.522f, -3.57f)
                curveToRelative(0.0f, -2.049f, -1.375f, -3.62f, -3.02f, -3.62f)
                moveTo(18.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineToRelative(11.0f)
                lineTo(30.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                close()
            }
        }
            .build()
        return _clipboardUsersLarge!!
    }

private var _clipboardUsersLarge: ImageVector? = null
