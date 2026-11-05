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
        _runMedium = Builder(
            name = "RunMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(24.75f, 7.25f)
                curveToRelative(-0.523f, 0.0f, -1.0f, 0.477f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.477f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.477f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.477f, -1.0f, -1.0f, -1.0f)
                moveToRelative(-2.0f, 1.0f)
                curveToRelative(0.0f, -1.076f, 0.924f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.924f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.924f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.924f, -2.0f, -2.0f)
                moveToRelative(9.218f, 1.676f)
                lineToRelative(-2.25f, 6.0f)
                lineToRelative(-0.273f, 0.727f)
                lineToRelative(-0.549f, -0.55f)
                lineToRelative(-2.339f, -2.339f)
                lineToRelative(-1.251f, 6.256f)
                lineToRelative(4.221f, 2.814f)
                lineToRelative(0.223f, 0.148f)
                lineTo(29.75f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.482f)
                lineToRelative(-4.151f, -2.768f)
                lineTo(22.11f, 20.75f)
                lineToRelative(-1.386f, 4.158f)
                lineToRelative(-0.058f, 0.176f)
                lineToRelative(-0.159f, 0.095f)
                lineToRelative(-7.5f, 4.5f)
                lineToRelative(-0.514f, -0.858f)
                lineToRelative(7.341f, -4.405f)
                lineToRelative(1.432f, -4.295f)
                lineToRelative(1.339f, -6.694f)
                lineToRelative(-4.732f, 1.183f)
                lineToRelative(1.358f, 4.753f)
                lineToRelative(-0.962f, 0.274f)
                lineToRelative(-1.5f, -5.25f)
                lineToRelative(-0.142f, -0.497f)
                lineToRelative(0.502f, -0.125f)
                lineToRelative(6.0f, -1.5f)
                lineToRelative(0.06f, -0.015f)
                horizontalLineToRelative(3.268f)
                lineToRelative(0.147f, 0.146f)
                lineToRelative(2.45f, 2.451f)
                lineToRelative(1.978f, -5.273f)
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
                moveTo(6.0f, 18.25f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 19.25f)
                close()
                moveTo(15.0f, 9.25f)
                lineTo(9.0f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
            .build()
        return _runMedium!!
    }

private var _runMedium: ImageVector? = null
