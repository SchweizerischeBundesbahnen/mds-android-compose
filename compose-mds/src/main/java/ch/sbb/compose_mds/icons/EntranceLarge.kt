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

public val SBBIcons.EntranceLarge: ImageVector
    get() {
        if (_entranceLarge != null) {
            return _entranceLarge!!
        }
        _entranceLarge = Builder(name = "EntranceLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
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
                moveTo(20.803f, 19.202f)
                lineTo(21.156f, 19.556f)
                lineTo(15.725f, 25.0f)
                lineTo(42.02f, 25.0f)
                verticalLineToRelative(1.0f)
                lineTo(15.728f, 26.0f)
                lineToRelative(5.43f, 5.429f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(-6.282f, -6.283f)
                lineToRelative(-0.354f, -0.352f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(6.281f, -6.298f)
                close()
            }
        }
        .build()
        return _entranceLarge!!
    }

private var _entranceLarge: ImageVector? = null
