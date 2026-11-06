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
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 18.0f)
                curveToRelative(0.326f, 0.0f, 0.635f, -0.014f, 0.947f, -0.047f)
                lineToRelative(0.106f, 0.994f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                curveToRelative(1.103f, 0.0f, 2.174f, 0.2f, 3.157f, 0.525f)
                lineToRelative(-0.314f, 0.95f)
                arcTo(9.1f, 9.1f, 0.0f, false, false, 12.0f, 3.0f)
                moveToRelative(3.0f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                verticalLineToRelative(9.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.0f, 0.0f)
                close()
                moveTo(17.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 5.5f)
                verticalLineToRelative(9.891f)
                lineToRelative(-0.214f, 0.15f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.428f, 0.0f)
                lineTo(19.0f, 15.39f)
                verticalLineTo(5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 4.0f)
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveToRelative(4.5f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(0.5f, -1.937f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 1.0f, 0.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(5.0f, 12.0f)
                curveToRelative(0.0f, -3.865f, 3.135f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.657f, 0.0f, 1.282f, 0.07f, 1.867f, 0.232f)
                lineToRelative(0.266f, -0.964f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                curveToRelative(-4.417f, 0.0f, -8.0f, 3.583f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.583f, 8.0f, 8.0f, 8.0f)
                lineToRelative(0.15f, 0.002f)
                curveToRelative(0.112f, 0.003f, 0.231f, 0.006f, 0.379f, -0.003f)
                lineToRelative(-0.058f, -0.998f)
                curveToRelative(-0.111f, 0.006f, -0.165f, 0.005f, -0.245f, 0.002f)
                curveTo(12.17f, 19.002f, 12.105f, 19.0f, 12.0f, 19.0f)
                curveToRelative(-3.865f, 0.0f, -7.0f, -3.135f, -7.0f, -7.0f)
            }
        }
        .build()
        return _wheelThermometerSmall!!
    }

private var _wheelThermometerSmall: ImageVector? = null
