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

public val SBBIcons.ThumbDownMedium: ImageVector
    get() {
        if (_thumbDownMedium != null) {
            return _thumbDownMedium!!
        }
        _thumbDownMedium = Builder(name = "ThumbDownMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.25f, 12.665f)
                verticalLineToRelative(7.097f)
                lineTo(8.749f, 19.762f)
                lineTo(8.749f, 8.75f)
                horizontalLineToRelative(3.502f)
                close()
                moveTo(13.25f, 9.297f)
                lineTo(13.25f, 7.75f)
                lineTo(7.75f, 7.75f)
                verticalLineToRelative(13.012f)
                horizontalLineToRelative(6.281f)
                lineToRelative(6.285f, 6.893f)
                lineToRelative(0.008f, 0.01f)
                lineToRelative(0.007f, 0.006f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, false, 3.42f, -1.408f)
                curveToRelative(0.0f, -0.241f, -0.042f, -0.477f, -0.125f, -0.698f)
                lineToRelative(-0.003f, -0.007f)
                lineToRelative(-1.888f, -4.795f)
                horizontalLineToRelative(4.516f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.32f, -3.501f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, false, 0.0f, -3.0f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, false, -1.099f, -3.486f)
                curveToRelative(0.176f, -0.298f, 0.279f, -0.643f, 0.279f, -1.013f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.17f, 0.0f, -2.431f, 0.19f, -3.405f, 0.949f)
                quadToRelative(-0.328f, 0.254f, -0.594f, 0.585f)
                moveToRelative(0.0f, 10.466f)
                lineTo(13.252f, 12.67f)
                curveToRelative(0.019f, -1.713f, 0.536f, -2.645f, 1.209f, -3.169f)
                curveToRelative(0.71f, -0.553f, 1.698f, -0.738f, 2.791f, -0.738f)
                horizontalLineToRelative(7.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(24.0f, 10.763f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(24.0f, 13.763f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(24.0f, 16.763f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-5.984f)
                lineToRelative(0.27f, 0.683f)
                lineToRelative(2.155f, 5.478f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.645f, 1.049f)
                lineToRelative(-6.427f, -7.047f)
                lineToRelative(-0.148f, -0.163f)
                close()
                moveTo(23.627f, 25.565f)
                lineTo(23.16f, 25.74f)
                lineTo(23.176f, 25.734f)
                close()
            }
        }
        .build()
        return _thumbDownMedium!!
    }

private var _thumbDownMedium: ImageVector? = null
