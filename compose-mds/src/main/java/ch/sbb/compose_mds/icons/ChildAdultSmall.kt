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

public val SBBIcons.ChildAdultSmall: ImageVector
    get() {
        if (_childAdultSmall != null) {
            return _childAdultSmall!!
        }
        _childAdultSmall = Builder(name = "ChildAdultSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 4.057f)
                curveToRelative(0.0f, -0.524f, -0.476f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.476f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.523f, 0.476f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.477f, 1.0f, -1.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.076f, -0.924f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.924f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.924f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.924f, 2.0f, 2.0f)
                moveToRelative(-4.0f, 4.65f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.882f)
                lineTo(7.5f, 13.31f)
                verticalLineToRelative(3.102f)
                lineToRelative(1.97f, 5.417f)
                lineToRelative(-0.94f, 0.342f)
                lineTo(6.65f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.167f)
                lineTo(3.4f, 21.3f)
                lineToRelative(-0.8f, -0.6f)
                lineTo(4.0f, 18.833f)
                verticalLineToRelative(-5.626f)
                lineToRelative(-1.0f, 1.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-3.207f)
                lineTo(3.793f, 12.0f)
                horizontalLineToRelative(3.325f)
                lineToRelative(2.0f, 1.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-2.707f)
                lineTo(14.293f, 7.0f)
                horizontalLineToRelative(3.475f)
                lineToRelative(2.085f, 3.129f)
                lineToRelative(2.404f, 1.442f)
                lineToRelative(-0.514f, 0.858f)
                lineToRelative(-2.5f, -1.5f)
                lineToRelative(-0.096f, -0.058f)
                lineTo(18.0f, 9.151f)
                verticalLineToRelative(4.2f)
                lineToRelative(1.918f, 2.932f)
                lineToRelative(0.082f, 0.124f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.296f)
                lineTo(17.23f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(3.719f)
                lineToRelative(-0.096f, 0.132f)
                lineToRelative(-2.5f, 3.443f)
                lineToRelative(-0.808f, -0.588f)
                lineTo(14.0f, 17.394f)
                verticalLineTo(8.707f)
                moveTo(17.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 9.5f)
                curveToRelative(0.0f, -0.257f, -0.243f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.243f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.243f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.243f, 0.5f, -0.5f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.81f, -0.69f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(4.0f, 10.31f, 4.0f, 9.5f)
                reflectiveCurveTo(4.69f, 8.0f, 5.5f, 8.0f)
                reflectiveCurveTo(7.0f, 8.69f, 7.0f, 9.5f)
                moveTo(6.5f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _childAdultSmall!!
    }

private var _childAdultSmall: ImageVector? = null
