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

public val SBBIcons.ArrowChangeHorizontalMedium: ImageVector
    get() {
        if (_arrowChangeHorizontalMedium != null) {
            return _arrowChangeHorizontalMedium!!
        }
        _arrowChangeHorizontalMedium = Builder(name = "ArrowChangeHorizontalMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(24.354f, 4.147f)
                lineToRelative(5.25f, 5.25f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-5.25f, 5.25f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(4.396f, -4.397f)
                horizontalLineTo(11.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                horizontalLineToRelative(13.502f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                horizontalLineTo(7.958f)
                lineToRelative(4.396f, 4.396f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-5.25f, -5.25f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(5.25f, -5.25f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-4.398f, 4.397f)
                horizontalLineToRelative(16.796f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(11.25f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                horizontalLineToRelative(16.793f)
                lineToRelative(-4.396f, -4.396f)
                close()
            }
        }
        .build()
        return _arrowChangeHorizontalMedium!!
    }

private var _arrowChangeHorizontalMedium: ImageVector? = null
