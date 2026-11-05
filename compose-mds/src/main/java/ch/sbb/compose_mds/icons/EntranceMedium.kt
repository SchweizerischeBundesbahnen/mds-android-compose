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

public val SBBIcons.EntranceMedium: ImageVector
    get() {
        if (_entranceMedium != null) {
            return _entranceMedium!!
        }
        _entranceMedium = Builder(name = "EntranceMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(23.5f)
                horizontalLineToRelative(19.0f)
                verticalLineTo(25.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-17.0f)
                verticalLineTo(7.25f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(6.25f)
                horizontalLineTo(5.25f)
                moveToRelative(5.66f, 12.147f)
                lineToRelative(4.712f, -4.724f)
                lineToRelative(0.708f, 0.706f)
                lineToRelative(-3.86f, 3.871f)
                horizontalLineToRelative(19.045f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(12.473f)
                lineToRelative(3.857f, 3.858f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-4.712f, -4.712f)
                lineToRelative(-0.353f, -0.353f)
                close()
            }
        }
        .build()
        return _entranceMedium!!
    }

private var _entranceMedium: ImageVector? = null
