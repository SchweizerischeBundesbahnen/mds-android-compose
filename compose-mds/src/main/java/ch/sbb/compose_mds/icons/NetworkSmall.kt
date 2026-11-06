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

public val SBBIcons.NetworkSmall: ImageVector
    get() {
        if (_networkSmall != null) {
            return _networkSmall!!
        }
        _networkSmall = Builder(name = "NetworkSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 4.0f)
                curveToRelative(0.0f, -0.574f, 0.426f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.426f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.426f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.426f, -1.0f, -1.0f)
                moveToRelative(1.0f, -2.0f)
                curveToRelative(-1.126f, 0.0f, -2.0f, 0.874f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.874f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.303f, 0.0f, 0.589f, -0.063f, 0.843f, -0.178f)
                lineTo(9.23f, 9.1f)
                arcTo(3.98f, 3.98f, 0.0f, false, false, 8.0f, 12.0f)
                curveToRelative(0.0f, 0.94f, 0.315f, 1.8f, 0.847f, 2.478f)
                lineToRelative(-1.97f, 1.92f)
                arcTo(2.53f, 2.53f, 0.0f, false, false, 5.5f, 16.0f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 3.0f, 18.498f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 5.5f, 21.0f)
                arcToRelative(2.475f, 2.475f, 0.0f, false, false, 2.506f, -2.502f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.415f, -1.398f)
                lineToRelative(1.967f, -1.919f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 16.0f)
                curveToRelative(1.442f, 0.0f, 2.692f, -0.74f, 3.395f, -1.866f)
                lineToRelative(1.671f, 0.774f)
                arcTo(2.6f, 2.6f, 0.0f, false, false, 17.0f, 15.5f)
                curveToRelative(0.0f, 1.412f, 1.088f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.088f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.088f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.842f, 0.0f, -1.569f, 0.387f, -2.018f, 0.998f)
                lineToRelative(-1.668f, -0.772f)
                curveToRelative(0.121f, -0.385f, 0.187f, -0.797f, 0.187f, -1.226f)
                curveToRelative(0.0f, -0.712f, -0.18f, -1.376f, -0.499f, -1.951f)
                lineToRelative(2.19f, -1.525f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 9.0f)
                curveToRelative(1.116f, 0.0f, 2.01f, -0.876f, 2.01f, -2.0f)
                arcTo(1.993f, 1.993f, 0.0f, false, false, 19.0f, 4.995f)
                curveToRelative(-1.123f, 0.0f, -2.0f, 0.887f, -2.0f, 2.005f)
                quadToRelative(0.002f, 0.373f, 0.122f, 0.702f)
                lineToRelative(-2.211f, 1.54f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 8.004f)
                curveToRelative(-0.717f, 0.0f, -1.386f, 0.182f, -1.964f, 0.504f)
                lineTo(7.62f, 5.19f)
                curveTo(7.86f, 4.86f, 8.0f, 4.45f, 8.0f, 4.0f)
                curveToRelative(0.0f, -1.126f, -0.874f, -2.0f, -2.0f, -2.0f)
                moveToRelative(13.0f, 3.995f)
                curveToRelative(-0.566f, 0.0f, -1.0f, 0.435f, -1.0f, 1.005f)
                curveToRelative(0.0f, 0.568f, 0.432f, 1.0f, 1.0f, 1.0f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, 1.01f, -1.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, false, 19.0f, 5.995f)
                moveToRelative(-7.0f, 3.009f)
                arcTo(2.97f, 2.97f, 0.0f, false, false, 9.0f, 12.0f)
                curveToRelative(0.0f, 1.678f, 1.322f, 3.0f, 3.0f, 3.0f)
                arcToRelative(2.974f, 2.974f, 0.0f, false, false, 3.001f, -3.0f)
                arcTo(2.97f, 2.97f, 0.0f, false, false, 12.0f, 9.004f)
                moveToRelative(6.0f, 6.496f)
                curveToRelative(0.0f, -0.86f, 0.64f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.64f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.64f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.64f, -1.5f, -1.5f)
                moveTo(5.5f, 17.0f)
                curveToRelative(-0.854f, 0.0f, -1.5f, 0.646f, -1.5f, 1.498f)
                arcTo(1.47f, 1.47f, 0.0f, false, false, 5.5f, 20.0f)
                curveToRelative(0.855f, 0.0f, 1.506f, -0.65f, 1.506f, -1.502f)
                curveToRelative(0.0f, -0.85f, -0.65f, -1.498f, -1.506f, -1.498f)
            }
        }
        .build()
        return _networkSmall!!
    }

private var _networkSmall: ImageVector? = null
