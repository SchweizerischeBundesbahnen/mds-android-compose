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
        _faceThinkingSmall = Builder(
            name = "FaceThinkingSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.414f, 0.0f, -8.0f, 3.586f, -8.0f, 8.0f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, 4.912f, 7.389f)
                lineToRelative(-0.384f, 0.922f)
                arcTo(8.99f, 8.99f, 0.0f, false, true, 3.0f, 12.0f)
                curveToRelative(0.0f, -4.966f, 4.034f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.034f, 9.0f, 9.0f)
                curveToRelative(0.0f, 0.35f, -0.021f, 0.687f, -0.052f, 1.008f)
                lineToRelative(-0.996f, -0.096f)
                quadTo(20.0f, 12.464f, 20.0f, 12.0f)
                curveToRelative(0.0f, -4.414f, -3.586f, -8.0f, -8.0f, -8.0f)
                moveToRelative(8.532f, 11.692f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.835f, -0.303f)
                lineToRelative(-6.0f, 2.57f)
                lineToRelative(-0.213f, 0.092f)
                lineToRelative(-0.207f, -0.104f)
                lineToRelative(-3.53f, -1.76f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, -0.502f, 0.0f)
                arcToRelative(0.564f, 0.564f, 0.0f, false, false, -0.12f, 0.923f)
                curveToRelative(0.557f, 0.474f, 1.204f, 1.099f, 1.744f, 1.823f)
                curveToRelative(0.454f, 0.609f, 0.85f, 1.309f, 1.041f, 2.067f)
                horizontalLineToRelative(3.59f)
                curveToRelative(0.824f, 0.0f, 1.5f, -0.676f, 1.5f, -1.5f)
                verticalLineTo(18.19f)
                lineToRelative(0.276f, -0.138f)
                lineToRelative(2.97f, -1.49f)
                arcToRelative(0.654f, 0.654f, 0.0f, false, false, 0.286f, -0.871f)
                moveToRelative(-1.229f, -1.222f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, 2.124f, 0.776f)
                lineToRelative(0.002f, 0.003f)
                arcToRelative(1.654f, 1.654f, 0.0f, false, true, -0.735f, 2.208f)
                lineTo(18.0f, 18.808f)
                verticalLineToRelative(0.692f)
                curveToRelative(0.0f, 1.376f, -1.124f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-4.434f)
                lineToRelative(-0.061f, -0.43f)
                curveToRelative(-0.099f, -0.696f, -0.453f, -1.39f, -0.937f, -2.038f)
                curveToRelative(-0.481f, -0.645f, -1.07f, -1.216f, -1.592f, -1.661f)
                lineToRelative(-0.002f, -0.002f)
                curveToRelative(-0.846f, -0.727f, -0.66f, -2.077f, 0.32f, -2.575f)
                lineToRelative(0.002f, -0.001f)
                curveToRelative(0.441f, -0.22f, 0.957f, -0.22f, 1.397f, 0.0f)
                lineToRelative(3.323f, 1.656f)
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
