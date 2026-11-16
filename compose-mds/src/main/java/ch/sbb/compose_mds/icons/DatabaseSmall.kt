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
                moveTo(19.55f, 5.436f)
                curveToRelative(0.379f, 0.265f, 0.45f, 0.463f, 0.45f, 0.564f)
                reflectiveCurveToRelative(-0.071f, 0.3f, -0.45f, 0.564f)
                curveToRelative(-0.365f, 0.256f, -0.927f, 0.507f, -1.667f, 0.725f)
                curveTo(16.407f, 7.724f, 14.332f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveToRelative(-4.407f, -0.276f, -5.883f, -0.71f)
                curveToRelative(-0.74f, -0.22f, -1.302f, -0.47f, -1.667f, -0.726f)
                curveTo(4.071f, 6.3f, 4.0f, 6.101f, 4.0f, 6.0f)
                reflectiveCurveToRelative(0.071f, -0.3f, 0.45f, -0.564f)
                curveToRelative(0.365f, -0.256f, 0.927f, -0.507f, 1.667f, -0.725f)
                curveTo(7.593f, 4.276f, 9.67f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(4.407f, 0.276f, 5.883f, 0.71f)
                curveToRelative(0.74f, 0.22f, 1.302f, 0.47f, 1.667f, 0.726f)
                moveTo(3.0f, 6.0f)
                curveToRelative(0.0f, -0.59f, 0.4f, -1.05f, 0.876f, -1.383f)
                curveToRelative(0.49f, -0.343f, 1.166f, -0.631f, 1.959f, -0.865f)
                curveTo(7.427f, 3.282f, 9.602f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(4.573f, 0.283f, 6.165f, 0.752f)
                curveToRelative(0.793f, 0.234f, 1.47f, 0.522f, 1.959f, 0.865f)
                curveTo(20.6f, 4.95f, 21.0f, 5.41f, 21.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.657f, -0.424f, 1.154f, -0.951f, 1.509f)
                curveToRelative(-0.532f, 0.357f, -1.258f, 0.636f, -2.078f, 0.85f)
                curveToRelative(-1.65f, 0.432f, -3.82f, 0.642f, -5.971f, 0.642f)
                curveToRelative(-2.15f, 0.0f, -4.322f, -0.21f, -5.97f, -0.642f)
                curveToRelative(-0.821f, -0.214f, -1.547f, -0.493f, -2.079f, -0.85f)
                curveTo(3.424f, 19.154f, 3.0f, 18.657f, 3.0f, 18.0f)
                lineTo(3.0f, 6.0f)
                moveToRelative(1.0f, 9.556f)
                lineTo(4.0f, 18.0f)
                curveToRelative(0.0f, 0.176f, 0.107f, 0.409f, 0.51f, 0.68f)
                curveToRelative(0.398f, 0.267f, 1.0f, 0.51f, 1.773f, 0.713f)
                curveTo(7.822f, 19.795f, 9.901f, 20.0f, 12.0f, 20.0f)
                curveToRelative(2.1f, 0.0f, 4.178f, -0.206f, 5.717f, -0.608f)
                curveToRelative(0.773f, -0.203f, 1.375f, -0.446f, 1.773f, -0.713f)
                curveToRelative(0.403f, -0.271f, 0.51f, -0.504f, 0.51f, -0.68f)
                verticalLineToRelative(-2.444f)
                curveToRelative(-0.527f, 0.344f, -1.234f, 0.613f, -2.03f, 0.822f)
                curveToRelative(-1.648f, 0.433f, -3.82f, 0.643f, -5.97f, 0.643f)
                reflectiveCurveToRelative(-4.321f, -0.21f, -5.97f, -0.643f)
                curveToRelative(-0.796f, -0.209f, -1.503f, -0.478f, -2.03f, -0.822f)
                moveToRelative(16.0f, -1.545f)
                curveToRelative(0.0f, 0.179f, -0.109f, 0.413f, -0.51f, 0.684f)
                curveToRelative(-0.398f, 0.269f, -1.0f, 0.512f, -1.773f, 0.715f)
                curveToRelative(-1.538f, 0.404f, -3.617f, 0.611f, -5.717f, 0.611f)
                reflectiveCurveToRelative(-4.179f, -0.207f, -5.717f, -0.61f)
                curveToRelative(-0.772f, -0.204f, -1.374f, -0.447f, -1.772f, -0.716f)
                curveToRelative(-0.402f, -0.271f, -0.511f, -0.505f, -0.511f, -0.684f)
                verticalLineToRelative(-2.465f)
                curveToRelative(0.527f, 0.343f, 1.234f, 0.612f, 2.03f, 0.821f)
                curveToRelative(1.648f, 0.433f, 3.82f, 0.644f, 5.97f, 0.644f)
                reflectiveCurveToRelative(4.322f, -0.21f, 5.97f, -0.644f)
                curveToRelative(0.796f, -0.209f, 1.503f, -0.478f, 2.03f, -0.821f)
                close()
                moveTo(20.0f, 7.465f)
                lineTo(20.0f, 10.0f)
                curveToRelative(0.0f, 0.179f, -0.109f, 0.413f, -0.51f, 0.685f)
                curveToRelative(-0.398f, 0.268f, -1.0f, 0.512f, -1.773f, 0.714f)
                curveToRelative(-1.538f, 0.404f, -3.617f, 0.612f, -5.717f, 0.612f)
                reflectiveCurveToRelative(-4.179f, -0.208f, -5.717f, -0.612f)
                curveToRelative(-0.772f, -0.202f, -1.374f, -0.446f, -1.772f, -0.714f)
                curveTo(4.109f, 10.413f, 4.0f, 10.179f, 4.0f, 10.0f)
                lineTo(4.0f, 7.466f)
                curveToRelative(0.477f, 0.306f, 1.107f, 0.567f, 1.835f, 0.782f)
                curveTo(7.427f, 8.718f, 9.602f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveToRelative(4.573f, -0.283f, 6.165f, -0.752f)
                curveToRelative(0.728f, -0.215f, 1.358f, -0.476f, 1.835f, -0.782f)
            }
        }
        .build()
        return _databaseSmall!!
    }

private var _databaseSmall: ImageVector? = null
