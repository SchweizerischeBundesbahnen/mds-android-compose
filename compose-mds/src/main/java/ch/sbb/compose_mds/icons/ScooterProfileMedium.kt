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

public val SBBIcons.ScooterProfileMedium: ImageVector
    get() {
        if (_scooterProfileMedium != null) {
            return _scooterProfileMedium!!
        }
        _scooterProfileMedium = Builder(name = "ScooterProfileMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(24.47f, 8.082f)
                lineToRelative(-0.117f, -0.332f)
                lineTo(21.0f, 7.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.648f)
                lineToRelative(1.222f, 3.423f)
                lineToRelative(-7.113f, 9.076f)
                horizontalLineToRelative(-4.494f)
                curveToRelative(0.065f, -1.377f, 0.386f, -2.628f, 0.71f, -3.57f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.659f, -1.579f)
                lineToRelative(0.015f, -0.03f)
                lineToRelative(0.027f, -0.054f)
                lineToRelative(0.011f, -0.02f)
                lineToRelative(0.002f, -0.003f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.412f, -0.741f)
                horizontalLineToRelative(-4.622f)
                curveToRelative(-0.644f, 0.03f, -1.422f, 0.317f, -2.201f, 0.772f)
                curveToRelative(-0.789f, 0.462f, -1.62f, 1.12f, -2.373f, 1.945f)
                curveToRelative(-1.505f, 1.647f, -2.733f, 3.993f, -2.652f, 6.795f)
                lineToRelative(0.013f, 0.486f)
                horizontalLineToRelative(3.021f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.465f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.465f, -3.0f)
                horizontalLineToRelative(9.036f)
                verticalLineToRelative(-0.5f)
                arcToRelative(5.499f, 5.499f, 0.0f, false, true, 8.926f, -4.301f)
                lineToRelative(0.624f, -0.782f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, -3.695f, -1.406f)
                close()
                moveTo(27.054f, 18.288f)
                lineTo(25.268f, 13.288f)
                lineTo(18.394f, 22.058f)
                lineTo(18.244f, 22.248f)
                lineTo(12.25f, 22.248f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.717f, 0.39f, -3.274f, 0.777f, -4.396f)
                curveToRelative(0.15f, -0.436f, 0.304f, -0.808f, 0.433f, -1.101f)
                horizontalLineToRelative(-2.949f)
                curveToRelative(-0.416f, 0.022f, -1.028f, 0.224f, -1.731f, 0.636f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, false, -2.14f, 1.755f)
                curveToRelative(-1.286f, 1.408f, -2.317f, 3.337f, -2.39f, 5.607f)
                horizontalLineToRelative(17.02f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 5.783f, -5.961f)
                moveTo(12.2f, 25.248f)
                lineTo(7.3f, 25.248f)
                curveToRelative(0.232f, 1.142f, 1.241f, 2.001f, 2.45f, 2.001f)
                reflectiveCurveToRelative(2.218f, -0.86f, 2.45f, -2.0f)
                moveToRelative(-8.95f, -0.485f)
                lineToRelative(0.5f, -0.015f)
                close()
                moveTo(30.25f, 24.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, -5.0f, 0.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 5.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, -7.0f, 0.0f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, 7.0f, 0.0f)
            }
        }
        .build()
        return _scooterProfileMedium!!
    }

private var _scooterProfileMedium: ImageVector? = null
