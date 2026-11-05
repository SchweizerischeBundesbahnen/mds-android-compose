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

public val SBBIcons.CloudFogSmall: ImageVector
    get() {
        if (_cloudFogSmall != null) {
            return _cloudFogSmall!!
        }
        _cloudFogSmall = Builder(
            name = "CloudFogSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveTo(16.313f, 9.856f)
                curveToRelative(0.493f, 0.112f, 0.897f, 0.38f, 1.19f, 0.746f)
                curveToRelative(0.4f, 0.5f, 0.572f, 1.156f, 0.529f, 1.795f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, -0.823f, 1.793f)
                curveToRelative(-0.52f, 0.502f, -1.265f, 0.81f, -2.209f, 0.81f)
                horizontalLineTo(8.0f)
                curveToRelative(-0.954f, 0.0f, -1.693f, -0.308f, -2.201f, -0.82f)
                curveToRelative(-0.502f, -0.505f, -0.736f, -1.167f, -0.764f, -1.808f)
                curveToRelative(-0.028f, -0.637f, 0.147f, -1.287f, 0.507f, -1.79f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.144f, -0.816f)
                curveToRelative(0.092f, -1.85f, 2.006f, -2.895f, 3.522f, -2.176f)
                curveToRelative(0.946f, -1.538f, 2.625f, -1.917f, 3.988f, -1.422f)
                curveToRelative(0.745f, 0.27f, 1.403f, 0.803f, 1.794f, 1.549f)
                curveToRelative(0.318f, 0.607f, 0.447f, 1.335f, 0.322f, 2.139f)
                moveToRelative(-2.458f, -2.748f)
                curveToRelative(-1.049f, -0.38f, -2.362f, -0.046f, -2.997f, 1.394f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-0.967f, -0.792f, -2.566f, -0.048f, -2.386f, 1.454f)
                lineToRelative(0.066f, 0.56f)
                horizontalLineTo(7.2f)
                curveToRelative(-0.348f, 0.0f, -0.634f, 0.168f, -0.845f, 0.462f)
                curveToRelative(-0.217f, 0.303f, -0.34f, 0.728f, -0.32f, 1.165f)
                curveToRelative(0.018f, 0.435f, 0.175f, 0.847f, 0.473f, 1.148f)
                curveToRelative(0.293f, 0.295f, 0.763f, 0.524f, 1.492f, 0.524f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.716f, 0.0f, 1.202f, -0.229f, 1.515f, -0.53f)
                curveToRelative(0.318f, -0.307f, 0.49f, -0.72f, 0.52f, -1.141f)
                curveToRelative(0.028f, -0.424f, -0.09f, -0.824f, -0.313f, -1.103f)
                curveToRelative(-0.212f, -0.265f, -0.536f, -0.445f, -1.002f, -0.426f)
                lineToRelative(-0.698f, 0.028f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.241f, -0.812f, 0.145f, -1.476f, -0.117f, -1.977f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.073f)
                moveTo(17.993f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.993f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineToRelative(10.993f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
            .build()
        return _cloudFogSmall!!
    }

private var _cloudFogSmall: ImageVector? = null
