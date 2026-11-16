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

public val SBBIcons.RampUserSmall: ImageVector
    get() {
        if (_rampUserSmall != null) {
            return _rampUserSmall!!
        }
        _rampUserSmall = Builder(name = "RampUserSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.5f, 7.0f)
                curveToRelative(0.257f, 0.0f, 0.5f, 0.243f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.243f, 0.5f, -0.5f, 0.5f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.5f, -0.5f)
                curveToRelative(0.0f, -0.257f, 0.243f, -0.5f, 0.5f, -0.5f)
                moveToRelative(0.0f, 2.0f)
                curveTo(6.31f, 9.0f, 7.0f, 8.31f, 7.0f, 7.5f)
                reflectiveCurveTo(6.31f, 6.0f, 5.5f, 6.0f)
                reflectiveCurveTo(4.0f, 6.69f, 4.0f, 7.5f)
                reflectiveCurveTo(4.69f, 9.0f, 5.5f, 9.0f)
                moveToRelative(1.309f, 1.0f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(0.98f, 1.96f)
                lineTo(9.4f, 14.2f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-1.5f, -2.0f)
                lineToRelative(-0.027f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineTo(7.0f, 12.618f)
                verticalLineToRelative(2.764f)
                lineToRelative(1.0f, 2.0f)
                verticalLineToRelative(2.813f)
                lineToRelative(13.35f, -4.172f)
                lineToRelative(0.65f, -0.203f)
                lineTo(22.0f, 22.0f)
                lineTo(5.5f, 22.0f)
                lineToRelative(-0.15f, -0.977f)
                lineTo(7.0f, 20.507f)
                verticalLineToRelative(-2.889f)
                lineTo(6.19f, 16.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(6.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 11.707f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(3.0f, 15.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(-2.707f)
                lineTo(4.293f, 10.0f)
                close()
                moveTo(5.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(8.777f, 21.0f)
                lineTo(21.0f, 17.18f)
                close()
            }
        }
        .build()
        return _rampUserSmall!!
    }

private var _rampUserSmall: ImageVector? = null
