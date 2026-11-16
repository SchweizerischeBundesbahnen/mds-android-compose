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

public val SBBIcons.BusStopSmall: ImageVector
    get() {
        if (_busStopSmall != null) {
            return _busStopSmall!!
        }
        _busStopSmall = Builder(name = "BusStopSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.999f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-0.998f)
                verticalLineToRelative(17.001f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.001f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineToRelative(17.001f)
                lineTo(8.0f, 22.001f)
                lineTo(8.0f, 5.0f)
                lineTo(6.999f, 5.0f)
                lineTo(6.999f, 2.0f)
                close()
                moveTo(7.999f, 4.0f)
                horizontalLineToRelative(13.0f)
                lineTo(20.999f, 3.0f)
                horizontalLineToRelative(-13.0f)
                close()
                moveTo(7.0f, 7.0f)
                verticalLineToRelative(6.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(9.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-9.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                close()
                moveTo(16.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(1.0f, 8.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _busStopSmall!!
    }

private var _busStopSmall: ImageVector? = null
