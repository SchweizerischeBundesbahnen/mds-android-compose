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

public val SBBIcons.AirplaneLarge: ImageVector
    get() {
        if (_airplaneLarge != null) {
            return _airplaneLarge!!
        }
        _airplaneLarge = Builder(
            name = "AirplaneLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveToRelative(22.978f, 5.35f)
                lineToRelative(4.89f, 15.649f)
                lineTo(39.5f, 20.999f)
                curveToRelative(1.118f, 0.0f, 2.01f, 0.38f, 2.618f, 1.04f)
                curveToRelative(0.602f, 0.654f, 0.882f, 1.534f, 0.882f, 2.46f)
                curveToRelative(0.0f, 0.927f, -0.28f, 1.807f, -0.882f, 2.461f)
                curveToRelative(-0.57f, 0.62f, -1.39f, 0.991f, -2.411f, 1.035f)
                lineTo(39.5f, 28.0f)
                lineToRelative(-11.633f, -0.001f)
                lineToRelative(-4.89f, 15.65f)
                lineToRelative(-0.11f, 0.35f)
                horizontalLineToRelative(-5.933f)
                lineToRelative(0.07f, -0.562f)
                lineToRelative(1.93f, -15.434f)
                horizontalLineToRelative(-7.125f)
                lineToRelative(-1.862f, 3.724f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(4.742f, 32.003f)
                lineToRelative(0.298f, -0.696f)
                lineToRelative(2.915f, -6.808f)
                lineToRelative(-2.915f, -6.803f)
                lineTo(4.742f, 17.0f)
                lineTo(9.81f, 17.0f)
                lineToRelative(0.138f, 0.276f)
                lineTo(11.81f, 21.0f)
                horizontalLineToRelative(7.125f)
                lineTo(17.002f, 5.562f)
                lineToRelative(-0.07f, -0.563f)
                horizontalLineToRelative(5.935f)
                close()
                moveTo(19.996f, 21.436f)
                lineTo(20.066f, 21.999f)
                horizontalLineToRelative(-8.875f)
                lineToRelative(-0.138f, -0.276f)
                lineToRelative(-1.862f, -3.724f)
                lineTo(6.26f, 17.999f)
                lineToRelative(2.701f, 6.303f)
                lineToRelative(0.084f, 0.197f)
                lineToRelative(-0.084f, 0.197f)
                lineToRelative(-2.701f, 6.307f)
                lineTo(9.19f, 31.003f)
                lineToRelative(1.862f, -3.724f)
                lineToRelative(0.138f, -0.276f)
                horizontalLineToRelative(8.875f)
                lineToRelative(-0.07f, 0.562f)
                lineTo(18.066f, 43.0f)
                horizontalLineToRelative(4.066f)
                lineToRelative(4.89f, -15.65f)
                lineToRelative(0.11f, -0.35f)
                horizontalLineToRelative(0.368f)
                lineToRelative(12.0f, 0.001f)
                curveToRelative(0.882f, 0.0f, 1.49f, -0.292f, 1.882f, -0.718f)
                curveToRelative(0.398f, -0.432f, 0.618f, -1.052f, 0.618f, -1.783f)
                reflectiveCurveToRelative(-0.22f, -1.35f, -0.618f, -1.782f)
                curveToRelative(-0.392f, -0.426f, -1.0f, -0.718f, -1.882f, -0.718f)
                lineTo(27.133f, 22.0f)
                lineToRelative(-0.11f, -0.35f)
                lineToRelative(-4.891f, -15.65f)
                horizontalLineToRelative(-4.068f)
                close()
                moveTo(14.0f, 25.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(39.0f, 25.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
            .build()
        return _airplaneLarge!!
    }

private var _airplaneLarge: ImageVector? = null
