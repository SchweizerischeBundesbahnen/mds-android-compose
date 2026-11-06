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

public val SBBIcons.PaperClipLarge: ImageVector
    get() {
        if (_paperClipLarge != null) {
            return _paperClipLarge!!
        }
        _paperClipLarge = Builder(name = "PaperClipLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.0f, 4.0f)
                verticalLineToRelative(33.707f)
                lineToRelative(-0.146f, 0.147f)
                lineToRelative(-7.0f, 7.0f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-7.0f, -7.0f)
                lineToRelative(-0.146f, -0.147f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(24.768f)
                lineToRelative(-0.223f, 0.148f)
                lineToRelative(-3.0f, 2.0f)
                lineToRelative(-0.277f, 0.185f)
                lineToRelative(-0.277f, -0.185f)
                lineToRelative(-3.0f, -2.0f)
                lineToRelative(-0.223f, -0.148f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(13.232f)
                lineToRelative(2.5f, 1.667f)
                lineToRelative(2.5f, -1.667f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(31.293f)
                lineToRelative(6.5f, 6.5f)
                lineToRelative(6.5f, -6.5f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _paperClipLarge!!
    }

private var _paperClipLarge: ImageVector? = null
