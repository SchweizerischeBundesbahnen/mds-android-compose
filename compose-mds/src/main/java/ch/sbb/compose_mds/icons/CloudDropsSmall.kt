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

public val SBBIcons.CloudDropsSmall: ImageVector
    get() {
        if (_cloudDropsSmall != null) {
            return _cloudDropsSmall!!
        }
        _cloudDropsSmall = Builder(
            name = "CloudDropsSmall",
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
                moveTo(17.49f, 10.608f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, false, -1.178f, -0.752f)
                curveToRelative(0.125f, -0.804f, -0.004f, -1.532f, -0.322f, -2.14f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, -1.794f, -1.548f)
                curveToRelative(-1.363f, -0.495f, -3.042f, -0.116f, -3.988f, 1.422f)
                curveToRelative(-1.516f, -0.719f, -3.43f, 0.326f, -3.522f, 2.176f)
                curveToRelative(-0.481f, 0.129f, -0.87f, 0.432f, -1.144f, 0.815f)
                curveToRelative(-0.36f, 0.504f, -0.535f, 1.154f, -0.507f, 1.791f)
                curveToRelative(0.028f, 0.64f, 0.262f, 1.303f, 0.764f, 1.809f)
                curveToRelative(0.407f, 0.41f, 0.963f, 0.69f, 1.66f, 0.784f)
                lineToRelative(-0.406f, 0.811f)
                lineTo(7.5f, 16.0f)
                lineToRelative(-0.447f, -0.224f)
                verticalLineToRelative(0.002f)
                lineToRelative(-0.002f, 0.003f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-0.018f, 0.035f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.242f, 0.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.189f, 0.541f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.097f, 0.583f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -0.195f, -0.046f, -0.404f, -0.097f, -0.583f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.189f, -0.54f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.242f, -0.55f)
                lineToRelative(-0.018f, -0.036f)
                lineToRelative(-0.005f, -0.01f)
                lineToRelative(-0.001f, -0.003f)
                verticalLineToRelative(-0.001f)
                lineTo(7.5f, 16.0f)
                lineToRelative(0.447f, -0.224f)
                lineToRelative(-0.4f, -0.8f)
                quadTo(7.764f, 15.0f, 8.0f, 15.0f)
                horizontalLineToRelative(3.44f)
                lineToRelative(-0.387f, 0.776f)
                lineToRelative(0.447f, 0.224f)
                lineToRelative(-0.447f, -0.224f)
                verticalLineToRelative(0.002f)
                lineToRelative(-0.002f, 0.003f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-0.018f, 0.035f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.242f, 0.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.189f, 0.541f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.097f, 0.583f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -0.195f, -0.046f, -0.404f, -0.097f, -0.583f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.189f, -0.54f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.242f, -0.55f)
                lineToRelative(-0.018f, -0.036f)
                lineToRelative(-0.005f, -0.01f)
                lineToRelative(-0.001f, -0.003f)
                verticalLineToRelative(-0.001f)
                lineTo(11.5f, 16.0f)
                lineToRelative(0.447f, -0.224f)
                lineTo(11.56f, 15.0f)
                lineTo(15.0f, 15.0f)
                quadToRelative(0.235f, 0.0f, 0.454f, -0.026f)
                lineToRelative(-0.401f, 0.802f)
                lineToRelative(0.447f, 0.224f)
                lineToRelative(-0.447f, -0.224f)
                verticalLineToRelative(0.002f)
                lineToRelative(-0.002f, 0.003f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-0.018f, 0.035f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.242f, 0.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.189f, 0.541f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.097f, 0.583f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -0.195f, -0.046f, -0.404f, -0.097f, -0.583f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.189f, -0.54f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.242f, -0.55f)
                lineToRelative(-0.018f, -0.036f)
                lineToRelative(-0.005f, -0.01f)
                lineToRelative(-0.001f, -0.003f)
                verticalLineToRelative(-0.001f)
                lineTo(15.5f, 16.0f)
                lineToRelative(0.447f, -0.224f)
                lineToRelative(-0.407f, -0.814f)
                curveToRelative(0.67f, -0.097f, 1.214f, -0.376f, 1.622f, -0.774f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.825f, -1.784f)
                curveToRelative(0.052f, -0.636f, -0.106f, -1.293f, -0.496f, -1.796f)
                moveToRelative(-6.632f, -2.106f)
                curveToRelative(0.635f, -1.44f, 1.948f, -1.774f, 2.997f, -1.394f)
                curveToRelative(0.53f, 0.192f, 0.983f, 0.566f, 1.249f, 1.073f)
                curveToRelative(0.262f, 0.5f, 0.358f, 1.165f, 0.117f, 1.977f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.7f, -0.028f)
                curveToRelative(0.464f, -0.019f, 0.778f, 0.16f, 0.98f, 0.42f)
                curveToRelative(0.213f, 0.276f, 0.325f, 0.675f, 0.29f, 1.102f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -0.528f, 1.15f)
                curveToRelative(-0.31f, 0.303f, -0.781f, 0.528f, -1.463f, 0.528f)
                lineTo(8.0f, 14.0f)
                curveToRelative(-0.73f, 0.0f, -1.2f, -0.23f, -1.492f, -0.524f)
                curveToRelative(-0.298f, -0.3f, -0.455f, -0.713f, -0.474f, -1.148f)
                curveToRelative(-0.019f, -0.437f, 0.104f, -0.862f, 0.321f, -1.165f)
                curveToRelative(0.21f, -0.294f, 0.497f, -0.463f, 0.845f, -0.463f)
                horizontalLineToRelative(0.563f)
                lineToRelative(-0.066f, -0.56f)
                curveToRelative(-0.18f, -1.5f, 1.419f, -2.245f, 2.386f, -1.453f)
                lineToRelative(0.51f, 0.417f)
                close()
                moveTo(13.054f, 17.776f)
                lineTo(13.5f, 18.0f)
                lineToRelative(0.447f, -0.224f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.002f, 0.003f)
                lineToRelative(0.005f, 0.01f)
                lineToRelative(0.018f, 0.035f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.242f, 0.55f)
                curveToRelative(0.066f, 0.166f, 0.135f, 0.355f, 0.189f, 0.541f)
                curveToRelative(0.05f, 0.179f, 0.097f, 0.388f, 0.097f, 0.583f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.097f, -0.583f)
                curveToRelative(0.054f, -0.186f, 0.123f, -0.375f, 0.189f, -0.54f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.242f, -0.55f)
                lineToRelative(0.018f, -0.036f)
                lineToRelative(0.005f, -0.01f)
                lineToRelative(0.001f, -0.003f)
                close()
                moveTo(13.5f, 18.0f)
                lineToRelative(-0.447f, -0.224f)
                lineToRelative(0.447f, -0.894f)
                lineToRelative(0.447f, 0.894f)
                close()
                moveTo(9.053f, 17.776f)
                lineTo(9.5f, 18.0f)
                close()
                verticalLineToRelative(0.002f)
                lineToRelative(-0.002f, 0.003f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-0.018f, 0.035f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.242f, 0.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.189f, 0.541f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.097f, 0.583f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -0.195f, -0.046f, -0.404f, -0.097f, -0.583f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.189f, -0.54f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.242f, -0.55f)
                lineToRelative(-0.018f, -0.036f)
                lineToRelative(-0.005f, -0.01f)
                lineToRelative(-0.001f, -0.003f)
                verticalLineToRelative(-0.001f)
                lineTo(9.5f, 18.0f)
                lineToRelative(0.447f, -0.224f)
                lineToRelative(-0.447f, -0.894f)
                close()
            }
        }
            .build()
        return _cloudDropsSmall!!
    }

private var _cloudDropsSmall: ImageVector? = null
