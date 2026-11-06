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

public val SBBIcons.RunningShoeMedium: ImageVector
    get() {
        if (_runningShoeMedium != null) {
            return _runningShoeMedium!!
        }
        _runningShoeMedium = Builder(name = "RunningShoeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.925f, 9.584f)
                curveToRelative(-1.54f, -1.54f, -1.673f, -3.629f, -0.571f, -4.73f)
                lineToRelative(-0.708f, -0.708f)
                lineToRelative(-8.25f, 8.25f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(14.655f, 14.655f)
                lineToRelative(0.002f, -0.002f)
                curveToRelative(0.762f, 0.761f, 1.766f, 1.243f, 2.947f, 1.243f)
                horizontalLineToRelative(7.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.25f, -4.25f)
                curveToRelative(-0.86f, 0.0f, -1.635f, -0.334f, -2.217f, -0.881f)
                lineToRelative(-4.817f, -12.301f)
                lineToRelative(-0.28f, -0.712f)
                lineToRelative(-0.54f, 0.54f)
                curveToRelative(-1.103f, 1.104f, -3.181f, 0.977f, -4.72f, -0.562f)
                moveToRelative(-0.707f, 0.707f)
                curveToRelative(-1.047f, -1.047f, -1.623f, -2.424f, -1.59f, -3.713f)
                lineToRelative(-6.17f, 6.172f)
                lineTo(21.006f, 26.3f)
                lineToRelative(0.002f, -0.002f)
                curveToRelative(0.594f, 0.595f, 1.351f, 0.952f, 2.241f, 0.952f)
                horizontalLineToRelative(8.462f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 28.5f, 24.5f)
                arcToRelative(4.22f, 4.22f, 0.0f, false, true, -2.997f, -1.245f)
                lineToRelative(-0.074f, -0.074f)
                lineToRelative(-0.038f, -0.097f)
                lineToRelative(-1.501f, -3.834f)
                lineTo(21.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.498f)
                lineToRelative(-0.783f, -2.0f)
                lineTo(19.5f, 16.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.823f)
                lineToRelative(-1.54f, -3.934f)
                curveToRelative(-1.642f, 1.059f, -3.978f, 0.562f, -5.565f, -1.025f)
                moveTo(5.208f, 15.0f)
                lineToRelative(1.542f, -1.543f)
                lineTo(20.301f, 27.01f)
                lineToRelative(0.002f, -0.002f)
                curveToRelative(0.762f, 0.761f, 1.766f, 1.243f, 2.947f, 1.243f)
                horizontalLineToRelative(8.45f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, 2.0f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.89f, 0.0f, -1.647f, -0.357f, -2.241f, -0.952f)
                lineToRelative(-0.002f, 0.002f)
                close()
                moveTo(9.0f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 25.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(3.0f, 22.75f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 23.75f)
                close()
            }
        }
        .build()
        return _runningShoeMedium!!
    }

private var _runningShoeMedium: ImageVector? = null
