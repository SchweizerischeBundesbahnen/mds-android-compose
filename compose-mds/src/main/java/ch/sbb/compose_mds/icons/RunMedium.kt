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

public val SBBIcons.RunMedium: ImageVector
    get() {
        if (_runMedium != null) {
            return _runMedium!!
        }
        _runMedium = Builder(name = "RunMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.75f, 8.25f)
                curveToRelative(0.0f, -0.523f, -0.477f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.477f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.477f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.477f, 1.0f, -1.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.076f, -0.924f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.924f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.924f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.924f, 2.0f, 2.0f)
                moveToRelative(5.218f, 1.676f)
                lineToRelative(-2.523f, 6.726f)
                lineToRelative(-2.888f, -2.888f)
                lineToRelative(-1.251f, 6.256f)
                lineToRelative(4.444f, 2.962f)
                lineTo(29.75f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.482f)
                lineToRelative(-4.151f, -2.768f)
                lineTo(22.11f, 20.75f)
                lineToRelative(-1.445f, 4.334f)
                lineToRelative(-0.16f, 0.095f)
                lineToRelative(-7.5f, 4.5f)
                lineToRelative(-0.513f, -0.858f)
                lineToRelative(7.34f, -4.404f)
                lineToRelative(1.434f, -4.299f)
                lineToRelative(1.338f, -6.691f)
                lineToRelative(-4.733f, 1.182f)
                lineToRelative(1.358f, 4.753f)
                lineToRelative(-0.96f, 0.276f)
                lineToRelative(-1.5f, -5.25f)
                lineToRelative(-0.143f, -0.497f)
                lineToRelative(0.502f, -0.126f)
                lineToRelative(6.0f, -1.5f)
                lineToRelative(0.06f, -0.015f)
                horizontalLineToRelative(3.268f)
                lineToRelative(2.598f, 2.598f)
                lineToRelative(1.977f, -5.274f)
                close()
                moveTo(22.485f, 19.75f)
                horizontalLineToRelative(1.855f)
                lineToRelative(1.3f, -6.5f)
                horizontalLineToRelative(-1.855f)
                close()
                moveTo(13.5f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.5f, 18.25f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 9.25f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _runMedium!!
    }

private var _runMedium: ImageVector? = null
