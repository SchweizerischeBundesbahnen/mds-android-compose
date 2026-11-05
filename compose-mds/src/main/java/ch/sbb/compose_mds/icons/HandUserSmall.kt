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

public val SBBIcons.HandUserSmall: ImageVector
    get() {
        if (_handUserSmall != null) {
            return _handUserSmall!!
        }
        _handUserSmall = Builder(
            name = "HandUserSmall",
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
                moveTo(12.0f, 3.0f)
                curveTo(10.69f, 3.0f, 9.5f, 4.268f, 9.5f, 6.0f)
                reflectiveCurveTo(10.69f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveToRelative(2.5f, -1.268f, 2.5f, -3.0f)
                reflectiveCurveToRelative(-1.189f, -3.0f, -2.5f, -3.0f)
                moveTo(8.5f, 6.0f)
                curveToRelative(0.0f, -2.134f, 1.498f, -4.0f, 3.5f, -4.0f)
                curveToRelative(2.003f, 0.0f, 3.5f, 1.866f, 3.5f, 4.0f)
                curveToRelative(0.0f, 0.927f, -0.282f, 1.803f, -0.766f, 2.498f)
                curveTo(17.505f, 9.82f, 19.0f, 12.819f, 19.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.01f, -1.46f, -5.681f, -3.983f, -6.727f)
                arcTo(3.18f, 3.18f, 0.0f, false, true, 12.0f, 10.0f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, true, -2.018f, -0.727f)
                curveToRelative(-1.687f, 0.703f, -2.891f, 2.126f, -3.51f, 3.889f)
                lineToRelative(-0.944f, -0.332f)
                curveToRelative(0.66f, -1.875f, 1.929f, -3.463f, 3.738f, -4.332f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 8.5f, 6.0f)
                moveToRelative(-4.075f, 7.319f)
                lineToRelative(3.578f, 2.5f)
                curveToRelative(0.038f, -0.425f, 0.201f, -0.848f, 0.502f, -1.184f)
                curveToRelative(0.35f, -0.39f, 0.862f, -0.635f, 1.495f, -0.635f)
                horizontalLineToRelative(2.237f)
                verticalLineToRelative(0.004f)
                curveToRelative(1.607f, 0.071f, 3.121f, 0.956f, 4.28f, 2.07f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(5.326f, 5.062f)
                lineToRelative(0.907f, 0.862f)
                horizontalLineToRelative(-9.208f)
                lineToRelative(-0.146f, -0.145f)
                lineToRelative(-0.862f, -0.855f)
                horizontalLineTo(8.611f)
                lineToRelative(-0.141f, -0.125f)
                lineToRelative(-5.919f, -5.213f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.874f, -2.343f)
                moveTo(12.105f, 15.0f)
                horizontalLineTo(10.0f)
                curveToRelative(-0.36f, 0.0f, -0.597f, 0.131f, -0.75f, 0.302f)
                curveToRelative(-0.161f, 0.18f, -0.254f, 0.434f, -0.256f, 0.702f)
                reflectiveCurveToRelative(0.086f, 0.518f, 0.244f, 0.695f)
                curveToRelative(0.149f, 0.168f, 0.387f, 0.301f, 0.762f, 0.301f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.617f, 0.0f, -1.12f, -0.224f, -1.47f, -0.593f)
                lineTo(3.84f, 14.13f)
                lineToRelative(-0.014f, -0.01f)
                lineToRelative(-0.013f, -0.01f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.626f, 0.78f)
                lineToRelative(0.009f, 0.007f)
                lineToRelative(0.009f, 0.008f)
                lineTo(8.989f, 20.0f)
                horizontalLineToRelative(3.959f)
                lineToRelative(0.146f, 0.145f)
                lineToRelative(0.862f, 0.855f)
                horizontalLineToRelative(6.292f)
                lineToRelative(-4.42f, -4.201f)
                lineToRelative(-0.003f, -0.002f)
                curveToRelative(-1.084f, -1.043f, -2.415f, -1.77f, -3.72f, -1.797f)
            }
        }
            .build()
        return _handUserSmall!!
    }

private var _handUserSmall: ImageVector? = null
