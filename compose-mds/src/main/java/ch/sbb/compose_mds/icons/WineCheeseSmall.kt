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
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                verticalLineTo(2.0f)
                moveToRelative(4.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                moveToRelative(3.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveToRelative(4.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-1.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveTo(9.5f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.064f)
                lineToRelative(-0.248f, -0.145f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 17.5f)
                curveToRelative(0.0f, -0.549f, 0.3f, -1.028f, 0.752f, -1.291f)
                lineToRelative(0.248f, -0.145f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(9.5f)
                moveToRelative(0.5f, 8.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.51f)
                curveToRelative(-0.602f, 0.453f, -1.0f, 1.17f, -1.0f, 1.99f)
                reflectiveCurveToRelative(0.398f, 1.537f, 1.0f, 1.99f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _wineCheeseSmall!!
    }

private var _wineCheeseSmall: ImageVector? = null
