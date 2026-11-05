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

public val SBBIcons.TrashSmall: ImageVector
    get() {
        if (_trashSmall != null) {
            return _trashSmall!!
        }
        _trashSmall = Builder(name = "TrashSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.272f, 5.009f)
                arcTo(4.47f, 4.47f, 0.0f, false, true, 12.0f, 3.0f)
                curveToRelative(1.564f, 0.0f, 2.925f, 0.806f, 3.727f, 2.009f)
                lineTo(20.0f, 5.009f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                lineTo(5.0f, 6.009f)
                lineTo(4.0f, 6.009f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.561f, 5.009f)
                horizontalLineToRelative(4.878f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, -4.878f, 0.0f)
                moveTo(6.0f, 6.009f)
                lineTo(6.0f, 19.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 6.009f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(9.0f, 8.0f)
                close()
                moveTo(11.5f, 17.0f)
                lineTo(11.5f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(15.0f, 8.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _trashSmall!!
    }

private var _trashSmall: ImageVector? = null
