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

public val SBBIcons.ControlsSmall: ImageVector
    get() {
        if (_controlsSmall != null) {
            return _controlsSmall!!
        }
        _controlsSmall = Builder(name = "ControlsSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 6.5f)
                curveTo(10.0f, 5.611f, 9.389f, 5.0f, 8.5f, 5.0f)
                reflectiveCurveTo(7.0f, 5.611f, 7.0f, 6.5f)
                curveTo(7.0f, 7.39f, 7.611f, 8.0f, 8.5f, 8.0f)
                reflectiveCurveTo(10.0f, 7.39f, 10.0f, 6.5f)
                moveToRelative(0.956f, 0.5f)
                curveTo(10.74f, 8.18f, 9.769f, 9.0f, 8.5f, 9.0f)
                reflectiveCurveToRelative(-2.241f, -0.82f, -2.456f, -2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(4.044f)
                curveTo(6.26f, 4.82f, 7.231f, 4.0f, 8.5f, 4.0f)
                reflectiveCurveToRelative(2.241f, 0.82f, 2.456f, 2.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 12.5f)
                curveToRelative(0.0f, -0.855f, -0.645f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.645f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.854f, 0.645f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.646f, 1.5f, -1.5f)
                moveTo(15.5f, 15.0f)
                curveToRelative(1.235f, 0.0f, 2.228f, -0.843f, 2.453f, -2.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.047f)
                curveToRelative(-0.225f, -1.158f, -1.218f, -2.0f, -2.453f, -2.0f)
                reflectiveCurveToRelative(-2.228f, 0.842f, -2.453f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(11.048f)
                curveToRelative(0.224f, 1.157f, 1.217f, 2.0f, 2.452f, 2.0f)
                moveToRelative(-7.0f, 2.0f)
                curveToRelative(0.872f, 0.0f, 1.5f, 0.629f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.872f, -0.628f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(7.0f, 19.372f, 7.0f, 18.5f)
                curveToRelative(0.0f, -0.871f, 0.628f, -1.5f, 1.5f, -1.5f)
                moveToRelative(2.454f, 2.0f)
                curveToRelative(-0.22f, 1.168f, -1.202f, 2.0f, -2.454f, 2.0f)
                reflectiveCurveToRelative(-2.235f, -0.832f, -2.454f, -2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.046f)
                curveToRelative(0.22f, -1.168f, 1.202f, -2.0f, 2.454f, -2.0f)
                reflectiveCurveToRelative(2.235f, 0.832f, 2.454f, 2.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _controlsSmall!!
    }

private var _controlsSmall: ImageVector? = null
