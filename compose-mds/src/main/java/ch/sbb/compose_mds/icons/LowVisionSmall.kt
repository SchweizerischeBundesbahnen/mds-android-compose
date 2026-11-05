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

public val SBBIcons.LowVisionSmall: ImageVector
    get() {
        if (_lowVisionSmall != null) {
            return _lowVisionSmall!!
        }
        _lowVisionSmall = Builder(name = "LowVisionSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(15.534f, 16.48f)
                lineToRelative(3.223f, 3.224f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(-15.0f, -15.0f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(2.815f, 2.815f)
                arcToRelative(17.2f, 17.2f, 0.0f, false, false, -3.37f, 3.541f)
                lineToRelative(-0.2f, 0.282f)
                lineToRelative(0.193f, 0.287f)
                curveToRelative(0.392f, 0.582f, 1.485f, 1.995f, 3.031f, 3.27f)
                curveToRelative(1.54f, 1.268f, 3.59f, 2.451f, 5.884f, 2.451f)
                horizontalLineToRelative(0.015f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 3.41f, -0.87f)
                moveToRelative(-0.75f, -0.749f)
                lineToRelative(-7.5f, -7.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.381f, 1.205f)
                lineToRelative(6.854f, 6.863f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 2.027f, -0.568f)
                moveTo(12.11f, 5.35f)
                curveToRelative(2.294f, 0.0f, 4.345f, 1.183f, 5.884f, 2.452f)
                curveToRelative(1.546f, 1.274f, 2.64f, 2.688f, 3.031f, 3.269f)
                lineToRelative(0.194f, 0.288f)
                lineToRelative(-0.202f, 0.282f)
                arcToRelative(17.6f, 17.6f, 0.0f, false, true, -2.923f, 3.18f)
                lineToRelative(-0.648f, -0.762f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, 2.548f, -2.714f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, -2.636f, -2.772f)
                curveToRelative(-1.462f, -1.205f, -3.289f, -2.221f, -5.243f, -2.223f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -2.279f, 0.464f)
                lineToRelative(-0.372f, -0.928f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.1f, 5.35f)
                close()
                moveTo(4.226f, 11.354f)
                quadToRelative(0.464f, -0.623f, 0.983f, -1.197f)
                lineToRelative(6.134f, 6.142f)
                curveToRelative(-1.665f, -0.22f, -3.21f, -1.125f, -4.48f, -2.172f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, -2.637f, -2.773f)
                moveToRelative(8.946f, -3.868f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, false, -2.052f, 0.001f)
                lineToRelative(0.26f, 0.966f)
                arcToRelative(2.96f, 2.96f, 0.0f, false, true, 3.627f, 3.627f)
                lineToRelative(0.966f, 0.26f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, false, -2.8f, -4.854f)
            }
        }
        .build()
        return _lowVisionSmall!!
    }

private var _lowVisionSmall: ImageVector? = null
