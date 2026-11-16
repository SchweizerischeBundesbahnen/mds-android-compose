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

public val SBBIcons.PrinterSmall: ImageVector
    get() {
        if (_printerSmall != null) {
            return _printerSmall!!
        }
        _printerSmall = Builder(name = "PrinterSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 7.0f)
                lineTo(18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(17.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(17.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(16.0f, 15.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 19.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _printerSmall!!
    }

private var _printerSmall: ImageVector? = null
