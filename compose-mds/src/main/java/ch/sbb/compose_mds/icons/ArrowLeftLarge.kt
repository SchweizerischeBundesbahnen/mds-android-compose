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

public val SBBIcons.ArrowLeftLarge: ImageVector
    get() {
        if (_arrowLeftLarge != null) {
            return _arrowLeftLarge!!
        }
        _arrowLeftLarge = Builder(name = "ArrowLeftLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 16.499f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-7.128f, 7.13f)
                horizontalLineToRelative(24.275f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(13.724f)
                lineToRelative(7.13f, 7.164f)
                lineToRelative(-0.354f, 0.352f)
                lineToRelative(-0.354f, 0.352f)
                lineToRelative(-7.98f, -8.015f)
                lineToRelative(-0.352f, -0.354f)
                lineToRelative(0.352f, -0.352f)
                lineToRelative(7.98f, -7.985f)
                close()
            }
        }
        .build()
        return _arrowLeftLarge!!
    }

private var _arrowLeftLarge: ImageVector? = null
