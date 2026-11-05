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

public val SBBIcons.MicroscooterProfilePowerPlugMedium: ImageVector
    get() {
        if (_microscooterProfilePowerPlugMedium != null) {
            return _microscooterProfilePowerPlugMedium!!
        }
        _microscooterProfilePowerPlugMedium = Builder(
            name = "MicroscooterProfilePowerPlugMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(26.749f, 20.749f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.205f, 0.0f, -4.0f, 1.795f, -4.0f, 4.0f)
                verticalLineToRelative(0.5f)
                lineTo(11.737f, 25.249f)
                quadToRelative(0.013f, 0.124f, 0.013f, 0.25f)
                arcTo(2.753f, 2.753f, 0.0f, false, true, 9.0f, 28.249f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, -2.75f, -2.75f)
                arcTo(2.753f, 2.753f, 0.0f, false, true, 9.0f, 22.749f)
                curveToRelative(1.066f, 0.0f, 1.99f, 0.61f, 2.446f, 1.5f)
                horizontalLineToRelative(9.828f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, true, 4.475f, -4.476f)
                lineTo(25.749f, 8.75f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.75f)
                close()
                moveTo(27.0f, 22.749f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, 2.75f, 2.75f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, -2.75f, 2.75f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, -2.75f, -2.75f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, 2.75f, -2.75f)
                moveToRelative(-18.0f, 1.0f)
                curveToRelative(-0.964f, 0.0f, -1.75f, 0.786f, -1.75f, 1.75f)
                reflectiveCurveToRelative(0.786f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.786f, 1.75f, -1.75f)
                reflectiveCurveToRelative(-0.786f, -1.75f, -1.75f, -1.75f)
                moveToRelative(18.0f, 0.0f)
                curveToRelative(-0.964f, 0.0f, -1.75f, 0.786f, -1.75f, 1.75f)
                reflectiveCurveToRelative(0.786f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.786f, 1.75f, -1.75f)
                reflectiveCurveToRelative(-0.786f, -1.75f, -1.75f, -1.75f)
                moveTo(17.0f, 12.997f)
                lineToRelative(3.249f, -0.006f)
                lineToRelative(0.002f, 1.0f)
                lineToRelative(-3.251f, 0.006f)
                lineTo(17.0f, 16.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(1.0f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.464f, -3.0f)
                lineTo(6.75f, 15.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.786f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.46f, -2.998f)
                lineToRelative(1.503f, -0.002f)
                lineToRelative(0.501f, -0.001f)
                close()
                moveTo(14.997f, 12.501f)
                arcTo(2.498f, 2.498f, 0.0f, true, false, 15.0f, 17.499f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
            .build()
        return _microscooterProfilePowerPlugMedium!!
    }

private var _microscooterProfilePowerPlugMedium: ImageVector? = null
