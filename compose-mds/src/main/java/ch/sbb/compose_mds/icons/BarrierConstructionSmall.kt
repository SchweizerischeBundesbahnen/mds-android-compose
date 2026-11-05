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

public val SBBIcons.BarrierConstructionSmall: ImageVector
    get() {
        if (_barrierConstructionSmall != null) {
            return _barrierConstructionSmall!!
        }
        _barrierConstructionSmall = Builder(name = "BarrierConstructionSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(7.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.001f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(19.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.999f)
                lineTo(8.0f, 18.001f)
                lineTo(8.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(-3.999f)
                lineTo(2.0f, 18.001f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 10.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                moveToRelative(13.0f, -1.5f)
                lineTo(18.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(17.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                moveToRelative(0.0f, 9.501f)
                lineTo(18.0f, 10.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.001f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.001f)
                lineTo(8.0f, 13.001f)
                close()
                moveTo(6.0f, 13.001f)
                lineTo(6.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.001f)
                close()
                moveTo(3.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.293f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(9.707f, 6.0f)
                lineTo(6.707f, 9.0f)
                horizontalLineToRelative(7.586f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineToRelative(-5.293f)
                lineToRelative(3.0f, -3.0f)
                lineTo(21.0f, 6.0f)
                close()
                moveTo(18.0f, 18.001f)
                lineTo(18.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.999f)
                close()
                moveTo(6.0f, 18.001f)
                lineTo(6.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.999f)
                close()
                moveTo(3.0f, 14.001f)
                verticalLineToRelative(2.292f)
                lineTo(5.292f, 14.0f)
                close()
                moveTo(9.292f, 17.001f)
                lineTo(3.706f, 17.001f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(5.586f)
                close()
                moveTo(13.706f, 14.001f)
                lineTo(10.706f, 17.001f)
                horizontalLineToRelative(5.586f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(20.706f, 14.001f)
                lineTo(17.706f, 17.001f)
                lineTo(21.0f, 17.001f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _barrierConstructionSmall!!
    }

private var _barrierConstructionSmall: ImageVector? = null
