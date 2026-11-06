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

public val SBBIcons.DatabaseSmall: ImageVector
    get() {
        if (_databaseSmall != null) {
            return _databaseSmall!!
        }
        _databaseSmall = Builder(name = "DatabaseSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 6.0f)
                curveToRelative(0.0f, -0.1f, 0.07f, -0.299f, 0.45f, -0.564f)
                curveToRelative(0.365f, -0.256f, 0.926f, -0.506f, 1.668f, -0.725f)
                curveTo(7.594f, 4.276f, 9.668f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(4.407f, 0.276f, 5.882f, 0.711f)
                curveToRelative(0.741f, 0.219f, 1.303f, 0.47f, 1.668f, 0.725f)
                curveToRelative(0.38f, 0.265f, 0.45f, 0.463f, 0.45f, 0.564f)
                reflectiveCurveToRelative(-0.07f, 0.299f, -0.45f, 0.564f)
                curveToRelative(-0.365f, 0.256f, -0.927f, 0.506f, -1.668f, 0.725f)
                curveTo(16.406f, 7.724f, 14.332f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveToRelative(-4.406f, -0.276f, -5.882f, -0.711f)
                curveToRelative(-0.742f, -0.219f, -1.303f, -0.47f, -1.668f, -0.725f)
                curveTo(4.07f, 6.3f, 4.0f, 6.101f, 4.0f, 6.0f)
                moveTo(3.0f, 6.0f)
                curveToRelative(0.0f, -0.59f, 0.4f, -1.05f, 0.876f, -1.383f)
                curveToRelative(0.49f, -0.343f, 1.166f, -0.631f, 1.959f, -0.865f)
                curveTo(7.426f, 3.282f, 9.6f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(4.573f, 0.283f, 6.165f, 0.752f)
                curveToRelative(0.793f, 0.234f, 1.47f, 0.522f, 1.959f, 0.865f)
                curveTo(20.6f, 4.95f, 21.0f, 5.41f, 21.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.657f, -0.424f, 1.154f, -0.951f, 1.51f)
                curveToRelative(-0.532f, 0.357f, -1.258f, 0.635f, -2.079f, 0.85f)
                curveToRelative(-1.649f, 0.431f, -3.82f, 0.641f, -5.97f, 0.641f)
                reflectiveCurveToRelative(-4.321f, -0.21f, -5.97f, -0.641f)
                curveToRelative(-0.821f, -0.215f, -1.547f, -0.493f, -2.079f, -0.85f)
                curveTo(3.424f, 19.153f, 3.0f, 18.656f, 3.0f, 18.0f)
                lineTo(3.0f, 6.0f)
                moveToRelative(1.0f, 9.556f)
                lineTo(4.0f, 18.0f)
                curveToRelative(0.0f, 0.176f, 0.107f, 0.409f, 0.51f, 0.68f)
                curveToRelative(0.397f, 0.267f, 1.0f, 0.51f, 1.773f, 0.712f)
                curveToRelative(1.538f, 0.403f, 3.617f, 0.61f, 5.717f, 0.61f)
                reflectiveCurveToRelative(4.179f, -0.207f, 5.717f, -0.61f)
                curveToRelative(0.773f, -0.202f, 1.376f, -0.445f, 1.774f, -0.713f)
                curveToRelative(0.402f, -0.27f, 0.509f, -0.503f, 0.509f, -0.679f)
                verticalLineToRelative(-2.444f)
                curveToRelative(-0.527f, 0.344f, -1.233f, 0.613f, -2.03f, 0.822f)
                curveToRelative(-1.648f, 0.433f, -3.82f, 0.644f, -5.97f, 0.644f)
                reflectiveCurveToRelative(-4.322f, -0.211f, -5.97f, -0.644f)
                curveToRelative(-0.797f, -0.21f, -1.503f, -0.478f, -2.03f, -0.822f)
                moveToRelative(16.0f, -1.545f)
                curveToRelative(0.0f, 0.179f, -0.108f, 0.412f, -0.51f, 0.684f)
                curveToRelative(-0.398f, 0.268f, -1.0f, 0.512f, -1.773f, 0.715f)
                curveToRelative(-1.538f, 0.404f, -3.617f, 0.612f, -5.717f, 0.612f)
                reflectiveCurveToRelative(-4.178f, -0.208f, -5.717f, -0.612f)
                curveToRelative(-0.773f, -0.203f, -1.375f, -0.447f, -1.773f, -0.715f)
                curveToRelative(-0.402f, -0.272f, -0.51f, -0.505f, -0.51f, -0.684f)
                verticalLineToRelative(-2.465f)
                curveToRelative(0.527f, 0.343f, 1.233f, 0.612f, 2.03f, 0.82f)
                curveToRelative(1.648f, 0.434f, 3.82f, 0.645f, 5.97f, 0.645f)
                reflectiveCurveToRelative(4.322f, -0.211f, 5.97f, -0.644f)
                curveToRelative(0.797f, -0.21f, 1.503f, -0.478f, 2.03f, -0.821f)
                close()
                moveTo(20.0f, 7.466f)
                lineTo(20.0f, 10.0f)
                curveToRelative(0.0f, 0.179f, -0.108f, 0.413f, -0.51f, 0.684f)
                curveToRelative(-0.398f, 0.269f, -1.0f, 0.513f, -1.773f, 0.716f)
                curveToRelative(-1.538f, 0.404f, -3.617f, 0.611f, -5.717f, 0.611f)
                reflectiveCurveToRelative(-4.178f, -0.207f, -5.717f, -0.611f)
                curveToRelative(-0.773f, -0.203f, -1.375f, -0.447f, -1.773f, -0.716f)
                curveTo(4.108f, 10.413f, 4.0f, 10.18f, 4.0f, 10.0f)
                lineTo(4.0f, 7.466f)
                curveToRelative(0.477f, 0.307f, 1.107f, 0.567f, 1.835f, 0.782f)
                curveTo(7.426f, 8.718f, 9.6f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveToRelative(4.573f, -0.283f, 6.165f, -0.752f)
                curveToRelative(0.728f, -0.215f, 1.358f, -0.475f, 1.835f, -0.782f)
            }
        }
        .build()
        return _databaseSmall!!
    }

private var _databaseSmall: ImageVector? = null
