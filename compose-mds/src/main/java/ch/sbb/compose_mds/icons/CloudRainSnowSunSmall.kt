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

public val SBBIcons.CloudRainSnowSunSmall: ImageVector
    get() {
        if (_cloudRainSnowSunSmall != null) {
            return _cloudRainSnowSunSmall!!
        }
        _cloudRainSnowSunSmall = Builder(name = "CloudRainSnowSunSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 4.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 8.5f)
                curveTo(19.0f, 7.085f, 17.915f, 6.0f, 16.5f, 6.0f)
                curveToRelative(-0.608f, 0.0f, -1.152f, 0.2f, -1.575f, 0.537f)
                curveToRelative(0.436f, 0.292f, 0.809f, 0.69f, 1.066f, 1.18f)
                curveToRelative(0.318f, 0.607f, 0.446f, 1.335f, 0.32f, 2.14f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.292f, 0.9f)
                curveTo(18.438f, 10.362f, 19.0f, 9.52f, 19.0f, 8.5f)
                moveTo(16.5f, 5.0f)
                curveToRelative(-1.016f, 0.0f, -1.924f, 0.41f, -2.56f, 1.086f)
                curveToRelative(-1.311f, -0.362f, -2.845f, 0.061f, -3.732f, 1.505f)
                curveToRelative(-1.515f, -0.718f, -3.427f, 0.324f, -3.52f, 2.174f)
                curveToRelative(-0.482f, 0.128f, -0.871f, 0.433f, -1.146f, 0.816f)
                curveToRelative(-0.36f, 0.504f, -0.534f, 1.154f, -0.507f, 1.79f)
                curveToRelative(0.028f, 0.641f, 0.263f, 1.304f, 0.764f, 1.81f)
                curveToRelative(0.508f, 0.51f, 1.247f, 0.82f, 2.201f, 0.82f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.927f, 0.0f, 1.66f, -0.312f, 2.175f, -0.813f)
                arcTo(2.8f, 2.8f, 0.0f, false, false, 18.0f, 12.402f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.034f, -0.71f)
                curveTo(19.182f, 11.145f, 20.0f, 9.935f, 20.0f, 8.5f)
                curveTo(20.0f, 6.533f, 18.467f, 5.0f, 16.5f, 5.0f)
                moveToRelative(-2.645f, 2.108f)
                curveToRelative(-1.048f, -0.38f, -2.362f, -0.045f, -2.997f, 1.394f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-0.967f, -0.792f, -2.566f, -0.048f, -2.386f, 1.454f)
                lineTo(7.2f, 10.2f)
                lineToRelative(0.497f, -0.059f)
                lineToRelative(0.067f, 0.56f)
                lineTo(7.2f, 10.701f)
                curveToRelative(-0.348f, 0.0f, -0.634f, 0.168f, -0.844f, 0.463f)
                curveToRelative(-0.217f, 0.303f, -0.34f, 0.727f, -0.322f, 1.165f)
                curveToRelative(0.02f, 0.434f, 0.176f, 0.846f, 0.475f, 1.147f)
                curveToRelative(0.292f, 0.295f, 0.762f, 0.524f, 1.491f, 0.524f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.692f, 0.0f, 1.167f, -0.227f, 1.478f, -0.529f)
                curveToRelative(0.316f, -0.308f, 0.492f, -0.724f, 0.525f, -1.147f)
                curveToRelative(0.033f, -0.427f, -0.08f, -0.826f, -0.296f, -1.102f)
                curveToRelative(-0.205f, -0.262f, -0.522f, -0.44f, -0.987f, -0.422f)
                lineToRelative(-0.698f, 0.028f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.241f, -0.812f, 0.146f, -1.476f, -0.116f, -1.977f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.073f)
                moveToRelative(-0.238f, -2.205f)
                lineToRelative(-0.693f, 0.721f)
                lineToRelative(-1.441f, -1.386f)
                lineToRelative(0.693f, -0.72f)
                close()
                moveTo(20.854f, 13.631f)
                lineTo(21.561f, 12.924f)
                lineTo(20.147f, 11.51f)
                lineTo(19.44f, 12.217f)
                close()
                moveTo(23.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.328f, 4.95f)
                lineTo(20.035f, 5.656f)
                lineTo(21.449f, 4.242f)
                lineTo(20.742f, 3.535f)
                close()
                moveTo(6.948f, 16.223f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-0.895f, -0.448f)
                lineToRelative(1.0f, -2.0f)
                close()
                moveTo(9.948f, 18.223f)
                lineTo(10.948f, 16.223f)
                lineTo(10.053f, 15.775f)
                lineTo(9.053f, 17.775f)
                close()
                moveTo(8.948f, 16.223f)
                lineTo(6.948f, 20.223f)
                lineTo(6.053f, 19.775f)
                lineTo(8.053f, 15.775f)
                close()
                moveTo(13.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(3.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _cloudRainSnowSunSmall!!
    }

private var _cloudRainSnowSunSmall: ImageVector? = null
