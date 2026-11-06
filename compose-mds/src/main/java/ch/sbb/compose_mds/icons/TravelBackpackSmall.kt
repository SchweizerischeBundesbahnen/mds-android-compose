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

public val SBBIcons.TravelBackpackSmall: ImageVector
    get() {
        if (_travelBackpackSmall != null) {
            return _travelBackpackSmall!!
        }
        _travelBackpackSmall = Builder(name = "TravelBackpackSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.501f, 3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 5.0f, 3.501f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.276f, 0.223f, 0.499f, 0.499f, 0.499f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(9.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 3.0f)
                close()
                moveTo(16.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(4.0f, 3.501f)
                curveTo(4.0f, 2.672f, 4.672f, 2.0f, 5.501f, 2.0f)
                lineTo(18.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 3.5f)
                verticalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 8.0f)
                lineTo(18.0f, 8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(0.087f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 1.797f, 0.59f)
                curveToRelative(0.63f, 0.453f, 1.116f, 1.198f, 1.116f, 2.31f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.293f, -0.117f, 0.573f, -0.325f, 0.78f)
                lineToRelative(-0.352f, -0.356f)
                lineToRelative(0.352f, 0.355f)
                curveToRelative(-0.208f, 0.206f, -0.489f, 0.321f, -0.78f, 0.321f)
                lineTo(4.105f, 22.0f)
                curveToRelative(-0.291f, 0.0f, -0.572f, -0.115f, -0.78f, -0.32f)
                arcTo(1.1f, 1.1f, 0.0f, false, true, 3.0f, 20.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.77f, 0.309f, -1.509f, 0.857f, -2.052f)
                arcTo(2.93f, 2.93f, 0.0f, false, true, 5.921f, 15.0f)
                lineTo(6.0f, 15.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(-0.501f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 6.501f)
                close()
                moveTo(7.0f, 8.0f)
                verticalLineToRelative(1.808f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 2.19f, 1.583f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 2.31f, 0.59f)
                lineTo(11.5f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.982f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 2.31f, -0.591f)
                arcTo(6.8f, 6.8f, 0.0f, false, false, 17.0f, 9.808f)
                lineTo(17.0f, 8.0f)
                close()
                moveTo(17.0f, 11.185f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, true, -4.5f, 1.799f)
                lineTo(12.5f, 14.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.016f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 7.0f, 11.185f)
                lineTo(7.0f, 21.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineToRelative(1.895f)
                quadToRelative(0.045f, -0.002f, 0.076f, -0.03f)
                quadToRelative(0.029f, -0.031f, 0.029f, -0.07f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.777f, -0.32f, -1.225f, -0.7f, -1.497f)
                curveToRelative(-0.402f, -0.29f, -0.9f, -0.397f, -1.226f, -0.403f)
                lineTo(18.0f, 16.0f)
                close()
                moveTo(6.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-0.079f)
                curveToRelative(-0.51f, 0.0f, -1.0f, 0.201f, -1.36f, 0.558f)
                reflectiveCurveTo(4.0f, 17.398f, 4.0f, 17.9f)
                verticalLineToRelative(3.0f)
                quadToRelative(0.0f, 0.039f, 0.03f, 0.07f)
                quadToRelative(0.03f, 0.029f, 0.075f, 0.03f)
                close()
            }
        }
        .build()
        return _travelBackpackSmall!!
    }

private var _travelBackpackSmall: ImageVector? = null
