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

public val SBBIcons.AerosolCanSmall: ImageVector
    get() {
        if (_aerosolCanSmall != null) {
            return _aerosolCanSmall!!
        }
        _aerosolCanSmall = Builder(name = "AerosolCanSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.504f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                curveToRelative(0.0f, -0.322f, 0.104f, -0.62f, 0.28f, -0.867f)
                lineToRelative(0.452f, -0.634f)
                lineToRelative(-0.764f, -0.147f)
                lineTo(11.0f, 6.086f)
                verticalLineToRelative(-0.172f)
                lineToRelative(3.62f, -0.679f)
                lineToRelative(0.456f, -0.086f)
                lineToRelative(-0.05f, -0.46f)
                lineToRelative(-0.015f, -0.117f)
                curveToRelative(-0.005f, -0.03f, -0.007f, -0.046f, -0.007f, -0.072f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(18.004f, 5.0f)
                close()
                moveTo(15.025f, 4.688f)
                lineTo(14.528f, 4.744f)
                lineTo(14.62f, 5.235f)
                lineTo(14.527f, 4.743f)
                close()
                moveTo(18.96f, 8.956f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, false, 0.0f, -4.913f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, false, -4.948f, 0.29f)
                lineToRelative(-3.604f, 0.676f)
                lineToRelative(-0.408f, 0.076f)
                verticalLineToRelative(1.828f)
                lineToRelative(0.405f, 0.078f)
                lineToRelative(3.729f, 0.718f)
                quadToRelative(-0.128f, 0.374f, -0.13f, 0.791f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.956f, 0.456f)
                moveTo(9.0f, 4.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 7.0f)
                verticalLineToRelative(0.999f)
                horizontalLineToRelative(0.249f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                lineToRelative(0.003f, 10.751f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-0.5f)
                lineTo(3.997f, 10.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, -2.75f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(8.249f, 8.999f)
                curveToRelative(0.967f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                lineTo(9.999f, 11.0f)
                lineTo(4.997f, 11.0f)
                verticalLineToRelative(-0.252f)
                curveToRelative(0.0f, -0.966f, 0.783f, -1.75f, 1.75f, -1.75f)
                close()
                moveTo(4.998f, 12.0f)
                lineTo(5.0f, 19.001f)
                horizontalLineToRelative(5.0f)
                lineTo(10.0f, 12.0f)
                close()
                moveTo(5.002f, 21.0f)
                verticalLineToRelative(-0.999f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _aerosolCanSmall!!
    }

private var _aerosolCanSmall: ImageVector? = null
