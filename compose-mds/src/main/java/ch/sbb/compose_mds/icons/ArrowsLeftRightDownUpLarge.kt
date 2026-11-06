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

public val SBBIcons.ArrowsLeftRightDownUpLarge: ImageVector
    get() {
        if (_arrowsLeftRightDownUpLarge != null) {
            return _arrowsLeftRightDownUpLarge!!
        }
        _arrowsLeftRightDownUpLarge = Builder(name = "ArrowsLeftRightDownUpLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.855f, 5.648f)
                lineToRelative(7.706f, 7.789f)
                lineToRelative(-0.711f, 0.703f)
                lineTo(24.0f, 7.217f)
                verticalLineToRelative(15.785f)
                horizontalLineToRelative(15.795f)
                lineToRelative(-6.148f, -6.148f)
                lineToRelative(0.706f, -0.707f)
                lineToRelative(7.354f, 7.353f)
                lineToRelative(-7.354f, 7.354f)
                lineToRelative(-0.706f, -0.707f)
                lineToRelative(6.143f, -6.145f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(15.781f)
                lineToRelative(6.833f, -6.928f)
                lineToRelative(0.356f, 0.35f)
                lineToRelative(0.356f, 0.35f)
                lineToRelative(-7.684f, 7.796f)
                lineToRelative(-0.355f, 0.36f)
                lineToRelative(-0.357f, -0.36f)
                lineToRelative(-7.706f, -7.788f)
                lineToRelative(0.711f, -0.704f)
                lineTo(23.0f, 39.777f)
                verticalLineTo(24.001f)
                horizontalLineTo(7.208f)
                lineToRelative(6.146f, 6.145f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(5.292f, 23.5f)
                lineToRelative(7.353f, -7.353f)
                lineToRelative(0.707f, 0.707f)
                lineTo(7.206f, 23.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.219f)
                lineToRelative(-6.828f, 6.925f)
                lineToRelative(-0.357f, -0.352f)
                lineToRelative(-0.356f, -0.35f)
                lineToRelative(7.685f, -7.794f)
                lineToRelative(0.355f, -0.36f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightDownUpLarge!!
    }

private var _arrowsLeftRightDownUpLarge: ImageVector? = null
