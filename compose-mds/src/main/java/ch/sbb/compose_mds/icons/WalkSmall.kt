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

public val SBBIcons.WalkSmall: ImageVector
    get() {
        if (_walkSmall != null) {
            return _walkSmall!!
        }
        _walkSmall = Builder(name = "WalkSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 5.0f)
                curveToRelative(-0.257f, 0.0f, -0.5f, 0.243f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.243f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.243f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.243f, -0.5f, -0.5f, -0.5f)
                moveToRelative(-1.5f, 0.5f)
                curveToRelative(0.0f, -0.81f, 0.69f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.69f, 1.5f, 1.5f)
                reflectiveCurveTo(12.309f, 7.0f, 11.5f, 7.0f)
                reflectiveCurveTo(10.0f, 6.31f, 10.0f, 5.5f)
                moveTo(11.0f, 9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 9.0f)
                close()
                moveTo(10.0f, 9.434f)
                verticalLineToRelative(6.914f)
                lineToRelative(-1.916f, 2.874f)
                lineToRelative(0.832f, 0.555f)
                lineToRelative(2.0f, -3.0f)
                lineToRelative(0.084f, -0.126f)
                lineTo(11.0f, 14.0f)
                horizontalLineToRelative(1.293f)
                lineTo(14.0f, 15.707f)
                lineTo(14.0f, 20.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.707f)
                lineToRelative(-0.146f, -0.147f)
                lineTo(13.0f, 13.293f)
                lineTo(13.0f, 9.707f)
                lineToRelative(1.146f, 1.146f)
                lineToRelative(0.147f, 0.147f)
                lineTo(17.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.293f)
                lineToRelative(-1.853f, -1.854f)
                lineTo(12.707f, 8.0f)
                lineTo(10.35f, 8.0f)
                lineToRelative(-0.126f, 0.084f)
                lineToRelative(-3.0f, 2.0f)
                lineToRelative(-0.223f, 0.148f)
                lineTo(7.001f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.233f)
                close()
            }
        }
        .build()
        return _walkSmall!!
    }

private var _walkSmall: ImageVector? = null
