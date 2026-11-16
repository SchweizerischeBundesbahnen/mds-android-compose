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
                moveTo(21.209f, 9.487f)
                curveToRelative(-1.998f, -0.724f, -4.473f, -0.138f, -5.801f, 2.232f)
                curveToRelative(-2.192f, -1.226f, -5.124f, 0.328f, -5.132f, 3.13f)
                curveToRelative(-0.745f, 0.143f, -1.343f, 0.586f, -1.76f, 1.168f)
                curveToRelative(-0.504f, 0.705f, -0.753f, 1.625f, -0.714f, 2.53f)
                curveToRelative(0.04f, 0.91f, 0.372f, 1.84f, 1.073f, 2.548f)
                curveToRelative(0.708f, 0.713f, 1.75f, 1.156f, 3.126f, 1.156f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.358f, 0.0f, 2.41f, -0.443f, 3.14f, -1.146f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, 1.157f, -2.527f)
                curveToRelative(0.062f, -0.904f, -0.184f, -1.824f, -0.739f, -2.518f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, false, -1.88f, -1.075f)
                curveToRelative(0.245f, -1.254f, 0.066f, -2.374f, -0.416f, -3.294f)
                arcToRelative(4.66f, 4.66f, 0.0f, false, false, -2.555f, -2.204f)
                moveToRelative(-5.15f, 3.165f)
                curveToRelative(1.01f, -2.29f, 3.122f, -2.836f, 4.808f, -2.225f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, true, 2.01f, 1.728f)
                curveToRelative(0.427f, 0.814f, 0.573f, 1.88f, 0.194f, 3.154f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.699f, -0.029f)
                curveToRelative(0.778f, -0.031f, 1.34f, 0.274f, 1.708f, 0.733f)
                curveToRelative(0.378f, 0.473f, 0.57f, 1.138f, 0.522f, 1.828f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, true, -0.854f, 1.875f)
                curveToRelative(-0.521f, 0.502f, -1.314f, 0.865f, -2.446f, 0.865f)
                lineTo(12.0f, 21.251f)
                curveToRelative(-1.15f, 0.0f, -1.922f, -0.364f, -2.415f, -0.86f)
                curveToRelative(-0.498f, -0.503f, -0.753f, -1.184f, -0.784f, -1.887f)
                curveToRelative(-0.03f, -0.707f, 0.168f, -1.4f, 0.529f, -1.905f)
                curveToRelative(0.354f, -0.495f, 0.854f, -0.798f, 1.47f, -0.798f)
                horizontalLineToRelative(0.564f)
                lineToRelative(-0.068f, -0.56f)
                curveToRelative(-0.286f, -2.395f, 2.196f, -3.656f, 3.831f, -2.521f)
                lineToRelative(0.157f, 0.118f)
                lineToRelative(0.508f, 0.416f)
                close()
                moveTo(16.058f, 12.652f)
                lineTo(15.599f, 12.452f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(11.295f, 15.242f)
                lineTo(10.799f, 15.301f)
                lineTo(10.799f, 15.3f)
                close()
                moveTo(26.99f, 25.25f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 24.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(26.99f, 30.25f)
                verticalLineToRelative(1.0f)
                lineTo(7.5f, 31.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(25.49f, 28.25f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 27.25f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _cloudDenseFogMedium!!
    }

private var _cloudDenseFogMedium: ImageVector? = null
