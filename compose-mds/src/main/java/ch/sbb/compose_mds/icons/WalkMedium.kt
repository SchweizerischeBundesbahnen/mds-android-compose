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

public val SBBIcons.WalkMedium: ImageVector
    get() {
        if (_walkMedium != null) {
            return _walkMedium!!
        }
        _walkMedium = Builder(name = "WalkMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.25f, 8.25f)
                curveToRelative(0.0f, -0.524f, -0.477f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.476f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.476f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.476f, 1.0f, -1.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.077f, -0.925f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.923f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.924f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.924f, 2.0f, 2.0f)
                moveToRelative(-4.0f, 5.434f)
                lineToRelative(-3.5f, 2.333f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.518f)
                lineToRelative(4.849f, -3.232f)
                horizontalLineToRelative(3.358f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineTo(25.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.957f)
                lineToRelative(-2.293f, -2.293f)
                verticalLineToRelative(6.086f)
                lineToRelative(3.0f, 3.0f)
                verticalLineTo(30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.544f)
                lineToRelative(-2.707f, -2.706f)
                horizontalLineTo(16.25f)
                verticalLineToRelative(4.15f)
                lineToRelative(-3.084f, 4.627f)
                lineToRelative(-0.832f, -0.555f)
                lineToRelative(2.916f, -4.374f)
                verticalLineTo(13.684f)
                moveToRelative(1.0f, -0.434f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _walkMedium!!
    }

private var _walkMedium: ImageVector? = null
