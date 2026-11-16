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

public val SBBIcons.TrainSkiMedium: ImageVector
    get() {
        if (_trainSkiMedium != null) {
            return _trainSkiMedium!!
        }
        _trainSkiMedium = Builder(name = "TrainSkiMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.75f, 6.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                moveToRelative(1.0f, 2.0f)
                verticalLineToRelative(7.268f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.0f, -0.268f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.0f, 0.268f)
                lineTo(23.75f, 8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                moveToRelative(-1.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                moveToRelative(-1.0f, 11.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(29.75f, 15.518f)
                lineTo(29.75f, 8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(7.268f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.0f, -0.268f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.0f, 0.268f)
                moveToRelative(0.0f, 1.732f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(29.75f, 22.25f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(32.75f, 17.25f)
                verticalLineToRelative(-9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(17.75f, 18.75f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-4.066f)
                lineToRelative(1.498f, 2.25f)
                lineTo(18.0f, 27.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.152f)
                lineToRelative(0.318f, 0.477f)
                lineToRelative(-0.832f, 0.554f)
                lineToRelative(-0.687f, -1.031f)
                lineTo(6.353f, 28.5f)
                lineToRelative(-0.687f, 1.031f)
                lineToRelative(-0.832f, -0.553f)
                lineToRelative(0.318f, -0.478f)
                lineTo(3.0f, 28.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.818f)
                lineToRelative(1.498f, -2.25f)
                lineTo(3.25f, 25.25f)
                verticalLineToRelative(-11.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                horizontalLineToRelative(2.94f)
                lineTo(8.065f, 7.5f)
                lineTo(6.0f, 7.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.068f)
                lineToRelative(-1.622f, 3.25f)
                horizontalLineToRelative(2.94f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                moveToRelative(-3.769f, 8.75f)
                lineToRelative(-1.499f, -2.25f)
                lineTo(8.518f, 25.25f)
                lineTo(7.019f, 27.5f)
                close()
                moveTo(11.813f, 7.5f)
                lineTo(10.5f, 10.135f)
                lineTo(9.184f, 7.5f)
                close()
                moveTo(16.75f, 18.25f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(4.25f, 24.25f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(-5.0f)
                lineTo(4.25f, 19.25f)
                close()
                moveTo(7.5f, 22.5f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 21.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 21.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _trainSkiMedium!!
    }

private var _trainSkiMedium: ImageVector? = null
