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

public val SBBIcons.DeskLarge: ImageVector
    get() {
        if (_deskLarge != null) {
            return _deskLarge!!
        }
        _deskLarge = Builder(
            name = "DeskLarge",
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
                moveTo(41.0f, 41.999f)
                horizontalLineToRelative(-1.0f)
                lineTo(40.0f, 33.0f)
                lineTo(28.0f, 33.0f)
                verticalLineToRelative(-8.001f)
                lineTo(7.0f, 24.999f)
                verticalLineToRelative(17.0f)
                lineTo(6.0f, 41.999f)
                verticalLineToRelative(-22.0f)
                horizontalLineToRelative(35.0f)
                close()
                moveTo(29.0f, 32.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-7.001f)
                lineTo(29.0f, 24.999f)
                close()
                moveTo(37.0f, 29.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(7.0f, 23.999f)
                horizontalLineToRelative(33.0f)
                verticalLineToRelative(-3.0f)
                lineTo(7.0f, 20.999f)
                close()
            }
        }
            .build()
        return _deskLarge!!
    }

private var _deskLarge: ImageVector? = null
