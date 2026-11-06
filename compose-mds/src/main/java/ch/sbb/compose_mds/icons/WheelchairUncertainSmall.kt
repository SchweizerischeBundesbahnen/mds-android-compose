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

public val SBBIcons.WheelchairUncertainSmall: ImageVector
    get() {
        if (_wheelchairUncertainSmall != null) {
            return _wheelchairUncertainSmall!!
        }
        _wheelchairUncertainSmall = Builder(name = "WheelchairUncertainSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.019f, 5.378f)
                curveToRelative(1.153f, -0.566f, 2.573f, -0.5f, 3.725f, 0.061f)
                lineToRelative(0.008f, 0.004f)
                lineToRelative(0.008f, 0.005f)
                curveToRelative(0.747f, 0.398f, 1.41f, 1.126f, 1.622f, 2.065f)
                curveToRelative(0.218f, 0.961f, -0.055f, 2.054f, -1.01f, 3.12f)
                lineToRelative(-0.009f, 0.01f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-1.488f, 1.49f)
                curveToRelative(-0.433f, 0.492f, -0.632f, 0.85f, -0.737f, 1.23f)
                curveToRelative(-0.111f, 0.404f, -0.128f, 0.87f, -0.128f, 1.627f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.74f, 0.012f, -1.339f, 0.164f, -1.893f)
                curveToRelative(0.16f, -0.576f, 0.458f, -1.067f, 0.96f, -1.638f)
                lineToRelative(0.011f, -0.012f)
                lineToRelative(0.011f, -0.01f)
                lineToRelative(1.49f, -1.49f)
                curveToRelative(0.774f, -0.87f, 0.903f, -1.638f, 0.77f, -2.223f)
                curveToRelative(-0.137f, -0.607f, -0.577f, -1.113f, -1.108f, -1.4f)
                curveToRelative(-0.91f, -0.44f, -1.998f, -0.471f, -2.839f, -0.059f)
                curveTo(15.65f, 6.673f, 15.0f, 7.517f, 15.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.825f, 0.832f, -3.04f, 2.019f, -3.622f)
                moveTo(6.0f, 13.5f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(6.0f, 14.0f)
                close()
                moveTo(2.0f, 14.5f)
                curveToRelative(0.0f, -1.748f, 1.01f, -3.27f, 2.471f, -4.013f)
                lineToRelative(0.454f, 0.892f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 3.0f, 14.5f)
                curveTo(3.0f, 16.423f, 4.577f, 18.0f, 6.5f, 18.0f)
                curveToRelative(1.39f, 0.0f, 2.604f, -0.827f, 3.167f, -2.018f)
                lineToRelative(0.904f, 0.427f)
                arcTo(4.51f, 4.51f, 0.0f, false, true, 6.5f, 19.0f)
                arcTo(4.514f, 4.514f, 0.0f, false, true, 2.0f, 14.5f)
                moveToRelative(15.045f, 2.498f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.5f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _wheelchairUncertainSmall!!
    }

private var _wheelchairUncertainSmall: ImageVector? = null
