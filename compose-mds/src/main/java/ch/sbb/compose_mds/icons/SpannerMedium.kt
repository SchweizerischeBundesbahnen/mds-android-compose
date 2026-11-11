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

public val SBBIcons.SpannerMedium: ImageVector
    get() {
        if (_spannerMedium != null) {
            return _spannerMedium!!
        }
        _spannerMedium = Builder(name = "SpannerMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.749f, 24.25f)
                verticalLineToRelative(3.708f)
                lineToRelative(-0.147f, 0.146f)
                lineToRelative(-3.412f, 3.411f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 1.559f, 0.236f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.5f, -5.5f)
                curveToRelative(0.0f, -0.803f, -0.18f, -1.563f, -0.494f, -2.256f)
                lineToRelative(-0.143f, -0.315f)
                lineToRelative(9.068f, -9.067f)
                lineToRelative(0.314f, 0.142f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 2.255f, 0.496f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.5f, -5.5f)
                curveToRelative(0.0f, -0.543f, -0.084f, -1.064f, -0.234f, -1.56f)
                lineToRelative(-3.413f, 3.413f)
                lineToRelative(-0.146f, 0.147f)
                lineTo(24.25f, 11.751f)
                lineTo(24.25f, 8.044f)
                lineToRelative(0.146f, -0.147f)
                lineToRelative(3.413f, -3.413f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -1.559f, -0.233f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.5f, 5.5f)
                curveToRelative(0.0f, 0.802f, 0.181f, 1.56f, 0.495f, 2.254f)
                lineToRelative(-0.456f, 0.205f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.455f, -0.206f)
                lineToRelative(0.143f, 0.316f)
                lineToRelative(-9.068f, 9.067f)
                lineToRelative(-0.314f, -0.142f)
                lineToRelative(-0.264f, -0.112f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -1.992f, -0.382f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.5f, 5.5f)
                curveToRelative(0.0f, 0.541f, 0.084f, 1.062f, 0.234f, 1.557f)
                lineToRelative(3.413f, -3.41f)
                lineToRelative(0.146f, -0.147f)
                close()
                moveTo(32.749f, 9.75f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -6.5f, 6.5f)
                curveToRelative(-0.832f, 0.0f, -1.62f, -0.165f, -2.345f, -0.449f)
                lineToRelative(-8.103f, 8.104f)
                curveToRelative(0.284f, 0.726f, 0.448f, 1.515f, 0.448f, 2.346f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -6.5f, 6.5f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, true, -2.666f, -0.584f)
                lineToRelative(-0.66f, -0.298f)
                lineToRelative(4.326f, -4.325f)
                lineTo(10.749f, 25.25f)
                lineTo(8.456f, 25.25f)
                lineToRelative(-4.325f, 4.325f)
                lineToRelative(-0.298f, -0.66f)
                lineToRelative(0.456f, -0.205f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.456f, 0.207f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, true, -0.584f, -2.666f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.5f, -6.5f)
                curveToRelative(0.83f, 0.0f, 1.619f, 0.163f, 2.345f, 0.447f)
                lineToRelative(8.103f, -8.104f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -0.448f, -2.343f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.5f, -6.5f)
                curveToRelative(0.956f, 0.0f, 1.855f, 0.217f, 2.667f, 0.583f)
                lineToRelative(-0.206f, 0.454f)
                lineToRelative(0.206f, -0.454f)
                lineToRelative(0.66f, 0.296f)
                lineToRelative(-4.327f, 4.328f)
                verticalLineToRelative(2.293f)
                horizontalLineToRelative(2.293f)
                lineToRelative(4.326f, -4.327f)
                lineToRelative(0.298f, 0.659f)
                curveToRelative(0.367f, 0.812f, 0.583f, 1.712f, 0.583f, 2.668f)
            }
        }
        .build()
        return _spannerMedium!!
    }

private var _spannerMedium: ImageVector? = null
