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

public val SBBIcons.DiscFloppyLarge: ImageVector
    get() {
        if (_discFloppyLarge != null) {
            return _discFloppyLarge!!
        }
        _discFloppyLarge = Builder(name = "DiscFloppyLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.0f, 32.651f)
                lineTo(34.768f, 39.0f)
                lineTo(8.0f, 39.0f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(9.0f, 38.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.0f, 28.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.232f)
                lineTo(38.0f, 32.349f)
                lineTo(38.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(12.0f)
                lineTo(14.0f, 21.0f)
                lineTo(14.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(15.0f, 38.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-9.0f)
                lineTo(15.0f, 29.0f)
                close()
                moveTo(29.0f, 36.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 20.0f)
                horizontalLineToRelative(17.0f)
                lineTo(32.0f, 9.0f)
                lineTo(15.0f, 9.0f)
                close()
                moveTo(30.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(30.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _discFloppyLarge!!
    }

private var _discFloppyLarge: ImageVector? = null
