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

public val SBBIcons.DatabaseMedium: ImageVector
    get() {
        if (_databaseMedium != null) {
            return _databaseMedium!!
        }
        _databaseMedium = Builder(name = "DatabaseMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.75f, 9.0f)
                curveToRelative(0.0f, -0.273f, 0.189f, -0.636f, 0.781f, -1.05f)
                curveToRelative(0.579f, -0.406f, 1.45f, -0.791f, 2.575f, -1.123f)
                curveTo(11.348f, 6.166f, 14.486f, 5.75f, 18.0f, 5.75f)
                reflectiveCurveToRelative(6.651f, 0.416f, 8.894f, 1.077f)
                curveToRelative(1.125f, 0.332f, 1.996f, 0.717f, 2.575f, 1.122f)
                curveToRelative(0.592f, 0.415f, 0.781f, 0.778f, 0.781f, 1.051f)
                reflectiveCurveToRelative(-0.189f, 0.636f, -0.781f, 1.05f)
                curveToRelative(-0.579f, 0.406f, -1.45f, 0.791f, -2.575f, 1.123f)
                curveToRelative(-2.242f, 0.661f, -5.38f, 1.077f, -8.894f, 1.077f)
                reflectiveCurveToRelative(-6.651f, -0.416f, -8.894f, -1.077f)
                curveTo(7.98f, 10.84f, 7.11f, 10.456f, 6.53f, 10.05f)
                curveTo(5.94f, 9.636f, 5.75f, 9.273f, 5.75f, 9.0f)
                moveToRelative(-1.0f, 0.0f)
                curveToRelative(0.0f, -0.763f, 0.518f, -1.387f, 1.208f, -1.87f)
                curveToRelative(0.703f, -0.492f, 1.689f, -0.915f, 2.865f, -1.262f)
                curveTo(11.181f, 5.173f, 14.419f, 4.75f, 18.0f, 4.75f)
                reflectiveCurveToRelative(6.819f, 0.423f, 9.177f, 1.118f)
                curveToRelative(1.176f, 0.347f, 2.162f, 0.77f, 2.865f, 1.262f)
                curveToRelative(0.69f, 0.483f, 1.208f, 1.107f, 1.208f, 1.87f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 0.866f, -0.557f, 1.545f, -1.317f, 2.056f)
                curveToRelative(-0.764f, 0.514f, -1.822f, 0.923f, -3.04f, 1.242f)
                curveToRelative(-2.447f, 0.64f, -5.68f, 0.954f, -8.893f, 0.954f)
                reflectiveCurveToRelative(-6.446f, -0.315f, -8.892f, -0.954f)
                curveToRelative(-1.22f, -0.32f, -2.277f, -0.728f, -3.041f, -1.242f)
                curveToRelative(-0.76f, -0.51f, -1.317f, -1.19f, -1.317f, -2.056f)
                lineTo(4.75f, 9.0f)
                moveToRelative(1.0f, 13.845f)
                lineTo(5.75f, 27.0f)
                curveToRelative(0.0f, 0.385f, 0.24f, 0.8f, 0.875f, 1.227f)
                curveToRelative(0.63f, 0.424f, 1.565f, 0.797f, 2.736f, 1.103f)
                curveToRelative(2.335f, 0.611f, 5.477f, 0.922f, 8.639f, 0.922f)
                reflectiveCurveToRelative(6.304f, -0.311f, 8.64f, -0.922f)
                curveToRelative(1.17f, -0.306f, 2.105f, -0.68f, 2.735f, -1.103f)
                curveToRelative(0.635f, -0.427f, 0.875f, -0.842f, 0.875f, -1.227f)
                verticalLineToRelative(-4.155f)
                quadToRelative(-0.15f, 0.122f, -0.316f, 0.233f)
                curveToRelative(-0.764f, 0.516f, -1.822f, 0.926f, -3.041f, 1.247f)
                curveToRelative(-2.447f, 0.642f, -5.68f, 0.958f, -8.893f, 0.958f)
                reflectiveCurveToRelative(-6.446f, -0.316f, -8.893f, -0.959f)
                curveToRelative(-1.219f, -0.32f, -2.277f, -0.73f, -3.041f, -1.246f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.316f, -0.233f)
                moveToRelative(24.5f, -1.829f)
                curveToRelative(0.0f, 0.388f, -0.241f, 0.805f, -0.875f, 1.234f)
                curveToRelative(-0.63f, 0.425f, -1.565f, 0.8f, -2.736f, 1.107f)
                curveToRelative(-2.335f, 0.614f, -5.477f, 0.926f, -8.639f, 0.926f)
                reflectiveCurveToRelative(-6.303f, -0.312f, -8.639f, -0.926f)
                curveToRelative(-1.17f, -0.307f, -2.105f, -0.682f, -2.736f, -1.107f)
                curveToRelative(-0.634f, -0.429f, -0.875f, -0.846f, -0.875f, -1.234f)
                lineTo(5.75f, 16.83f)
                quadToRelative(0.15f, 0.122f, 0.316f, 0.233f)
                curveToRelative(0.764f, 0.516f, 1.822f, 0.926f, 3.041f, 1.246f)
                curveToRelative(2.447f, 0.643f, 5.68f, 0.959f, 8.893f, 0.959f)
                reflectiveCurveToRelative(6.447f, -0.316f, 8.893f, -0.959f)
                curveToRelative(1.219f, -0.32f, 2.277f, -0.73f, 3.041f, -1.246f)
                quadToRelative(0.165f, -0.111f, 0.316f, -0.233f)
                close()
                moveTo(30.25f, 10.716f)
                lineTo(30.25f, 15.0f)
                curveToRelative(0.0f, 0.388f, -0.241f, 0.805f, -0.875f, 1.233f)
                curveToRelative(-0.63f, 0.426f, -1.565f, 0.8f, -2.736f, 1.108f)
                curveToRelative(-2.335f, 0.613f, -5.477f, 0.925f, -8.639f, 0.925f)
                reflectiveCurveToRelative(-6.303f, -0.311f, -8.639f, -0.925f)
                curveToRelative(-1.17f, -0.307f, -2.105f, -0.682f, -2.736f, -1.108f)
                curveToRelative(-0.634f, -0.428f, -0.875f, -0.845f, -0.875f, -1.233f)
                verticalLineToRelative(-4.284f)
                quadToRelative(0.101f, 0.08f, 0.208f, 0.154f)
                curveToRelative(0.703f, 0.492f, 1.689f, 0.915f, 2.865f, 1.262f)
                curveToRelative(2.358f, 0.695f, 5.596f, 1.118f, 9.177f, 1.118f)
                reflectiveCurveToRelative(6.819f, -0.423f, 9.177f, -1.118f)
                curveToRelative(1.176f, -0.347f, 2.162f, -0.77f, 2.865f, -1.262f)
                quadToRelative(0.106f, -0.075f, 0.208f, -0.154f)
            }
        }
        .build()
        return _databaseMedium!!
    }

private var _databaseMedium: ImageVector? = null
