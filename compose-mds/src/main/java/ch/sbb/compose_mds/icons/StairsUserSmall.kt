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

public val SBBIcons.StairsUserSmall: ImageVector
    get() {
        if (_stairsUserSmall != null) {
            return _stairsUserSmall!!
        }
        _stairsUserSmall = Builder(name = "StairsUserSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 3.5f)
                curveToRelative(0.0f, -0.257f, 0.243f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.243f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.243f, 0.5f, -0.5f, 0.5f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.5f, -0.5f)
                moveTo(9.5f, 2.0f)
                curveTo(8.69f, 2.0f, 8.0f, 2.69f, 8.0f, 3.5f)
                reflectiveCurveTo(8.69f, 5.0f, 9.5f, 5.0f)
                reflectiveCurveTo(11.0f, 4.31f, 11.0f, 3.5f)
                reflectiveCurveTo(10.31f, 2.0f, 9.5f, 2.0f)
                moveTo(8.293f, 6.0f)
                horizontalLineToRelative(2.516f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(0.98f, 1.96f)
                lineTo(13.4f, 10.2f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-1.5f, -2.0f)
                lineToRelative(-0.027f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineTo(11.0f, 8.618f)
                verticalLineToRelative(2.73f)
                lineToRelative(0.916f, 1.375f)
                lineToRelative(0.084f, 0.126f)
                lineTo(12.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(18.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.11f)
                lineTo(8.0f, 14.438f)
                lineTo(8.0f, 7.707f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(7.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 8.293f)
                lineToRelative(0.146f, -0.147f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(9.0f, 11.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(9.0f, 12.0f)
                verticalLineToRelative(2.562f)
                lineToRelative(-0.015f, 0.06f)
                lineTo(8.14f, 18.0f)
                lineTo(10.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.849f)
                lineTo(10.232f, 12.0f)
                close()
            }
        }
        .build()
        return _stairsUserSmall!!
    }

private var _stairsUserSmall: ImageVector? = null
