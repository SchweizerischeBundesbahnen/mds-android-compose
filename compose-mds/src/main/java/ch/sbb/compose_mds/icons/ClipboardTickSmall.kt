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

public val SBBIcons.ClipboardTickSmall: ImageVector
    get() {
        if (_clipboardTickSmall != null) {
            return _clipboardTickSmall!!
        }
        _clipboardTickSmall = Builder(name = "ClipboardTickSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(19.0f)
                lineTo(3.0f, 22.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineTo(9.0f, 2.0f)
                close()
                moveTo(9.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(14.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 3.0f)
                close()
                moveTo(10.398f, 17.552f)
                lineTo(17.398f, 8.302f)
                lineTo(16.602f, 7.698f)
                lineTo(9.913f, 16.535f)
                lineTo(6.315f, 13.612f)
                lineTo(5.685f, 14.388f)
                lineTo(9.685f, 17.638f)
                lineTo(10.085f, 17.965f)
                close()
            }
        }
        .build()
        return _clipboardTickSmall!!
    }

private var _clipboardTickSmall: ImageVector? = null
