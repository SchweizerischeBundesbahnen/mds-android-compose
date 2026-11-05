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

public val SBBIcons.HouseCellarStairsLarge: ImageVector
    get() {
        if (_houseCellarStairsLarge != null) {
            return _houseCellarStairsLarge!!
        }
        _houseCellarStairsLarge = Builder(
            name = "HouseCellarStairsLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveToRelative(40.853f, 21.14f)
                lineToRelative(-0.708f, 0.707f)
                lineTo(38.0f, 19.7f)
                verticalLineToRelative(10.294f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-27.0f)
                verticalLineToRelative(-12.0f)
                lineTo(4.0f, 30.994f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.999f)
                lineTo(10.999f, 19.7f)
                lineToRelative(-2.146f, 2.147f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(24.499f, 4.786f)
                close()
                moveTo(11.999f, 41.993f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-0.999f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.99f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.01f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(11.999f, 31.994f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.99f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-25.0f)
                close()
                moveTo(11.999f, 18.7f)
                verticalLineToRelative(11.294f)
                horizontalLineToRelative(25.0f)
                lineTo(36.999f, 18.7f)
                lineToRelative(-12.5f, -12.5f)
                close()
                moveTo(24.5f, 12.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 4.999f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 24.5f, 12.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.5f, 13.0f)
            }
        }
            .build()
        return _houseCellarStairsLarge!!
    }

private var _houseCellarStairsLarge: ImageVector? = null
