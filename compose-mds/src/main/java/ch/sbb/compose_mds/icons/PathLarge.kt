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

public val SBBIcons.PathLarge: ImageVector
    get() {
        if (_pathLarge != null) {
            return _pathLarge!!
        }
        _pathLarge = Builder(
            name = "PathLarge",
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
                moveTo(29.5f, 30.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(-21.0f, -5.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -0.001f, 10.001f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.5f, 25.5f)
                moveToRelative(30.5f, -2.0f)
                curveToRelative(0.0f, 2.607f, -0.784f, 4.452f, -1.584f, 5.652f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -1.103f, 1.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.487f, 0.41f)
                lineToRelative(-0.032f, 0.023f)
                lineToRelative(-0.01f, 0.007f)
                lineToRelative(-0.005f, 0.002f)
                verticalLineToRelative(0.002f)
                reflectiveCurveToRelative(-0.002f, 0.0f, -0.279f, -0.416f)
                lineToRelative(-0.277f, -0.416f)
                lineToRelative(-0.001f, 0.001f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(0.02f, -0.014f)
                lineToRelative(0.08f, -0.06f)
                curveToRelative(0.07f, -0.056f, 0.176f, -0.144f, 0.304f, -0.265f)
                curveToRelative(0.258f, -0.243f, 0.608f, -0.621f, 0.959f, -1.148f)
                curveToRelative(0.7f, -1.05f, 1.416f, -2.705f, 1.416f, -5.098f)
                close()
                moveTo(23.813f, 16.11f)
                curveToRelative(2.611f, 2.089f, 3.903f, 4.95f, 4.543f, 7.256f)
                curveToRelative(0.322f, 1.157f, 0.483f, 2.184f, 0.563f, 2.924f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 0.08f, 1.12f)
                lineToRelative(0.001f, 0.064f)
                verticalLineToRelative(0.026f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.015f)
                lineToRelative(-0.001f, -0.053f)
                lineToRelative(-0.008f, -0.216f)
                curveToRelative(-0.01f, -0.19f, -0.028f, -0.47f, -0.066f, -0.819f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, false, -0.531f, -2.763f)
                curveToRelative(-0.61f, -2.193f, -1.818f, -4.833f, -4.206f, -6.743f)
                close()
                moveTo(11.5f, 16.5f)
                lineToRelative(0.277f, 0.416f)
                lineToRelative(0.001f, -0.001f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-0.02f, 0.014f)
                lineToRelative(-0.08f, 0.06f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.304f, 0.265f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, -0.959f, 1.148f)
                curveTo(9.716f, 19.452f, 9.0f, 21.107f, 9.0f, 23.5f)
                lineTo(8.0f, 23.5f)
                curveToRelative(0.0f, -2.607f, 0.784f, -4.452f, 1.584f, -5.652f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 1.104f, -1.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.486f, -0.41f)
                lineToRelative(0.032f, -0.023f)
                lineToRelative(0.01f, -0.007f)
                lineToRelative(0.005f, -0.002f)
                verticalLineToRelative(-0.002f)
                reflectiveCurveToRelative(0.002f, 0.0f, 0.279f, 0.416f)
                moveToRelative(27.0f, -5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -0.001f, 10.001f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 38.5f, 11.5f)
                moveToRelative(-21.0f, -1.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
            .build()
        return _pathLarge!!
    }

private var _pathLarge: ImageVector? = null
