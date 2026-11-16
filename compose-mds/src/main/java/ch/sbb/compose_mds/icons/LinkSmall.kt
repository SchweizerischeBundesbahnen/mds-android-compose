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
                moveTo(18.808f, 4.521f)
                arcToRelative(3.473f, 3.473f, 0.0f, false, false, -4.92f, 0.0f)
                lineToRelative(-0.874f, 0.875f)
                lineToRelative(-1.6f, 1.601f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(0.788f, -0.789f)
                lineToRelative(0.81f, -0.811f)
                lineToRelative(0.624f, -0.625f)
                lineToRelative(0.12f, -0.118f)
                lineToRelative(0.065f, -0.065f)
                lineToRelative(0.032f, -0.033f)
                lineToRelative(0.017f, -0.017f)
                lineToRelative(0.017f, -0.017f)
                arcToRelative(2.474f, 2.474f, 0.0f, false, true, 3.507f, 0.0f)
                lineToRelative(0.007f, 0.007f)
                lineToRelative(0.729f, 0.7f)
                curveToRelative(0.974f, 0.973f, 0.976f, 2.54f, 0.006f, 3.51f)
                lineToRelative(-0.001f, 0.001f)
                lineToRelative(-4.248f, 4.267f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -3.535f, 0.0f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(0.707f, 0.707f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 4.95f, 0.0f)
                verticalLineToRelative(-0.001f)
                lineToRelative(4.249f, -4.268f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, false, -0.005f, -4.923f)
                lineToRelative(-0.008f, -0.007f)
                close()
                moveTo(19.538f, 5.221f)
                lineTo(19.192f, 5.582f)
                lineTo(19.18f, 5.594f)
                close()
                moveTo(12.914f, 9.878f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, -4.95f, 0.0f)
                lineTo(3.722f, 14.12f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 0.0f, 4.95f)
                lineToRelative(0.707f, 0.707f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 4.949f, 0.0f)
                lineToRelative(2.48f, -2.48f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-2.48f, 2.48f)
                curveToRelative(-0.91f, 0.91f, -2.367f, 0.967f, -3.346f, 0.17f)
                lineToRelative(-0.19f, -0.17f)
                lineToRelative(-0.706f, -0.707f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 0.0f, -3.536f)
                lineToRelative(4.24f, -4.243f)
                horizontalLineToRelative(0.002f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 3.536f, 0.0f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(0.707f, -0.706f)
                close()
            }
        }
        .build()
        return _linkSmall!!
    }

private var _linkSmall: ImageVector? = null
