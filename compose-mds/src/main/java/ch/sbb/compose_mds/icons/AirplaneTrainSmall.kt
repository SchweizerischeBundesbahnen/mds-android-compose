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

public val SBBIcons.AirplaneTrainSmall: ImageVector
    get() {
        if (_airplaneTrainSmall != null) {
            return _airplaneTrainSmall!!
        }
        _airplaneTrainSmall = Builder(name = "AirplaneTrainSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.882f, 2.0f)
                lineToRelative(0.1f, 0.368f)
                lineToRelative(1.5f, 5.5f)
                lineToRelative(-0.964f, 0.264f)
                lineTo(11.118f, 3.0f)
                lineTo(9.566f, 3.0f)
                lineToRelative(1.0f, 8.0f)
                lineTo(5.691f, 11.0f)
                lineToRelative(-0.138f, -0.276f)
                lineTo(4.69f, 9.0f)
                lineTo(3.76f, 9.0f)
                lineToRelative(1.2f, 2.803f)
                lineToRelative(0.085f, 0.197f)
                lineToRelative(-0.084f, 0.197f)
                lineTo(3.759f, 15.0f)
                horizontalLineToRelative(0.932f)
                lineToRelative(0.862f, -1.724f)
                lineTo(5.69f, 13.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.309f, 14.0f)
                lineToRelative(-0.862f, 1.724f)
                lineTo(5.31f, 16.0f)
                lineTo(2.242f, 16.0f)
                lineToRelative(0.298f, -0.697f)
                lineTo(3.955f, 12.0f)
                lineTo(2.54f, 8.697f)
                lineTo(2.242f, 8.0f)
                lineTo(5.31f, 8.0f)
                lineToRelative(0.138f, 0.276f)
                lineTo(6.31f, 10.0f)
                horizontalLineToRelative(3.125f)
                lineToRelative(-1.0f, -8.0f)
                close()
                moveTo(19.354f, 5.354f)
                lineTo(4.354f, 20.354f)
                lineTo(3.646f, 19.647f)
                lineTo(18.646f, 4.647f)
                close()
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(2.829f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -1.824f, -1.72f)
                lineToRelative(0.39f, -0.92f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 2.555f, 2.742f)
                horizontalLineToRelative(0.001f)
                lineToRelative(1.877f, 5.264f)
                arcTo(1.85f, 1.85f, 0.0f, false, true, 20.16f, 20.0f)
                horizontalLineToRelative(-2.21f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.453f, 1.0f)
                lineTo(22.0f, 21.0f)
                verticalLineToRelative(1.0f)
                lineTo(10.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.503f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.453f, -1.0f)
                lineTo(10.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.16f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, 0.84f, -0.86f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.087f, -0.377f)
                lineToRelative(-0.014f, -0.026f)
                lineToRelative(-0.01f, -0.03f)
                lineToRelative(0.471f, -0.167f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(-0.472f, 0.168f)
                lineToRelative(-0.253f, -0.707f)
                lineTo(16.0f, 17.0f)
                close()
                moveTo(15.5f, 21.0f)
                curveToRelative(0.649f, 0.0f, 1.206f, -0.42f, 1.414f, -1.0f)
                horizontalLineToRelative(-2.828f)
                curveToRelative(0.208f, 0.58f, 0.765f, 1.0f, 1.414f, 1.0f)
                moveToRelative(3.71f, -8.0f)
                lineToRelative(1.07f, 3.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _airplaneTrainSmall!!
    }

private var _airplaneTrainSmall: ImageVector? = null
