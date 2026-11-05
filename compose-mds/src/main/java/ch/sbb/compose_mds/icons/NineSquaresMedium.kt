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

public val SBBIcons.NineSquaresMedium: ImageVector
    get() {
        if (_nineSquaresMedium != null) {
            return _nineSquaresMedium!!
        }
        _nineSquaresMedium = Builder(name = "NineSquaresMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 6.25f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(15.25f, 6.25f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(24.75f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(0.5f, 4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(6.25f, 15.25f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(15.75f, 15.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(0.5f, 4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(24.25f, 15.25f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(6.75f, 24.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(0.5f, 4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(15.25f, 24.25f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(24.75f, 24.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(0.5f, 4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _nineSquaresMedium!!
    }

private var _nineSquaresMedium: ImageVector? = null
