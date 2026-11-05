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

public val SBBIcons.CloudSnowSmall: ImageVector
    get() {
        if (_cloudSnowSmall != null) {
            return _cloudSnowSmall!!
        }
        _cloudSnowSmall = Builder(name = "CloudSnowSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.494f, 10.606f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, -1.182f, -0.75f)
                curveToRelative(0.125f, -0.804f, -0.004f, -1.532f, -0.322f, -2.14f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, -1.794f, -1.548f)
                curveToRelative(-1.363f, -0.495f, -3.042f, -0.116f, -3.988f, 1.422f)
                curveToRelative(-1.516f, -0.719f, -3.43f, 0.326f, -3.522f, 2.176f)
                curveToRelative(-0.481f, 0.129f, -0.87f, 0.432f, -1.144f, 0.815f)
                curveToRelative(-0.36f, 0.504f, -0.535f, 1.154f, -0.507f, 1.791f)
                curveToRelative(0.028f, 0.64f, 0.262f, 1.303f, 0.764f, 1.809f)
                curveToRelative(0.508f, 0.511f, 1.247f, 0.82f, 2.201f, 0.82f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.926f, 0.0f, 1.66f, -0.312f, 2.174f, -0.813f)
                arcTo(2.8f, 2.8f, 0.0f, false, false, 18.0f, 12.402f)
                curveToRelative(0.05f, -0.636f, -0.112f, -1.293f, -0.505f, -1.796f)
                moveToRelative(-6.636f, -2.104f)
                curveToRelative(0.635f, -1.44f, 1.948f, -1.774f, 2.997f, -1.394f)
                curveToRelative(0.53f, 0.192f, 0.983f, 0.566f, 1.249f, 1.073f)
                curveToRelative(0.262f, 0.5f, 0.358f, 1.165f, 0.117f, 1.977f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.7f, -0.028f)
                curveToRelative(0.464f, -0.019f, 0.78f, 0.16f, 0.985f, 0.422f)
                curveToRelative(0.216f, 0.276f, 0.33f, 0.675f, 0.296f, 1.102f)
                curveToRelative(-0.033f, 0.423f, -0.209f, 0.84f, -0.525f, 1.148f)
                curveToRelative(-0.31f, 0.302f, -0.786f, 0.528f, -1.477f, 0.528f)
                horizontalLineTo(8.0f)
                curveToRelative(-0.73f, 0.0f, -1.2f, -0.23f, -1.492f, -0.524f)
                curveToRelative(-0.298f, -0.3f, -0.455f, -0.713f, -0.474f, -1.148f)
                curveToRelative(-0.019f, -0.437f, 0.104f, -0.862f, 0.321f, -1.165f)
                curveToRelative(0.21f, -0.294f, 0.497f, -0.463f, 0.845f, -0.463f)
                horizontalLineToRelative(0.563f)
                lineToRelative(-0.066f, -0.56f)
                curveToRelative(-0.18f, -1.5f, 1.419f, -2.245f, 2.386f, -1.453f)
                lineToRelative(0.51f, 0.417f)
                close()
                moveTo(13.5f, 17.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-3.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-5.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(3.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _cloudSnowSmall!!
    }

private var _cloudSnowSmall: ImageVector? = null
