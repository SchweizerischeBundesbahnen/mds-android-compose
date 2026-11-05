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

public val SBBIcons.FreightWagonSmall: ImageVector
    get() {
        if (_freightWagonSmall != null) {
            return _freightWagonSmall!!
        }
        _freightWagonSmall = Builder(name = "FreightWagonSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 8.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(6.006f)
                horizontalLineToRelative(1.001f)
                verticalLineToRelative(1.0f)
                lineTo(21.0f, 15.006f)
                lineTo(21.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.003f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(17.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(0.003f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(5.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-0.994f)
                lineTo(1.998f, 15.006f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 14.006f)
                lineTo(3.0f, 8.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                lineTo(8.0f, 9.0f)
                close()
                moveTo(9.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 9.0f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _freightWagonSmall!!
    }

private var _freightWagonSmall: ImageVector? = null
