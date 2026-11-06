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

public val SBBIcons.TrainSkiSmall: ImageVector
    get() {
        if (_trainSkiSmall != null) {
            return _trainSkiSmall!!
        }
        _trainSkiSmall = Builder(name = "TrainSkiSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.585f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.0f, 0.0f)
                lineTo(17.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                moveToRelative(0.0f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(16.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                moveTo(18.0f, 5.5f)
                lineTo(18.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(15.0f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(2.0f, 8.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                close()
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(20.0f, 10.085f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.0f, 0.0f)
                lineTo(21.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                close()
                moveTo(22.0f, 11.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(19.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.5f)
                moveTo(3.0f, 12.0f)
                lineTo(3.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 8.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 9.5f)
                lineTo(11.0f, 12.0f)
                close()
                moveTo(2.0f, 12.5f)
                verticalLineToRelative(-3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 7.0f)
                horizontalLineToRelative(1.69f)
                lineToRelative(-1.0f, -2.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.807f, 5.0f)
                lineTo(7.81f, 7.0f)
                lineTo(9.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 9.5f)
                lineTo(12.0f, 17.0f)
                lineTo(9.434f, 17.0f)
                lineToRelative(0.666f, 1.0f)
                lineTo(12.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.234f)
                lineToRelative(0.15f, 0.226f)
                lineToRelative(-0.832f, 0.554f)
                lineToRelative(-0.52f, -0.78f)
                lineTo(4.436f, 19.0f)
                lineToRelative(-0.52f, 0.78f)
                lineToRelative(-0.832f, -0.554f)
                lineToRelative(0.15f, -0.226f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.9f)
                lineToRelative(0.666f, -1.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-4.5f)
                moveTo(8.898f, 18.0f)
                lineToRelative(-0.666f, -1.0f)
                lineTo(5.768f, 17.0f)
                lineToRelative(-0.666f, 1.0f)
                close()
                moveTo(7.69f, 5.0f)
                lineTo(7.0f, 6.383f)
                lineTo(6.309f, 5.0f)
                close()
                moveTo(3.0f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _trainSkiSmall!!
    }

private var _trainSkiSmall: ImageVector? = null
