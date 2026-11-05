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

public val SBBIcons.ClipboardTickMedium: ImageVector
    get() {
        if (_clipboardTickMedium != null) {
            return _clipboardTickMedium!!
        }
        _clipboardTickMedium = Builder(name = "ClipboardTickMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.75f, 3.25f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(28.0f)
                lineTo(4.75f, 32.75f)
                verticalLineToRelative(-28.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.5f)
                moveToRelative(1.0f, 3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(22.25f, 6.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(26.0f)
                lineTo(5.75f, 31.75f)
                verticalLineToRelative(-26.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(15.399f, 26.177f)
                lineTo(25.899f, 12.302f)
                lineTo(25.101f, 11.698f)
                lineTo(14.914f, 25.161f)
                lineTo(9.315f, 20.611f)
                lineTo(8.685f, 21.388f)
                lineTo(14.685f, 26.263f)
                lineTo(15.086f, 26.589f)
                close()
            }
        }
        .build()
        return _clipboardTickMedium!!
    }

private var _clipboardTickMedium: ImageVector? = null
