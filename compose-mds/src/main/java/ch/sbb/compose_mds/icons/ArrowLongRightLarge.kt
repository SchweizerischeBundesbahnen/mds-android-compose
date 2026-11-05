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

public val SBBIcons.ArrowLongRightLarge: ImageVector
    get() {
        if (_arrowLongRightLarge != null) {
            return _arrowLongRightLarge!!
        }
        _arrowLongRightLarge = Builder(name = "ArrowLongRightLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(39.835f, 24.13f)
                lineToRelative(0.353f, 0.352f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-6.284f, 6.299f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(5.43f, -5.445f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(30.274f)
                lineToRelative(-5.43f, -5.428f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _arrowLongRightLarge!!
    }

private var _arrowLongRightLarge: ImageVector? = null
