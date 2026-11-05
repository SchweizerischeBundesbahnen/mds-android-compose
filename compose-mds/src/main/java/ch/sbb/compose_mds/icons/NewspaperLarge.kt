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

public val SBBIcons.NewspaperLarge: ImageVector
    get() {
        if (_newspaperLarge != null) {
            return _newspaperLarge!!
        }
        _newspaperLarge = Builder(name = "NewspaperLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.08f, 8.12f)
                horizontalLineToRelative(31.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(20.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, 4.5f)
                horizontalLineToRelative(-25.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, -4.5f)
                lineTo(7.08f, 8.12f)
                moveToRelative(31.0f, 7.0f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(37.08f, 9.12f)
                horizontalLineToRelative(-29.0f)
                verticalLineToRelative(25.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, 3.5f)
                horizontalLineToRelative(25.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-19.5f)
                close()
                moveTo(10.08f, 16.12f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(22.58f, 25.12f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-11.5f)
                moveToRelative(0.5f, 6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(34.08f, 21.12f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(22.08f, 17.12f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(34.08f, 13.12f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(10.08f, 26.12f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(20.08f, 30.12f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(10.08f, 34.12f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _newspaperLarge!!
    }

private var _newspaperLarge: ImageVector? = null
