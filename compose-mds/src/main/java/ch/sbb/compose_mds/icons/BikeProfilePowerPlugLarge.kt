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

public val SBBIcons.BikeProfilePowerPlugLarge: ImageVector
    get() {
        if (_bikeProfilePowerPlugLarge != null) {
            return _bikeProfilePowerPlugLarge!!
        }
        _bikeProfilePowerPlugLarge = Builder(
            name = "BikeProfilePowerPlugLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
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
                moveToRelative(27.0f, 35.997f)
                lineToRelative(4.499f, -0.008f)
                lineToRelative(0.002f, 1.0f)
                lineToRelative(-4.501f, 0.009f)
                verticalLineToRelative(3.001f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, -4.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.495f, -4.498f)
                lineToRelative(2.004f, -0.002f)
                lineToRelative(0.501f, -0.001f)
                close()
                moveTo(24.496f, 35.001f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.0f, 38.499f)
                curveToRelative(0.0f, 1.932f, 1.568f, 3.5f, 3.5f, 3.5f)
                lineTo(26.0f, 41.999f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(20.0f, 38.999f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(32.916f, 6.777f)
                lineToRelative(-3.847f, 5.769f)
                lineToRelative(1.79f, 3.935f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 33.502f, 16.0f)
                curveToRelative(4.136f, 0.0f, 7.5f, 3.364f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-3.364f, 7.5f, -7.5f, 7.5f)
                arcToRelative(7.506f, 7.506f, 0.0f, false, true, -7.5f, -7.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 3.947f, -6.605f)
                lineTo(28.178f, 13.0f)
                lineTo(17.85f, 13.0f)
                lineToRelative(-1.325f, 3.639f)
                arcTo(7.51f, 7.51f, 0.0f, false, true, 21.0f, 23.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveTo(6.0f, 27.636f, 6.0f, 23.5f)
                reflectiveCurveTo(9.364f, 16.0f, 13.5f, 16.0f)
                curveToRelative(0.724f, 0.0f, 1.424f, 0.105f, 2.087f, 0.297f)
                lineToRelative(1.443f, -3.968f)
                lineToRelative(0.12f, -0.329f)
                horizontalLineToRelative(11.082f)
                lineToRelative(3.333f, -5.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 6.0f)
                horizontalLineToRelative(8.435f)
                close()
                moveTo(13.5f, 17.0f)
                arcTo(6.51f, 6.51f, 0.0f, false, false, 7.0f, 23.5f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.916f, 6.5f, -6.5f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, false, -3.817f, -5.918f)
                lineToRelative(-2.213f, 6.089f)
                lineToRelative(-0.94f, -0.342f)
                lineToRelative(2.214f, -6.09f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 13.5f, 17.0f)
                moveToRelative(20.002f, 0.0f)
                curveToRelative(-0.782f, 0.0f, -1.533f, 0.138f, -2.228f, 0.393f)
                lineToRelative(2.683f, 5.9f)
                lineToRelative(-0.91f, 0.414f)
                lineToRelative(-2.683f, -5.898f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -3.362f, 5.691f)
                curveToRelative(0.0f, 3.584f, 2.914f, 6.5f, 6.5f, 6.5f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.916f, -6.5f, -6.5f, -6.5f)
                moveTo(19.001f, 9.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(6.001f)
                close()
            }
        }
            .build()
        return _bikeProfilePowerPlugLarge!!
    }

private var _bikeProfilePowerPlugLarge: ImageVector? = null
