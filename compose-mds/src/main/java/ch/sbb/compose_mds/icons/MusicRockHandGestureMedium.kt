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

public val SBBIcons.MusicRockHandGestureMedium: ImageVector
    get() {
        if (_musicRockHandGestureMedium != null) {
            return _musicRockHandGestureMedium!!
        }
        _musicRockHandGestureMedium = Builder(name = "MusicRockHandGestureMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 6.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(2.77f)
                arcToRelative(1.995f, 1.995f, 0.0f, false, true, 2.5f, 0.408f)
                arcToRelative(1.995f, 1.995f, 0.0f, false, true, 2.5f, -0.409f)
                lineTo(12.25f, 8.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, -3.0f, 5.526f)
                verticalLineToRelative(1.474f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.474f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, true, -3.0f, -5.526f)
                verticalLineToRelative(-7.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                moveToRelative(-1.0f, 2.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 2.04f, 1.11f, 3.868f, 2.75f, 4.817f)
                lineToRelative(0.25f, 0.145f)
                verticalLineToRelative(2.038f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.038f)
                lineToRelative(0.25f, -0.145f)
                lineToRelative(0.25f, 0.433f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-0.251f, -0.433f)
                curveToRelative(1.64f, -0.949f, 2.75f, -2.777f, 2.75f, -4.817f)
                verticalLineToRelative(-7.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                lineTo(13.25f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                lineTo(10.25f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(7.25f, 15.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(6.25f, 8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                moveTo(30.0f, 20.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -3.5f)
                moveToRelative(0.0f, -1.0f)
                curveToRelative(0.665f, 0.0f, 1.274f, 0.236f, 1.75f, 0.629f)
                verticalLineToRelative(-5.54f)
                lineToRelative(-8.0f, 1.334f)
                lineTo(23.75f, 24.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -1.0f, -2.121f)
                verticalLineToRelative(-9.553f)
                lineToRelative(0.418f, -0.07f)
                lineToRelative(9.0f, -1.5f)
                lineToRelative(0.582f, -0.096f)
                lineTo(32.75f, 22.5f)
                arcTo(2.75f, 2.75f, 0.0f, true, true, 30.0f, 19.75f)
                moveToRelative(-9.0f, 2.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -3.5f)
                moveToRelative(2.75f, -9.077f)
                verticalLineToRelative(1.986f)
                lineToRelative(8.0f, -1.333f)
                lineTo(31.75f, 11.84f)
                close()
                moveTo(13.75f, 30.25f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _musicRockHandGestureMedium!!
    }

private var _musicRockHandGestureMedium: ImageVector? = null
