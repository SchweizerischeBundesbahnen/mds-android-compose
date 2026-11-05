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

public val SBBIcons.GitMergeSmall: ImageVector
    get() {
        if (_gitMergeSmall != null) {
            return _gitMergeSmall!!
        }
        _gitMergeSmall = Builder(name = "GitMergeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 1.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.0f, 6.45f)
                verticalLineToRelative(10.1f)
                arcToRelative(2.501f, 2.501f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(6.45f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.5f, -4.95f)
                moveToRelative(7.495f, 6.304f)
                lineToRelative(-3.102f, 0.835f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, true, 5.094f, 7.909f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -1.0f, 0.005f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -4.629f, -7.066f)
                lineToRelative(0.845f, 3.152f)
                lineToRelative(-0.966f, 0.259f)
                lineToRelative(-1.279f, -4.774f)
                lineToRelative(0.482f, -0.13f)
                lineToRelative(4.295f, -1.157f)
                close()
                moveTo(7.5f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(9.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-9.0f, -15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
            }
        }
        .build()
        return _gitMergeSmall!!
    }

private var _gitMergeSmall: ImageVector? = null
