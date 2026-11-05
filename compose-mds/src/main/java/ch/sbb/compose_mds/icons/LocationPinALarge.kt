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

public val SBBIcons.LocationPinALarge: ImageVector
    get() {
        if (_locationPinALarge != null) {
            return _locationPinALarge!!
        }
        _locationPinALarge = Builder(
            name = "LocationPinALarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(23.5f, 8.004f)
                curveToRelative(6.35f, 0.0f, 11.5f, 5.148f, 11.5f, 11.5f)
                verticalLineToRelative(0.005f)
                curveToRelative(-0.02f, 1.907f, -0.618f, 3.607f, -1.533f, 5.213f)
                lineToRelative(-0.006f, 0.01f)
                lineToRelative(-0.007f, 0.01f)
                lineToRelative(-9.502f, 14.997f)
                lineToRelative(-0.422f, 0.667f)
                lineToRelative(-0.423f, -0.667f)
                lineToRelative(-9.5f, -14.998f)
                lineToRelative(-0.006f, -0.01f)
                curveToRelative(-0.935f, -1.559f, -1.523f, -3.226f, -1.601f, -5.208f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.0f, -6.351f, 5.148f, -11.5f, 11.5f, -11.5f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-5.795f, 0.0f, -10.493f, 4.693f, -10.5f, 10.486f)
                curveToRelative(0.071f, 1.787f, 0.598f, 3.29f, 1.459f, 4.727f)
                lineToRelative(9.07f, 14.32f)
                lineToRelative(9.076f, -14.325f)
                curveToRelative(0.85f, -1.497f, 1.377f, -3.023f, 1.395f, -4.708f)
                curveToRelative(0.0f, -5.8f, -4.702f, -10.5f, -10.5f, -10.5f)
                moveToRelative(6.502f, 16.507f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(-1.557f, -4.286f)
                horizontalLineToRelative(-5.859f)
                lineToRelative(-1.594f, 4.286f)
                horizontalLineToRelative(-1.948f)
                lineToRelative(5.48f, -14.014f)
                horizontalLineToRelative(2.072f)
                close()
                moveTo(21.07f, 19.734f)
                horizontalLineToRelative(4.782f)
                lineToRelative(-2.386f, -6.434f)
                close()
            }
        }
            .build()
        return _locationPinALarge!!
    }

private var _locationPinALarge: ImageVector? = null
