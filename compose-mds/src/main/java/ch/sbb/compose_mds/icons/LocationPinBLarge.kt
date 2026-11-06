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

public val SBBIcons.LocationPinBLarge: ImageVector
    get() {
        if (_locationPinBLarge != null) {
            return _locationPinBLarge!!
        }
        _locationPinBLarge = Builder(name = "LocationPinBLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 8.016f)
                curveToRelative(6.35f, 0.0f, 11.5f, 5.148f, 11.5f, 11.5f)
                verticalLineToRelative(0.005f)
                curveToRelative(-0.017f, 1.908f, -0.618f, 3.608f, -1.533f, 5.213f)
                lineToRelative(-0.006f, 0.01f)
                lineToRelative(-0.007f, 0.01f)
                lineToRelative(-9.5f, 14.997f)
                lineToRelative(-0.422f, 0.668f)
                lineToRelative(-0.423f, -0.667f)
                lineToRelative(-9.5f, -14.999f)
                lineToRelative(-0.005f, -0.01f)
                curveToRelative(-0.937f, -1.558f, -1.526f, -3.225f, -1.604f, -5.207f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.0f, -6.352f, 5.148f, -11.5f, 11.5f, -11.5f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-5.795f, 0.0f, -10.493f, 4.693f, -10.5f, 10.486f)
                curveToRelative(0.071f, 1.788f, 0.598f, 3.291f, 1.46f, 4.727f)
                lineToRelative(9.071f, 14.32f)
                lineToRelative(9.074f, -14.325f)
                curveToRelative(0.851f, -1.497f, 1.38f, -3.023f, 1.395f, -4.708f)
                curveToRelative(0.0f, -5.8f, -4.702f, -10.5f, -10.5f, -10.5f)
                moveToRelative(1.072f, 4.498f)
                curveToRelative(1.23f, 0.0f, 2.13f, 0.156f, 2.692f, 0.468f)
                quadToRelative(0.777f, 0.431f, 1.23f, 1.25f)
                quadToRelative(0.454f, 0.82f, 0.454f, 1.786f)
                quadToRelative(0.0f, 1.026f, -0.496f, 1.82f)
                quadToRelative(-0.498f, 0.796f, -1.368f, 1.168f)
                quadToRelative(0.705f, 0.21f, 1.096f, 0.508f)
                quadToRelative(1.327f, 0.997f, 1.328f, 2.902f)
                quadToRelative(-0.001f, 2.497f, -1.856f, 3.592f)
                quadToRelative(-0.871f, 0.508f, -2.294f, 0.508f)
                horizontalLineToRelative(-5.86f)
                lineTo(19.498f, 13.514f)
                close()
                moveTo(21.164f, 25.906f)
                horizontalLineToRelative(3.33f)
                quadToRelative(1.725f, 0.0f, 2.322f, -0.336f)
                quadToRelative(1.018f, -0.573f, 1.018f, -2.088f)
                quadToRelative(0.0f, -1.704f, -1.372f, -2.277f)
                quadToRelative(-0.534f, -0.23f, -2.244f, -0.23f)
                horizontalLineToRelative(-3.054f)
                close()
                moveTo(21.164f, 19.48f)
                horizontalLineToRelative(3.002f)
                quadToRelative(1.235f, 0.0f, 1.822f, -0.182f)
                quadToRelative(0.587f, -0.192f, 0.936f, -0.738f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 0.35f, -1.274f)
                quadToRelative(0.0f, -0.727f, -0.304f, -1.244f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, false, -0.846f, -0.738f)
                quadToRelative(-0.456f, -0.182f, -1.794f, -0.181f)
                horizontalLineToRelative(-3.166f)
                close()
            }
        }
        .build()
        return _locationPinBLarge!!
    }

private var _locationPinBLarge: ImageVector? = null
