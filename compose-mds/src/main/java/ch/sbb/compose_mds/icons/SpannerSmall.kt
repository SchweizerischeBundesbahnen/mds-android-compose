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

public val SBBIcons.SpannerSmall: ImageVector
    get() {
        if (_spannerSmall != null) {
            return _spannerSmall!!
        }
        _spannerSmall = Builder(
            name = "SpannerSmall",
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
                moveTo(13.0f, 6.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 17.5f, 2.0f)
                curveToRelative(0.663f, 0.0f, 1.285f, 0.151f, 1.846f, 0.403f)
                lineToRelative(0.66f, 0.298f)
                lineToRelative(-0.511f, 0.512f)
                lineTo(17.0f, 5.708f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.293f)
                lineToRelative(2.494f, -2.494f)
                lineToRelative(0.512f, -0.511f)
                lineToRelative(0.298f, 0.658f)
                curveTo(21.85f, 5.215f, 22.0f, 5.838f, 22.0f, 6.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, 4.5f)
                curveToRelative(-0.538f, 0.0f, -1.048f, -0.1f, -1.52f, -0.272f)
                lineToRelative(-5.25f, 5.25f)
                curveToRelative(0.172f, 0.474f, 0.27f, 0.985f, 0.27f, 1.522f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 6.5f, 22.0f)
                curveToRelative(-0.663f, 0.0f, -1.285f, -0.15f, -1.846f, -0.404f)
                lineToRelative(-0.659f, -0.298f)
                lineToRelative(0.511f, -0.511f)
                lineTo(7.0f, 18.293f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.707f)
                lineToRelative(-2.493f, 2.494f)
                lineToRelative(-0.512f, 0.511f)
                lineToRelative(-0.298f, -0.659f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 2.0f, 17.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 6.5f, 13.0f)
                curveToRelative(0.537f, 0.0f, 1.048f, 0.099f, 1.522f, 0.271f)
                lineToRelative(5.25f, -5.25f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 13.0f, 6.502f)
                moveTo(17.5f, 3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.0f, 6.5f)
                curveToRelative(0.0f, 0.51f, 0.115f, 0.991f, 0.316f, 1.434f)
                lineToRelative(0.142f, 0.315f)
                lineToRelative(-0.244f, 0.245f)
                lineToRelative(-5.72f, 5.719f)
                lineToRelative(-0.244f, 0.245f)
                lineToRelative(-0.315f, -0.143f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.0f, 17.5f)
                quadToRelative(0.001f, 0.37f, 0.077f, 0.716f)
                lineToRelative(2.07f, -2.07f)
                lineToRelative(0.146f, -0.146f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.707f)
                lineToRelative(-0.146f, 0.147f)
                lineToRelative(-2.07f, 2.07f)
                quadTo(6.131f, 21.0f, 6.5f, 21.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.51f, -0.115f, -0.992f, -0.315f, -1.435f)
                lineToRelative(-0.142f, -0.315f)
                lineToRelative(0.244f, -0.244f)
                lineToRelative(5.72f, -5.72f)
                lineToRelative(0.244f, -0.243f)
                lineToRelative(0.314f, 0.141f)
                curveToRelative(0.444f, 0.2f, 0.926f, 0.316f, 1.435f, 0.316f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.424f, -4.216f)
                lineToRelative(-2.07f, 2.07f)
                lineToRelative(-0.147f, 0.146f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.293f)
                lineToRelative(0.146f, -0.146f)
                lineToRelative(2.07f, -2.07f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 17.5f, 3.0f)
            }
        }
            .build()
        return _spannerSmall!!
    }

private var _spannerSmall: ImageVector? = null
