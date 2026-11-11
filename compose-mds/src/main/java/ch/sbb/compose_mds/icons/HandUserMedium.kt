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

public val SBBIcons.HandUserMedium: ImageVector
    get() {
        if (_handUserMedium != null) {
            return _handUserMedium!!
        }
        _handUserMedium = Builder(name = "HandUserMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.69f, 20.498f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.785f, -0.328f)
                lineToRelative(5.773f, 4.033f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, true, 0.695f, -2.083f)
                curveToRelative(0.476f, -0.532f, 1.176f, -0.87f, 2.057f, -0.87f)
                horizontalLineToRelative(3.355f)
                verticalLineToRelative(0.009f)
                curveToRelative(2.323f, 0.107f, 4.536f, 1.387f, 6.248f, 3.033f)
                lineToRelative(7.992f, 7.596f)
                lineToRelative(0.907f, 0.862f)
                horizontalLineTo(20.419f)
                lineToRelative(-0.146f, -0.145f)
                lineToRelative(-1.366f, -1.355f)
                horizontalLineToRelative(-5.895f)
                lineToRelative(-0.143f, -0.125f)
                lineToRelative(0.331f, -0.375f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.33f, 0.376f)
                lineToRelative(-8.89f, -7.83f)
                verticalLineToRelative(-0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.29f, -2.796f)
                moveToRelative(2.199f, 0.482f)
                lineToRelative(-0.013f, -0.01f)
                lineToRelative(-0.083f, -0.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.169f, 1.62f)
                lineToRelative(0.009f, 0.007f)
                lineToRelative(0.009f, 0.008f)
                lineToRelative(8.747f, 7.705f)
                horizontalLineToRelative(5.93f)
                lineToRelative(0.147f, 0.145f)
                lineToRelative(1.365f, 1.355f)
                horizontalLineToRelative(10.167f)
                lineToRelative(-7.085f, -6.733f)
                lineToRelative(-0.002f, -0.002f)
                curveToRelative(-1.55f, -1.492f, -3.455f, -2.583f, -5.373f, -2.745f)
                lineToRelative(-0.384f, -0.02f)
                horizontalLineTo(15.0f)
                curveToRelative(-0.607f, 0.0f, -1.032f, 0.224f, -1.312f, 0.536f)
                curveToRelative(-0.287f, 0.32f, -0.443f, 0.762f, -0.447f, 1.218f)
                curveToRelative(-0.003f, 0.455f, 0.146f, 0.893f, 0.429f, 1.21f)
                curveToRelative(0.274f, 0.309f, 0.702f, 0.536f, 1.33f, 0.536f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.866f, 0.0f, -1.553f, -0.317f, -2.028f, -0.822f)
                lineToRelative(-7.07f, -4.938f)
                close()
                moveTo(22.0f, 9.0f)
                curveToRelative(0.0f, -2.698f, -1.86f, -4.75f, -4.0f, -4.75f)
                reflectiveCurveTo(14.0f, 6.302f, 14.0f, 9.0f)
                reflectiveCurveToRelative(1.86f, 4.75f, 4.0f, 4.75f)
                reflectiveCurveToRelative(4.0f, -2.052f, 4.0f, -4.75f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.46f, -0.482f, 2.818f, -1.285f, 3.848f)
                curveTo(25.942f, 14.71f, 28.25f, 19.194f, 28.25f, 24.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.646f, -2.284f, -8.805f, -6.273f, -10.378f)
                curveToRelative(-0.824f, 0.704f, -1.847f, 1.128f, -2.977f, 1.128f)
                curveToRelative(-1.131f, 0.0f, -2.157f, -0.424f, -2.98f, -1.13f)
                curveToRelative(-2.68f, 1.065f, -4.582f, 3.29f, -5.548f, 6.04f)
                lineToRelative(-0.944f, -0.332f)
                curveToRelative(1.003f, -2.853f, 2.961f, -5.243f, 5.754f, -6.482f)
                curveTo(13.48f, 11.816f, 13.0f, 10.458f, 13.0f, 9.0f)
                curveToRelative(0.0f, -3.1f, 2.17f, -5.75f, 5.0f, -5.75f)
                reflectiveCurveTo(23.0f, 5.9f, 23.0f, 9.0f)
            }
        }
        .build()
        return _handUserMedium!!
    }

private var _handUserMedium: ImageVector? = null
