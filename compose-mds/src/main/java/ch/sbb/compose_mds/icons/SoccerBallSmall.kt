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
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -1.645f, 0.441f, -3.186f, 1.212f, -4.513f)
                lineToRelative(0.862f, 2.935f)
                lineTo(3.0f, 12.014f)
                close()
                moveTo(6.056f, 10.216f)
                lineTo(4.94f, 6.418f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 3.123f, -2.514f)
                lineToRelative(3.437f, 2.36f)
                verticalLineToRelative(2.481f)
                lineToRelative(-3.087f, 2.24f)
                close()
                moveTo(8.103f, 11.936f)
                lineTo(5.745f, 11.166f)
                lineTo(3.081f, 13.213f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, false, 1.8f, 4.294f)
                lineToRelative(2.942f, 0.085f)
                lineToRelative(1.463f, -2.02f)
                close()
                moveTo(10.095f, 16.16f)
                lineTo(8.637f, 18.174f)
                lineTo(9.517f, 20.653f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 21.0f)
                curveToRelative(0.862f, 0.0f, 1.695f, -0.121f, 2.484f, -0.347f)
                lineToRelative(0.88f, -2.48f)
                lineToRelative(-1.46f, -2.013f)
                close()
                moveTo(14.715f, 15.573f)
                lineTo(16.177f, 17.593f)
                lineTo(19.119f, 17.507f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, false, 1.799f, -4.285f)
                lineToRelative(-2.67f, -2.053f)
                lineToRelative(-2.351f, 0.767f)
                close()
                moveTo(15.587f, 10.986f)
                lineTo(17.934f, 10.22f)
                lineTo(19.058f, 6.415f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -3.121f, -2.51f)
                lineTo(12.5f, 6.262f)
                verticalLineToRelative(2.482f)
                close()
                moveTo(5.811f, 18.534f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 2.485f, 1.671f)
                lineToRelative(-0.573f, -1.615f)
                close()
                moveTo(16.277f, 18.59f)
                lineTo(18.189f, 18.534f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.485f, 1.671f)
                close()
                moveTo(21.0f, 12.024f)
                lineTo(21.0f, 12.0f)
                curveToRelative(0.0f, -1.647f, -0.442f, -3.19f, -1.215f, -4.518f)
                lineToRelative(-0.868f, 2.94f)
                close()
                moveTo(12.0f, 5.394f)
                lineTo(9.173f, 3.453f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 3.0f)
                curveToRelative(0.988f, 0.0f, 1.938f, 0.16f, 2.827f, 0.453f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
                moveToRelative(-1.797f, 13.16f)
                lineToRelative(-1.115f, -3.429f)
                lineTo(12.0f, 9.618f)
                lineToRelative(2.912f, 2.113f)
                lineToRelative(-1.115f, 3.429f)
                close()
            }
        }
        .build()
        return _soccerBallSmall!!
    }

private var _soccerBallSmall: ImageVector? = null
