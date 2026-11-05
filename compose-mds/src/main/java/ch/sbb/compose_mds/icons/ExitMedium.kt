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

public val SBBIcons.ExitMedium: ImageVector
    get() {
        if (_exitMedium != null) {
            return _exitMedium!!
        }
        _exitMedium = Builder(
            name = "ExitMedium",
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
                moveToRelative(21.141f, 7.435f)
                lineToRelative(4.713f, 4.711f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.352f, 0.353f)
                lineToRelative(-4.713f, 4.724f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(3.861f, -3.87f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.043f)
                lineToRelative(-3.859f, -3.858f)
                close()
            }
        }
            .build()
        return _exitMedium!!
    }

private var _exitMedium: ImageVector? = null
