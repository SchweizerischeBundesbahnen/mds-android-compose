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

public val SBBIcons.ControlsMedium: ImageVector
    get() {
        if (_controlsMedium != null) {
            return _controlsMedium!!
        }
        _controlsMedium = Builder(name = "ControlsMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.75f, 7.25f)
                curveToRelative(-1.471f, 0.0f, -2.5f, 1.029f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.029f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.028f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.029f, -2.5f, -2.5f, -2.5f)
                moveToRelative(-9.75f, 3.0f)
                horizontalLineToRelative(6.281f)
                curveToRelative(0.222f, 1.763f, 1.616f, 3.0f, 3.469f, 3.0f)
                reflectiveCurveToRelative(3.247f, -1.237f, 3.469f, -3.0f)
                lineTo(33.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                lineTo(16.219f, 9.25f)
                curveToRelative(-0.222f, -1.762f, -1.616f, -3.0f, -3.469f, -3.0f)
                reflectiveCurveToRelative(-3.247f, 1.238f, -3.469f, 3.0f)
                lineTo(3.0f, 9.25f)
                close()
                moveTo(23.25f, 16.25f)
                curveToRelative(-1.42f, 0.0f, -2.5f, 1.08f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.08f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.08f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.08f, -2.5f, -2.5f, -2.5f)
                moveToRelative(-3.467f, 2.0f)
                curveToRelative(0.234f, -1.725f, 1.665f, -3.0f, 3.467f, -3.0f)
                reflectiveCurveToRelative(3.233f, 1.275f, 3.467f, 3.0f)
                lineTo(33.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.283f)
                curveToRelative(-0.234f, 1.724f, -1.665f, 3.0f, -3.467f, 3.0f)
                reflectiveCurveToRelative(-3.233f, -1.276f, -3.466f, -3.0f)
                lineTo(3.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.25f, 27.75f)
                curveToRelative(0.0f, -1.445f, 1.054f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.055f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.054f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.055f, -2.5f, -2.5f)
                moveToRelative(2.5f, -3.5f)
                curveToRelative(-1.828f, 0.0f, -3.24f, 1.257f, -3.468f, 3.0f)
                lineTo(3.0f, 27.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.282f)
                curveToRelative(0.228f, 1.743f, 1.64f, 3.0f, 3.468f, 3.0f)
                reflectiveCurveToRelative(3.24f, -1.257f, 3.468f, -3.0f)
                lineTo(33.0f, 28.25f)
                verticalLineToRelative(-1.0f)
                lineTo(16.218f, 27.25f)
                curveToRelative(-0.228f, -1.743f, -1.64f, -3.0f, -3.468f, -3.0f)
            }
        }
        .build()
        return _controlsMedium!!
    }

private var _controlsMedium: ImageVector? = null
