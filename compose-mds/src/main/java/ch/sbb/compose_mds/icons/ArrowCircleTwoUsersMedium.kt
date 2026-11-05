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

public val SBBIcons.ArrowCircleTwoUsersMedium: ImageVector
    get() {
        if (_arrowCircleTwoUsersMedium != null) {
            return _arrowCircleTwoUsersMedium!!
        }
        _arrowCircleTwoUsersMedium = Builder(name = "ArrowCircleTwoUsersMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.25f, 18.0f)
                curveTo(3.25f, 9.854f, 9.854f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(32.75f, 9.854f, 32.75f, 18.0f)
                reflectiveCurveTo(26.146f, 32.75f, 18.0f, 32.75f)
                curveToRelative(-6.02f, 0.0f, -11.445f, -3.615f, -13.75f, -8.805f)
                lineTo(4.25f, 28.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.75f)
                lineTo(9.0f, 22.75f)
                verticalLineToRelative(1.0f)
                lineTo(5.26f, 23.75f)
                curveToRelative(2.196f, 4.713f, 7.193f, 8.0f, 12.74f, 8.0f)
                curveToRelative(7.594f, 0.0f, 13.75f, -6.156f, 13.75f, -13.75f)
                reflectiveCurveTo(25.594f, 4.25f, 18.0f, 4.25f)
                reflectiveCurveTo(4.25f, 10.406f, 4.25f, 18.0f)
                close()
                moveTo(20.25f, 7.75f)
                curveToRelative(-1.648f, 0.0f, -2.931f, 1.338f, -3.35f, 3.02f)
                curveToRelative(-1.848f, 0.216f, -3.15f, 2.123f, -3.15f, 4.23f)
                curveToRelative(0.0f, 1.192f, 0.417f, 2.32f, 1.114f, 3.115f)
                curveToRelative(-2.462f, 1.298f, -4.114f, 4.506f, -4.114f, 8.135f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.864f, -0.094f, -1.704f, -0.27f, -2.5f)
                horizontalLineToRelative(3.27f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.628f, -1.652f, -6.837f, -4.114f, -8.135f)
                curveToRelative(0.697f, -0.795f, 1.114f, -1.923f, 1.114f, -3.115f)
                curveToRelative(0.0f, -2.237f, -1.468f, -4.25f, -3.5f, -4.25f)
                moveToRelative(2.96f, 15.0f)
                horizontalLineToRelative(2.529f)
                curveToRelative(-0.152f, -3.368f, -1.83f, -6.048f, -3.946f, -6.928f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.194f, 0.408f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.963f, 1.885f)
                curveToRelative(1.624f, 0.856f, 2.896f, 2.544f, 3.573f, 4.635f)
                moveToRelative(-4.417f, -3.928f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, true, -3.086f, 0.0f)
                curveToRelative(-2.116f, 0.88f, -3.794f, 3.56f, -3.946f, 6.928f)
                lineTo(22.74f, 25.75f)
                curveToRelative(-0.152f, -3.368f, -1.83f, -6.048f, -3.946f, -6.928f)
                moveTo(20.75f, 15.0f)
                curveToRelative(0.0f, -1.983f, -1.154f, -3.79f, -2.83f, -4.174f)
                curveToRelative(0.378f, -1.27f, 1.33f, -2.076f, 2.33f, -2.076f)
                curveToRelative(1.282f, 0.0f, 2.5f, 1.345f, 2.5f, 3.25f)
                curveToRelative(0.0f, 1.656f, -0.92f, 2.89f, -2.003f, 3.183f)
                quadToRelative(0.003f, -0.09f, 0.003f, -0.183f)
                moveToRelative(-3.5f, -3.25f)
                curveToRelative(-1.282f, 0.0f, -2.5f, 1.345f, -2.5f, 3.25f)
                reflectiveCurveToRelative(1.218f, 3.25f, 2.5f, 3.25f)
                reflectiveCurveToRelative(2.5f, -1.345f, 2.5f, -3.25f)
                reflectiveCurveToRelative(-1.218f, -3.25f, -2.5f, -3.25f)
            }
        }
        .build()
        return _arrowCircleTwoUsersMedium!!
    }

private var _arrowCircleTwoUsersMedium: ImageVector? = null
