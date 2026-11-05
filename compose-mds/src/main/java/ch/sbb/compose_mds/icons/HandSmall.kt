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

public val SBBIcons.HandSmall: ImageVector
    get() {
        if (_handSmall != null) {
            return _handSmall!!
        }
        _handSmall = Builder(
            name = "HandSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 13.0f)
                lineTo(12.0f, 4.5f)
                curveToRelative(0.0f, -0.274f, 0.226f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.226f, 0.5f, 0.5f)
                lineTo(13.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                lineTo(14.0f, 5.5f)
                curveToRelative(0.0f, -0.274f, 0.226f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.226f, 0.5f, 0.5f)
                lineTo(15.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 8.483f)
                arcTo(0.503f, 0.503f, 0.0f, false, true, 16.5f, 8.0f)
                curveToRelative(0.274f, 0.0f, 0.5f, 0.226f, 0.5f, 0.5f)
                lineTo(17.0f, 16.0f)
                curveToRelative(0.0f, 1.412f, -0.24f, 2.485f, -0.475f, 3.196f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.318f, 0.795f)
                lineToRelative(-0.005f, 0.009f)
                lineTo(9.785f, 20.0f)
                lineToRelative(-0.002f, -0.003f)
                lineToRelative(-0.389f, -0.658f)
                lineToRelative(-1.203f, -2.036f)
                arcToRelative(840.0f, 840.0f, 0.0f, false, true, -1.968f, -3.342f)
                curveToRelative(-0.136f, -0.238f, -0.191f, -0.414f, -0.196f, -0.538f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.116f, -0.28f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.713f, 0.0f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(0.854f, 0.854f)
                lineTo(10.0f, 5.5f)
                curveToRelative(0.0f, -0.274f, 0.226f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.226f, 0.5f, 0.5f)
                lineTo(11.0f, 13.0f)
                close()
                moveTo(16.0f, 7.086f)
                arcTo(1.503f, 1.503f, 0.0f, false, true, 18.0f, 8.5f)
                lineTo(18.0f, 16.0f)
                curveToRelative(0.0f, 1.528f, -0.26f, 2.705f, -0.526f, 3.51f)
                curveToRelative(-0.132f, 0.4f, -0.266f, 0.708f, -0.369f, 0.92f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.166f, 0.31f)
                lineToRelative(-0.012f, 0.02f)
                lineToRelative(-0.004f, 0.006f)
                lineToRelative(-0.001f, 0.002f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(-0.001f)
                lineTo(16.5f, 20.5f)
                lineToRelative(0.42f, 0.27f)
                lineToRelative(-0.147f, 0.23f)
                lineTo(9.214f, 21.0f)
                lineToRelative(-0.145f, -0.245f)
                lineToRelative(0.43f, -0.255f)
                lineToRelative(-0.43f, 0.254f)
                lineToRelative(-0.002f, -0.004f)
                lineToRelative(-0.007f, -0.012f)
                lineToRelative(-0.029f, -0.048f)
                lineToRelative(-0.108f, -0.184f)
                lineToRelative(-0.39f, -0.659f)
                lineToRelative(-1.203f, -2.035f)
                arcToRelative(820.0f, 820.0f, 0.0f, false, true, -1.974f, -3.353f)
                curveToRelative(-0.173f, -0.302f, -0.314f, -0.641f, -0.328f, -0.994f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, true, 0.408f, -1.029f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, 2.127f, 0.0f)
                lineTo(9.0f, 13.873f)
                lineTo(9.0f, 5.5f)
                arcToRelative(1.503f, 1.503f, 0.0f, false, true, 2.053f, -1.394f)
                arcTo(1.504f, 1.504f, 0.0f, false, true, 12.5f, 3.0f)
                curveToRelative(0.69f, 0.0f, 1.273f, 0.47f, 1.447f, 1.106f)
                arcTo(1.503f, 1.503f, 0.0f, false, true, 16.0f, 5.5f)
                close()
            }
        }
            .build()
        return _handSmall!!
    }

private var _handSmall: ImageVector? = null
