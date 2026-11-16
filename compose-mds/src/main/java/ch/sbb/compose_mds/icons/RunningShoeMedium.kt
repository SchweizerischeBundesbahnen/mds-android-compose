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
                moveTo(15.926f, 9.584f)
                curveToRelative(-1.541f, -1.54f, -1.674f, -3.629f, -0.572f, -4.73f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(3.793f, 15.0f)
                lineToRelative(15.009f, 15.009f)
                lineToRelative(0.002f, -0.003f)
                curveToRelative(0.762f, 0.761f, 1.765f, 1.244f, 2.946f, 1.244f)
                horizontalLineToRelative(7.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.25f, -4.25f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -2.22f, -0.89f)
                lineToRelative(-4.814f, -12.293f)
                lineToRelative(-0.28f, -0.71f)
                lineToRelative(-0.54f, 0.54f)
                curveToRelative(-1.103f, 1.103f, -3.18f, 0.976f, -4.72f, -0.563f)
                moveToRelative(3.58f, 19.716f)
                lineTo(5.208f, 15.0f)
                lineToRelative(1.543f, -1.543f)
                lineTo(20.302f, 27.01f)
                lineToRelative(0.002f, -0.003f)
                curveToRelative(0.762f, 0.761f, 1.765f, 1.244f, 2.946f, 1.244f)
                horizontalLineToRelative(8.45f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, 2.0f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.89f, 0.0f, -1.646f, -0.357f, -2.241f, -0.952f)
                close()
                moveTo(21.006f, 26.3f)
                lineTo(7.458f, 12.75f)
                lineToRelative(6.172f, -6.173f)
                curveToRelative(-0.034f, 1.289f, 0.542f, 2.667f, 1.589f, 3.714f)
                curveToRelative(1.587f, 1.587f, 3.922f, 2.082f, 5.563f, 1.022f)
                lineToRelative(1.542f, 3.937f)
                lineTo(19.5f, 15.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.215f)
                lineToRelative(0.783f, 2.0f)
                lineTo(21.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.89f)
                lineToRelative(1.502f, 3.834f)
                lineToRelative(0.038f, 0.098f)
                lineToRelative(0.073f, 0.073f)
                arcTo(4.22f, 4.22f, 0.0f, false, false, 28.5f, 24.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.212f, 2.75f)
                lineTo(23.25f, 27.25f)
                curveToRelative(-0.89f, 0.0f, -1.646f, -0.357f, -2.241f, -0.952f)
                close()
                moveTo(15.0f, 28.75f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 29.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(12.0f, 26.75f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 25.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 22.75f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _runningShoeMedium!!
    }

private var _runningShoeMedium: ImageVector? = null
