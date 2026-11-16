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
        _arrowCircleEyeMedium = Builder(name = "ArrowCircleEyeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.25f)
                curveToRelative(7.594f, 0.0f, 13.75f, 6.156f, 13.75f, 13.75f)
                reflectiveCurveTo(25.594f, 31.75f, 18.0f, 31.75f)
                curveToRelative(-5.547f, 0.0f, -10.544f, -3.287f, -12.74f, -8.0f)
                lineTo(9.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                lineTo(3.25f, 22.75f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.554f)
                curveToRelative(2.306f, 5.19f, 7.73f, 8.804f, 13.75f, 8.804f)
                curveToRelative(8.146f, 0.0f, 14.75f, -6.604f, 14.75f, -14.75f)
                reflectiveCurveTo(26.146f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(3.25f, 9.854f, 3.25f, 18.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -7.594f, 6.156f, -13.75f, 13.75f, -13.75f)
                moveToRelative(9.91f, 13.483f)
                curveToRelative(-2.941f, -4.668f, -7.777f, -5.57f, -9.91f, -5.482f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-4.053f, 0.0f, -7.617f, 2.059f, -9.727f, 5.177f)
                lineToRelative(-0.2f, 0.306f)
                lineToRelative(-0.17f, 0.267f)
                lineToRelative(0.17f, 0.267f)
                curveToRelative(2.078f, 3.287f, 5.736f, 5.478f, 9.916f, 5.482f)
                curveToRelative(4.526f, 0.094f, 8.47f, -2.868f, 9.935f, -5.506f)
                lineToRelative(0.143f, -0.259f)
                close()
                moveTo(27.924f, 18.243f)
                lineTo(27.485f, 18.0f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(18.0f, 13.25f)
                horizontalLineToRelative(0.023f)
                curveToRelative(1.847f, -0.083f, 6.159f, 0.697f, 8.874f, 4.764f)
                curveToRelative(-1.372f, 2.213f, -4.696f, 4.654f, -8.502f, 4.736f)
                lineTo(18.0f, 22.75f)
                curveToRelative(-3.711f, 0.0f, -6.976f, -1.886f, -8.908f, -4.75f)
                curveToRelative(1.932f, -2.864f, 5.197f, -4.75f, 8.908f, -4.75f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -3.5f)
                moveToRelative(0.0f, 4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, -5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, 5.5f)
            }
        }
        .build()
        return _arrowCircleEyeMedium!!
    }

private var _arrowCircleEyeMedium: ImageVector? = null
