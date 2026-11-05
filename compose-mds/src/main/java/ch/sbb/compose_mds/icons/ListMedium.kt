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

public val SBBIcons.ListMedium: ImageVector
    get() {
        if (_listMedium != null) {
            return _listMedium!!
        }
        _listMedium = Builder(
            name = "ListMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(6.001f, 8.75f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.503f, 8.75f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-15.0f)
                close()
                moveTo(28.503f, 14.75f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(6.001f, 14.75f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(28.503f, 26.75f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(6.001f, 26.75f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(28.503f, 20.75f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(6.001f, 20.75f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
            .build()
        return _listMedium!!
    }

private var _listMedium: ImageVector? = null
