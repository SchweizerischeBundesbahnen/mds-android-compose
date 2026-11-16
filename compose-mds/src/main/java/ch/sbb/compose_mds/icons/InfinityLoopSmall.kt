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

public val SBBIcons.InfinityLoopSmall: ImageVector
    get() {
        if (_infinityLoopSmall != null) {
            return _infinityLoopSmall!!
        }
        _infinityLoopSmall = Builder(name = "InfinityLoopSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.316f, 8.316f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, true, 6.367f, 0.0f)
                curveToRelative(1.768f, 1.757f, 1.753f, 4.604f, 0.002f, 6.367f)
                curveToRelative(-1.757f, 1.768f, -4.602f, 1.753f, -6.365f, 0.005f)
                lineToRelative(-1.67f, -1.63f)
                lineToRelative(0.699f, -0.716f)
                lineToRelative(1.67f, 1.63f)
                lineToRelative(0.004f, 0.004f)
                curveToRelative(1.377f, 1.368f, 3.59f, 1.373f, 4.953f, 0.002f)
                curveToRelative(1.368f, -1.377f, 1.373f, -3.591f, 0.002f, -4.954f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, -4.955f, 0.0f)
                lineToRelative(-5.33f, 5.649f)
                lineToRelative(-0.005f, 0.006f)
                lineToRelative(-0.005f, 0.006f)
                curveToRelative(-1.763f, 1.751f, -4.61f, 1.766f, -6.368f, -0.002f)
                curveToRelative(-1.751f, -1.763f, -1.766f, -4.61f, 0.002f, -6.367f)
                arcToRelative(4.507f, 4.507f, 0.0f, false, true, 6.351f, -0.014f)
                lineToRelative(1.67f, 1.53f)
                lineToRelative(-0.676f, 0.736f)
                lineToRelative(-1.67f, -1.529f)
                lineToRelative(-0.015f, -0.015f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, -4.955f, 0.0f)
                curveToRelative(-1.37f, 1.363f, -1.366f, 3.577f, 0.002f, 4.954f)
                curveToRelative(1.36f, 1.369f, 3.57f, 1.365f, 4.947f, 0.002f)
                lineToRelative(5.336f, -5.653f)
                lineToRelative(0.005f, -0.006f)
                close()
            }
        }
        .build()
        return _infinityLoopSmall!!
    }

private var _infinityLoopSmall: ImageVector? = null
