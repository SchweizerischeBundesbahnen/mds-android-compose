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

public val SBBIcons.AirplaneMedium: ImageVector
    get() {
        if (_airplaneMedium != null) {
            return _airplaneMedium!!
        }
        _airplaneMedium = Builder(name = "AirplaneMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.75f, 17.999f)
                curveToRelative(0.0f, -0.523f, -0.158f, -0.955f, -0.43f, -1.252f)
                curveToRelative(-0.267f, -0.29f, -0.689f, -0.498f, -1.32f, -0.498f)
                horizontalLineToRelative(-9.367f)
                lineToRelative(-0.11f, -0.35f)
                lineToRelative(-3.641f, -11.65f)
                horizontalLineToRelative(-2.817f)
                lineToRelative(1.431f, 11.438f)
                lineToRelative(0.07f, 0.562f)
                horizontalLineTo(8.691f)
                lineToRelative(-0.138f, -0.276f)
                lineToRelative(-1.362f, -2.724f)
                horizontalLineTo(5.26f)
                lineToRelative(1.95f, 4.553f)
                lineToRelative(0.085f, 0.197f)
                lineToRelative(-0.084f, 0.197f)
                lineToRelative(-1.951f, 4.556f)
                horizontalLineTo(7.19f)
                lineToRelative(1.362f, -2.724f)
                lineToRelative(0.138f, -0.276f)
                horizontalLineToRelative(6.875f)
                lineToRelative(-0.07f, 0.563f)
                lineToRelative(-1.43f, 11.434f)
                horizontalLineToRelative(2.816f)
                lineToRelative(3.64f, -11.65f)
                lineToRelative(0.11f, -0.35f)
                horizontalLineTo(21.0f)
                lineToRelative(9.0f, 0.001f)
                curveToRelative(0.632f, 0.0f, 1.053f, -0.209f, 1.32f, -0.498f)
                curveToRelative(0.272f, -0.296f, 0.43f, -0.729f, 0.43f, -1.253f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.72f, -0.217f, 1.413f, -0.694f, 1.93f)
                curveToRelative(-0.423f, 0.46f, -1.015f, 0.744f, -1.739f, 0.807f)
                lineTo(30.0f, 20.75f)
                lineToRelative(-8.633f, -0.001f)
                lineToRelative(-3.64f, 11.65f)
                lineToRelative(-0.11f, 0.35f)
                horizontalLineToRelative(-4.683f)
                lineToRelative(0.07f, -0.562f)
                lineToRelative(1.43f, -11.435f)
                horizontalLineTo(9.309f)
                lineToRelative(-1.362f, 2.724f)
                lineToRelative(-0.138f, 0.276f)
                horizontalLineTo(3.742f)
                lineToRelative(0.298f, -0.697f)
                lineToRelative(2.165f, -5.056f)
                lineToRelative(-2.165f, -5.053f)
                lineToRelative(-0.298f, -0.697f)
                horizontalLineTo(7.81f)
                lineToRelative(0.138f, 0.276f)
                lineTo(9.31f, 15.25f)
                horizontalLineToRelative(5.125f)
                lineTo(13.002f, 3.812f)
                lineToRelative(-0.07f, -0.563f)
                horizontalLineToRelative(4.685f)
                lineToRelative(0.11f, 0.35f)
                lineToRelative(3.641f, 11.65f)
                horizontalLineTo(30.0f)
                curveToRelative(0.868f, 0.0f, 1.572f, 0.295f, 2.056f, 0.82f)
                curveToRelative(0.477f, 0.518f, 0.694f, 1.211f, 0.694f, 1.93f)
            }
        }
        .build()
        return _airplaneMedium!!
    }

private var _airplaneMedium: ImageVector? = null
