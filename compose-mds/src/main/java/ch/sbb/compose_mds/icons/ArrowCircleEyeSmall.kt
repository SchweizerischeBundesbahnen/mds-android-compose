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

public val SBBIcons.ArrowCircleEyeSmall: ImageVector
    get() {
        if (_arrowCircleEyeSmall != null) {
            return _arrowCircleEyeSmall!!
        }
        _arrowCircleEyeSmall = Builder(name = "ArrowCircleEyeSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 0.0f, 18.0f)
                curveToRelative(-3.54f, 0.0f, -6.737f, -2.044f, -8.227f, -5.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.319f)
                curveTo(4.708f, 19.85f, 8.177f, 22.0f, 12.0f, 22.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.477f, 2.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                moveToRelative(6.747f, 8.733f)
                curveTo(16.75f, 8.561f, 13.466f, 7.943f, 12.0f, 8.001f)
                verticalLineTo(8.0f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, -6.76f, 3.732f)
                lineTo(5.073f, 12.0f)
                lineToRelative(0.169f, 0.267f)
                arcTo(7.99f, 7.99f, 0.0f, false, false, 11.99f, 16.0f)
                curveToRelative(3.085f, 0.065f, 5.768f, -1.95f, 6.771f, -3.756f)
                lineToRelative(0.144f, -0.259f)
                close()
                moveTo(12.0f, 9.0f)
                horizontalLineToRelative(0.022f)
                curveToRelative(1.179f, -0.053f, 3.939f, 0.44f, 5.71f, 3.01f)
                curveToRelative(-0.92f, 1.408f, -3.047f, 2.938f, -5.472f, 2.99f)
                horizontalLineTo(12.0f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, true, -5.734f, -3.0f)
                arcTo(6.98f, 6.98f, 0.0f, false, true, 12.0f, 9.0f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
            }
        }
        .build()
        return _arrowCircleEyeSmall!!
    }

private var _arrowCircleEyeSmall: ImageVector? = null
