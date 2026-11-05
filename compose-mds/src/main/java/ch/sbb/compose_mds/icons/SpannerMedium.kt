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

public val SBBIcons.SpannerMedium: ImageVector
    get() {
        if (_spannerMedium != null) {
            return _spannerMedium!!
        }
        _spannerMedium = Builder(
            name = "SpannerMedium",
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
                moveTo(19.749f, 9.75f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.5f, -6.5f)
                curveToRelative(0.956f, 0.0f, 1.855f, 0.218f, 2.667f, 0.583f)
                lineToRelative(0.66f, 0.298f)
                lineToRelative(-0.512f, 0.512f)
                lineToRelative(-3.815f, 3.815f)
                verticalLineToRelative(2.293f)
                horizontalLineToRelative(2.293f)
                lineToRelative(3.815f, -3.815f)
                lineToRelative(0.511f, -0.512f)
                lineToRelative(0.298f, 0.66f)
                curveToRelative(0.368f, 0.812f, 0.583f, 1.711f, 0.583f, 2.667f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -6.5f, 6.5f)
                curveToRelative(-0.832f, 0.0f, -1.62f, -0.166f, -2.344f, -0.45f)
                lineToRelative(-8.103f, 8.104f)
                curveToRelative(0.284f, 0.726f, 0.447f, 1.515f, 0.447f, 2.346f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -6.5f, 6.5f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, true, -2.666f, -0.585f)
                lineToRelative(-0.659f, -0.298f)
                lineToRelative(0.511f, -0.511f)
                lineToRelative(3.814f, -3.813f)
                verticalLineTo(25.25f)
                horizontalLineTo(8.456f)
                lineToRelative(-3.813f, 3.813f)
                lineToRelative(-0.512f, 0.511f)
                lineToRelative(-0.298f, -0.658f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, true, -0.584f, -2.666f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.5f, -6.5f)
                curveToRelative(0.83f, 0.0f, 1.62f, 0.162f, 2.346f, 0.447f)
                lineToRelative(8.103f, -8.103f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -0.449f, -2.344f)
                moveToRelative(6.5f, -5.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.5f, 5.5f)
                curveToRelative(0.0f, 0.803f, 0.182f, 1.56f, 0.496f, 2.255f)
                lineToRelative(0.142f, 0.315f)
                lineToRelative(-0.244f, 0.244f)
                lineToRelative(-8.579f, 8.579f)
                lineToRelative(-0.244f, 0.244f)
                lineToRelative(-0.316f, -0.142f)
                arcToRelative(5.45f, 5.45f, 0.0f, false, false, -2.255f, -0.494f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.5f, 5.5f)
                curveToRelative(0.0f, 0.541f, 0.083f, 1.063f, 0.234f, 1.559f)
                lineToRelative(3.412f, -3.413f)
                lineToRelative(0.147f, -0.146f)
                horizontalLineToRelative(3.707f)
                verticalLineToRelative(3.707f)
                lineToRelative(-0.146f, 0.146f)
                lineToRelative(-3.413f, 3.413f)
                curveToRelative(0.495f, 0.15f, 1.017f, 0.234f, 1.559f, 0.234f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.5f, -5.5f)
                curveToRelative(0.0f, -0.803f, -0.18f, -1.563f, -0.494f, -2.256f)
                lineToRelative(-0.143f, -0.315f)
                lineToRelative(0.245f, -0.244f)
                lineToRelative(8.579f, -8.579f)
                lineToRelative(0.244f, -0.244f)
                lineToRelative(0.314f, 0.142f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 2.255f, 0.496f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.5f, -5.5f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -0.232f, -1.56f)
                lineToRelative(-3.414f, 3.413f)
                lineToRelative(-0.147f, 0.147f)
                horizontalLineTo(24.25f)
                verticalLineTo(8.043f)
                lineToRelative(0.146f, -0.146f)
                lineToRelative(3.414f, -3.413f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -1.56f, -0.233f)
            }
        }
            .build()
        return _spannerMedium!!
    }

private var _spannerMedium: ImageVector? = null
