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
                moveTo(18.0f, 4.25f)
                curveToRelative(1.684f, 0.0f, 3.297f, 0.303f, 4.788f, 0.857f)
                lineTo(18.0f, 8.393f)
                lineTo(13.21f, 5.107f)
                arcTo(13.7f, 13.7f, 0.0f, false, true, 18.0f, 4.25f)
                moveToRelative(0.5f, 5.013f)
                lineToRelative(5.383f, -3.694f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, 4.98f, 4.0f)
                lineToRelative(-1.76f, 5.957f)
                lineToRelative(-3.766f, 1.23f)
                lineToRelative(-4.837f, -3.51f)
                close()
                moveTo(17.5f, 13.245f)
                lineTo(17.5f, 9.263f)
                lineTo(12.117f, 5.57f)
                curveToRelative(-1.96f, 0.93f, -3.666f, 2.309f, -4.984f, 4.005f)
                lineToRelative(1.748f, 5.947f)
                lineToRelative(3.781f, 1.235f)
                close()
                moveTo(12.353f, 17.705f)
                lineTo(8.57f, 16.473f)
                lineToRelative(-4.215f, 3.236f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 2.841f, 6.799f)
                lineToRelative(4.663f, 0.135f)
                lineToRelative(2.347f, -3.238f)
                close()
                moveTo(15.015f, 23.99f)
                lineTo(12.675f, 27.221f)
                lineTo(14.081f, 31.183f)
                curveToRelative(1.242f, 0.37f, 2.557f, 0.567f, 3.919f, 0.567f)
                curveToRelative(1.361f, 0.0f, 2.676f, -0.198f, 3.918f, -0.566f)
                lineToRelative(1.406f, -3.964f)
                lineToRelative(-2.34f, -3.23f)
                close()
                moveTo(21.24f, 23.49f)
                horizontalLineToRelative(0.001f)
                moveToRelative(0.554f, -0.087f)
                lineToRelative(1.853f, -5.697f)
                lineToRelative(3.772f, -1.23f)
                lineToRelative(4.224f, 3.246f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -2.84f, 6.784f)
                lineToRelative(-4.663f, 0.136f)
                close()
                moveTo(7.898f, 15.727f)
                lineTo(4.26f, 18.52f)
                quadToRelative(-0.01f, -0.259f, -0.01f, -0.52f)
                curveToRelative(0.0f, -2.717f, 0.788f, -5.25f, 2.148f, -7.383f)
                close()
                moveTo(8.474f, 15.914f)
                close()
                moveTo(8.091f, 27.533f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 4.78f, 3.228f)
                lineToRelative(-1.108f, -3.122f)
                close()
                moveTo(24.237f, 27.639f)
                lineTo(27.909f, 27.533f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, -4.78f, 3.228f)
                close()
                moveTo(23.88f, 27.149f)
                verticalLineToRelative(-0.014f)
                lineToRelative(-0.001f, 0.001f)
                close()
                moveTo(31.74f, 18.535f)
                quadToRelative(0.01f, -0.266f, 0.01f, -0.535f)
                curveToRelative(0.0f, -2.72f, -0.79f, -5.255f, -2.152f, -7.389f)
                lineToRelative(-1.512f, 5.117f)
                close()
                moveTo(18.0f, 32.75f)
                curveToRelative(8.146f, 0.0f, 14.75f, -6.604f, 14.75f, -14.75f)
                reflectiveCurveTo(26.146f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(3.25f, 9.854f, 3.25f, 18.0f)
                reflectiveCurveTo(9.854f, 32.75f, 18.0f, 32.75f)
                moveToRelative(-2.877f, -9.76f)
                lineToRelative(-1.785f, -5.489f)
                lineTo(18.0f, 14.117f)
                lineToRelative(4.661f, 3.384f)
                lineToRelative(-1.784f, 5.49f)
                close()
            }
        }
        .build()
        return _soccerBallMedium!!
    }

private var _soccerBallMedium: ImageVector? = null
