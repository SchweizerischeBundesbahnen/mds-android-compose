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

public val SBBIcons.WheelchairReservationLarge: ImageVector
    get() {
        if (_wheelchairReservationLarge != null) {
            return _wheelchairReservationLarge!!
        }
        _wheelchairReservationLarge = Builder(
            name = "WheelchairReservationLarge",
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
                moveTo(43.0f, 43.0f)
                lineTo(4.0f, 43.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(39.0f)
                close()
                moveTo(5.0f, 42.0f)
                horizontalLineToRelative(37.0f)
                lineTo(42.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(21.0f, 26.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(30.0f, 27.0f)
                lineTo(20.0f, 27.0f)
                lineTo(20.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.906f, 21.364f)
                lineTo(17.133f, 21.81f)
                curveToRelative(-2.443f, 1.244f, -4.123f, 3.783f, -4.123f, 6.69f)
                curveToRelative(0.0f, 4.12f, 3.38f, 7.5f, 7.5f, 7.5f)
                curveToRelative(2.983f, 0.0f, 5.583f, -1.772f, 6.788f, -4.321f)
                lineToRelative(0.904f, 0.427f)
                curveTo(26.84f, 34.99f, 23.898f, 37.0f, 20.51f, 37.0f)
                curveToRelative(-4.672f, 0.0f, -8.5f, -3.828f, -8.5f, -8.5f)
                curveToRelative(0.0f, -3.3f, 1.908f, -6.174f, 4.669f, -7.581f)
                close()
                moveTo(20.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
            }
        }
            .build()
        return _wheelchairReservationLarge!!
    }

private var _wheelchairReservationLarge: ImageVector? = null
