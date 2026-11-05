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

public val SBBIcons.LinkSmall: ImageVector
    get() {
        if (_linkSmall != null) {
            return _linkSmall!!
        }
        _linkSmall = Builder(name = "LinkSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.538f, 5.222f)
                lineToRelative(-0.733f, -0.704f)
                arcToRelative(3.473f, 3.473f, 0.0f, false, false, -4.917f, 0.004f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.004f, 0.004f)
                lineToRelative(-0.013f, 0.013f)
                lineToRelative(-0.05f, 0.05f)
                lineToRelative(-0.184f, 0.184f)
                lineToRelative(-0.623f, 0.624f)
                lineToRelative(-1.6f, 1.6f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(1.6f, -1.6f)
                lineToRelative(0.624f, -0.624f)
                lineToRelative(0.184f, -0.185f)
                lineToRelative(0.05f, -0.05f)
                lineToRelative(0.012f, -0.012f)
                lineToRelative(0.003f, -0.003f)
                lineToRelative(0.001f, -0.001f)
                arcToRelative(2.474f, 2.474f, 0.0f, false, true, 3.507f, 0.0f)
                lineToRelative(0.007f, 0.007f)
                lineToRelative(0.733f, 0.703f)
                curveToRelative(0.97f, 0.973f, 0.971f, 2.539f, 0.002f, 3.507f)
                verticalLineToRelative(0.001f)
                lineToRelative(-4.249f, 4.267f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -3.535f, 0.0f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(0.707f, 0.707f)
                arcToRelative(3.507f, 3.507f, 0.0f, false, false, 4.95f, 0.0f)
                verticalLineToRelative(-0.001f)
                lineToRelative(4.248f, -4.266f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, -0.006f, -4.925f)
                close()
                moveTo(12.914f, 9.878f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, -4.95f, 0.0f)
                lineToRelative(-4.242f, 4.243f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 0.0f, 4.95f)
                lineToRelative(0.707f, 0.707f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 4.949f, 0.0f)
                lineToRelative(2.48f, -2.48f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-2.48f, 2.48f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -3.535f, 0.0f)
                lineToRelative(-0.707f, -0.707f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 0.0f, -3.536f)
                lineToRelative(4.242f, -4.243f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 3.536f, 0.0f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _linkSmall!!
    }

private var _linkSmall: ImageVector? = null
