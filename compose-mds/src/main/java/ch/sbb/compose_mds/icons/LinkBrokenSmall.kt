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

public val SBBIcons.LinkBrokenSmall: ImageVector
    get() {
        if (_linkBrokenSmall != null) {
            return _linkBrokenSmall!!
        }
        _linkBrokenSmall = Builder(name = "LinkBrokenSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(8.67f, 10.585f)
                lineTo(4.43f, 14.828f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, false, 0.0f, 3.536f)
                lineToRelative(0.706f, 0.706f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, false, 3.536f, 0.001f)
                lineToRelative(2.48f, -2.48f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.48f, 2.48f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -4.95f, 0.0f)
                lineToRelative(-0.706f, -0.707f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, 0.0f, -4.95f)
                lineToRelative(4.242f, -4.243f)
                close()
                moveTo(19.354f, 19.646f)
                lineTo(18.647f, 20.353f)
                lineTo(15.647f, 17.353f)
                lineTo(16.354f, 16.646f)
                close()
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(13.888f, 4.521f)
                arcToRelative(3.474f, 3.474f, 0.0f, false, true, 4.914f, -0.006f)
                lineToRelative(0.736f, 0.707f)
                lineToRelative(0.007f, 0.007f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, true, 0.006f, 4.922f)
                verticalLineToRelative(0.001f)
                lineToRelative(-4.248f, 4.268f)
                lineToRelative(-0.355f, -0.353f)
                lineToRelative(-0.353f, -0.352f)
                lineToRelative(4.248f, -4.268f)
                curveToRelative(0.971f, -0.97f, 0.968f, -2.538f, -0.005f, -3.511f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.729f, -0.699f)
                lineToRelative(-0.007f, -0.007f)
                arcToRelative(2.474f, 2.474f, 0.0f, false, false, -3.507f, 0.0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.003f, 0.004f)
                lineToRelative(-0.87f, 0.87f)
                lineToRelative(-1.6f, 1.601f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(1.6f, -1.6f)
                lineToRelative(0.87f, -0.87f)
                lineToRelative(0.003f, -0.005f)
                moveTo(6.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(8.354f, 7.646f)
                lineTo(7.646f, 8.354f)
                lineTo(4.646f, 5.354f)
                lineTo(5.354f, 4.646f)
                close()
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _linkBrokenSmall!!
    }

private var _linkBrokenSmall: ImageVector? = null
