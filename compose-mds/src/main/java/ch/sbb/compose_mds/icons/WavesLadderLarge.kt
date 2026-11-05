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

public val SBBIcons.WavesLadderLarge: ImageVector
    get() {
        if (_wavesLadderLarge != null) {
            return _wavesLadderLarge!!
        }
        _wavesLadderLarge = Builder(
            name = "WavesLadderLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(44.0f, 37.0f)
                curveToRelative(-1.532f, 0.0f, -2.272f, 0.445f, -3.08f, 0.93f)
                curveToRelative(-0.86f, 0.515f, -1.789f, 1.07f, -3.592f, 1.07f)
                reflectiveCurveToRelative(-2.732f, -0.555f, -3.593f, -1.07f)
                curveToRelative(-0.807f, -0.485f, -1.546f, -0.93f, -3.079f, -0.93f)
                curveToRelative(-1.53f, 0.0f, -2.27f, 0.445f, -3.076f, 0.93f)
                curveToRelative(-0.86f, 0.515f, -1.788f, 1.07f, -3.59f, 1.07f)
                reflectiveCurveToRelative(-2.729f, -0.555f, -3.589f, -1.07f)
                curveToRelative(-0.805f, -0.485f, -1.543f, -0.93f, -3.073f, -0.93f)
                reflectiveCurveToRelative(-2.269f, 0.445f, -3.075f, 0.93f)
                curveToRelative(-0.86f, 0.515f, -1.788f, 1.07f, -3.59f, 1.07f)
                reflectiveCurveToRelative(-2.729f, -0.555f, -3.589f, -1.07f)
                curveTo(6.268f, 37.444f, 5.53f, 37.0f, 4.0f, 37.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.801f, 0.0f, 2.729f, 0.556f, 3.589f, 1.072f)
                curveToRelative(0.806f, 0.484f, 1.544f, 0.928f, 3.074f, 0.928f)
                reflectiveCurveToRelative(2.27f, -0.444f, 3.075f, -0.928f)
                curveToRelative(0.86f, -0.516f, 1.788f, -1.072f, 3.59f, -1.072f)
                reflectiveCurveToRelative(2.728f, 0.556f, 3.588f, 1.072f)
                curveToRelative(0.806f, 0.484f, 1.544f, 0.928f, 3.073f, 0.928f)
                curveToRelative(1.531f, 0.0f, 2.27f, -0.444f, 3.076f, -0.928f)
                curveToRelative(0.86f, -0.516f, 1.79f, -1.071f, 3.591f, -1.072f)
                curveToRelative(1.804f, 0.0f, 2.733f, 0.556f, 3.594f, 1.072f)
                curveToRelative(0.807f, 0.483f, 1.546f, 0.928f, 3.078f, 0.928f)
                reflectiveCurveToRelative(2.272f, -0.444f, 3.08f, -0.928f)
                curveTo(41.267f, 36.556f, 42.196f, 36.0f, 44.0f, 36.0f)
                close()
                moveTo(44.0f, 32.0f)
                curveToRelative(-1.532f, 0.0f, -2.272f, 0.444f, -3.08f, 0.928f)
                curveToRelative(-0.86f, 0.516f, -1.789f, 1.072f, -3.592f, 1.072f)
                reflectiveCurveToRelative(-2.732f, -0.556f, -3.593f, -1.072f)
                curveToRelative(-0.806f, -0.483f, -1.547f, -0.928f, -3.079f, -0.928f)
                curveToRelative(-1.53f, 0.0f, -2.27f, 0.444f, -3.076f, 0.928f)
                curveToRelative(-0.86f, 0.516f, -1.788f, 1.072f, -3.59f, 1.072f)
                reflectiveCurveToRelative(-2.729f, -0.556f, -3.589f, -1.072f)
                curveToRelative(-0.805f, -0.483f, -1.543f, -0.928f, -3.073f, -0.928f)
                reflectiveCurveToRelative(-2.269f, 0.444f, -3.075f, 0.928f)
                curveToRelative(-0.86f, 0.516f, -1.788f, 1.072f, -3.59f, 1.072f)
                reflectiveCurveToRelative(-2.729f, -0.556f, -3.589f, -1.072f)
                curveTo(6.268f, 32.445f, 5.53f, 32.0f, 4.0f, 32.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.801f, 0.0f, 2.73f, 0.555f, 3.589f, 1.07f)
                curveToRelative(0.806f, 0.485f, 1.544f, 0.93f, 3.074f, 0.93f)
                reflectiveCurveToRelative(2.27f, -0.445f, 3.075f, -0.93f)
                curveToRelative(0.86f, -0.515f, 1.788f, -1.07f, 3.59f, -1.07f)
                curveToRelative(1.8f, 0.0f, 2.729f, 0.555f, 3.588f, 1.07f)
                curveToRelative(0.806f, 0.485f, 1.544f, 0.93f, 3.073f, 0.93f)
                curveToRelative(1.531f, 0.0f, 2.27f, -0.446f, 3.076f, -0.93f)
                curveToRelative(0.86f, -0.515f, 1.79f, -1.07f, 3.591f, -1.07f)
                curveToRelative(1.803f, 0.0f, 2.733f, 0.555f, 3.594f, 1.07f)
                curveToRelative(0.807f, 0.484f, 1.546f, 0.93f, 3.078f, 0.93f)
                reflectiveCurveToRelative(2.272f, -0.445f, 3.08f, -0.93f)
                curveTo(41.267f, 31.556f, 42.196f, 31.0f, 44.0f, 31.0f)
                close()
                moveTo(38.001f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(17.859f)
                curveToRelative(0.373f, 0.088f, 0.803f, 0.14f, 1.327f, 0.14f)
                curveToRelative(1.532f, 0.0f, 2.272f, -0.444f, 3.08f, -0.928f)
                curveToRelative(0.86f, -0.516f, 1.789f, -1.072f, 3.592f, -1.072f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.532f, 0.0f, -2.272f, 0.446f, -3.08f, 0.93f)
                curveToRelative(-0.86f, 0.515f, -1.789f, 1.07f, -3.592f, 1.07f)
                reflectiveCurveToRelative(-2.732f, -0.555f, -3.593f, -1.07f)
                curveToRelative(-0.806f, -0.484f, -1.547f, -0.93f, -3.079f, -0.93f)
                curveToRelative(-1.53f, 0.0f, -2.27f, 0.446f, -3.076f, 0.93f)
                curveToRelative(-0.86f, 0.515f, -1.788f, 1.07f, -3.59f, 1.07f)
                reflectiveCurveToRelative(-2.729f, -0.555f, -3.589f, -1.07f)
                curveToRelative(-0.805f, -0.484f, -1.543f, -0.93f, -3.073f, -0.93f)
                reflectiveCurveToRelative(-2.269f, 0.446f, -3.075f, 0.93f)
                curveToRelative(-0.86f, 0.515f, -1.788f, 1.07f, -3.59f, 1.07f)
                reflectiveCurveToRelative(-2.729f, -0.555f, -3.589f, -1.07f)
                curveToRelative(-0.806f, -0.484f, -1.544f, -0.93f, -3.074f, -0.93f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.801f, 0.0f, 2.73f, 0.556f, 3.589f, 1.072f)
                curveToRelative(0.806f, 0.484f, 1.544f, 0.928f, 3.074f, 0.928f)
                reflectiveCurveToRelative(2.27f, -0.444f, 3.075f, -0.928f)
                curveToRelative(0.86f, -0.516f, 1.788f, -1.072f, 3.59f, -1.072f)
                curveToRelative(1.8f, 0.0f, 2.729f, 0.556f, 3.588f, 1.072f)
                curveToRelative(0.806f, 0.484f, 1.544f, 0.928f, 3.073f, 0.928f)
                curveToRelative(1.49f, 0.0f, 2.23f, -0.421f, 3.012f, -0.89f)
                lineTo(27.001f, 9.999f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                moveToRelative(-10.0f, 19.556f)
                curveToRelative(0.66f, -0.312f, 1.467f, -0.556f, 2.655f, -0.556f)
                curveToRelative(1.803f, 0.0f, 2.733f, 0.555f, 3.594f, 1.07f)
                curveToRelative(0.248f, 0.15f, 0.49f, 0.292f, 0.751f, 0.422f)
                lineTo(35.001f, 22.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(28.001f, 20.999f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
            .build()
        return _wavesLadderLarge!!
    }

private var _wavesLadderLarge: ImageVector? = null
