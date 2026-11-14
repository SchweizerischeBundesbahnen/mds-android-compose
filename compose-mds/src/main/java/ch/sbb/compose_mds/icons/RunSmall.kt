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
                moveTo(17.0f, 5.5f)
                curveToRelative(0.0f, -0.257f, -0.243f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.243f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.243f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.243f, 0.5f, -0.5f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.81f, -0.69f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(15.0f, 6.31f, 15.0f, 5.5f)
                reflectiveCurveTo(15.69f, 4.0f, 16.5f, 4.0f)
                reflectiveCurveToRelative(1.5f, 0.69f, 1.5f, 1.5f)
                moveToRelative(3.468f, 1.176f)
                lineToRelative(-1.773f, 4.726f)
                lineToRelative(-1.888f, -1.888f)
                lineToRelative(-0.751f, 3.756f)
                lineTo(20.0f, 15.232f)
                lineTo(20.0f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.232f)
                lineTo(16.349f, 14.0f)
                lineTo(14.86f, 14.0f)
                lineToRelative(-0.945f, 2.834f)
                lineToRelative(-0.16f, 0.095f)
                lineToRelative(-5.0f, 3.0f)
                lineToRelative(-0.513f, -0.858f)
                lineToRelative(4.84f, -2.904f)
                lineToRelative(0.934f, -2.799f)
                lineToRelative(0.838f, -4.191f)
                lineToRelative(-2.733f, 0.682f)
                lineToRelative(0.858f, 3.003f)
                lineToRelative(-0.96f, 0.276f)
                lineToRelative(-1.0f, -3.5f)
                lineToRelative(-0.143f, -0.497f)
                lineToRelative(0.502f, -0.126f)
                lineToRelative(4.0f, -1.0f)
                lineToRelative(0.06f, -0.015f)
                horizontalLineToRelative(2.268f)
                lineToRelative(1.598f, 1.598f)
                lineToRelative(1.227f, -3.274f)
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
                moveTo(9.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(10.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _runSmall!!
    }

private var _runSmall: ImageVector? = null
