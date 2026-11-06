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

public val SBBIcons.HandUserMedium: ImageVector
    get() {
        if (_handUserMedium != null) {
            return _handUserMedium!!
        }
        _handUserMedium = Builder(name = "HandUserMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.25f)
                curveToRelative(-2.14f, 0.0f, -4.0f, 2.052f, -4.0f, 4.75f)
                reflectiveCurveToRelative(1.86f, 4.75f, 4.0f, 4.75f)
                reflectiveCurveToRelative(4.0f, -2.052f, 4.0f, -4.75f)
                reflectiveCurveToRelative(-1.86f, -4.75f, -4.0f, -4.75f)
                moveTo(13.0f, 9.0f)
                curveToRelative(0.0f, -3.1f, 2.17f, -5.75f, 5.0f, -5.75f)
                reflectiveCurveTo(23.0f, 5.9f, 23.0f, 9.0f)
                curveToRelative(0.0f, 1.458f, -0.48f, 2.816f, -1.282f, 3.846f)
                curveTo(25.944f, 14.71f, 28.25f, 19.195f, 28.25f, 24.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.645f, -2.282f, -8.805f, -6.27f, -10.378f)
                curveToRelative(-0.824f, 0.705f, -1.85f, 1.128f, -2.98f, 1.128f)
                curveToRelative(-1.131f, 0.0f, -2.157f, -0.423f, -2.98f, -1.13f)
                curveToRelative(-2.681f, 1.066f, -4.582f, 3.291f, -5.548f, 6.04f)
                lineToRelative(-0.944f, -0.332f)
                curveToRelative(1.003f, -2.853f, 2.961f, -5.243f, 5.754f, -6.482f)
                curveTo(13.48f, 11.816f, 13.0f, 10.458f, 13.0f, 9.0f)
                moveTo(6.488f, 20.18f)
                lineToRelative(5.759f, 4.022f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, true, 0.697f, -2.082f)
                curveToRelative(0.475f, -0.532f, 1.175f, -0.87f, 2.056f, -0.87f)
                horizontalLineToRelative(3.355f)
                verticalLineToRelative(0.006f)
                curveToRelative(2.324f, 0.107f, 4.537f, 1.39f, 6.248f, 3.037f)
                lineToRelative(0.002f, 0.001f)
                lineToRelative(7.99f, 7.594f)
                lineToRelative(0.907f, 0.862f)
                horizontalLineTo(20.419f)
                lineToRelative(-0.146f, -0.145f)
                lineToRelative(-1.366f, -1.355f)
                horizontalLineToRelative(-5.896f)
                lineToRelative(-0.141f, -0.125f)
                lineToRelative(-8.881f, -7.823f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.499f, -3.123f)
                moveToRelative(11.671f, 2.07f)
                horizontalLineTo(15.0f)
                curveToRelative(-0.607f, 0.0f, -1.032f, 0.225f, -1.312f, 0.537f)
                curveToRelative(-0.287f, 0.32f, -0.443f, 0.762f, -0.447f, 1.217f)
                curveToRelative(-0.003f, 0.455f, 0.146f, 0.893f, 0.429f, 1.21f)
                curveToRelative(0.274f, 0.309f, 0.702f, 0.536f, 1.33f, 0.536f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.872f, 0.0f, -1.565f, -0.319f, -2.04f, -0.83f)
                lineToRelative(-7.057f, -4.93f)
                lineToRelative(-0.014f, -0.01f)
                lineToRelative(-0.013f, -0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.252f, 1.56f)
                lineToRelative(0.01f, 0.007f)
                lineToRelative(0.008f, 0.008f)
                lineToRelative(8.747f, 7.705f)
                horizontalLineToRelative(5.93f)
                lineToRelative(0.146f, 0.145f)
                lineToRelative(1.366f, 1.355f)
                horizontalLineToRelative(10.167f)
                lineToRelative(-7.085f, -6.733f)
                lineToRelative(-0.002f, -0.002f)
                curveToRelative(-1.652f, -1.59f, -3.707f, -2.724f, -5.752f, -2.765f)
            }
        }
        .build()
        return _handUserMedium!!
    }

private var _handUserMedium: ImageVector? = null
