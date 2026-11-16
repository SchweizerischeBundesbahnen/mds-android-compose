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
        _shuttleSmall = Builder(name = "ShuttleSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 5.0f)
                curveToRelative(0.0f, -0.785f, -0.183f, -1.256f, -0.464f, -1.536f)
                curveTo(18.256f, 3.184f, 17.785f, 3.0f, 17.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                curveToRelative(-0.785f, 0.0f, -1.256f, 0.183f, -1.536f, 0.464f)
                curveTo(5.184f, 3.744f, 5.0f, 4.215f, 5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(5.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(-1.999f)
                verticalLineToRelative(1.0f)
                lineTo(19.0f, 16.0f)
                close()
                moveTo(8.0f, 15.0f)
                horizontalLineToRelative(8.001f)
                verticalLineToRelative(2.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -0.921f, -0.214f, -1.7f, -0.757f, -2.243f)
                reflectiveCurveTo(17.921f, 2.0f, 17.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-0.921f, 0.0f, -1.7f, 0.214f, -2.243f, 0.757f)
                reflectiveCurveTo(4.0f, 4.079f, 4.0f, 5.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(5.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 5.0f)
                lineTo(17.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(9.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-6.0f, 8.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.981f, 21.0f)
                lineToRelative(1.013f, 0.983f)
                lineToRelative(-0.696f, 0.718f)
                lineTo(4.4f, 20.86f)
                lineToRelative(-0.368f, -0.357f)
                lineToRelative(0.367f, -0.36f)
                lineToRelative(1.894f, -1.851f)
                lineToRelative(0.7f, 0.715f)
                lineTo(5.976f, 20.0f)
                close()
                moveTo(18.018f, 19.99f)
                lineTo(14.0f, 19.99f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.023f)
                lineToRelative(-1.016f, 0.995f)
                lineToRelative(0.7f, 0.715f)
                lineToRelative(1.893f, -1.852f)
                lineToRelative(0.367f, -0.359f)
                lineToRelative(-0.368f, -0.357f)
                lineToRelative(-1.897f, -1.842f)
                lineToRelative(-0.697f, 0.717f)
                close()
            }
        }
        .build()
        return _shuttleSmall!!
    }

private var _shuttleSmall: ImageVector? = null
