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

public val SBBIcons.TabletLarge: ImageVector
    get() {
        if (_tabletLarge != null) {
            return _tabletLarge!!
        }
        _tabletLarge = Builder(name = "TabletLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 44.5f)
                horizontalLineToRelative(23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-34.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.846f, 2.996f)
                close()
                moveTo(10.5f, 11.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(27.0f)
                lineTo(37.5f, 11.0f)
                close()
                moveTo(10.5f, 10.0f)
                horizontalLineToRelative(27.0f)
                lineTo(37.5f, 7.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-23.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                close()
                moveTo(37.5f, 41.5f)
                lineTo(37.5f, 39.0f)
                horizontalLineToRelative(-27.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(23.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                moveTo(26.0f, 42.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(28.0f, 8.0f)
                lineTo(28.0f, 7.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.0f, 7.0f)
                close()
            }
        }
        .build()
        return _tabletLarge!!
    }

private var _tabletLarge: ImageVector? = null
