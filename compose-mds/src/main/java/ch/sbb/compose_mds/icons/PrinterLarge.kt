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

public val SBBIcons.PrinterLarge: ImageVector
    get() {
        if (_printerLarge != null) {
            return _printerLarge!!
        }
        _printerLarge = Builder(name = "PrinterLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.001f, 13.999f)
                lineTo(43.0f, 13.999f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(35.0f, 43.0f)
                lineTo(12.0f, 43.0f)
                lineTo(12.0f, 32.999f)
                lineTo(4.0f, 32.999f)
                verticalLineToRelative(-19.0f)
                horizontalLineToRelative(8.001f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(13.0f, 42.0f)
                horizontalLineToRelative(21.0f)
                lineTo(34.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                close()
                moveTo(32.0f, 38.999f)
                lineTo(15.0f, 38.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(32.0f, 34.999f)
                lineTo(15.0f, 34.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(5.0f, 31.999f)
                horizontalLineToRelative(7.0f)
                lineTo(12.0f, 26.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(5.999f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-17.0f)
                lineTo(5.0f, 14.999f)
                close()
                moveTo(32.0f, 30.999f)
                lineTo(15.0f, 30.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(38.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-25.499f, -5.001f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-21.0f)
                close()
                moveTo(31.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
            }
        }
        .build()
        return _printerLarge!!
    }

private var _printerLarge: ImageVector? = null
