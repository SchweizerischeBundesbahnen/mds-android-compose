package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
                    pathFillType = EvenOdd) {
                moveTo(12.932f, 3.249f)
                horizontalLineToRelative(4.686f)
                lineToRelative(0.11f, 0.35f)
                lineToRelative(3.64f, 11.65f)
                lineTo(30.0f, 15.249f)
                curveToRelative(0.868f, 0.0f, 1.572f, 0.296f, 2.055f, 0.82f)
                curveToRelative(0.477f, 0.519f, 0.695f, 1.211f, 0.695f, 1.93f)
                curveToRelative(0.0f, 0.72f, -0.218f, 1.412f, -0.695f, 1.93f)
                curveToRelative(-0.483f, 0.525f, -1.187f, 0.82f, -2.055f, 0.82f)
                horizontalLineToRelative(-8.632f)
                lineToRelative(-3.64f, 11.65f)
                lineToRelative(-0.11f, 0.35f)
                horizontalLineToRelative(-4.684f)
                lineToRelative(0.07f, -0.562f)
                lineToRelative(1.43f, -11.435f)
                lineTo(9.309f, 20.752f)
                lineToRelative(-1.362f, 2.724f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(3.742f, 23.752f)
                lineToRelative(0.298f, -0.697f)
                lineTo(6.206f, 18.0f)
                lineTo(4.04f, 12.946f)
                lineToRelative(-0.298f, -0.697f)
                horizontalLineToRelative(4.067f)
                lineToRelative(0.138f, 0.276f)
                lineTo(9.31f, 15.25f)
                horizontalLineToRelative(5.125f)
                lineTo(13.002f, 3.811f)
                close()
                moveTo(14.065f, 4.249f)
                lineTo(15.496f, 15.687f)
                lineTo(15.566f, 16.249f)
                lineTo(8.691f, 16.249f)
                lineToRelative(-0.138f, -0.276f)
                lineToRelative(-1.362f, -2.724f)
                lineTo(5.258f, 13.249f)
                lineToRelative(1.952f, 4.553f)
                lineToRelative(0.084f, 0.197f)
                lineToRelative(-0.084f, 0.197f)
                lineToRelative(-1.952f, 4.556f)
                horizontalLineToRelative(1.933f)
                lineToRelative(1.362f, -2.724f)
                lineToRelative(0.138f, -0.276f)
                horizontalLineToRelative(6.875f)
                lineToRelative(-0.07f, 0.562f)
                lineToRelative(-1.43f, 11.435f)
                horizontalLineToRelative(2.816f)
                lineToRelative(3.64f, -11.65f)
                lineToRelative(0.11f, -0.35f)
                lineTo(30.0f, 19.749f)
                curveToRelative(0.632f, 0.0f, 1.053f, -0.207f, 1.32f, -0.497f)
                curveToRelative(0.273f, -0.296f, 0.43f, -0.729f, 0.43f, -1.253f)
                reflectiveCurveToRelative(-0.157f, -0.956f, -0.43f, -1.252f)
                curveToRelative(-0.267f, -0.29f, -0.688f, -0.498f, -1.32f, -0.498f)
                horizontalLineToRelative(-9.368f)
                lineToRelative(-0.11f, -0.35f)
                lineToRelative(-3.64f, -11.65f)
                close()
            }
        }
        .build()
        return _airplaneMedium!!
    }

private var _airplaneMedium: ImageVector? = null
