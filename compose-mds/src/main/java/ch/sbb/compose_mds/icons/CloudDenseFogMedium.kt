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

public val SBBIcons.CloudDenseFogMedium: ImageVector
    get() {
        if (_cloudDenseFogMedium != null) {
            return _cloudDenseFogMedium!!
        }
        _cloudDenseFogMedium = Builder(name = "CloudDenseFogMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.06f, 16.06f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, -1.88f, -1.076f)
                curveToRelative(0.246f, -1.253f, 0.065f, -2.373f, -0.417f, -3.293f)
                arcToRelative(4.66f, 4.66f, 0.0f, false, false, -2.555f, -2.204f)
                curveToRelative(-1.997f, -0.725f, -4.471f, -0.138f, -5.8f, 2.23f)
                curveToRelative(-2.192f, -1.226f, -5.127f, 0.33f, -5.134f, 3.133f)
                curveToRelative(-0.744f, 0.144f, -1.342f, 0.586f, -1.758f, 1.167f)
                curveToRelative(-0.504f, 0.705f, -0.753f, 1.624f, -0.714f, 2.53f)
                curveToRelative(0.04f, 0.91f, 0.372f, 1.841f, 1.073f, 2.548f)
                curveToRelative(0.708f, 0.713f, 1.75f, 1.156f, 3.125f, 1.156f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.36f, 0.0f, 2.411f, -0.443f, 3.14f, -1.146f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, 1.158f, -2.527f)
                curveToRelative(0.062f, -0.904f, -0.184f, -1.824f, -0.739f, -2.518f)
                moveToRelative(-10.002f, -3.407f)
                curveToRelative(1.01f, -2.29f, 3.124f, -2.838f, 4.81f, -2.226f)
                curveToRelative(0.848f, 0.308f, 1.58f, 0.908f, 2.01f, 1.728f)
                curveToRelative(0.426f, 0.814f, 0.572f, 1.879f, 0.193f, 3.153f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.7f, -0.028f)
                curveToRelative(0.777f, -0.03f, 1.34f, 0.274f, 1.707f, 0.734f)
                curveToRelative(0.378f, 0.473f, 0.57f, 1.137f, 0.523f, 1.826f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, true, -0.855f, 1.875f)
                curveToRelative(-0.52f, 0.502f, -1.314f, 0.866f, -2.446f, 0.866f)
                lineTo(12.0f, 21.251f)
                curveToRelative(-1.15f, 0.0f, -1.922f, -0.364f, -2.415f, -0.86f)
                curveToRelative(-0.498f, -0.503f, -0.753f, -1.184f, -0.784f, -1.887f)
                curveToRelative(-0.03f, -0.707f, 0.167f, -1.4f, 0.528f, -1.905f)
                curveToRelative(0.355f, -0.495f, 0.855f, -0.798f, 1.471f, -0.798f)
                horizontalLineToRelative(0.563f)
                lineToRelative(-0.066f, -0.56f)
                curveToRelative(-0.296f, -2.472f, 2.358f, -3.737f, 3.986f, -2.403f)
                lineToRelative(0.51f, 0.416f)
                close()
                moveTo(7.5f, 25.25f)
                horizontalLineToRelative(19.49f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 24.25f)
                close()
                moveTo(26.99f, 31.25f)
                lineTo(7.5f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.49f)
                close()
                moveTo(9.0f, 28.25f)
                horizontalLineToRelative(16.49f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 27.25f)
                close()
            }
        }
        .build()
        return _cloudDenseFogMedium!!
    }

private var _cloudDenseFogMedium: ImageVector? = null
