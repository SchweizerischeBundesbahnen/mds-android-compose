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

public val SBBIcons.WineCheeseMedium: ImageVector
    get() {
        if (_wineCheeseMedium != null) {
            return _wineCheeseMedium!!
        }
        _wineCheeseMedium = Builder(name = "WineCheeseMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.75f, 3.25f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.5f)
                horizontalLineTo(12.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.75f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(4.75f)
                verticalLineTo(13.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, -2.75f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(-7.5f)
                moveToRelative(6.0f, 10.25f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(13.5f)
                curveToRelative(0.0f, -0.966f, 0.783f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.5f)
                horizontalLineTo(12.0f)
                curveToRelative(0.967f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                moveToRelative(4.0f, 12.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                moveToRelative(1.75f, -2.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -5.5f)
                moveToRelative(6.75f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(-10.0f, -8.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-4.203f)
                lineToRelative(-0.248f, -0.144f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, -1.252f, -2.153f)
                curveToRelative(0.0f, -0.918f, 0.503f, -1.716f, 1.252f, -2.153f)
                lineToRelative(0.248f, -0.144f)
                verticalLineTo(19.75f)
                horizontalLineToRelative(-5.5f)
                verticalLineTo(21.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(-9.5f)
                moveToRelative(0.5f, 12.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(21.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 5.5f, 0.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.642f)
                curveToRelative(-0.9f, 0.63f, -1.5f, 1.668f, -1.5f, 2.858f)
                reflectiveCurveToRelative(0.6f, 2.228f, 1.5f, 2.858f)
                verticalLineToRelative(2.642f)
                close()
            }
        }
        .build()
        return _wineCheeseMedium!!
    }

private var _wineCheeseMedium: ImageVector? = null
