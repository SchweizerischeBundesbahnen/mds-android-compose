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

public val SBBIcons.MountainRockTransmitterSignalMedium: ImageVector
    get() {
        if (_mountainRockTransmitterSignalMedium != null) {
            return _mountainRockTransmitterSignalMedium!!
        }
        _mountainRockTransmitterSignalMedium = Builder(
            name = "MountainRockTransmitterSignalMedium",
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
                pathFillType = EvenOdd,
            ) {
                moveToRelative(3.25f, 4.183f)
                lineToRelative(0.82f, 0.683f)
                lineToRelative(4.5f, 3.75f)
                lineToRelative(0.136f, 0.113f)
                lineToRelative(0.034f, 0.173f)
                lineToRelative(1.45f, 7.246f)
                lineToRelative(6.513f, 2.895f)
                lineToRelative(0.214f, 0.095f)
                lineToRelative(0.064f, 0.225f)
                lineToRelative(1.312f, 4.591f)
                lineToRelative(8.43f, -5.62f)
                lineToRelative(0.554f, 0.832f)
                lineToRelative(-8.519f, 5.68f)
                lineToRelative(6.364f, 7.07f)
                lineToRelative(0.75f, 0.834f)
                lineTo(3.25f, 32.75f)
                lineTo(3.25f, 4.183f)
                moveToRelative(1.0f, 2.135f)
                lineTo(4.25f, 31.75f)
                horizontalLineToRelative(19.377f)
                lineToRelative(-5.999f, -6.665f)
                lineToRelative(-0.077f, -0.086f)
                lineToRelative(-0.032f, -0.111f)
                lineToRelative(-1.436f, -5.026f)
                lineToRelative(-6.536f, -2.905f)
                lineToRelative(-0.237f, -0.105f)
                lineToRelative(-0.05f, -0.254f)
                lineToRelative(-1.466f, -7.327f)
                close()
                moveTo(22.112f, 15.346f)
                arcToRelative(6.752f, 6.752f, 0.0f, false, true, 9.777f, 0.0f)
                lineToRelative(0.722f, -0.692f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, false, -11.223f, 0.0f)
                close()
                moveTo(23.614f, 16.933f)
                curveToRelative(0.835f, -1.017f, 2.03f, -1.683f, 3.386f, -1.683f)
                reflectiveCurveToRelative(2.551f, 0.666f, 3.386f, 1.683f)
                lineToRelative(-0.772f, 0.634f)
                curveToRelative(-0.676f, -0.822f, -1.603f, -1.317f, -2.614f, -1.317f)
                reflectiveCurveToRelative(-1.938f, 0.495f, -2.614f, 1.317f)
                close()
                moveTo(16.179f, 7.993f)
                lineTo(13.929f, 4.243f)
                lineTo(13.071f, 4.757f)
                lineTo(15.321f, 8.507f)
                close()
                moveTo(10.179f, 4.243f)
                lineTo(12.879f, 8.743f)
                lineTo(12.021f, 9.257f)
                lineTo(9.321f, 4.757f)
                close()
                moveTo(14.549f, 14.317f)
                curveToRelative(-0.56f, -0.159f, -0.862f, -0.435f, -1.01f, -0.709f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.08f, -0.918f)
                curveToRelative(0.188f, -0.623f, 0.793f, -1.07f, 1.569f, -0.822f)
                curveToRelative(1.352f, 0.515f, 1.657f, 1.403f, 1.538f, 1.902f)
                curveToRelative(-0.06f, 0.254f, -0.234f, 0.476f, -0.538f, 0.602f)
                curveToRelative(-0.31f, 0.128f, -0.794f, 0.166f, -1.46f, -0.05f)
                lineToRelative(-0.01f, -0.003f)
                close()
                moveTo(15.349f, 10.922f)
                curveToRelative(-1.405f, -0.462f, -2.525f, 0.413f, -2.847f, 1.478f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 0.158f, 1.686f)
                curveToRelative(0.296f, 0.545f, 0.837f, 0.97f, 1.609f, 1.19f)
                curveToRelative(0.823f, 0.265f, 1.557f, 0.26f, 2.14f, 0.02f)
                curveToRelative(0.594f, -0.244f, 0.993f, -0.72f, 1.13f, -1.294f)
                curveToRelative(0.276f, -1.16f, -0.52f, -2.451f, -2.169f, -3.073f)
                lineToRelative(-0.01f, -0.004f)
                close()
            }
        }
            .build()
        return _mountainRockTransmitterSignalMedium!!
    }

private var _mountainRockTransmitterSignalMedium: ImageVector? = null
