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

public val SBBIcons.FreightWagonContainerSmall: ImageVector
    get() {
        if (_freightWagonContainerSmall != null) {
            return _freightWagonContainerSmall!!
        }
        _freightWagonContainerSmall = Builder(name = "FreightWagonContainerSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 16.0f)
                lineTo(19.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(9.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 17.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                moveToRelative(-1.0f, 0.0f)
                lineTo(6.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                moveToRelative(9.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 18.0f)
                close()
            }
        }
        .build()
        return _freightWagonContainerSmall!!
    }

private var _freightWagonContainerSmall: ImageVector? = null
