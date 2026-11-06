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

public val SBBIcons.CloudRainSnowSmall: ImageVector
    get() {
        if (_cloudRainSnowSmall != null) {
            return _cloudRainSnowSmall!!
        }
        _cloudRainSnowSmall = Builder(name = "CloudRainSnowSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.312f, 9.856f)
                curveToRelative(0.492f, 0.112f, 0.894f, 0.382f, 1.182f, 0.75f)
                curveToRelative(0.393f, 0.502f, 0.555f, 1.16f, 0.506f, 1.796f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.825f, 1.786f)
                curveTo(16.66f, 14.69f, 15.927f, 15.0f, 15.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                curveToRelative(-0.954f, 0.0f, -1.693f, -0.308f, -2.201f, -0.82f)
                curveToRelative(-0.502f, -0.505f, -0.736f, -1.167f, -0.764f, -1.808f)
                curveToRelative(-0.028f, -0.637f, 0.147f, -1.287f, 0.507f, -1.79f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.144f, -0.816f)
                curveToRelative(0.092f, -1.85f, 2.006f, -2.895f, 3.522f, -2.176f)
                curveToRelative(0.946f, -1.538f, 2.625f, -1.917f, 3.988f, -1.422f)
                curveToRelative(0.745f, 0.27f, 1.403f, 0.803f, 1.794f, 1.549f)
                curveToRelative(0.318f, 0.607f, 0.447f, 1.335f, 0.322f, 2.14f)
                moveToRelative(-2.457f, -2.748f)
                curveToRelative(-1.049f, -0.38f, -2.362f, -0.046f, -2.997f, 1.394f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-0.967f, -0.792f, -2.566f, -0.048f, -2.386f, 1.454f)
                lineToRelative(0.066f, 0.56f)
                lineTo(7.2f, 10.702f)
                curveToRelative(-0.348f, 0.0f, -0.634f, 0.168f, -0.845f, 0.462f)
                curveToRelative(-0.217f, 0.303f, -0.34f, 0.728f, -0.32f, 1.165f)
                curveToRelative(0.018f, 0.435f, 0.175f, 0.847f, 0.473f, 1.148f)
                curveToRelative(0.293f, 0.295f, 0.763f, 0.524f, 1.492f, 0.524f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.691f, 0.0f, 1.167f, -0.226f, 1.477f, -0.528f)
                curveToRelative(0.317f, -0.309f, 0.493f, -0.725f, 0.526f, -1.148f)
                curveToRelative(0.033f, -0.427f, -0.08f, -0.826f, -0.296f, -1.102f)
                curveToRelative(-0.205f, -0.261f, -0.522f, -0.44f, -0.987f, -0.422f)
                lineToRelative(-0.698f, 0.028f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.241f, -0.812f, 0.145f, -1.476f, -0.117f, -1.977f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.073f)
                moveTo(16.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-3.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(1.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-7.947f, -4.224f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(0.894f, 0.448f)
                lineToRelative(1.0f, -2.0f)
                close()
                moveTo(9.053f, 17.776f)
                lineTo(10.053f, 15.776f)
                lineTo(10.947f, 16.224f)
                lineTo(9.947f, 18.224f)
                close()
                moveTo(8.053f, 15.776f)
                lineTo(6.053f, 19.776f)
                lineTo(6.947f, 20.224f)
                lineTo(8.947f, 16.224f)
                close()
            }
        }
        .build()
        return _cloudRainSnowSmall!!
    }

private var _cloudRainSnowSmall: ImageVector? = null
