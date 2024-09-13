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

public val SmallGroup.DragSmall: ImageVector
    get() {
        if (_dragSmall != null) {
            return _dragSmall!!
        }
        _dragSmall = Builder(name = "DragSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 16.0f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _dragSmall!!
    }

private var _dragSmall: ImageVector? = null
