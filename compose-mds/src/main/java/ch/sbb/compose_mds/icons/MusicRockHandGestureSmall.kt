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

public val SBBIcons.MusicRockHandGestureSmall: ImageVector
    get() {
        if (_musicRockHandGestureSmall != null) {
            return _musicRockHandGestureSmall!!
        }
        _musicRockHandGestureSmall = Builder(name = "MusicRockHandGestureSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.3f, 0.707f, 2.464f, 1.75f, 3.067f)
                lineToRelative(0.25f, 0.145f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.288f)
                lineToRelative(0.25f, -0.145f)
                arcTo(3.56f, 3.56f, 0.0f, false, false, 10.0f, 10.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                moveToRelative(7.5f, 0.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, true, -2.0f, 3.777f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.723f)
                arcTo(4.56f, 4.56f, 0.0f, false, true, 2.0f, 10.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                verticalLineToRelative(1.585f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 0.297f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 7.085f)
                verticalLineTo(5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                moveToRelative(8.0f, 9.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                curveToRelative(0.364f, 0.0f, 0.706f, 0.097f, 1.0f, 0.268f)
                verticalLineTo(10.09f)
                lineToRelative(-5.0f, 0.834f)
                verticalLineTo(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -1.0f, -1.732f)
                verticalLineTo(8.076f)
                lineToRelative(0.418f, -0.07f)
                lineToRelative(6.0f, -1.0f)
                lineTo(22.0f, 6.91f)
                verticalLineTo(15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                moveToRelative(-6.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(2.0f, -5.09f)
                lineToRelative(5.0f, -0.834f)
                verticalLineTo(8.09f)
                lineToRelative(-5.0f, 0.834f)
                close()
                moveTo(4.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _musicRockHandGestureSmall!!
    }

private var _musicRockHandGestureSmall: ImageVector? = null
