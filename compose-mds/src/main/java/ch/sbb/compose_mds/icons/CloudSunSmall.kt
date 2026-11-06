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

public val SBBIcons.CloudSunSmall: ImageVector
    get() {
        if (_cloudSunSmall != null) {
            return _cloudSunSmall!!
        }
        _cloudSunSmall = Builder(name = "CloudSunSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.924f, 6.536f)
                curveToRelative(0.437f, 0.293f, 0.81f, 0.69f, 1.066f, 1.18f)
                curveToRelative(0.318f, 0.609f, 0.447f, 1.336f, 0.322f, 2.14f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, 1.285f, 0.904f)
                curveTo(18.435f, 10.366f, 19.0f, 9.52f, 19.0f, 8.5f)
                curveTo(19.0f, 7.085f, 17.915f, 6.0f, 16.5f, 6.0f)
                curveToRelative(-0.609f, 0.0f, -1.153f, 0.2f, -1.576f, 0.536f)
                moveToRelative(3.03f, 5.16f)
                curveToRelative(0.04f, 0.233f, 0.05f, 0.472f, 0.03f, 0.708f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, true, -0.826f, 1.784f)
                curveToRelative(-0.512f, 0.5f, -1.24f, 0.812f, -2.158f, 0.812f)
                horizontalLineTo(8.0f)
                curveToRelative(-0.954f, 0.0f, -1.693f, -0.308f, -2.201f, -0.82f)
                curveToRelative(-0.502f, -0.505f, -0.736f, -1.167f, -0.764f, -1.808f)
                curveToRelative(-0.028f, -0.637f, 0.147f, -1.287f, 0.507f, -1.79f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.144f, -0.815f)
                curveToRelative(0.092f, -1.851f, 2.006f, -2.896f, 3.522f, -2.177f)
                curveToRelative(0.888f, -1.443f, 2.421f, -1.865f, 3.733f, -1.504f)
                arcTo(3.48f, 3.48f, 0.0f, false, true, 16.5f, 5.0f)
                curveTo(18.467f, 5.0f, 20.0f, 6.533f, 20.0f, 8.5f)
                curveToRelative(0.0f, 1.44f, -0.823f, 2.654f, -2.046f, 3.196f)
                moveToRelative(-7.096f, -3.194f)
                curveToRelative(0.635f, -1.44f, 1.948f, -1.774f, 2.997f, -1.394f)
                curveToRelative(0.53f, 0.192f, 0.983f, 0.566f, 1.249f, 1.073f)
                curveToRelative(0.262f, 0.5f, 0.358f, 1.165f, 0.117f, 1.977f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.7f, -0.028f)
                curveToRelative(0.464f, -0.019f, 0.777f, 0.16f, 0.978f, 0.42f)
                curveToRelative(0.213f, 0.275f, 0.324f, 0.674f, 0.288f, 1.101f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -0.528f, 1.152f)
                curveToRelative(-0.31f, 0.302f, -0.78f, 0.527f, -1.459f, 0.527f)
                horizontalLineTo(8.0f)
                curveToRelative(-0.73f, 0.0f, -1.2f, -0.23f, -1.492f, -0.524f)
                curveToRelative(-0.298f, -0.3f, -0.455f, -0.713f, -0.474f, -1.147f)
                curveToRelative(-0.019f, -0.438f, 0.104f, -0.863f, 0.321f, -1.166f)
                curveToRelative(0.21f, -0.294f, 0.497f, -0.463f, 0.845f, -0.463f)
                horizontalLineToRelative(0.563f)
                lineToRelative(-0.066f, -0.559f)
                curveToRelative(-0.18f, -1.502f, 1.419f, -2.246f, 2.386f, -1.454f)
                lineToRelative(0.51f, 0.417f)
                close()
            }
        }
        .build()
        return _cloudSunSmall!!
    }

private var _cloudSunSmall: ImageVector? = null
