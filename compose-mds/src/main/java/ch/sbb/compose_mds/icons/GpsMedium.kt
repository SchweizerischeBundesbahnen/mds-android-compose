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

public val SBBIcons.GpsMedium: ImageVector
    get() {
        if (_gpsMedium != null) {
            return _gpsMedium!!
        }
        _gpsMedium = Builder(name = "GpsMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.256f, 7.762f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.261f)
                arcTo(10.977f, 10.977f, 0.0f, false, false, 7.76f, 18.251f)
                horizontalLineTo(4.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.261f)
                arcTo(10.98f, 10.98f, 0.0f, false, false, 18.256f, 29.74f)
                verticalLineTo(33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.26f)
                arcToRelative(10.98f, 10.98f, 0.0f, false, false, 10.483f, -10.496f)
                horizontalLineTo(33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.26f)
                arcTo(10.976f, 10.976f, 0.0f, false, false, 19.256f, 7.762f)
                moveTo(8.75f, 18.75f)
                curveToRelative(0.0f, -5.539f, 4.46f, -10.0f, 10.0f, -10.0f)
                reflectiveCurveToRelative(10.0f, 4.461f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.46f, 10.0f, -10.0f, 10.0f)
                arcToRelative(9.98f, 9.98f, 0.0f, false, true, -10.0f, -10.0f)
                moveToRelative(4.5f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -11.0f, 0.0f)
                moveToRelative(5.5f, -6.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.001f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
            }
        }
        .build()
        return _gpsMedium!!
    }

private var _gpsMedium: ImageVector? = null
