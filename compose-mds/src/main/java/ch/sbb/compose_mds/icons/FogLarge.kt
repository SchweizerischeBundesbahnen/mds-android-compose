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

public val SBBIcons.FogLarge: ImageVector
    get() {
        if (_fogLarge != null) {
            return _fogLarge!!
        }
        _fogLarge = Builder(name = "FogLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(37.5f, 26.0f)
                lineToRelative(-24.0f, 0.02f)
                verticalLineToRelative(-1.0f)
                lineToRelative(24.0f, -0.02f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(38.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(34.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(34.0f, 14.0f)
                lineTo(15.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(32.0f, 10.0f)
                lineTo(21.0f, 10.0f)
                lineTo(21.0f, 9.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _fogLarge!!
    }

private var _fogLarge: ImageVector? = null
