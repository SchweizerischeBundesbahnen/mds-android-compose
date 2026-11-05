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
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 9.0f, 9.0f)
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
                moveToRelative(0.022f, 7.0f)
                curveToRelative(1.18f, -0.053f, 3.94f, 0.44f, 5.711f, 3.012f)
                curveToRelative(-0.951f, 1.455f, -3.196f, 3.04f, -5.723f, 2.988f)
                horizontalLineTo(12.0f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, true, -5.736f, -3.0f)
                arcTo(6.98f, 6.98f, 0.0f, false, true, 12.0f, 9.0f)
                horizontalLineToRelative(0.022f)
                moveToRelative(6.725f, 2.733f)
                curveTo(16.744f, 8.554f, 13.45f, 7.94f, 11.99f, 8.0f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, -6.748f, 3.733f)
                lineTo(5.07f, 12.0f)
                lineToRelative(0.17f, 0.267f)
                arcTo(7.99f, 7.99f, 0.0f, false, false, 11.995f, 16.0f)
                curveToRelative(3.084f, 0.061f, 5.764f, -1.952f, 6.766f, -3.757f)
                lineToRelative(0.144f, -0.259f)
                close()
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
            }
        }
        .build()
        return _arrowCircleEyeSmall!!
    }

private var _arrowCircleEyeSmall: ImageVector? = null
