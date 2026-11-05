package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.BranchLarge: ImageVector
    get() {
        if (_branchLarge != null) {
            return _branchLarge!!
        }
        _branchLarge = Builder(name = "BranchLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 4.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.5f, 8.97f)
                verticalLineToRelative(15.288f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 23.5f, 23.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(3.432f, 0.0f, 6.24f, -2.66f, 6.48f, -6.031f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 1.003f, 0.004f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 25.5f, 24.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -8.5f, 8.5f)
                verticalLineToRelative(1.528f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(12.971f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 14.5f, 4.0f)
                moveToRelative(0.0f, 31.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveToRelative(18.0f, -26.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveToRelative(-18.0f, -4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
            }
        }
        .build()
        return _branchLarge!!
    }

private var _branchLarge: ImageVector? = null
