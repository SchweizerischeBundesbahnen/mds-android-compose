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

public val SBBIcons.ArrowEndRightMedium: ImageVector
    get() {
        if (_arrowEndRightMedium != null) {
            return _arrowEndRightMedium!!
        }
        _arrowEndRightMedium = Builder(name = "ArrowEndRightMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(22.089f, 18.384f)
                lineToRelative(0.352f, 0.353f)
                lineToRelative(-0.352f, 0.353f)
                lineToRelative(-5.984f, 6.012f)
                lineToRelative(-0.71f, -0.705f)
                lineToRelative(5.136f, -5.16f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(14.528f)
                lineToRelative(-5.131f, -5.134f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(28.5f, 24.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _arrowEndRightMedium!!
    }

private var _arrowEndRightMedium: ImageVector? = null
