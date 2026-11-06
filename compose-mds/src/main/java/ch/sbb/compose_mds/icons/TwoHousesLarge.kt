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

public val SBBIcons.TwoHousesLarge: ImageVector
    get() {
        if (_twoHousesLarge != null) {
            return _twoHousesLarge!!
        }
        _twoHousesLarge = Builder(name = "TwoHousesLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(45.854f, 22.146f)
                lineToRelative(-0.707f, 0.706f)
                lineTo(43.0f, 20.707f)
                lineTo(43.0f, 38.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(37.0f, 40.0f)
                horizontalLineToRelative(-9.02f)
                lineTo(27.98f, 30.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(10.0f)
                lineTo(10.0f, 40.0f)
                lineTo(10.0f, 22.707f)
                lineToRelative(-2.146f, 2.146f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(14.0f, 17.294f)
                lineTo(14.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.293f)
                lineToRelative(5.5f, -5.5f)
                lineToRelative(1.999f, 1.999f)
                lineToRelative(4.001f, -4.0f)
                close()
                moveTo(11.0f, 21.707f)
                lineTo(11.0f, 39.0f)
                horizontalLineToRelative(6.98f)
                lineTo(17.98f, 29.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(10.0f)
                lineTo(36.0f, 39.0f)
                lineTo(36.0f, 21.707f)
                lineToRelative(-12.5f, -12.5f)
                close()
                moveTo(26.206f, 10.499f)
                lineTo(39.853f, 24.146f)
                lineTo(39.147f, 24.853f)
                lineTo(37.0f, 22.708f)
                verticalLineToRelative(14.292f)
                horizontalLineToRelative(5.0f)
                lineTo(42.0f, 19.706f)
                lineToRelative(-12.5f, -12.5f)
                close()
                moveTo(15.0f, 16.293f)
                lineToRelative(2.0f, -2.0f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _twoHousesLarge!!
    }

private var _twoHousesLarge: ImageVector? = null
