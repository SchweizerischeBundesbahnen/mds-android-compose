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

public val SBBIcons.WavesLadderMedium: ImageVector
    get() {
        if (_wavesLadderMedium != null) {
            return _wavesLadderMedium!!
        }
        _wavesLadderMedium = Builder(name = "WavesLadderMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.75f, 7.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(6.5f)
                lineTo(27.25f, 7.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                verticalLineToRelative(15.237f)
                curveToRelative(0.827f, -0.09f, 1.285f, -0.615f, 1.862f, -1.307f)
                lineToRelative(0.028f, -0.033f)
                curveToRelative(0.611f, -0.734f, 1.373f, -1.647f, 2.86f, -1.647f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.995f, 0.0f, -1.485f, 0.56f, -2.12f, 1.32f)
                lineToRelative(-0.028f, 0.034f)
                curveToRelative(-0.612f, 0.733f, -1.373f, 1.646f, -2.859f, 1.646f)
                reflectiveCurveToRelative(-2.248f, -0.913f, -2.86f, -1.647f)
                lineToRelative(-0.027f, -0.033f)
                curveToRelative(-0.636f, -0.76f, -1.126f, -1.32f, -2.12f, -1.32f)
                curveToRelative(-0.993f, 0.0f, -1.482f, 0.559f, -2.116f, 1.32f)
                lineToRelative(-0.027f, 0.033f)
                curveToRelative(-0.61f, 0.733f, -1.372f, 1.647f, -2.857f, 1.647f)
                curveToRelative(-1.484f, 0.0f, -2.245f, -0.914f, -2.855f, -1.647f)
                lineToRelative(-0.027f, -0.033f)
                curveToRelative(-0.635f, -0.761f, -1.124f, -1.32f, -2.116f, -1.32f)
                curveToRelative(-0.991f, 0.0f, -1.48f, 0.559f, -2.114f, 1.32f)
                lineToRelative(-0.027f, 0.033f)
                curveToRelative(-0.61f, 0.733f, -1.371f, 1.647f, -2.856f, 1.647f)
                curveToRelative(-1.482f, 0.0f, -2.242f, -0.914f, -2.852f, -1.647f)
                lineToRelative(-0.028f, -0.034f)
                curveTo(4.478f, 21.308f, 3.99f, 20.75f, 3.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.483f, 0.0f, 2.242f, 0.913f, 2.851f, 1.646f)
                lineToRelative(0.029f, 0.035f)
                curveTo(6.513f, 22.192f, 7.0f, 22.75f, 7.99f, 22.75f)
                curveToRelative(0.992f, 0.0f, 1.48f, -0.559f, 2.114f, -1.32f)
                lineToRelative(0.027f, -0.032f)
                curveToRelative(0.61f, -0.734f, 1.372f, -1.648f, 2.856f, -1.648f)
                curveToRelative(1.486f, 0.0f, 2.247f, 0.914f, 2.858f, 1.648f)
                lineToRelative(0.026f, 0.032f)
                curveToRelative(0.634f, 0.761f, 1.122f, 1.32f, 2.114f, 1.32f)
                curveToRelative(0.803f, 0.0f, 1.276f, -0.366f, 1.764f, -0.91f)
                close()
                moveTo(27.25f, 22.622f)
                lineTo(27.25f, 16.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(4.453f)
                curveToRelative(0.525f, -0.514f, 1.206f, -0.953f, 2.235f, -0.953f)
                curveToRelative(1.487f, 0.0f, 2.249f, 0.913f, 2.86f, 1.647f)
                lineToRelative(0.028f, 0.033f)
                curveToRelative(0.454f, 0.544f, 0.834f, 0.985f, 1.378f, 1.192f)
                moveToRelative(0.0f, -7.372f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(30.881f, 28.071f)
                curveToRelative(0.635f, -0.761f, 1.125f, -1.32f, 2.12f, -1.32f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.487f, 0.0f, -2.249f, 0.913f, -2.86f, 1.647f)
                lineToRelative(-0.028f, 0.032f)
                curveToRelative(-0.635f, 0.762f, -1.124f, 1.32f, -2.119f, 1.32f)
                curveToRelative(-0.994f, 0.0f, -1.485f, -0.558f, -2.12f, -1.32f)
                lineToRelative(-0.027f, -0.032f)
                curveToRelative(-0.612f, -0.734f, -1.374f, -1.647f, -2.86f, -1.647f)
                reflectiveCurveToRelative(-2.247f, 0.914f, -2.858f, 1.647f)
                lineToRelative(-0.026f, 0.032f)
                curveToRelative(-0.635f, 0.762f, -1.123f, 1.32f, -2.116f, 1.32f)
                curveToRelative(-0.992f, 0.0f, -1.48f, -0.558f, -2.114f, -1.32f)
                lineToRelative(-0.026f, -0.031f)
                curveToRelative(-0.611f, -0.734f, -1.372f, -1.648f, -2.858f, -1.648f)
                curveToRelative(-1.484f, 0.0f, -2.245f, 0.914f, -2.856f, 1.647f)
                lineToRelative(-0.027f, 0.032f)
                curveToRelative(-0.634f, 0.762f, -1.122f, 1.32f, -2.114f, 1.32f)
                curveToRelative(-0.99f, 0.0f, -1.478f, -0.557f, -2.111f, -1.319f)
                lineToRelative(-0.029f, -0.034f)
                curveToRelative(-0.609f, -0.733f, -1.368f, -1.646f, -2.851f, -1.646f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.99f, 0.0f, 1.478f, 0.558f, 2.111f, 1.32f)
                lineToRelative(0.028f, 0.033f)
                curveToRelative(0.61f, 0.733f, 1.37f, 1.647f, 2.852f, 1.647f)
                curveToRelative(1.485f, 0.0f, 2.246f, -0.914f, 2.856f, -1.648f)
                lineToRelative(0.027f, -0.032f)
                curveToRelative(0.634f, -0.761f, 1.123f, -1.32f, 2.114f, -1.32f)
                curveToRelative(0.992f, 0.0f, 1.481f, 0.559f, 2.116f, 1.32f)
                lineToRelative(0.027f, 0.033f)
                curveToRelative(0.61f, 0.733f, 1.37f, 1.647f, 2.855f, 1.647f)
                reflectiveCurveToRelative(2.246f, -0.914f, 2.857f, -1.647f)
                lineToRelative(0.027f, -0.033f)
                curveToRelative(0.634f, -0.761f, 1.123f, -1.32f, 2.115f, -1.32f)
                curveToRelative(0.995f, 0.0f, 1.485f, 0.559f, 2.12f, 1.32f)
                lineToRelative(0.028f, 0.033f)
                curveToRelative(0.611f, 0.733f, 1.374f, 1.647f, 2.86f, 1.647f)
                reflectiveCurveToRelative(2.247f, -0.913f, 2.859f, -1.646f)
                close()
            }
        }
        .build()
        return _wavesLadderMedium!!
    }

private var _wavesLadderMedium: ImageVector? = null
