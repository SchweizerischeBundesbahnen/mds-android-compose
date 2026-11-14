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

public val SBBIcons.FaceThinkingSmall: ImageVector
    get() {
        if (_faceThinkingSmall != null) {
            return _faceThinkingSmall!!
        }
        _faceThinkingSmall = Builder(name = "FaceThinkingSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, -4.414f, -3.586f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveToRelative(-8.0f, 3.586f, -8.0f, 8.0f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, 4.912f, 7.389f)
                lineToRelative(-0.385f, 0.922f)
                arcTo(8.99f, 8.99f, 0.0f, false, true, 3.0f, 12.0f)
                curveToRelative(0.0f, -4.966f, 4.034f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.034f, 9.0f, 9.0f)
                curveToRelative(0.0f, 0.35f, -0.022f, 0.686f, -0.053f, 1.008f)
                lineToRelative(-0.995f, -0.096f)
                curveToRelative(0.029f, -0.298f, 0.048f, -0.602f, 0.048f, -0.912f)
                moveToRelative(-3.0f, 6.191f)
                lineToRelative(0.276f, -0.138f)
                lineToRelative(2.97f, -1.49f)
                lineToRelative(0.24f, 0.477f)
                lineToRelative(-0.015f, -0.03f)
                lineToRelative(-0.225f, -0.447f)
                arcToRelative(0.655f, 0.655f, 0.0f, false, false, 0.285f, -0.873f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.834f, -0.3f)
                lineToRelative(-6.0f, 2.57f)
                lineToRelative(-0.213f, 0.09f)
                lineToRelative(-0.207f, -0.103f)
                lineToRelative(-3.53f, -1.76f)
                lineToRelative(-0.062f, -0.026f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, -0.442f, 0.025f)
                arcToRelative(0.565f, 0.565f, 0.0f, false, false, -0.117f, 0.924f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(0.557f, 0.475f, 1.204f, 1.099f, 1.745f, 1.824f)
                curveToRelative(0.454f, 0.608f, 0.847f, 1.308f, 1.038f, 2.066f)
                lineTo(15.5f, 21.0f)
                curveToRelative(0.824f, 0.0f, 1.5f, -0.676f, 1.5f, -1.5f)
                close()
                moveTo(18.0f, 19.5f)
                curveToRelative(0.0f, 1.376f, -1.124f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-4.434f)
                lineToRelative(-0.061f, -0.43f)
                curveToRelative(-0.1f, -0.696f, -0.453f, -1.39f, -0.937f, -2.039f)
                curveToRelative(-0.481f, -0.645f, -1.07f, -1.215f, -1.593f, -1.66f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-0.147f, -0.143f)
                curveToRelative(-0.673f, -0.75f, -0.454f, -1.965f, 0.466f, -2.432f)
                lineToRelative(0.003f, -0.001f)
                curveToRelative(0.44f, -0.22f, 0.955f, -0.22f, 1.395f, -0.001f)
                lineToRelative(3.323f, 1.656f)
                lineToRelative(5.788f, -2.477f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, 2.045f, 0.634f)
                lineToRelative(0.08f, 0.141f)
                verticalLineToRelative(0.003f)
                curveToRelative(0.4f, 0.812f, 0.075f, 1.802f, -0.735f, 2.207f)
                lineToRelative(0.001f, 0.001f)
                lineTo(18.0f, 18.809f)
                close()
                moveTo(9.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(5.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-6.902f, 5.49f)
                lineToRelative(10.0f, -2.0f)
                lineToRelative(-0.196f, -0.98f)
                lineToRelative(-10.0f, 2.0f)
                close()
            }
        }
        .build()
        return _faceThinkingSmall!!
    }

private var _faceThinkingSmall: ImageVector? = null
