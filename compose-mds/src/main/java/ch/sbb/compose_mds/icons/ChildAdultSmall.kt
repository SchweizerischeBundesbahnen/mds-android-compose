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
                moveTo(16.0f, 3.057f)
                curveToRelative(-0.524f, 0.0f, -1.0f, 0.476f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.523f, 0.476f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.477f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.524f, -0.476f, -1.0f, -1.0f, -1.0f)
                moveToRelative(-2.0f, 1.0f)
                curveToRelative(0.0f, -1.077f, 0.924f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.924f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.924f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.924f, -2.0f, -2.0f)
                moveTo(15.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 8.0f)
                close()
                moveTo(14.0f, 8.707f)
                verticalLineToRelative(8.687f)
                lineToRelative(-2.405f, 3.312f)
                lineToRelative(0.81f, 0.588f)
                lineToRelative(2.5f, -3.444f)
                lineToRelative(0.095f, -0.131f)
                lineTo(15.0f, 14.0f)
                horizontalLineToRelative(2.23f)
                lineTo(19.0f, 16.706f)
                lineTo(19.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.593f)
                lineToRelative(-0.081f, -0.124f)
                lineTo(18.0f, 13.35f)
                verticalLineToRelative(-4.2f)
                lineToRelative(1.084f, 1.626f)
                lineToRelative(0.062f, 0.094f)
                lineToRelative(0.097f, 0.058f)
                lineToRelative(2.5f, 1.5f)
                lineToRelative(0.514f, -0.858f)
                lineToRelative(-2.403f, -1.442f)
                lineToRelative(-1.938f, -2.906f)
                lineTo(17.768f, 7.0f)
                horizontalLineToRelative(-3.475f)
                lineToRelative(-0.146f, 0.146f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-0.147f, 0.147f)
                lineTo(11.0f, 13.0f)
                lineTo(9.118f, 13.0f)
                lineToRelative(-1.894f, -0.947f)
                lineTo(7.118f, 12.0f)
                lineTo(3.793f, 12.0f)
                lineToRelative(-0.147f, 0.146f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-0.146f, 0.147f)
                lineTo(2.0f, 17.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.793f)
                lineToRelative(1.0f, -1.0f)
                verticalLineToRelative(5.626f)
                lineTo(2.6f, 20.7f)
                lineToRelative(0.8f, 0.6f)
                lineToRelative(1.5f, -2.0f)
                lineToRelative(0.1f, -0.133f)
                lineTo(5.0f, 17.0f)
                horizontalLineToRelative(1.65f)
                lineToRelative(1.88f, 5.17f)
                lineToRelative(0.94f, -0.34f)
                lineToRelative(-1.97f, -5.418f)
                verticalLineToRelative(-3.103f)
                lineToRelative(1.276f, 0.638f)
                lineToRelative(0.106f, 0.053f)
                lineTo(12.0f, 14.0f)
                verticalLineToRelative(-3.293f)
                close()
                moveTo(5.5f, 9.0f)
                curveToRelative(-0.257f, 0.0f, -0.5f, 0.243f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.243f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.243f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.243f, -0.5f, -0.5f, -0.5f)
                moveTo(4.0f, 9.5f)
                curveTo(4.0f, 8.69f, 4.69f, 8.0f, 5.5f, 8.0f)
                reflectiveCurveTo(7.0f, 8.69f, 7.0f, 9.5f)
                reflectiveCurveTo(6.31f, 11.0f, 5.5f, 11.0f)
                reflectiveCurveTo(4.0f, 10.31f, 4.0f, 9.5f)
                moveTo(5.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _childAdultSmall!!
    }

private var _childAdultSmall: ImageVector? = null
