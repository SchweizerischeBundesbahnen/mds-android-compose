package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.MoneyExchangeLarge: ImageVector
    get() {
        if (_moneyExchangeLarge != null) {
            return _moneyExchangeLarge!!
        }
        _moneyExchangeLarge = Builder(name = "MoneyExchangeLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 24.006f)
                arcToRelative(20.26f, 20.26f, 0.0f, false, true, -6.148f, 14.281f)
                arcTo(20.25f, 20.25f, 0.0f, false, true, 23.39f, 44.0f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-4.017f, -0.003f, -8.01f, -1.595f, -11.406f, -4.035f)
                curveToRelative(-2.83f, -2.033f, -5.267f, -4.671f, -6.985f, -7.51f)
                verticalLineTo(39.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.318f)
                curveToRelative(1.65f, 3.067f, 4.213f, 5.969f, 7.251f, 8.151f)
                curveTo(15.845f, 41.505f, 19.641f, 43.0f, 23.4f, 43.0f)
                horizontalLineToRelative(0.01f)
                lineToRelative(0.474f, 0.003f)
                arcTo(19.25f, 19.25f, 0.0f, false, false, 43.0f, 23.994f)
                close()
                moveTo(25.45f, 13.05f)
                arcToRelative(8.36f, 8.36f, 0.0f, false, true, 6.19f, 2.45f)
                lineTo(31.0f, 16.61f)
                lineToRelative(-0.255f, -0.292f)
                arcToRelative(6.348f, 6.348f, 0.0f, false, false, -2.195f, -1.538f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -3.22f, -0.65f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, -2.856f, 0.495f)
                arcTo(7.3f, 7.3f, 0.0f, false, false, 20.04f, 16.2f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, false, -1.77f, 2.53f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.83f, 3.11f)
                horizontalLineToRelative(10.75f)
                lineToRelative(-0.52f, 0.94f)
                horizontalLineToRelative(-10.3f)
                verticalLineToRelative(1.83f)
                horizontalLineToRelative(9.25f)
                lineToRelative(-0.51f, 1.0f)
                horizontalLineToRelative(-8.63f)
                arcTo(9.6f, 9.6f, 0.0f, false, false, 18.63f, 29.0f)
                quadToRelative(0.065f, 0.117f, 0.135f, 0.231f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.865f, 2.71f)
                arcToRelative(7.74f, 7.74f, 0.0f, false, false, 3.77f, 0.93f)
                arcToRelative(7.45f, 7.45f, 0.0f, false, false, 3.54f, -0.873f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 2.13f, -1.818f)
                verticalLineToRelative(1.63f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, true, -2.55f, 1.53f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -1.955f, 0.468f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -1.205f, 0.072f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -1.656f, -0.106f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -2.348f, -0.734f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, -2.056f, -1.38f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -0.6f, -0.636f)
                arcToRelative(10.078f, 10.078f, 0.0f, false, true, -2.4f, -5.484f)
                verticalLineToRelative(-0.09f)
                horizontalLineToRelative(-2.17f)
                lineToRelative(0.52f, -1.0f)
                horizontalLineToRelative(1.52f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.52f, -0.94f)
                horizontalLineToRelative(1.57f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, 1.813f, -4.944f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 1.067f, -1.28f)
                quadToRelative(0.556f, -0.548f, 1.204f, -0.985f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 2.092f, -1.03f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 1.899f, -0.394f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 1.115f, -0.027f)
                moveTo(24.694f, 4.0f)
                arcTo(22.2f, 22.2f, 0.0f, false, true, 36.02f, 7.475f)
                arcTo(22.2f, 22.2f, 0.0f, false, true, 43.0f, 14.577f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.672f)
                arcTo(21.21f, 21.21f, 0.0f, false, false, 25.387f, 5.032f)
                lineTo(24.668f, 5.0f)
                curveTo(13.755f, 4.986f, 5.0f, 13.495f, 5.0f, 24.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 12.909f, 13.24f, 3.98f, 24.68f, 4.0f)
                close()
            }
        }
        .build()
        return _moneyExchangeLarge!!
    }

private var _moneyExchangeLarge: ImageVector? = null
