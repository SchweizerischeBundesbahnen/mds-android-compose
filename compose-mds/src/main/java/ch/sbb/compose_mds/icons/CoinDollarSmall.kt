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

public val SBBIcons.CoinDollarSmall: ImageVector
    get() {
        if (_coinDollarSmall != null) {
            return _coinDollarSmall!!
        }
        _coinDollarSmall = Builder(name = "CoinDollarSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.0f, -9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, -9.0f)
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                moveToRelative(10.435f, 4.084f)
                quadToRelative(0.822f, -0.005f, 1.346f, -0.512f)
                quadToRelative(0.523f, -0.506f, 0.523f, -1.3f)
                quadToRelative(0.0f, -0.813f, -0.453f, -1.284f)
                quadToRelative(-0.452f, -0.47f, -1.416f, -0.649f)
                close()
                moveTo(11.657f, 7.618f)
                quadToRelative(-0.687f, 0.02f, -1.076f, 0.29f)
                quadToRelative(-0.695f, 0.48f, -0.695f, 1.388f)
                quadToRelative(0.0f, 0.708f, 0.433f, 1.118f)
                quadToRelative(0.431f, 0.411f, 1.338f, 0.566f)
                close()
                moveTo(8.506f, 13.818f)
                horizontalLineToRelative(1.203f)
                quadToRelative(0.0f, 2.154f, 1.948f, 2.266f)
                lineTo(11.657f, 12.17f)
                quadToRelative(-1.083f, -0.183f, -1.827f, -0.658f)
                quadToRelative(-1.133f, -0.715f, -1.133f, -2.116f)
                quadToRelative(0.0f, -1.197f, 0.803f, -1.951f)
                quadToRelative(0.805f, -0.755f, 2.157f, -0.819f)
                lineTo(11.657f, 5.36f)
                horizontalLineToRelative(0.778f)
                verticalLineToRelative(1.266f)
                quadToRelative(1.346f, 0.109f, 2.039f, 0.793f)
                quadToRelative(0.75f, 0.738f, 0.736f, 1.94f)
                horizontalLineToRelative(-1.19f)
                quadToRelative(-0.112f, -1.677f, -1.585f, -1.734f)
                verticalLineToRelative(3.548f)
                quadToRelative(0.893f, 0.226f, 1.236f, 0.346f)
                quadToRelative(0.344f, 0.12f, 0.64f, 0.311f)
                quadToRelative(1.183f, 0.765f, 1.183f, 2.33f)
                quadToRelative(0.0f, 1.615f, -1.317f, 2.457f)
                quadToRelative(-0.63f, 0.404f, -1.742f, 0.468f)
                verticalLineToRelative(1.558f)
                horizontalLineToRelative(-0.778f)
                verticalLineToRelative(-1.558f)
                quadToRelative(-1.593f, -0.1f, -2.365f, -0.95f)
                quadToRelative(-0.794f, -0.878f, -0.786f, -2.315f)
                moveTo(8.8f, 4.67f)
                arcToRelative(8.01f, 8.01f, 0.0f, false, false, -4.499f, 5.197f)
                lineToRelative(0.964f, 0.267f)
                arcTo(7.01f, 7.01f, 0.0f, false, true, 9.2f, 5.587f)
                close()
            }
        }
        .build()
        return _coinDollarSmall!!
    }

private var _coinDollarSmall: ImageVector? = null
