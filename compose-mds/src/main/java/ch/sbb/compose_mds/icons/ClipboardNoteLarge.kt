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

public val SBBIcons.ClipboardNoteLarge: ImageVector
    get() {
        if (_clipboardNoteLarge != null) {
            return _clipboardNoteLarge!!
        }
        _clipboardNoteLarge = Builder(name = "ClipboardNoteLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(25.0f)
                lineTo(22.0f, 43.0f)
                verticalLineToRelative(-4.0f)
                lineTo(6.0f, 39.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(23.0f, 42.0f)
                horizontalLineToRelative(19.0f)
                lineTo(42.0f, 19.0f)
                lineTo(23.0f, 19.0f)
                close()
                moveTo(7.0f, 38.0f)
                horizontalLineToRelative(15.0f)
                lineTo(22.0f, 18.0f)
                horizontalLineToRelative(14.0f)
                lineTo(36.0f, 7.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 9.0f)
                lineTo(16.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(32.0f, 38.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(39.0f, 35.0f)
                lineTo(26.0f, 35.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(39.0f, 32.0f)
                lineTo(26.0f, 32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(39.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(39.0f, 26.0f)
                lineTo(26.0f, 26.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(39.0f, 23.0f)
                lineTo(26.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineToRelative(9.0f)
                lineTo(26.0f, 5.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _clipboardNoteLarge!!
    }

private var _clipboardNoteLarge: ImageVector? = null
