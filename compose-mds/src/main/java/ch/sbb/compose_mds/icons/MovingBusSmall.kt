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

public val SBBIcons.MovingBusSmall: ImageVector
    get() {
        if (_movingBusSmall != null) {
            return _movingBusSmall!!
        }
        _movingBusSmall = Builder(name = "MovingBusSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 11.0f)
                close()
                moveTo(7.0f, 12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.001f)
                verticalLineToRelative(2.0f)
                lineTo(18.0f, 19.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(15.001f, 18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 9.002f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 13.0f)
                moveToRelative(5.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.002f, 0.001f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 14.0f)
                moveToRelative(5.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(22.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(4.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _movingBusSmall!!
    }

private var _movingBusSmall: ImageVector? = null
