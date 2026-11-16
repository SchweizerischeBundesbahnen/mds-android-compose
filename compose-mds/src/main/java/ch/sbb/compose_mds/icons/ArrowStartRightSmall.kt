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

public val SBBIcons.ArrowStartRightSmall: ImageVector
    get() {
        if (_arrowStartRightSmall != null) {
            return _arrowStartRightSmall!!
        }
        _arrowStartRightSmall = Builder(name = "ArrowStartRightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.844f, 12.138f)
                lineToRelative(0.352f, 0.353f)
                lineToRelative(-0.351f, 0.353f)
                lineToRelative(-3.99f, 4.008f)
                lineToRelative(-0.71f, -0.705f)
                lineToRelative(3.141f, -3.156f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.283f)
                lineToRelative(-3.137f, -3.138f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(4.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _arrowStartRightSmall!!
    }

private var _arrowStartRightSmall: ImageVector? = null
