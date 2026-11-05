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

public val SBBIcons.TrainLarge: ImageVector
    get() {
        if (_trainLarge != null) {
            return _trainLarge!!
        }
        _trainLarge = Builder(name = "TrainLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.0f, 5.0f)
                lineTo(16.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.732f)
                lineToRelative(3.334f, 5.0f)
                horizontalLineToRelative(-7.374f)
                curveTo(12.567f, 11.0f, 10.0f, 13.445f, 10.0f, 16.5f)
                lineTo(10.0f, 36.0f)
                horizontalLineToRelative(5.139f)
                lineToRelative(-1.143f, 2.0f)
                lineTo(12.0f, 38.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.424f)
                lineToRelative(-1.714f, 3.0f)
                lineTo(10.0f, 42.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.71f)
                lineToRelative(-1.714f, -3.0f)
                lineTo(36.0f, 39.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.996f)
                lineToRelative(-1.142f, -2.0f)
                lineTo(38.0f, 36.0f)
                lineTo(38.0f, 16.5f)
                curveToRelative(0.0f, -3.055f, -2.566f, -5.5f, -5.692f, -5.5f)
                horizontalLineToRelative(-7.374f)
                lineToRelative(3.334f, -5.0f)
                lineTo(32.0f, 6.0f)
                close()
                moveTo(27.066f, 6.0f)
                lineTo(24.0f, 10.598f)
                lineTo(20.934f, 6.0f)
                close()
                moveTo(20.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.0f, 28.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.001f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 28.0f)
                moveToRelative(-1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.001f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 30.0f)
                moveToRelative(-0.424f, 9.0f)
                lineToRelative(-1.715f, 3.0f)
                lineTo(35.14f, 42.0f)
                lineToRelative(-1.715f, -3.0f)
                close()
                moveTo(31.71f, 36.0f)
                lineTo(32.852f, 38.0f)
                lineTo(15.148f, 38.0f)
                lineToRelative(1.142f, -2.0f)
                close()
                moveTo(30.0f, 30.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.001f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 30.0f)
                moveToRelative(2.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.001f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 32.0f, 29.0f)
                moveToRelative(-21.0f, 6.0f)
                lineTo(11.0f, 25.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(37.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -2.468f, 2.083f, -4.5f, 4.692f, -4.5f)
                horizontalLineToRelative(16.616f)
                curveTo(34.918f, 12.0f, 37.0f, 14.032f, 37.0f, 16.5f)
                close()
                moveTo(26.166f, 29.5f)
                lineTo(24.722f, 28.0f)
                horizontalLineToRelative(1.083f)
                lineToRelative(1.806f, 2.0f)
                lineToRelative(-1.806f, 2.0f)
                horizontalLineToRelative(-1.083f)
                lineToRelative(1.444f, -1.5f)
                lineTo(24.45f, 30.5f)
                lineTo(24.45f, 32.0f)
                horizontalLineToRelative(-0.902f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.715f)
                lineToRelative(1.445f, 1.5f)
                horizontalLineToRelative(-1.083f)
                lineToRelative(-1.806f, -2.0f)
                lineToRelative(1.806f, -2.0f)
                horizontalLineToRelative(1.083f)
                lineToRelative(-1.445f, 1.5f)
                horizontalLineToRelative(1.715f)
                lineTo(23.548f, 28.0f)
                horizontalLineToRelative(0.902f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _trainLarge!!
    }

private var _trainLarge: ImageVector? = null
