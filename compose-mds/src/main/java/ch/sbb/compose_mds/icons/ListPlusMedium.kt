package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ListPlusMedium: ImageVector
    get() {
        if (_listPlusMedium != null) {
            return _listPlusMedium!!
        }
        _listPlusMedium = Builder(
            name = "ListPlusMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(6.0f, 8.75f)
                horizontalLineToRelative(22.5f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 7.75f)
                close()
                moveTo(6.0f, 14.75f)
                horizontalLineToRelative(22.5f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 13.75f)
                close()
                moveTo(18.0f, 26.75f)
                lineTo(6.0f, 26.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(6.0f, 20.75f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 19.75f)
                close()
                moveTo(24.5f, 24.0f)
                lineTo(21.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1.0f)
                lineTo(25.5f, 23.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _listPlusMedium!!
    }

private var _listPlusMedium: ImageVector? = null
