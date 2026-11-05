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

public val SBBIcons.PetrolStationLarge: ImageVector
    get() {
        if (_petrolStationLarge != null) {
            return _petrolStationLarge!!
        }
        _petrolStationLarge = Builder(
            name = "PetrolStationLarge",
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
                moveTo(28.5f, 4.999f)
                curveToRelative(2.484f, 0.0f, 4.5f, 2.016f, 4.5f, 4.5f)
                lineTo(33.0f, 29.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.075f, 0.0f, 1.964f, 0.266f, 2.586f, 0.893f)
                curveToRelative(0.62f, 0.623f, 0.89f, 1.52f, 0.914f, 2.595f)
                lineTo(37.0f, 34.5f)
                lineToRelative(0.005f, 0.42f)
                curveToRelative(0.012f, 0.435f, 0.054f, 0.897f, 0.21f, 1.283f)
                curveToRelative(0.099f, 0.246f, 0.234f, 0.436f, 0.419f, 0.568f)
                curveToRelative(0.182f, 0.13f, 0.45f, 0.23f, 0.866f, 0.23f)
                curveToRelative(0.42f, 0.0f, 0.692f, -0.1f, 0.875f, -0.227f)
                curveToRelative(0.184f, -0.128f, 0.32f, -0.315f, 0.417f, -0.555f)
                curveToRelative(0.206f, -0.507f, 0.211f, -1.155f, 0.208f, -1.715f)
                lineTo(40.0f, 16.68f)
                lineToRelative(-4.884f, -5.86f)
                lineToRelative(0.768f, -0.641f)
                lineToRelative(5.0f, 6.0f)
                lineToRelative(0.116f, 0.14f)
                verticalLineToRelative(18.177f)
                lineToRelative(-0.002f, 0.447f)
                curveToRelative(-0.01f, 0.495f, -0.06f, 1.11f, -0.28f, 1.65f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.772f, 1.0f)
                curveToRelative(-0.38f, 0.265f, -0.862f, 0.406f, -1.446f, 0.406f)
                curveToRelative(-0.585f, 0.0f, -1.066f, -0.144f, -1.446f, -0.415f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, true, -0.767f, -1.009f)
                curveToRelative(-0.292f, -0.725f, -0.286f, -1.575f, -0.287f, -2.075f)
                verticalLineToRelative(-1.99f)
                lineToRelative(-0.018f, -0.336f)
                curveToRelative(-0.063f, -0.749f, -0.282f, -1.252f, -0.606f, -1.578f)
                curveToRelative(-0.367f, -0.37f, -0.955f, -0.597f, -1.876f, -0.597f)
                lineTo(33.0f, 29.999f)
                verticalLineToRelative(12.999f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 43.998f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-33.5f)
                curveToRelative(0.0f, -2.484f, 2.016f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(14.5f, 5.999f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(33.5f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-33.5f)
                curveToRelative(0.0f, -1.932f, -1.568f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.5f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(7.5f, -5.0f)
                lineTo(14.0f, 20.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(15.0f, 19.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-7.0f)
                lineTo(15.0f, 12.0f)
                close()
                moveTo(27.0f, 16.0f)
                lineTo(16.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
            .build()
        return _petrolStationLarge!!
    }

private var _petrolStationLarge: ImageVector? = null
