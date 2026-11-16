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

public val SBBIcons.CargoBikeLarge: ImageVector
    get() {
        if (_cargoBikeLarge != null) {
            return _cargoBikeLarge!!
        }
        _cargoBikeLarge = Builder(name = "CargoBikeLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(-1.854f, -3.012f)
                lineToRelative(-2.0f, -3.249f)
                lineToRelative(-0.426f, -0.692f)
                lineToRelative(-0.426f, 0.692f)
                lineToRelative(-1.656f, 2.69f)
                arcTo(4.504f, 4.504f, 0.0f, false, false, 5.0f, 28.5f)
                curveToRelative(0.0f, 2.483f, 2.017f, 4.501f, 4.5f, 4.501f)
                arcToRelative(4.506f, 4.506f, 0.0f, false, false, 4.472f, -4.0f)
                horizontalLineToRelative(15.225f)
                lineToRelative(0.144f, -0.135f)
                lineToRelative(6.89f, -6.431f)
                lineToRelative(0.513f, 1.922f)
                arcTo(4.51f, 4.51f, 0.0f, false, false, 34.0f, 28.5f)
                curveToRelative(0.0f, 2.482f, 2.017f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.018f, 4.5f, -4.5f)
                arcToRelative(4.504f, 4.504f, 0.0f, false, false, -5.297f, -4.43f)
                lineToRelative(-0.72f, -2.699f)
                lineToRelative(-0.1f, -0.371f)
                lineTo(21.0f, 21.0f)
                close()
                moveTo(13.972f, 28.0f)
                horizontalLineToRelative(2.633f)
                lineToRelative(-1.53f, -2.487f)
                lineToRelative(-1.576f, -2.559f)
                lineToRelative(-1.23f, 2.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 13.971f, 28.0f)
                moveToRelative(-2.232f, -2.187f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.964f, 28.0f)
                horizontalLineToRelative(-2.57f)
                close()
                moveTo(10.889f, 25.288f)
                lineTo(9.073f, 28.238f)
                lineTo(8.604f, 29.0f)
                horizontalLineToRelative(4.36f)
                arcTo(3.506f, 3.506f, 0.0f, false, true, 9.5f, 32.0f)
                curveTo(7.57f, 32.0f, 6.0f, 30.43f, 6.0f, 28.5f)
                arcToRelative(3.504f, 3.504f, 0.0f, false, true, 4.89f, -3.212f)
                moveToRelative(26.115f, 0.047f)
                lineToRelative(0.012f, 0.044f)
                lineToRelative(0.002f, 0.01f)
                lineToRelative(0.003f, 0.009f)
                lineToRelative(1.0f, 3.25f)
                lineToRelative(0.956f, -0.296f)
                lineToRelative(-0.995f, -3.23f)
                lineToRelative(-0.021f, -0.08f)
                quadTo(38.225f, 25.0f, 38.5f, 25.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveTo(40.43f, 32.0f, 38.5f, 32.0f)
                reflectiveCurveTo(35.0f, 30.43f, 35.0f, 28.5f)
                curveToRelative(0.0f, -1.395f, 0.82f, -2.603f, 2.005f, -3.165f)
                moveTo(28.804f, 28.0f)
                lineTo(21.0f, 28.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(14.232f)
                close()
                moveTo(14.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _cargoBikeLarge!!
    }

private var _cargoBikeLarge: ImageVector? = null
