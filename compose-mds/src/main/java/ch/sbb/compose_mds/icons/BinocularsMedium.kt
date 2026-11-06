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

public val SBBIcons.BinocularsMedium: ImageVector
    get() {
        if (_binocularsMedium != null) {
            return _binocularsMedium!!
        }
        _binocularsMedium = Builder(name = "BinocularsMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.25f, 6.25f)
                horizontalLineToRelative(-0.39f)
                lineToRelative(-0.095f, 0.379f)
                lineToRelative(-1.444f, 5.777f)
                lineToRelative(-2.795f, 1.397f)
                lineToRelative(-0.241f, 0.12f)
                lineToRelative(-0.032f, 0.269f)
                lineTo(4.905f, 25.65f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.75f, 27.0f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, false, 5.75f, 5.75f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, false, 5.75f, -5.846f)
                lineTo(16.25f, 15.079f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, true, 1.75f, -0.323f)
                curveToRelative(0.62f, 0.0f, 1.21f, 0.114f, 1.75f, 0.323f)
                lineToRelative(0.002f, 11.788f)
                lineToRelative(-0.002f, 0.133f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, false, 5.75f, 5.75f)
                arcTo(5.71f, 5.71f, 0.0f, false, false, 31.252f, 27.0f)
                quadToRelative(-0.002f, -0.7f, -0.156f, -1.35f)
                lineToRelative(-1.348f, -11.458f)
                lineToRelative(-0.032f, -0.268f)
                lineToRelative(-0.24f, -0.121f)
                lineToRelative(-2.795f, -1.397f)
                lineToRelative(-1.444f, -5.777f)
                lineToRelative(-0.095f, -0.379f)
                horizontalLineToRelative(-5.39f)
                verticalLineToRelative(0.5f)
                lineTo(19.75f, 12.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.001f, -4.75f)
                horizontalLineToRelative(3.61f)
                lineToRelative(1.405f, 5.621f)
                lineToRelative(0.056f, 0.223f)
                lineToRelative(0.206f, 0.103f)
                lineToRelative(2.759f, 1.38f)
                lineToRelative(1.009f, 8.578f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, -4.296f, -1.898f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, false, -4.749f, 2.476f)
                verticalLineToRelative(-8.121f)
                arcToRelative(4.71f, 4.71f, 0.0f, false, true, 2.0f, 3.888f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -3.208f, -2.545f, -5.744f, -5.751f, -5.744f)
                reflectiveCurveToRelative(-5.75f, 2.536f, -5.75f, 5.744f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -1.624f, 0.784f, -3.036f, 2.0f, -3.888f)
                verticalLineToRelative(8.123f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, false, -4.75f, -2.477f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, -4.294f, 1.896f)
                lineToRelative(1.009f, -8.577f)
                lineToRelative(2.759f, -1.38f)
                lineToRelative(0.205f, -0.103f)
                lineToRelative(0.056f, -0.223f)
                lineTo(11.64f, 7.25f)
                horizontalLineToRelative(3.61f)
                verticalLineToRelative(4.806f)
                horizontalLineToRelative(1.0f)
                lineTo(16.25f, 6.25f)
                horizontalLineToRelative(-5.0f)
                moveTo(20.75f, 27.0f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(-0.122f)
                curveToRelative(0.062f, -2.595f, 2.133f, -4.62f, 4.748f, -4.62f)
                curveToRelative(2.25f, 0.0f, 4.098f, 1.499f, 4.61f, 3.57f)
                lineToRelative(0.141f, 1.2f)
                arcTo(4.71f, 4.71f, 0.0f, false, true, 25.5f, 31.75f)
                arcTo(4.71f, 4.71f, 0.0f, false, true, 20.75f, 27.0f)
                moveToRelative(-5.5f, 0.0f)
                verticalLineToRelative(-0.088f)
                curveToRelative(-0.045f, -2.612f, -2.123f, -4.654f, -4.75f, -4.654f)
                curveToRelative(-2.25f, 0.0f, -4.097f, 1.498f, -4.609f, 3.57f)
                lineToRelative(-0.14f, 1.2f)
                arcTo(4.71f, 4.71f, 0.0f, false, false, 10.5f, 31.75f)
                arcTo(4.71f, 4.71f, 0.0f, false, false, 15.252f, 27.0f)
                close()
                moveTo(23.75f, 27.002f)
                curveToRelative(0.0f, -0.98f, 0.77f, -1.749f, 1.75f, -1.749f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, false, -2.75f, 2.749f)
                close()
                moveTo(7.75f, 27.003f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, true, 2.749f, -2.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, false, -1.749f, 1.75f)
                close()
            }
        }
        .build()
        return _binocularsMedium!!
    }

private var _binocularsMedium: ImageVector? = null
