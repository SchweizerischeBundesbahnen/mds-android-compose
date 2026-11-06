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

public val SBBIcons.DisplayBinaryCodeSmall: ImageVector
    get() {
        if (_displayBinaryCodeSmall != null) {
            return _displayBinaryCodeSmall!!
        }
        _displayBinaryCodeSmall = Builder(name = "DisplayBinaryCodeSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(21.0f, 3.0f)
                lineTo(2.5f, 3.0f)
                moveTo(12.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(3.0f, 16.0f)
                lineTo(3.0f, 4.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(9.209f, 12.217f)
                arcTo(1.44f, 1.44f, 0.0f, false, false, 9.0f, 13.0f)
                curveToRelative(0.0f, 0.33f, 0.09f, 0.605f, 0.209f, 0.783f)
                curveToRelative(0.121f, 0.182f, 0.234f, 0.217f, 0.291f, 0.217f)
                reflectiveCurveToRelative(0.17f, -0.035f, 0.291f, -0.217f)
                curveToRelative(0.12f, -0.178f, 0.209f, -0.454f, 0.209f, -0.783f)
                curveToRelative(0.0f, -0.33f, -0.09f, -0.605f, -0.209f, -0.783f)
                curveTo(9.67f, 12.035f, 9.557f, 12.0f, 9.5f, 12.0f)
                reflectiveCurveToRelative(-0.17f, 0.035f, -0.291f, 0.217f)
                moveToRelative(-0.832f, -0.555f)
                curveToRelative(0.24f, -0.36f, 0.628f, -0.662f, 1.123f, -0.662f)
                reflectiveCurveToRelative(0.883f, 0.301f, 1.123f, 0.662f)
                curveToRelative(0.243f, 0.364f, 0.377f, 0.839f, 0.377f, 1.338f)
                reflectiveCurveToRelative(-0.134f, 0.974f, -0.377f, 1.338f)
                curveToRelative(-0.24f, 0.36f, -0.628f, 0.662f, -1.123f, 0.662f)
                reflectiveCurveToRelative(-0.883f, -0.301f, -1.123f, -0.662f)
                curveTo(8.134f, 13.974f, 8.0f, 13.499f, 8.0f, 13.0f)
                reflectiveCurveToRelative(0.134f, -0.974f, 0.377f, -1.338f)
                moveTo(13.0f, 7.0f)
                curveToRelative(0.0f, -0.33f, 0.09f, -0.605f, 0.209f, -0.783f)
                curveToRelative(0.121f, -0.182f, 0.234f, -0.217f, 0.291f, -0.217f)
                reflectiveCurveToRelative(0.17f, 0.035f, 0.291f, 0.217f)
                curveToRelative(0.12f, 0.178f, 0.209f, 0.454f, 0.209f, 0.783f)
                curveToRelative(0.0f, 0.33f, -0.09f, 0.605f, -0.209f, 0.783f)
                curveToRelative(-0.121f, 0.182f, -0.234f, 0.217f, -0.291f, 0.217f)
                reflectiveCurveToRelative(-0.17f, -0.035f, -0.291f, -0.217f)
                arcTo(1.44f, 1.44f, 0.0f, false, true, 13.0f, 7.0f)
                moveToRelative(0.5f, -2.0f)
                curveToRelative(-0.495f, 0.0f, -0.883f, 0.301f, -1.123f, 0.662f)
                curveTo(12.134f, 6.026f, 12.0f, 6.501f, 12.0f, 7.0f)
                reflectiveCurveToRelative(0.134f, 0.974f, 0.377f, 1.338f)
                curveToRelative(0.24f, 0.36f, 0.628f, 0.662f, 1.123f, 0.662f)
                reflectiveCurveToRelative(0.883f, -0.301f, 1.123f, -0.662f)
                curveTo(14.866f, 7.974f, 15.0f, 7.499f, 15.0f, 7.0f)
                reflectiveCurveToRelative(-0.134f, -0.974f, -0.377f, -1.338f)
                curveTo(14.383f, 5.302f, 13.995f, 5.0f, 13.5f, 5.0f)
                moveTo(6.0f, 5.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(10.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(6.0f, 11.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineTo(18.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _displayBinaryCodeSmall!!
    }

private var _displayBinaryCodeSmall: ImageVector? = null
