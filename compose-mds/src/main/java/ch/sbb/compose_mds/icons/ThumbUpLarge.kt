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

public val SBBIcons.ThumbUpLarge: ImageVector
    get() {
        if (_thumbUpLarge != null) {
            return _thumbUpLarge!!
        }
        _thumbUpLarge = Builder(name = "ThumbUpLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.5f, 10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.344f, 3.371f)
                lineToRelative(-0.003f, 0.006f)
                lineTo(29.234f, 20.0f)
                horizontalLineTo(35.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.495f, 4.5f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, 0.0f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 35.5f, 33.0f)
                horizontalLineToRelative(-0.004f)
                curveToRelative(0.315f, 0.418f, 0.504f, 0.937f, 0.504f, 1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-1.546f, 0.0f, -3.184f, -0.253f, -4.439f, -1.23f)
                arcTo(4.7f, 4.7f, 0.0f, false, true, 18.0f, 34.602f)
                verticalLineToRelative(2.416f)
                horizontalLineToRelative(-7.002f)
                verticalLineTo(20.002f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.28f)
                lineToRelative(8.43f, -9.247f)
                lineToRelative(0.009f, -0.009f)
                lineToRelative(0.008f, -0.008f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 29.5f, 10.0f)
                moveTo(11.998f, 36.018f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.002f)
                horizontalLineToRelative(-5.002f)
                close()
                moveTo(29.5f, 11.0f)
                curveToRelative(-0.415f, 0.0f, -0.792f, 0.169f, -1.066f, 0.443f)
                lineToRelative(-8.565f, 9.394f)
                lineToRelative(-0.148f, 0.163f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 2.397f, 0.71f, 3.728f, 1.677f, 4.48f)
                curveToRelative(0.99f, 0.773f, 2.354f, 1.02f, 3.823f, 1.02f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                verticalLineToRelative(0.001f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                horizontalLineToRelative(-7.734f)
                lineToRelative(0.27f, -0.684f)
                lineToRelative(2.872f, -7.3f)
                lineToRelative(0.04f, -0.12f)
                quadTo(31.0f, 12.712f, 31.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
            }
        }
        .build()
        return _thumbUpLarge!!
    }

private var _thumbUpLarge: ImageVector? = null
