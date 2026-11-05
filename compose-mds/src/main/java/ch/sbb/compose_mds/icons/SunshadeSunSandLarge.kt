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

public val SBBIcons.SunshadeSunSandLarge: ImageVector
    get() {
        if (_sunshadeSunSandLarge != null) {
            return _sunshadeSunSandLarge!!
        }
        _sunshadeSunSandLarge = Builder(
            name = "SunshadeSunSandLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(37.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(36.0f, 2.0f)
                close()
                moveTo(43.571f, 5.136f)
                lineTo(41.451f, 7.257f)
                lineTo(40.743f, 6.55f)
                lineTo(42.864f, 4.43f)
                close()
                moveTo(30.136f, 4.43f)
                lineToRelative(2.12f, 2.121f)
                lineToRelative(-0.706f, 0.707f)
                lineToRelative(-2.121f, -2.12f)
                close()
                moveTo(36.5f, 8.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveTo(32.0f, 11.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -9.0f, 0.0f)
                moveToRelative(-5.0f, -0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(46.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(9.19f, 14.569f)
                curveToRelative(6.387f, -3.385f, 14.36f, -1.13f, 18.004f, 5.183f)
                lineToRelative(0.25f, 0.433f)
                lineToRelative(-0.433f, 0.25f)
                lineToRelative(-10.815f, 6.244f)
                lineTo(26.78f, 44.0f)
                lineTo(42.0f, 44.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 45.0f)
                verticalLineToRelative(-1.0f)
                lineTo(25.61f, 44.0f)
                lineToRelative(-10.28f, -16.821f)
                lineToRelative(-10.835f, 6.256f)
                lineToRelative(-0.433f, 0.25f)
                lineToRelative(-0.25f, -0.433f)
                curveTo(0.166f, 26.94f, 2.198f, 18.909f, 8.323f, 15.069f)
                lineToRelative(-0.504f, -0.874f)
                lineToRelative(0.866f, -0.5f)
                close()
                moveTo(6.005f, 18.369f)
                curveTo(2.756f, 22.162f, 2.0f, 27.683f, 4.435f, 32.314f)
                lineToRelative(3.461f, -1.998f)
                curveToRelative(-1.666f, -3.045f, -2.465f, -6.224f, -2.388f, -8.96f)
                curveToRelative(0.03f, -1.065f, 0.194f, -2.076f, 0.497f, -2.987f)
                moveToRelative(2.758f, 11.447f)
                lineToRelative(12.98f, -7.494f)
                curveToRelative(-1.724f, -2.829f, -3.95f, -4.967f, -6.175f, -6.17f)
                curveToRelative(-2.345f, -1.267f, -4.609f, -1.46f, -6.315f, -0.475f)
                reflectiveCurveToRelative(-2.67f, 3.043f, -2.745f, 5.707f)
                curveToRelative(-0.071f, 2.528f, 0.667f, 5.524f, 2.255f, 8.432f)
                moveToRelative(13.846f, -7.994f)
                lineToRelative(3.46f, -1.998f)
                curveToRelative(-2.791f, -4.424f, -7.95f, -6.529f, -12.858f, -5.614f)
                curveToRelative(0.94f, 0.194f, 1.896f, 0.556f, 2.832f, 1.063f)
                curveToRelative(2.41f, 1.302f, 4.763f, 3.583f, 6.566f, 6.549f)
                moveToRelative(6.82f, -3.958f)
                lineToRelative(2.12f, -2.121f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(-2.121f, 2.12f)
                close()
                moveTo(42.864f, 18.571f)
                lineTo(40.744f, 16.45f)
                lineTo(41.45f, 15.743f)
                lineTo(43.571f, 17.863f)
                close()
                moveTo(36.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
            .build()
        return _sunshadeSunSandLarge!!
    }

private var _sunshadeSunSandLarge: ImageVector? = null
