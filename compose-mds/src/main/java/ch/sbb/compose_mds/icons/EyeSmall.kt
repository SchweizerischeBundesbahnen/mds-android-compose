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

public val SBBIcons.EyeSmall: ImageVector
    get() {
        if (_eyeSmall != null) {
            return _eyeSmall!!
        }
        _eyeSmall = Builder(
            name = "EyeSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(12.0f, 6.0f)
                curveTo(9.708f, 6.0f, 7.685f, 7.154f, 6.157f, 8.41f)
                arcToRelative(17.7f, 17.7f, 0.0f, false, false, -3.066f, 3.303f)
                lineToRelative(-0.198f, 0.282f)
                lineToRelative(0.193f, 0.285f)
                curveToRelative(0.392f, 0.58f, 1.486f, 1.994f, 3.031f, 3.268f)
                curveTo(7.656f, 16.818f, 9.707f, 18.0f, 12.0f, 18.0f)
                curveToRelative(2.292f, 0.0f, 4.315f, -1.153f, 5.843f, -2.41f)
                arcToRelative(17.7f, 17.7f, 0.0f, false, false, 3.066f, -3.302f)
                lineToRelative(0.198f, -0.282f)
                lineToRelative(-0.193f, -0.286f)
                curveToRelative(-0.392f, -0.58f, -1.486f, -1.994f, -3.031f, -3.268f)
                curveTo(16.344f, 7.183f, 14.294f, 6.0f, 12.0f, 6.0f)
                moveToRelative(-5.247f, 8.777f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, -2.637f, -2.774f)
                curveToRelative(0.498f, -0.667f, 1.436f, -1.8f, 2.677f, -2.82f)
                curveTo(8.24f, 7.992f, 10.042f, 7.0f, 12.0f, 7.0f)
                curveToRelative(1.956f, 0.0f, 3.784f, 1.017f, 5.247f, 2.223f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, 2.638f, 2.774f)
                curveToRelative(-0.499f, 0.667f, -1.437f, 1.8f, -2.678f, 2.82f)
                curveTo(15.76f, 16.01f, 13.958f, 17.0f, 12.0f, 17.0f)
                curveToRelative(-1.956f, 0.0f, -3.784f, -1.017f, -5.247f, -2.223f)
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                moveToRelative(-3.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
            }
        }
            .build()
        return _eyeSmall!!
    }

private var _eyeSmall: ImageVector? = null
