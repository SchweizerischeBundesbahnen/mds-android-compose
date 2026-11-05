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

public val SBBIcons.ClipboardPlusSmall: ImageVector
    get() {
        if (_clipboardPlusSmall != null) {
            return _clipboardPlusSmall!!
        }
        _clipboardPlusSmall = Builder(
            name = "ClipboardPlusSmall",
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
                horizontalLineTo(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.5f)
                moveToRelative(0.5f, 1.5f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                moveToRelative(2.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
            .build()
        return _clipboardPlusSmall!!
    }

private var _clipboardPlusSmall: ImageVector? = null
