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

public val SBBIcons.ClipboardEmptySmall: ImageVector
    get() {
        if (_clipboardEmptySmall != null) {
            return _clipboardEmptySmall!!
        }
        _clipboardEmptySmall = Builder(name = "ClipboardEmptySmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(4.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(17.0f)
                lineTo(4.0f, 21.0f)
                close()
                moveTo(14.0f, 3.5f)
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _clipboardEmptySmall!!
    }

private var _clipboardEmptySmall: ImageVector? = null
