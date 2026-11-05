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
        _thumbDownMedium = Builder(
            name = "ThumbDownMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(7.749f, 7.75f)
                horizontalLineToRelative(5.501f)
                verticalLineToRelative(1.547f)
                quadToRelative(0.267f, -0.33f, 0.594f, -0.585f)
                curveToRelative(0.975f, -0.759f, 2.237f, -0.95f, 3.406f, -0.95f)
                horizontalLineToRelative(7.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.725f, 3.013f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, true, 1.098f, 3.488f)
                curveToRelative(0.415f, 0.366f, 0.677f, 0.902f, 0.677f, 1.5f)
                curveToRelative(0.0f, 0.597f, -0.262f, 1.133f, -0.677f, 1.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.323f, 3.5f)
                horizontalLineToRelative(-4.516f)
                lineToRelative(1.888f, 4.795f)
                lineToRelative(0.003f, 0.007f)
                quadToRelative(0.125f, 0.335f, 0.125f, 0.698f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.42f, 1.408f)
                lineToRelative(-0.007f, -0.007f)
                lineToRelative(-0.007f, -0.008f)
                lineToRelative(-6.287f, -6.893f)
                lineTo(12.25f, 20.763f)
                verticalLineToRelative(-0.001f)
                lineTo(7.749f, 20.762f)
                lineTo(7.749f, 7.75f)
                moveToRelative(4.501f, 4.986f)
                verticalLineToRelative(7.026f)
                lineTo(8.749f, 19.762f)
                lineTo(8.749f, 8.75f)
                horizontalLineToRelative(3.501f)
                close()
                moveTo(13.25f, 19.763f)
                horizontalLineToRelative(1.22f)
                lineToRelative(0.15f, 0.163f)
                lineToRelative(6.426f, 7.047f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.644f, -1.053f)
                lineToRelative(-2.155f, -5.474f)
                lineToRelative(-0.27f, -0.683f)
                horizontalLineToRelative(5.985f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(24.0f, 17.763f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(24.0f, 14.763f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(24.0f, 11.763f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.093f, 0.0f, -2.08f, 0.184f, -2.79f, 0.738f)
                curveToRelative(-0.683f, 0.531f, -1.205f, 1.48f, -1.21f, 3.237f)
                close()
            }
        }
            .build()
        return _thumbDownMedium!!
    }

private var _thumbDownMedium: ImageVector? = null
