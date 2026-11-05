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

public val SBBIcons.SpannerLarge: ImageVector
    get() {
        if (_spannerLarge != null) {
            return _spannerLarge!!
        }
        _spannerLarge = Builder(
            name = "SpannerLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                pathFillType = EvenOdd,
            ) {
                moveTo(37.198f, 7.541f)
                arcTo(6.6f, 6.6f, 0.0f, false, false, 34.497f, 7.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 28.0f, 13.494f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 0.412f, 2.39f)
                lineTo(15.007f, 29.453f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -8.338f, 8.813f)
                lineToRelative(0.313f, 0.654f)
                lineToRelative(0.5f, -0.525f)
                lineTo(10.714f, 35.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(2.287f)
                lineTo(9.653f, 40.51f)
                lineToRelative(-0.52f, 0.5f)
                lineToRelative(0.651f, 0.311f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 8.812f, -8.34f)
                lineTo(32.11f, 19.468f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 2.482f, 0.492f)
                horizontalLineToRelative(0.003f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 5.861f, -9.165f)
                lineToRelative(-0.277f, -0.616f)
                lineToRelative(-0.508f, 0.445f)
                lineTo(35.812f, 14.0f)
                horizontalLineTo(34.0f)
                verticalLineToRelative(-1.812f)
                lineToRelative(3.376f, -3.859f)
                lineToRelative(0.452f, -0.516f)
                close()
                moveTo(34.507f, 8.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 1.635f, 0.222f)
                lineToRelative(-3.018f, 3.449f)
                lineToRelative(-0.124f, 0.141f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(3.188f)
                lineToRelative(0.141f, -0.124f)
                lineToRelative(3.458f, -3.025f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -5.2f, 7.109f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -2.37f, -0.54f)
                lineToRelative(-0.32f, -0.155f)
                lineToRelative(-0.25f, 0.252f)
                lineToRelative(-14.0f, 14.0f)
                lineToRelative(-0.25f, 0.25f)
                lineToRelative(0.152f, 0.319f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -6.644f, 7.607f)
                lineToRelative(2.942f, -2.833f)
                lineToRelative(0.153f, -0.147f)
                verticalLineTo(34.0f)
                horizontalLineToRelative(-3.714f)
                lineToRelative(-0.148f, 0.155f)
                lineToRelative(-2.842f, 2.985f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 7.609f, -6.639f)
                lineToRelative(0.32f, 0.153f)
                lineToRelative(0.25f, -0.253f)
                lineToRelative(13.88f, -14.05f)
                lineToRelative(0.24f, -0.242f)
                lineToRelative(-0.138f, -0.312f)
                arcTo(5.3f, 5.3f, 0.0f, false, true, 29.0f, 13.511f)
                verticalLineTo(13.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 34.5f, 8.0f)
                close()
                moveTo(21.024f, 27.684f)
                lineToRelative(5.66f, -5.66f)
                lineToRelative(-0.708f, -0.708f)
                lineToRelative(-5.66f, 5.66f)
                close()
            }
        }
            .build()
        return _spannerLarge!!
    }

private var _spannerLarge: ImageVector? = null
