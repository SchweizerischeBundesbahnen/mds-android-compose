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

public val SBBIcons.InfinityLoopMedium: ImageVector
    get() {
        if (_infinityLoopMedium != null) {
            return _infinityLoopMedium!!
        }
        _infinityLoopMedium = Builder(
            name = "InfinityLoopMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(21.651f, 12.651f)
                curveToRelative(2.536f, -2.535f, 6.647f, -2.534f, 9.197f, 0.0f)
                curveToRelative(2.553f, 2.537f, 2.533f, 6.649f, 0.001f, 9.197f)
                curveToRelative(-2.536f, 2.553f, -6.646f, 2.533f, -9.194f, 0.005f)
                lineToRelative(-2.505f, -2.445f)
                lineToRelative(0.35f, -0.358f)
                lineToRelative(0.349f, -0.358f)
                lineToRelative(2.505f, 2.445f)
                lineToRelative(0.003f, 0.004f)
                curveToRelative(2.162f, 2.148f, 5.64f, 2.157f, 7.783f, 0.002f)
                curveToRelative(2.148f, -2.163f, 2.159f, -5.641f, 0.002f, -7.784f)
                curveToRelative(-2.16f, -2.146f, -5.64f, -2.145f, -7.784f, 0.0f)
                lineToRelative(-8.0f, 8.479f)
                lineToRelative(-0.006f, 0.006f)
                lineToRelative(-0.005f, 0.006f)
                curveTo(11.8f, 24.38f, 7.688f, 24.4f, 5.15f, 21.848f)
                curveToRelative(-2.531f, -2.548f, -2.552f, -6.66f, 0.002f, -9.198f)
                curveToRelative(2.545f, -2.528f, 6.644f, -2.534f, 9.18f, -0.013f)
                lineToRelative(2.506f, 2.295f)
                lineToRelative(-0.338f, 0.368f)
                lineToRelative(-0.338f, 0.369f)
                lineToRelative(-2.505f, -2.295f)
                lineToRelative(-0.016f, -0.016f)
                curveToRelative(-2.144f, -2.144f, -5.623f, -2.145f, -7.784f, 0.001f)
                curveToRelative(-2.156f, 2.143f, -2.146f, 5.621f, 0.002f, 7.784f)
                curveToRelative(2.14f, 2.154f, 5.614f, 2.145f, 7.777f, 0.002f)
                lineToRelative(8.005f, -8.483f)
                close()
            }
        }
            .build()
        return _infinityLoopMedium!!
    }

private var _infinityLoopMedium: ImageVector? = null
