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

public val SBBIcons.MountainLakeSunMedium: ImageVector
    get() {
        if (_mountainLakeSunMedium != null) {
            return _mountainLakeSunMedium!!
        }
        _mountainLakeSunMedium = Builder(name = "MountainLakeSunMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.75f, 8.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                moveToRelative(2.5f, -3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveToRelative(16.941f, 4.765f)
                lineToRelative(-0.317f, -0.596f)
                lineToRelative(-0.478f, 0.477f)
                lineToRelative(-8.693f, 8.694f)
                lineToRelative(-5.653f, -4.24f)
                lineToRelative(-0.423f, -0.317f)
                lineToRelative(-0.293f, 0.44f)
                lineToRelative(-4.5f, 6.75f)
                lineToRelative(0.832f, 0.554f)
                lineToRelative(4.207f, -6.31f)
                lineToRelative(5.577f, 4.183f)
                lineToRelative(0.347f, 0.26f)
                lineToRelative(0.306f, -0.306f)
                lineToRelative(8.523f, -8.523f)
                lineToRelative(5.683f, 10.654f)
                lineToRelative(0.882f, -0.47f)
                close()
                moveTo(8.061f, 29.268f)
                curveToRelative(0.655f, -0.315f, 1.433f, -0.518f, 2.443f, -0.518f)
                reflectiveCurveToRelative(1.788f, 0.203f, 2.444f, 0.518f)
                curveToRelative(0.638f, 0.306f, 1.145f, 0.711f, 1.605f, 1.079f)
                lineToRelative(0.015f, 0.012f)
                curveToRelative(0.475f, 0.38f, 0.902f, 0.718f, 1.429f, 0.971f)
                curveToRelative(0.517f, 0.248f, 1.146f, 0.42f, 2.011f, 0.42f)
                reflectiveCurveToRelative(1.494f, -0.172f, 2.01f, -0.42f)
                curveToRelative(0.527f, -0.252f, 0.954f, -0.591f, 1.428f, -0.97f)
                lineToRelative(0.015f, -0.013f)
                curveToRelative(0.46f, -0.368f, 0.966f, -0.773f, 1.604f, -1.079f)
                curveToRelative(0.655f, -0.315f, 1.432f, -0.518f, 2.442f, -0.518f)
                reflectiveCurveToRelative(1.786f, 0.203f, 2.441f, 0.518f)
                curveToRelative(0.637f, 0.306f, 1.143f, 0.711f, 1.602f, 1.079f)
                lineToRelative(0.016f, 0.013f)
                curveToRelative(0.474f, 0.379f, 0.9f, 0.718f, 1.426f, 0.97f)
                curveToRelative(0.516f, 0.248f, 1.144f, 0.42f, 2.008f, 0.42f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.01f, 0.0f, -1.786f, -0.203f, -2.44f, -0.518f)
                curveToRelative(-0.638f, -0.306f, -1.144f, -0.711f, -1.603f, -1.079f)
                lineToRelative(-0.016f, -0.013f)
                curveToRelative(-0.473f, -0.379f, -0.9f, -0.718f, -1.426f, -0.97f)
                curveToRelative(-0.515f, -0.248f, -1.144f, -0.42f, -2.008f, -0.42f)
                reflectiveCurveToRelative(-1.493f, 0.172f, -2.01f, 0.42f)
                curveToRelative(-0.526f, 0.252f, -0.953f, 0.591f, -1.427f, 0.97f)
                lineToRelative(-0.015f, 0.013f)
                curveToRelative(-0.46f, 0.368f, -0.966f, 0.773f, -1.604f, 1.079f)
                curveToRelative(-0.655f, 0.315f, -1.433f, 0.518f, -2.443f, 0.518f)
                reflectiveCurveToRelative(-1.788f, -0.203f, -2.444f, -0.518f)
                curveToRelative(-0.637f, -0.306f, -1.144f, -0.711f, -1.604f, -1.079f)
                lineToRelative(-0.016f, -0.012f)
                curveToRelative(-0.474f, -0.38f, -0.9f, -0.718f, -1.428f, -0.971f)
                curveToRelative(-0.517f, -0.248f, -1.146f, -0.42f, -2.012f, -0.42f)
                curveToRelative(-0.865f, 0.0f, -1.495f, 0.172f, -2.011f, 0.42f)
                curveToRelative(-0.528f, 0.252f, -0.955f, 0.591f, -1.429f, 0.97f)
                lineToRelative(-0.016f, 0.013f)
                curveToRelative(-0.46f, 0.368f, -0.966f, 0.773f, -1.604f, 1.08f)
                curveToRelative(-0.656f, 0.314f, -1.433f, 0.517f, -2.444f, 0.517f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.866f, 0.0f, 1.495f, -0.172f, 2.012f, -0.42f)
                curveToRelative(0.527f, -0.252f, 0.954f, -0.591f, 1.428f, -0.97f)
                lineToRelative(0.016f, -0.013f)
                curveToRelative(0.46f, -0.368f, 0.966f, -0.773f, 1.604f, -1.08f)
                moveToRelative(2.443f, -6.518f)
                curveToRelative(-1.01f, 0.0f, -1.788f, 0.203f, -2.444f, 0.518f)
                curveToRelative(-0.638f, 0.306f, -1.145f, 0.711f, -1.604f, 1.079f)
                lineToRelative(-0.016f, 0.012f)
                curveToRelative(-0.474f, 0.38f, -0.901f, 0.718f, -1.428f, 0.971f)
                curveToRelative(-0.517f, 0.248f, -1.146f, 0.42f, -2.012f, 0.42f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.01f, 0.0f, 1.788f, -0.203f, 2.444f, -0.518f)
                curveToRelative(0.638f, -0.306f, 1.145f, -0.711f, 1.604f, -1.079f)
                lineToRelative(0.016f, -0.012f)
                curveToRelative(0.474f, -0.38f, 0.901f, -0.718f, 1.429f, -0.971f)
                curveToRelative(0.516f, -0.248f, 1.146f, -0.42f, 2.011f, -0.42f)
                reflectiveCurveToRelative(1.495f, 0.172f, 2.012f, 0.42f)
                curveToRelative(0.527f, 0.252f, 0.954f, 0.591f, 1.428f, 0.97f)
                lineToRelative(0.016f, 0.013f)
                curveToRelative(0.46f, 0.368f, 0.966f, 0.773f, 1.604f, 1.08f)
                curveToRelative(0.656f, 0.314f, 1.434f, 0.517f, 2.444f, 0.517f)
                reflectiveCurveToRelative(1.788f, -0.203f, 2.443f, -0.518f)
                curveToRelative(0.637f, -0.306f, 1.144f, -0.711f, 1.604f, -1.079f)
                lineToRelative(0.015f, -0.013f)
                curveToRelative(0.474f, -0.379f, 0.9f, -0.718f, 1.428f, -0.97f)
                curveToRelative(0.516f, -0.248f, 1.145f, -0.42f, 2.01f, -0.42f)
                curveToRelative(0.863f, 0.0f, 1.492f, 0.172f, 2.007f, 0.42f)
                curveToRelative(0.527f, 0.252f, 0.953f, 0.591f, 1.426f, 0.97f)
                lineToRelative(0.016f, 0.013f)
                curveToRelative(0.46f, 0.368f, 0.965f, 0.773f, 1.602f, 1.079f)
                curveToRelative(0.655f, 0.315f, 1.432f, 0.518f, 2.441f, 0.518f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.864f, 0.0f, -1.492f, -0.172f, -2.008f, -0.42f)
                curveToRelative(-0.526f, -0.252f, -0.952f, -0.591f, -1.426f, -0.97f)
                lineToRelative(-0.016f, -0.013f)
                curveToRelative(-0.459f, -0.368f, -0.965f, -0.773f, -1.602f, -1.079f)
                curveToRelative(-0.655f, -0.315f, -1.431f, -0.518f, -2.44f, -0.518f)
                curveToRelative(-1.01f, 0.0f, -1.788f, 0.203f, -2.443f, 0.518f)
                curveToRelative(-0.638f, 0.306f, -1.144f, 0.711f, -1.604f, 1.079f)
                lineToRelative(-0.015f, 0.013f)
                curveToRelative(-0.474f, 0.379f, -0.9f, 0.718f, -1.428f, 0.97f)
                curveToRelative(-0.516f, 0.248f, -1.145f, 0.42f, -2.01f, 0.42f)
                reflectiveCurveToRelative(-1.494f, -0.172f, -2.011f, -0.42f)
                curveToRelative(-0.527f, -0.252f, -0.954f, -0.591f, -1.428f, -0.97f)
                lineToRelative(-0.016f, -0.013f)
                curveToRelative(-0.46f, -0.368f, -0.967f, -0.773f, -1.605f, -1.08f)
                curveToRelative(-0.656f, -0.314f, -1.433f, -0.517f, -2.444f, -0.517f)
            }
        }
        .build()
        return _mountainLakeSunMedium!!
    }

private var _mountainLakeSunMedium: ImageVector? = null
