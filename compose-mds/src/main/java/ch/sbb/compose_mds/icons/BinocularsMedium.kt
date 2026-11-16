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
                moveTo(16.25f, 12.056f)
                lineTo(16.25f, 6.25f)
                horizontalLineToRelative(-5.39f)
                lineToRelative(-0.095f, 0.379f)
                lineToRelative(-1.445f, 5.776f)
                lineToRelative(-2.794f, 1.398f)
                lineToRelative(-0.24f, 0.12f)
                lineToRelative(-0.032f, 0.268f)
                lineToRelative(-1.348f, 11.455f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.75f, 27.0f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, false, 5.75f, 5.75f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, false, 5.75f, -5.872f)
                verticalLineToRelative(-11.8f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, true, 1.75f, -0.322f)
                curveToRelative(0.62f, 0.0f, 1.21f, 0.114f, 1.75f, 0.323f)
                lineToRelative(0.002f, 11.778f)
                lineToRelative(-0.002f, 0.143f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, false, 5.75f, 5.75f)
                arcTo(5.71f, 5.71f, 0.0f, false, false, 31.252f, 27.0f)
                quadToRelative(-0.002f, -0.703f, -0.156f, -1.353f)
                lineTo(29.748f, 14.19f)
                lineToRelative(-0.031f, -0.267f)
                lineToRelative(-0.241f, -0.121f)
                lineToRelative(-2.796f, -1.399f)
                lineToRelative(-1.444f, -5.775f)
                lineToRelative(-0.094f, -0.379f)
                horizontalLineToRelative(-5.39f)
                verticalLineToRelative(0.5f)
                lineTo(19.75f, 12.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.002f, -4.75f)
                horizontalLineToRelative(3.61f)
                lineToRelative(1.405f, 5.621f)
                lineToRelative(0.055f, 0.224f)
                lineToRelative(0.206f, 0.102f)
                lineToRelative(2.758f, 1.38f)
                lineToRelative(1.01f, 8.578f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, -4.296f, -1.898f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, false, -4.749f, 2.476f)
                lineToRelative(-0.001f, -8.121f)
                arcToRelative(4.71f, 4.71f, 0.0f, false, true, 2.002f, 3.888f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -3.208f, -2.546f, -5.744f, -5.752f, -5.744f)
                reflectiveCurveToRelative(-5.75f, 2.536f, -5.75f, 5.744f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.71f, 4.71f, 0.0f, false, true, 2.0f, -3.888f)
                verticalLineToRelative(8.122f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, false, -4.75f, -2.477f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, -4.295f, 1.898f)
                lineToRelative(1.009f, -8.579f)
                lineToRelative(2.76f, -1.379f)
                lineToRelative(0.206f, -0.102f)
                lineToRelative(0.055f, -0.224f)
                lineToRelative(1.406f, -5.621f)
                horizontalLineToRelative(3.609f)
                verticalLineToRelative(4.806f)
                close()
                moveTo(20.75f, 27.0f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(-0.13f)
                curveToRelative(0.067f, -2.592f, 2.136f, -4.613f, 4.748f, -4.613f)
                curveToRelative(2.249f, 0.0f, 4.096f, 1.498f, 4.61f, 3.568f)
                lineToRelative(0.142f, 1.208f)
                arcTo(4.71f, 4.71f, 0.0f, false, true, 25.5f, 31.75f)
                arcTo(4.71f, 4.71f, 0.0f, false, true, 20.75f, 27.0f)
                moveToRelative(5.017f, -14.129f)
                lineToRelative(0.485f, -0.122f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(15.25f, 27.0f)
                verticalLineToRelative(-0.11f)
                curveToRelative(-0.058f, -2.602f, -2.132f, -4.632f, -4.751f, -4.632f)
                curveToRelative(-2.251f, 0.0f, -4.1f, 1.5f, -4.61f, 3.574f)
                lineToRelative(-0.14f, 1.193f)
                arcToRelative(4.71f, 4.71f, 0.0f, false, false, 4.75f, 4.725f)
                arcTo(4.71f, 4.71f, 0.0f, false, false, 15.252f, 27.0f)
                close()
                moveTo(23.75f, 27.0f)
                curveToRelative(0.0f, -0.98f, 0.77f, -1.748f, 1.75f, -1.748f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, false, -2.75f, 2.748f)
                close()
                moveTo(10.498f, 25.252f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, false, -1.748f, 1.75f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, true, 2.748f, -2.75f)
                close()
            }
        }
        .build()
        return _binocularsMedium!!
    }

private var _binocularsMedium: ImageVector? = null
