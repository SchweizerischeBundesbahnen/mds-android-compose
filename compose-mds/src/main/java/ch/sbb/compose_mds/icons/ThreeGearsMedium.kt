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

public val SBBIcons.ThreeGearsMedium: ImageVector
    get() {
        if (_threeGearsMedium != null) {
            return _threeGearsMedium!!
        }
        _threeGearsMedium = Builder(name = "ThreeGearsMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.75f, 32.25f)
                curveToRelative(0.0f, -3.888f, -3.112f, -7.0f, -7.0f, -7.0f)
                curveToRelative(-0.14f, 0.0f, -0.252f, 0.015f, -0.391f, 0.035f)
                curveToRelative(-0.087f, 0.011f, -0.186f, 0.025f, -0.31f, 0.037f)
                lineToRelative(-0.099f, -0.995f)
                quadToRelative(0.077f, -0.008f, 0.185f, -0.023f)
                curveToRelative(0.18f, -0.023f, 0.41f, -0.054f, 0.615f, -0.054f)
                curveToRelative(4.44f, 0.0f, 8.0f, 3.56f, 8.0f, 8.0f)
                curveToRelative(0.0f, 0.205f, -0.03f, 0.435f, -0.055f, 0.615f)
                quadToRelative(-0.014f, 0.108f, -0.022f, 0.185f)
                lineToRelative(-0.995f, -0.1f)
                curveToRelative(0.012f, -0.123f, 0.025f, -0.222f, 0.037f, -0.309f)
                curveToRelative(0.02f, -0.14f, 0.035f, -0.25f, 0.035f, -0.391f)
                moveToRelative(-7.0f, -2.5f)
                curveToRelative(1.407f, 0.0f, 2.5f, 1.093f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.208f, -0.033f, 0.414f, -0.087f, 0.629f)
                lineToRelative(0.97f, 0.242f)
                curveToRelative(0.066f, -0.266f, 0.117f, -0.556f, 0.117f, -0.871f)
                curveToRelative(0.0f, -1.96f, -1.54f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.315f, 0.0f, -0.606f, 0.05f, -0.871f, 0.117f)
                lineToRelative(0.242f, 0.97f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 0.629f, -0.087f)
            }
        }
        .build()
        return _threeGearsMedium!!
    }

private var _threeGearsMedium: ImageVector? = null
