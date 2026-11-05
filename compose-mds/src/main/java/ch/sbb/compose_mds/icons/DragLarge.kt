package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.DragLarge: ImageVector
    get() {
        if (_dragLarge != null) {
            return _dragLarge!!
        }
        _dragLarge = Builder(name = "DragLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 32.0f)
                lineTo(7.0f, 32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(33.0f)
                close()
                moveTo(40.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(33.0f)
                close()
                moveTo(40.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(33.0f)
                close()
            }
        }
        .build()
        return _dragLarge!!
    }

private var _dragLarge: ImageVector? = null
