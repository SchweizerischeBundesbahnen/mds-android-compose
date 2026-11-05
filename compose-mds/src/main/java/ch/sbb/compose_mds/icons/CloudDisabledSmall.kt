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

public val SBBIcons.CloudDisabledSmall: ImageVector
    get() {
        if (_cloudDisabledSmall != null) {
            return _cloudDisabledSmall!!
        }
        _cloudDisabledSmall = Builder(name = "CloudDisabledSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.707f, 20.0f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-4.367f, -4.367f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.312f, 0.014f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.953f, 0.0f, -1.692f, -0.307f, -2.2f, -0.817f)
                curveToRelative(-0.502f, -0.503f, -0.737f, -1.163f, -0.765f, -1.802f)
                curveToRelative(-0.027f, -0.635f, 0.147f, -1.283f, 0.507f, -1.785f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.146f, -0.811f)
                curveToRelative(0.049f, -0.967f, 0.597f, -1.71f, 1.326f, -2.097f)
                lineTo(4.0f, 4.707f)
                lineTo(4.707f, 4.0f)
                close()
                moveTo(10.659f, 8.78f)
                curveToRelative(1.05f, -1.489f, 2.817f, -1.728f, 4.153f, -1.1f)
                curveToRelative(1.22f, 0.576f, 2.082f, 1.87f, 1.822f, 3.549f)
                curveToRelative(0.845f, 0.19f, 1.404f, 0.834f, 1.62f, 1.584f)
                curveToRelative(0.259f, 0.898f, 0.047f, 1.993f, -0.723f, 2.733f)
                lineToRelative(-0.346f, -0.36f)
                lineToRelative(-0.347f, -0.362f)
                curveToRelative(0.478f, -0.46f, 0.62f, -1.158f, 0.455f, -1.734f)
                curveToRelative(-0.16f, -0.551f, -0.58f, -0.943f, -1.252f, -0.916f)
                lineToRelative(-0.7f, 0.027f)
                lineToRelative(0.201f, -0.67f)
                curveToRelative(0.44f, -1.473f, -0.229f, -2.509f, -1.156f, -2.946f)
                curveToRelative(-0.952f, -0.448f, -2.174f, -0.273f, -2.91f, 0.77f)
                close()
                moveTo(9.1f, 9.805f)
                curveToRelative(-0.657f, 0.186f, -1.189f, 0.812f, -1.081f, 1.708f)
                lineToRelative(0.067f, 0.56f)
                horizontalLineToRelative(-0.564f)
                curveToRelative(-0.349f, 0.0f, -0.635f, 0.168f, -0.845f, 0.46f)
                curveToRelative(-0.216f, 0.301f, -0.34f, 0.723f, -0.32f, 1.157f)
                curveToRelative(0.018f, 0.431f, 0.175f, 0.84f, 0.473f, 1.14f)
                curveToRelative(0.292f, 0.293f, 0.762f, 0.523f, 1.492f, 0.523f)
                horizontalLineToRelative(6.326f)
                close()
            }
        }
        .build()
        return _cloudDisabledSmall!!
    }

private var _cloudDisabledSmall: ImageVector? = null
