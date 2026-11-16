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

public val SBBIcons.HouseCellarStairsSmall: ImageVector
    get() {
        if (_houseCellarStairsSmall != null) {
            return _houseCellarStairsSmall!!
        }
        _houseCellarStairsSmall = Builder(name = "HouseCellarStairsSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.353f, 10.644f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-0.646f, -0.647f)
                verticalLineToRelative(4.293f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                lineTo(5.0f, 21.997f)
                verticalLineToRelative(-6.0f)
                lineTo(2.0f, 15.997f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.293f)
                lineToRelative(-0.647f, 0.647f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(12.0f, 2.289f)
                close()
                moveTo(8.0f, 16.997f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.005f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.995f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                lineTo(8.0f, 15.997f)
                close()
                moveTo(6.0f, 20.997f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-0.995f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.005f)
                lineTo(9.0f, 18.997f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 17.997f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 16.997f)
                close()
                moveTo(6.0f, 9.704f)
                verticalLineToRelative(5.293f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 9.704f)
                lineToRelative(-6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _houseCellarStairsSmall!!
    }

private var _houseCellarStairsSmall: ImageVector? = null
