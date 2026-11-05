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

public val SBBIcons.ServiceBellLarge: ImageVector
    get() {
        if (_serviceBellLarge != null) {
            return _serviceBellLarge!!
        }
        _serviceBellLarge = Builder(name = "ServiceBellLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, 37.999f)
                lineTo(8.0f, 37.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(33.0f)
                close()
                moveTo(39.0f, 35.0f)
                lineTo(10.0f, 35.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(29.0f)
                close()
                moveTo(30.96f, 9.999f)
                lineTo(25.0f, 9.999f)
                verticalLineToRelative(3.007f)
                curveToRelative(2.85f, 0.08f, 5.104f, 0.846f, 6.875f, 2.07f)
                curveToRelative(1.87f, 1.292f, 3.17f, 3.071f, 4.071f, 5.015f)
                curveToRelative(1.796f, 3.871f, 2.044f, 8.465f, 2.054f, 11.406f)
                lineToRelative(0.002f, 0.502f)
                lineTo(11.0f, 31.999f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.943f, 0.248f, -7.536f, 2.047f, -11.408f)
                curveToRelative(0.903f, -1.944f, 2.204f, -3.723f, 4.075f, -5.015f)
                curveToRelative(1.773f, -1.223f, 4.027f, -1.99f, 6.878f, -2.07f)
                lineTo(24.0f, 9.999f)
                horizontalLineToRelative(-6.04f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(24.5f, 13.999f)
                curveToRelative(-2.911f, 0.0f, -5.122f, 0.735f, -6.81f, 1.9f)
                curveToRelative(-1.69f, 1.168f, -2.89f, 2.79f, -3.737f, 4.613f)
                curveToRelative(-1.607f, 3.459f, -1.917f, 7.582f, -1.947f, 10.487f)
                horizontalLineToRelative(24.986f)
                curveToRelative(-0.038f, -2.906f, -0.348f, -7.028f, -1.953f, -10.487f)
                curveToRelative(-0.846f, -1.824f, -2.043f, -3.446f, -3.732f, -4.614f)
                curveTo(29.62f, 14.733f, 27.41f, 14.0f, 24.5f, 14.0f)
                moveToRelative(-1.937f, 4.497f)
                curveToRelative(-1.864f, 0.233f, -3.488f, 1.16f, -4.656f, 2.795f)
                curveTo(16.734f, 22.934f, 16.0f, 25.323f, 16.0f, 28.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.323f, 0.766f, -5.934f, 2.093f, -7.791f)
                curveToRelative(1.332f, -1.865f, 3.208f, -2.938f, 5.345f, -3.205f)
                close()
            }
        }
        .build()
        return _serviceBellLarge!!
    }

private var _serviceBellLarge: ImageVector? = null
