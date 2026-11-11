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
        _spannerLarge = Builder(name = "SpannerLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(37.198f, 7.541f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, -2.698f, -0.54f)
                horizontalLineToRelative(-0.007f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 28.0f, 13.49f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 0.412f, 2.394f)
                lineToRelative(-13.406f, 13.57f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -8.337f, 8.812f)
                lineToRelative(0.312f, 0.655f)
                lineToRelative(0.501f, -0.525f)
                lineTo(10.715f, 35.0f)
                lineTo(13.0f, 35.0f)
                verticalLineToRelative(2.288f)
                lineTo(9.653f, 40.51f)
                lineToRelative(-0.52f, 0.5f)
                lineToRelative(0.651f, 0.31f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 9.208f, -4.765f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -0.397f, -3.574f)
                lineToRelative(13.514f, -13.515f)
                curveToRelative(0.786f, 0.328f, 1.63f, 0.497f, 2.483f, 0.494f)
                horizontalLineToRelative(0.003f)
                arcToRelative(6.502f, 6.502f, 0.0f, false, false, 6.015f, -8.792f)
                lineToRelative(-0.154f, -0.373f)
                lineToRelative(-0.277f, -0.616f)
                lineToRelative(-4.367f, 3.822f)
                lineTo(34.0f, 14.001f)
                verticalLineToRelative(-1.814f)
                lineToRelative(3.376f, -3.857f)
                lineToRelative(0.452f, -0.517f)
                close()
                moveTo(34.507f, 8.0f)
                lineTo(34.5f, 7.5f)
                verticalLineToRelative(-0.005f)
                close()
                moveTo(33.124f, 11.671f)
                lineTo(36.14f, 8.223f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 34.507f, 8.0f)
                lineTo(34.5f, 8.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(0.011f)
                lineToRelative(0.001f, 0.295f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 0.456f, 1.991f)
                lineToRelative(0.139f, 0.312f)
                lineToRelative(-0.24f, 0.242f)
                lineToRelative(-13.88f, 14.05f)
                lineToRelative(-0.25f, 0.254f)
                lineToRelative(-0.322f, -0.154f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -7.608f, 6.638f)
                lineToRelative(2.842f, -2.984f)
                lineToRelative(0.147f, -0.154f)
                lineTo(14.0f, 34.001f)
                verticalLineToRelative(3.711f)
                lineToRelative(-0.153f, 0.148f)
                lineToRelative(-2.942f, 2.83f)
                arcToRelative(5.498f, 5.498f, 0.0f, false, false, 6.644f, -7.605f)
                lineToRelative(-0.152f, -0.319f)
                lineToRelative(14.5f, -14.5f)
                lineToRelative(0.32f, 0.154f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, 2.369f, 0.54f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.427f, -5.097f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.227f, -2.012f)
                lineToRelative(-3.457f, 3.025f)
                lineTo(36.0f, 14.5f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.33f, 0.375f)
                lineToRelative(-0.142f, 0.125f)
                lineTo(33.0f, 15.002f)
                verticalLineToRelative(-3.189f)
                close()
                moveTo(33.124f, 11.671f)
                lineTo(33.501f, 12.001f)
                lineTo(33.5f, 12.001f)
                close()
                moveTo(21.024f, 27.685f)
                lineTo(26.684f, 22.025f)
                lineTo(25.977f, 21.318f)
                lineTo(20.317f, 26.978f)
                close()
            }
        }
        .build()
        return _spannerLarge!!
    }

private var _spannerLarge: ImageVector? = null
