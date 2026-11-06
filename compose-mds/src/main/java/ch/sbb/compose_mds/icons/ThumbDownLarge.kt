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

public val SBBIcons.ThumbDownLarge: ImageVector
    get() {
        if (_thumbDownLarge != null) {
            return _thumbDownLarge!!
        }
        _thumbDownLarge = Builder(name = "ThumbDownLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.414f)
                curveToRelative(0.297f, -0.462f, 0.654f, -0.85f, 1.061f, -1.167f)
                curveToRelative(1.255f, -0.977f, 2.893f, -1.23f, 4.439f, -1.23f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.563f, -0.19f, 1.081f, -0.504f, 1.5f)
                horizontalLineToRelative(0.004f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, true, 1.496f, 4.499f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, 0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -1.496f, 4.501f)
                horizontalLineToRelative(-6.266f)
                lineToRelative(2.607f, 6.62f)
                lineToRelative(0.003f, 0.008f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.118f, 2.633f)
                lineToRelative(-0.008f, -0.009f)
                lineToRelative(-0.007f, -0.007f)
                lineToRelative(-8.432f, -9.245f)
                lineTo(17.0f, 27.017f)
                verticalLineToRelative(-0.001f)
                horizontalLineToRelative(-6.002f)
                lineTo(10.998f, 10.0f)
                lineTo(18.0f, 10.0f)
                close()
                moveTo(23.5f, 11.017f)
                curveToRelative(-1.47f, 0.0f, -2.832f, 0.247f, -3.823f, 1.02f)
                curveToRelative(-0.966f, 0.752f, -1.677f, 2.082f, -1.677f, 4.48f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(1.72f)
                lineToRelative(0.15f, 0.163f)
                lineToRelative(8.565f, 9.392f)
                lineToRelative(0.107f, 0.098f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.366f, -1.673f)
                lineTo(28.035f, 26.7f)
                lineToRelative(-0.27f, -0.683f)
                lineTo(35.5f, 26.017f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                verticalLineToRelative(-0.001f)
                lineTo(32.0f, 23.016f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                lineTo(32.0f, 19.016f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                lineTo(32.0f, 15.016f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(11.998f, 26.016f)
                lineTo(17.0f, 26.016f)
                lineTo(17.0f, 11.0f)
                horizontalLineToRelative(-5.002f)
                close()
            }
        }
        .build()
        return _thumbDownLarge!!
    }

private var _thumbDownLarge: ImageVector? = null
