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

public val SBBIcons.ListArrowRightLarge: ImageVector
    get() {
        if (_listArrowRightLarge != null) {
            return _listArrowRightLarge!!
        }
        _listArrowRightLarge = Builder(
            name = "ListArrowRightLarge",
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
                moveTo(34.0f, 11.0f)
                lineTo(18.0f, 11.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.0f)
                lineTo(10.5f, 39.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 35.5f)
                verticalLineToRelative(-22.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                lineTo(34.0f, 10.0f)
                close()
                moveTo(10.5f, 11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 13.5f)
                verticalLineToRelative(22.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                lineTo(17.0f, 38.0f)
                lineTo(17.0f, 11.0f)
                close()
                moveTo(40.834f, 24.13f)
                lineTo(41.186f, 24.483f)
                lineTo(40.834f, 24.837f)
                lineTo(32.854f, 32.852f)
                lineTo(32.145f, 32.148f)
                lineTo(39.275f, 24.983f)
                lineTo(25.0f, 24.983f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(14.272f)
                lineToRelative(-7.125f, -7.13f)
                lineToRelative(0.706f, -0.707f)
                close()
            }
        }
            .build()
        return _listArrowRightLarge!!
    }

private var _listArrowRightLarge: ImageVector? = null
