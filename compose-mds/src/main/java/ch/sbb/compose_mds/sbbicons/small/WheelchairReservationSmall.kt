package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.WheelchairReservationSmall: ImageVector
    get() {
        if (_wheelchairReservationSmall != null) {
            return _wheelchairReservationSmall!!
        }
        _wheelchairReservationSmall = Builder(name = "WheelchairReservationSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 2.0f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 2.0f)
                lineTo(2.5f, 2.0f)
                moveTo(3.0f, 21.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(18.0f)
                close()
                moveTo(8.476f, 10.486f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, false, -2.47f, 4.014f)
                curveToRelative(0.0f, 2.474f, 2.025f, 4.5f, 4.5f, 4.5f)
                arcToRelative(4.52f, 4.52f, 0.0f, false, false, 4.071f, -2.59f)
                lineToRelative(-0.904f, -0.428f)
                arcTo(3.52f, 3.52f, 0.0f, false, true, 10.505f, 18.0f)
                arcToRelative(3.514f, 3.514f, 0.0f, false, true, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.355f, 0.783f, -2.54f, 1.925f, -3.123f)
                close()
                moveTo(10.0f, 13.5f)
                lineTo(10.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(10.5f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _wheelchairReservationSmall!!
    }

private var _wheelchairReservationSmall: ImageVector? = null
