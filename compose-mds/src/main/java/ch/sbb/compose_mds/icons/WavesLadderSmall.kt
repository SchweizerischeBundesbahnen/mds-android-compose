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

public val SBBIcons.WavesLadderSmall: ImageVector
    get() {
        if (_wavesLadderSmall != null) {
            return _wavesLadderSmall!!
        }
        _wavesLadderSmall = Builder(name = "WavesLadderSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(18.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(9.957f)
                curveToRelative(0.368f, -0.1f, 0.613f, -0.377f, 0.947f, -0.777f)
                lineToRelative(0.025f, -0.03f)
                curveToRelative(0.406f, -0.487f, 0.959f, -1.15f, 2.028f, -1.15f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.577f, 0.0f, -0.858f, 0.31f, -1.285f, 0.82f)
                lineToRelative(-0.025f, 0.03f)
                curveToRelative(-0.406f, 0.487f, -0.958f, 1.15f, -2.028f, 1.15f)
                reflectiveCurveToRelative(-1.622f, -0.663f, -2.028f, -1.15f)
                lineToRelative(-0.025f, -0.03f)
                curveToRelative(-0.426f, -0.51f, -0.708f, -0.82f, -1.285f, -0.82f)
                curveToRelative(-0.575f, 0.0f, -0.856f, 0.309f, -1.282f, 0.82f)
                lineToRelative(-0.024f, 0.03f)
                curveToRelative(-0.405f, 0.486f, -0.958f, 1.15f, -2.027f, 1.15f)
                reflectiveCurveToRelative(-1.622f, -0.664f, -2.027f, -1.15f)
                lineToRelative(-0.024f, -0.03f)
                curveToRelative(-0.426f, -0.511f, -0.705f, -0.82f, -1.28f, -0.82f)
                reflectiveCurveToRelative(-0.856f, 0.309f, -1.282f, 0.82f)
                lineToRelative(-0.024f, 0.03f)
                curveToRelative(-0.405f, 0.486f, -0.957f, 1.15f, -2.026f, 1.15f)
                reflectiveCurveToRelative(-1.62f, -0.665f, -2.024f, -1.15f)
                lineToRelative(-0.025f, -0.03f)
                curveTo(2.854f, 14.307f, 2.574f, 14.0f, 2.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.067f, 0.0f, 1.618f, 0.664f, 2.022f, 1.15f)
                lineToRelative(0.026f, 0.03f)
                curveToRelative(0.425f, 0.512f, 0.706f, 0.82f, 1.28f, 0.82f)
                reflectiveCurveToRelative(0.856f, -0.309f, 1.281f, -0.82f)
                lineToRelative(0.025f, -0.03f)
                curveToRelative(0.405f, -0.486f, 0.957f, -1.15f, 2.025f, -1.15f)
                reflectiveCurveToRelative(1.62f, 0.664f, 2.025f, 1.15f)
                lineToRelative(0.025f, 0.03f)
                curveToRelative(0.426f, 0.511f, 0.707f, 0.82f, 1.282f, 0.82f)
                curveToRelative(0.445f, 0.0f, 0.713f, -0.184f, 1.009f, -0.504f)
                close()
                moveTo(18.0f, 14.808f)
                lineTo(18.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.438f)
                curveToRelative(0.332f, -0.25f, 0.755f, -0.438f, 1.324f, -0.438f)
                curveToRelative(1.07f, 0.0f, 1.623f, 0.664f, 2.028f, 1.15f)
                lineToRelative(0.025f, 0.03f)
                curveToRelative(0.227f, 0.271f, 0.413f, 0.486f, 0.624f, 0.628f)
                moveTo(18.0f, 10.0f)
                lineTo(18.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.715f, 18.82f)
                curveToRelative(0.427f, -0.51f, 0.708f, -0.82f, 1.285f, -0.82f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.07f, 0.0f, -1.622f, 0.664f, -2.028f, 1.15f)
                lineToRelative(-0.025f, 0.03f)
                curveToRelative(-0.426f, 0.511f, -0.708f, 0.82f, -1.285f, 0.82f)
                reflectiveCurveToRelative(-0.858f, -0.309f, -1.285f, -0.82f)
                lineToRelative(-0.025f, -0.03f)
                curveToRelative(-0.405f, -0.486f, -0.958f, -1.15f, -2.028f, -1.15f)
                curveToRelative(-1.069f, 0.0f, -1.621f, 0.665f, -2.026f, 1.151f)
                lineToRelative(-0.025f, 0.03f)
                curveToRelative(-0.426f, 0.51f, -0.706f, 0.82f, -1.282f, 0.82f)
                curveToRelative(-0.575f, 0.0f, -0.856f, -0.31f, -1.282f, -0.82f)
                lineToRelative(-0.025f, -0.03f)
                curveTo(10.28f, 17.664f, 9.727f, 17.0f, 8.66f, 17.0f)
                reflectiveCurveToRelative(-1.62f, 0.663f, -2.025f, 1.15f)
                lineToRelative(-0.025f, 0.03f)
                curveToRelative(-0.425f, 0.51f, -0.706f, 0.82f, -1.28f, 0.82f)
                reflectiveCurveToRelative(-0.856f, -0.308f, -1.281f, -0.82f)
                lineToRelative(-0.026f, -0.03f)
                curveTo(3.618f, 17.663f, 3.067f, 17.0f, 2.0f, 17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.574f, 0.0f, 0.854f, 0.307f, 1.28f, 0.819f)
                lineToRelative(0.024f, 0.03f)
                curveToRelative(0.404f, 0.486f, 0.956f, 1.15f, 2.024f, 1.15f)
                reflectiveCurveToRelative(1.621f, -0.664f, 2.026f, -1.15f)
                lineToRelative(0.024f, -0.03f)
                curveToRelative(0.426f, -0.51f, 0.706f, -0.82f, 1.281f, -0.82f)
                curveToRelative(0.576f, 0.0f, 0.855f, 0.31f, 1.281f, 0.82f)
                lineToRelative(0.024f, 0.03f)
                curveToRelative(0.405f, 0.486f, 0.958f, 1.15f, 2.027f, 1.15f)
                reflectiveCurveToRelative(1.622f, -0.664f, 2.027f, -1.15f)
                lineToRelative(0.024f, -0.03f)
                curveToRelative(0.426f, -0.51f, 0.707f, -0.82f, 1.282f, -0.82f)
                curveToRelative(0.577f, 0.0f, 0.859f, 0.31f, 1.285f, 0.82f)
                lineToRelative(0.025f, 0.03f)
                curveToRelative(0.406f, 0.487f, 0.959f, 1.15f, 2.028f, 1.15f)
                curveToRelative(1.07f, 0.0f, 1.622f, -0.663f, 2.028f, -1.15f)
                close()
            }
        }
        .build()
        return _wavesLadderSmall!!
    }

private var _wavesLadderSmall: ImageVector? = null
