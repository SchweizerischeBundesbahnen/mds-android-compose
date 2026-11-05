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

public val SBBIcons.RunningShoeLarge: ImageVector
    get() {
        if (_runningShoeLarge != null) {
            return _runningShoeLarge!!
        }
        _runningShoeLarge = Builder(
            name = "RunningShoeLarge",
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
                pathFillType = EvenOdd,
            ) {
                moveToRelative(7.146f, 16.147f)
                lineToRelative(13.0f, -13.0f)
                lineToRelative(0.708f, 0.707f)
                curveToRelative(-1.7f, 1.7f, -1.504f, 4.86f, 0.707f, 7.07f)
                curveToRelative(2.212f, 2.213f, 5.387f, 2.42f, 7.086f, 0.723f)
                lineToRelative(0.538f, -0.54f)
                lineToRelative(0.28f, 0.71f)
                lineToRelative(7.462f, 18.903f)
                curveTo(37.737f, 31.517f, 38.8f, 32.0f, 40.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.584f, -3.0f)
                lineTo(31.5f, 40.0f)
                curveToRelative(-1.525f, 0.0f, -2.865f, -0.635f, -3.856f, -1.648f)
                lineTo(7.114f, 17.82f)
                arcToRelative(4.41f, 4.41f, 0.0f, false, false, 0.74f, 5.325f)
                lineToRelative(18.5f, 18.5f)
                lineToRelative(0.004f, 0.005f)
                curveTo(27.177f, 42.489f, 28.265f, 43.0f, 29.5f, 43.0f)
                lineTo(40.0f, 43.0f)
                verticalLineToRelative(1.0f)
                lineTo(29.5f, 44.0f)
                curveToRelative(-1.525f, 0.0f, -2.865f, -0.635f, -3.856f, -1.648f)
                lineTo(7.146f, 23.854f)
                arcToRelative(5.415f, 5.415f, 0.0f, false, true, 0.0f, -7.707f)
                moveToRelative(28.996f, 15.202f)
                curveTo(37.133f, 32.364f, 38.474f, 33.0f, 40.0f, 33.0f)
                lineTo(40.0f, 33.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.9f, 6.0f)
                lineTo(31.5f, 39.0f)
                curveToRelative(-1.235f, 0.0f, -2.323f, -0.51f, -3.142f, -1.35f)
                lineToRelative(-0.004f, -0.003f)
                lineTo(7.71f, 17.003f)
                quadToRelative(0.07f, -0.075f, 0.144f, -0.15f)
                lineToRelative(10.92f, -10.92f)
                curveToRelative(-0.275f, 1.925f, 0.473f, 4.092f, 2.08f, 5.699f)
                curveToRelative(2.274f, 2.275f, 5.688f, 2.842f, 7.938f, 1.202f)
                lineToRelative(1.205f, 3.054f)
                lineToRelative(-4.18f, 1.647f)
                lineToRelative(-0.465f, 0.183f)
                lineToRelative(0.183f, 0.465f)
                lineToRelative(0.733f, 1.861f)
                lineToRelative(0.183f, 0.465f)
                lineToRelative(0.465f, -0.183f)
                lineTo(31.1f, 18.68f)
                lineToRelative(0.734f, 1.86f)
                lineToRelative(-4.184f, 1.648f)
                lineToRelative(-0.465f, 0.183f)
                lineToRelative(0.183f, 0.465f)
                lineToRelative(0.733f, 1.861f)
                lineToRelative(0.184f, 0.465f)
                lineToRelative(0.465f, -0.183f)
                lineToRelative(4.186f, -1.649f)
                lineToRelative(0.734f, 1.86f)
                lineToRelative(-4.187f, 1.65f)
                lineToRelative(-0.465f, 0.183f)
                lineToRelative(0.183f, 0.466f)
                lineToRelative(0.733f, 1.86f)
                lineToRelative(0.183f, 0.466f)
                lineToRelative(0.465f, -0.184f)
                lineToRelative(4.19f, -1.65f)
                lineToRelative(1.264f, 3.204f)
                lineToRelative(0.037f, 0.093f)
                close()
                moveTo(26.648f, 18.282f)
                lineTo(30.364f, 16.818f)
                lineTo(30.731f, 17.748f)
                lineTo(27.015f, 19.212f)
                close()
                moveTo(28.481f, 22.934f)
                lineTo(32.201f, 21.469f)
                lineTo(32.567f, 22.399f)
                lineTo(28.847f, 23.864f)
                close()
                moveTo(30.313f, 27.586f)
                lineTo(34.036f, 26.12f)
                lineTo(34.403f, 27.05f)
                lineTo(30.68f, 28.517f)
                close()
                moveTo(9.0f, 29.0f)
                lineTo(2.0f, 29.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(6.0f, 34.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 35.0f)
                close()
                moveTo(19.0f, 39.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
            .build()
        return _runningShoeLarge!!
    }

private var _runningShoeLarge: ImageVector? = null
