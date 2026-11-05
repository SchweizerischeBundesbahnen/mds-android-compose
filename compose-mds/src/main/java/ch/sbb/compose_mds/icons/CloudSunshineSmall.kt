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

public val SBBIcons.CloudSunshineSmall: ImageVector
    get() {
        if (_cloudSunshineSmall != null) {
            return _cloudSunshineSmall!!
        }
        _cloudSunshineSmall = Builder(
            name = "CloudSunshineSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(16.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 2.0f)
                close()
                moveTo(15.99f, 7.717f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -1.066f, -1.18f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 6.0f)
                curveTo(17.915f, 6.0f, 19.0f, 7.085f, 19.0f, 8.5f)
                curveToRelative(0.0f, 1.02f, -0.562f, 1.862f, -1.397f, 2.257f)
                arcToRelative(2.065f, 2.065f, 0.0f, false, false, -1.29f, -0.9f)
                curveToRelative(0.124f, -0.805f, -0.005f, -1.532f, -0.323f, -2.14f)
                moveTo(18.0f, 12.402f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.034f, -0.711f)
                curveTo(19.182f, 11.146f, 20.0f, 9.936f, 20.0f, 8.5f)
                curveTo(20.0f, 6.533f, 18.467f, 5.0f, 16.5f, 5.0f)
                curveToRelative(-1.016f, 0.0f, -1.923f, 0.41f, -2.56f, 1.086f)
                curveToRelative(-1.311f, -0.361f, -2.844f, 0.06f, -3.732f, 1.504f)
                curveToRelative(-1.516f, -0.719f, -3.43f, 0.326f, -3.522f, 2.177f)
                curveToRelative(-0.481f, 0.128f, -0.87f, 0.43f, -1.144f, 0.814f)
                curveToRelative(-0.36f, 0.504f, -0.535f, 1.154f, -0.507f, 1.791f)
                curveToRelative(0.028f, 0.64f, 0.262f, 1.303f, 0.764f, 1.809f)
                curveToRelative(0.508f, 0.511f, 1.247f, 0.82f, 2.201f, 0.82f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.927f, 0.0f, 1.66f, -0.312f, 2.175f, -0.813f)
                arcTo(2.8f, 2.8f, 0.0f, false, false, 18.0f, 12.402f)
                moveToRelative(-4.145f, -5.294f)
                curveToRelative(-1.049f, -0.38f, -2.362f, -0.046f, -2.997f, 1.394f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-0.967f, -0.792f, -2.566f, -0.048f, -2.386f, 1.454f)
                lineToRelative(0.066f, 0.56f)
                lineTo(7.2f, 10.701f)
                curveToRelative(-0.348f, 0.0f, -0.634f, 0.168f, -0.845f, 0.462f)
                curveToRelative(-0.217f, 0.303f, -0.34f, 0.728f, -0.32f, 1.166f)
                curveToRelative(0.018f, 0.434f, 0.175f, 0.846f, 0.473f, 1.147f)
                curveToRelative(0.293f, 0.295f, 0.763f, 0.524f, 1.492f, 0.524f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.691f, 0.0f, 1.167f, -0.226f, 1.477f, -0.528f)
                curveToRelative(0.317f, -0.308f, 0.493f, -0.725f, 0.526f, -1.148f)
                curveToRelative(0.033f, -0.427f, -0.08f, -0.826f, -0.296f, -1.101f)
                curveToRelative(-0.205f, -0.262f, -0.522f, -0.442f, -0.987f, -0.423f)
                lineToRelative(-0.698f, 0.028f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.241f, -0.812f, 0.145f, -1.476f, -0.117f, -1.977f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.073f)
                moveToRelative(-0.931f, -1.484f)
                lineToRelative(-1.441f, -1.386f)
                lineToRelative(0.693f, -0.72f)
                lineToRelative(1.44f, 1.386f)
                close()
                moveTo(19.438f, 12.217f)
                lineTo(20.852f, 13.631f)
                lineTo(21.559f, 12.924f)
                lineTo(20.146f, 11.51f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.742f, 3.535f)
                lineTo(19.328f, 4.95f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
            .build()
        return _cloudSunshineSmall!!
    }

private var _cloudSunshineSmall: ImageVector? = null
