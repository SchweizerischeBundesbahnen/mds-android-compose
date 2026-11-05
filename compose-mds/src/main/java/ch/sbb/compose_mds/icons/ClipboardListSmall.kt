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

public val SBBIcons.ClipboardListSmall: ImageVector
    get() {
        if (_clipboardListSmall != null) {
            return _clipboardListSmall!!
        }
        _clipboardListSmall = Builder(
            name = "ClipboardListSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(9.5f, 2.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(15.0f, 2.0f)
                lineTo(9.5f, 2.0f)
                moveToRelative(0.5f, 1.5f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 5.0f)
                lineTo(9.0f, 4.0f)
                moveToRelative(9.0f, 6.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 9.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(18.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 18.0f)
                close()
            }
        }
            .build()
        return _clipboardListSmall!!
    }

private var _clipboardListSmall: ImageVector? = null
