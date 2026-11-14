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
                moveTo(16.5f, 6.0f)
                curveTo(17.915f, 6.0f, 19.0f, 7.085f, 19.0f, 8.5f)
                curveToRelative(0.0f, 1.021f, -0.564f, 1.865f, -1.402f, 2.26f)
                arcToRelative(2.048f, 2.048f, 0.0f, false, false, -1.286f, -0.903f)
                curveToRelative(0.125f, -0.805f, -0.003f, -1.533f, -0.322f, -2.14f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -1.065f, -1.18f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 6.0f)
                moveToRelative(-2.56f, 0.086f)
                arcTo(3.49f, 3.49f, 0.0f, false, true, 16.5f, 5.0f)
                curveTo(18.467f, 5.0f, 20.0f, 6.533f, 20.0f, 8.5f)
                curveToRelative(0.0f, 1.44f, -0.823f, 2.654f, -2.046f, 3.197f)
                quadToRelative(0.06f, 0.351f, 0.03f, 0.707f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, true, -0.826f, 1.783f)
                curveToRelative(-0.512f, 0.5f, -1.24f, 0.814f, -2.158f, 0.814f)
                lineTo(8.0f, 15.001f)
                curveToRelative(-0.954f, 0.0f, -1.693f, -0.31f, -2.201f, -0.82f)
                curveToRelative(-0.502f, -0.506f, -0.736f, -1.169f, -0.764f, -1.81f)
                curveToRelative(-0.027f, -0.636f, 0.147f, -1.286f, 0.507f, -1.79f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.145f, -0.816f)
                curveToRelative(0.093f, -1.85f, 2.005f, -2.892f, 3.521f, -2.174f)
                curveToRelative(0.887f, -1.444f, 2.42f, -1.867f, 3.732f, -1.505f)
                moveToRelative(-3.083f, 2.416f)
                curveToRelative(0.636f, -1.44f, 1.95f, -1.774f, 2.998f, -1.394f)
                curveToRelative(0.53f, 0.192f, 0.984f, 0.566f, 1.25f, 1.073f)
                curveToRelative(0.262f, 0.501f, 0.357f, 1.165f, 0.116f, 1.977f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.699f, -0.028f)
                curveToRelative(0.464f, -0.018f, 0.778f, 0.16f, 0.98f, 0.42f)
                curveToRelative(0.212f, 0.275f, 0.323f, 0.674f, 0.287f, 1.102f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -0.528f, 1.15f)
                curveToRelative(-0.31f, 0.303f, -0.78f, 0.529f, -1.459f, 0.529f)
                lineTo(8.0f, 14.001f)
                curveToRelative(-0.73f, 0.0f, -1.199f, -0.23f, -1.491f, -0.525f)
                curveToRelative(-0.299f, -0.3f, -0.456f, -0.713f, -0.475f, -1.147f)
                curveToRelative(-0.019f, -0.438f, 0.105f, -0.863f, 0.321f, -1.165f)
                curveToRelative(0.211f, -0.295f, 0.497f, -0.463f, 0.845f, -0.463f)
                horizontalLineToRelative(0.564f)
                lineToRelative(-0.068f, -0.56f)
                curveToRelative(-0.18f, -1.502f, 1.42f, -2.246f, 2.387f, -1.454f)
                lineToRelative(0.509f, 0.417f)
                close()
                moveTo(7.697f, 10.142f)
                lineTo(7.2f, 10.2f)
                lineTo(7.2f, 10.2f)
                close()
            }
        }
        .build()
        return _cloudSunSmall!!
    }

private var _cloudSunSmall: ImageVector? = null
