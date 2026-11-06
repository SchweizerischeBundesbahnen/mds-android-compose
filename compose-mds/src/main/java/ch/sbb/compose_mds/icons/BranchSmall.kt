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

public val SBBIcons.BranchSmall: ImageVector
    get() {
        if (_branchSmall != null) {
            return _branchSmall!!
        }
        _branchSmall = Builder(name = "BranchSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 1.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.0f, 6.45f)
                verticalLineTo(13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.967f, -2.559f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 1.007f, 0.012f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 13.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(0.55f)
                arcToRelative(2.501f, 2.501f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(6.45f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.5f, -4.95f)
                moveToRelative(0.0f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(9.0f, -13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-9.0f, -2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
            }
        }
        .build()
        return _branchSmall!!
    }

private var _branchSmall: ImageVector? = null
