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
        _controlsSmall = Builder(
            name = "ControlsSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(8.5f, 5.0f)
                curveTo(7.611f, 5.0f, 7.0f, 5.611f, 7.0f, 6.5f)
                curveTo(7.0f, 7.39f, 7.611f, 8.0f, 8.5f, 8.0f)
                reflectiveCurveTo(10.0f, 7.39f, 10.0f, 6.5f)
                curveTo(10.0f, 5.611f, 9.389f, 5.0f, 8.5f, 5.0f)
                moveTo(2.0f, 7.0f)
                horizontalLineToRelative(4.044f)
                curveTo(6.26f, 8.18f, 7.231f, 9.0f, 8.5f, 9.0f)
                reflectiveCurveToRelative(2.241f, -0.82f, 2.456f, -2.0f)
                lineTo(22.0f, 7.0f)
                lineTo(22.0f, 6.0f)
                lineTo(10.956f, 6.0f)
                curveTo(10.74f, 4.82f, 9.769f, 4.0f, 8.5f, 4.0f)
                reflectiveCurveToRelative(-2.241f, 0.82f, -2.456f, 2.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(15.5f, 11.0f)
                curveToRelative(-0.855f, 0.0f, -1.5f, 0.645f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.854f, 0.645f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.646f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.855f, -0.645f, -1.5f, -1.5f, -1.5f)
                moveToRelative(-2.453f, 1.0f)
                curveToRelative(0.225f, -1.158f, 1.218f, -2.0f, 2.453f, -2.0f)
                reflectiveCurveToRelative(2.228f, 0.842f, 2.453f, 2.0f)
                lineTo(22.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.047f)
                curveToRelative(-0.225f, 1.157f, -1.218f, 2.0f, -2.453f, 2.0f)
                reflectiveCurveToRelative(-2.228f, -0.843f, -2.453f, -2.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 18.5f)
                curveToRelative(0.0f, -0.871f, 0.628f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.629f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.872f, -0.628f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(7.0f, 19.372f, 7.0f, 18.5f)
                moveTo(8.5f, 16.0f)
                curveToRelative(-1.252f, 0.0f, -2.235f, 0.832f, -2.454f, 2.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.046f)
                curveToRelative(0.22f, 1.168f, 1.202f, 2.0f, 2.454f, 2.0f)
                reflectiveCurveToRelative(2.235f, -0.832f, 2.454f, -2.0f)
                lineTo(22.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                lineTo(10.954f, 18.0f)
                curveToRelative(-0.22f, -1.168f, -1.202f, -2.0f, -2.454f, -2.0f)
            }
        }
            .build()
        return _controlsSmall!!
    }

private var _controlsSmall: ImageVector? = null
