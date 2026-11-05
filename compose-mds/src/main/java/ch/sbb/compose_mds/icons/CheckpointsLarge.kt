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

public val SBBIcons.CheckpointsLarge: ImageVector
    get() {
        if (_checkpointsLarge != null) {
            return _checkpointsLarge!!
        }
        _checkpointsLarge = Builder(name = "CheckpointsLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.478f, 6.0f)
                horizontalLineTo(39.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, 4.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, 4.5f)
                lineToRelative(-9.522f, -0.001f)
                arcToRelative(6.498f, 6.498f, 0.0f, false, true, -12.957f, 0.0f)
                horizontalLineTo(9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.5f, 27.0f)
                verticalLineToRelative(6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.0f, 36.5f)
                horizontalLineTo(30.52f)
                arcTo(6.498f, 6.498f, 0.0f, false, true, 43.5f, 37.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -12.979f, 0.5f)
                horizontalLineTo(9.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 4.5f, 33.0f)
                verticalLineToRelative(-6.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 9.0f, 22.5f)
                horizontalLineToRelative(7.52f)
                arcToRelative(6.499f, 6.499f, 0.0f, false, true, 12.958f, -0.001f)
                lineTo(39.0f, 22.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                horizontalLineTo(17.478f)
                arcTo(6.498f, 6.498f, 0.0f, false, true, 4.5f, 11.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 11.0f, 4.5f)
                moveToRelative(26.0f, 27.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, -11.0f)
                moveToRelative(3.353f, 3.853f)
                lineTo(36.0f, 39.707f)
                lineToRelative(-2.354f, -2.354f)
                lineToRelative(0.707f, -0.707f)
                lineTo(36.0f, 38.293f)
                lineToRelative(3.646f, -3.647f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, -11.0f)
                moveToRelative(3.353f, 3.853f)
                lineTo(22.0f, 25.706f)
                lineToRelative(-2.354f, -2.354f)
                lineToRelative(0.707f, -0.707f)
                lineTo(22.0f, 24.292f)
                lineToRelative(3.646f, -3.647f)
                close()
                moveTo(11.0f, 5.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, -11.0f)
                moveToRelative(3.353f, 3.853f)
                lineTo(10.0f, 13.707f)
                lineToRelative(-2.354f, -2.354f)
                lineToRelative(0.707f, -0.707f)
                lineTo(10.0f, 12.293f)
                lineToRelative(3.646f, -3.647f)
                close()
            }
        }
        .build()
        return _checkpointsLarge!!
    }

private var _checkpointsLarge: ImageVector? = null
