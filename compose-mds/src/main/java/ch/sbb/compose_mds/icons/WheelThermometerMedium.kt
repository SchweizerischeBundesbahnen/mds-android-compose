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

public val SBBIcons.WheelThermometerMedium: ImageVector
    get() {
        if (_wheelThermometerMedium != null) {
            return _wheelThermometerMedium!!
        }
        _wheelThermometerMedium = Builder(name = "WheelThermometerMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.25f)
                curveTo(10.406f, 4.25f, 4.25f, 10.406f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 31.75f, 18.0f, 31.75f)
                curveToRelative(0.497f, 0.0f, 0.97f, -0.022f, 1.447f, -0.072f)
                lineToRelative(0.106f, 0.994f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 18.0f, 32.75f)
                curveTo(9.854f, 32.75f, 3.25f, 26.146f, 3.25f, 18.0f)
                reflectiveCurveTo(9.854f, 3.25f, 18.0f, 3.25f)
                curveToRelative(1.625f, 0.0f, 3.204f, 0.295f, 4.657f, 0.775f)
                lineToRelative(-0.314f, 0.95f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 18.0f, 4.25f)
                moveToRelative(4.75f, 4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                verticalLineToRelative(14.191f)
                arcTo(5.73f, 5.73f, 0.0f, false, true, 32.0f, 27.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -11.5f, 0.0f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, true, 2.25f, -4.559f)
                close()
                moveTo(26.25f, 5.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(14.706f)
                lineToRelative(-0.214f, 0.15f)
                arcTo(4.73f, 4.73f, 0.0f, false, false, 21.5f, 27.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 9.5f, 0.0f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, false, -2.036f, -3.895f)
                lineToRelative(-0.214f, -0.149f)
                lineTo(28.75f, 8.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                moveTo(16.25f, 18.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                moveTo(18.0f, 15.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, -5.5f)
                moveTo(24.5f, 27.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                moveToRelative(1.25f, -2.705f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 1.0f, 0.0f)
                lineTo(26.75f, 10.5f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(7.25f, 18.0f)
                curveToRelative(0.0f, -5.935f, 4.815f, -10.75f, 10.75f, -10.75f)
                curveToRelative(1.003f, 0.0f, 1.964f, 0.108f, 2.867f, 0.357f)
                lineToRelative(0.266f, -0.964f)
                curveToRelative(-1.007f, -0.278f, -2.06f, -0.393f, -3.133f, -0.393f)
                curveToRelative(-6.487f, 0.0f, -11.75f, 5.263f, -11.75f, 11.75f)
                reflectiveCurveTo(11.513f, 29.75f, 18.0f, 29.75f)
                quadToRelative(0.129f, 0.0f, 0.247f, 0.004f)
                curveToRelative(0.16f, 0.004f, 0.32f, 0.007f, 0.532f, -0.005f)
                lineToRelative(-0.058f, -0.998f)
                curveToRelative(-0.175f, 0.01f, -0.27f, 0.007f, -0.4f, 0.004f)
                curveToRelative(-0.082f, -0.002f, -0.18f, -0.005f, -0.321f, -0.005f)
                curveToRelative(-5.935f, 0.0f, -10.75f, -4.815f, -10.75f, -10.75f)
            }
        }
        .build()
        return _wheelThermometerMedium!!
    }

private var _wheelThermometerMedium: ImageVector? = null
