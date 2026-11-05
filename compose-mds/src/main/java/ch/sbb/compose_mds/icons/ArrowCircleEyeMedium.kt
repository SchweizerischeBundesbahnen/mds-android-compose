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

public val SBBIcons.ArrowCircleEyeMedium: ImageVector
    get() {
        if (_arrowCircleEyeMedium != null) {
            return _arrowCircleEyeMedium!!
        }
        _arrowCircleEyeMedium = Builder(
            name = "ArrowCircleEyeMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(18.0f, 3.25f)
                curveTo(9.854f, 3.25f, 3.25f, 9.854f, 3.25f, 18.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -7.594f, 6.156f, -13.75f, 13.75f, -13.75f)
                reflectiveCurveTo(31.75f, 10.406f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 31.75f, 18.0f, 31.75f)
                curveToRelative(-5.547f, 0.0f, -10.544f, -3.287f, -12.74f, -8.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(3.25f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.555f)
                curveToRelative(2.305f, 5.19f, 7.73f, 8.805f, 13.75f, 8.805f)
                curveToRelative(8.146f, 0.0f, 14.75f, -6.604f, 14.75f, -14.75f)
                reflectiveCurveTo(26.146f, 3.25f, 18.0f, 3.25f)
                moveToRelative(0.022f, 10.0f)
                curveToRelative(1.848f, -0.083f, 6.162f, 0.695f, 8.877f, 4.763f)
                curveToRelative(-1.417f, 2.288f, -4.922f, 4.82f, -8.889f, 4.737f)
                horizontalLineTo(18.0f)
                curveToRelative(-3.71f, 0.0f, -6.975f, -1.886f, -8.908f, -4.75f)
                curveToRelative(1.933f, -2.864f, 5.197f, -4.75f, 8.908f, -4.75f)
                horizontalLineToRelative(0.022f)
                moveToRelative(9.888f, 4.483f)
                curveToRelative(-2.946f, -4.676f, -7.793f, -5.574f, -9.921f, -5.483f)
                curveToRelative(-4.18f, 0.004f, -7.837f, 2.197f, -9.916f, 5.483f)
                lineToRelative(-0.17f, 0.267f)
                lineToRelative(0.17f, 0.267f)
                curveToRelative(2.08f, 3.288f, 5.74f, 5.481f, 9.922f, 5.483f)
                curveToRelative(4.524f, 0.091f, 8.464f, -2.87f, 9.929f, -5.507f)
                lineToRelative(0.143f, -0.259f)
                close()
                moveTo(16.25f, 18.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                moveTo(18.0f, 15.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -5.5f)
            }
        }
            .build()
        return _arrowCircleEyeMedium!!
    }

private var _arrowCircleEyeMedium: ImageVector? = null
