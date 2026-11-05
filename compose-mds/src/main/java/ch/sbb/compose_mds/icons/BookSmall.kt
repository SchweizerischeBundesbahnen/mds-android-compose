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

public val SBBIcons.BookSmall: ImageVector
    get() {
        if (_bookSmall != null) {
            return _bookSmall!!
        }
        _bookSmall = Builder(name = "BookSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 4.0f)
                lineTo(19.0f, 4.0f)
                verticalLineToRelative(12.001f)
                lineTo(6.5f, 16.001f)
                curveToRelative(-0.563f, 0.0f, -1.082f, 0.186f, -1.5f, 0.5f)
                close()
                moveTo(4.0f, 19.001f)
                lineTo(4.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 3.0f)
                lineTo(20.0f, 3.0f)
                verticalLineToRelative(14.001f)
                lineTo(6.5f, 17.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineToRelative(13.0f, -0.001f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-13.0f, 0.001f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, -2.0f)
                close()
                moveTo(6.5f, 18.001f)
                lineTo(6.0f, 18.001f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.5f, 18.001f)
            }
        }
        .build()
        return _bookSmall!!
    }

private var _bookSmall: ImageVector? = null
