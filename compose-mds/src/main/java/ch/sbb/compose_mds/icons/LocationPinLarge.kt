package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.LocationPinLarge: ImageVector
    get() {
        if (_locationPinLarge != null) {
            return _locationPinLarge!!
        }
        _locationPinLarge = Builder(name = "LocationPinLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.469f, 7.029f)
                curveToRelative(6.35f, 0.0f, 11.5f, 5.148f, 11.5f, 11.5f)
                verticalLineToRelative(0.005f)
                curveToRelative(-0.017f, 1.91f, -0.618f, 3.61f, -1.533f, 5.215f)
                lineToRelative(-0.006f, 0.01f)
                lineToRelative(-0.007f, 0.01f)
                lineToRelative(-9.5f, 14.995f)
                lineToRelative(-0.422f, 0.667f)
                lineToRelative(-0.423f, -0.667f)
                lineToRelative(-9.5f, -14.996f)
                lineToRelative(-0.005f, -0.01f)
                curveToRelative(-0.937f, -1.56f, -1.526f, -3.227f, -1.604f, -5.21f)
                verticalLineToRelative(-0.019f)
                curveToRelative(0.0f, -6.352f, 5.148f, -11.5f, 11.5f, -11.5f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-5.795f, 0.0f, -10.493f, 4.693f, -10.5f, 10.486f)
                curveToRelative(0.071f, 1.787f, 0.598f, 3.291f, 1.46f, 4.729f)
                lineTo(24.5f, 37.562f)
                lineToRelative(9.074f, -14.323f)
                curveToRelative(0.851f, -1.497f, 1.38f, -3.023f, 1.395f, -4.71f)
                curveToRelative(0.0f, -5.8f, -4.702f, -10.5f, -10.5f, -10.5f)
                moveToRelative(0.015f, 2.984f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 0.0f, 15.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 0.0f, -15.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.001f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
            }
        }
        .build()
        return _locationPinLarge!!
    }

private var _locationPinLarge: ImageVector? = null
