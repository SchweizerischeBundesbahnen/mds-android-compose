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

public val SBBIcons.ClapperboardLarge: ImageVector
    get() {
        if (_clapperboardLarge != null) {
            return _clapperboardLarge!!
        }
        _clapperboardLarge = Builder(name = "ClapperboardLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.012f, 5.0f)
                horizontalLineToRelative(8.061f)
                curveToRelative(0.778f, 0.0f, 1.523f, 0.311f, 2.071f, 0.863f)
                curveToRelative(0.549f, 0.553f, 0.856f, 1.3f, 0.856f, 2.08f)
                lineTo(44.0f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 7.943f)
                curveToRelative(0.0f, -0.78f, 0.307f, -1.527f, 0.856f, -2.08f)
                arcTo(2.92f, 2.92f, 0.0f, false, true, 6.926f, 5.0f)
                horizontalLineToRelative(26.087f)
                moveToRelative(0.284f, 1.0f)
                horizontalLineToRelative(5.857f)
                lineToRelative(-4.444f, 8.0f)
                horizontalLineToRelative(-5.857f)
                close()
                moveTo(43.0f, 14.0f)
                horizontalLineToRelative(-7.147f)
                lineToRelative(4.444f, -8.0f)
                horizontalLineToRelative(0.777f)
                curveToRelative(0.51f, 0.0f, 0.999f, 0.204f, 1.36f, 0.568f)
                reflectiveCurveTo(43.0f, 7.427f, 43.0f, 7.943f)
                close()
                moveTo(32.152f, 6.0f)
                lineToRelative(-4.444f, 8.0f)
                lineTo(21.85f, 14.0f)
                lineToRelative(4.445f, -8.0f)
                close()
                moveTo(20.707f, 14.0f)
                lineTo(25.152f, 6.0f)
                horizontalLineToRelative(-5.857f)
                lineToRelative(-4.445f, 8.0f)
                close()
                moveTo(18.151f, 6.0f)
                lineTo(13.707f, 14.0f)
                lineTo(7.85f, 14.0f)
                lineToRelative(4.444f, -8.0f)
                close()
                moveTo(6.706f, 14.0f)
                lineToRelative(4.444f, -8.0f)
                lineTo(6.926f, 6.0f)
                curveToRelative(-0.51f, 0.0f, -0.999f, 0.204f, -1.36f, 0.568f)
                lineToRelative(-0.355f, -0.352f)
                lineToRelative(0.354f, 0.352f)
                arcTo(1.95f, 1.95f, 0.0f, false, false, 5.0f, 7.943f)
                lineTo(5.0f, 14.0f)
                close()
                moveTo(4.5f, 16.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(40.0f)
                lineTo(44.0f, 16.0f)
                lineTo(4.5f, 16.0f)
                moveTo(5.0f, 43.0f)
                lineTo(5.0f, 17.0f)
                horizontalLineToRelative(38.0f)
                verticalLineToRelative(26.0f)
                close()
                moveTo(18.744f, 22.564f)
                lineTo(18.0f, 22.147f)
                verticalLineToRelative(15.706f)
                lineToRelative(0.744f, -0.417f)
                lineToRelative(12.5f, -7.0f)
                lineToRelative(0.78f, -0.436f)
                lineToRelative(-0.78f, -0.436f)
                close()
                moveTo(19.0f, 30.0f)
                verticalLineToRelative(-6.147f)
                lineTo(29.977f, 30.0f)
                lineTo(19.0f, 36.147f)
                close()
            }
        }
        .build()
        return _clapperboardLarge!!
    }

private var _clapperboardLarge: ImageVector? = null
