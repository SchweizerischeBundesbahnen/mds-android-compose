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

public val SBBIcons.LinkBrokenMedium: ImageVector
    get() {
        if (_linkBrokenMedium != null) {
            return _linkBrokenMedium!!
        }
        _linkBrokenMedium = Builder(name = "LinkBrokenMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.75f, 33.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.001f, -6.0f)
                lineToRelative(0.501f, 0.001f)
                lineToRelative(0.5f, -0.001f)
                close()
                moveTo(12.83f, 15.701f)
                lineTo(6.467f, 22.065f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, false, 0.0f, 5.658f)
                lineToRelative(1.06f, 1.06f)
                arcToRelative(4.015f, 4.015f, 0.0f, false, false, 5.657f, 0.0f)
                lineToRelative(3.72f, -3.72f)
                lineToRelative(0.706f, 0.707f)
                lineToRelative(-3.72f, 3.72f)
                curveToRelative(-1.944f, 1.944f, -5.124f, 1.945f, -7.07f, 0.001f)
                lineToRelative(-1.06f, -1.06f)
                arcToRelative(5.014f, 5.014f, 0.0f, false, true, 0.0f, -7.073f)
                lineToRelative(6.363f, -6.364f)
                close()
                moveTo(28.854f, 29.647f)
                lineTo(28.147f, 30.354f)
                lineTo(23.646f, 25.854f)
                lineTo(24.353f, 25.147f)
                close()
                moveTo(31.5f, 21.25f)
                verticalLineToRelative(1.0f)
                lineToRelative(-6.0f, 0.001f)
                verticalLineToRelative(-1.002f)
                close()
                moveTo(21.194f, 6.782f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, true, 6.843f, 0.177f)
                lineToRelative(1.097f, 1.054f)
                lineToRelative(0.007f, 0.007f)
                arcToRelative(4.967f, 4.967f, 0.0f, false, true, 0.008f, 7.032f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-6.373f, 6.402f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.355f, -0.353f)
                lineToRelative(6.373f, -6.4f)
                lineToRelative(0.001f, -0.001f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, false, 0.0f, -5.613f)
                lineToRelative(-1.105f, -1.06f)
                lineToRelative(-0.008f, -0.008f)
                verticalLineToRelative(-0.001f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, false, -5.613f, 0.001f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.002f, 0.001f)
                lineToRelative(-0.005f, 0.005f)
                lineToRelative(-0.019f, 0.02f)
                lineToRelative(-1.286f, 1.286f)
                lineToRelative(-2.4f, 2.4f)
                lineToRelative(-0.706f, -0.707f)
                lineToRelative(2.398f, -2.4f)
                lineToRelative(0.937f, -0.936f)
                lineToRelative(0.35f, -0.35f)
                lineToRelative(0.019f, -0.02f)
                lineToRelative(0.005f, -0.005f)
                lineToRelative(0.002f, -0.001f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(9.0f, 15.25f)
                verticalLineToRelative(1.0f)
                lineToRelative(-6.0f, 0.001f)
                verticalLineToRelative(-1.002f)
                close()
                moveTo(12.354f, 11.646f)
                lineTo(11.647f, 12.353f)
                lineTo(7.146f, 7.853f)
                lineTo(7.854f, 7.146f)
                close()
                moveTo(16.25f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.001f, -6.0f)
                lineToRelative(0.501f, 0.001f)
                lineToRelative(0.5f, -0.001f)
                close()
            }
        }
        .build()
        return _linkBrokenMedium!!
    }

private var _linkBrokenMedium: ImageVector? = null
