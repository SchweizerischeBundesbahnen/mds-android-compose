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

public val SBBIcons.ThreeBoxesLarge: ImageVector
    get() {
        if (_threeBoxesLarge != null) {
            return _threeBoxesLarge!!
        }
        _threeBoxesLarge = Builder(name = "ThreeBoxesLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 41.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(8.0f, 40.0f)
                horizontalLineToRelative(15.0f)
                lineTo(23.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                close()
                moveTo(24.0f, 40.0f)
                horizontalLineToRelative(15.0f)
                lineTo(39.0f, 25.0f)
                lineTo(24.0f, 25.0f)
                close()
                moveTo(19.001f, 29.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(35.001f, 29.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(16.0f, 24.0f)
                horizontalLineToRelative(15.0f)
                lineTo(31.0f, 9.0f)
                lineTo(16.0f, 9.0f)
                close()
                moveTo(29.0f, 22.0f)
                lineTo(18.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(27.001f, 13.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _threeBoxesLarge!!
    }

private var _threeBoxesLarge: ImageVector? = null
