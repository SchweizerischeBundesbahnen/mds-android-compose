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

public val SBBIcons.HierarchyLarge: ImageVector
    get() {
        if (_hierarchyLarge != null) {
            return _hierarchyLarge!!
        }
        _hierarchyLarge = Builder(name = "HierarchyLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(34.0f, 18.0f)
                lineTo(34.0f, 3.0f)
                lineTo(15.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.0f)
                lineTo(12.0f, 23.0f)
                verticalLineToRelative(6.0f)
                lineTo(3.0f, 29.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(19.0f)
                lineTo(22.0f, 29.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(19.0f)
                lineTo(46.0f, 29.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-6.0f)
                lineTo(25.0f, 23.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(33.0f, 17.0f)
                lineTo(16.0f, 17.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(21.0f, 43.0f)
                lineTo(4.0f, 43.0f)
                lineTo(4.0f, 30.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(28.0f, 43.0f)
                horizontalLineToRelative(17.0f)
                lineTo(45.0f, 30.0f)
                lineTo(28.0f, 30.0f)
                close()
            }
        }
        .build()
        return _hierarchyLarge!!
    }

private var _hierarchyLarge: ImageVector? = null
