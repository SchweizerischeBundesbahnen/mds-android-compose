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

public val SBBIcons.MilkBrickDisabledLarge: ImageVector
    get() {
        if (_milkBrickDisabledLarge != null) {
            return _milkBrickDisabledLarge!!
        }
        _milkBrickDisabledLarge = Builder(
            name = "MilkBrickDisabledLarge",
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
                moveToRelative(41.854f, 41.147f)
                lineToRelative(-0.707f, 0.706f)
                lineTo(33.0f, 33.707f)
                lineTo(33.0f, 43.0f)
                lineTo(14.0f, 43.0f)
                lineTo(14.0f, 14.707f)
                lineTo(5.146f, 5.854f)
                lineToRelative(0.708f, -0.708f)
                close()
                moveTo(15.0f, 42.0f)
                horizontalLineToRelative(7.0f)
                lineTo(22.0f, 22.707f)
                lineToRelative(-7.0f, -7.0f)
                close()
                moveTo(23.0f, 42.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.293f)
                lineToRelative(-9.0f, -9.0f)
                close()
                moveTo(29.0f, 8.349f)
                lineTo(33.0f, 14.349f)
                lineTo(33.0f, 28.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(32.0f, 15.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.349f)
                lineToRelative(-3.5f, -5.25f)
                lineToRelative(-1.983f, 2.976f)
                lineToRelative(-0.832f, -0.555f)
                lineTo(18.0f, 8.35f)
                lineTo(18.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(22.768f, 14.0f)
                horizontalLineToRelative(8.797f)
                lineToRelative(-3.333f, -5.0f)
                horizontalLineToRelative(-8.797f)
                close()
                moveTo(19.0f, 8.0f)
                horizontalLineToRelative(9.0f)
                lineTo(28.0f, 5.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
            .build()
        return _milkBrickDisabledLarge!!
    }

private var _milkBrickDisabledLarge: ImageVector? = null
