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

public val SBBIcons.ThumbUpMedium: ImageVector
    get() {
        if (_thumbUpMedium != null) {
            return _thumbUpMedium!!
        }
        _thumbUpMedium = Builder(name = "ThumbUpMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.75f, 8.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.941f, 1.337f)
                lineToRelative(-2.156f, 5.48f)
                lineToRelative(-0.27f, 0.683f)
                horizontalLineToRelative(5.985f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(24.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(24.0f, 21.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(0.001f)
                lineTo(24.0f, 24.251f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.093f, 0.0f, -2.08f, -0.185f, -2.791f, -0.739f)
                curveToRelative(-0.673f, -0.524f, -1.19f, -1.456f, -1.208f, -3.169f)
                lineTo(13.251f, 16.25f)
                horizontalLineToRelative(1.22f)
                lineToRelative(0.148f, -0.163f)
                lineToRelative(6.427f, -7.049f)
                curveToRelative(0.183f, -0.179f, 0.431f, -0.288f, 0.704f, -0.288f)
                moveToRelative(-9.5f, 6.502f)
                verticalLineToRelative(-0.002f)
                horizontalLineToRelative(1.78f)
                lineToRelative(6.285f, -6.894f)
                lineToRelative(0.008f, -0.009f)
                lineToRelative(0.008f, -0.008f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.293f, 2.11f)
                lineToRelative(-0.002f, 0.005f)
                lineToRelative(-0.465f, -0.183f)
                lineToRelative(0.465f, 0.183f)
                lineToRelative(-1.888f, 4.796f)
                horizontalLineToRelative(4.516f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.32f, 3.5f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, true, 0.0f, 3.0f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, true, -1.098f, 3.486f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.722f, 3.014f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.17f, 0.0f, -2.431f, -0.19f, -3.405f, -0.949f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -0.594f, -0.585f)
                verticalLineToRelative(1.547f)
                lineTo(7.749f, 28.263f)
                lineTo(7.749f, 15.251f)
                close()
                moveTo(12.25f, 16.252f)
                lineTo(8.749f, 16.252f)
                verticalLineToRelative(11.011f)
                horizontalLineToRelative(3.502f)
                verticalLineToRelative(-3.915f)
                lineToRelative(-0.001f, -0.098f)
                close()
            }
        }
        .build()
        return _thumbUpMedium!!
    }

private var _thumbUpMedium: ImageVector? = null
