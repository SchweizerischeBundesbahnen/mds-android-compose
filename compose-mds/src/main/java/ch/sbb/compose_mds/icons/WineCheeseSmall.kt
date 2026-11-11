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

public val SBBIcons.WineCheeseSmall: ImageVector
    get() {
        if (_wineCheeseSmall != null) {
            return _wineCheeseSmall!!
        }
        _wineCheeseSmall = Builder(name = "WineCheeseSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(5.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(4.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.0f)
                lineTo(10.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(8.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                moveToRelative(5.0f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(3.0f, -5.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.064f)
                lineToRelative(-0.248f, -0.145f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 17.5f)
                curveToRelative(0.0f, -0.48f, 0.23f, -0.907f, 0.59f, -1.183f)
                lineToRelative(0.162f, -0.108f)
                lineToRelative(0.248f, -0.145f)
                close()
                moveTo(17.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.51f)
                curveToRelative(-0.602f, 0.454f, -1.0f, 1.17f, -1.0f, 1.99f)
                reflectiveCurveToRelative(0.398f, 1.535f, 1.0f, 1.988f)
                lineTo(21.0f, 21.0f)
                lineTo(10.0f, 21.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
            }
        }
        .build()
        return _wineCheeseSmall!!
    }

private var _wineCheeseSmall: ImageVector? = null
