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
                moveToRelative(14.62f, 16.087f)
                lineToRelative(6.426f, -7.048f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, true, 1.645f, 1.052f)
                lineToRelative(-2.156f, 5.476f)
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
                verticalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.093f, 0.0f, -2.08f, -0.185f, -2.79f, -0.739f)
                curveToRelative(-0.683f, -0.531f, -1.205f, -1.48f, -1.21f, -3.236f)
                lineTo(13.25f, 16.25f)
                horizontalLineToRelative(1.22f)
                close()
                moveTo(12.25f, 15.252f)
                verticalLineToRelative(-0.002f)
                horizontalLineToRelative(1.78f)
                lineToRelative(6.286f, -6.894f)
                lineToRelative(0.007f, -0.009f)
                lineToRelative(0.008f, -0.008f)
                arcTo(2.002f, 2.002f, 0.0f, false, true, 23.75f, 9.75f)
                curveToRelative(0.0f, 0.241f, -0.041f, 0.477f, -0.126f, 0.698f)
                lineToRelative(-0.002f, 0.006f)
                lineToRelative(-1.888f, 4.796f)
                horizontalLineToRelative(4.516f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.323f, 3.5f)
                curveToRelative(0.415f, 0.367f, 0.677f, 0.903f, 0.677f, 1.5f)
                reflectiveCurveToRelative(-0.262f, 1.134f, -0.677f, 1.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.098f, 3.488f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.725f, 3.012f)
                verticalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.17f, 0.0f, -2.431f, -0.19f, -3.406f, -0.949f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -0.594f, -0.585f)
                verticalLineToRelative(1.547f)
                lineTo(7.749f, 28.263f)
                lineTo(7.749f, 15.252f)
                horizontalLineToRelative(4.501f)
                moveToRelative(0.0f, 1.0f)
                lineTo(8.749f, 16.252f)
                verticalLineToRelative(11.012f)
                horizontalLineToRelative(3.501f)
                lineTo(12.25f, 16.252f)
            }
        }
        .build()
        return _thumbUpMedium!!
    }

private var _thumbUpMedium: ImageVector? = null
