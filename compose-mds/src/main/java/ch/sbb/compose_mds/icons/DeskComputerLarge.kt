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

public val SBBIcons.DeskComputerLarge: ImageVector
    get() {
        if (_deskComputerLarge != null) {
            return _deskComputerLarge!!
        }
        _deskComputerLarge = Builder(name = "DeskComputerLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.0f, 19.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(21.0f)
                lineTo(28.0f, 43.0f)
                lineTo(28.0f, 23.0f)
                lineTo(5.0f, 23.0f)
                verticalLineToRelative(21.0f)
                lineTo(4.0f, 44.0f)
                lineTo(4.0f, 22.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(29.0f, 42.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-9.0f)
                lineTo(29.0f, 33.0f)
                close()
                moveTo(38.001f, 37.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(29.0f, 32.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-9.0f)
                lineTo(29.0f, 23.0f)
                close()
                moveTo(38.001f, 27.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(21.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(17.0f)
                lineTo(30.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                close()
            }
        }
        .build()
        return _deskComputerLarge!!
    }

private var _deskComputerLarge: ImageVector? = null
