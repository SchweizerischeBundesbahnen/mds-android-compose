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

public val SBBIcons.CloudLightningSmall: ImageVector
    get() {
        if (_cloudLightningSmall != null) {
            return _cloudLightningSmall!!
        }
        _cloudLightningSmall = Builder(
            name = "CloudLightningSmall",
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
                moveTo(17.494f, 10.606f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, false, -1.182f, -0.75f)
                curveToRelative(0.125f, -0.805f, -0.004f, -1.532f, -0.322f, -2.14f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, -1.794f, -1.549f)
                curveToRelative(-1.363f, -0.494f, -3.042f, -0.116f, -3.987f, 1.423f)
                curveToRelative(-1.516f, -0.72f, -3.431f, 0.325f, -3.523f, 2.176f)
                curveToRelative(-0.481f, 0.128f, -0.87f, 0.431f, -1.144f, 0.815f)
                curveToRelative(-0.36f, 0.503f, -0.535f, 1.153f, -0.507f, 1.79f)
                curveToRelative(0.028f, 0.641f, 0.262f, 1.304f, 0.764f, 1.81f)
                curveTo(6.307f, 14.69f, 7.046f, 15.0f, 8.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.73f, 0.0f, -1.2f, -0.23f, -1.492f, -0.524f)
                curveToRelative(-0.298f, -0.301f, -0.455f, -0.714f, -0.474f, -1.148f)
                curveToRelative(-0.019f, -0.438f, 0.104f, -0.862f, 0.321f, -1.165f)
                curveToRelative(0.21f, -0.295f, 0.497f, -0.463f, 0.845f, -0.463f)
                horizontalLineToRelative(0.563f)
                lineToRelative(-0.066f, -0.56f)
                curveToRelative(-0.18f, -1.501f, 1.42f, -2.246f, 2.386f, -1.454f)
                lineToRelative(0.509f, 0.418f)
                lineToRelative(0.266f, -0.602f)
                curveToRelative(0.635f, -1.44f, 1.948f, -1.775f, 2.997f, -1.395f)
                curveToRelative(0.53f, 0.193f, 0.983f, 0.566f, 1.249f, 1.073f)
                curveToRelative(0.262f, 0.501f, 0.358f, 1.165f, 0.117f, 1.977f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.7f, -0.028f)
                curveToRelative(0.464f, -0.018f, 0.78f, 0.161f, 0.984f, 0.423f)
                curveToRelative(0.215f, 0.275f, 0.328f, 0.674f, 0.295f, 1.1f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.526f, 1.15f)
                curveToRelative(-0.31f, 0.302f, -0.785f, 0.528f, -1.474f, 0.528f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.925f, 0.0f, 1.658f, -0.312f, 2.172f, -0.812f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.825f, -1.786f)
                curveToRelative(0.05f, -0.636f, -0.111f, -1.293f, -0.503f, -1.796f)
                moveTo(11.5f, 13.0f)
                horizontalLineToRelative(-0.207f)
                lineToRelative(-0.147f, 0.146f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-0.853f, 0.854f)
                horizontalLineTo(10.0f)
                lineTo(8.94f, 18.415f)
                lineToRelative(-2.453f, 3.271f)
                lineToRelative(3.169f, -2.584f)
                lineToRelative(3.33f, -2.715f)
                lineToRelative(1.088f, -0.887f)
                horizontalLineToRelative(-2.366f)
                lineToRelative(1.646f, -1.646f)
                lineToRelative(0.854f, -0.854f)
                horizontalLineTo(11.5f)
                moveToRelative(-1.793f, 3.0f)
                horizontalLineToRelative(0.086f)
                lineToRelative(0.353f, -0.354f)
                lineTo(11.793f, 14.0f)
                horizontalLineToRelative(-0.086f)
                close()
            }
        }
            .build()
        return _cloudLightningSmall!!
    }

private var _cloudLightningSmall: ImageVector? = null
