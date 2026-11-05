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

public val SBBIcons.HierarchyMedium: ImageVector
    get() {
        if (_hierarchyMedium != null) {
            return _hierarchyMedium!!
        }
        _hierarchyMedium = Builder(name = "HierarchyMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.75f, 6.25f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-8.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(7.25f, 23.75f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(22.25f, 23.75f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _hierarchyMedium!!
    }

private var _hierarchyMedium: ImageVector? = null
