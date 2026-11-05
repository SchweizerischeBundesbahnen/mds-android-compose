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

public val SBBIcons.ArrowStartLeftMedium: ImageVector
    get() {
        if (_arrowStartLeftMedium != null) {
            return _arrowStartLeftMedium!!
        }
        _arrowStartLeftMedium = Builder(
            name = "ArrowStartLeftMedium",
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
                moveToRelative(12.396f, 12.396f)
                lineToRelative(-5.985f, 5.988f)
                lineToRelative(-0.352f, 0.353f)
                lineToRelative(0.352f, 0.353f)
                lineToRelative(5.985f, 6.012f)
                lineToRelative(0.708f, -0.705f)
                lineToRelative(-5.136f, -5.16f)
                horizontalLineTo(22.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.972f)
                lineToRelative(5.132f, -5.134f)
                close()
                moveTo(30.0f, 13.5f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(13.5f)
                close()
            }
        }
            .build()
        return _arrowStartLeftMedium!!
    }

private var _arrowStartLeftMedium: ImageVector? = null
