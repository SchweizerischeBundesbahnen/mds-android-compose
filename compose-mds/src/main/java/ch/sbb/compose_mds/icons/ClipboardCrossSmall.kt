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

public val SBBIcons.ClipboardCrossSmall: ImageVector
    get() {
        if (_clipboardCrossSmall != null) {
            return _clipboardCrossSmall!!
        }
        _clipboardCrossSmall = Builder(name = "ClipboardCrossSmall", defaultWidth = 24.0.dp,
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
                moveTo(12.0f, 13.707f)
                lineTo(7.354f, 18.354f)
                lineTo(6.646f, 17.647f)
                lineTo(11.293f, 13.0f)
                lineTo(6.646f, 8.354f)
                lineToRelative(0.708f, -0.708f)
                lineTo(12.0f, 12.293f)
                lineToRelative(4.647f, -4.647f)
                lineToRelative(0.707f, 0.708f)
                lineTo(12.707f, 13.0f)
                lineToRelative(4.647f, 4.647f)
                lineToRelative(-0.707f, 0.707f)
                close()
            }
        }
        .build()
        return _clipboardCrossSmall!!
    }

private var _clipboardCrossSmall: ImageVector? = null
