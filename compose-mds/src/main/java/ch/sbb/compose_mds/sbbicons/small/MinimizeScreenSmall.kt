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

public val SmallGroup.MinimizeScreenSmall: ImageVector
    get() {
        if (_minimizeScreenSmall != null) {
            return _minimizeScreenSmall!!
        }
        _minimizeScreenSmall = Builder(name = "MinimizeScreenSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 9.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                lineTo(4.0f, 10.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                lineTo(4.0f, 14.0f)
                close()
                moveTo(14.5f, 14.0f)
                lineTo(14.0f, 14.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _minimizeScreenSmall!!
    }

private var _minimizeScreenSmall: ImageVector? = null
