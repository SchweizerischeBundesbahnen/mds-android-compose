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

public val SBBIcons.DisplayBinaryCodeMedium: ImageVector
    get() {
        if (_displayBinaryCodeMedium != null) {
            return _displayBinaryCodeMedium!!
        }
        _displayBinaryCodeMedium = Builder(name = "DisplayBinaryCodeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.25f, 25.25f)
                lineTo(31.25f, 4.75f)
                horizontalLineToRelative(-28.0f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.5f)
                lineTo(10.5f, 28.75f)
                verticalLineToRelative(1.0f)
                lineTo(24.0f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(18.25f, 25.25f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(30.25f, 24.25f)
                horizontalLineToRelative(-26.0f)
                lineTo(4.25f, 5.75f)
                horizontalLineToRelative(26.0f)
                close()
                moveTo(15.25f, 19.5f)
                curveToRelative(0.0f, -0.536f, -0.146f, -1.0f, -0.355f, -1.314f)
                curveToRelative(-0.212f, -0.317f, -0.45f, -0.436f, -0.645f, -0.436f)
                reflectiveCurveToRelative(-0.433f, 0.119f, -0.645f, 0.436f)
                curveToRelative(-0.209f, 0.315f, -0.355f, 0.778f, -0.355f, 1.314f)
                reflectiveCurveToRelative(0.146f, 1.0f, 0.355f, 1.314f)
                curveToRelative(0.212f, 0.317f, 0.45f, 0.436f, 0.645f, 0.436f)
                reflectiveCurveToRelative(0.433f, -0.119f, 0.645f, -0.436f)
                curveToRelative(0.209f, -0.315f, 0.355f, -0.778f, 0.355f, -1.314f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.706f, -0.19f, 1.368f, -0.523f, 1.868f)
                curveToRelative(-0.332f, 0.497f, -0.844f, 0.882f, -1.477f, 0.882f)
                reflectiveCurveToRelative(-1.146f, -0.385f, -1.477f, -0.882f)
                curveToRelative(-0.333f, -0.5f, -0.523f, -1.162f, -0.523f, -1.868f)
                reflectiveCurveToRelative(0.19f, -1.368f, 0.523f, -1.868f)
                curveToRelative(0.332f, -0.497f, 0.844f, -0.882f, 1.477f, -0.882f)
                reflectiveCurveToRelative(1.146f, 0.385f, 1.477f, 0.882f)
                curveToRelative(0.333f, 0.5f, 0.523f, 1.162f, 0.523f, 1.868f)
                moveToRelative(4.645f, -10.313f)
                curveToRelative(0.209f, 0.314f, 0.355f, 0.777f, 0.355f, 1.313f)
                reflectiveCurveToRelative(-0.146f, 1.0f, -0.355f, 1.313f)
                curveToRelative(-0.212f, 0.318f, -0.45f, 0.437f, -0.645f, 0.437f)
                reflectiveCurveToRelative(-0.433f, -0.119f, -0.645f, -0.437f)
                curveToRelative(-0.209f, -0.314f, -0.355f, -0.777f, -0.355f, -1.313f)
                reflectiveCurveToRelative(0.146f, -1.0f, 0.355f, -1.313f)
                curveToRelative(0.212f, -0.318f, 0.45f, -0.437f, 0.645f, -0.437f)
                reflectiveCurveToRelative(0.433f, 0.119f, 0.645f, 0.437f)
                moveToRelative(0.832f, 3.181f)
                curveToRelative(0.333f, -0.5f, 0.523f, -1.162f, 0.523f, -1.868f)
                reflectiveCurveToRelative(-0.19f, -1.368f, -0.523f, -1.868f)
                curveToRelative(-0.332f, -0.497f, -0.844f, -0.882f, -1.477f, -0.882f)
                reflectiveCurveToRelative(-1.145f, 0.385f, -1.477f, 0.882f)
                curveToRelative(-0.333f, 0.5f, -0.523f, 1.162f, -0.523f, 1.868f)
                reflectiveCurveToRelative(0.19f, 1.368f, 0.523f, 1.868f)
                curveToRelative(0.332f, 0.497f, 0.844f, 0.882f, 1.477f, 0.882f)
                reflectiveCurveToRelative(1.145f, -0.385f, 1.477f, -0.882f)
                moveTo(8.75f, 7.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(14.75f, 13.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(25.75f, 22.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(8.75f, 16.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(26.75f, 13.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(20.75f, 16.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _displayBinaryCodeMedium!!
    }

private var _displayBinaryCodeMedium: ImageVector? = null
