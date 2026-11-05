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

public val SBBIcons.DoorLarge: ImageVector
    get() {
        if (_doorLarge != null) {
            return _doorLarge!!
        }
        _doorLarge = Builder(name = "DoorLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.0f, 38.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 39.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(21.0f, 38.0f)
                horizontalLineToRelative(13.0f)
                lineTo(34.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                close()
                moveTo(32.0f, 36.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(24.0f, 35.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(32.0f, 25.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(32.0f, 21.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(23.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(24.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _doorLarge!!
    }

private var _doorLarge: ImageVector? = null
