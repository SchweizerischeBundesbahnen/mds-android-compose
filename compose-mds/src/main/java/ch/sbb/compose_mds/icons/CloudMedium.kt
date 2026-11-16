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

public val SBBIcons.CloudMedium: ImageVector
    get() {
        if (_cloudMedium != null) {
            return _cloudMedium!!
        }
        _cloudMedium = Builder(name = "CloudMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.358f, 11.762f)
                curveToRelative(1.33f, -2.36f, 3.804f, -2.942f, 5.8f, -2.221f)
                curveToRelative(1.063f, 0.384f, 2.0f, 1.14f, 2.556f, 2.195f)
                curveToRelative(0.481f, 0.915f, 0.661f, 2.03f, 0.416f, 3.278f)
                curveToRelative(0.792f, 0.118f, 1.43f, 0.51f, 1.88f, 1.069f)
                curveToRelative(0.555f, 0.692f, 0.8f, 1.609f, 0.739f, 2.51f)
                arcToRelative(3.84f, 3.84f, 0.0f, false, true, -1.158f, 2.517f)
                curveToRelative(-0.73f, 0.7f, -1.781f, 1.14f, -3.14f, 1.14f)
                horizontalLineToRelative(-10.5f)
                curveToRelative(-1.374f, 0.0f, -2.415f, -0.44f, -3.123f, -1.15f)
                curveToRelative(-0.702f, -0.705f, -1.034f, -1.632f, -1.074f, -2.539f)
                curveToRelative(-0.04f, -0.902f, 0.21f, -1.818f, 0.714f, -2.52f)
                curveToRelative(0.417f, -0.58f, 1.015f, -1.02f, 1.759f, -1.162f)
                curveToRelative(0.008f, -2.795f, 2.943f, -4.335f, 5.131f, -3.117f)
                moveToRelative(5.461f, -1.28f)
                curveToRelative(-1.687f, -0.61f, -3.8f, -0.063f, -4.81f, 2.214f)
                lineToRelative(-0.266f, 0.599f)
                lineToRelative(-0.508f, -0.414f)
                curveToRelative(-1.632f, -1.331f, -4.281f, -0.066f, -3.987f, 2.39f)
                lineToRelative(0.066f, 0.559f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-0.617f, 0.0f, -1.117f, 0.302f, -1.47f, 0.795f)
                curveToRelative(-0.361f, 0.501f, -0.559f, 1.19f, -0.528f, 1.892f)
                curveToRelative(0.03f, 0.7f, 0.285f, 1.377f, 0.783f, 1.877f)
                curveToRelative(0.492f, 0.493f, 1.265f, 0.856f, 2.415f, 0.856f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.132f, 0.0f, 1.927f, -0.362f, 2.447f, -0.861f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, false, 0.854f, -1.865f)
                curveToRelative(0.047f, -0.685f, -0.145f, -1.345f, -0.522f, -1.815f)
                curveToRelative(-0.368f, -0.457f, -0.93f, -0.76f, -1.709f, -0.73f)
                lineToRelative(-0.699f, 0.029f)
                lineToRelative(0.2f, -0.671f)
                lineToRelative(0.065f, -0.236f)
                curveToRelative(0.294f, -1.163f, 0.141f, -2.141f, -0.258f, -2.9f)
                arcToRelative(3.66f, 3.66f, 0.0f, false, false, -2.01f, -1.72f)
            }
        }
        .build()
        return _cloudMedium!!
    }

private var _cloudMedium: ImageVector? = null
