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

public val SBBIcons.NineSquaresLarge: ImageVector
    get() {
        if (_nineSquaresLarge != null) {
            return _nineSquaresLarge!!
        }
        _nineSquaresLarge = Builder(name = "NineSquaresLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 39.0f)
                lineTo(8.0f, 39.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(27.0f, 39.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(39.0f, 39.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(9.0f, 38.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(9.0f, 33.0f)
                close()
                moveTo(21.0f, 38.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(33.0f, 38.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(15.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(27.0f, 27.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(39.0f, 27.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(9.0f, 26.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(9.0f, 21.0f)
                close()
                moveTo(21.0f, 26.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(33.0f, 26.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(27.0f, 15.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(39.0f, 15.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(32.0f, 8.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                lineTo(26.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(33.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                lineTo(38.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _nineSquaresLarge!!
    }

private var _nineSquaresLarge: ImageVector? = null
