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

public val SBBIcons.LowVisionMedium: ImageVector
    get() {
        if (_lowVisionMedium != null) {
            return _lowVisionMedium!!
        }
        _lowVisionMedium = Builder(name = "LowVisionMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(28.312f, 29.379f)
                lineToRelative(0.706f, -0.707f)
                lineToRelative(-22.5f, -22.5f)
                lineToRelative(-0.706f, 0.707f)
                lineToRelative(4.423f, 4.423f)
                arcToRelative(25.6f, 25.6f, 0.0f, false, false, -5.227f, 5.433f)
                lineToRelative(-0.2f, 0.282f)
                lineToRelative(0.192f, 0.287f)
                curveToRelative(0.576f, 0.857f, 2.202f, 2.958f, 4.498f, 4.85f)
                curveToRelative(2.29f, 1.888f, 5.31f, 3.62f, 8.667f, 3.62f)
                horizontalLineToRelative(0.015f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, false, 5.168f, -1.359f)
                close()
                moveTo(22.605f, 23.672f)
                lineTo(10.948f, 12.015f)
                arcToRelative(24.5f, 24.5f, 0.0f, false, false, -2.449f, 2.138f)
                lineTo(19.043f, 24.71f)
                curveToRelative(1.238f, -0.14f, 2.443f, -0.49f, 3.562f, -1.04f)
                moveToRelative(-4.44f, -15.397f)
                curveToRelative(3.356f, 0.0f, 6.378f, 1.733f, 8.667f, 3.62f)
                curveToRelative(2.296f, 1.893f, 3.92f, 3.994f, 4.497f, 4.85f)
                lineToRelative(0.194f, 0.289f)
                lineToRelative(-0.202f, 0.282f)
                lineToRelative(-0.406f, -0.291f)
                lineToRelative(0.406f, 0.291f)
                arcToRelative(26.2f, 26.2f, 0.0f, false, true, -4.342f, 4.725f)
                lineToRelative(-0.648f, -0.762f)
                arcToRelative(25.2f, 25.2f, 0.0f, false, false, 3.967f, -4.262f)
                arcToRelative(24.6f, 24.6f, 0.0f, false, false, -4.102f, -4.35f)
                curveToRelative(-2.212f, -1.824f, -5.008f, -3.39f, -8.024f, -3.392f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -3.512f, 0.714f)
                lineToRelative(-0.37f, -0.928f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 3.864f, -0.786f)
                close()
                moveTo(6.03f, 17.03f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, 1.777f, -2.157f)
                lineToRelative(9.874f, 9.888f)
                curveToRelative(-2.833f, -0.156f, -5.451f, -1.65f, -7.546f, -3.378f)
                curveToRelative(-1.979f, -1.63f, -3.439f, -3.427f, -4.105f, -4.353f)
                moveToRelative(13.664f, -5.56f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -2.948f, 0.002f)
                lineToRelative(0.26f, 0.966f)
                arcToRelative(4.69f, 4.69f, 0.0f, false, true, 5.747f, 5.747f)
                lineToRelative(0.966f, 0.26f)
                arcToRelative(5.69f, 5.69f, 0.0f, false, false, -4.025f, -6.975f)
            }
        }
        .build()
        return _lowVisionMedium!!
    }

private var _lowVisionMedium: ImageVector? = null
