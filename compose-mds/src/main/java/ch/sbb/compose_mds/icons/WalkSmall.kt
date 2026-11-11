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

public val SBBIcons.WalkSmall: ImageVector
    get() {
        if (_walkSmall != null) {
            return _walkSmall!!
        }
        _walkSmall = Builder(name = "WalkSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 5.5f)
                curveToRelative(0.0f, -0.257f, -0.243f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.243f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.243f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.243f, 0.5f, -0.5f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.81f, -0.691f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(10.0f, 6.31f, 10.0f, 5.5f)
                reflectiveCurveTo(10.69f, 4.0f, 11.5f, 4.0f)
                reflectiveCurveToRelative(1.5f, 0.69f, 1.5f, 1.5f)
                moveToRelative(-3.0f, 3.934f)
                lineToRelative(-2.0f, 1.333f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-3.768f)
                lineTo(10.349f, 8.0f)
                horizontalLineToRelative(2.358f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.707f)
                lineTo(13.0f, 9.707f)
                verticalLineToRelative(3.586f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.293f)
                lineTo(12.293f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(2.651f)
                lineToRelative(-2.084f, 3.126f)
                lineToRelative(-0.832f, -0.555f)
                lineTo(10.0f, 16.348f)
                verticalLineTo(9.434f)
                moveTo(11.0f, 9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _walkSmall!!
    }

private var _walkSmall: ImageVector? = null
