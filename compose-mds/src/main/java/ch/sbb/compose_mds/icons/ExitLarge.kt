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

public val SBBIcons.ExitLarge: ImageVector
    get() {
        if (_exitLarge != null) {
            return _exitLarge!!
        }
        _exitLarge = Builder(name = "ExitLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.0f, 14.999f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(7.0f, 9.999f)
                verticalLineToRelative(29.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 39.999f)
                verticalLineToRelative(-31.0f)
                horizontalLineToRelative(25.0f)
                close()
                moveTo(40.855f, 25.146f)
                lineTo(41.208f, 25.499f)
                lineTo(40.855f, 25.853f)
                lineTo(34.57f, 32.151f)
                lineTo(33.863f, 31.444f)
                lineTo(39.293f, 26.0f)
                lineTo(13.0f, 26.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(26.294f)
                lineToRelative(-5.43f, -5.429f)
                lineToRelative(0.706f, -0.707f)
                close()
            }
        }
        .build()
        return _exitLarge!!
    }

private var _exitLarge: ImageVector? = null
