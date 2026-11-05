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

public val SBBIcons.ArrowLeftMedium: ImageVector
    get() {
        if (_arrowLeftMedium != null) {
            return _arrowLeftMedium!!
        }
        _arrowLeftMedium = Builder(name = "ArrowLeftMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(9.411f, 18.384f)
                lineToRelative(5.985f, -5.988f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(-5.132f, 5.134f)
                horizontalLineTo(28.5f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(10.968f)
                lineToRelative(5.136f, 5.16f)
                lineToRelative(-0.708f, 0.705f)
                lineTo(9.41f, 19.09f)
                lineToRelative(-0.352f, -0.353f)
                close()
            }
        }
        .build()
        return _arrowLeftMedium!!
    }

private var _arrowLeftMedium: ImageVector? = null
