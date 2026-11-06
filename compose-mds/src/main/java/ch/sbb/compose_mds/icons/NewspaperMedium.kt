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

public val SBBIcons.NewspaperMedium: ImageVector
    get() {
        if (_newspaperMedium != null) {
            return _newspaperMedium!!
        }
        _newspaperMedium = Builder(name = "NewspaperMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(20.003f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.499f, 3.497f)
                horizontalLineToRelative(19.504f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.497f, -3.497f)
                lineTo(31.25f, 10.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-23.0f)
                moveToRelative(23.0f, 19.25f)
                lineTo(28.25f, 11.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.503f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.497f, 2.497f)
                lineTo(8.249f, 28.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.499f, -2.497f)
                lineTo(5.75f, 7.25f)
                horizontalLineToRelative(21.5f)
                lineTo(27.25f, 25.5f)
                close()
                moveTo(8.25f, 12.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-6.5f)
                moveToRelative(0.5f, 4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(25.5f, 16.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(16.5f, 13.25f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(25.5f, 10.25f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(16.5f, 20.75f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(25.5f, 23.75f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(7.5f, 20.75f)
                lineTo(15.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 19.75f)
                close()
                moveTo(15.0f, 23.75f)
                lineTo(7.5f, 23.75f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 22.75f)
                close()
                moveTo(7.5f, 25.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _newspaperMedium!!
    }

private var _newspaperMedium: ImageVector? = null
