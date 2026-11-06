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

public val SBBIcons.CheckpointsSmall: ImageVector
    get() {
        if (_checkpointsSmall != null) {
            return _checkpointsSmall!!
        }
        _checkpointsSmall = Builder(name = "CheckpointsSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.464f, 3.0f)
                horizontalLineTo(19.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 22.0f, 7.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-4.536f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.928f, 0.0f)
                horizontalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 13.5f)
                verticalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 18.0f)
                horizontalLineToRelative(10.536f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineTo(4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 16.5f)
                verticalLineToRelative(-3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 11.0f)
                horizontalLineToRelative(3.536f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.928f, 0.0f)
                horizontalLineTo(19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 9.5f)
                verticalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 6.0f)
                horizontalLineTo(8.964f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 5.5f, 2.0f)
                moveToRelative(13.0f, 14.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(1.853f, 1.853f)
                lineTo(18.0f, 20.207f)
                lineToRelative(-1.354f, -1.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(0.647f, 0.647f)
                lineToRelative(1.646f, -1.647f)
                close()
                moveTo(11.5f, 9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(1.853f, 1.853f)
                lineTo(11.0f, 13.207f)
                lineToRelative(-1.354f, -1.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(0.647f, 0.647f)
                lineToRelative(1.646f, -1.647f)
                close()
                moveTo(5.5f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(1.853f, 1.853f)
                lineTo(5.0f, 7.207f)
                lineTo(3.646f, 5.853f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(0.647f, 0.647f)
                lineToRelative(1.646f, -1.647f)
                close()
            }
        }
        .build()
        return _checkpointsSmall!!
    }

private var _checkpointsSmall: ImageVector? = null
