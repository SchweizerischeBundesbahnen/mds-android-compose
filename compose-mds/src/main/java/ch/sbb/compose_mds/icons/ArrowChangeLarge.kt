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

public val SBBIcons.ArrowChangeLarge: ImageVector
    get() {
        if (_arrowChangeLarge != null) {
            return _arrowChangeLarge!!
        }
        _arrowChangeLarge = Builder(name = "ArrowChangeLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.86f, 15.152f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-6.146f, -6.146f)
                verticalLineToRelative(22.793f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 11.0f, 0.0f)
                verticalLineTo(14.504f)
                arcToRelative(6.501f, 6.501f, 0.0f, false, true, 13.0f, 0.0f)
                verticalLineToRelative(22.794f)
                lineToRelative(6.145f, -6.146f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-7.353f, 7.354f)
                lineToRelative(-7.354f, -7.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(6.148f, 6.148f)
                verticalLineTo(14.504f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -11.0f, 0.0f)
                verticalLineToRelative(18.002f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -13.0f, 0.0f)
                verticalLineTo(9.713f)
                lineTo(5.86f, 15.859f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(12.507f, 7.8f)
                close()
            }
        }
        .build()
        return _arrowChangeLarge!!
    }

private var _arrowChangeLarge: ImageVector? = null
