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

public val SBBIcons.TrainMedium: ImageVector
    get() {
        if (_trainMedium != null) {
            return _trainMedium!!
        }
        _trainMedium = Builder(name = "TrainMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 3.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.732f)
                lineToRelative(-2.333f, 3.5f)
                lineTo(24.0f, 7.75f)
                arcTo(4.25f, 4.25f, 0.0f, false, true, 28.25f, 12.0f)
                verticalLineToRelative(14.75f)
                horizontalLineToRelative(-3.44f)
                lineToRelative(1.0f, 2.0f)
                lineTo(27.0f, 28.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.69f)
                lineToRelative(1.0f, 2.0f)
                horizontalLineToRelative(1.19f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.19f)
                lineToRelative(1.0f, -2.0f)
                lineTo(9.0f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.19f)
                lineToRelative(1.0f, -2.0f)
                lineTo(7.75f, 26.75f)
                lineTo(7.75f, 12.0f)
                arcTo(4.25f, 4.25f, 0.0f, false, true, 12.0f, 7.75f)
                horizontalLineToRelative(5.065f)
                lineToRelative(-2.333f, -3.5f)
                lineTo(12.0f, 4.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.0f, 7.349f)
                lineTo(20.066f, 4.25f)
                horizontalLineToRelative(-4.132f)
                close()
                moveTo(21.0f, 10.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.81f, 31.75f)
                lineTo(10.81f, 29.75f)
                horizontalLineToRelative(14.38f)
                lineToRelative(1.0f, 2.0f)
                close()
                moveTo(24.69f, 28.75f)
                lineTo(23.69f, 26.75f)
                lineTo(12.31f, 26.75f)
                lineToRelative(-1.0f, 2.0f)
                close()
                moveTo(27.25f, 18.25f)
                lineTo(27.25f, 12.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 24.0f, 8.75f)
                lineTo(12.0f, 8.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 8.75f, 12.0f)
                verticalLineToRelative(6.25f)
                close()
                moveTo(8.75f, 25.75f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(22.75f, 22.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.25f, 0.25f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, -0.001f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                moveToRelative(-10.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.501f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
            }
        }
        .build()
        return _trainMedium!!
    }

private var _trainMedium: ImageVector? = null
