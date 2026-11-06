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

public val SBBIcons.BusStopMedium: ImageVector
    get() {
        if (_busStopMedium != null) {
            return _busStopMedium!!
        }
        _busStopMedium = Builder(name = "BusStopMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.749f, 3.25f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(4.0f)
                lineTo(31.25f, 7.25f)
                verticalLineToRelative(25.752f)
                horizontalLineToRelative(-1.0f)
                lineTo(30.25f, 7.25f)
                lineTo(13.25f, 7.25f)
                verticalLineToRelative(25.752f)
                horizontalLineToRelative(-1.0f)
                lineTo(12.25f, 7.25f)
                horizontalLineToRelative(-1.501f)
                verticalLineToRelative(-4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.25f, 10.75f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.25f, 33.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(6.25f, 19.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-8.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(23.25f, 11.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(-1.0f, 4.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-6.5f)
                moveToRelative(0.5f, 7.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-1.5f)
            }
        }
        .build()
        return _busStopMedium!!
    }

private var _busStopMedium: ImageVector? = null
