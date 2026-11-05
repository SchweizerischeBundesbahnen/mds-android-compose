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

public val SBBIcons.HamburgerMenuLarge: ImageVector
    get() {
        if (_hamburgerMenuLarge != null) {
            return _hamburgerMenuLarge!!
        }
        _hamburgerMenuLarge = Builder(
            name = "HamburgerMenuLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(40.0f, 39.0f)
                lineTo(7.0f, 39.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(33.0f)
                close()
                moveTo(40.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(33.0f)
                close()
                moveTo(40.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(33.0f)
                close()
            }
        }
            .build()
        return _hamburgerMenuLarge!!
    }

private var _hamburgerMenuLarge: ImageVector? = null
