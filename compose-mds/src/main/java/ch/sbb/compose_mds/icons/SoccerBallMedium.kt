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

public val SBBIcons.SoccerBallMedium: ImageVector
    get() {
        if (_soccerBallMedium != null) {
            return _soccerBallMedium!!
        }
        _soccerBallMedium = Builder(name = "SoccerBallMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.25f, 18.0f)
                curveToRelative(0.0f, -2.717f, 0.788f, -5.25f, 2.148f, -7.383f)
                lineToRelative(1.5f, 5.11f)
                lineTo(4.26f, 18.52f)
                quadToRelative(-0.01f, -0.26f, -0.01f, -0.521f)
                moveToRelative(4.63f, -2.479f)
                lineTo(7.135f, 9.574f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, 4.983f, -4.005f)
                lineTo(17.5f, 9.263f)
                verticalLineToRelative(3.982f)
                lineToRelative(-4.837f, 3.51f)
                close()
                moveTo(12.353f, 17.705f)
                lineTo(8.57f, 16.472f)
                lineToRelative(-4.215f, 3.236f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 2.842f, 6.799f)
                lineToRelative(4.663f, 0.135f)
                lineToRelative(2.346f, -3.24f)
                close()
                moveTo(15.015f, 23.989f)
                lineTo(12.675f, 27.219f)
                lineTo(14.081f, 31.183f)
                curveToRelative(1.242f, 0.368f, 2.558f, 0.566f, 3.919f, 0.566f)
                reflectiveCurveToRelative(2.677f, -0.198f, 3.919f, -0.567f)
                lineToRelative(1.406f, -3.962f)
                lineToRelative(-2.34f, -3.231f)
                close()
                moveTo(21.795f, 23.402f)
                lineTo(24.14f, 26.642f)
                lineTo(28.803f, 26.506f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 2.84f, -6.785f)
                lineToRelative(-4.224f, -3.247f)
                lineToRelative(-3.772f, 1.231f)
                close()
                moveTo(23.337f, 16.754f)
                lineTo(27.103f, 15.525f)
                lineTo(28.863f, 9.568f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -4.98f, -4.0f)
                lineTo(18.5f, 9.263f)
                verticalLineToRelative(3.982f)
                close()
                moveTo(8.091f, 27.533f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 4.78f, 3.228f)
                lineToRelative(-1.108f, -3.121f)
                close()
                moveTo(24.237f, 27.64f)
                lineTo(27.909f, 27.533f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, -4.78f, 3.228f)
                close()
                moveTo(31.74f, 18.535f)
                quadToRelative(0.01f, -0.266f, 0.01f, -0.535f)
                curveToRelative(0.0f, -2.72f, -0.79f, -5.255f, -2.152f, -7.39f)
                lineToRelative(-1.511f, 5.118f)
                close()
                moveTo(18.0f, 8.394f)
                lineToRelative(-4.789f, -3.287f)
                arcTo(13.7f, 13.7f, 0.0f, false, true, 18.0f, 4.25f)
                curveToRelative(1.684f, 0.0f, 3.297f, 0.303f, 4.789f, 0.857f)
                close()
                moveTo(18.0f, 3.25f)
                curveTo(9.854f, 3.25f, 3.25f, 9.854f, 3.25f, 18.0f)
                reflectiveCurveTo(9.854f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(32.75f, 26.146f, 32.75f, 18.0f)
                reflectiveCurveTo(26.146f, 3.25f, 18.0f, 3.25f)
                moveToRelative(-2.877f, 19.74f)
                lineToRelative(-1.785f, -5.489f)
                lineTo(18.0f, 14.118f)
                lineToRelative(4.662f, 3.383f)
                lineToRelative(-1.785f, 5.489f)
                close()
            }
        }
        .build()
        return _soccerBallMedium!!
    }

private var _soccerBallMedium: ImageVector? = null
