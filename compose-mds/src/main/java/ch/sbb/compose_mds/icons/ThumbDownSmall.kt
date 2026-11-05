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

public val SBBIcons.ThumbDownSmall: ImageVector
    get() {
        if (_thumbDownSmall != null) {
            return _thumbDownSmall!!
        }
        _thumbDownSmall = Builder(
            name = "ThumbDownSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(4.999f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineToRelative(0.782f)
                quadToRelative(0.062f, -0.054f, 0.127f, -0.105f)
                curveToRelative(0.694f, -0.54f, 1.58f, -0.668f, 2.373f, -0.668f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.395f, 2.052f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.723f, 2.447f)
                curveToRelative(0.238f, 0.266f, 0.382f, 0.616f, 0.382f, 1.0f)
                curveToRelative(0.0f, 0.385f, -0.144f, 0.735f, -0.382f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.118f, 2.5f)
                horizontalLineToRelative(-2.766f)
                lineToRelative(1.17f, 2.97f)
                lineToRelative(0.002f, 0.006f)
                quadToRelative(0.094f, 0.254f, 0.094f, 0.524f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.565f, 1.057f)
                lineToRelative(-0.007f, -0.008f)
                lineToRelative(-0.007f, -0.008f)
                lineToRelative(-4.142f, -4.54f)
                lineTo(8.0f, 14.009f)
                verticalLineToRelative(-0.001f)
                lineTo(4.999f, 14.008f)
                lineTo(4.999f, 5.0f)
                moveTo(8.0f, 8.49f)
                verticalLineToRelative(4.518f)
                lineTo(5.999f, 13.008f)
                lineTo(5.999f, 6.0f)
                lineTo(8.0f, 6.0f)
                close()
                moveTo(9.0f, 13.008f)
                horizontalLineToRelative(0.72f)
                lineToRelative(0.15f, 0.164f)
                lineToRelative(4.28f, 4.694f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, false, 0.85f, -0.357f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.029f, -0.17f)
                lineToRelative(-1.436f, -3.647f)
                lineToRelative(-0.27f, -0.684f)
                lineTo(17.5f, 13.008f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                lineTo(16.0f, 12.008f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                lineTo(16.0f, 10.008f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                lineTo(16.0f, 8.008f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.716f, 0.0f, -1.328f, 0.123f, -1.758f, 0.457f)
                curveToRelative(-0.403f, 0.314f, -0.739f, 0.89f, -0.742f, 2.027f)
                close()
            }
        }
            .build()
        return _thumbDownSmall!!
    }

private var _thumbDownSmall: ImageVector? = null
