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

public val SBBIcons.HandUserSmall: ImageVector
    get() {
        if (_handUserSmall != null) {
            return _handUserSmall!!
        }
        _handUserSmall = Builder(name = "HandUserSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.33f, 13.562f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.081f, -0.252f)
                horizontalLineToRelative(0.001f)
                lineToRelative(3.59f, 2.508f)
                curveToRelative(0.038f, -0.424f, 0.203f, -0.847f, 0.503f, -1.182f)
                curveToRelative(0.35f, -0.391f, 0.862f, -0.636f, 1.495f, -0.636f)
                horizontalLineToRelative(2.237f)
                verticalLineToRelative(0.006f)
                curveToRelative(1.606f, 0.071f, 3.12f, 0.954f, 4.28f, 2.068f)
                lineToRelative(5.328f, 5.064f)
                lineToRelative(0.907f, 0.862f)
                horizontalLineToRelative(-9.208f)
                lineToRelative(-0.146f, -0.145f)
                lineToRelative(-0.862f, -0.855f)
                horizontalLineTo(8.611f)
                lineToRelative(-0.141f, -0.125f)
                lineToRelative(-5.926f, -5.22f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.214f, -2.093f)
                moveToRelative(1.496f, 0.558f)
                lineToRelative(-0.013f, -0.01f)
                lineToRelative(-0.084f, -0.055f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.614f, 0.764f)
                lineToRelative(0.073f, 0.07f)
                lineToRelative(0.008f, 0.009f)
                lineToRelative(0.01f, 0.006f)
                lineTo(8.988f, 20.0f)
                horizontalLineToRelative(3.96f)
                lineToRelative(0.146f, 0.145f)
                lineToRelative(0.861f, 0.855f)
                horizontalLineToRelative(6.292f)
                lineToRelative(-4.42f, -4.201f)
                lineToRelative(-0.003f, -0.002f)
                curveToRelative(-1.017f, -0.98f, -2.253f, -1.68f, -3.48f, -1.784f)
                lineTo(12.1f, 15.0f)
                horizontalLineTo(10.0f)
                curveToRelative(-0.36f, 0.0f, -0.597f, 0.13f, -0.75f, 0.302f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, -0.256f, 0.702f)
                curveToRelative(-0.002f, 0.268f, 0.086f, 0.518f, 0.243f, 0.695f)
                curveToRelative(0.15f, 0.168f, 0.388f, 0.301f, 0.763f, 0.301f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.612f, 0.0f, -1.11f, -0.222f, -1.459f, -0.586f)
                lineTo(3.84f, 14.13f)
                close()
                moveTo(14.5f, 6.0f)
                curveToRelative(0.0f, -1.732f, -1.189f, -3.0f, -2.5f, -3.0f)
                reflectiveCurveTo(9.5f, 4.268f, 9.5f, 6.0f)
                reflectiveCurveToRelative(1.189f, 3.0f, 2.5f, 3.0f)
                reflectiveCurveToRelative(2.5f, -1.268f, 2.5f, -3.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.927f, -0.283f, 1.804f, -0.768f, 2.499f)
                curveTo(17.504f, 9.821f, 19.0f, 12.819f, 19.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.011f, -1.46f, -5.682f, -3.985f, -6.727f)
                arcTo(3.18f, 3.18f, 0.0f, false, true, 12.0f, 10.0f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, true, -2.016f, -0.727f)
                curveToRelative(-1.688f, 0.704f, -2.893f, 2.126f, -3.512f, 3.89f)
                lineToRelative(-0.944f, -0.333f)
                curveToRelative(0.66f, -1.875f, 1.93f, -3.461f, 3.74f, -4.33f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 8.5f, 6.0f)
                curveToRelative(0.0f, -2.134f, 1.498f, -4.0f, 3.5f, -4.0f)
                reflectiveCurveToRelative(3.5f, 1.866f, 3.5f, 4.0f)
            }
        }
        .build()
        return _handUserSmall!!
    }

private var _handUserSmall: ImageVector? = null
