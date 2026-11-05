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

public val SBBIcons.ShuttleSmall: ImageVector
    get() {
        if (_shuttleSmall != null) {
            return _shuttleSmall!!
        }
        _shuttleSmall = Builder(
            name = "ShuttleSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(5.464f, 3.464f)
                curveTo(5.184f, 3.744f, 5.0f, 4.215f, 5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 5.0f)
                curveToRelative(0.0f, -0.785f, -0.183f, -1.256f, -0.464f, -1.536f)
                curveTo(18.256f, 3.184f, 17.785f, 3.0f, 17.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                curveToRelative(-0.785f, 0.0f, -1.256f, 0.183f, -1.536f, 0.464f)
                moveTo(5.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(4.757f, 2.757f)
                curveTo(5.3f, 2.214f, 6.079f, 2.0f, 7.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.921f, 0.0f, 1.7f, 0.214f, 2.243f, 0.757f)
                reflectiveCurveTo(20.0f, 4.079f, 20.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.999f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 17.0f)
                lineTo(4.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -0.921f, 0.214f, -1.7f, 0.757f, -2.243f)
                moveTo(17.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.999f)
                close()
                moveTo(5.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(7.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(9.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveTo(5.977f, 20.0f)
                lineToRelative(1.017f, -0.994f)
                lineToRelative(-0.7f, -0.715f)
                lineTo(4.4f, 20.143f)
                lineToRelative(-0.366f, 0.359f)
                lineToRelative(0.368f, 0.357f)
                lineToRelative(1.896f, 1.842f)
                lineToRelative(0.696f, -0.717f)
                lineToRelative(-1.013f, -0.985f)
                lineTo(10.0f, 20.999f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.024f, 20.99f)
                lineTo(17.007f, 21.985f)
                lineTo(17.707f, 22.7f)
                lineTo(19.6f, 20.848f)
                lineTo(19.967f, 20.489f)
                lineTo(19.599f, 20.132f)
                lineTo(17.702f, 18.29f)
                lineTo(17.005f, 19.007f)
                lineTo(18.018f, 19.991f)
                lineTo(14.0f, 19.991f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _shuttleSmall!!
    }

private var _shuttleSmall: ImageVector? = null
