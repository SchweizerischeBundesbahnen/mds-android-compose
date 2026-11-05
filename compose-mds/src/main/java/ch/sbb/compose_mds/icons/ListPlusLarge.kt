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

public val SBBIcons.ListPlusLarge: ImageVector
    get() {
        if (_listPlusLarge != null) {
            return _listPlusLarge!!
        }
        _listPlusLarge = Builder(
            name = "ListPlusLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveTo(34.0f, 31.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(25.0f, 36.0f)
                lineTo(8.0f, 36.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(25.0f, 28.0f)
                lineTo(8.0f, 28.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(39.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(39.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(31.0f)
                close()
            }
        }
            .build()
        return _listPlusLarge!!
    }

private var _listPlusLarge: ImageVector? = null
