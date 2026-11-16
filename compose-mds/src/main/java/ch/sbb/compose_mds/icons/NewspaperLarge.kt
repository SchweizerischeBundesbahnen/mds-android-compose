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
                moveTo(40.08f, 15.12f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(37.08f, 9.12f)
                horizontalLineToRelative(-29.0f)
                verticalLineToRelative(25.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, 3.5f)
                horizontalLineToRelative(25.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                close()
                moveTo(41.08f, 34.62f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, 4.5f)
                horizontalLineToRelative(-25.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, -4.5f)
                lineTo(7.08f, 8.12f)
                horizontalLineToRelative(31.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.08f, 16.12f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(11.08f, 22.12f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(34.08f, 32.12f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(33.08f, 31.12f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(34.08f, 20.12f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(34.08f, 17.12f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(34.08f, 12.12f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(20.08f, 26.12f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(20.08f, 29.12f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(34.08f, 35.12f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _newspaperLarge!!
    }

private var _newspaperLarge: ImageVector? = null
