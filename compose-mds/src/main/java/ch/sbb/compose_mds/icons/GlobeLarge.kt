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

public val SBBIcons.GlobeLarge: ImageVector
    get() {
        if (_globeLarge != null) {
            return _globeLarge!!
        }
        _globeLarge = Builder(
            name = "GlobeLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(23.5f, 7.0f)
                curveToRelative(1.121f, 0.0f, 2.216f, 0.112f, 3.274f, 0.325f)
                lineToRelative(0.148f, -0.094f)
                lineToRelative(0.089f, 0.144f)
                curveTo(34.437f, 8.985f, 40.0f, 15.593f, 40.0f, 23.5f)
                reflectiveCurveToRelative(-5.564f, 14.514f, -12.99f, 16.124f)
                lineToRelative(-0.088f, 0.145f)
                lineToRelative(-0.148f, -0.095f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, true, -6.55f, 0.0f)
                lineToRelative(-0.146f, 0.095f)
                lineToRelative(-0.09f, -0.145f)
                curveTo(12.563f, 38.014f, 7.0f, 31.407f, 7.0f, 23.5f)
                reflectiveCurveTo(12.563f, 8.985f, 19.988f, 7.375f)
                lineToRelative(0.09f, -0.144f)
                lineToRelative(0.147f, 0.094f)
                arcTo(16.6f, 16.6f, 0.0f, false, true, 23.5f, 7.0f)
                moveToRelative(-5.517f, 25.0f)
                curveToRelative(0.628f, 2.578f, 1.531f, 4.864f, 2.633f, 6.73f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, 5.767f, 0.0f)
                curveToRelative(1.102f, -1.867f, 2.007f, -4.152f, 2.635f, -6.73f)
                close()
                moveTo(10.538f, 32.0f)
                arcToRelative(15.53f, 15.53f, 0.0f, false, false, 8.76f, 6.423f)
                curveToRelative(-0.98f, -1.852f, -1.779f, -4.025f, -2.344f, -6.423f)
                close()
                moveTo(30.046f, 32.0f)
                curveToRelative(-0.565f, 2.398f, -1.364f, 4.57f, -2.346f, 6.423f)
                arcTo(15.53f, 15.53f, 0.0f, false, false, 36.462f, 32.0f)
                close()
                moveTo(8.009f, 24.0f)
                curveToRelative(0.08f, 2.534f, 0.769f, 4.914f, 1.925f, 7.0f)
                horizontalLineToRelative(6.8f)
                arcToRelative(37.6f, 37.6f, 0.0f, false, true, -0.73f, -7.0f)
                close()
                moveTo(17.004f, 24.0f)
                curveToRelative(0.031f, 2.47f, 0.297f, 4.828f, 0.753f, 7.0f)
                horizontalLineToRelative(11.487f)
                curveToRelative(0.456f, -2.172f, 0.72f, -4.53f, 0.752f, -7.0f)
                close()
                moveTo(30.996f, 24.0f)
                arcToRelative(37.6f, 37.6f, 0.0f, false, true, -0.73f, 7.0f)
                horizontalLineToRelative(6.8f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 1.925f, -7.0f)
                close()
                moveTo(9.934f, 16.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -1.925f, 7.0f)
                horizontalLineToRelative(7.995f)
                curveToRelative(0.03f, -2.455f, 0.285f, -4.811f, 0.73f, -7.0f)
                close()
                moveTo(17.757f, 16.0f)
                arcToRelative(36.5f, 36.5f, 0.0f, false, false, -0.753f, 7.0f)
                horizontalLineToRelative(12.992f)
                arcToRelative(36.5f, 36.5f, 0.0f, false, false, -0.752f, -7.0f)
                close()
                moveTo(30.267f, 16.0f)
                curveToRelative(0.445f, 2.189f, 0.699f, 4.545f, 0.73f, 7.0f)
                horizontalLineToRelative(7.994f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -1.925f, -7.0f)
                close()
                moveTo(19.299f, 8.576f)
                arcTo(15.53f, 15.53f, 0.0f, false, false, 10.539f, 15.0f)
                horizontalLineToRelative(6.415f)
                curveToRelative(0.565f, -2.398f, 1.364f, -4.571f, 2.345f, -6.424f)
                moveTo(23.5f, 8.0f)
                curveToRelative(-0.985f, 0.0f, -1.95f, 0.093f, -2.884f, 0.269f)
                curveToRelative(-1.102f, 1.866f, -2.005f, 4.153f, -2.633f, 6.731f)
                horizontalLineToRelative(11.035f)
                curveToRelative(-0.628f, -2.579f, -1.532f, -4.866f, -2.635f, -6.731f)
                arcTo(15.6f, 15.6f, 0.0f, false, false, 23.5f, 8.0f)
                moveToRelative(4.201f, 0.576f)
                curveToRelative(0.982f, 1.852f, 1.78f, 4.026f, 2.345f, 6.424f)
                horizontalLineToRelative(6.416f)
                arcToRelative(15.53f, 15.53f, 0.0f, false, false, -8.76f, -6.424f)
            }
        }
            .build()
        return _globeLarge!!
    }

private var _globeLarge: ImageVector? = null
