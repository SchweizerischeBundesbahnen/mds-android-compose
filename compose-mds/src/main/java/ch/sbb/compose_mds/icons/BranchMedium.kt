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

public val SBBIcons.BranchMedium: ImageVector
    get() {
        if (_branchMedium != null) {
            return _branchMedium!!
        }
        _branchMedium = Builder(
            name = "BranchMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(11.25f, 2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.5f, 6.964f)
                verticalLineToRelative(10.862f)
                arcTo(7.25f, 7.25f, 0.0f, false, true, 18.0f, 16.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 4.727f, -4.29f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 1.003f, 0.006f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -5.73f, 5.284f)
                horizontalLineTo(18.0f)
                arcTo(6.25f, 6.25f, 0.0f, false, false, 11.75f, 24.0f)
                verticalLineToRelative(1.035f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(9.464f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.5f, -6.964f)
                moveToRelative(0.0f, 23.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(13.5f, -19.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(-13.5f, -3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
            .build()
        return _branchMedium!!
    }

private var _branchMedium: ImageVector? = null
