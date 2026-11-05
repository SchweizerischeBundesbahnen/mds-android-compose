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

public val SBBIcons.TrainSmall: ImageVector
    get() {
        if (_trainSmall != null) {
            return _trainSmall!!
        }
        _trainSmall = Builder(name = "TrainSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.732f)
                lineToRelative(-1.333f, 2.0f)
                lineTo(16.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.191f)
                lineToRelative(0.5f, 1.0f)
                lineTo(18.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.191f)
                lineToRelative(0.5f, 1.0f)
                lineTo(19.0f, 21.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.691f)
                lineToRelative(0.5f, -1.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.691f)
                lineToRelative(0.5f, -1.0f)
                lineTo(5.0f, 18.0f)
                lineTo(5.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(3.065f)
                lineTo(9.732f, 3.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(12.0f, 4.599f)
                lineTo(13.066f, 3.0f)
                horizontalLineToRelative(-2.132f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(10.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.809f, 21.0f)
                lineToRelative(0.5f, -1.0f)
                horizontalLineToRelative(9.382f)
                lineToRelative(0.5f, 1.0f)
                close()
                moveTo(16.191f, 19.0f)
                lineTo(15.691f, 18.0f)
                lineTo(8.309f, 18.0f)
                lineToRelative(-0.5f, 1.0f)
                close()
                moveTo(6.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(18.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(8.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(14.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.002f, 0.001f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 15.0f)
                moveToRelative(-5.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 9.002f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 14.0f)
            }
        }
        .build()
        return _trainSmall!!
    }

private var _trainSmall: ImageVector? = null
