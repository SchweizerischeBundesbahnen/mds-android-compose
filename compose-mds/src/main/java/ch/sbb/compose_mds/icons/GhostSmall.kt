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

public val SBBIcons.GhostSmall: ImageVector
    get() {
        if (_ghostSmall != null) {
            return _ghostSmall!!
        }
        _ghostSmall = Builder(name = "GhostSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, 7.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.708f, 0.0f, -1.1f, -0.389f, -1.375f, -0.61f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.434f, -0.272f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 15.0f, 21.0f)
                curveToRelative(-0.6f, 0.0f, -0.88f, 0.184f, -1.236f, 0.418f)
                curveToRelative(-0.404f, 0.266f, -0.886f, 0.582f, -1.785f, 0.582f)
                curveToRelative(-0.435f, 0.0f, -0.779f, -0.073f, -1.075f, -0.192f)
                curveToRelative(-0.288f, -0.117f, -0.514f, -0.271f, -0.695f, -0.394f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -0.509f, -0.294f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 9.0f, 21.0f)
                curveToRelative(-0.317f, 0.0f, -0.532f, 0.052f, -0.691f, 0.118f)
                curveToRelative(-0.162f, 0.067f, -0.291f, 0.158f, -0.434f, 0.273f)
                curveToRelative(-0.276f, 0.22f, -0.667f, 0.609f, -1.375f, 0.609f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.292f, 0.0f, 0.4f, -0.111f, 0.75f, -0.39f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 0.676f, -0.416f)
                curveTo(8.219f, 20.073f, 8.566f, 20.0f, 9.0f, 20.0f)
                reflectiveCurveToRelative(0.778f, 0.073f, 1.074f, 0.192f)
                curveToRelative(0.288f, 0.117f, 0.514f, 0.271f, 0.696f, 0.394f)
                curveToRelative(0.188f, 0.127f, 0.332f, 0.223f, 0.508f, 0.294f)
                curveToRelative(0.17f, 0.068f, 0.385f, 0.12f, 0.7f, 0.12f)
                curveToRelative(0.601f, 0.0f, 0.88f, -0.184f, 1.237f, -0.418f)
                curveTo(13.619f, 20.316f, 14.1f, 20.0f, 15.0f, 20.0f)
                curveToRelative(0.433f, 0.0f, 0.78f, 0.073f, 1.074f, 0.194f)
                curveToRelative(0.291f, 0.12f, 0.507f, 0.28f, 0.676f, 0.415f)
                curveToRelative(0.35f, 0.28f, 0.458f, 0.391f, 0.75f, 0.391f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                moveTo(9.479f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(5.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-5.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
            }
        }
        .build()
        return _ghostSmall!!
    }

private var _ghostSmall: ImageVector? = null
