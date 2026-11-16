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

public val SBBIcons.LocomotiveMedium: ImageVector
    get() {
        if (_locomotiveMedium != null) {
            return _locomotiveMedium!!
        }
        _locomotiveMedium = Builder(name = "LocomotiveMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 5.748f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 4.748f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(10.25f, 7.75f)
                lineTo(10.25f, 26.5f)
                horizontalLineToRelative(3.5f)
                lineTo(13.75f, 7.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(0.001f)
                curveToRelative(2.5f, -0.024f, 4.371f, 0.386f, 5.837f, 1.219f)
                curveToRelative(1.471f, 0.835f, 2.484f, 2.066f, 3.32f, 3.584f)
                lineToRelative(0.009f, 0.02f)
                lineToRelative(-0.448f, 0.221f)
                lineToRelative(-0.009f, 0.005f)
                lineToRelative(0.457f, -0.227f)
                lineToRelative(5.345f, 10.78f)
                lineToRelative(0.009f, 0.02f)
                lineToRelative(0.007f, 0.018f)
                curveToRelative(0.6f, 1.509f, 0.85f, 2.783f, 0.727f, 3.848f)
                curveToRelative(-0.125f, 1.091f, -0.638f, 1.929f, -1.473f, 2.538f)
                curveToRelative(-0.814f, 0.595f, -1.915f, 0.958f, -3.21f, 1.176f)
                curveToRelative(-1.3f, 0.22f, -2.841f, 0.3f, -4.571f, 0.3f)
                lineToRelative(-9.0f, -0.003f)
                horizontalLineToRelative(-0.5f)
                lineTo(13.75f, 27.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.75f)
                lineTo(3.0f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.25f)
                lineTo(9.25f, 8.75f)
                lineTo(3.0f, 8.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.809f, 13.75f)
                lineTo(22.947f, 14.026f)
                lineTo(27.447f, 23.026f)
                lineTo(27.809f, 23.75f)
                lineTo(16.75f, 23.75f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(17.75f, 22.75f)
                horizontalLineToRelative(8.441f)
                lineToRelative(-4.0f, -8.0f)
                lineTo(17.75f, 14.75f)
                close()
                moveTo(23.25f, 30.252f)
                lineTo(14.75f, 30.25f)
                lineTo(14.75f, 8.75f)
                horizontalLineToRelative(2.505f)
                curveToRelative(2.394f, -0.023f, 4.074f, 0.371f, 5.338f, 1.089f)
                curveToRelative(1.257f, 0.714f, 2.154f, 1.777f, 2.933f, 3.19f)
                lineToRelative(5.329f, 10.75f)
                curveToRelative(0.565f, 1.427f, 0.751f, 2.517f, 0.656f, 3.346f)
                curveToRelative(-0.093f, 0.808f, -0.455f, 1.396f, -1.07f, 1.845f)
                curveToRelative(-0.634f, 0.463f, -1.56f, 0.79f, -2.786f, 0.997f)
                curveToRelative(-1.22f, 0.206f, -2.699f, 0.286f, -4.405f, 0.285f)
            }
        }
        .build()
        return _locomotiveMedium!!
    }

private var _locomotiveMedium: ImageVector? = null
