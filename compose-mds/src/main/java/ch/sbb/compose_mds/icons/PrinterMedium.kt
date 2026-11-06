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

public val SBBIcons.PrinterMedium: ImageVector
    get() {
        if (_printerMedium != null) {
            return _printerMedium!!
        }
        _printerMedium = Builder(name = "PrinterMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.75f, 4.749f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-17.0f)
                moveToRelative(16.0f, 6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-15.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(31.75f, 24.249f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.5f)
                lineTo(9.25f, 19.749f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-12.5f)
                horizontalLineToRelative(27.5f)
                close()
                moveTo(10.25f, 31.749f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(24.0f, 23.749f)
                lineTo(12.0f, 23.749f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(12.0f, 26.749f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 25.749f)
                close()
                moveTo(12.0f, 29.749f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 28.749f)
                close()
            }
        }
        .build()
        return _printerMedium!!
    }

private var _printerMedium: ImageVector? = null
