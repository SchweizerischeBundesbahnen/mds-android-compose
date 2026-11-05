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
                moveTo(16.504f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.495f, 2.333f)
                lineToRelative(-3.601f, 0.676f)
                lineToRelative(-0.408f, 0.076f)
                verticalLineToRelative(1.828f)
                lineToRelative(0.405f, 0.078f)
                lineToRelative(3.729f, 0.718f)
                quadToRelative(-0.128f, 0.374f, -0.13f, 0.791f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.958f, 0.458f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -4.916f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.504f, 2.0f)
                moveToRelative(-1.5f, 2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(18.004f, 5.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                curveToRelative(0.0f, -0.322f, 0.104f, -0.62f, 0.28f, -0.867f)
                lineTo(15.736f, 7.0f)
                lineToRelative(-0.764f, -0.147f)
                lineTo(11.0f, 6.087f)
                verticalLineToRelative(-0.172f)
                lineToRelative(3.62f, -0.68f)
                lineToRelative(0.456f, -0.085f)
                lineToRelative(-0.051f, -0.461f)
                lineToRelative(-0.014f, -0.114f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.007f, -0.075f)
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 7.0f)
                verticalLineToRelative(0.999f)
                horizontalLineToRelative(0.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                lineToRelative(0.002f, 10.751f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-0.5f)
                lineTo(3.997f, 10.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, -2.75f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                lineTo(6.0f, 4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(4.997f, 10.748f)
                curveToRelative(0.0f, -0.966f, 0.783f, -1.75f, 1.75f, -1.75f)
                lineTo(8.25f, 8.998f)
                curveToRelative(0.967f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                lineTo(10.0f, 11.0f)
                lineTo(4.997f, 11.0f)
                close()
                moveTo(4.997f, 12.0f)
                lineTo(5.001f, 19.001f)
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
