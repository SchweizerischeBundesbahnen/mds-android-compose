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
                moveTo(11.75f, 6.25f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(7.25f, 10.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(20.75f, 6.25f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(16.25f, 10.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(29.75f, 11.75f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(28.75f, 10.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(11.75f, 15.25f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(7.25f, 19.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(20.75f, 20.75f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(19.75f, 19.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(29.75f, 15.25f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(25.25f, 19.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(11.75f, 29.75f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(10.75f, 28.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(20.75f, 24.25f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(16.25f, 28.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(29.75f, 29.75f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(28.75f, 28.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _nineSquaresMedium!!
    }

private var _nineSquaresMedium: ImageVector? = null
