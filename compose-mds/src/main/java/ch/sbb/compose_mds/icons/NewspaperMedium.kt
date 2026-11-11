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
                moveTo(28.25f, 11.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.503f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.497f, 2.497f)
                lineTo(8.248f, 28.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.498f, -2.497f)
                lineTo(5.75f, 7.25f)
                horizontalLineToRelative(21.5f)
                lineTo(27.25f, 25.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(27.753f, 29.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.497f, -3.497f)
                lineTo(31.25f, 10.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.5f)
                lineTo(4.75f, 6.25f)
                verticalLineToRelative(20.003f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.498f, 3.497f)
                close()
                moveTo(14.75f, 17.75f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(13.75f, 16.75f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(25.5f, 15.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(25.5f, 13.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(25.5f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(25.5f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(25.5f, 22.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 19.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 22.75f)
                verticalLineToRelative(1.0f)
                lineTo(7.5f, 23.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(25.5f, 26.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _newspaperMedium!!
    }

private var _newspaperMedium: ImageVector? = null
