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

public val SBBIcons.PowerPlugLarge: ImageVector
    get() {
        if (_powerPlugLarge != null) {
            return _powerPlugLarge!!
        }
        _powerPlugLarge = Builder(name = "PowerPlugLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                horizontalLineToRelative(15.0f)
                lineTo(32.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 4.347f, -3.56f, 7.5f, -7.5f, 7.5f)
                lineTo(29.0f, 31.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-4.462f, 0.0f, -7.5f, -3.75f, -7.5f, -7.5f)
                lineTo(12.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(21.0f, 36.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(13.0f, 23.5f)
                curveToRelative(0.0f, 3.259f, 2.65f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(3.423f, 0.0f, 6.5f, -2.74f, 6.5f, -6.5f)
                lineTo(36.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                close()
                moveTo(24.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
            }
        }
        .build()
        return _powerPlugLarge!!
    }

private var _powerPlugLarge: ImageVector? = null
