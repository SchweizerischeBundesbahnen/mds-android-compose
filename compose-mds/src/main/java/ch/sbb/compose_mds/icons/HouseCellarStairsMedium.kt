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

public val SBBIcons.HouseCellarStairsMedium: ImageVector
    get() {
        if (_houseCellarStairsMedium != null) {
            return _houseCellarStairsMedium!!
        }
        _houseCellarStairsMedium = Builder(name = "HouseCellarStairsMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(30.353f, 16.142f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-1.397f, -1.397f)
                verticalLineToRelative(7.294f)
                lineTo(33.0f, 22.746f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(9.0f)
                lineTo(7.75f, 32.746f)
                verticalLineToRelative(-9.0f)
                lineTo(3.0f, 23.746f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(-7.294f)
                lineTo(6.352f, 16.85f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(17.999f, 3.788f)
                close()
                moveTo(8.749f, 24.246f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.508f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.492f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-8.0f)
                lineTo(8.75f, 23.746f)
                close()
                moveTo(8.749f, 31.746f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.492f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.508f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(8.749f, 14.452f)
                verticalLineToRelative(8.294f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(-8.294f)
                lineTo(18.0f, 5.202f)
                close()
            }
        }
        .build()
        return _houseCellarStairsMedium!!
    }

private var _houseCellarStairsMedium: ImageVector? = null
