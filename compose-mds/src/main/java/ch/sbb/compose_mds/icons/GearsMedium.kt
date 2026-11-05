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

public val SBBIcons.GearsMedium: ImageVector
    get() {
        if (_gearsMedium != null) {
            return _gearsMedium!!
        }
        _gearsMedium = Builder(
            name = "GearsMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(19.25f, 4.5f)
                verticalLineToRelative(3.261f)
                curveToRelative(1.645f, 0.073f, 3.193f, 0.501f, 4.568f, 1.21f)
                lineToRelative(1.624f, -2.812f)
                lineToRelative(0.866f, 0.5f)
                lineToRelative(-1.623f, 2.811f)
                curveToRelative(1.345f, 0.858f, 2.487f, 2.0f, 3.345f, 3.345f)
                lineToRelative(2.81f, -1.623f)
                lineToRelative(0.5f, 0.866f)
                lineToRelative(-2.811f, 1.624f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 1.21f, 4.568f)
                lineTo(33.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.26f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -1.21f, 4.568f)
                lineToRelative(2.812f, 1.624f)
                lineToRelative(-0.5f, 0.866f)
                lineToRelative(-2.811f, -1.623f)
                curveToRelative(-0.858f, 1.344f, -2.0f, 2.487f, -3.345f, 3.345f)
                lineToRelative(1.623f, 2.81f)
                lineToRelative(-0.866f, 0.5f)
                lineToRelative(-1.623f, -2.811f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -4.569f, 1.21f)
                lineTo(19.251f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.26f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -4.568f, -1.21f)
                lineToRelative(-1.623f, 2.811f)
                lineToRelative(-0.866f, -0.5f)
                lineToRelative(1.622f, -2.81f)
                curveToRelative(-1.344f, -0.858f, -2.487f, -2.0f, -3.345f, -3.345f)
                lineToRelative(-2.81f, 1.623f)
                lineToRelative(-0.5f, -0.866f)
                lineToRelative(2.812f, -1.624f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -1.21f, -4.568f)
                lineTo(4.5f, 19.251f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.261f)
                curveToRelative(0.073f, -1.645f, 0.501f, -3.193f, 1.21f, -4.568f)
                lineTo(6.16f, 12.058f)
                lineToRelative(0.5f, -0.866f)
                lineToRelative(2.81f, 1.623f)
                curveToRelative(0.858f, -1.344f, 2.0f, -2.487f, 3.345f, -3.345f)
                lineToRelative(-1.623f, -2.81f)
                lineToRelative(0.866f, -0.5f)
                lineToRelative(1.624f, 2.812f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 4.568f, -1.21f)
                lineTo(18.25f, 4.5f)
                close()
                moveTo(28.738f, 18.25f)
                arcToRelative(9.957f, 9.957f, 0.0f, false, false, -9.988f, -9.5f)
                curveToRelative(-1.65f, 0.0f, -3.2f, 0.392f, -4.567f, 1.089f)
                lineToRelative(2.506f, 4.34f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 2.061f, -0.429f)
                curveToRelative(2.632f, 0.0f, 4.732f, 1.942f, 4.976f, 4.5f)
                close()
                moveTo(23.727f, 19.25f)
                horizontalLineToRelative(5.011f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, true, -9.988f, 9.5f)
                curveToRelative(-1.65f, 0.0f, -3.2f, -0.392f, -4.567f, -1.089f)
                lineToRelative(2.506f, -4.34f)
                curveToRelative(0.625f, 0.276f, 1.322f, 0.43f, 2.061f, 0.43f)
                curveToRelative(2.632f, 0.0f, 4.733f, -1.943f, 4.977f, -4.501f)
                moveToRelative(-14.977f, -0.5f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, true, 4.566f, -8.413f)
                lineToRelative(2.504f, 4.338f)
                curveToRelative(-1.261f, 0.9f, -2.07f, 2.377f, -2.07f, 4.075f)
                reflectiveCurveToRelative(0.809f, 3.176f, 2.07f, 4.076f)
                lineToRelative(-2.504f, 4.337f)
                arcTo(9.96f, 9.96f, 0.0f, false, true, 8.75f, 18.75f)
                moveToRelative(6.0f, 0.0f)
                curveToRelative(0.0f, -2.248f, 1.752f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.752f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.751f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.751f, -4.0f, -4.0f)
            }
        }
            .build()
        return _gearsMedium!!
    }

private var _gearsMedium: ImageVector? = null
