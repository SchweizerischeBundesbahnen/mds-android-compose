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

public val SBBIcons.ArrowChangeHorizontalLarge: ImageVector
    get() {
        if (_arrowChangeHorizontalLarge != null) {
            return _arrowChangeHorizontalLarge!!
        }
        _arrowChangeHorizontalLarge = Builder(name = "ArrowChangeHorizontalLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(39.207f, 12.5f)
                lineToRelative(-7.353f, 7.354f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(37.293f, 13.0f)
                horizontalLineTo(14.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                horizontalLineToRelative(18.002f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 0.0f, 13.0f)
                horizontalLineTo(9.707f)
                lineToRelative(6.147f, 6.147f)
                lineToRelative(-0.707f, 0.706f)
                lineTo(7.792f, 36.5f)
                lineToRelative(7.353f, -7.353f)
                lineToRelative(0.707f, 0.707f)
                lineTo(9.708f, 36.0f)
                horizontalLineToRelative(22.795f)
                arcToRelative(5.501f, 5.501f, 0.0f, false, false, 0.0f, -11.0f)
                horizontalLineTo(14.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 0.0f, -13.0f)
                horizontalLineToRelative(22.793f)
                lineToRelative(-6.146f, -6.146f)
                lineToRelative(0.707f, -0.708f)
                close()
            }
        }
        .build()
        return _arrowChangeHorizontalLarge!!
    }

private var _arrowChangeHorizontalLarge: ImageVector? = null
