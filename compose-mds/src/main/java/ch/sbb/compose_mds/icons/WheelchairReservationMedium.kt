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

public val SBBIcons.WheelchairReservationMedium: ImageVector
    get() {
        if (_wheelchairReservationMedium != null) {
            return _wheelchairReservationMedium!!
        }
        _wheelchairReservationMedium = Builder(name = "WheelchairReservationMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.75f, 32.75f)
                lineTo(32.75f, 3.25f)
                lineTo(3.25f, 3.25f)
                verticalLineToRelative(29.5f)
                close()
                moveTo(31.75f, 31.75f)
                lineTo(4.25f, 31.75f)
                lineTo(4.25f, 4.25f)
                horizontalLineToRelative(27.5f)
                close()
                moveTo(12.828f, 15.953f)
                curveToRelative(-2.11f, 1.075f, -3.57f, 3.271f, -3.57f, 5.796f)
                curveToRelative(0.0f, 3.574f, 2.927f, 6.5f, 6.5f, 6.5f)
                curveToRelative(2.591f, 0.0f, 4.84f, -1.538f, 5.882f, -3.742f)
                lineToRelative(-0.905f, -0.427f)
                curveToRelative(-0.884f, 1.87f, -2.79f, 3.17f, -4.977f, 3.17f)
                curveToRelative(-3.021f, 0.0f, -5.5f, -2.48f, -5.5f, -5.5f)
                curveToRelative(0.0f, -2.131f, 1.232f, -3.994f, 3.024f, -4.907f)
                close()
                moveTo(16.25f, 12.0f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(8.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.75f)
                horizontalLineToRelative(-7.5f)
                lineTo(15.25f, 12.0f)
                close()
                moveTo(15.75f, 8.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
            }
        }
        .build()
        return _wheelchairReservationMedium!!
    }

private var _wheelchairReservationMedium: ImageVector? = null
