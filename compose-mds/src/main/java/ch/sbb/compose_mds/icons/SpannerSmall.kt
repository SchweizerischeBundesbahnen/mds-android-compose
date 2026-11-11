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

public val SBBIcons.SpannerSmall: ImageVector
    get() {
        if (_spannerSmall != null) {
            return _spannerSmall!!
        }
        _spannerSmall = Builder(name = "SpannerSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.999f, 16.0f)
                verticalLineToRelative(2.707f)
                lineToRelative(-0.146f, 0.147f)
                lineToRelative(-2.07f, 2.068f)
                quadTo(6.13f, 21.0f, 6.5f, 21.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.51f, -0.115f, -0.992f, -0.314f, -1.434f)
                lineToRelative(-0.143f, -0.316f)
                lineToRelative(6.208f, -6.208f)
                lineToRelative(0.314f, 0.142f)
                lineToRelative(0.168f, 0.071f)
                curveToRelative(0.397f, 0.156f, 0.822f, 0.245f, 1.267f, 0.245f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                quadToRelative(-0.001f, -0.369f, -0.077f, -0.716f)
                lineToRelative(-2.07f, 2.07f)
                lineToRelative(-0.146f, 0.146f)
                lineTo(16.0f, 8.0f)
                lineTo(16.0f, 5.293f)
                lineToRelative(0.146f, -0.146f)
                lineToRelative(2.069f, -2.07f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 17.499f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.51f, 0.115f, 0.991f, 0.316f, 1.434f)
                lineToRelative(-0.457f, 0.205f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(0.456f, -0.206f)
                lineToRelative(0.142f, 0.315f)
                lineToRelative(-6.208f, 6.208f)
                lineToRelative(-0.315f, -0.142f)
                lineToRelative(0.206f, -0.455f)
                lineToRelative(-0.001f, -0.001f)
                lineToRelative(-0.205f, 0.456f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.499f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                quadToRelative(0.001f, 0.368f, 0.077f, 0.715f)
                lineToRelative(2.07f, -2.068f)
                lineToRelative(0.146f, -0.147f)
                close()
                moveTo(21.999f, 6.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, 4.5f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -1.52f, -0.273f)
                lineToRelative(-5.252f, 5.252f)
                curveToRelative(0.172f, 0.474f, 0.272f, 0.984f, 0.272f, 1.521f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, 4.5f)
                curveToRelative(-0.663f, 0.0f, -1.285f, -0.15f, -1.846f, -0.404f)
                lineToRelative(-0.659f, -0.298f)
                lineTo(7.0f, 18.293f)
                lineTo(7.0f, 17.0f)
                lineTo(5.706f, 17.0f)
                lineToRelative(-3.005f, 3.005f)
                lineToRelative(-0.298f, -0.659f)
                lineToRelative(0.456f, -0.206f)
                lineToRelative(-0.456f, 0.206f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 2.0f, 17.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, -4.5f)
                curveToRelative(0.537f, 0.0f, 1.047f, 0.1f, 1.52f, 0.272f)
                lineToRelative(5.252f, -5.252f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 13.0f, 6.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, -4.5f)
                curveToRelative(0.663f, 0.0f, 1.286f, 0.151f, 1.847f, 0.404f)
                lineToRelative(0.66f, 0.297f)
                lineToRelative(-3.007f, 3.006f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(1.293f)
                lineToRelative(3.006f, -3.005f)
                lineToRelative(0.298f, 0.659f)
                curveToRelative(0.254f, 0.561f, 0.403f, 1.184f, 0.403f, 1.846f)
            }
        }
        .build()
        return _spannerSmall!!
    }

private var _spannerSmall: ImageVector? = null
