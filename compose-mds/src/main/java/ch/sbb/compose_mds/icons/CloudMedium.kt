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

public val SBBIcons.CloudMedium: ImageVector
    get() {
        if (_cloudMedium != null) {
            return _cloudMedium!!
        }
        _cloudMedium = Builder(name = "CloudMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.132f, 15.013f)
                curveToRelative(0.791f, 0.118f, 1.429f, 0.511f, 1.878f, 1.07f)
                curveToRelative(0.555f, 0.692f, 0.801f, 1.609f, 0.74f, 2.51f)
                arcToRelative(3.84f, 3.84f, 0.0f, false, true, -1.16f, 2.517f)
                curveToRelative(-0.729f, 0.7f, -1.78f, 1.14f, -3.139f, 1.14f)
                horizontalLineToRelative(-10.5f)
                curveToRelative(-1.373f, 0.0f, -2.415f, -0.44f, -3.123f, -1.15f)
                curveToRelative(-0.702f, -0.704f, -1.034f, -1.632f, -1.074f, -2.538f)
                curveToRelative(-0.04f, -0.903f, 0.21f, -1.819f, 0.714f, -2.52f)
                curveToRelative(0.416f, -0.58f, 1.014f, -1.02f, 1.757f, -1.163f)
                curveToRelative(0.008f, -2.795f, 2.946f, -4.336f, 5.135f, -3.118f)
                curveToRelative(1.329f, -2.358f, 3.803f, -2.94f, 5.799f, -2.22f)
                curveToRelative(1.063f, 0.384f, 2.0f, 1.14f, 2.555f, 2.195f)
                curveToRelative(0.482f, 0.915f, 0.663f, 2.03f, 0.418f, 3.277f)
                moveToRelative(-3.313f, -4.531f)
                curveToRelative(-1.687f, -0.61f, -3.801f, -0.064f, -4.81f, 2.214f)
                lineToRelative(-0.266f, 0.599f)
                lineToRelative(-0.508f, -0.414f)
                curveToRelative(-1.632f, -1.331f, -4.282f, -0.066f, -3.987f, 2.39f)
                lineToRelative(0.067f, 0.559f)
                horizontalLineToRelative(-0.564f)
                curveToRelative(-0.617f, 0.0f, -1.117f, 0.302f, -1.471f, 0.795f)
                curveToRelative(-0.36f, 0.501f, -0.558f, 1.19f, -0.527f, 1.893f)
                curveToRelative(0.03f, 0.699f, 0.285f, 1.376f, 0.783f, 1.876f)
                curveToRelative(0.492f, 0.493f, 1.265f, 0.856f, 2.415f, 0.856f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.133f, 0.0f, 1.926f, -0.362f, 2.447f, -0.862f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, false, 0.854f, -1.864f)
                curveToRelative(0.047f, -0.685f, -0.145f, -1.345f, -0.522f, -1.815f)
                curveToRelative(-0.367f, -0.457f, -0.93f, -0.76f, -1.709f, -0.73f)
                lineToRelative(-0.7f, 0.028f)
                lineToRelative(0.201f, -0.67f)
                curveToRelative(0.379f, -1.268f, 0.233f, -2.326f, -0.193f, -3.136f)
                arcToRelative(3.66f, 3.66f, 0.0f, false, false, -2.01f, -1.72f)
            }
        }
        .build()
        return _cloudMedium!!
    }

private var _cloudMedium: ImageVector? = null
