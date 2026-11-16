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

public val SBBIcons.SoccerBallSmall: ImageVector
    get() {
        if (_soccerBallSmall != null) {
            return _soccerBallSmall!!
        }
        _soccerBallSmall = Builder(name = "SoccerBallSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveToRelative(0.988f, 0.0f, 1.938f, 0.16f, 2.827f, 0.453f)
                lineTo(12.0f, 5.393f)
                lineToRelative(-2.827f, -1.94f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 3.0f)
                moveToRelative(0.5f, 3.263f)
                lineToRelative(3.436f, -2.359f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 3.121f, 2.51f)
                lineToRelative(-1.123f, 3.806f)
                lineToRelative(-2.347f, 0.766f)
                lineToRelative(-3.087f, -2.24f)
                close()
                moveTo(11.5f, 8.745f)
                lineTo(11.5f, 6.263f)
                lineTo(8.063f, 3.904f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 4.94f, 6.418f)
                lineToRelative(1.116f, 3.798f)
                lineToRelative(2.357f, 0.77f)
                close()
                moveTo(8.103f, 11.936f)
                lineTo(5.745f, 11.167f)
                lineTo(3.081f, 13.213f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, false, 1.8f, 4.294f)
                lineToRelative(2.942f, 0.086f)
                lineToRelative(1.463f, -2.02f)
                close()
                moveTo(10.095f, 16.16f)
                lineTo(8.637f, 18.174f)
                lineTo(9.516f, 20.653f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 21.0f)
                curveToRelative(0.861f, 0.0f, 1.695f, -0.121f, 2.483f, -0.347f)
                lineToRelative(0.88f, -2.48f)
                lineToRelative(-1.458f, -2.013f)
                close()
                moveTo(14.16f, 15.66f)
                close()
                moveTo(14.714f, 15.573f)
                lineTo(15.897f, 11.936f)
                lineTo(18.247f, 11.169f)
                lineTo(20.917f, 13.222f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, true, -1.798f, 4.285f)
                lineToRelative(-2.942f, 0.086f)
                close()
                moveTo(5.074f, 10.421f)
                lineTo(3.0f, 12.014f)
                lineTo(3.0f, 12.0f)
                curveToRelative(0.0f, -1.645f, 0.441f, -3.187f, 1.212f, -4.513f)
                close()
                moveTo(5.811f, 18.534f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 2.485f, 1.67f)
                lineToRelative(-0.574f, -1.615f)
                close()
                moveTo(16.277f, 18.589f)
                lineTo(18.189f, 18.534f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.485f, 1.67f)
                close()
                moveTo(15.92f, 18.099f)
                lineTo(15.912f, 18.097f)
                lineTo(15.919f, 18.1f)
                moveTo(21.0f, 12.025f)
                lineTo(21.0f, 12.0f)
                curveToRelative(0.0f, -1.647f, -0.442f, -3.19f, -1.215f, -4.518f)
                lineToRelative(-0.869f, 2.94f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.477f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                moveToRelative(-1.797f, -6.84f)
                lineToRelative(-1.115f, -3.43f)
                lineTo(12.0f, 9.618f)
                lineToRelative(2.911f, 2.113f)
                lineToRelative(-1.114f, 3.43f)
                close()
            }
        }
        .build()
        return _soccerBallSmall!!
    }

private var _soccerBallSmall: ImageVector? = null
