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

public val SBBIcons.GlobeSmall: ImageVector
    get() {
        if (_globeSmall != null) {
            return _globeSmall!!
        }
        _globeSmall = Builder(name = "GlobeSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -17.0f, 0.0f)
                moveToRelative(8.5f, -7.5f)
                quadToRelative(-0.658f, 0.001f, -1.284f, 0.11f)
                curveTo(9.544f, 5.78f, 9.026f, 7.287f, 8.742f, 9.0f)
                horizontalLineToRelative(5.517f)
                curveToRelative(-0.284f, -1.713f, -0.802f, -3.22f, -1.475f, -4.39f)
                arcTo(7.6f, 7.6f, 0.0f, false, false, 11.5f, 4.5f)
                moveToRelative(-2.589f, 0.459f)
                curveTo(8.37f, 6.127f, 7.963f, 7.5f, 7.73f, 8.999f)
                lineTo(4.624f, 8.999f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, true, 4.287f, -4.04f)
                moveToRelative(-1.31f, 5.04f)
                lineTo(4.27f, 9.999f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 4.0f, 12.0f)
                curveToRelative(0.0f, 0.693f, 0.094f, 1.363f, 0.27f, 2.0f)
                lineTo(7.6f, 14.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveToRelative(0.128f, 5.0f)
                lineTo(4.624f, 15.0f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, false, 4.287f, 4.042f)
                curveTo(8.37f, 17.873f, 7.963f, 16.5f, 7.73f, 15.0f)
                moveToRelative(1.012f, 0.0f)
                horizontalLineToRelative(5.518f)
                curveToRelative(-0.284f, 1.713f, -0.802f, 3.22f, -1.475f, 4.391f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -2.568f, 0.0f)
                curveTo(9.543f, 18.219f, 9.025f, 16.713f, 8.74f, 15.0f)
                moveToRelative(5.654f, -1.0f)
                horizontalLineToRelative(-5.79f)
                arcToRelative(18.8f, 18.8f, 0.0f, false, true, 0.0f, -4.0f)
                horizontalLineToRelative(5.79f)
                arcToRelative(18.8f, 18.8f, 0.0f, false, true, 0.0f, 4.0f)
                moveToRelative(0.876f, 1.0f)
                curveToRelative(-0.234f, 1.5f, -0.64f, 2.874f, -1.182f, 4.042f)
                arcTo(7.53f, 7.53f, 0.0f, false, false, 18.376f, 15.0f)
                close()
                moveTo(18.73f, 14.0f)
                lineTo(15.4f, 14.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -4.0f)
                horizontalLineToRelative(3.33f)
                curveToRelative(0.176f, 0.638f, 0.27f, 1.308f, 0.27f, 2.001f)
                reflectiveCurveToRelative(-0.094f, 1.363f, -0.27f, 2.0f)
                moveToRelative(-4.642f, -9.04f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, true, 4.287f, 4.04f)
                lineTo(15.27f, 9.001f)
                curveToRelative(-0.234f, -1.499f, -0.64f, -2.872f, -1.182f, -4.04f)
            }
        }
        .build()
        return _globeSmall!!
    }

private var _globeSmall: ImageVector? = null
