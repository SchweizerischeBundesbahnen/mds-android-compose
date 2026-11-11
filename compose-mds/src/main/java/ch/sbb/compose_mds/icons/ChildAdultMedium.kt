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

public val SBBIcons.ChildAdultMedium: ImageVector
    get() {
        if (_childAdultMedium != null) {
            return _childAdultMedium!!
        }
        _childAdultMedium = Builder(name = "ChildAdultMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.75f, 6.085f)
                curveToRelative(0.0f, -0.924f, -0.826f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.826f, -1.75f, 1.75f)
                reflectiveCurveToRelative(0.826f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.826f, 1.75f, -1.75f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.476f, -1.274f, 2.75f, -2.75f, 2.75f)
                reflectiveCurveToRelative(-2.75f, -1.274f, -2.75f, -2.75f)
                reflectiveCurveToRelative(1.274f, -2.75f, 2.75f, -2.75f)
                reflectiveCurveToRelative(2.75f, 1.274f, 2.75f, 2.75f)
                moveToRelative(-5.5f, 6.372f)
                lineToRelative(-3.5f, 3.5f)
                lineTo(17.75f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-3.368f)
                lineTo(11.0f, 19.56f)
                verticalLineToRelative(5.102f)
                lineToRelative(2.97f, 8.167f)
                lineToRelative(-0.94f, 0.342f)
                lineToRelative(-2.88f, -7.921f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(3.417f)
                lineTo(4.9f, 31.8f)
                lineToRelative(-0.8f, -0.6f)
                lineToRelative(2.15f, -2.867f)
                lineTo(6.25f, 19.25f)
                horizontalLineToRelative(-0.043f)
                lineTo(4.25f, 21.207f)
                lineTo(4.25f, 25.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.707f)
                lineToRelative(2.543f, -2.543f)
                horizontalLineToRelative(4.825f)
                lineToRelative(3.0f, 1.5f)
                horizontalLineToRelative(3.132f)
                verticalLineToRelative(-4.207f)
                lineToRelative(4.793f, -4.793f)
                horizontalLineToRelative(4.975f)
                lineToRelative(0.148f, 0.223f)
                lineToRelative(2.936f, 4.405f)
                lineToRelative(3.655f, 2.193f)
                lineToRelative(-0.514f, 0.858f)
                lineToRelative(-3.75f, -2.25f)
                lineToRelative(-0.096f, -0.058f)
                lineToRelative(-2.147f, -3.22f)
                verticalLineToRelative(7.2f)
                lineToRelative(2.918f, 4.46f)
                lineToRelative(0.082f, 0.125f)
                lineTo(29.75f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-8.018f)
                lineToRelative(-2.77f, -4.232f)
                horizontalLineToRelative(-3.73f)
                verticalLineToRelative(5.747f)
                lineToRelative(-0.096f, 0.132f)
                lineToRelative(-3.75f, 5.165f)
                lineToRelative(-0.808f, -0.588f)
                lineToRelative(3.654f, -5.034f)
                lineTo(21.25f, 12.457f)
                moveToRelative(4.5f, -0.707f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(9.25f, 14.25f)
                curveToRelative(0.0f, -0.524f, -0.476f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.476f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.476f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.476f, 1.0f, -1.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.076f, -0.924f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.924f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.924f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.924f, 2.0f, 2.0f)
                moveToRelative(-0.25f, 5.0f)
                lineTo(7.25f, 19.25f)
                verticalLineToRelative(5.0f)
                lineTo(10.0f, 24.25f)
                close()
            }
        }
        .build()
        return _childAdultMedium!!
    }

private var _childAdultMedium: ImageVector? = null
