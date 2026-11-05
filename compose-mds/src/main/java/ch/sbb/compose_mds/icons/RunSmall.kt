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

public val SBBIcons.RunSmall: ImageVector
    get() {
        if (_runSmall != null) {
            return _runSmall!!
        }
        _runSmall = Builder(name = "RunSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 5.0f)
                curveToRelative(-0.257f, 0.0f, -0.5f, 0.243f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.243f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.243f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.243f, -0.5f, -0.5f, -0.5f)
                moveToRelative(-1.5f, 0.5f)
                curveToRelative(0.0f, -0.81f, 0.69f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.69f, 1.5f, 1.5f)
                reflectiveCurveTo(17.31f, 7.0f, 16.5f, 7.0f)
                reflectiveCurveTo(15.0f, 6.31f, 15.0f, 5.5f)
                moveToRelative(6.468f, 1.176f)
                lineToRelative(-1.5f, 4.0f)
                lineToRelative(-0.273f, 0.727f)
                lineToRelative(-0.549f, -0.55f)
                lineToRelative(-1.339f, -1.339f)
                lineToRelative(-0.751f, 3.756f)
                lineToRelative(2.721f, 1.814f)
                lineToRelative(0.223f, 0.148f)
                lineTo(20.0f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.232f)
                lineTo(16.349f, 14.0f)
                lineTo(14.86f, 14.0f)
                lineToRelative(-0.886f, 2.658f)
                lineToRelative(-0.058f, 0.176f)
                lineToRelative(-0.159f, 0.095f)
                lineToRelative(-5.0f, 3.0f)
                lineToRelative(-0.514f, -0.858f)
                lineToRelative(4.841f, -2.905f)
                lineToRelative(0.932f, -2.795f)
                lineToRelative(0.839f, -4.194f)
                lineToRelative(-2.732f, 0.683f)
                lineToRelative(0.858f, 3.003f)
                lineToRelative(-0.962f, 0.274f)
                lineToRelative(-1.0f, -3.5f)
                lineToRelative(-0.142f, -0.497f)
                lineToRelative(0.502f, -0.125f)
                lineToRelative(4.0f, -1.0f)
                lineToRelative(0.06f, -0.015f)
                horizontalLineToRelative(2.268f)
                lineToRelative(0.147f, 0.146f)
                lineToRelative(1.45f, 1.451f)
                lineToRelative(1.228f, -3.273f)
                close()
                moveTo(15.193f, 13.0f)
                horizontalLineToRelative(0.897f)
                lineToRelative(0.8f, -4.0f)
                horizontalLineToRelative(-0.897f)
                close()
                moveTo(9.0f, 10.0f)
                lineTo(9.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(10.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _runSmall!!
    }

private var _runSmall: ImageVector? = null
