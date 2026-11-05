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

public val SBBIcons.CircleSignalNoiseRatioMedium: ImageVector
    get() {
        if (_circleSignalNoiseRatioMedium != null) {
            return _circleSignalNoiseRatioMedium!!
        }
        _circleSignalNoiseRatioMedium = Builder(name = "CircleSignalNoiseRatioMedium", defaultWidth
                = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.25f)
                curveToRelative(8.146f, 0.0f, 14.75f, 6.604f, 14.75f, 14.75f)
                reflectiveCurveTo(26.146f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(3.25f, 26.146f, 3.25f, 18.0f)
                reflectiveCurveTo(9.854f, 3.25f, 18.0f, 3.25f)
                moveToRelative(0.0f, 1.0f)
                curveTo(10.406f, 4.25f, 4.25f, 10.406f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(31.75f, 25.594f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 4.25f, 18.0f, 4.25f)
                moveToRelative(-2.202f, 20.475f)
                horizontalLineToRelative(-1.634f)
                lineToRelative(4.18f, -11.3f)
                horizontalLineToRelative(1.616f)
                close()
                moveTo(10.628f, 13.211f)
                quadToRelative(1.287f, 0.0f, 2.153f, 0.51f)
                quadToRelative(1.248f, 0.733f, 1.316f, 2.367f)
                horizontalLineToRelative(-1.87f)
                quadToRelative(-0.055f, -0.659f, -0.488f, -1.005f)
                quadToRelative(-0.433f, -0.347f, -1.214f, -0.347f)
                quadToRelative(-0.694f, 0.0f, -1.08f, 0.273f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, -0.383f, 0.765f)
                quadToRelative(0.0f, 0.444f, 0.369f, 0.64f)
                quadToRelative(0.356f, 0.197f, 1.807f, 0.553f)
                quadToRelative(1.53f, 0.38f, 2.121f, 0.77f)
                quadToRelative(1.087f, 0.712f, 1.087f, 1.985f)
                quadToRelative(0.0f, 1.395f, -1.094f, 2.2f)
                quadToRelative(-0.964f, 0.707f, -2.612f, 0.707f)
                quadToRelative(-1.832f, 0.0f, -2.846f, -0.836f)
                reflectiveQuadToRelative(-1.051f, -2.379f)
                horizontalLineToRelative(1.955f)
                quadToRelative(0.042f, 0.75f, 0.387f, 1.111f)
                quadToRelative(0.54f, 0.58f, 1.628f, 0.58f)
                quadToRelative(0.739f, -0.001f, 1.17f, -0.29f)
                quadToRelative(0.484f, -0.33f, 0.484f, -0.903f)
                quadToRelative(0.0f, -0.57f, -0.683f, -0.837f)
                quadToRelative(-0.375f, -0.147f, -1.77f, -0.534f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -1.365f, -0.455f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.786f, -0.48f)
                quadToRelative(-0.689f, -0.614f, -0.688f, -1.696f)
                quadToRelative(-0.001f, -1.297f, 1.075f, -2.054f)
                quadToRelative(0.915f, -0.645f, 2.379f, -0.645f)
                moveToRelative(16.083f, 6.325f)
                lineToRelative(-0.022f, -6.11f)
                horizontalLineToRelative(1.886f)
                verticalLineToRelative(8.987f)
                horizontalLineToRelative(-1.973f)
                lineToRelative(-3.764f, -6.123f)
                lineToRelative(0.025f, 6.123f)
                horizontalLineToRelative(-1.886f)
                verticalLineToRelative(-8.987f)
                horizontalLineToRelative(1.998f)
                close()
            }
        }
        .build()
        return _circleSignalNoiseRatioMedium!!
    }

private var _circleSignalNoiseRatioMedium: ImageVector? = null
