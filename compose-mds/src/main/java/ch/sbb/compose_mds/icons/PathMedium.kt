package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.PathMedium: ImageVector
    get() {
        if (_pathMedium != null) {
            return _pathMedium!!
        }
        _pathMedium = Builder(name = "PathMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 22.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 0.0f, -5.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveTo(6.75f, 19.5f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, true, 0.0f, 7.5f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 0.0f, -7.5f)
                moveToRelative(23.0f, -1.5f)
                curveToRelative(0.0f, 1.982f, -0.596f, 3.39f, -1.209f, 4.309f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.846f, 1.011f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.377f, 0.318f)
                lineToRelative(-0.027f, 0.018f)
                lineToRelative(-0.008f, 0.006f)
                lineToRelative(-0.004f, 0.002f)
                verticalLineToRelative(0.002f)
                reflectiveCurveToRelative(-0.002f, 0.0f, -0.279f, -0.416f)
                lineToRelative(-0.277f, -0.416f)
                lineToRelative(0.01f, -0.007f)
                lineToRelative(0.055f, -0.042f)
                quadToRelative(0.077f, -0.06f, 0.22f, -0.191f)
                curveToRelative(0.187f, -0.177f, 0.443f, -0.454f, 0.701f, -0.84f)
                curveToRelative(0.512f, -0.769f, 1.041f, -1.986f, 1.041f, -3.754f)
                close()
                moveTo(18.313f, 12.36f)
                curveToRelative(1.986f, 1.589f, 2.965f, 3.762f, 3.45f, 5.506f)
                curveToRelative(0.243f, 0.875f, 0.365f, 1.653f, 0.425f, 2.213f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.061f, 0.85f)
                lineToRelative(0.001f, 0.05f)
                lineTo(22.25f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.01f)
                lineToRelative(-0.001f, -0.038f)
                quadToRelative(0.0f, -0.053f, -0.006f, -0.159f)
                curveToRelative(-0.007f, -0.14f, -0.02f, -0.348f, -0.049f, -0.607f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -0.394f, -2.052f)
                curveToRelative(-0.453f, -1.63f, -1.35f, -3.583f, -3.113f, -4.993f)
                close()
                moveTo(9.0f, 12.75f)
                lineToRelative(0.276f, 0.415f)
                lineToRelative(-0.008f, 0.008f)
                lineToRelative(-0.056f, 0.042f)
                quadToRelative(-0.077f, 0.06f, -0.22f, 0.191f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.701f, 0.84f)
                curveTo(7.779f, 15.015f, 7.25f, 16.232f, 7.25f, 18.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.982f, 0.596f, -3.39f, 1.209f, -4.309f)
                curveToRelative(0.305f, -0.457f, 0.611f, -0.79f, 0.846f, -1.011f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.377f, -0.318f)
                quadToRelative(0.016f, -0.012f, 0.027f, -0.018f)
                lineToRelative(0.008f, -0.006f)
                lineToRelative(0.004f, -0.002f)
                verticalLineToRelative(-0.002f)
                curveToRelative(0.002f, 0.002f, 0.02f, 0.028f, 0.279f, 0.416f)
                moveTo(29.25f, 9.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, true, 0.0f, 7.5f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 0.0f, -7.5f)
                moveTo(13.5f, 7.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 0.0f, -5.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
            }
        }
        .build()
        return _pathMedium!!
    }

private var _pathMedium: ImageVector? = null
