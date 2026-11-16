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

public val SBBIcons.WheelThermometerSmall: ImageVector
    get() {
        if (_wheelThermometerSmall != null) {
            return _wheelThermometerSmall!!
        }
        _wheelThermometerSmall = Builder(name = "WheelThermometerSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveToRelative(1.103f, 0.0f, 2.174f, 0.2f, 3.157f, 0.525f)
                lineToRelative(-0.314f, 0.95f)
                arcTo(9.1f, 9.1f, 0.0f, false, false, 12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 18.0f)
                curveToRelative(0.326f, 0.0f, 0.635f, -0.014f, 0.947f, -0.047f)
                lineToRelative(0.106f, 0.994f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                moveToRelative(17.0f, -6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                verticalLineToRelative(9.89f)
                lineToRelative(-0.214f, 0.15f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.428f, 0.0f)
                lineTo(19.0f, 15.39f)
                close()
                moveTo(20.0f, 14.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.0f, 0.0f)
                lineTo(15.0f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                moveToRelative(5.5f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.5f, -3.937f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(9.063f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.5f, 20.0f)
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.417f, 0.0f, -8.0f, 3.583f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.583f, 8.0f, 8.0f, 8.0f)
                lineToRelative(0.15f, 0.002f)
                curveToRelative(0.112f, 0.003f, 0.231f, 0.006f, 0.38f, -0.003f)
                lineToRelative(-0.06f, -0.998f)
                curveToRelative(-0.11f, 0.006f, -0.164f, 0.005f, -0.244f, 0.002f)
                lineTo(12.0f, 19.0f)
                curveToRelative(-3.865f, 0.0f, -7.0f, -3.135f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.135f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.657f, 0.0f, 1.283f, 0.071f, 1.867f, 0.232f)
                lineToRelative(0.266f, -0.964f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
            }
        }
        .build()
        return _wheelThermometerSmall!!
    }

private var _wheelThermometerSmall: ImageVector? = null
